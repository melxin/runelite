/*
 * Copyright (c) 2024, Melxin <https://github.com/melxin>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.deob.deobfuscators.mapping.packets;

import com.google.common.base.Stopwatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import net.runelite.asm.Annotation;
import net.runelite.asm.ClassFile;
import net.runelite.asm.ClassGroup;
import net.runelite.asm.Field;
import net.runelite.asm.Type;
import net.runelite.deob.DeobAnnotations;
import net.runelite.deob.DeobProperties;
import net.runelite.deob.deobfuscators.Renamer;
import net.runelite.deob.deobfuscators.mapping.ParallelExecutorMapping;
import net.runelite.deob.util.NameMappings;

/**
 * Map server & client packets
 *
 * Thanks to mod weath for providing the mapped server and client packets
 */
public class ModWeathPacketsParser implements Runnable
{
	// Update COMPATIBLE_REVISION, SERVER_PACKETS and CLIENT_PACKETS each revision
	private static final String COMPATIBLE_REVISION = "228";

	private static final Map<String, String> SERVER_PACKETS = List.of(
		"SET_PLAYER_OP,field3468,0",
		"CAM_LOOKAT,field3444,1",
		"IF_SETNPCHEAD,field3445,2",
		"IF_SET_EVENTS,field3446,3",
		"GRAPHICSOBJECT_SPAWN,field3535,4",
		"DYNAMICOBJECT_SPAWN,field3460,5",
		"MIDI_JINGLE,field3497,6",
		"LOC_ANIM,field3519,7",
		"LOC_DEL,field3451,8",
		"IF_SETANGLE,field3452,9",
		"UPDATE_RUN_ENERGY,field3516,10",
		"IF_SETPOSITION,field3474,11",
		"RUNCLIENTSCRIPT,field3472,12",
		"IF_SET_PLAYERMODEL_BASECOLOUR,field3456,13",
		"CAM_LOOKAT_EASED_ANGLE_RELATIVE,field3457,14",
		"UPDATE_FRIENDLIST,field3491,15",
		"VAR_CLAN_DISABLE,field3459,16",
		"UPDATE_ZONE_PARTIAL_ENCLOSED,field3449,17",
		"IF_OPENTOP,field3461,18",
		"OBJ_ADD,field3501,19",
		"OBJ_DEL,field3463,20",
		"REBUILD_WORLDENTITY,field3464,21",
		"LOGOUT,field3454,22",
		"OCULUS_SYNC,field3466,23",
		"IF_RESYNC,field3520,24",
		"MIDI_SWAP,field3540,25",
		"NPC_SPOTANIM,field3469,26",
		"VARP_SMALL,field3470,27",
		"MAP_PROJANIM,field3471,28",
		"CAM_LOOKAT_EASED_COORD,field3564,29",
		"CAM_SHAKE,field3473,30",
		"REBUILD_REGION,field3562,31",
		"UPDATE_INV_CLEAR,field3475,32",
		"PING_STATISTICS_REQUEST,field3476,33",
		"IF_SETMODEL,field3477,34",
		"MIDI_SONG_WITH_SECONDARY,field3478,35",
		"EVENT_WORLDHOP,field3479,36",
		"URL_OPEN,field3465,37",
		"IF_SETANIM,field3487,38",
		"CAM_TARGET,field3482,39",
		"HEAT_MAP,field3467,41",
		"VAR_CLAN,field3521,42",
		"IF_MOVESUB,field3486,43",
		"LOC_ADD_CHANGE,field3485,44",
		"CAM_RESET,field3488,45",
		"OBJ_OPFILTER,field3450,46",
		"LOGOUT_FULL,field3531,47",
		"MESSAGE_FRIENDS_CHAT,field3557,48",
		"UPDATE_RUN_WEIGHT,field3492,49",
		"CAM_MOVETO_EASED_CIRCULAR,field3493,50",
		"IF_SETSCROLLPOS,field3494,51",
		"PLAYER_SPOTANIM,field3447,52",
		"IF_SETOBJECT,field3481,54",
		"VAR_CLAN_ENABLE,field3541,55",
		"MESSAGE_GAME,field3499,56",
		"CAM_MODE,field3500,57",
		"REBUILD_NORMAL,field3498,58",
		"IF_SETPLAYERHEAD,field3502,59",
		"CLAN_CHANNEL_FULL,field3503,60",
		"IF_SETHIDE,field3504,61",
		"MINIMAP_FLAG_SET,field3455,62",
		"UPDATE_STOCKMARKET_SLOT,field3507,64",
		"VARP_LARGE,field3508,65",
		"UPDATE_UID192,field3509,66",
		"MIDI_SONG_STOP,field3510,67",
		"CLAN_SETTINGS_FULL,field3511,68",
		"IF_SETCOLOUR,field3512,69",
		"IF_SET_PLAYERMODEL_BODYTYPE,field3513,70",
		"TRIGGER_ONDIALOG_ABORT,field3514,71",
		"UPDATE_SITE_SETTINGS,field3515,72",
		"UPDATE_REBOOT_TIMER,field3490,73",
		"CAM_MOVETO,field3517,74",
		"UPDATE_TRADING_POST,field3525,75",
		"UPDATE_INV_PARTIAL,field3560,76",
		"HINT_ARROW,field3524,77",
		"PLAYER_ANIM_SPECIFIC,field3462,78",
		"IF_SET_ROTATE_SPEED,field3522,79",
		"CAM_MOVE_TO,field3443,80",
		"NPC_HEADICON_SPECIFIC,field3555,81",
		"MAP_ANIM,field3518,82",
		"CAM_SMOOTH_RESET,field3527,84",
		"CLAN_SETTINGS_DELTA,field3528,85",
		"SERVER_TICK_END,field3529,86",
		"IF_OPENSUB,field3530,87",
		"SYNC_CLIENT_VARCACHE,field3579,88",
		"SET_ACTIVE_WORLD,field3532,89",
		"RESET_ANIMS,field3534,91",
		"MESSAGE_CLAN_CHANNEL_SYSTEM,field3575,92",
		"UPDATE_INV_STOP_TRANSIT,field3536,93",
		"FRIENDS_LIST_LOADED,field3537,94",
		"IF_CLOSESUB,field3538,95",
		"PLAYER_INFO,field3539,96",
		"UPDATE_STAT,field3489,97",
		"PROJECTILE_SPAWN,field3577,98",
		"IF_SETNPCHEAD_ACTIVE,field3569,99",
		"CHAT_FILTER_SETTINGS,field3543,100",
		"UPDATE_ZONE_PARTIAL_FOLLOWS_LEVEL,field3544,101",
		"UPDATE_FRIEND_CHAT_CHANNEL_FULL_V1,field3545,102",
		"SET_PRIVCHATMODE,field3546,103",
		"RESET_CLIENT_VARCACHE,field3547,104",
		"MESSAGE_PRIVATE_ECHO,field3548,105",
		"IF_SET_PLAYERMODEL_OBJ,field3550,107",
		"CAM_SETANGLE,field3542,108",
		"MIDI_SONG,field3552,109",
		"CLAN_CHANNEL_DELTA,field3553,110",
		"UPDATE_IGNORELIST,field3554,111",
		"MESSAGE_PRIVATE,field3565,112",
		"MINIMAP_TOGGLE,field3556,113",
		"LOC_MERGEPLAYER,field3480,114",
		"MESSAGE_FRIEND_CHANNEL,field3558,115",
		"UPDATE_ZONE_FULL_FOLLOWS,field3559,116",
		"IF_SET_PLAYERMODEL_SELF,field3448,117",
		"REFLECTION_CHECKER,field3561,118",
		"SET_NPC_UPDATE_ORIGIN,field3458,119",
		"UPDATE_INV_FULL,field3563,120",
		"UPDATE_FRIEND_CHAT_CHANNEL_SINGLE_USER,field3551,121",
		"CLEAR_ENTITIES,field3570,122",
		"IF_SET_TEXT,field3566,123",
		"OBJ_COUNT,field3484,126",
		"NPC_SET_SEQUENCE,field3495,127",
		"NPC_INFO_SMALL_VIEWPORT,field3572,129",
		"OBJ_RESET_CUSTOMIZATION,field3574,131",
		"RESET_INTERACTION_MODE,field3523,132",
		"NPC_INFO_LARGE_VIEWPORT,field3576,133",
		"OBJ_SET_CUSTOMIZATION,field3578,135"
	).stream()
		.map(s -> s.split(","))
		.filter(s -> s.length >= 2)
		.collect(Collectors.toMap(s -> s[1].trim(), s -> s[0].trim()));

