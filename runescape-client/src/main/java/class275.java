import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("km")
public class class275 {
	@ObfuscatedName("qz")
	@ObfuscatedGetter(
		intValue = -210513467
	)
	@Export("oculusOrbFocalPointZ")
	static int oculusOrbFocalPointZ;
	@ObfuscatedName("ap")
	final int[][] field3104;
	@ObfuscatedName("aj")
	final int[][] field3109;
	@ObfuscatedName("an")
	final int[] field3105;
	@ObfuscatedName("ai")
	final int[] field3106;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 558695873
	)
	final int field3107;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 2081998313
	)
	int field3110;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1747261115
	)
	int field3103;

	class275(int var1, int var2) {
		this.field3104 = new int[var1][var2];
		this.field3109 = new int[var1][var2];
		int var3 = var2 * var1;
		int var4 = HealthBarUpdate.method2362(var3 / 4);
		this.field3105 = new int[var4];
		this.field3106 = new int[var4];
		this.field3107 = var4 - 1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-84621152"
	)
	void method6014() {
		for (int var1 = 0; var1 < this.field3104.length; ++var1) {
			for (int var2 = 0; var2 < this.field3104[var1].length; ++var2) {
				this.field3104[var1][var2] = 0;
				this.field3109[var1][var2] = 99999999;
			}
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-593320468"
	)
	void method6010(int var1, int var2) {
		this.field3110 = var1;
		this.field3103 = var2;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "222184992"
	)
	int method6007() {
		return this.field3110;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-744024149"
	)
	int method6016() {
		return this.field3103;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "104"
	)
	int method6009() {
		return this.field3104.length;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "29"
	)
	int method6040() {
		return this.field3104[0].length;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)[[I",
		garbageValue = "-1929291318"
	)
	int[][] method6046() {
		return this.field3104;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)[[I",
		garbageValue = "1759102405"
	)
	int[][] method6012() {
		return this.field3109;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1879544417"
	)
	int[] method6005() {
		return this.field3105;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1879517047"
	)
	int[] method6022() {
		return this.field3106;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-591190651"
	)
	int method6008() {
		return this.field3107;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[Lmv;",
		garbageValue = "1995725684"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.VARP_SMALL, ServerPacket.CLAN_CHANNEL_FULL, ServerPacket.field3509, ServerPacket.VAR_CLAN_ENABLE, ServerPacket.field3511, ServerPacket.REFLECTION_CHECKER, ServerPacket.CLAN_SETTINGS_FULL, ServerPacket.LOC_ANIM, ServerPacket.CAM_MOVETO, ServerPacket.TRIGGER_ONDIALOG_ABORT, ServerPacket.UPDATE_ZONE_FULL_FOLLOWS, ServerPacket.UPDATE_ZONE_PARTIAL_FOLLOWS_LEVEL, ServerPacket.NPC_INFO_LARGE_VIEWPORT, ServerPacket.VARP_LARGE, ServerPacket.RESET_CLIENT_VARCACHE, ServerPacket.MESSAGE_FRIEND_PRIVATE, ServerPacket.UPDATE_INV_STOP_TRANSIT, ServerPacket.CAM_SMOOTH_RESET, ServerPacket.CLAN_CHANNEL_DELTA, ServerPacket.field3526, ServerPacket.LOC_ADD_CHANGE, ServerPacket.field3528, ServerPacket.OBJ_COUNT, ServerPacket.REBUILD_NORMAL, ServerPacket.IF_MOVESUB, ServerPacket.UPDATE_REBOOT_TIMER, ServerPacket.LOC_MERGEPLAYER, ServerPacket.UPDATE_FRIENDLIST, ServerPacket.REBUILD_REGION, ServerPacket.MESSAGE_CLAN_CHANNEL_SYSTEM, ServerPacket.MESSAGE_FRIENDS_CHAT, ServerPacket.MESSAGE_PRIVATE, ServerPacket.OBJ_OPFILTER, ServerPacket.field3540, ServerPacket.IF_SET_PLAYERMODEL_BASECOLOUR, ServerPacket.UPDATE_INV_PARTIAL, ServerPacket.RUNCLIENTSCRIPT, ServerPacket.field3544, ServerPacket.UPDATE_STAT, ServerPacket.CAM_LOOKAT_EASED_COORD, ServerPacket.SERVER_TICK_END, ServerPacket.IF_SETNPCHEAD, ServerPacket.field3549, ServerPacket.IF_SET_TEXT, ServerPacket.NPC_SPOTANIM, ServerPacket.NPC_SET_SEQUENCE, ServerPacket.SET_PRIVCHATMODE, ServerPacket.REBUILD_WORLDENTITY, ServerPacket.EVENT_WORLDHOP, ServerPacket.IF_SETANGLE, ServerPacket.IF_SETOBJECT, ServerPacket.MINIMAP_TOGGLE, ServerPacket.CAM_SHAKE, ServerPacket.IF_SETNPCHEAD_ACTIVE, ServerPacket.IF_SETSCROLLPOS, ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED, ServerPacket.field3563, ServerPacket.field3564, ServerPacket.IF_SETPLAYERHEAD, ServerPacket.HINT_ARROW, ServerPacket.IF_SETANIM, ServerPacket.IF_SETCOLOUR, ServerPacket.URL_OPEN, ServerPacket.UPDATE_UID192, ServerPacket.CAM_RESET, ServerPacket.field3572, ServerPacket.CAM_SETANGLE, ServerPacket.MIDI_JINGLE, ServerPacket.FRIENDS_LIST_LOADED, ServerPacket.PING_STATISTICS_REQUEST, ServerPacket.IF_SETMODEL, ServerPacket.UPDATE_SITE_SETTINGS, ServerPacket.HEAT_MAP, ServerPacket.OBJ_ADD, ServerPacket.MIDI_SWAP, ServerPacket.SET_PLAYER_OP, ServerPacket.SET_NPC_UPDATE_ORIGIN, ServerPacket.NPC_INFO_SMALL_VIEWPORT, ServerPacket.CAM_MOVE_TO, ServerPacket.IF_SET_EVENTS, ServerPacket.IF_OPENTOP, ServerPacket.field3553, ServerPacket.UPDATE_FRIEND_CHAT_CHANNEL_FULL_V1, ServerPacket.IF_SET_PLAYERMODEL_BODYTYPE, ServerPacket.IF_SET_PLAYERMODEL_OBJ, ServerPacket.IF_SET_ROTATE_SPEED, ServerPacket.VAR_CLAN_DISABLE, ServerPacket.IF_OPENSUB, ServerPacket.CLAN_SETTINGS_DELTA, ServerPacket.MIDI_SONG_STOP, ServerPacket.IF_CLOSESUB, ServerPacket.CAM_TARGET, ServerPacket.PLAYER_ANIM_SPECIFIC, ServerPacket.UPDATE_INV_FULL, ServerPacket.MINIMAP_FLAG_SET, ServerPacket.MESSAGE_GAME, ServerPacket.LOGOUT_FULL, ServerPacket.OCULUS_SYNC, ServerPacket.field3605, ServerPacket.CAM_LOOKAT_EASED_ANGLE_RELATIVE, ServerPacket.SYNC_CLIENT_VARCACHE, ServerPacket.UPDATE_IGNORELIST, ServerPacket.MAP_ANIM, ServerPacket.CAM_LOOKAT, ServerPacket.CAM_MOVETO_EASED_CIRCULAR, ServerPacket.IF_SET_PLAYERMODEL_SELF, ServerPacket.MIDI_SONG, ServerPacket.RESET_ANIMS, ServerPacket.IF_SETPOSITION, ServerPacket.OBJ_DEL, ServerPacket.PLAYER_SPOTANIM, ServerPacket.LOGOUT, ServerPacket.NPC_HEADICON_SPECIFIC, ServerPacket.VAR_CLAN, ServerPacket.PLAYER_INFO, ServerPacket.CAM_MODE, ServerPacket.MAP_PROJANIM, ServerPacket.UPDATE_INV_CLEAR, ServerPacket.GRAPHICSOBJECT_SPAWN, ServerPacket.UPDATE_STOCKMARKET_SLOT, ServerPacket.DYNAMICOBJECT_SPAWN, ServerPacket.UPDATE_FRIEND_CHAT_CHANNEL_FULL_V1, ServerPacket.MIDI_SONG_WITH_SECONDARY, ServerPacket.field3630, ServerPacket.PROJECTILE_SPAWN, ServerPacket.UPDATE_TRADING_POST, ServerPacket.LOC_DEL, ServerPacket.field3634, ServerPacket.RESET_INTERACTION_MODE, ServerPacket.OBJ_RESET_CUSTOMIZATION, ServerPacket.field3637, ServerPacket.field3638, ServerPacket.field3639, ServerPacket.OBJ_SET_CUSTOMIZATION, ServerPacket.field3641, ServerPacket.SET_ACTIVE_WORLD, ServerPacket.field3643};
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIIZIII)J",
		garbageValue = "1125419558"
	)
	@Export("calculateTag")
	public static long calculateTag(int var0, int var1, int var2, int var3, boolean var4, int var5, int var6) {
		long var7 = (long)((var1 & 127) << 0 | (var2 & 127) << 7 | (var0 & 3) << 14 | (var3 & 7) << 16) | ((long)var5 & 4294967295L) << 20 | ((long)var6 & 4095L) << 52;
		if (var4) {
			var7 |= 524288L;
		}

		return var7;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[Ljava/lang/Object;III)V",
		garbageValue = "-1027036201"
	)
	public static void method6047(String[] var0, Object[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			Object var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					Object var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method6047(var0, var1, var2, var5 - 1);
			method6047(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ltp;II)I",
		garbageValue = "1721632644"
	)
	public static int method6021(class509 var0, int var1) {
		class563 var2 = class563.field5600;
		DelayFadeTask.method9245(var0, var2, false);
		if (var1 >= 0) {
			int[] var3 = var0.method9965();
			int var4 = var0.method9937();

			for (int var5 = 0; var5 < var4; ++var5) {
				if (var1 < var3[var5]) {
					return var5;
				}

				var1 -= var3[var5];
			}
		}

		return -1;
	}
}
