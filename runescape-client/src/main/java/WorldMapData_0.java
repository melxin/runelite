import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ko")
@Implements("WorldMapData_0")
public class WorldMapData_0 extends AbstractWorldMapData {
	WorldMapData_0() {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "28976712"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 != WorldMapID.field3247.value) {
			throw new IllegalStateException("");
		} else {
			super.minPlane = var1.readUnsignedByte();
			super.planes = var1.readUnsignedByte();
			super.regionXLow = var1.readUnsignedShort() * 64;
			super.regionYLow = var1.readUnsignedShort() * 4096;
			super.regionX = var1.readUnsignedShort();
			super.regionY = var1.readUnsignedShort();
			super.groupId = var1.readNullableLargeSmart();
			super.fileId = var1.readNullableLargeSmart();
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lvy;B)V",
		garbageValue = "-46"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4);
		super.floorUnderlayIds = new short[1][64][64];
		super.floorOverlayIds = new short[super.planes][64][64];
		super.field3210 = new byte[super.planes][64][64];
		super.field3205 = new byte[super.planes][64][64];
		super.decorations = new WorldMapDecoration[super.planes][64][64][];
		int var2 = var1.readUnsignedByte();
		if (var2 != class298.field3236.value) {
			throw new IllegalStateException("");
		} else {
			int var3 = var1.readUnsignedByte();
			int var4 = var1.readUnsignedByte();
			if (var3 == super.regionX && var4 == super.regionY) {
				for (int var5 = 0; var5 < 64; ++var5) {
					for (int var6 = 0; var6 < 64; ++var6) {
						this.readTile(var5, var6, var1);
					}
				}

			} else {
				throw new IllegalStateException("");
			}
		}
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_0)) {
			return false;
		} else {
			WorldMapData_0 var2 = (WorldMapData_0)var1;
			return super.regionX == var2.regionX && super.regionY == var2.regionY;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)[Lmn;",
		garbageValue = "48"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.SET_PLAYER_OP, ServerPacket.CAM_LOOKAT, ServerPacket.IF_SETNPCHEAD, ServerPacket.IF_SET_EVENTS, ServerPacket.GRAPHICSOBJECT_SPAWN, ServerPacket.DYNAMICOBJECT_SPAWN, ServerPacket.MIDI_JINGLE, ServerPacket.LOC_ANIM, ServerPacket.LOC_DEL, ServerPacket.IF_SETANGLE, ServerPacket.UPDATE_RUN_ENERGY, ServerPacket.IF_SETPOSITION, ServerPacket.RUNCLIENTSCRIPT, ServerPacket.IF_SET_PLAYERMODEL_BASECOLOUR, ServerPacket.CAM_LOOKAT_EASED_ANGLE_RELATIVE, ServerPacket.UPDATE_FRIENDLIST, ServerPacket.VAR_CLAN_DISABLE, ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED, ServerPacket.IF_OPENTOP, ServerPacket.OBJ_ADD, ServerPacket.OBJ_DEL, ServerPacket.REBUILD_WORLDENTITY, ServerPacket.LOGOUT, ServerPacket.OCULUS_SYNC, ServerPacket.IF_RESYNC, ServerPacket.MIDI_SWAP, ServerPacket.NPC_SPOTANIM, ServerPacket.VARP_SMALL, ServerPacket.MAP_PROJANIM, ServerPacket.CAM_LOOKAT_EASED_COORD, ServerPacket.CAM_SHAKE, ServerPacket.REBUILD_REGION, ServerPacket.UPDATE_INV_CLEAR, ServerPacket.PING_STATISTICS_REQUEST, ServerPacket.IF_SETMODEL, ServerPacket.MIDI_SONG_WITH_SECONDARY, ServerPacket.EVENT_WORLDHOP, ServerPacket.URL_OPEN, ServerPacket.IF_SETANIM, ServerPacket.CAM_TARGET, ServerPacket.field3483, ServerPacket.HEAT_MAP, ServerPacket.VAR_CLAN, ServerPacket.IF_MOVESUB, ServerPacket.LOC_ADD_CHANGE, ServerPacket.CAM_RESET, ServerPacket.OBJ_OPFILTER, ServerPacket.LOGOUT_FULL, ServerPacket.MESSAGE_FRIENDS_CHAT, ServerPacket.UPDATE_RUN_WEIGHT, ServerPacket.CAM_MOVETO_EASED_CIRCULAR, ServerPacket.IF_SETSCROLLPOS, ServerPacket.PLAYER_SPOTANIM, ServerPacket.field3496, ServerPacket.IF_SETOBJECT, ServerPacket.VAR_CLAN_ENABLE, ServerPacket.MESSAGE_GAME, ServerPacket.CAM_MODE, ServerPacket.REBUILD_NORMAL, ServerPacket.IF_SETPLAYERHEAD, ServerPacket.CLAN_CHANNEL_FULL, ServerPacket.IF_SETHIDE, ServerPacket.MINIMAP_FLAG_SET, ServerPacket.field3506, ServerPacket.UPDATE_STOCKMARKET_SLOT, ServerPacket.VARP_LARGE, ServerPacket.UPDATE_UID192, ServerPacket.MIDI_SONG_STOP, ServerPacket.CLAN_SETTINGS_FULL, ServerPacket.IF_SETCOLOUR, ServerPacket.IF_SET_PLAYERMODEL_BODYTYPE, ServerPacket.TRIGGER_ONDIALOG_ABORT, ServerPacket.UPDATE_SITE_SETTINGS, ServerPacket.UPDATE_REBOOT_TIMER, ServerPacket.CAM_MOVETO, ServerPacket.UPDATE_TRADING_POST, ServerPacket.UPDATE_INV_PARTIAL, ServerPacket.HINT_ARROW, ServerPacket.PLAYER_ANIM_SPECIFIC, ServerPacket.IF_SET_ROTATE_SPEED, ServerPacket.CAM_MOVE_TO, ServerPacket.NPC_HEADICON_SPECIFIC, ServerPacket.MAP_ANIM, ServerPacket.field3526, ServerPacket.CAM_SMOOTH_RESET, ServerPacket.CLAN_SETTINGS_DELTA, ServerPacket.SERVER_TICK_END, ServerPacket.IF_OPENSUB, ServerPacket.SYNC_CLIENT_VARCACHE, ServerPacket.SET_ACTIVE_WORLD, ServerPacket.field3533, ServerPacket.RESET_ANIMS, ServerPacket.MESSAGE_CLAN_CHANNEL_SYSTEM, ServerPacket.UPDATE_INV_STOP_TRANSIT, ServerPacket.FRIENDS_LIST_LOADED, ServerPacket.IF_CLOSESUB, ServerPacket.PLAYER_INFO, ServerPacket.UPDATE_STAT, ServerPacket.PROJECTILE_SPAWN, ServerPacket.IF_SETNPCHEAD_ACTIVE, ServerPacket.CHAT_FILTER_SETTINGS, ServerPacket.UPDATE_ZONE_PARTIAL_FOLLOWS_LEVEL, ServerPacket.UPDATE_FRIEND_CHAT_CHANNEL_FULL_V1, ServerPacket.SET_PRIVCHATMODE, ServerPacket.RESET_CLIENT_VARCACHE, ServerPacket.MESSAGE_PRIVATE_ECHO, ServerPacket.field3549, ServerPacket.IF_SET_PLAYERMODEL_OBJ, ServerPacket.CAM_SETANGLE, ServerPacket.MIDI_SONG, ServerPacket.CLAN_CHANNEL_DELTA, ServerPacket.UPDATE_IGNORELIST, ServerPacket.MESSAGE_PRIVATE, ServerPacket.MINIMAP_TOGGLE, ServerPacket.LOC_MERGEPLAYER, ServerPacket.MESSAGE_FRIEND_CHANNEL, ServerPacket.UPDATE_ZONE_FULL_FOLLOWS, ServerPacket.IF_SET_PLAYERMODEL_SELF, ServerPacket.REFLECTION_CHECKER, ServerPacket.SET_NPC_UPDATE_ORIGIN, ServerPacket.UPDATE_INV_FULL, ServerPacket.UPDATE_FRIEND_CHAT_CHANNEL_SINGLE_USER, ServerPacket.CLEAR_ENTITIES, ServerPacket.IF_SET_TEXT, ServerPacket.field3567, ServerPacket.field3568, ServerPacket.OBJ_COUNT, ServerPacket.NPC_SET_SEQUENCE, ServerPacket.field3571, ServerPacket.NPC_INFO_SMALL_VIEWPORT, ServerPacket.field3573, ServerPacket.OBJ_RESET_CUSTOMIZATION, ServerPacket.RESET_INTERACTION_MODE, ServerPacket.NPC_INFO_LARGE_VIEWPORT, ServerPacket.field3505, ServerPacket.OBJ_SET_CUSTOMIZATION, ServerPacket.field3453};
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZI)I",
		garbageValue = "-1281370951"
	)
	static int method5988(int var0, Script var1, boolean var2) {
		Widget var3 = ClanChannel.widgetDefinition.method7031(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETX) {
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETY) {
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) {
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.width;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.height * -1528330031;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) {
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) {
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}
}
