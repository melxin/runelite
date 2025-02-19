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
	private static final String COMPATIBLE_REVISION = "229";

	private static final Map<String, String> SERVER_PACKETS = List.of(
		"CAM_RESET,field3567,0",
		"IF_OPENTOP,field3506,1",
		"LOGOUT_FULL,field3507,2",
		"IF_SET_PLAYERMODEL_SELF,field3508,3",
		"MESSAGE_PRIVATE_ECHO,field3509,4",
		"CLAN_CHANNEL_FULL,field3510,5",
		"MAP_ANIM,field3511,6",
		"LOC_ANIM,field3512,7",
		"UPDATE_STAT,field3547,8",
		"NPC_INFO_LARGE_VIEWPORT,field3515,10",
		"PROJECTILE_SPAWN,field3571,11",
		"URL_OPEN,field3575,12",
		"UPDATE_STOCKMARKET_SLOT,field3518,13",
		"SET_PRIVCHATMODE,field3545,14",
		"MESSAGE_FRIEND_PRIVATE,field3520,15",
		"CAM_LOOKAT_EASED_COORD,field3521,16",
		"UPDATE_FRIENDLIST,field3522,17",
		"CLAN_CHANNEL_DELTA,field3526,21",
		"IF_SETHIDE,field3527,22",
		"MIDI_SONG,field3528,23",
		"UPDATE_FRIEND_CHAT_CHANNEL_SINGLE_USER,field3517,24",
		"UPDATE_INV_FULL,field3530,25",
		"UPDATE_INV_PARTIAL,field3531,26",
		"RUNCLIENTSCRIPT,field3532,27",
		"VARP_LARGE,field3619,28",
		"IF_SETOBJECT,field3611,29",
		"MIDI_JINGLE,field3535,30",
		"CLAN_SETTINGS_DELTA,field3536,31",
		"MESSAGE_GAME,field3537,32",
		"MESSAGE_FRIENDS_CHAT,field3538,33",
		"CAM_SMOOTH_RESET,field3543,38",
		"UPDATE_UID192,field3552,40",
		"LOC_MERGEPLAYER,field3546,41",
		"IF_SETPLAYERHEAD,field3590,42",
		"IF_CLOSESUB,field3643,44",
		"IF_SETANIM,field3557,45",
		"CAM_MOVETO,field3551,46",
		"PING_STATISTICS_REQUEST,field3550,47",
		"OCULUS_SYNC,field3554,49",
		"CAM_MOVETO_EASED_CIRCULAR,field3603,50",
		"IF_SET_PLAYERMODEL_BASECOLOUR,field3549,51",
		"UPDATE_INV_CLEAR,field3591,52",
		"IF_SET_TEXT,field3558,53",
		"IF_SETMODEL,field3523,54",
		"LOC_ADD_CHANGE,field3560,55",
		"IF_SETPOSITION,field3561,56",
		"NPC_SET_SEQUENCE,field3562,57",
		"MIDI_SONG_STOP,field3584,58",
		"PLAYER_INFO,field3533,59",
		"UPDATE_ZONE_PARTIAL_ENCLOSED,field3565,60",
		"MIDI_SWAP,field3566,61",
		"IF_OPENSUB,field3589,62",
		"SET_PLAYER_OP,field3627,63",
		"VAR_CLAN_ENABLE,field3569,64",
		"UPDATE_REBOOT_TIMER,field3570,65",
		"UPDATE_ZONE_FULL_FOLLOWS,field3609,66",
		"UPDATE_IGNORELIST,field3572,67",
		"VAR_CLAN,field3573,68",
		"HEAT_MAP,field3555,69",
		"IF_SETNPCHEAD_ACTIVE,field3574,71",
		"MINIMAP_TOGGLE,field3578,73",
		"IF_SETSCROLLPOS,field3579,74",
		"PLAYER_SPOTANIM,field3564,75",
		"UPDATE_INV_STOP_TRANSIT,field3581,76",
		"SYNC_CLIENT_VARCACHE,field3582,77",
		"UPDATE_SITE_SETTINGS,field3583,78",
		"CAM_LOOKAT_EASED_ANGLE_RELATIVE,field3519,79",
		"MAP_PROJANIM,field3534,80",
		"NPC_SPOTANIM,field3586,81",
		"CAM_SHAKE,field3553,84",
		"MESSAGE_CLAN_CHANNEL_SYSTEM,field3605,86",
		"CLAN_SETTINGS_FULL,field3592,87",
		"UPDATE_FRIEND_CHAT_CHANNEL_FULL_V1,field3593,88",
		"CAM_LOOKAT,field3595,90",
		"UPDATE_TRADING_POST,field3529,91",
		"IF_SET_PLAYERMODEL_BODYTYPE,field3597,92",
		"UPDATE_ZONE_PARTIAL_FOLLOWS_LEVEL,field3599,94",
		"IF_SETNPCHEAD,field3600,95",
		"OBJ_OPFILTER,field3601,96",
		"VAR_CLAN_DISABLE,field3602,97",
		"CAM_MOVE_TO,field3614,98",
		"OBJ_COUNT,field3604,99",
		"GRAPHICSOBJECT_SPAWN,field3588,100",
		"OBJ_DEL,field3606,101",
		"LOGOUT,field3607,102",
		"REBUILD_NORMAL,field3608,103",
		"IF_SETCOLOUR,field3568,104",
		"REFLECTION_CHECKER,field3610,105",
		"VARP_SMALL,field3513,106",
		"CAM_MODE,field3612,107",
		"REBUILD_REGION,field3613,108",
		"NPC_HEADICON_SPECIFIC,field3637,109",
		"OBJ_ADD,field3615,110",
		"LOC_DEL,field3616,111",
		"TRIGGER_ONDIALOG_ABORT,field3617,112",
		"IF_SETANGLE,field3563,113",
		"DYNAMICOBJECT_SPAWN,field3585,114",
		"IF_MOVESUB,field3629,115",
		"IF_RESYNC,field3621,116",
		"IF_SET_PLAYERMODEL_OBJ,field3622,117",
		"HINT_ARROW,field3623,118",
		"IF_SET_ROTATE_SPEED,field3624,119",
		"IF_SET_EVENTS,field3625,120",
		"SET_NPC_UPDATE_ORIGIN,field3626,121",
		"RESET_CLIENT_VARCACHE,field3620,122",
		"MESSAGE_PRIVATE,field3628,123",
		"MIDI_SONG_WITH_SECONDARY,field3630,125",
		"EVENT_WORLDHOP,field3631,126",
		"CAM_SETANGLE,field3505,127",
		"NPC_INFO_SMALL_VIEWPORT,field3633,128",
		"REBUILD_WORLDENTITY,field3634,129",
		"SET_ACTIVE_WORLD,field3635,130",
		"RESET_INTERACTION_MODE,field3618,132",
		"OBJ_SET_CUSTOMIZATION,field3638,133",
		"OBJ_RESET_CUSTOMIZATION,field3640,135"
	).stream()
		.map(s -> s.split(","))
		.filter(s -> s.length >= 2)
		.collect(Collectors.toMap(s -> s[1].trim(), s -> s[0].trim()));

	private static final Map<String, String> CLIENT_PACKETS = List.of(
		"OPNPCU,field3470,0",
		"OPOBJU,field3381,1",
		"OPPLAYERT,field3382,2",
		"RESUME_OBJDIALOG,field3445,3",
		"OPLOC1,field3384,4",
		"IF_BUTTON1,field3385,5",
		"PING_STATISTICS,field3440,6",
		"OPOBJ1,field3391,7",
		"EVENT_CAMERA_POSITION,field3442,8",
		"CLAN_CHANNEL_KICK_USER,field3447,9",
		"OPOBJ3,field3405,10",
		"CHAT_SENDPRIVATE,field3408,11",
		"REFLECTION_CHECK_REPLY,field3380,12",
		"FRIEND_CHAT_JOIN_LEAVE,field3393,13",
		"OPLOCT,field3413,14",
		"OPNPC1,field3395,15",
		"WIDGET_TYPE,field3417,16",
		"TELEPORT,field3397,17",
		"OPPLAYER4,field3437,19",
		"CLOSE_MODAL,field3400,20",
		"FRIEND_ADDUSER,field3396,22",
		"OPPLAYER3,field3403,23",
		"OPNPC2,field3404,24",
		"IF_BUTTON5,field3468,25",
		"RESUME_STRINGDIALOG,field3406,26",
		"IF_BUTTON2,field3401,28",
		"OPOBJ4,field3409,29",
		"RESUME_COUNTDIALOG,field3410,30",
		"DETECT_MODIFIED_CLIENT,field3424,31",
		"OPLOC4,field3412,32",
		"CHAT_SENDABUSEREPORT,field3457,33",
		"CLAN_SETTINGS_FULL_REQUEST,field3414,34",
		"UPDATE_PLAYER_MODEL,field3415,35",
		"OPNPC5,field3416,36",
		"IF_BUTTON3,field3475,37",
		"OPPLAYER7,field3418,38",
		"RESUME_NAMEDIALOG,field3419,39",
		"OPLOC5,field3420,40",
		"OPHELDD,field3421,41",
		"OPLOC3,field3422,42",
		"IF_SUBOP,field3386,43",
		"IF_BUTTON9,field3474,44",
		"OPPLAYER5,field3425,45",
		"IF_CRMVIEW,field3427,47",
		"IF_BUTTON4,field3455,48",
		"DOCHEAT,field3411,49",
		"OPLOCU,field3430,50",
		"OPPLAYER8,field3431,51",
		"OPPLAYER2,field3432,52",
		"IGNORE_DELUSER,field3433,53",
		"LOGIN_TIMINGS,field3434,54",
		"EVENT_MOUSE_IDLE,field3435,55",
		"FRIEND_CHAT_SETRANK,field3436,56",
		"OPPLAYER1,field3466,57",
		"RESUME_PAUSEBUTTON,field3389,58",
		"CHAT_SETFILTER,field3439,59",
		"OPOBJ2,field3428,60",
		"IF_BUTTON10,field3441,61",
		"EVENT_KEYBOARD,field3383,62",
		"CLAN_KICKUSER,field3443,63",
		"CLICK_WORLD_MAP,field3444,64",
		"OPNPC4,field3481,65",
		"OPNPCT,field3446,66",
		"MOVE_GAMECLICK,field3423,67",
		"OPLOCE,field3448,68",
		"IF_BUTTON8,field3449,69",
		"OPOBJ5,field3450,70",
		"MINIMAP_CLICK,field3451,71",
		"OPOBJT,field3394,72",
		"OPNPCE,field3453,73",
		"OPOBJE,field3454,74",
		"OPNPC3,field3452,75",
		"EVENT_MOUSE_CLICK,field3392,77",
		"MAP_BUILD_COMPLETE,field3458,78",
		"MESSAGE_PUBLIC,field3438,79",
		"EVENT_APPLET_FOCUS,field3460,80",
		"FRIEND_DELUSER,field3461,81",
		"EVENT_WINDOW_SETTING,field3462,82",
		"CLAN_SETTINGS_ADD_BANNED_FROM_CHANNEL,field3463,83",
		"IF_BUTTONT,field3464,84",
		"CLAN_SETTINGS_SET_MUTED_FROM_CHANNEL,field3465,85",
		"OPLOC2,field3390,86",
		"IF_BUTTON7,field3467,87",
		"OPPLAYERU,field3387,88",
		"BUG_REPORT,field3469,89",
		"MOUSE_WHEEL,field3402,90",
		"MOUSE_MOVE,field3471,91",
		"SET_HEADING,field3479,92",
		"OPPLAYER6,field3473,93",
		"CLAN_CHANNEL_FULL_REQUEST,field3480,94",
		"IGNORE_LIST_ADD,field3459,95",
		"NO_TIMEOUT,field3476,96",
		"IF_BUTTON6,field3477,97",
		"MUSIC_PLAYING,field3478,98"
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