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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import net.runelite.asm.Annotation;
import net.runelite.asm.ClassFile;
import net.runelite.asm.ClassGroup;
import net.runelite.asm.Field;
import net.runelite.asm.Method;
import net.runelite.asm.Type;
import net.runelite.asm.attributes.code.Instruction;
import net.runelite.asm.attributes.code.instruction.types.PushConstantInstruction;
import net.runelite.asm.attributes.code.instructions.PutStatic;
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
	private static final String COMPATIBLE_REVISION = "234";

	private static final Map<String, String> SERVER_PACKETS = List.of(
		"SERVER_TICK_END,0",
		"SET_PLAYER_OP,1",
		"UPDATE_REBOOT_TIMER,2",
		"REFLECTION_CHECKER,3",
		"URL_OPEN,4",
		"SET_PRIVCHATMODE,5",
		"LOC_DEL,6",
		"UPDATE_INV_CLEAR,7",
		"IF_OPENSUB,8",
		"MESSAGE_PRIVATE,9",
		"CAM_LOOKAT,10",
		"CAM_TARGET,11",
		"CAM_SETANGLE,12",
		"IF_SETCOLOUR,13",
		"UPDATE_IGNORELIST,14",
		"MIDI_SONG,15",
		"NPC_INFO_SMALL_VIEWPORT,16",
		"NPC_SET_SEQUENCE,17",
		"VARP_SMALL,18",
		"CAM_LOOKAT_EASED_COORD,19",
		"SYNTH_SOUND,20",
		"GRAPHICSOBJECT_SPAWN,21",
		"CAM_LOOKAT_EASED_ANGLE_RELATIVE,22",
		"MINIMAP_TOGGLE,23",
		"UPDATE_INV_STOP_TRANSIT,24",
		"MIDI_JINGLE,25",
		"PLAYER_SPOTANIM,26",
		"IF_SET_PLAYERMODEL_BASECOLOUR,27",
		"UPDATE_STAT,28",
		"IF_SETANIM,29",
		"MESSAGE_GAME,30",
		"LOGOUT,31",
		"MESSAGE_CLAN_CHANNEL_SYSTEM,32",
		"IF_RESYNC,33",
		"FRIENDS_LIST_LOADED,34",
		"TRIGGER_ONDIALOG_ABORT,35",
		"IF_SETPOSITION,36",
		"CAM_MODE,37",
		"IF_OPENTOP,38",
		"IF_SETSCROLLPOS,39",
		"MIDI_SWAP,40",
		"UPDATE_ZONE_PARTIAL_FOLLOWS_LEVEL,41",
		"IF_SETHIDE,42",
		"IF_MOVESUB,43",
		"HINT_ARROW,44",
		"UPDATE_FRIENDLIST,45",
		"LOC_ADD_CHANGE,46",
		"UPDATE_TRADING_POST,47",
		"NPC_INFO_LARGE_VIEWPORT,48",
		"IF_CLOSESUB,49",
		"UPDATE_STOCKMARKET_SLOT,50",
		"IF_SETMODEL,51",
		"RESET_INTERACTION_MODE,52",
		"IF_SET_ROTATE_SPEED,53",
		"UNKNOWN_STRING,54",
		"UPDATE_RUN_ENERGY,55",
		"CLAN_CHANNEL_DELTA,56",
		"IF_SETNPCHEAD_ACTIVE,57",
		"LOGOUT_FULL,58",
		"PROJECTILE_SPAWN,59",
		"CLAN_CHANNEL_FULL,60",
		"UPDATE_SITE_SETTINGS,61",
		"MINIMAP_FLAG_SET,62",
		"MESSAGE_FRIENDS_CHAT,63",
		"VAR_CLAN_ENABLE,64",
		"CLAN_SETTINGS_FULL,65",
		"SYNC_CLIENT_VARCACHE,66",
		"PLAYER_ANIM_SPECIFIC,67",
		"RESET_ANIMS,68",
		"NPC_SPOTANIM,69",
		"UPDATE_UID192,70",
		"REBUILD_NORMAL,71",
		"MESSAGE_PRIVATE_ECHO,72",
		"RESET_CLIENT_VARCACHE,73",
		"IF_SET_TEXT,74",
		"MIDI_SONG_WITH_SECONDARY,75",
		"SET_ACTIVE_WORLD,76",
		"IF_SETOBJECT,77",
		"LOC_ANIM,78",
		"IF_SET_PLAYERMODEL_SELF,79",
		"REBUILD_WORLDENTITY,80",
		"VAR_CLAN_DISABLE,81",
		"DYNAMICOBJECT_SPAWN,82",
		"HEAT_MAP,83",
		"UPDATE_INV_FULL,84",
		"UPDATE_ZONE_FULL_FOLLOWS,85",
		"CAM_SMOOTH_RESET,86",
		"CAM_SHAKE,87",
		"PLAYER_INFO,88",
		"CAM_RESET,89",
		"NPC_HEADICON_SPECIFIC,90",
		"SET_NPC_UPDATE_ORIGIN,91",
		"UPDATE_FRIEND_CHAT_CHANNEL_FULL_V1,92",
		"MESSAGE_FRIEND_PRIVATE,93",
		"CLAN_SETTINGS_DELTA,94",
		"REBUILD_REGION,95",
		"UPDATE_FRIEND_CHAT_CHANNEL_SINGLE_USER,96",
		"CAM_MOVETO,97",
		"EVENT_WORLDHOP,98",
		"CAM_MOVETO_EASED_CIRCULAR,99",
		"UPDATE_ZONE_PARTIAL_ENCLOSED,100",
		"IF_SET_PLAYERMODEL_OBJ,101",
		"CAM_MOVE_TO,102",
		"UPDATE_RUN_WEIGHT,103",
		"PING_STATISTICS_REQUEST,104",
		"IF_SETPLAYERHEAD,105",
		"IF_SETANGLE,106",
		"VAR_CLAN,107",
		"MIDI_SONG_STOP,108",
		"IF_SET_PLAYERMODEL_BODYTYPE,109",
		"MAP_ANIM,110",
		"IF_SETNPCHEAD,111",
		"OCULUS_SYNC,112",
		"UPDATE_INV_PARTIAL,113",
		"CHAT_FILTER_SETTINGS,114",
		"LOC_MERGEPLAYER,115",
		"RUNCLIENTSCRIPT,116",
		"VARP_LARGE,117",
		"WORLDENTITY_INFO,118",
		"IF_SET_EVENTS,119"
	).stream()
		.map(s -> s.split(","))
		.filter(s -> s.length >= 2)
		.collect(Collectors.toMap(s -> s[1].trim(), s -> s[0].trim()));

	private static final Map<String, String> CLIENT_PACKETS = List.of(
		"OPLOC2,0",
		"EVENT_KEYBOARD,1",
		"RESUME_COUNTDIALOG,2",
		"CLAN_SETTINGS_SET_MUTED_FROM_CHANNEL,3",
		"RESUME_OBJDIALOG,4",
		"MUSIC_PLAYING,5",
		"OPPLAYER2,6",
		"EVENT_APPLET_FOCUS,7",
		"OPLOCU,8",
		"WIDGET_TYPE,9",
		"CHAT_SENDABUSEREPORT,10",
		"OPPLAYER4,11",
		"CLICK_WORLD_MAP,12",
		"OPPLAYER1,14",
		"OPWORLDENTITY2,15",
		"OPWORLDENTITYU,16",
		"OPLOC3,17",
		"OPWORLDENTITY5,19",
		"RESUME_NAMEDIALOG,21",
		"CLOSE_MODAL,22",
		"OPNPC1,23",
		"MINIMAP_CLICK,24",
		"DOCHEAT,25",
		"OPNPC2,26",
		"FRIEND_DELUSER,27",
		"OPLOC4,28",
		"OPPLAYER7,29",
		"IF_RUNSCRIPT,30",
		"OPOBJ1,31",
		"RESUME_STRINGDIALOG,32",
		"MOUSE_WHEEL,33",
		"CLAN_SETTINGS_FULL_REQUEST,34",
		"BUG_REPORT,35",
		"MAP_BUILD_COMPLETE,36",
		"FRIEND_CHAT_JOIN_LEAVE,37",
		"LOGIN_TIMINGS,38",
		"IF_BUTTONX,39",
		"TELEPORT,40",
		"OPWORLDENTITY4,41",
		"PING_STATISTICS,42",
		"OPNPC5,43",
		"EVENT_MOUSE_IDLE,44",
		"IF_CRMVIEW,45",
		"OPOBJT,46",
		"CHAT_SETFILTER,47",
		"OPPLAYER8,48",
		"EVENT_CAMERA_POSITION,49",
		"OPLOCE,50",
		"OPWORLDENTITY1,51",
		"OPPLAYERU,52",
		"REFLECTION_CHECK_REPLY,53",
		"OPLOC5,54",
		"NO_TIMEOUT,55",
		"OPOBJ3,56",
		"OPNPCE,57",
		"MESSAGE_PUBLIC,58",
		"OPNPC4,59",
		"OPPLAYERT,60",
		"OPLOCT,61",
		"IGNORE_DELUSER,62",
		"OPWORLDENTITYT,63",
		"OPWORLDENTITY3,64",
		"CHAT_SENDPRIVATE,65",
		"IGNORE_LIST_ADD,66",
		"FRIEND_ADDUSER,67",
		"IF_BUTTONT,68",
		"OPPLAYER3,69",
		"MOUSE_MOVE,70",
		"RESUME_PAUSEBUTTON,71",
		"EVENT_MOUSE_CLICK,72",
		"CLAN_CHANNEL_KICK_USER,73",
		"FRIEND_CHAT_SETRANK,74",
		"OPNPCU,75",
		"MOVE_GAMECLICK,76",
		"OPOBJ2,77",
		"IF_SUBOP,78",
		"OPOBJE,79",
		"OPNPC3,80",
		"OPOBJU,82",
		"CLAN_CHANNEL_FULL_REQUEST,84",
		"OPHELDD,85",
		"UPDATE_PLAYER_MODEL,86",
		"OPPLAYER5,87",
		"SET_HEADING,88",
		"OPNPCT,90",
		"OPOBJ5,91",
		"EVENT_WINDOW_SETTING,93",
		"CLAN_SETTINGS_ADD_BANNED_FROM_CHANNEL,95",
		"OPLOC1,96",
		"CLAN_KICKUSER,97",
		"OPWORLDENTITYE,98",
		"OPPLAYER6,99",
		"OPOBJ4,100"
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
			final Method clinit = targetServerPacketCF.findStaticMethod("<clinit>");
			final List<Instruction> ins = clinit.getCode().getInstructions().getInstructions();
			final Map<String, Field> idToPacketMap = new HashMap<>();
			String id = null;
			Field packet = null;
			for (Instruction in : ins)
			{
				if (id == null)
				{
					if (in instanceof PushConstantInstruction)
					{
						final PushConstantInstruction pci = (PushConstantInstruction) in;
						id = String.valueOf(pci.getConstant());
						continue;
					}
				}

				if (id != null && packet == null)
				{
					if (in instanceof PutStatic)
					{
						final Field targetServerPacketField = ((PutStatic) in).getMyField();
						if (targetServerPacketField.getType().equals(SERVER_PACKET_TYPE))
						{
							packet = targetServerPacketField;
						}
					}
				}

				if (id != null && packet != null)
				{
					idToPacketMap.put(id, packet);
					id = null;
					packet = null;
				}
			}

			SERVER_PACKETS.entrySet().forEach(entry ->
			{
				final String packetId = entry.getKey();
				final String named = entry.getValue();
				final Field targetServerPacketField = idToPacketMap.get(packetId);
				if (targetServerPacketField != null)
				{
					logger.info("Mapping server packet: {} -> {}", targetServerPacketField.getName(), named);
					newNameMappings.map(targetServerPacketField.getPoolField(), named);
				}
			});
		}

		// Client packets
		if (!CLIENT_PACKETS.isEmpty())
		{
			final Method clinit = targetClientPacketCF.findStaticMethod("<clinit>");
			final List<Instruction> ins = clinit.getCode().getInstructions().getInstructions();
			final Map<String, Field> idToPacketMap = new HashMap<>();
			String id = null;
			Field packet = null;
			for (Instruction in : ins)
			{
				if (id == null)
				{
					if (in instanceof PushConstantInstruction)
					{
						final PushConstantInstruction pci = (PushConstantInstruction) in;
						id = String.valueOf(pci.getConstant());
						continue;
					}
				}

				if (id != null && packet == null)
				{
					if (in instanceof PutStatic)
					{
						final Field targetClientPacketField = ((PutStatic) in).getMyField();
						if (targetClientPacketField.getType().equals(CLIENT_PACKET_TYPE))
						{
							packet = targetClientPacketField;
						}
					}
				}

				if (id != null && packet != null)
				{
					idToPacketMap.put(id, packet);
					id = null;
					packet = null;
				}
			}

			CLIENT_PACKETS.entrySet().forEach(entry ->
			{
				final String packetId = entry.getKey();
				final String named = entry.getValue();
				final Field targetClientPacketField = idToPacketMap.get(packetId);
				if (targetClientPacketField != null)
				{
					logger.info("Mapping client packet: {} -> {}", targetClientPacketField.getName(), named);
					newNameMappings.map(targetClientPacketField.getPoolField(), named);
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