	private static final Map<String, String> CLIENT_PACKETS = List.of(
		"OPNPCU,field3404,0",
		"OPOBJ3,field3321,1",
		"LOGIN_TIMINGS,field3319,2",
		"MOUSE_MOVE,field3320,3",
		"OPPLAYER4,field3332,4",
		"OPNPCT,field3322,5",
		"IF_BUTTON1,field3323,6",
		"DETECT_MODIFIED_CLIENT,field3324,7",
		"OPPLAYER7,field3325,8",
		"IF_BUTTON7,field3384,9",
		"IF_BUTTON9,field3327,10",
		"REFLECTION_CHECK_REPLY,field3328,11",
		"IF_BUTTON8,field3329,12",
		"IF_BUTTON6,field3331,14",
		"CHAT_SETFILTER,field3400,15",
		"OPLOCE,field3333,16",
		"FRIEND_CHAT_JOIN_LEAVE,field3405,17",
		"RESUME_PAUSEBUTTON,field3335,18",
		"MINIMAP_CLICK,field3336,19",
		"CLAN_CHANNEL_KICK_USER,field3408,20",
		"IF_BUTTON5,field3338,21",
		"OPPLAYER3,field3339,22",
		"CLOSE_MODAL,field3340,23",
		"OPPLAYERU,field3377,24",
		"OPOBJ1,field3375,25",
		"OPOBJ2,field3343,26",
		"DOCHEAT,field3344,27",
		"OPOBJ4,field3334,28",
		"IF_BUTTON4,field3385,29",
		"OPNPC4,field3347,30",
		"IF_BUTTON2,field3349,32",
		"CLAN_KICKUSER,field3350,33",
		"CLICK_WORLD_MAP,field3352,35",
		"OPPLAYER6,field3353,36",
		"EVENT_KEYBOARD,field3354,37",
		"OPPLAYER8,field3351,38",
		"OPLOC5,field3356,39",
		"RESUME_COUNTDIALOG,field3357,40",
		"OPNPC1,field3358,41",
		"RESUME_NAMEDIALOG,field3359,42",
		"OPLOC4,field3360,43",
		"EVENT_APPLET_FOCUS,field3418,45",
		"OPLOC1,field3363,46",
		"UPDATE_PLAYER_MODEL,field3364,47",
		"OPPLAYER5,field3389,48",
		"EVENT_WINDOW_SETTING,field3337,49",
		"CHAT_SENDPRIVATE,field3366,50",
		"TELEPORT,field3368,51",
		"WIDGET_TYPE,field3369,52",
		"IF_BUTTON10,field3370,53",
		"OPLOC3,field3362,54",
		"PING_STATISTICS,field3372,55",
		"OPPLAYERT,field3318,56",
		"OPHELDD,field3317,58",
		"IF_BUTTON3,field3376,59",
		"OPOBJE,field3341,60",
		"MOVE_GAMECLICK,field3398,61",
		"FRIEND_CHAT_SETRANK,field3379,62",
		"OPPLAYER1,field3380,63",
		"OPNPC5,field3378,64",
		"OPNPC2,field3373,65",
		"OPNPCE,field3383,66",
		"BUG_REPORT,field3316,67",
		"SET_HEADING,field3355,68",
		"CHAT_SENDABUSEREPORT,field3386,69",
		"OPOBJU,field3387,70",
		"MOUSE_WHEEL,field3388,71",
		"EVENT_CAMERA_POSITION,field3367,72",
		"IF_CRMVIEW,field3390,73",
		"OPOBJ5,field3391,74",
		"OPLOCU,field3393,76",
		"OPLOC2,field3394,77",
		"MESSAGE_PUBLIC,field3396,79",
		"OPNPC3,field3397,80",
		"MAP_BUILD_COMPLETE,field3361,81",
		"IGNORE_DELUSER,field3399,82",
		"RESUME_OBJDIALOG,field3407,83",
		"OPPLAYER2,field3348,84",
		"OPOBJT,field3402,85",
		"FRIEND_DELUSER,field3403,86",
		"OPLOCT,field3326,87",
		"NO_TIMEOUT,field3382,88",
		"RESUME_STRINGDIALOG,field3406,89",
		"CLAN_SETTINGS_ADD_BANNED_FROM_CHANNEL,field3345,90",
		"EVENT_MOUSE_IDLE,field3401,91",
		"MUSIC_PLAYING,field3381,92",
		"CLAN_SETTINGS_SET_MUTED_FROM_CHANNEL,field3411,94",
		"IF_BUTTONT,field3412,95",
		"IF_SUBOP,field3413,96",
		"EVENT_MOUSE_CLICK,field3414,97"
	).stream()
		.map(s -> s.split(","))
		.filter(s -> s.length >= 2)
		.collect(Collectors.toMap(s -> s[1].trim(), s -> s[0].trim()));

