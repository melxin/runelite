import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
public class class134 {
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -808607155
	)
	static int field1596;
	@ObfuscatedName("ft")
	static boolean field1592;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1994604433
	)
	int field1593;
	@ObfuscatedName("at")
	float field1597;
	@ObfuscatedName("ag")
	float field1594;
	@ObfuscatedName("an")
	float field1595;
	@ObfuscatedName("ae")
	float field1599;
	@ObfuscatedName("aj")
	float field1600;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	class134 field1598;

	class134() {
		this.field1594 = Float.MAX_VALUE;
		this.field1595 = Float.MAX_VALUE;
		this.field1599 = Float.MAX_VALUE;
		this.field1600 = Float.MAX_VALUE;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxa;II)V",
		garbageValue = "-1793120611"
	)
	void method3755(Buffer var1, int var2) {
		this.field1593 = var1.readShort();
		this.field1597 = var1.method11642();
		this.field1594 = var1.method11642();
		this.field1595 = var1.method11642();
		this.field1599 = var1.method11642();
		this.field1600 = var1.method11642();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)[Lmz;",
		garbageValue = "1"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.SERVER_TICK_END, ServerPacket.SET_PLAYER_OP, ServerPacket.UPDATE_REBOOT_TIMER, ServerPacket.REFLECTION_CHECKER, ServerPacket.URL_OPEN, ServerPacket.SET_PRIVCHATMODE, ServerPacket.LOC_DEL, ServerPacket.UPDATE_INV_CLEAR, ServerPacket.IF_OPENSUB, ServerPacket.MESSAGE_PRIVATE, ServerPacket.CAM_LOOKAT, ServerPacket.CAM_TARGET, ServerPacket.CAM_SETANGLE, ServerPacket.IF_SETCOLOUR, ServerPacket.UPDATE_IGNORELIST, ServerPacket.MIDI_SONG, ServerPacket.NPC_INFO_SMALL_VIEWPORT, ServerPacket.NPC_SET_SEQUENCE, ServerPacket.VARP_SMALL, ServerPacket.CAM_LOOKAT_EASED_COORD, ServerPacket.SYNTH_SOUND, ServerPacket.GRAPHICSOBJECT_SPAWN, ServerPacket.CAM_LOOKAT_EASED_ANGLE_RELATIVE, ServerPacket.MINIMAP_TOGGLE, ServerPacket.UPDATE_INV_STOP_TRANSIT, ServerPacket.MIDI_JINGLE, ServerPacket.PLAYER_SPOTANIM, ServerPacket.IF_SET_PLAYERMODEL_BASECOLOUR, ServerPacket.UPDATE_STAT, ServerPacket.IF_SETANIM, ServerPacket.MESSAGE_GAME, ServerPacket.LOGOUT, ServerPacket.MESSAGE_CLAN_CHANNEL_SYSTEM, ServerPacket.IF_RESYNC, ServerPacket.FRIENDS_LIST_LOADED, ServerPacket.TRIGGER_ONDIALOG_ABORT, ServerPacket.IF_SETPOSITION, ServerPacket.CAM_MODE, ServerPacket.IF_OPENTOP, ServerPacket.IF_SETSCROLLPOS, ServerPacket.MIDI_SWAP, ServerPacket.UPDATE_ZONE_PARTIAL_FOLLOWS_LEVEL, ServerPacket.IF_SETHIDE, ServerPacket.IF_MOVESUB, ServerPacket.HINT_ARROW, ServerPacket.UPDATE_FRIENDLIST, ServerPacket.LOC_ADD_CHANGE, ServerPacket.UPDATE_TRADING_POST, ServerPacket.NPC_INFO_LARGE_VIEWPORT, ServerPacket.IF_CLOSESUB, ServerPacket.UPDATE_STOCKMARKET_SLOT, ServerPacket.IF_SETMODEL, ServerPacket.RESET_INTERACTION_MODE, ServerPacket.IF_SET_ROTATE_SPEED, ServerPacket.UNKNOWN_STRING, ServerPacket.UPDATE_RUN_ENERGY, ServerPacket.CLAN_CHANNEL_DELTA, ServerPacket.IF_SETNPCHEAD_ACTIVE, ServerPacket.LOGOUT_FULL, ServerPacket.PROJECTILE_SPAWN, ServerPacket.CLAN_CHANNEL_FULL, ServerPacket.UPDATE_SITE_SETTINGS, ServerPacket.MINIMAP_FLAG_SET, ServerPacket.MESSAGE_FRIENDS_CHAT, ServerPacket.VAR_CLAN_ENABLE, ServerPacket.CLAN_SETTINGS_FULL, ServerPacket.SYNC_CLIENT_VARCACHE, ServerPacket.PLAYER_ANIM_SPECIFIC, ServerPacket.RESET_ANIMS, ServerPacket.NPC_SPOTANIM, ServerPacket.UPDATE_UID192, ServerPacket.REBUILD_NORMAL, ServerPacket.MESSAGE_PRIVATE_ECHO, ServerPacket.RESET_CLIENT_VARCACHE, ServerPacket.IF_SET_TEXT, ServerPacket.MIDI_SONG_WITH_SECONDARY, ServerPacket.SET_ACTIVE_WORLD, ServerPacket.IF_SETOBJECT, ServerPacket.LOC_ANIM, ServerPacket.IF_SET_PLAYERMODEL_SELF, ServerPacket.REBUILD_WORLDENTITY, ServerPacket.VAR_CLAN_DISABLE, ServerPacket.DYNAMICOBJECT_SPAWN, ServerPacket.HEAT_MAP, ServerPacket.UPDATE_INV_FULL, ServerPacket.UPDATE_ZONE_FULL_FOLLOWS, ServerPacket.CAM_SMOOTH_RESET, ServerPacket.CAM_SHAKE, ServerPacket.PLAYER_INFO, ServerPacket.CAM_RESET, ServerPacket.NPC_HEADICON_SPECIFIC, ServerPacket.SET_NPC_UPDATE_ORIGIN, ServerPacket.UPDATE_FRIEND_CHAT_CHANNEL_FULL_V1, ServerPacket.MESSAGE_FRIEND_PRIVATE, ServerPacket.CLAN_SETTINGS_DELTA, ServerPacket.REBUILD_REGION, ServerPacket.UPDATE_FRIEND_CHAT_CHANNEL_SINGLE_USER, ServerPacket.CAM_MOVETO, ServerPacket.EVENT_WORLDHOP, ServerPacket.CAM_MOVETO_EASED_CIRCULAR, ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED, ServerPacket.IF_SET_PLAYERMODEL_OBJ, ServerPacket.CAM_MOVE_TO, ServerPacket.UPDATE_RUN_WEIGHT, ServerPacket.PING_STATISTICS_REQUEST, ServerPacket.IF_SETPLAYERHEAD, ServerPacket.IF_SETANGLE, ServerPacket.VAR_CLAN, ServerPacket.MIDI_SONG_STOP, ServerPacket.IF_SET_PLAYERMODEL_BODYTYPE, ServerPacket.MAP_ANIM, ServerPacket.IF_SETNPCHEAD, ServerPacket.OCULUS_SYNC, ServerPacket.UPDATE_INV_PARTIAL, ServerPacket.CHAT_FILTER_SETTINGS, ServerPacket.LOC_MERGEPLAYER, ServerPacket.RUNCLIENTSCRIPT, ServerPacket.VARP_LARGE, ServerPacket.WORLDENTITY_INFO, ServerPacket.IF_SET_EVENTS, ServerPacket.field3778, ServerPacket.field3832, ServerPacket.field3833, ServerPacket.field3834, ServerPacket.field3835, ServerPacket.field3836, ServerPacket.field3837, ServerPacket.field3757, ServerPacket.field3839, ServerPacket.field3773, ServerPacket.field3804, ServerPacket.field3842, ServerPacket.field3843, ServerPacket.field3844, ServerPacket.field3768};
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([I[IIII)V",
		garbageValue = "-817675254"
	)
	public static void method3758(int[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			int var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;
			int var8 = var6 == Integer.MAX_VALUE ? 0 : 1;

			for (int var9 = var2; var9 < var3; ++var9) {
				if (var0[var9] < (var9 & var8) + var6) {
					int var10 = var0[var9];
					var0[var9] = var0[var5];
					var0[var5] = var10;
					int var11 = var1[var9];
					var1[var9] = var1[var5];
					var1[var5++] = var11;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method3758(var0, var1, var2, var5 - 1);
			method3758(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(Ldd;Lcr;I)V",
		garbageValue = "1878721480"
	)
	static final void method3760(WorldView var0, Actor var1) {
		Client.field315.method11277(var0, var1.x, var1.y, var1 == class330.localPlayer);
		int var2 = GrandExchangeOfferUnitPriceComparator.method8811(var1.poseAnimationSequence, 1, Client.field315);
		if ((var2 & 2) != 0) {
			var1.poseAnimationSequence.method9872();
		}

		var1.field1015.setSequence(var1.idleSequence);
		if (var1.poseAnimationSequence.method9874() > 0 && var1.field1015.method9874() < 30) {
			if (var1.poseAnimationSequence.getId() == var1.field1015.getId()) {
				var1.field1015.setSequence(var1.poseAnimationSequence);
			} else {
				int var3 = GrandExchangeOfferUnitPriceComparator.method8811(var1.field1015, 1, (class476)null);
				if ((var3 & 2) != 0) {
					var1.field1015.method9872();
				}
			}
		}

		IterableNodeHashTableIterator var7 = new IterableNodeHashTableIterator(var1.method2532());

		for (ActorSpotAnim var4 = (ActorSpotAnim)var7.method8854(); var4 != null; var4 = (ActorSpotAnim)var7.next()) {
			if (var4.id != -1 && Client.cycle >= var4.field5559) {
				AnimationSequence var5 = var4.animationSequence;
				if (!var5.isActive()) {
					var4.remove();
					--var1.graphicsCount;
				} else {
					int var6 = GrandExchangeOfferUnitPriceComparator.method8811(var5, 1, Client.field315);
					if ((var6 & 1) != 0) {
						var4.remove();
						--var1.graphicsCount;
					}
				}
			}
		}

		if (var1.animationSequence.isActive() && var1.field1017 <= 1) {
			SequenceDefinition var9 = var1.animationSequence.getSequenceDefinition();
			if (var9.field2498 == 1 && var1.field1075 > 0 && var1.spotAnimation <= Client.cycle && var1.field1057 < Client.cycle) {
				var1.field1017 = 1;
				return;
			}
		}

		if (var1.field1017 > 0) {
			--var1.field1017;
		} else {
			int var8 = GrandExchangeOfferUnitPriceComparator.method8811(var1.animationSequence, 1, Client.field315);
			if ((var8 & 2) != 0) {
				var1.animationSequence.reset();
			}
		}

		var1.isWalking = var1.animationSequence.isActive() && var1.animationSequence.getSequenceDefinition().field2486;
		Client.field315.method11278();
	}
}
