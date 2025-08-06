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
	private static final String COMPATIBLE_REVISION = "232";

	private static final Map<String, String> SERVER_PACKETS = List.of(
		"CAM_MODE,field3684,0",
		"MIDI_SONG,field3575,1",
		"VARP_SMALL,field3576,2",
		"MIDI_SONG_WITH_SECONDARY,field3577,3",
		"NPC_INFO_SMALL_VIEWPORT,field3578,4",
		"UPDATE_INV_STOP_TRANSIT,field3579,5",
		"UPDATE_INV_PARTIAL,field3581,7",
		"NPC_INFO_LARGE_VIEWPORT,field3582,8",
		"MIDI_JINGLE,field3583,9",
		"PLAYER_SPOTANIM,field3671,11",
		"CAM_SMOOTH_RESET,field3586,12",
		"EVENT_WORLDHOP,field3587,13",
		"IF_SETNPCHEAD_ACTIVE,field3588,14",
		"IF_SET_PLAYERMODEL_BASECOLOUR,field3714,15",
		"CAM_LOOKAT_EASED_COORD,field3622,17",
		"CAM_LOOKAT,field3592,18",
		"CLAN_SETTINGS_FULL,field3593,19",
		"RESET_ANIMS,field3594,20",
		"HEAT_MAP,field3595,21",
		"VAR_CLAN_ENABLE,field3633,22",
		"VARP_LARGE,field3597,23",
		"LOGOUT_FULL,field3598,24",
		"UPDATE_INV_FULL,field3666,25",
		"PLAYER_ANIM_SPECIFIC,field3590,26",
		"UPDATE_STOCKMARKET_SLOT,field3602,28",
		"UPDATE_STAT,field3603,29",
		"OBJ_COUNT,field3605,30",
		"IF_SET_ROTATE_SPEED,field3672,31",
		"CAM_MOVETO_EASED_CIRCULAR,field3693,32",
		"CAM_RESET,field3607,33",
		"PING_STATISTICS_REQUEST,field3609,35",
		"VAR_CLAN,field3611,37",
		"LOC_ANIM,field3612,38",
		"IF_SETNPCHEAD,field3615,41",
		"MINIMAP_FLAG_SET,field3670,42",
		"IF_SETOBJECT,field3621,45",
		"LOGOUT,field3620,46",
		"REFLECTION_CHECKER,field3645,47",
		"UPDATE_FRIENDLIST,field3591,48",
		"MIDI_SONG_STOP,field3623,49",
		"IF_SETANGLE,field3624,50",
		"IF_SETSCROLLPOS,field3625,51",
		"IF_SETPOSITION,field3626,52",
		"MESSAGE_CLAN_CHANNEL_SYSTEM,field3627,53",
		"IF_MOVESUB,field3661,54",
		"SYNC_CLIENT_VARCACHE,field3629,55",
		"REBUILD_WORLDENTITY,field3630,56",
		"UPDATE_INV_CLEAR,field3632,58",
		"UPDATE_ZONE_FULL_FOLLOWS,field3643,59",
		"SET_PRIVCHATMODE,field3694,60",
		"UPDATE_FRIEND_CHAT_CHANNEL_SINGLE_USER,field3644,61",
		"IF_SETPLAYERHEAD,field3636,62",
		"CAM_LOOKAT_EASED_ANGLE_RELATIVE,field3637,63",
		"MIDI_SWAP,field3638,64",
		"HINT_ARROW,field3639,65",
		"OCULUS_SYNC,field3640,66",
		"CAM_SETANGLE,field3655,67",
		"SET_NPC_UPDATE_ORIGIN,field3642,68",
		"MINIMAP_TOGGLE,field3585,69",
		"UPDATE_FRIEND_CHAT_CHANNEL_FULL_V1,field3700,70",
		"CAM_MOVE_TO,field3678,71",
		"IF_SET_PLAYERMODEL_OBJ,field3646,72",
		"IF_OPENTOP,field3647,73",
		"IF_CLOSESUB,field3574,74",
		"FRIENDS_LIST_LOADED,field3649,75",
		"NPC_SET_SEQUENCE,field3650,76",
		"UPDATE_IGNORELIST,field3651,77",
		"NPC_HEADICON_SPECIFIC,field3634,78",
		"CAM_MOVETO,field3619,79",
		"RESET_INTERACTION_MODE,field3654,80",
		"URL_OPEN,field3599,81",
		"UPDATE_ZONE_PARTIAL_FOLLOWS_LEVEL,field3656,82",
		"UPDATE_REBOOT_TIMER,field3657,83",
		"RESET_CLIENT_VARCACHE,field3641,84",
		"IF_SET_PLAYERMODEL_SELF,field3660,86",
		"VAR_CLAN_DISABLE,field3606,87",
		"MAP_ANIM,field3662,88",
		"MESSAGE_PRIVATE,field3663,89",
		"CAM_TARGET,field3617,90",
		"CLAN_CHANNEL_DELTA,field3665,91",
		"SERVER_TICK_END,field3652,92",
		"UPDATE_TRADING_POST,field3667,93",
		"DYNAMICOBJECT_SPAWN,field3685,94",
		"UPDATE_ZONE_PARTIAL_ENCLOSED,field3613,96",
		"CAM_SHAKE,field3713,97",
		"IF_SETMODEL,field3600,98",
		"IF_SETANIM,field3673,99",
		"REBUILD_REGION,field3687,100",
		"MESSAGE_PRIVATE_ECHO,field3676,102",
		"GRAPHICSOBJECT_SPAWN,field3679,105",
		"LOC_DEL,field3709,106",
		"OBJ_DEL,field3681,107",
		"MESSAGE_FRIEND_PRIVATE,field3682,108",
		"MESSAGE_GAME,field3683,109",
		"IF_SETCOLOUR,field3707,110",
		"SET_PLAYER_OP,field3601,111",
		"REBUILD_NORMAL,field3648,112",
		"IF_OPENSUB,field3699,113",
		"MESSAGE_FRIENDS_CHAT,field3688,114",
		"IF_SET_TEXT,field3689,115",
		"IF_SET_PLAYERMODEL_BODYTYPE,field3690,116",
		"UPDATE_UID192,field3691,117",
		"RUNCLIENTSCRIPT,field3596,119",
		"NPC_SPOTANIM,field3616,120",
		"OBJ_ADD,field3695,121",
		"CLAN_CHANNEL_FULL,field3697,123",
		"TRIGGER_ONDIALOG_ABORT,field3698,124",
		"UPDATE_SITE_SETTINGS,field3628,125",
		"PLAYER_INFO,field3653,126",
		"CLAN_SETTINGS_DELTA,field3701,127",
		"IF_SET_EVENTS,field3705,131",
		"SET_ACTIVE_WORLD,field3589,133",
		"OBJ_RESET_CUSTOMIZATION,field3708,134",
		"IF_RESYNC,field3604,135",
		"OBJ_SET_CUSTOMIZATION,field3710,136",
		"PROJECTILE_SPAWN,field3712,138"
	).stream()
		.map(s -> s.split(","))
		.filter(s -> s.length >= 2)
		.collect(Collectors.toMap(s -> s[1].trim(), s -> s[0].trim()));

	private static final Map<String, String> CLIENT_PACKETS = List.of(
		"IF_BUTTONX,field3504,0",
		"OPNPC5,field3455,1",
		"OPNPC1,field3456,2",
		"OPNPCE,field3457,3",
		"RESUME_COUNTDIALOG,field3491,4",
		"CHAT_SENDPRIVATE,field3459,5",
		"OPLOCT,field3516,6",
		"MUSIC_PLAYING,field3474,7",
		"OPPLAYER1,field3462,8",
		"RESUME_STRINGDIALOG,field3463,9",
		"EVENT_CAMERA_POSITION,field3464,10",
		"LOGIN_TIMINGS,field3519,11",
		"WIDGET_TYPE,field3466,12",
		"OPPLAYER6,field3467,13",
		"OPNPC4,field3494,15",
		"CLAN_SETTINGS_SET_MUTED_FROM_CHANNEL,field3471,17",
		"OPOBJ4,field3473,19",
		"MINIMAP_CLICK,field3545,20",
		"CLAN_CHANNEL_FULL_REQUEST,field3475,21",
		"DETECT_MODIFIED_CLIENT,field3458,22",
		"OPOBJE,field3477,23",
		"BUG_REPORT,field3478,24",
		"OPPLAYERU,field3505,25",
		"RESUME_PAUSEBUTTON,field3480,26",
		"OPLOC1,field3482,28",
		"OPLOC2,field3534,29",
		"CLAN_CHANNEL_KICK_USER,field3484,30",
		"OPOBJ2,field3454,31",
		"OPLOCE,field3486,32",
		"OPPLAYER4,field3483,34",
		"OPPLAYER2,field3489,35",
		"FRIEND_DELUSER,field3465,36",
		"CLICK_WORLD_MAP,field3469,37",
		"OPPLAYER5,field3492,38",
		"MOVE_GAMECLICK,field3479,39",
		"MESSAGE_PUBLIC,field3488,40",
		"OPOBJU,field3543,41",
		"DOCHEAT,field3497,43",
		"CLAN_SETTINGS_FULL_REQUEST,field3498,44",
		"MOUSE_MOVE,field3499,45",
		"EVENT_KEYBOARD,field3500,46",
		"OPPLAYER8,field3501,47",
		"EVENT_WINDOW_SETTING,field3502,48",
		"MOUSE_WHEEL,field3503,49",
		"OPLOCU,field3461,50",
		"OPLOC3,field3476,51",
		"FRIEND_CHAT_JOIN_LEAVE,field3506,52",
		"CLAN_KICKUSER,field3507,53",
		"OPPLAYER7,field3508,54",
		"RESUME_NAMEDIALOG,field3493,55",
		"FRIEND_CHAT_SETRANK,field3510,56",
		"RESUME_OBJDIALOG,field3523,57",
		"CLAN_SETTINGS_ADD_BANNED_FROM_CHANNEL,field3533,58",
		"OPOBJ3,field3512,59",
		"OPLOC5,field3514,60",
		"IGNORE_DELUSER,field3515,61",
		"IF_BUTTONT,field3513,62",
		"OPNPCU,field3518,64",
		"EVENT_MOUSE_CLICK,field3460,65",
		"OPPLAYER3,field3544,66",
		"TELEPORT,field3521,67",
		"OPNPC2,field3522,68",
		"SET_HEADING,field3535,69",
		"OPOBJ5,field3509,70",
		"OPOBJ1,field3525,71",
		"CHAT_SENDABUSEREPORT,field3526,72",
		"FRIEND_ADDUSER,field3527,73",
		"IF_RUNSCRIPT,field3528,74",
		"CLOSE_MODAL,field3529,75",
		"OPOBJT,field3530,76",
		"OPNPCT,field3531,77",
		"IF_SUBOP,field3532,78",
		"REFLECTION_CHECK_REPLY,field3481,79",
		"IF_CRMVIEW,field3524,80",
		"OPHELDD,field3495,81",
		"OPPLAYERT,field3536,82",
		"OPLOC4,field3537,83",
		"PING_STATISTICS,field3538,84",
		"EVENT_APPLET_FOCUS,field3539,85",
		"UPDATE_PLAYER_MODEL,field3540,86",
		"EVENT_MOUSE_IDLE,field3541,87",
		"CHAT_SETFILTER,field3485,89",
		"NO_TIMEOUT,field3490,90",
		"OPNPC3,field3472,91",
		"IGNORE_LIST_ADD,field3546,92"
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