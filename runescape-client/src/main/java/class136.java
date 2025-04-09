import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
public class class136 implements Enum {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	static final class136 field1613;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	static final class136 field1609;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	static final class136 field1617;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	static final class136 field1610;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	static final class136 field1611;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	static final class136 field1612;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1732097381
	)
	final int field1608;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -342959767
	)
	final int field1614;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1331588017
	)
	final int field1615;

	static {
		field1613 = new class136(0, 0, (String)null, 0);
		field1609 = new class136(1, 1, (String)null, 9);
		field1617 = new class136(2, 2, (String)null, 3);
		field1610 = new class136(3, 3, (String)null, 6);
		field1611 = new class136(4, 4, (String)null, 1);
		field1612 = new class136(5, 5, (String)null, 3);
	}

	class136(int var1, int var2, String var3, int var4) {
		this.field1608 = var1;
		this.field1614 = var2;
		this.field1615 = var4;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1746725635"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1614;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "211033770"
	)
	int method3352() {
		return this.field1615;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljm;",
		garbageValue = "7"
	)
	public static HealthBarDefinition method3355(int var0) {
		HealthBarDefinition var1 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var0);
			var1 = new HealthBarDefinition();
			var1.field2641 = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)[Lms;",
		garbageValue = "-282456144"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.SET_NPC_UPDATE_ORIGIN, ServerPacket.EVENT_WORLDHOP, ServerPacket.MINIMAP_FLAG_SET, ServerPacket.VAR_CLAN_DISABLE, ServerPacket.field3515, ServerPacket.UPDATE_INV_CLEAR, ServerPacket.IF_OPENSUB, ServerPacket.RESET_CLIENT_VARCACHE, ServerPacket.NPC_SPOTANIM, ServerPacket.HEAT_MAP, ServerPacket.UPDATE_INV_FULL, ServerPacket.IF_SETANIM, ServerPacket.NPC_INFO_SMALL_VIEWPORT, ServerPacket.field3551, ServerPacket.TRIGGER_ONDIALOG_ABORT, ServerPacket.FRIENDS_LIST_LOADED, ServerPacket.SET_PRIVCHATMODE, ServerPacket.IF_SETNPCHEAD, ServerPacket.UPDATE_FRIEND_CHAT_CHANNEL_SINGLE_USER, ServerPacket.IF_SETCOLOUR, ServerPacket.LOGOUT_FULL, ServerPacket.UPDATE_IGNORELIST, ServerPacket.REFLECTION_CHECKER, ServerPacket.PLAYER_INFO, ServerPacket.CAM_MOVETO, ServerPacket.MIDI_SWAP, ServerPacket.MIDI_SONG_STOP, ServerPacket.field3637, ServerPacket.CLAN_CHANNEL_DELTA, ServerPacket.MESSAGE_PRIVATE, ServerPacket.CAM_SETANGLE, ServerPacket.UPDATE_FRIEND_CHAT_CHANNEL_FULL_V1, ServerPacket.REBUILD_WORLDENTITY, ServerPacket.field3544, ServerPacket.field3545, ServerPacket.VARP_SMALL, ServerPacket.IF_CLOSESUB, ServerPacket.UPDATE_INV_PARTIAL, ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED, ServerPacket.LOGOUT, ServerPacket.field3575, ServerPacket.UPDATE_ZONE_FULL_FOLLOWS, ServerPacket.IF_MOVESUB, ServerPacket.MAP_ANIM, ServerPacket.CAM_MODE, ServerPacket.IF_SETOBJECT, ServerPacket.VAR_CLAN_ENABLE, ServerPacket.IF_SET_EVENTS, ServerPacket.IF_SET_PLAYERMODEL_OBJ, ServerPacket.IF_SETANGLE, ServerPacket.PLAYER_ANIM_SPECIFIC, ServerPacket.NPC_HEADICON_SPECIFIC, ServerPacket.PING_STATISTICS_REQUEST, ServerPacket.IF_RESYNC, ServerPacket.UPDATE_STOCKMARKET_SLOT, ServerPacket.field3538, ServerPacket.UPDATE_FRIENDLIST, ServerPacket.MIDI_SONG, ServerPacket.CAM_LOOKAT, ServerPacket.REBUILD_REGION, ServerPacket.IF_OPENTOP, ServerPacket.IF_SET_ROTATE_SPEED, ServerPacket.IF_SET_PLAYERMODEL_SELF, ServerPacket.DYNAMICOBJECT_SPAWN, ServerPacket.IF_SETMODEL, ServerPacket.CAM_RESET, ServerPacket.URL_OPEN, ServerPacket.CAM_MOVE_TO, ServerPacket.REBUILD_NORMAL, ServerPacket.LOC_MERGEPLAYER, ServerPacket.MESSAGE_FRIEND_PRIVATE, ServerPacket.MESSAGE_FRIENDS_CHAT, ServerPacket.LOC_ANIM, ServerPacket.MINIMAP_TOGGLE, ServerPacket.OBJ_ADD, ServerPacket.SET_PLAYER_OP, ServerPacket.HINT_ARROW, ServerPacket.field3511, ServerPacket.IF_SETNPCHEAD_ACTIVE, ServerPacket.field3620, ServerPacket.UPDATE_INV_STOP_TRANSIT, ServerPacket.MIDI_JINGLE, ServerPacket.VARP_LARGE, ServerPacket.MESSAGE_CLAN_CHANNEL_SYSTEM, ServerPacket.RUNCLIENTSCRIPT, ServerPacket.IF_SETPLAYERHEAD, ServerPacket.IF_SETPOSITION, ServerPacket.CLAN_SETTINGS_FULL, ServerPacket.SYNC_CLIENT_VARCACHE, ServerPacket.GRAPHICSOBJECT_SPAWN, ServerPacket.MESSAGE_GAME, ServerPacket.CAM_MOVETO_EASED_CIRCULAR, ServerPacket.OCULUS_SYNC, ServerPacket.IF_SETSCROLLPOS, ServerPacket.IF_SET_TEXT, ServerPacket.CAM_LOOKAT_EASED_COORD, ServerPacket.IF_SET_PLAYERMODEL_BODYTYPE, ServerPacket.PROJECTILE_SPAWN, ServerPacket.field3517, ServerPacket.NPC_SET_SEQUENCE, ServerPacket.MIDI_SONG_WITH_SECONDARY, ServerPacket.field3612, ServerPacket.field3613, ServerPacket.UPDATE_REBOOT_TIMER, ServerPacket.NPC_INFO_LARGE_VIEWPORT, ServerPacket.OBJ_DEL, ServerPacket.UPDATE_ZONE_PARTIAL_FOLLOWS_LEVEL, ServerPacket.CAM_SHAKE, ServerPacket.SERVER_TICK_END, ServerPacket.LOC_DEL, ServerPacket.PLAYER_SPOTANIM, ServerPacket.CAM_SMOOTH_RESET, ServerPacket.CAM_LOOKAT_EASED_ANGLE_RELATIVE, ServerPacket.OBJ_COUNT, ServerPacket.UPDATE_STAT, ServerPacket.UPDATE_SITE_SETTINGS, ServerPacket.field3627, ServerPacket.RESET_ANIMS, ServerPacket.UPDATE_UID192, ServerPacket.CLAN_SETTINGS_DELTA, ServerPacket.VAR_CLAN, ServerPacket.CLAN_CHANNEL_FULL, ServerPacket.OBJ_OPFILTER, ServerPacket.IF_SET_PLAYERMODEL_BASECOLOUR, ServerPacket.field3536, ServerPacket.UPDATE_TRADING_POST, ServerPacket.field3562, ServerPacket.MAP_PROJANIM, ServerPacket.field3588, ServerPacket.SET_ACTIVE_WORLD, ServerPacket.OBJ_RESET_CUSTOMIZATION, ServerPacket.RESET_INTERACTION_MODE, ServerPacket.field3594, ServerPacket.OBJ_SET_CUSTOMIZATION, ServerPacket.field3525};
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(Ldv;I)V",
		garbageValue = "853802620"
	)
	static void method3366(class94 var0) {
		if (Client.field611 != var0) {
			Client.field611 = var0;
		}
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Ldj;IIIIII)V",
		garbageValue = "-1177740039"
	)
	@Export("worldToScreen")
	static void worldToScreen(WorldView var0, int var1, int var2, int var3, int var4, int var5) {
		if (var1 >= 128 && 13056 >= var1 && var2 >= 128 && 13056 >= var2) {
			int var6 = GraphicsObject.getTileHeight(var0, var3, var4, var0.plane) - var5;
			var1 -= MusicPatchNode2.cameraX;
			var6 -= TaskHandler.cameraY;
			var2 -= SceneTilePaint.cameraZ;
			int var7 = Rasterizer3D.Rasterizer3D_sine[class258.cameraPitch];
			int var8 = Rasterizer3D.Rasterizer3D_cosine[class258.cameraPitch];
			int var9 = Rasterizer3D.Rasterizer3D_sine[AsyncHttpResponse.cameraYaw];
			int var10 = Rasterizer3D.Rasterizer3D_cosine[AsyncHttpResponse.cameraYaw];
			int var11 = var10 * var1 + var9 * var2 >> 16;
			var2 = var10 * var2 - var9 * var1 >> 16;
			var1 = var11;
			var11 = var6 * var8 - var7 * var2 >> 16;
			var2 = var8 * var2 + var7 * var6 >> 16;
			if (var2 >= 50) {
				Client.viewportTempX = Client.viewportWidth / 2 + Client.viewportZoom * var1 / var2;
				Client.viewportTempY = Client.viewportHeight / 2 + var11 * Client.viewportZoom / var2;
			} else {
				Client.viewportTempX = -1;
				Client.viewportTempY = -1;
			}

		} else {
			Client.viewportTempX = -1;
			Client.viewportTempY = -1;
		}
	}
}