	private static final Logger logger = LoggerFactory.getLogger(ModWeathPacketsParser.class);

	private final ParallelExecutorMapping mapping;
	private final ClassGroup namedGroup;
	private final ClassGroup targetGroup;

	private final ClassFile namedServerPacketCF;
	private final ClassFile targetServerPacketCF;

	private final ClassFile namedClientPacketCF;
	private final ClassFile targetClientPacketCF;

	private final Type SERVER_PACKET_TYPE;
	private final Type CLIENT_PACKET_TYPE;

	private final NameMappings newNameMappings;

	public ModWeathPacketsParser(ParallelExecutorMapping mapping, ClassGroup group1, ClassGroup group2)
	{
		this.mapping = mapping;
		this.namedGroup = group1;
		this.targetGroup = group2;

		this.namedServerPacketCF = namedGroup.findClass("ServerPacket");
		this.targetServerPacketCF = (ClassFile) mapping.getMap().get(namedServerPacketCF);

		this.namedClientPacketCF = namedGroup.findClass("ClientPacket");
		this.targetClientPacketCF = (ClassFile) mapping.getMap().get(namedClientPacketCF);

		this.SERVER_PACKET_TYPE = new Type("LServerPacket;");
		this.CLIENT_PACKET_TYPE = new Type("LClientPacket;");

		this.newNameMappings = new NameMappings();
	}

