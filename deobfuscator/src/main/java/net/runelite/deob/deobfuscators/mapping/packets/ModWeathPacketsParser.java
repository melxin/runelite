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
	private static final String COMPATIBLE_REVISION = "231";

	private static final Map<String, String> SERVER_PACKETS = List.of(
		"VARP_SMALL,field3581,0",
		"CLAN_CHANNEL_FULL,field3508,1",
		"VAR_CLAN_ENABLE,field3510,3",
		"REFLECTION_CHECKER,field3512,5",
		"CLAN_SETTINGS_FULL,field3513,6",
		"LOC_ANIM,field3588,7",
		"CAM_MOVETO,field3515,8",
		"TRIGGER_ONDIALOG_ABORT,field3602,9",
		"UPDATE_ZONE_FULL_FOLLOWS,field3517,10",
		"UPDATE_ZONE_PARTIAL_FOLLOWS_LEVEL,field3518,11",
		"NPC_INFO_LARGE_VIEWPORT,field3624,12",
		"VARP_LARGE,field3561,13",
		"RESET_CLIENT_VARCACHE,field3521,14",
		"MESSAGE_FRIEND_PRIVATE,field3522,15",
		"UPDATE_INV_STOP_TRANSIT,field3523,16",
		"CAM_SMOOTH_RESET,field3524,17",
		"CLAN_CHANNEL_DELTA,field3525,18",
		"LOC_ADD_CHANGE,field3527,20",
		"OBJ_COUNT,field3529,22",
		"REBUILD_NORMAL,field3530,23",
		"IF_MOVESUB,field3626,24",
		"UPDATE_REBOOT_TIMER,field3532,25",
		"LOC_MERGEPLAYER,field3565,26",
		"UPDATE_FRIENDLIST,field3534,27",
		"REBUILD_REGION,field3535,28",
		"MESSAGE_CLAN_CHANNEL_SYSTEM,field3628,29",
		"MESSAGE_FRIENDS_CHAT,field3582,30",
		"MESSAGE_PRIVATE,field3538,31",
		"OBJ_OPFILTER,field3539,32",
		"IF_SET_PLAYERMODEL_BASECOLOUR,field3541,34",
		"UPDATE_INV_PARTIAL,field3542,35",
		"RUNCLIENTSCRIPT,field3613,36",
		"UPDATE_STAT,field3545,38",
		"CAM_LOOKAT_EASED_COORD,field3546,39",
		"SERVER_TICK_END,field3547,40",
		"IF_SETNPCHEAD,field3548,41",
		"IF_SET_TEXT,field3550,43",
		"NPC_SPOTANIM,field3575,44",
		"NPC_SET_SEQUENCE,field3552,45",
		"SET_PRIVCHATMODE,field3560,46",
		"REBUILD_WORLDENTITY,field3554,47",
		"EVENT_WORLDHOP,field3555,48",
		"IF_SETANGLE,field3556,49",
		"IF_SETOBJECT,field3557,50",
		"MINIMAP_TOGGLE,field3558,51",
		"CAM_SHAKE,field3618,52",
		"IF_SETNPCHEAD_ACTIVE,field3600,53",
		"IF_SETSCROLLPOS,field3580,54",
		"UPDATE_ZONE_PARTIAL_ENCLOSED,field3562,55",
		"IF_SETPLAYERHEAD,field3587,58",
		"HINT_ARROW,field3566,59",
		"IF_SETANIM,field3567,60",
		"IF_SETCOLOUR,field3568,61",
		"URL_OPEN,field3516,62",
		"UPDATE_UID192,field3570,63",
		"CAM_RESET,field3590,64",
		"CAM_SETANGLE,field3627,66",
		"MIDI_JINGLE,field3574,67",
		"FRIENDS_LIST_LOADED,field3519,68",
		"PING_STATISTICS_REQUEST,field3576,69",
		"IF_SETMODEL,field3577,70",
		"UPDATE_SITE_SETTINGS,field3578,71",
		"HEAT_MAP,field3579,72",
		"OBJ_ADD,field3571,73",
		"MIDI_SWAP,field3612,74",
		"SET_PLAYER_OP,field3507,75",
		"SET_NPC_UPDATE_ORIGIN,field3606,76",
		"NPC_INFO_SMALL_VIEWPORT,field3584,77",
		"CAM_MOVE_TO,field3589,78",
		"IF_SET_EVENTS,field3586,79",
		"IF_OPENTOP,field3531,80",
		"UPDATE_FRIEND_CHAT_CHANNEL_FULL_V1,field3629,82",
		"IF_SET_PLAYERMODEL_BODYTYPE,field3536,83",
		"IF_SET_PLAYERMODEL_OBJ,field3591,84",
		"IF_SET_ROTATE_SPEED,field3573,85",
		"VAR_CLAN_DISABLE,field3621,86",
		"IF_OPENSUB,field3559,87",
		"CLAN_SETTINGS_DELTA,field3595,88",
		"MIDI_SONG_STOP,field3596,89",
		"IF_CLOSESUB,field3597,90",
		"CAM_TARGET,field3598,91",
		"PLAYER_ANIM_SPECIFIC,field3599,92",
		"UPDATE_INV_FULL,field3610,93",
		"MINIMAP_FLAG_SET,field3601,94",
		"MESSAGE_GAME,field3640,95",
		"LOGOUT_FULL,field3611,96",
		"OCULUS_SYNC,field3604,97",
		"CAM_LOOKAT_EASED_ANGLE_RELATIVE,field3583,99",
		"SYNC_CLIENT_VARCACHE,field3607,100",
		"UPDATE_IGNORELIST,field3608,101",
		"MAP_ANIM,field3609,102",
		"CAM_LOOKAT,field3514,103",
		"CAM_MOVETO_EASED_CIRCULAR,field3617,104",
		"IF_SET_PLAYERMODEL_SELF,field3592,105",
		"MIDI_SONG,field3636,106",
		"RESET_ANIMS,field3632,107",
		"IF_SETPOSITION,field3615,108",
		"OBJ_DEL,field3616,109",
		"PLAYER_SPOTANIM,field3520,110",
		"LOGOUT,field3593,111",
		"NPC_HEADICON_SPECIFIC,field3619,112",
		"VAR_CLAN,field3620,113",
		"PLAYER_INFO,field3614,114",
		"CAM_MODE,field3594,115",
		"MAP_PROJANIM,field3543,116",
		"UPDATE_INV_CLEAR,field3585,117",
		"GRAPHICSOBJECT_SPAWN,field3625,118",
		"UPDATE_STOCKMARKET_SLOT,field3537,119",
		"DYNAMICOBJECT_SPAWN,field3533,120",
		"UPDATE_FRIEND_CHAT_CHANNEL_FULL_V1,field3569,121",
		"MIDI_SONG_WITH_SECONDARY,field3551,122",
		"PROJECTILE_SPAWN,field3631,124",
		"UPDATE_TRADING_POST,field3623,125",
		"LOC_DEL,field3633,126",
		"RESET_INTERACTION_MODE,field3635,128",
		"OBJ_RESET_CUSTOMIZATION,field3603,129",
		"OBJ_SET_CUSTOMIZATION,field3622,133",
		"SET_ACTIVE_WORLD,field3642,135"
	).stream()
		.map(s -> s.split(","))
		.filter(s -> s.length >= 2)
		.collect(Collectors.toMap(s -> s[1].trim(), s -> s[0].trim()));

	private static final Map<String, String> CLIENT_PACKETS = List.of(
		"OPLOCT,field3399,0",
		"OPPLAYER6,field3432,1",
		"PING_STATISTICS,field3377,2",
		"FRIEND_DELUSER,field3438,3",
		"CLAN_SETTINGS_SET_MUTED_FROM_CHANNEL,field3385,4",
		"OPNPC5,field3389,5",
		"OPOBJ3,field3381,6",
		"OPHELDD,field3382,7",
		"FRIEND_CHAT_SETRANK,field3383,8",
		"IF_RUNSCRIPT,field3471,9",
		"OPPLAYER1,field3380,10",
		"OPNPCU,field3386,11",
		"OPPLAYER7,field3387,12",
		"EVENT_MOUSE_CLICK,field3409,13",
		"OPNPC3,field3467,14",
		"MESSAGE_PUBLIC,field3390,15",
		"UPDATE_PLAYER_MODEL,field3452,16",
		"IF_BUTTON2,field3392,17",
		"IF_BUTTON3,field3393,18",
		"OPOBJ5,field3394,19",
		"IF_CRMVIEW,field3447,21",
		"CLAN_CHANNEL_KICK_USER,field3397,22",
		"IF_BUTTON8,field3398,23",
		"IF_BUTTON10,field3414,24",
		"CLAN_CHANNEL_FULL_REQUEST,field3445,25",
		"IF_SUBOP,field3401,26",
		"OPNPCT,field3402,27",
		"OPLOC5,field3403,28",
		"OPLOC3,field3404,29",
		"EVENT_CAMERA_POSITION,field3443,30",
		"MUSIC_PLAYING,field3406,31",
		"SET_HEADING,field3407,32",
		"OPLOC2,field3440,34",
		"BUG_REPORT,field3410,35",
		"CHAT_SENDABUSEREPORT,field3378,36",
		"OPNPC1,field3412,37",
		"RESUME_NAMEDIALOG,field3413,38",
		"OPNPC4,field3391,39",
		"OPLOC4,field3400,40",
		"OPPLAYER3,field3416,41",
		"CLICK_WORLD_MAP,field3418,43",
		"EVENT_WINDOW_SETTING,field3419,44",
		"OPLOCE,field3420,45",
		"CLAN_SETTINGS_FULL_REQUEST,field3421,46",
		"CLAN_SETTINGS_ADD_BANNED_FROM_CHANNEL,field3458,47",
		"OPPLAYER5,field3423,48",
		"CHAT_SENDPRIVATE,field3425,50",
		"IF_BUTTONT,field3426,51",
		"OPPLAYERU,field3379,52",
		"WIDGET_TYPE,field3428,53",
		"CLOSE_MODAL,field3429,54",
		"RESUME_COUNTDIALOG,field3422,57",
		"EVENT_MOUSE_IDLE,field3433,58",
		"OPOBJU,field3434,59",
		"OPPLAYER2,field3470,60",
		"RESUME_OBJDIALOG,field3436,61",
		"REFLECTION_CHECK_REPLY,field3437,62",
		"IF_BUTTON4,field3408,63",
		"OPPLAYERT,field3439,64",
		"IGNORE_DELUSER,field3375,65",
		"RESUME_PAUSEBUTTON,field3396,66",
		"IF_BUTTON7,field3441,67",
		"FRIEND_ADDUSER,field3435,68",
		"MOVE_GAMECLICK,field3444,69",
		"FRIEND_CHAT_JOIN_LEAVE,field3453,70",
		"MINIMAP_CLICK,field3427,71",
		"OPNPC2,field3384,72",
		"OPOBJ2,field3448,73",
		"CHAT_SETFILTER,field3449,74",
		"IGNORE_LIST_ADD,field3450,75",
		"NO_TIMEOUT,field3451,76",
		"OPOBJE,field3442,77",
		"TELEPORT,field3431,78",
		"CLAN_KICKUSER,field3454,79",
		"IF_BUTTON1,field3455,80",
		"EVENT_APPLET_FOCUS,field3405,82",
		"DOCHEAT,field3415,83",
		"MOUSE_MOVE,field3459,84",
		"IF_BUTTON6,field3460,85",
		"IF_BUTTON9,field3461,86",
		"OPNPCE,field3462,87",
		"OPOBJ4,field3376,88",
		"OPLOC1,field3464,89",
		"IF_BUTTON5,field3465,90",
		"RESUME_STRINGDIALOG,field3466,91",
		"OPPLAYER8,field3457,92",
		"MOUSE_WHEEL,field3468,93",
		"OPOBJT,field3469,94",
		"EVENT_KEYBOARD,field3411,95",
		"DETECT_MODIFIED_CLIENT,field3479,96",
		"OPLOCU,field3472,97",
		"LOGIN_TIMINGS,field3473,98",
		"OPOBJ1,field3474,99",
		"OPPLAYER4,field3475,100",
		"IF_BUTTONX,field3476,101"
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