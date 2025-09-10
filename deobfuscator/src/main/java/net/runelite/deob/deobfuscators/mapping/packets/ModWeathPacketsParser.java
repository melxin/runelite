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
	private static final String COMPATIBLE_REVISION = "233";

	private static final Map<String, String> SERVER_PACKETS = List.of(
		"VARP_SMALL,0",
		"MIDI_SONG,1",
		"IF_SET_PLAYERMODEL_OBJ,3",
		"IF_SET_PLAYERMODEL_BODYTYPE,4",
		"IF_SETSCROLLPOS,5",
		"OBJ_ADD,6",
		"CAM_SETANGLE,7",
		"UPDATE_REBOOT_TIMER,8",
		"UPDATE_STOCKMARKET_SLOT,9",
		"CAM_MOVE_TO,10",
		"IF_SETOBJECT,11",
		"IF_SETPOSITION,12",
		"IF_SET_ROTATE_SPEED,13",
		"UPDATE_FRIEND_CHAT_CHANNEL_SINGLE_USER,14",
		"IF_SETHIDE,15",
		"UPDATE_INV_PARTIAL,16",
		"MESSAGE_GAME,17",
		"MIDI_SWAP,18",
		"UPDATE_ZONE_FULL_FOLLOWS,19",
		"RESET_ANIMS,20",
		"UPDATE_IGNORELIST,21",
		"IF_SETNPCHEAD,22",
		"VARP_LARGE,23",
		"UPDATE_ZONE_PARTIAL_FOLLOWS_LEVEL,24",
		"RUNCLIENTSCRIPT,25",
		"UPDATE_FRIENDLIST,27",
		"IF_SETNPCHEAD_ACTIVE,28",
		"CLAN_SETTINGS_DELTA,29",
		"NPC_SET_SEQUENCE,30",
		"CLAN_SETTINGS_FULL,31",
		"OBJ_OPFILTER,32",
		"NPC_HEADICON_SPECIFIC,33",
		"MINIMAP_TOGGLE,34",
		"RESET_INTERACTION_MODE,36",
		"REBUILD_NORMAL,37",
		"REBUILD_REGION,38",
		"HINT_ARROW,39",
		"CAM_LOOKAT,40",
		"LOC_DEL,41",
		"MAP_ANIM,43",
		"URL_OPEN,44",
		"IF_CLOSESUB,46",
		"LOC_ANIM,47",
		"CAM_RESET,48",
		"MESSAGE_PRIVATE,50",
		"MINIMAP_FLAG_SET,51",
		"CAM_MODE,52",
		"PLAYER_SPOTANIM,53",
		"CLAN_CHANNEL_DELTA,54",
		"IF_SET_PLAYERMODEL_BASECOLOUR,56",
		"IF_OPENSUB,57",
		"MIDI_SONG_WITH_SECONDARY,58",
		"CAM_SMOOTH_RESET,59",
		"MESSAGE_FRIEND_PRIVATE,61",
		"HEAT_MAP,62",
		"PING_STATISTICS_REQUEST,63",
		"UPDATE_UID192,64",
		"OBJ_COUNT,65",
		"CAM_SHAKE,66",
		"UPDATE_RUN_WEIGHT,67",
		"UPDATE_INV_CLEAR,68",
		"IF_OPENTOP,69",
		"OCULUS_SYNC,70",
		"CAM_MOVETO_EASED_CIRCULAR,71",
		"VAR_CLAN_DISABLE,72",
		"LOC_ADD_CHANGE,73",
		"SET_PRIVCHATMODE,74",
		"LOGOUT_FULL,75",
		"VAR_CLAN_ENABLE,76",
		"SET_PLAYER_OP,77",
		"SYNC_CLIENT_VARCACHE,78",
		"CHAT_FILTER_SETTINGS,80",
		"IF_SET_TEXT,82",
		"CLAN_CHANNEL_FULL,83",
		"CAM_MOVETO,84",
		"VAR_CLAN,85",
		"IF_MOVESUB,86",
		"IF_SETANGLE,87",
		"UPDATE_RUN_ENERGY,88",
		"UPDATE_FRIEND_CHAT_CHANNEL_FULL_V1,89",
		"PLAYER_ANIM_SPECIFIC,90",
		"CAM_LOOKAT_EASED_ANGLE_RELATIVE,91",
		"GRAPHICSOBJECT_SPAWN,92",
		"REBUILD_WORLDENTITY,93",
		"NPC_INFO_SMALL_VIEWPORT,94",
		"UPDATE_ZONE_PARTIAL_ENCLOSED,95",
		"REFLECTION_CHECKER ,96",
		"UPDATE_TRADING_POST,97",
		"UPDATE_STAT,98",
		"MESSAGE_FRIENDS_CHAT,99",
		"IF_SETPLAYERHEAD,100",
		"CAM_LOOKAT_EASED_COORD,101",
		"LOGOUT,102",
		"CAM_TARGET,103",
		"EVENT_WORLDHOP,104",
		"TRIGGER_ONDIALOG_ABORT,105",
		"IF_SET_PLAYERMODEL_SELF,106",
		"SET_NPC_UPDATE_ORIGIN,107",
		"NPC_SPOTANIM,108",
		"MESSAGE_PRIVATE_ECHO,109",
		"FRIENDS_LIST_LOADED,110",
		"IF_SETANIM,111",
		"IF_SETMODEL,112",
		"MESSAGE_CLAN_CHANNEL_SYSTEM,113",
		"MIDI_SONG_STOP,114",
		"NPC_INFO_LARGE_VIEWPORT,115",
		"SERVER_TICK_END,116",
		"IF_SETCOLOUR,118",
		"UPDATE_INV_FULL,119",
		"LOC_MERGEPLAYER,120",
		"PLAYER_INFO,121",
		"OBJ_DEL,122",
		"DYNAMICOBJECT_SPAWN,123",
		"UPDATE_SITE_SETTINGS,124",
		"MIDI_JINGLE,125",
		"RESET_CLIENT_VARCACHE,126",
		"UPDATE_INV_STOP_TRANSIT,127",
		"OBJ_RESET_CUSTOMIZATION,130",
		"IF_SET_EVENTS,131",
		"IF_RESYNC,134",
		"PROJECTILE_SPAWN,135",
		"OBJ_SET_CUSTOMIZATION,138",
		"SET_ACTIVE_WORLD,140"
	).stream()
		.map(s -> s.split(","))
		.filter(s -> s.length >= 2)
		.collect(Collectors.toMap(s -> s[1].trim(), s -> s[0].trim()));

	private static final Map<String, String> CLIENT_PACKETS = List.of(
		"OPLOC3,0",
		"OPLOCT,1",
		"OPWORLDENTITY3,2",
		"OPOBJ4,3",
		"MOUSE_MOVE,4",
		"RESUME_PAUSEBUTTON,5",
		"OPOBJ5,6",
		"MUSIC_PLAYING,7",
		"CLICK_WORLD_MAP,8",
		"IF_BUTTONX,9",
		"MINIMAP_CLICK,10",
		"CLOSE_MODAL,12",
		"LOGIN_TIMINGS,13",
		"CLAN_SETTINGS_FULL_REQUEST,14",
		"OPPLAYER2,15",
		"OPOBJ1,16",
		"BUG_REPORT,17",
		"OPOBJ3,18",
		"CLAN_SETTINGS_SET_MUTED_FROM_CHANNEL,19",
		"FRIEND_CHAT_SETRANK,20",
		"OPOBJE,21",
		"OPOBJT,22",
		"OPPLAYERU,23",
		"IF_BUTTONT,24",
		"OPNPC4,25",
		"MESSAGE_PUBLIC,26",
		"OPWORLDENTITY1,27",
		"EVENT_WINDOW_SETTING,28",
		"OPNPC5,29",
		"OPPLAYERT,30",
		"OPWORLDENTITYT,31",
		"OPOBJ2,32",
		"OPWORLDENTITY5,33",
		"MOUSE_WHEEL,34",
		"EVENT_KEYBOARD,36",
		"EVENT_APPLET_FOCUS,37",
		"OPOBJU,39",
		"DOCHEAT,40",
		"OPNPC2,41",
		"OPPLAYER8,42",
		"OPPLAYER5,43",
		"CHAT_SETFILTER,44",
		"RESUME_STRINGDIALOG,46",
		"MAP_BUILD_COMPLETE,47",
		"EVENT_CAMERA_POSITION,48",
		"OPPLAYER7,49",
		"OPPLAYER1,50",
		"RESUME_OBJDIALOG,51",
		"FRIEND_CHAT_JOIN_LEAVE,52",
		"OPNPC1,53",
		"CHAT_SENDABUSEREPORT,54",
		"OPWORLDENTITY2,55",
		"OPLOC5,56",
		"OPNPCT,57",
		"OPLOC4,58",
		"FRIEND_ADDUSER,59",
		"OPWORLDENTITYU,60",
		"OPPLAYER3,61",
		"CLAN_SETTINGS_ADD_BANNED_FROM_CHANNEL,62",
		"UPDATE_PLAYER_MODEL,63",
		"CLAN_CHANNEL_KICK_USER,64",
		"CHAT_SENDPRIVATE,65",
		"IGNORE_DELUSER,67",
		"CLAN_KICKUSER,68",
		"SET_HEADING,69",
		"OPLOCU,73",
		"OPPLAYER4,74",
		"WIDGET_TYPE,75",
		"PING_STATISTICS,76",
		"IGNORE_LIST_ADD,77",
		"OPNPCE,78",
		"REFLECTION_CHECK_REPLY,79",
		"IF_CRMVIEW,80",
		"TELEPORT,81",
		"OPNPCU,82",
		"FRIEND_DELUSER,83",
		"CLAN_CHANNEL_FULL_REQUEST,84",
		"RESUME_NAMEDIALOG,85",
		"OPWORLDENTITY4,86",
		"RESUME_COUNTDIALOG,87",
		"OPWORLDENTITYE,88",
		"OPLOCE,89",
		"MOVE_GAMECLICK,90",
		"OPPLAYER6,91",
		"EVENT_MOUSE_CLICK,92",
		"OPNPC3,93",
		"OPHELDD,94",
		"IF_RUNSCRIPT,95",
		"EVENT_MOUSE_IDLE,96",
		"OPLOC1,97",
		"OPLOC2,98",
		"NO_TIMEOUT,99",
		"IF_SUBOP,100"
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