	@Override
	public void run()
	{
		if (!DeobProperties.getRevision().equals(COMPATIBLE_REVISION))
		{
			logger.warn("Invalid packet data, update required!");
			return;
		}

		Stopwatch stopwatch = Stopwatch.createStarted();

		// Server packets
		if (!SERVER_PACKETS.isEmpty())
		{
			targetServerPacketCF.getFields().stream()
				.filter(f -> f.getType().equals(SERVER_PACKET_TYPE))
				.forEach(targetServerPacketField ->
				{
					if (SERVER_PACKETS.containsKey(targetServerPacketField.getName()))
					{
						logger.info("Mapping server packet: {} -> {}", targetServerPacketField.getName(), SERVER_PACKETS.get(targetServerPacketField.getName()));
						newNameMappings.map(targetServerPacketField.getPoolField(), SERVER_PACKETS.get(targetServerPacketField.getName()));
					}
				});
		}

		// Client packets
		if (!CLIENT_PACKETS.isEmpty())
		{
			targetClientPacketCF.getFields().stream()
				.filter(f -> f.getType().equals(CLIENT_PACKET_TYPE))
				.forEach(targetClientPacketField ->
				{
					if (CLIENT_PACKETS.containsKey(targetClientPacketField.getName()))
					{
						logger.info("Mapping client packet: {} -> {}", targetClientPacketField.getName(), CLIENT_PACKETS.get(targetClientPacketField.getName()));
						newNameMappings.map(targetClientPacketField.getPoolField(), CLIENT_PACKETS.get(targetClientPacketField.getName()));
					}
				});
		}

		/**
		 * Renamer
		 */
		new Renamer(newNameMappings).run(targetGroup);

		/**
		 * Remove export annotations
		 */
		targetServerPacketCF.getFields().stream().filter(f -> f.isStatic() && f.getType().equals(new Type("L" + targetServerPacketCF.getName() + ";"))).forEach(clp ->
		{
			Map<Type, Annotation> cfAnnotations = clp.getAnnotations();
			cfAnnotations.keySet().stream().filter(k -> k.equals(DeobAnnotations.EXPORT)).collect(Collectors.toList()).forEach(cfAnnotations::remove);
		});

		targetClientPacketCF.getFields().stream().filter(f -> f.isStatic() && f.getType().equals(new Type("L" + targetClientPacketCF.getName() + ";"))).forEach(clp ->
		{
			Map<Type, Annotation> cfAnnotations = clp.getAnnotations();
			cfAnnotations.keySet().stream().filter(k -> k.equals(DeobAnnotations.EXPORT)).collect(Collectors.toList()).forEach(cfAnnotations::remove);
		});

		/**
		 * Unable to map
		 */
		for (Field f : namedServerPacketCF.getFields())
		{
			if (f.getName().startsWith("field") || !f.getType().equals(SERVER_PACKET_TYPE))
			{
				continue;
			}
			if (!newNameMappings.getMap().containsValue(f.getName()))
			{
				logger.error("Unable to map server packet: {}", f.getName());
			}
		}

		for (Field f : namedClientPacketCF.getFields())
		{
			if (f.getName().startsWith("field") || !f.getType().equals(CLIENT_PACKET_TYPE))
			{
				continue;
			}
			if (!newNameMappings.getMap().containsValue(f.getName()))
			{
				logger.error("Unable to map client packet: {}", f.getName());
			}
		}

		logger.info("Took: {}", stopwatch);
	}
}