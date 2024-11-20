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
	private static final String COMPATIBLE_REVISION = "227";

	private static final Map<String, String> SERVER_PACKETS = List.of(
		"NPC_HEADICON_SPECIFIC,field3484,0",
		"EVENT_WORLDHOP,field3443,1",
		"CLAN_SETTINGS_FULL,field3577,2",
		"MINIMAP_TOGGLE,field3552,3",
		"CAM_SHAKE,field3446,4",
		"OBJ_ADD,field3447,5",
		"SET_ACTIVE_WORLD,field3448,6",
		"IF_SETCOLOUR,field3542,7",
		"IF_SETHIDE,field3450,8",
		"CAM_RESET,field3531,9",
		"IF_RESYNC,field3570,10",
		"IF_SETMODEL,field3453,11",
		"RUNCLIENTSCRIPT,field3454,12",
		"IF_SET_TEXT,field3455,13",
		"CAM_LOOKAT_EASED_COORD,field3458,16",
		"UPDATE_SITE_SETTINGS,field3515,17",
		"CAM_TARGET,field3460,18",
		"REFLECTION_CHECKER,field3461,19",
		"UPDATE_INV_CLEAR,field3451,20",
		"IF_SETNPCHEAD_ACTIVE,field3498,21",
		"REBUILD_NORMAL,field3464,22",
		"SERVER_TICK_END,field3465,23",
		"REBUILD_WORLDENTITY,field3478,24",
		"UPDATE_RUN_ENERGY,field3467,25",
		"VAR_CLAN_ENABLE,field3468,26",
		"IF_SETNPCHEAD,field3528,27",
		"MIDI_SONG_WITH_SECONDARY,field3470,28",
		"SET_PRIVCHATMODE,field3492,29",
		"UPDATE_UID192,field3472,30",
		"FRIENDS_LIST_LOADED,field3473,31",
		"OBJ_COUNT,field3474,32",
		"PLAYER_SPOTANIM,field3475,33",
		"OBJ_DEL,field3477,35",
		"MESSAGE_PRIVATE,field3536,36",
		"HINT_ARROW,field3479,37",
		"RESET_CLIENT_VARCACHE,field3480,38",
		"UPDATE_FRIENDLIST,field3481,39",
		"CLEAR_ENTITIES,field3482,40",
		"UPDATE_TRADING_POST,field3483,41",
		"IF_MOVESUB,field3579,42",
		"UPDATE_ZONE_FULL_FOLLOWS,field3487,43",
		"CLAN_CHANNEL_FULL,field3486,44",
		"VARP_SMALL,field3562,45",
		"PLAYER_INFO,field3488,46",
		"LOC_DEL,field3489,47",
		"UPDATE_RUN_WEIGHT,field3490,48",
		"IF_SETANGLE,field3491,49",
		"UPDATE_INV_STOP_TRANSIT,field3544,50",
		"IF_SET_PLAYERMODEL_SELF,field3493,51",
		"CAM_LOOKAT,field3494,52",
		"UPDATE_STOCKMARKET_SLOT,field3575,54",
		"CAM_MOVE_TO,field3497,55",
		"MAP_PROJANIM,field3466,56",
		"SET_NPC_UPDATE_ORIGIN,field3499,57",
		"SET_PLAYER_OP,field3500,58",
		"MESSAGE_CLAN_CHANNEL_SYSTEM,field3459,59",
		"IF_SETANIM,field3502,60",
		"IF_SETPOSITION,field3516,61",
		"UPDATE_ZONE_PARTIAL_FOLLOWS_LEVEL,field3504,62",
		"CAM_MOVETO,field3505,63",
		"MIDI_SWAP,field3506,64",
		"VARP_LARGE,field3507,65",
		"NPC_SET_SEQUENCE,field3512,66",
		"IF_SET_PLAYERMODEL_BASECOLOUR,field3563,67",
		"CAM_MODE,field3510,68",
		"UPDATE_ZONE_PARTIAL_ENCLOSED,field3449,69",
		"TRIGGER_ONDIALOG_ABORT,field3571,70",
		"SYNC_CLIENT_VARCACHE,field3508,71",
		"MIDI_SONG_STOP,field3514,72",
		"REBUILD_REGION,field3517,73",
		"HEAT_MAP,field3519,74",
		"MAP_ANIM,field3565,75",
		"IF_SETOBJECT,field3518,76",
		"UPDATE_FRIEND_CHAT_CHANNEL_SINGLE_USER,field3521,77",
		"RESET_ANIMS,field3522,80",
		"MIDI_JINGLE,field3523,81",
		"UPDATE_IGNORELIST,field3524,82",
		"PLAYER_ANIM_SPECIFIC,field3525,83",
		"URL_OPEN,field3526,84",
		"CAM_MOVETO_EASED_CIRCULAR,field3556,85",
		"MESSAGE_GAME,field3496,86",
		"IF_SET_EVENTS,field3529,87",
		"CLAN_SETTINGS_DELTA,field3530,88",
		"UPDATE_STAT,field3469,89",
		"CLAN_CHANNEL_DELTA,field3537,90",
		"CAM_SMOOTH_RESET,field3533,91",
		"IF_SET_PLAYERMODEL_BODYTYPE,field3534,92",
		"DYNAMICOBJECT_SPAWN,field3535,93",
		"CAM_LOOKAT_EASED_ANGLE_RELATIVE,field3452,94",
		"MINIMAP_FLAG_SET,field3548,95",
		"CHAT_FILTER_SETTINGS,field3538,96",
		"NPC_SPOTANIM,field3539,97",
		"IF_SETPLAYERHEAD,field3540,98",
		"IF_OPENTOP,field3541,99",
		"OCULUS_SYNC,field3444,100",
		"LOC_MERGEPLAYER,field3543,101",
		"IF_CLOSESUB,field3509,102",
		"GRAPHICSOBJECT_SPAWN,field3545,103",
		"MESSAGE_FRIENDS_CHAT,field3546,104",
		"LOGOUT_FULL,field3547,105",
		"UPDATE_INV_FULL,field3554,106",
		"VAR_CLAN_DISABLE,field3549,107",
		"PROJECTILE_SPAWN,field3513,108",
		"UPDATE_REBOOT_TIMER,field3553,111",
		"IF_SET_ROTATE_SPEED,field3442,112",
		"VAR_CLAN,field3532,114",
		"PING_STATISTICS_REQUEST,field3557,115",
		"IF_OPENSUB,field3558,116",
		"CAM_SETANGLE,field3559,117",
		"MESSAGE_PRIVATE_ECHO,field3560,118",
		"LOGOUT,field3561,119",
		"LOC_ANIM,field3485,120",
		"IF_SETSCROLLPOS,field3503,121",
		"IF_SET_PLAYERMODEL_OBJ,field3501,123",
		"UPDATE_INV_PARTIAL,field3566,124",
		"LOC_ADD_CHANGE,field3567,125",
		"MIDI_SONG,field3568,126",
		"OBJ_OPFILTER,field3569,127",
		"RESET_INTERACTION_MODE,field3578,129",
		"OBJ_SET_CUSTOMIZATION,field3573,131",
		"OBJ_RESET_CUSTOMIZATION,field3574,132"
	).stream()
		.map(s -> s.split(","))
		.filter(s -> s.length >= 2)
		.collect(Collectors.toMap(s -> s[1].trim(), s -> s[0].trim()));

	private static final Map<String, String> CLIENT_PACKETS = List.of(
		"OPOBJE,field3352,0",
		"FRIEND_CHAT_SETRANK,field3395,1",
		"RESUME_COUNTDIALOG,field3318,2",
		"OPNPCE,field3380,3",
		"OPLOCE,field3381,4",
		"CLAN_CHANNEL_KICK_USER,field3320,5",
		"EVENT_APPLET_FOCUS,field3323,7",
		"FRIEND_CHAT_JOIN_LEAVE,field3324,8",
		"OPPLAYER4,field3325,9",
		"RESUME_NAMEDIALOG,field3334,10",
		"IF_BUTTONT,field3319,11",
		"OPNPC4,field3328,12",
		"CLOSE_MODAL,field3363,13",
		"OPHELDD,field3330,14",
		"CLAN_CHANNEL_FULL_REQUEST,field3331,15",
		"IGNORE_DELUSER,field3333,17",
		"BUG_REPORT,field3322,18",
		"IF_BUTTON4,field3335,19",
		"CLICK_WORLD_MAP,field3336,20",
		"IF_BUTTON6,field3316,21",
		"OPOBJ1,field3338,22",
		"IF_BUTTON8,field3339,23",
		"CLAN_SETTINGS_ADD_BANNED_FROM_CHANNEL,field3340,24",
		"OPNPCU,field3341,25",
		"OPNPCT,field3361,26",
		"OPNPC3,field3385,27",
		"MAP_BUILD_COMPLETE,field3416,28",
		"OPOBJ4,field3345,29",
		"OPOBJU,field3364,31",
		"EVENT_WINDOW_SETTING,field3417,32",
		"OPOBJ3,field3349,33",
		"RESUME_PAUSEBUTTON,field3350,34",
		"REFLECTION_CHECK_REPLY,field3391,35",
		"IF_BUTTON1,field3358,36",
		"OPPLAYER5,field3353,37",
		"OPOBJ2,field3356,38",
		"OPLOC2,field3355,39",
		"CHAT_SENDABUSEREPORT,field3362,40",
		"IF_BUTTON10,field3317,41",
		"OPLOC5,field3397,42",
		"MINIMAP_CLICK,field3359,43",
		"OPPLAYER3,field3360,44",
		"EVENT_CAMERA_POSITION,field3344,45",
		"OPPLAYERT,field3326,46",
		"RESUME_STRINGDIALOG,field3347,48",
		"OPPLAYER6,field3365,49",
		"CHAT_SETFILTER,field3367,50",
		"CLAN_SETTINGS_SET_MUTED_FROM_CHANNEL,field3405,51",
		"OPLOC3,field3368,52",
		"OPPLAYER2,field3369,53",
		"OPOBJT,field3370,54",
		"OPPLAYERU,field3400,55",
		"RESUME_OBJDIALOG,field3372,56",
		"IF_BUTTON3,field3383,57",
		"CLAN_KICKUSER,field3374,58",
		"CLAN_SETTINGS_FULL_REQUEST,field3375,59",
		"OPLOCU,field3376,60",
		"OPNPC1,field3377,61",
		"EVENT_MOUSE_IDLE,field3378,62",
		"CHAT_SENDPRIVATE,field3379,63",
		"MESSAGE_PUBLIC,field3329,64",
		"OPLOC4,field3343,65",
		"DETECT_MODIFIED_CLIENT,field3382,66",
		"UPDATE_PLAYER_MODEL,field3373,68",
		"WIDGET_TYPE,field3386,70",
		"IF_SUBOP,field3348,71",
		"MOVE_GAMECLICK,field3388,72",
		"IF_BUTTON2,field3389,73",
		"EVENT_KEYBOARD,field3354,75",
		"IF_BUTTON9,field3412,76",
		"OPPLAYER7,field3393,77",
		"NO_TIMEOUT,field3337,79",
		"OPOBJ5,field3396,80",
		"OPLOCT,field3351,81",
		"FRIEND_DELUSER,field3398,82",
		"PING_STATISTICS,field3399,83",
		"OPPLAYER8,field3327,84",
		"EVENT_MOUSE_CLICK,field3401,85",
		"OPLOC1,field3402,86",
		"IF_BUTTON7,field3403,87",
		"DOCHEAT,field3404,88",
		"OPPLAYER1,field3357,89",
		"IF_CRMVIEW,field3406,90",
		"MOUSE_MOVE,field3407,91",
		"MUSIC_PLAYING,field3408,92",
		"MOUSE_WHEEL,field3409,93",
		"OPNPC5,field3410,94",
		"OPNPC2,field3342,96",
		"IF_BUTTON5,field3413,97",
		"SET_HEADING,field3414,98",
		"LOGIN_TIMINGS,field3415,99"
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