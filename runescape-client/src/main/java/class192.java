import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hm")
public class class192 extends DualNode {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("field2026")
	static EvictingDualNodeHashTable field2026;

	static {
		field2026 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lpx;Lpx;Lud;ZII)V",
		garbageValue = "-1143323137"
	)
	static void method4313(AbstractArchive var0, AbstractArchive var1, GraphicsDefaults var2, boolean var3, int var4) {
		if (class4.clearLoginScreen) {
			if (var4 == 4) {
				ClientPreferences.method2677(4);
			}

		} else {
			if (var4 == 0) {
				Varps.updateLoginStatusUsernameRemembered(var3);
			} else {
				ClientPreferences.method2677(var4);
			}

			Rasterizer2D.Rasterizer2D_clear();
			byte[] var5 = var0.takeFileByNames("title.jpg", "");
			Projectile.leftTitleSprite = class179.readSpritePixelsFromBytes(var5);
			class406.rightTitleSprite = Projectile.leftTitleSprite.mirrorHorizontally();
			UserComparator5.method3559(var1, Client.worldProperties);
			ConcurrentMidiTask.titleboxSprite = ArchiveLoader.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "");
			class199.titlebuttonSprite = ArchiveLoader.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "");
			World.field625 = ArchiveLoader.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", "");
			class205.field2257 = ArchiveLoader.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", "");
			ArchiveLoader.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", "");
			class447.runesSprite = class168.getFont(var1, "runes", "");
			Message.title_muteSprite = class168.getFont(var1, "title_mute", "");
			WorldMapArea.options_buttons_0Sprite = ArchiveLoader.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "");
			class386.field4416 = ArchiveLoader.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "");
			class199.options_buttons_2Sprite = ArchiveLoader.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "");
			class178.field1964 = ArchiveLoader.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "");
			class33.field174 = WorldMapArea.options_buttons_0Sprite.subWidth;
			class537.field5577 = WorldMapArea.options_buttons_0Sprite.subHeight;
			class155.loginScreenRunesAnimation = new LoginScreenAnimation(class447.runesSprite, var2.field5535);
			if (var3) {
				Login.Login_username = "";
				Login.Login_password = "";
				Login.field739 = new String[8];
				Login.field738 = 0;
			}

			ScriptFrame.otpMedium = 0;
			class464.otp = "";
			Login.rememberUsername = true;
			Login.worldSelectOpen = false;
			if (class36.clientPreferences.isTitleMusicDisabled()) {
				class257.method5884(0, 0);
			} else {
				class257.method5884(0, 0);
				ArrayList var6 = new ArrayList();
				var6.add(new MidiRequest(WidgetDefinition.field4042, "scape main", "", 255, false));
				Clock.method6081(var6, 0, 0, 0, 100, false);
			}

			class159.method3892();
			JagNetThread var7 = WorldMapSectionType.field3418;
			var7.method8436(false);
			class4.clearLoginScreen = true;
			Login.xPadding = (GameEngine.canvasWidth - 765) / 2;
			Login.loginBoxX = Login.xPadding + 202;
			class294.loginBoxCenter = Login.loginBoxX + 180;
			Projectile.leftTitleSprite.drawAt(Login.xPadding, 0);
			class406.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			class139.logoSprite.drawAt(Login.xPadding + 382 - class139.logoSprite.subWidth / 2, 18);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Loi;I[B[BI)V",
		garbageValue = "1415544479"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field4223 == null) {
			if (var2 == null) {
				return;
			}

			var0.field4223 = new byte[11][];
			var0.field4224 = new byte[11][];
			var0.field4220 = new int[11];
			var0.field4233 = new int[11];
		}

		var0.field4223[var1] = var2;
		if (var2 != null) {
			var0.field4222 = true;
		} else {
			var0.field4222 = false;

			for (int var4 = 0; var4 < var0.field4223.length; ++var4) {
				if (var0.field4223[var4] != null) {
					var0.field4222 = true;
					break;
				}
			}
		}

		var0.field4224[var1] = var3;
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(Ldr;Ltj;ZI)V",
		garbageValue = "245502513"
	)
	static void method4314(WorldView var0, WorldEntity var1, boolean var2) {
		boolean var3 = var1.field5425.field2245 && !var2;
		long var4 = 0L;
		boolean var6 = var1.worldView.id == Client.currentWorldViewId;
		class398 var7 = var1.method10073(var6);
		boolean var8;
		if (var7 == class398.field4841) {
			var4 = UserComparator8.calculateTag(0, 0, 0, 5, false, 0, 0);
		} else if (var3 && var7 != class398.field4839) {
			var8 = var7 == class398.field4840;
			int var9 = var1.getX();
			int var11 = var1.getY();
			int var10 = var11 >> 7;
			int var14 = var1.getPlane();
			int var13 = var14 >> 7;
			var4 = UserComparator8.calculateTag(var9, var10, var13, 4, !var8, var1.plane, var0.id);
		}

		var1.worldEntityCoord.setZ(JagNetThread.getTileHeight(var0, var1.getY(), var1.getPlane(), var0.plane));
		var1.worldView.scene.cycle = Client.cycle;
		var1.initScenePlane(var2);
		var8 = var0.scene.drawEntity(var0.plane, var1.getY(), var1.getPlane(), var1.getZ(), 60, var1.worldView.scene, var1.method10110(), var4, false);
		if (var8 && !var2) {
			WorldView var15 = var1.worldView;
			if (Client.renderSelf) {
				class390.addPlayerToScene(var15, Client.localPlayerIndex, false);
			}

			WorldView var16 = var1.worldView;
			if (Client.combatTargetPlayerIndex >= 0 && var16.players.get((long)Client.combatTargetPlayerIndex) != null) {
				class390.addPlayerToScene(var16, Client.combatTargetPlayerIndex, false);
			}

			ModeWhere.addNpcsToScene(var1.worldView, class197.field2163);
			NPC.method2772(var1.worldView);
			ModeWhere.addNpcsToScene(var1.worldView, class197.field2162);
			ModeWhere.addNpcsToScene(var1.worldView, class197.field2164);
			WorldView var17 = var1.worldView;

			for (GraphicsObject var18 = (GraphicsObject)var17.graphicsObjects.last(); var18 != null; var18 = (GraphicsObject)var17.graphicsObjects.previous()) {
				if (var17.plane == var18.plane && !var18.method1874()) {
					if (Client.cycle >= var18.cycleStart) {
						var18.advance(Client.graphicsCycle);
						if (var18.method1874()) {
							var18.remove();
						} else {
							var17.scene.drawEntity(var18.plane, var18.x, var18.y, var18.z, 60, var18, 0, -1L, false);
						}
					}
				} else {
					var18.remove();
				}
			}
		}

	}
}
