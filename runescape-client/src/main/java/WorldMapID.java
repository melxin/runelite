import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ll")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	static final WorldMapID field3318;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	static final WorldMapID field3316;
	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "[Lws;"
	)
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -935232197
	)
	@Export("value")
	final int value;

	static {
		field3318 = new WorldMapID(0);
		field3316 = new WorldMapID(1);
	}

	WorldMapID(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[Lmi;",
		garbageValue = "1656955259"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.CAM_RESET, ServerPacket.IF_OPENTOP, ServerPacket.LOGOUT_FULL, ServerPacket.IF_SET_PLAYERMODEL_SELF, ServerPacket.MESSAGE_PRIVATE_ECHO, ServerPacket.CLAN_CHANNEL_FULL, ServerPacket.MAP_ANIM, ServerPacket.LOC_ANIM, ServerPacket.UPDATE_STAT, ServerPacket.field3514, ServerPacket.NPC_INFO_LARGE_VIEWPORT, ServerPacket.PROJECTILE_SPAWN, ServerPacket.URL_OPEN, ServerPacket.UPDATE_STOCKMARKET_SLOT, ServerPacket.SET_PRIVCHATMODE, ServerPacket.MESSAGE_FRIEND_PRIVATE, ServerPacket.CAM_LOOKAT_EASED_COORD, ServerPacket.UPDATE_FRIENDLIST, ServerPacket.field3598, ServerPacket.field3524, ServerPacket.field3525, ServerPacket.CLAN_CHANNEL_DELTA, ServerPacket.IF_SETHIDE, ServerPacket.MIDI_SONG, ServerPacket.UPDATE_FRIEND_CHAT_CHANNEL_SINGLE_USER, ServerPacket.UPDATE_INV_FULL, ServerPacket.UPDATE_INV_PARTIAL, ServerPacket.RUNCLIENTSCRIPT, ServerPacket.VARP_LARGE, ServerPacket.IF_SETOBJECT, ServerPacket.MIDI_JINGLE, ServerPacket.CLAN_SETTINGS_DELTA, ServerPacket.MESSAGE_GAME, ServerPacket.MESSAGE_FRIENDS_CHAT, ServerPacket.field3539, ServerPacket.field3540, ServerPacket.field3541, ServerPacket.field3542, ServerPacket.CAM_SMOOTH_RESET, ServerPacket.field3544, ServerPacket.UPDATE_UID192, ServerPacket.LOC_MERGEPLAYER, ServerPacket.IF_SETPLAYERHEAD, ServerPacket.field3548, ServerPacket.IF_CLOSESUB, ServerPacket.IF_SETANIM, ServerPacket.CAM_MOVETO, ServerPacket.PING_STATISTICS_REQUEST, ServerPacket.field3516, ServerPacket.OCULUS_SYNC, ServerPacket.CAM_MOVETO_EASED_CIRCULAR, ServerPacket.IF_SET_PLAYERMODEL_BASECOLOUR, ServerPacket.UPDATE_INV_CLEAR, ServerPacket.IF_SET_TEXT, ServerPacket.IF_SETMODEL, ServerPacket.LOC_ADD_CHANGE, ServerPacket.IF_SETPOSITION, ServerPacket.NPC_SET_SEQUENCE, ServerPacket.MIDI_SONG_STOP, ServerPacket.PLAYER_INFO, ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED, ServerPacket.MIDI_SWAP, ServerPacket.IF_OPENSUB, ServerPacket.SET_PLAYER_OP, ServerPacket.VAR_CLAN_ENABLE, ServerPacket.UPDATE_REBOOT_TIMER, ServerPacket.UPDATE_ZONE_FULL_FOLLOWS, ServerPacket.UPDATE_IGNORELIST, ServerPacket.VAR_CLAN, ServerPacket.HEAT_MAP, ServerPacket.field3556, ServerPacket.IF_SETNPCHEAD_ACTIVE, ServerPacket.field3577, ServerPacket.MINIMAP_TOGGLE, ServerPacket.IF_SETSCROLLPOS, ServerPacket.PLAYER_SPOTANIM, ServerPacket.UPDATE_INV_STOP_TRANSIT, ServerPacket.SYNC_CLIENT_VARCACHE, ServerPacket.UPDATE_SITE_SETTINGS, ServerPacket.CAM_LOOKAT_EASED_ANGLE_RELATIVE, ServerPacket.MAP_PROJANIM, ServerPacket.NPC_SPOTANIM, ServerPacket.field3587, ServerPacket.field3596, ServerPacket.CAM_SHAKE, ServerPacket.field3632, ServerPacket.MESSAGE_CLAN_CHANNEL_SYSTEM, ServerPacket.CLAN_SETTINGS_FULL, ServerPacket.UPDATE_FRIEND_CHAT_CHANNEL_FULL_V1, ServerPacket.field3594, ServerPacket.CAM_LOOKAT, ServerPacket.UPDATE_TRADING_POST, ServerPacket.IF_SET_PLAYERMODEL_BODYTYPE, ServerPacket.field3559, ServerPacket.UPDATE_ZONE_PARTIAL_FOLLOWS_LEVEL, ServerPacket.IF_SETNPCHEAD, ServerPacket.OBJ_OPFILTER, ServerPacket.VAR_CLAN_DISABLE, ServerPacket.CAM_MOVE_TO, ServerPacket.OBJ_COUNT, ServerPacket.GRAPHICSOBJECT_SPAWN, ServerPacket.OBJ_DEL, ServerPacket.LOGOUT, ServerPacket.REBUILD_NORMAL, ServerPacket.IF_SETCOLOUR, ServerPacket.REFLECTION_CHECKER, ServerPacket.VARP_SMALL, ServerPacket.CAM_MODE, ServerPacket.REBUILD_REGION, ServerPacket.NPC_HEADICON_SPECIFIC, ServerPacket.OBJ_ADD, ServerPacket.LOC_DEL, ServerPacket.TRIGGER_ONDIALOG_ABORT, ServerPacket.IF_SETANGLE, ServerPacket.DYNAMICOBJECT_SPAWN, ServerPacket.IF_MOVESUB, ServerPacket.IF_RESYNC, ServerPacket.IF_SET_PLAYERMODEL_OBJ, ServerPacket.HINT_ARROW, ServerPacket.IF_SET_ROTATE_SPEED, ServerPacket.IF_SET_EVENTS, ServerPacket.SET_NPC_UPDATE_ORIGIN, ServerPacket.RESET_CLIENT_VARCACHE, ServerPacket.MESSAGE_PRIVATE, ServerPacket.field3580, ServerPacket.MIDI_SONG_WITH_SECONDARY, ServerPacket.EVENT_WORLDHOP, ServerPacket.CAM_SETANGLE, ServerPacket.NPC_INFO_SMALL_VIEWPORT, ServerPacket.REBUILD_WORLDENTITY, ServerPacket.SET_ACTIVE_WORLD, ServerPacket.field3636, ServerPacket.RESET_INTERACTION_MODE, ServerPacket.OBJ_SET_CUSTOMIZATION, ServerPacket.field3639, ServerPacket.OBJ_RESET_CUSTOMIZATION, ServerPacket.field3641};
	}
}
