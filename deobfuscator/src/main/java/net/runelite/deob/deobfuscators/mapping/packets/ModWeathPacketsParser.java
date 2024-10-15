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
	private static final String COMPATIBLE_REVISION = "225";

	private static final Map<String, String> SERVER_PACKETS = List.of(
		"SET_PLAYER_OP,field3434,1",
		"PLAYER_INFO,field3435,2",
		"UPDATE_INV_CLEAR,field3437,4",
		"UPDATE_ZONE_PARTIAL_ENCLOSED,field3438,5",
		"UPDATE_STAT,field3441,8",
		"UPDATE_ZONE_FULL_FOLLOWS,field3540,10",
		"MINIMAP_FLAG_SET,field3448,15",
		"MESSAGE_PRIVATE,field3517,16",
		"IF_SETCOLOUR,field3549,19",
		"PROJECTILE_SPAWN,field3454,21",
		"CHAT_FILTER_SETTINGS,field3455,22",
		"VARP_SMALL,field3458,25",
		"UPDATE_INV_FULL,field3557,26",
		"IF_CLOSESUB,field3460,27",
		"IF_SETOBJECT,field3461,28",
		"GRAPHICSOBJECT_SPAWN,field3464,31",
		"MESSAGE_FRIENDS_CHAT,field3452,34",
		"IF_SETPLAYERHEAD,field3471,38",
		"REBUILD_NORMAL,field3533,40",
		"RESET_CLIENT_VARCACHE,field3465,42",
		"DYNAMICOBJECT_SPAWN,field3564,43",
		"TRIGGER_ONDIALOG_ABORT,field3506,46",
		"UPDATE_REBOOT_TIMER,field3488,47",
		"MESSAGE_PRIVATE_ECHO,field3482,49",
		"VARP_LARGE,field3486,53",
		"IF_SETHIDE,field3497,57",
		"LOGOUT_FULL,field3492,59",
		"UPDATE_FRIENDLIST,field3494,61",
		"CAM_SETANGLE,field3495,62",
		"IF_SETANGLE,field3566,64",
		"CAM_RESET,field3513,66",
		"LOGOUT,field3480,67",
		"REFLECTION_CHECKER,field3502,69",
		"CAM_MOVETO,field3490,70",
		"UPDATE_INV_PARTIAL,field3504,71",
		"CAM_LOOKAT,field3526,73",
		"UPDATE_INV_STOP_TRANSIT,field3507,74",
		"UPDATE_STOCKMARKET_SLOT,field3510,77",
		"RUNCLIENTSCRIPT,field3521,78",
		"SYNC_CLIENT_VARCACHE,field3443,79",
		"MESSAGE_GAME,field3459,80",
		"SET_PRIVCHATMODE,field3515,82",
		"URL_OPEN,field3524,84",
		"IF_SETPOSITION,field3520,87",
		"IF_SETMODEL,field3523,90",
		"IF_SETSCROLLPOS,field3477,91",
		"REBUILD_REGION,field3528,95",
		"IF_SETNPCHEAD,field3530,97",
		"MINIMAP_TOGGLE,field3534,101",
		"HINT_ARROW,field3536,103",
		"NPC_INFO_LARGE_VIEWPORT_2,field3518,105",
		"UPDATE_IGNORELIST,field3546,108",
		"NPC_INFO_SMALL_VIEWPORT_1,field3542,109",
		"NPC_SET_SEQUENCE,field3544,111",
		"PING_STATISTICS_REQUEST,field3545,112",
		"PLAYER_SPOTANIM,field3436,116",
		"IF_MOVESUB,field3550,117",
		"EVENT_WORLDHOP,field3555,122",
		"UPDATE_UID192,field3560,127"
	).stream()
		.map(s -> s.split(","))
		.filter(s -> s.length >= 2)
		.collect(Collectors.toMap(s -> s[1].trim(), s -> s[0].trim()));

	private static final Map<String, String> CLIENT_PACKETS = List.of(
		"EVENT_MOUSE_IDLE,field3389,0",
		"IF_BUTTON3,field3309,2",
		"IF_BUTTON5,field3310,3",
		"OPLOC5,field3311,4",
		"EVENT_APPLET_FOCUS,field3376,5",
		"OPLOC3,field3391,6",
		"IF_BUTTON7,field3386,7",
		"OPPLAYER2,field3388,10",
		"IF_BUTTON4,field3318,11",
		"EVENT_WINDOW_SETTING,field3357,12",
		"OPPLAYER7,field3317,13",
		"OPHELDD,field3366,14",
		"OPOBJ3,field3323,16",
		"OPNPCE,field3324,17",
		"WIDGET_TYPE,field3325,18",
		"OPOBJE,field3326,19",
		"OPNPC4,field3327,20",
		"IF_BUTTON6,field3370,21",
		"PING_STATISTICS,field3382,22",
		"IF_BUTTON8,field3330,23",
		"OPPLAYER6,field3331,24",
		"IGNORE_DELUSER,field3313,25",
		"LOGIN_TIMINGS,field3333,26",
		"CHAT_SENDPRIVATE,field3334,27",
		"CLOSE_MODAL,field3335,28",
		"OPOBJ5,field3337,30",
		"OPNPCT,field3346,33",
		"RESUME_NAMEDIALOG,field3342,35",
		"IF_SUBOP,field3343,36",
		"IF_BUTTONT,field3344,37",
		"EVENT_MOUSE_CLICK,field3387,39",
		"OPLOC4,field3348,41",
		"OPLOC1,field3405,42",
		"OPLOC2,field3314,43",
		"OPNPC1,field3351,44",
		"REFLECTION_CHECK_REPLY,field3316,45",
		"FRIEND_DELUSER,field3353,46",
		"OPNPC3,field3354,47",
		"CHAT_SENDABUSEREPORT,field3339,48",
		"IF_BUTTON1,field3362,49",
		"NO_TIMEOUT,field3332,50",
		"OPPLAYER8,field3340,51",
		"OPPLAYER5,field3355,52",
		"IF_BUTTON2,field3361,54",
		"OPPLAYER1,field3363,56",
		"OPLOCT,field3369,59",
		"CLAN_KICKUSER,field3367,60",
		"IF_BUTTON10,field3358,62",
		"MOVE_GAMECLICK,field3329,63",
		"OPNPC5,field3328,64",
		"OPPLAYERT,field3373,66",
		"EVENT_CAMERA_POSITION,field3374,67",
		"OPOBJT,field3359,69",
		"RESUME_OBJDIALOG,field3378,71",
		"EVENT_KEYBOARD,field3379,72",
		"IF_BUTTON9,field3380,73",
		"RESUME_STRINGDIALOG,field3319,75",
		"CHAT_SETFILTER,field3383,76",
		"OPOBJ2,field3384,77",
		"OPPLAYER3,field3402,79",
		"DETECT_MODIFIED_CLIENT,field3321,81",
		"OPNPC2,field3390,83",
		"OPOBJ4,field3392,85",
		"OPPLAYER4,field3395,88",
		"OPOBJ1,field3397,90",
		"RESUME_COUNTDIALOG,field3398,91",
		"FRIEND_ADDUSER,field3399,92",
		"RESUME_PAUSEBUTTON,field3400,93",
		"MINIMAP_CLICK,field3403,96",
		"OPLOCE,field3406,99"
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
		targetServerPacketCF.getFields().stream().filter(f -> f.isStatic() && f.getType().equals(new Type("L" + targetClientPacketCF.getName() + ";"))).forEach(clp ->
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