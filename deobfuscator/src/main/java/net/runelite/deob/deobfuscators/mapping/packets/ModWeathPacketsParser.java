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
	private static final String COMPATIBLE_REVISION = "230";

	private static final Map<String, String> SERVER_PACKETS = List.of(
		"SET_NPC_UPDATE_ORIGIN,field3641,0",
		"EVENT_WORLDHOP,field3512,1",
		"MINIMAP_FLAG_SET,field3513,2",
		"VAR_CLAN_DISABLE,field3522,3",
		"UPDATE_INV_CLEAR,field3595,5",
		"IF_OPENSUB,field3541,6",
		"RESET_CLIENT_VARCACHE,field3593,7",
		"NPC_SPOTANIM,field3519,8",
		"HEAT_MAP,field3520,9",
		"UPDATE_INV_FULL,field3521,10",
		"IF_SETANIM,field3576,11",
		"NPC_INFO_SMALL_VIEWPORT,field3523,12",
		"TRIGGER_ONDIALOG_ABORT,field3547,14",
		"FRIENDS_LIST_LOADED,field3566,15",
		"SET_PRIVCHATMODE,field3527,16",
		"IF_SETNPCHEAD,field3565,17",
		"UPDATE_FRIEND_CHAT_CHANNEL_SINGLE_USER,field3529,18",
		"IF_SETCOLOUR,field3618,19",
		"LOGOUT_FULL,field3531,20",
		"UPDATE_IGNORELIST,field3586,21",
		"REFLECTION_CHECKER,field3635,22",
		"PLAYER_INFO,field3534,23",
		"CAM_MOVETO,field3535,24",
		"MIDI_SWAP,field3573,25",
		"MIDI_SONG_STOP,field3537,26",
		"CLAN_CHANNEL_DELTA,field3539,28",
		"MESSAGE_PRIVATE,field3590,29",
		"CAM_SETANGLE,field3628,30",
		"UPDATE_FRIEND_CHAT_CHANNEL_FULL_V1,field3542,31",
		"REBUILD_WORLDENTITY,field3543,32",
		"VARP_SMALL,field3552,35",
		"IF_CLOSESUB,field3574,36",
		"UPDATE_INV_PARTIAL,field3548,37",
		"UPDATE_ZONE_PARTIAL_ENCLOSED,field3549,38",
		"LOGOUT,field3550,39",
		"UPDATE_ZONE_FULL_FOLLOWS,field3524,41",
		"IF_MOVESUB,field3553,42",
		"MAP_ANIM,field3554,43",
		"CAM_MODE,field3555,44",
		"IF_SETOBJECT,field3514,45",
		"VAR_CLAN_ENABLE,field3557,46",
		"IF_SET_EVENTS,field3558,47",
		"IF_SET_PLAYERMODEL_OBJ,field3559,48",
		"IF_SETANGLE,field3560,49",
		"PLAYER_ANIM_SPECIFIC,field3561,50",
		"NPC_HEADICON_SPECIFIC,field3569,51",
		"PING_STATISTICS_REQUEST,field3563,52",
		"IF_RESYNC,field3643,53",
		"UPDATE_STOCKMARKET_SLOT,field3533,54",
		"UPDATE_FRIENDLIST,field3567,56",
		"MIDI_SONG,field3568,57",
		"CAM_LOOKAT,field3598,58",
		"REBUILD_REGION,field3577,59",
		"IF_OPENTOP,field3571,60",
		"IF_SET_ROTATE_SPEED,field3572,61",
		"IF_SET_PLAYERMODEL_SELF,field3556,62",
		"DYNAMICOBJECT_SPAWN,field3609,63",
		"IF_SETMODEL,field3528,64",
		"CAM_RESET,field3540,65",
		"URL_OPEN,field3629,66",
		"CAM_MOVE_TO,field3578,67",
		"REBUILD_NORMAL,field3579,68",
		"LOC_MERGEPLAYER,field3580,69",
		"MESSAGE_FRIEND_PRIVATE,field3581,70",
		"MESSAGE_FRIENDS_CHAT,field3582,71",
		"LOC_ANIM,field3583,72",
		"MINIMAP_TOGGLE,field3584,73",
		"OBJ_ADD,field3585,74",
		"SET_PLAYER_OP,field3530,75",
		"HINT_ARROW,field3587,76",
		"IF_SETNPCHEAD_ACTIVE,field3546,78",
		"UPDATE_INV_STOP_TRANSIT,field3638,80",
		"MIDI_JINGLE,field3592,81",
		"VARP_LARGE,field3516,82",
		"MESSAGE_CLAN_CHANNEL_SYSTEM,field3532,83",
		"RUNCLIENTSCRIPT,field3640,84",
		"IF_SETPLAYERHEAD,field3596,85",
		"IF_SETPOSITION,field3597,86",
		"CLAN_SETTINGS_FULL,field3518,87",
		"SYNC_CLIENT_VARCACHE,field3599,88",
		"GRAPHICSOBJECT_SPAWN,field3600,89",
		"MESSAGE_GAME,field3601,90",
		"CAM_MOVETO_EASED_CIRCULAR,field3602,91",
		"OCULUS_SYNC,field3645,92",
		"IF_SETSCROLLPOS,field3604,93",
		"IF_SET_TEXT,field3605,94",
		"CAM_LOOKAT_EASED_COORD,field3606,95",
		"IF_SET_PLAYERMODEL_BODYTYPE,field3607,96",
		"PROJECTILE_SPAWN,field3608,97",
		"NPC_SET_SEQUENCE,field3610,99",
		"MIDI_SONG_WITH_SECONDARY,field3611,100",
		"UPDATE_REBOOT_TIMER,field3614,103",
		"NPC_INFO_LARGE_VIEWPORT,field3615,104",
		"OBJ_DEL,field3616,105",
		"UPDATE_ZONE_PARTIAL_FOLLOWS_LEVEL,field3591,106",
		"CAM_SHAKE,field3621,107",
		"SERVER_TICK_END,field3619,108",
		"LOC_DEL,field3589,109",
		"PLAYER_SPOTANIM,field3526,110",
		"CAM_SMOOTH_RESET,field3617,111",
		"CAM_LOOKAT_EASED_ANGLE_RELATIVE,field3623,112",
		"OBJ_COUNT,field3624,113",
		"UPDATE_STAT,field3625,114",
		"UPDATE_SITE_SETTINGS,field3626,115",
		"RESET_ANIMS,field3639,117",
		"UPDATE_UID192,field3603,118",
		"CLAN_SETTINGS_DELTA,field3630,119",
		"VAR_CLAN,field3631,120",
		"CLAN_CHANNEL_FULL,field3632,121",
		"OBJ_OPFILTER,field3633,122",
		"IF_SET_PLAYERMODEL_BASECOLOUR,field3634,123",
		"UPDATE_TRADING_POST,field3636,125",
		"MAP_PROJANIM,field3570,127",
		"SET_ACTIVE_WORLD,field3622,129",
		"OBJ_RESET_CUSTOMIZATION,field3564,130",
		"RESET_INTERACTION_MODE,field3642,131",
		"OBJ_SET_CUSTOMIZATION,field3644,133"
	).stream()
		.map(s -> s.split(","))
		.filter(s -> s.length >= 2)
		.collect(Collectors.toMap(s -> s[1].trim(), s -> s[0].trim()));

	private static final Map<String, String> CLIENT_PACKETS = List.of(
		"NO_TIMEOUT,field3473,0",
		"OPOBJ5,field3382,1",
		"SET_HEADING,field3383,2",
		"EVENT_APPLET_FOCUS,field3384,3",
		"MESSAGE_PUBLIC,field3385,4",
		"TELEPORT,field3386,5",
		"IF_BUTTON7,field3387,6",
		"CLAN_CHANNEL_KICK_USER,field3388,7",
		"EVENT_CAMERA_POSITION,field3389,8",
		"RESUME_STRINGDIALOG,field3390,9",
		"EVENT_WINDOW_SETTING,field3391,10",
		"CLAN_SETTINGS_SET_MUTED_FROM_CHANNEL,field3470,11",
		"MUSIC_PLAYING,field3444,12",
		"LOGIN_TIMINGS,field3392,13",
		"OPLOC1,field3425,14",
		"FRIEND_CHAT_SETRANK,field3396,15",
		"OPPLAYER7,field3397,16",
		"PING_STATISTICS,field3398,17",
		"OPPLAYERT,field3426,18",
		"OPLOCU,field3400,19",
		"REFLECTION_CHECK_REPLY,field3401,20",
		"OPOBJ1,field3403,22",
		"BUG_REPORT,field3435,23",
		"IF_BUTTON9,field3405,24",
		"IF_BUTTON6,field3406,25",
		"IF_BUTTON10,field3407,26",
		"OPLOCE,field3480,27",
		"IF_BUTTONT,field3409,28",
		"IF_BUTTON5,field3410,29",
		"CLAN_SETTINGS_FULL_REQUEST,field3415,30",
		"OPOBJU,field3412,31",
		"OPOBJE,field3413,32",
		"OPLOC4,field3433,34",
		"WIDGET_TYPE,field3416,35",
		"EVENT_MOUSE_CLICK,field3417,36",
		"OPOBJ4,field3418,37",
		"OPOBJT,field3420,39",
		"FRIEND_CHAT_JOIN_LEAVE,field3421,40",
		"OPNPCU,field3422,41",
		"OPLOC5,field3423,42",
		"OPOBJ3,field3424,43",
		"OPNPC3,field3432,44",
		"EVENT_MOUSE_IDLE,field3427,46",
		"OPPLAYER4,field3443,47",
		"OPPLAYER5,field3393,48",
		"IGNORE_LIST_ADD,field3440,49",
		"CHAT_SENDABUSEREPORT,field3431,50",
		"OPPLAYER8,field3464,51",
		"CLAN_CHANNEL_FULL_REQUEST,field3434,52",
		"OPNPC4,field3408,53",
		"MAP_BUILD_COMPLETE,field3429,54",
		"MINIMAP_CLICK,field3446,55",
		"RESUME_NAMEDIALOG,field3437,56",
		"OPNPC1,field3381,57",
		"EVENT_KEYBOARD,field3439,58",
		"FRIEND_DELUSER,field3451,59",
		"OPNPC5,field3441,60",
		"RESUME_PAUSEBUTTON,field3450,62",
		"OPOBJ2,field3482,63",
		"CLICK_WORLD_MAP,field3445,64",
		"OPPLAYER3,field3463,65",
		"CLAN_KICKUSER,field3447,66",
		"DETECT_MODIFIED_CLIENT,field3448,67",
		"IGNORE_DELUSER,field3428,69",
		"RESUME_COUNTDIALOG,field3411,70",
		"OPNPCT,field3452,71",
		"OPPLAYER2,field3453,72",
		"OPPLAYER1,field3454,73",
		"OPPLAYER6,field3475,74",
		"IF_BUTTON4,field3457,76",
		"FRIEND_ADDUSER,field3458,77",
		"IF_BUTTON2,field3459,78",
		"CLAN_SETTINGS_ADD_BANNED_FROM_CHANNEL,field3460,79",
		"IF_SUBOP,field3461,80",
		"UPDATE_PLAYER_MODEL,field3462,81",
		"MOUSE_WHEEL,field3455,82",
		"OPPLAYERU,field3430,83",
		"OPLOC3,field3465,84",
		"OPLOC2,field3466,85",
		"MOVE_GAMECLICK,field3438,86",
		"IF_BUTTON3,field3468,87",
		"OPLOCT,field3469,88",
		"IF_BUTTON8,field3436,89",
		"IF_CRMVIEW,field3471,90",
		"OPNPCE,field3472,91",
		"IF_BUTTON1,field3395,92",
		"RESUME_OBJDIALOG,field3474,93",
		"MOUSE_MOVE,field3404,94",
		"CHAT_SETFILTER,field3476,95",
		"CHAT_SENDPRIVATE,field3477,96",
		"OPNPC2,field3478,97",
		"CLOSE_MODAL,field3479,98",
		"OPHELDD,field3399,99"
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