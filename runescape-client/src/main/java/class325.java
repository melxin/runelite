import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mx")
public class class325 {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	public static final class325 field3484;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	public static final class325 field3485;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	public static final class325 field3486;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	public static final class325 field3496;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	public static final class325 field3487;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	public static final class325 field3489;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	public static final class325 field3490;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	public static final class325 field3491;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	public static final class325 field3488;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	public static final class325 field3493;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	public static final class325 field3494;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	public static final class325 field3495;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	public static final class325 field3492;
	@ObfuscatedName("ix")
	@ObfuscatedGetter(
		intValue = -681491085
	)
	static int field3498;

	static {
		field3484 = new class325(7);
		field3485 = new class325(7);
		field3486 = new class325(17);
		field3496 = new class325(2);
		field3487 = new class325(-2);
		field3489 = new class325(4);
		field3490 = new class325(14);
		field3491 = new class325(20);
		field3488 = new class325(11);
		field3493 = new class325(4);
		field3494 = new class325(7);
		field3495 = new class325(6);
		field3492 = new class325(14);
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "7"
	)
	class325(int var1) {
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ldj;[BIIIIIIIIII)V",
		garbageValue = "-620357310"
	)
	static final void method6545(WorldView var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		CollisionMap[] var11 = var0.collisionMaps;
		int var13;
		int var14;
		int var15;
		int var17;
		int var18;
		if (var11 != null && var2 >= 0 && var2 < var11.length) {
			CollisionMap var12 = var11[var2];
			var13 = var3 - var12.xInset;
			var14 = var4 - var12.yInset;

			for (var15 = 0; var15 < 8; ++var15) {
				int var16 = var13 + var15;

				for (var17 = 0; var17 < 8; ++var17) {
					var18 = var14 + var17;
					if (var16 > 0 && var16 < var12.flags.length && var18 > 0 && var18 < var12.flags[var16].length) {
						int[] var10000 = var12.flags[var16];
						var10000[var18] &= -1073741825;
					}
				}
			}
		}

		Buffer var25 = new Buffer(var1);

		for (var13 = 0; var13 < 4; ++var13) {
			for (var14 = 0; var14 < 64; ++var14) {
				for (var15 = 0; var15 < 64; ++var15) {
					if (var5 == var13 && var14 >= var6 && var14 < var6 + 8 && var15 >= var7 && var15 < var7 + 8) {
						var18 = var14 & 7;
						int var19 = var15 & 7;
						int var20 = var8 & 3;
						if (var20 == 0) {
							var17 = var18;
						} else if (var20 == 1) {
							var17 = var19;
						} else if (var20 == 2) {
							var17 = 7 - var18;
						} else {
							var17 = 7 - var19;
						}

						int var21 = var3 + var17;
						int var22 = var4 + class160.method3638(var14 & 7, var15 & 7, var8);
						int var23 = var3 + (var14 & 7) + var9;
						int var24 = var10 + (var15 & 7) + var4;
						class232.loadTerrain(var0, var25, var2, var21, var22, var23, var24, var8);
					} else {
						class232.loadTerrain(var0, var25, 0, -1, -1, 0, 0, 0);
					}
				}
			}
		}

	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "715852147"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) {
			if (Client.gameState == 30) {
				Client.field654.method5641();
			}

			if (Client.gameState == 0) {
				SecureRandomCallable.client.method528();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) {
				VarcInt.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
				Client.field591 = 0;
				Client.field592 = 0;
				Client.timer.method7590(var0);
				if (var0 != 20) {
					Client.authenticationScheme = Renderable.clientPreferences.containsKey(Login.Login_username) ? AuthenticationScheme.USERNAME_PASSWORD_REMEMBER : AuthenticationScheme.USERNAME_PASSWORD;
				}
			}

			if (var0 != 20 && var0 != 40 && class329.field3664 != null) {
				class329.field3664.close();
				class329.field3664 = null;
			}

			if (Client.gameState == 25) {
				Client.field599 = 0;
				Client.field631 = 0;
				Client.field601 = 1;
				Client.field597 = 0;
				Client.field549 = 1;
			}

			int var2;
			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					var2 = Client.gameState == 11 ? 4 : 0;
					JagexCache.method4808(FloorDecoration.archive10, class357.archive8, class157.field1768, false, var2);
				} else if (var0 == 11) {
					JagexCache.method4808(FloorDecoration.archive10, class357.archive8, class157.field1768, false, 4);
				} else if (var0 == 50) {
					TileItem.setLoginResponseString("", "Updating date of birth...", "");
					JagexCache.method4808(FloorDecoration.archive10, class357.archive8, class157.field1768, false, 7);
				} else if (var0 != 0 && ItemContainer.clearLoginScreen) {
					ModeWhere.titleboxSprite = null;
					class153.titlebuttonSprite = null;
					Login.runesSprite = null;
					SequenceDefinition.leftTitleSprite = null;
					FloorOverlayDefinition.rightTitleSprite = null;
					WorldMapDecorationType.logoSprite = null;
					ClanChannelMember.title_muteSprite = null;
					class147.options_buttons_0Sprite = null;
					class279.options_buttons_2Sprite = null;
					class222.worldSelectBackSprites = null;
					Interpreter.worldSelectFlagSprites = null;
					UserComparator9.worldSelectArrows = null;
					Login.worldSelectStars = null;
					FriendsChat.field5123 = null;
					WorldMapLabelSize.loginScreenRunesAnimation.method2709();
					MenuAction.method2254(0, 100);
					JagNetThread var1 = ClanSettings.field1791;
					var1.method7787(true);
					ItemContainer.clearLoginScreen = false;
				}
			} else {
				var2 = TriBool.method9327() ? 0 : 12;
				JagexCache.method4808(FloorDecoration.archive10, class357.archive8, class157.field1768, true, var2);
			}

			Client.gameState = var0;
		}
	}
}
