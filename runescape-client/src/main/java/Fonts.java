import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ve")
@Implements("Fonts")
public class Fonts {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("spritesArchive")
	AbstractArchive spritesArchive;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("fontsArchive")
	AbstractArchive fontsArchive;
	@ObfuscatedName("ag")
	@Export("map")
	HashMap map;

	@ObfuscatedSignature(
		descriptor = "(Lpe;Lpe;)V"
	)
	public Fonts(AbstractArchive var1, AbstractArchive var2) {
		this.spritesArchive = var1;
		this.fontsArchive = var2;
		this.map = new HashMap();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([Lvq;I)Ljava/util/HashMap;",
		garbageValue = "-840625918"
	)
	@Export("createMap")
	public HashMap createMap(FontName[] var1) {
		HashMap var2 = new HashMap();
		FontName[] var3 = var1;

		for (int var4 = 0; var4 < var3.length; ++var4) {
			FontName var5 = var3[var4];
			if (this.map.containsKey(var5)) {
				var2.put(var5, this.map.get(var5));
			} else {
				AbstractArchive var7 = this.spritesArchive;
				AbstractArchive var8 = this.fontsArchive;
				String var9 = var5.name;
				Font var6;
				if (!var7.isValidFileName(var9, "")) {
					var6 = null;
				} else {
					int var10 = var7.getGroupId(var9);
					int var11 = var7.getFileId(var10, "");
					var6 = class293.method6757(var7, var8, var10, var11);
				}

				if (var6 != null) {
					this.map.put(var5, var6);
					var2.put(var5, var6);
				}
			}
		}

		return var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(S)[Lmw;",
		garbageValue = "-4779"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.UPDATE_INV_FULL, ServerPacket.NPC_INFO_LARGE_VIEWPORT, ServerPacket.LOGOUT_FULL, ServerPacket.LOC_ANIM, ServerPacket.REBUILD_WORLDENTITY, ServerPacket.LOC_MERGEPLAYER, ServerPacket.NPC_HEADICON_SPECIFIC, ServerPacket.IF_OPENTOP, ServerPacket.LOC_DEL, ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED, ServerPacket.UPDATE_ZONE_FULL_FOLLOWS, ServerPacket.CAM_MODE, ServerPacket.field3688, ServerPacket.SYNC_CLIENT_VARCACHE, ServerPacket.EVENT_WORLDHOP, ServerPacket.CLAN_SETTINGS_DELTA, ServerPacket.UPDATE_IGNORELIST, ServerPacket.REBUILD_REGION, ServerPacket.REFLECTION_CHECKER, ServerPacket.PROJECTILE_SPAWN, ServerPacket.NPC_SET_SEQUENCE, ServerPacket.UPDATE_RUN_WEIGHT, ServerPacket.PLAYER_SPOTANIM, ServerPacket.IF_SETCOLOUR, ServerPacket.HINT_ARROW, ServerPacket.URL_OPEN, ServerPacket.UPDATE_INV_PARTIAL, ServerPacket.RESET_ANIMS, ServerPacket.LOGOUT, ServerPacket.UPDATE_REBOOT_TIMER, ServerPacket.UPDATE_ZONE_PARTIAL_FOLLOWS_LEVEL, ServerPacket.UPDATE_FRIEND_CHAT_CHANNEL_FULL_V1, ServerPacket.RUNCLIENTSCRIPT, ServerPacket.MINIMAP_TOGGLE, ServerPacket.MESSAGE_FRIEND_PRIVATE, ServerPacket.UPDATE_STAT, ServerPacket.PLAYER_ANIM_SPECIFIC, ServerPacket.IF_SETPOSITION, ServerPacket.field3714, ServerPacket.IF_SETOBJECT, ServerPacket.OCULUS_SYNC, ServerPacket.field3717, ServerPacket.IF_SET_PLAYERMODEL_BODYTYPE, ServerPacket.field3804, ServerPacket.HEAT_MAP, ServerPacket.VARP_SMALL, ServerPacket.MESSAGE_PRIVATE, ServerPacket.field3783, ServerPacket.CLAN_SETTINGS_FULL, ServerPacket.SERVER_TICK_END, ServerPacket.CAM_SHAKE, ServerPacket.IF_SETNPCHEAD, ServerPacket.IF_CLOSESUB, ServerPacket.IF_SETNPCHEAD_ACTIVE, ServerPacket.CAM_MOVE_TO, ServerPacket.MIDI_SONG_STOP, ServerPacket.IF_SETPLAYERHEAD, ServerPacket.IF_MOVESUB, ServerPacket.MINIMAP_FLAG_SET, ServerPacket.MIDI_JINGLE, ServerPacket.field3736, ServerPacket.UPDATE_UID192, ServerPacket.CAM_MOVETO, ServerPacket.UPDATE_INV_CLEAR, ServerPacket.CAM_SETANGLE, ServerPacket.field3741, ServerPacket.DYNAMICOBJECT_SPAWN, ServerPacket.MAP_ANIM, ServerPacket.field3676, ServerPacket.SET_PRIVCHATMODE, ServerPacket.RESET_CLIENT_VARCACHE, ServerPacket.VAR_CLAN_DISABLE, ServerPacket.FRIENDS_LIST_LOADED, ServerPacket.SET_PLAYER_OP, ServerPacket.UPDATE_FRIEND_CHAT_CHANNEL_SINGLE_USER, ServerPacket.TRIGGER_ONDIALOG_ABORT, ServerPacket.SYNTH_SOUND, ServerPacket.CHAT_FILTER_SETTINGS, ServerPacket.CLAN_CHANNEL_FULL, ServerPacket.LOC_ADD_CHANGE, ServerPacket.VAR_CLAN, ServerPacket.MESSAGE_CLAN_CHANNEL_SYSTEM, ServerPacket.REBUILD_NORMAL, ServerPacket.SET_NPC_UPDATE_ORIGIN, ServerPacket.PLAYER_INFO, ServerPacket.NPC_SPOTANIM, ServerPacket.UPDATE_RUN_ENERGY, ServerPacket.UPDATE_INV_STOP_TRANSIT, ServerPacket.IF_SET_PLAYERMODEL_SELF, ServerPacket.CLAN_CHANNEL_DELTA, ServerPacket.UNKNOWN_STRING, ServerPacket.field3785, ServerPacket.PING_STATISTICS_REQUEST, ServerPacket.IF_OPENSUB, ServerPacket.CAM_TARGET, ServerPacket.IF_SETANIM, ServerPacket.MESSAGE_PRIVATE_ECHO, ServerPacket.UPDATE_FRIENDLIST, ServerPacket.CAM_LOOKAT_EASED_ANGLE_RELATIVE, ServerPacket.CAM_LOOKAT, ServerPacket.IF_SETSCROLLPOS, ServerPacket.SET_ACTIVE_WORLD, ServerPacket.IF_SETHIDE, ServerPacket.MESSAGE_GAME, ServerPacket.IF_SET_PLAYERMODEL_BASECOLOUR, ServerPacket.GRAPHICSOBJECT_SPAWN, ServerPacket.CAM_RESET, ServerPacket.UPDATE_STOCKMARKET_SLOT, ServerPacket.IF_RESYNC, ServerPacket.IF_SET_TEXT, ServerPacket.RESET_INTERACTION_MODE, ServerPacket.MIDI_SONG_WITH_SECONDARY, ServerPacket.MIDI_SWAP, ServerPacket.IF_SET_PLAYERMODEL_OBJ, ServerPacket.VAR_CLAN_ENABLE, ServerPacket.IF_SETANGLE, ServerPacket.CAM_LOOKAT_EASED_COORD, ServerPacket.field3793, ServerPacket.MESSAGE_FRIENDS_CHAT, ServerPacket.UPDATE_TRADING_POST, ServerPacket.CAM_SMOOTH_RESET, ServerPacket.NPC_INFO_SMALL_VIEWPORT, ServerPacket.UPDATE_SITE_SETTINGS, ServerPacket.VARP_LARGE, ServerPacket.IF_SETMODEL, ServerPacket.CAM_MOVETO_EASED_CIRCULAR, ServerPacket.MIDI_SONG, ServerPacket.IF_SET_ROTATE_SPEED, ServerPacket.WORLDENTITY_INFO, ServerPacket.field3776, ServerPacket.IF_SET_EVENTS, ServerPacket.field3807, ServerPacket.field3808, ServerPacket.field3809, ServerPacket.field3737};
	}
}
