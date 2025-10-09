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
		"UPDATE_INV_FULL,0",
		"NPC_INFO_LARGE_VIEWPORT,1",
		"LOGOUT_FULL,2",
		"LOC_ANIM,3",
		"REBUILD_WORLDENTITY,4",
		"LOC_MERGEPLAYER,5",
		"NPC_HEADICON_SPECIFIC,6",
		"IF_OPENTOP,7",
		"LOC_DEL,8",
		"UPDATE_ZONE_PARTIAL_ENCLOSED,9",
		"UPDATE_ZONE_FULL_FOLLOWS,10",
		"CAM_MODE,11",
		"SYNC_CLIENT_VARCACHE,13",
		"EVENT_WORLDHOP,14",
		"CLAN_SETTINGS_DELTA,15",
		"UPDATE_IGNORELIST,16",
		"REBUILD_REGION,17",
		"REFLECTION_CHECKER,18",
		"PROJECTILE_SPAWN,19",
		"NPC_SET_SEQUENCE,20",
		"UPDATE_RUN_WEIGHT,21",
		"PLAYER_SPOTANIM,22",
		"IF_SETCOLOUR,23",
		"HINT_ARROW,24",
		"URL_OPEN,25",
		"UPDATE_INV_PARTIAL,26",
		"RESET_ANIMS,27",
		"LOGOUT,28",
		"UPDATE_REBOOT_TIMER,29",
		"UPDATE_ZONE_PARTIAL_FOLLOWS_LEVEL,30",
		"UPDATE_FRIEND_CHAT_CHANNEL_FULL_V1,31",
		"RUNCLIENTSCRIPT,32",
		"MINIMAP_TOGGLE,33",
		"MESSAGE_FRIEND_PRIVATE,34",
		"UPDATE_STAT,35",
		"PLAYER_ANIM_SPECIFIC,36",
		"IF_SETPOSITION,37",
		"IF_SETOBJECT,39",
		"OCULUS_SYNC,40",
		"IF_SET_PLAYERMODEL_BODYTYPE,42",
		"HEAT_MAP,44",
		"VARP_SMALL,45",
		"MESSAGE_PRIVATE,46",
		"CLAN_SETTINGS_FULL,48",
		"SERVER_TICK_END,49",
		"CAM_SHAKE,50",
		"IF_SETNPCHEAD,51",
		"IF_CLOSESUB,52",
		"IF_SETNPCHEAD_ACTIVE,53",
		"CAM_MOVE_TO,54",
		"MIDI_SONG_STOP,55",
		"IF_SETPLAYERHEAD,56",
		"IF_MOVESUB,57",
		"MINIMAP_FLAG_SET,58",
		"MIDI_JINGLE,59",
		"UPDATE_UID192,61",
		"CAM_MOVETO,62",
		"UPDATE_INV_CLEAR,63",
		"CAM_SETANGLE,64",
		"MAP_ANIM,67",
		"SET_PRIVCHATMODE,69",
		"RESET_CLIENT_VARCACHE,70",
		"VAR_CLAN_DISABLE,71",
		"FRIENDS_LIST_LOADED,72",
		"SET_PLAYER_OP,73",
		"UPDATE_FRIEND_CHAT_CHANNEL_SINGLE_USER,74",
		"TRIGGER_ONDIALOG_ABORT,75",
		"SYNTH_SOUND,76",
		"CHAT_FILTER_SETTINGS,77",
		"CLAN_CHANNEL_FULL,78",
		"LOC_ADD_CHANGE,79",
		"VAR_CLAN,80",
		"MESSAGE_CLAN_CHANNEL_SYSTEM,81",
		"REBUILD_NORMAL,82",
		"SET_NPC_UPDATE_ORIGIN,83",
		"PLAYER_INFO,84",
		"NPC_SPOTANIM,85",
		"UPDATE_RUN_ENERGY,86",
		"UPDATE_INV_STOP_TRANSIT,87",
		"IF_SET_PLAYERMODEL_SELF,88",
		"CLAN_CHANNEL_DELTA,89",
		"UNKNOWN_STRING,90",
		"PING_STATISTICS_REQUEST,92",
		"IF_OPENSUB,93",
		"CAM_TARGET,94",
		"IF_SETANIM,95",
		"MESSAGE_PRIVATE_ECHO,96",
		"UPDATE_FRIENDLIST,97",
		"CAM_LOOKAT_EASED_ANGLE_RELATIVE,98",
		"CAM_LOOKAT,99",
		"IF_SETPOSITION,100",
		"SET_ACTIVE_WORLD,101",
		"IF_SETHIDE,102",
		"MESSAGE_GAME,103",
		"IF_SET_PLAYERMODEL_BASECOLOUR,104",
		"GRAPHICSOBJECT_SPAWN,105",
		"CAM_RESET,106",
		"UPDATE_STOCKMARKET_SLOT,107",
		"IF_RESYNC,108",
		"IF_SET_TEXT,109",
		"RESET_INTERACTION_MODE,110",
		"MIDI_SONG_WITH_SECONDARY,111",
		"MIDI_SWAP,112",
		"IF_SET_PLAYERMODEL_OBJ,113",
		"VAR_CLAN_ENABLE,114",
		"IF_SETANGLE,115",
		"CAM_LOOKAT_EASED_COORD,116",
		"MESSAGE_FRIENDS_CHAT,118",
		"UPDATE_TRADING_POST,119",
		"CAM_SMOOTH_RESET,120",
		"NPC_INFO_SMALL_VIEWPORT,121",
		"UPDATE_SITE_SETTINGS,122",
		"VARP_LARGE,123",
		"IF_SETMODEL,124",
		"CAM_MOVETO_EASED_CIRCULAR,125",
		"MIDI_SONG,126",
		"IF_SET_ROTATE_SPEED,127",
		"WORLDENTITY_INFO,128",
		"IF_SET_EVENTS,130"
	).stream()
		.map(s -> s.split(","))
		.filter(s -> s.length >= 2)
		.collect(Collectors.toMap(s -> s[1].trim(), s -> s[0].trim()));

	private static final Map<String, String> CLIENT_PACKETS = List.of(
		"NO_TIMEOUT,0",
		"EVENT_KEYBOARD,1",
		"FRIEND_CHAT_JOIN_LEAVE,2",
		"OPWORLDENTITY2,3",
		"OPWORLDENTITY1,4",
		"OPNPC2,5",
		"RESUME_OBJDIALOG,6",
		"CLOSE_MODAL,7",
		"UPDATE_PLAYER_MODEL,8",
		"IF_SUBOP,9",
		"OPWORLDENTITYE,10",
		"OPOBJT,11",
		"REFLECTION_CHECK_REPLY,12",
		"EVENT_CAMERA_POSITION,14",
		"OPLOCE,15",
		"OPNPC1,16",
		"OPLOC4,17",
		"OPPLAYER7,18",
		"IF_BUTTONT,19",
		"MUSIC_PLAYING,20",
		"OPLOCU,21",
		"OPOBJ3,22",
		"CLAN_SETTINGS_FULL_REQUEST,23",
		"OPNPC4,25",
		"OPNPCU,26",
		"LOGIN_TIMINGS,27",
		"CLICK_WORLD_MAP,28",
		"DOCHEAT,29",
		"CHAT_SENDABUSEREPORT,31",
		"OPOBJ5,32",
		"OPPLAYER1,34",
		"RESUME_PAUSEBUTTON,35",
		"OPHELDD,36",
		"TELEPORT,37",
		"OPOBJE,38",
		"CLAN_SETTINGS_SET_MUTED_FROM_CHANNEL,39",
		"OPOBJU,41",
		"OPWORLDENTITY5,42",
		"RESUME_COUNTDIALOG,43",
		"OPPLAYERT,44",
		"EVENT_MOUSE_IDLE,45",
		"OPNPC5,46",
		"OPPLAYER2,47",
		"RESUME_NAMEDIALOG,48",
		"OPWORLDENTITY3,49",
		"OPNPCE,50",
		"OPOBJ2,51",
		"OPWORLDENTITYU,52",
		"CLAN_KICKUSER,53",
		"EVENT_APPLET_FOCUS,54",
		"FRIEND_CHAT_SETRANK,55",
		"CLAN_CHANNEL_KICK_USER,56",
		"FRIEND_DELUSER,57",
		"OPLOCT,58",
		"OPWORLDENTITY4,59",
		"OPPLAYER4,61",
		"IGNORE_DELUSER,62",
		"IGNORE_LIST_ADD,63",
		"OPLOC1,64",
		"WIDGET_TYPE,65",
		"MOUSE_MOVE,66",
		"OPLOC5,67",
		"OPLOC2,68",
		"MOUSE_WHEEL,70",
		"OPPLAYER8,71",
		"FRIEND_ADDUSER,73",
		"CLAN_SETTINGS_ADD_BANNED_FROM_CHANNEL,74",
		"IF_RUNSCRIPT,75",
		"OPLOC3,76",
		"OPNPCT,77",
		"OPPLAYER5,78",
		"OPPLAYER3,79",
		"MAP_BUILD_COMPLETE,80",
		"CLAN_CHANNEL_FULL_REQUEST,81",
		"EVENT_WINDOW_SETTING,82",
		"MESSAGE_PUBLIC,83",
		"OPWORLDENTITYT,84",
		"BUG_REPORT,85",
		"CHAT_SENDPRIVATE,86",
		"OPOBJ1,87",
		"RESUME_STRINGDIALOG,88",
		"SET_HEADING,89",
		"OPOBJ4,90",
		"IF_BUTTONX,91",
		"PING_STATISTICS,92",
		"OPPLAYER6,93",
		"OPNPC3,94",
		"IF_CRMVIEW,96",
		"CHAT_SETFILTER,97",
		"MOVE_GAMECLICK,98",
		"OPPLAYERU,99",
		"MINIMAP_CLICK,100"
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