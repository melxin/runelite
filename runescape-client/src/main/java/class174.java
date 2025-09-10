import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gu")
public class class174 extends class167 {
	@ObfuscatedName("mv")
	@ObfuscatedGetter(
		intValue = -623256307
	)
	@Export("cameraY")
	static int cameraY;
	@ObfuscatedName("af")
	String field1935;
	@ObfuscatedName("aw")
	byte field1936;
	@ObfuscatedName("at")
	byte field1937;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lga;"
	)
	final class168 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lga;)V"
	)
	class174(class168 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)V",
		garbageValue = "1665789280"
	)
	void vmethod4108(Buffer var1) {
		this.field1935 = var1.readStringCp1252NullTerminatedOrNull();
		if (this.field1935 != null) {
			var1.readUnsignedByte();
			this.field1936 = var1.readByte();
			this.field1937 = var1.readByte();
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgm;I)V",
		garbageValue = "-358275379"
	)
	void vmethod4104(ClanChannel var1) {
		var1.name = this.field1935;
		if (this.field1935 != null) {
			var1.field1917 = this.field1936;
			var1.field1921 = this.field1937;
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)[Lmh;",
		garbageValue = "1508631927"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.VARP_SMALL, ServerPacket.MIDI_SONG, ServerPacket.field3684, ServerPacket.IF_SET_PLAYERMODEL_OBJ, ServerPacket.IF_SET_PLAYERMODEL_BODYTYPE, ServerPacket.IF_SETSCROLLPOS, ServerPacket.OBJ_ADD, ServerPacket.CAM_SETANGLE, ServerPacket.UPDATE_REBOOT_TIMER, ServerPacket.UPDATE_STOCKMARKET_SLOT, ServerPacket.CAM_MOVE_TO, ServerPacket.IF_SETOBJECT, ServerPacket.IF_SETPOSITION, ServerPacket.IF_SET_ROTATE_SPEED, ServerPacket.UPDATE_FRIEND_CHAT_CHANNEL_SINGLE_USER, ServerPacket.IF_SETHIDE, ServerPacket.UPDATE_INV_PARTIAL, ServerPacket.MESSAGE_GAME, ServerPacket.MIDI_SWAP, ServerPacket.UPDATE_ZONE_FULL_FOLLOWS, ServerPacket.RESET_ANIMS, ServerPacket.UPDATE_IGNORELIST, ServerPacket.IF_SETNPCHEAD, ServerPacket.VARP_LARGE, ServerPacket.UPDATE_ZONE_PARTIAL_FOLLOWS_LEVEL, ServerPacket.RUNCLIENTSCRIPT, ServerPacket.field3755, ServerPacket.UPDATE_FRIENDLIST, ServerPacket.IF_SETNPCHEAD_ACTIVE, ServerPacket.CLAN_SETTINGS_DELTA, ServerPacket.NPC_SET_SEQUENCE, ServerPacket.CLAN_SETTINGS_FULL, ServerPacket.OBJ_OPFILTER, ServerPacket.NPC_HEADICON_SPECIFIC, ServerPacket.MINIMAP_TOGGLE, ServerPacket.field3762, ServerPacket.RESET_INTERACTION_MODE, ServerPacket.REBUILD_NORMAL, ServerPacket.REBUILD_REGION, ServerPacket.HINT_ARROW, ServerPacket.CAM_LOOKAT, ServerPacket.LOC_DEL, ServerPacket.field3709, ServerPacket.MAP_ANIM, ServerPacket.URL_OPEN, ServerPacket.field3712, ServerPacket.IF_CLOSESUB, ServerPacket.LOC_ANIM, ServerPacket.CAM_RESET, ServerPacket.field3772, ServerPacket.MESSAGE_PRIVATE, ServerPacket.MINIMAP_FLAG_SET, ServerPacket.CAM_MODE, ServerPacket.PLAYER_SPOTANIM, ServerPacket.CLAN_CHANNEL_DELTA, ServerPacket.field3722, ServerPacket.IF_SET_PLAYERMODEL_BASECOLOUR, ServerPacket.IF_OPENSUB, ServerPacket.MIDI_SONG_WITH_SECONDARY, ServerPacket.CAM_SMOOTH_RESET, ServerPacket.field3696, ServerPacket.MESSAGE_FRIEND_PRIVATE, ServerPacket.HEAT_MAP, ServerPacket.PING_STATISTICS_REQUEST, ServerPacket.UPDATE_UID192, ServerPacket.OBJ_COUNT, ServerPacket.CAM_SHAKE, ServerPacket.UPDATE_RUN_WEIGHT, ServerPacket.UPDATE_INV_CLEAR, ServerPacket.IF_OPENTOP, ServerPacket.OCULUS_SYNC, ServerPacket.CAM_MOVETO_EASED_CIRCULAR, ServerPacket.VAR_CLAN_DISABLE, ServerPacket.LOC_ADD_CHANGE, ServerPacket.SET_PRIVCHATMODE, ServerPacket.LOGOUT_FULL, ServerPacket.VAR_CLAN_ENABLE, ServerPacket.SET_PLAYER_OP, ServerPacket.SYNC_CLIENT_VARCACHE, ServerPacket.field3746, ServerPacket.CHAT_FILTER_SETTINGS, ServerPacket.field3759, ServerPacket.IF_SET_TEXT, ServerPacket.CLAN_CHANNEL_FULL, ServerPacket.CAM_MOVETO, ServerPacket.VAR_CLAN, ServerPacket.IF_MOVESUB, ServerPacket.IF_SETANGLE, ServerPacket.UPDATE_RUN_ENERGY, ServerPacket.UPDATE_FRIEND_CHAT_CHANNEL_FULL_V1, ServerPacket.PLAYER_ANIM_SPECIFIC, ServerPacket.CAM_LOOKAT_EASED_ANGLE_RELATIVE, ServerPacket.GRAPHICSOBJECT_SPAWN, ServerPacket.REBUILD_WORLDENTITY, ServerPacket.NPC_INFO_SMALL_VIEWPORT, ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED, ServerPacket.REFLECTION_CHECKER, ServerPacket.UPDATE_TRADING_POST, ServerPacket.UPDATE_STAT, ServerPacket.MESSAGE_FRIENDS_CHAT, ServerPacket.IF_SETPLAYERHEAD, ServerPacket.CAM_LOOKAT_EASED_COORD, ServerPacket.LOGOUT, ServerPacket.CAM_TARGET, ServerPacket.EVENT_WORLDHOP, ServerPacket.TRIGGER_ONDIALOG_ABORT, ServerPacket.IF_SET_PLAYERMODEL_SELF, ServerPacket.SET_NPC_UPDATE_ORIGIN, ServerPacket.NPC_SPOTANIM, ServerPacket.MESSAGE_PRIVATE_ECHO, ServerPacket.FRIENDS_LIST_LOADED, ServerPacket.IF_SETANIM, ServerPacket.IF_SETMODEL, ServerPacket.MESSAGE_CLAN_CHANNEL_SYSTEM, ServerPacket.MIDI_SONG_STOP, ServerPacket.NPC_INFO_LARGE_VIEWPORT, ServerPacket.SERVER_TICK_END, ServerPacket.field3784, ServerPacket.IF_SETCOLOUR, ServerPacket.UPDATE_INV_FULL, ServerPacket.LOC_MERGEPLAYER, ServerPacket.PLAYER_INFO, ServerPacket.OBJ_DEL, ServerPacket.DYNAMICOBJECT_SPAWN, ServerPacket.UPDATE_SITE_SETTINGS, ServerPacket.MIDI_JINGLE, ServerPacket.RESET_CLIENT_VARCACHE, ServerPacket.UPDATE_INV_STOP_TRANSIT, ServerPacket.field3795, ServerPacket.field3796, ServerPacket.OBJ_RESET_CUSTOMIZATION, ServerPacket.IF_SET_EVENTS, ServerPacket.field3763, ServerPacket.field3800, ServerPacket.IF_RESYNC, ServerPacket.PROJECTILE_SPAWN, ServerPacket.field3697, ServerPacket.field3717, ServerPacket.OBJ_SET_CUSTOMIZATION, ServerPacket.field3806, ServerPacket.SET_ACTIVE_WORLD};
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([BB)Llr;",
		garbageValue = "11"
	)
	static WorldMapSprite method4102(byte[] var0) {
		return var0 == null ? new WorldMapSprite() : new WorldMapSprite(class179.readSpritePixelsFromBytes(var0).pixels);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1677868753"
	)
	public static void method4109() {
		PlayerComposition.PlayerAppearance_cachedModels.clear();
		PlayerComposition.field4078.clearFiles();
		PlayerComposition.field4072 = 0;
	}
}
