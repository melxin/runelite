import java.awt.datatransfer.Clipboard;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nk")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1158581289
	)
	int field3882;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("table")
	MusicPatch table;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	MusicPatchNode2 field3885;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1615089617
	)
	int field3886;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1089515193
	)
	int field3887;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 874649561
	)
	int field3890;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1913295979
	)
	int field3891;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1413027855
	)
	int field3883;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1342034415
	)
	int field3881;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1165872531
	)
	int field3888;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1271971840
	)
	int field3892;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1129282007
	)
	int field3894;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1314859773
	)
	int field3895;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -982734551
	)
	int field3902;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -348890338
	)
	int field3893;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1052536693
	)
	int field3898;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1395429711
	)
	int field3899;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ldr;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1701510331
	)
	int field3901;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -413167881
	)
	int field3884;

	MusicPatchNode() {
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "64"
	)
	void method7349() {
		this.table = null;
		this.rawSound = null;
		this.field3885 = null;
		this.stream = null;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)[Lmt;",
		garbageValue = "0"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.CAM_MODE, ServerPacket.MIDI_SONG, ServerPacket.VARP_SMALL, ServerPacket.MIDI_SONG_WITH_SECONDARY, ServerPacket.NPC_INFO_SMALL_VIEWPORT, ServerPacket.UPDATE_INV_STOP_TRANSIT, ServerPacket.field3580, ServerPacket.UPDATE_INV_PARTIAL, ServerPacket.NPC_INFO_LARGE_VIEWPORT, ServerPacket.MIDI_JINGLE, ServerPacket.field3584, ServerPacket.PLAYER_SPOTANIM, ServerPacket.CAM_SMOOTH_RESET, ServerPacket.EVENT_WORLDHOP, ServerPacket.IF_SETNPCHEAD_ACTIVE, ServerPacket.IF_SET_PLAYERMODEL_BASECOLOUR, ServerPacket.field3668, ServerPacket.CAM_LOOKAT_EASED_COORD, ServerPacket.CAM_LOOKAT, ServerPacket.CLAN_SETTINGS_FULL, ServerPacket.RESET_ANIMS, ServerPacket.HEAT_MAP, ServerPacket.VAR_CLAN_ENABLE, ServerPacket.VARP_LARGE, ServerPacket.LOGOUT_FULL, ServerPacket.UPDATE_INV_FULL, ServerPacket.PLAYER_ANIM_SPECIFIC, ServerPacket.field3674, ServerPacket.UPDATE_STOCKMARKET_SLOT, ServerPacket.UPDATE_STAT, ServerPacket.OBJ_COUNT, ServerPacket.IF_SET_ROTATE_SPEED, ServerPacket.CAM_MOVETO_EASED_CIRCULAR, ServerPacket.CAM_RESET, ServerPacket.field3608, ServerPacket.PING_STATISTICS_REQUEST, ServerPacket.field3610, ServerPacket.VAR_CLAN, ServerPacket.LOC_ANIM, ServerPacket.field3664, ServerPacket.field3614, ServerPacket.IF_SETNPCHEAD, ServerPacket.MINIMAP_FLAG_SET, ServerPacket.field3635, ServerPacket.field3618, ServerPacket.IF_SETOBJECT, ServerPacket.LOGOUT, ServerPacket.REFLECTION_CHECKER, ServerPacket.UPDATE_FRIENDLIST, ServerPacket.MIDI_SONG_STOP, ServerPacket.IF_SETANGLE, ServerPacket.IF_SETSCROLLPOS, ServerPacket.IF_SETPOSITION, ServerPacket.MESSAGE_CLAN_CHANNEL_SYSTEM, ServerPacket.IF_MOVESUB, ServerPacket.SYNC_CLIENT_VARCACHE, ServerPacket.REBUILD_WORLDENTITY, ServerPacket.field3631, ServerPacket.UPDATE_INV_CLEAR, ServerPacket.UPDATE_ZONE_FULL_FOLLOWS, ServerPacket.SET_PRIVCHATMODE, ServerPacket.UPDATE_FRIEND_CHAT_CHANNEL_SINGLE_USER, ServerPacket.IF_SETPLAYERHEAD, ServerPacket.CAM_LOOKAT_EASED_ANGLE_RELATIVE, ServerPacket.MIDI_SWAP, ServerPacket.HINT_ARROW, ServerPacket.OCULUS_SYNC, ServerPacket.CAM_SETANGLE, ServerPacket.SET_NPC_UPDATE_ORIGIN, ServerPacket.MINIMAP_TOGGLE, ServerPacket.UPDATE_FRIEND_CHAT_CHANNEL_FULL_V1, ServerPacket.CAM_MOVE_TO, ServerPacket.IF_SET_PLAYERMODEL_OBJ, ServerPacket.IF_OPENTOP, ServerPacket.IF_CLOSESUB, ServerPacket.FRIENDS_LIST_LOADED, ServerPacket.NPC_SET_SEQUENCE, ServerPacket.UPDATE_IGNORELIST, ServerPacket.NPC_HEADICON_SPECIFIC, ServerPacket.CAM_MOVETO, ServerPacket.RESET_INTERACTION_MODE, ServerPacket.URL_OPEN, ServerPacket.UPDATE_ZONE_PARTIAL_FOLLOWS_LEVEL, ServerPacket.UPDATE_REBOOT_TIMER, ServerPacket.RESET_CLIENT_VARCACHE, ServerPacket.field3659, ServerPacket.IF_SET_PLAYERMODEL_SELF, ServerPacket.VAR_CLAN_DISABLE, ServerPacket.MAP_ANIM, ServerPacket.MESSAGE_PRIVATE, ServerPacket.CAM_TARGET, ServerPacket.CLAN_CHANNEL_DELTA, ServerPacket.SERVER_TICK_END, ServerPacket.UPDATE_TRADING_POST, ServerPacket.DYNAMICOBJECT_SPAWN, ServerPacket.field3686, ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED, ServerPacket.CAM_SHAKE, ServerPacket.IF_SETMODEL, ServerPacket.IF_SETANIM, ServerPacket.REBUILD_REGION, ServerPacket.field3675, ServerPacket.MESSAGE_PRIVATE_ECHO, ServerPacket.field3677, ServerPacket.field3669, ServerPacket.GRAPHICSOBJECT_SPAWN, ServerPacket.LOC_DEL, ServerPacket.OBJ_DEL, ServerPacket.MESSAGE_FRIEND_PRIVATE, ServerPacket.MESSAGE_GAME, ServerPacket.IF_SETCOLOUR, ServerPacket.SET_PLAYER_OP, ServerPacket.REBUILD_NORMAL, ServerPacket.IF_OPENSUB, ServerPacket.MESSAGE_FRIENDS_CHAT, ServerPacket.IF_SET_TEXT, ServerPacket.IF_SET_PLAYERMODEL_BODYTYPE, ServerPacket.UPDATE_UID192, ServerPacket.field3692, ServerPacket.RUNCLIENTSCRIPT, ServerPacket.NPC_SPOTANIM, ServerPacket.OBJ_ADD, ServerPacket.field3696, ServerPacket.CLAN_CHANNEL_FULL, ServerPacket.TRIGGER_ONDIALOG_ABORT, ServerPacket.UPDATE_SITE_SETTINGS, ServerPacket.PLAYER_INFO, ServerPacket.CLAN_SETTINGS_DELTA, ServerPacket.field3702, ServerPacket.field3703, ServerPacket.field3704, ServerPacket.IF_SET_EVENTS, ServerPacket.field3706, ServerPacket.SET_ACTIVE_WORLD, ServerPacket.OBJ_RESET_CUSTOMIZATION, ServerPacket.IF_RESYNC, ServerPacket.OBJ_SET_CUSTOMIZATION, ServerPacket.field3711, ServerPacket.PROJECTILE_SPAWN};
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Date;I)Z",
		garbageValue = "-701542832"
	)
	static boolean method7352(Date var0) {
		Date var1 = ModelData0.method5773();
		return var0.after(var1);
	}

	@ObfuscatedName("pp")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/awt/datatransfer/Clipboard;",
		garbageValue = "-30"
	)
	public static Clipboard method7350() {
		return Language.client.method531();
	}
}
