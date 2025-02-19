import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tv")
public class class511 extends class512 {
	public class511(int var1) {
		super(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvy;II)V",
		garbageValue = "-707800152"
	)
	void vmethod9557(Buffer var1, int var2) {
	}

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-4959"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) {
			if (Client.gameState == 30) {
				Client.field749.method5559();
			}

			if (Client.gameState == 0) {
				class569.client.method476();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) {
				class215.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
				Client.field595 = 0;
				Client.field551 = 0;
				Client.timer.method7546(var0);
				if (var0 != 20) {
					Projection.method5234(false);
				}
			}

			if (var0 != 20 && var0 != 40 && class280.field3142 != null) {
				class280.field3142.close();
				class280.field3142 = null;
			}

			if (Client.gameState == 25) {
				Client.field585 = 0;
				Client.field553 = 0;
				Client.field582 = 1;
				Client.field583 = 0;
				Client.field584 = 1;
			}

			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					int var4 = Client.gameState == 11 ? 4 : 0;
					class150.method3489(class6.archive10, PendingSpawn.archive8, class355.field3850, false, var4);
				} else if (var0 == 11) {
					class150.method3489(class6.archive10, PendingSpawn.archive8, class355.field3850, false, 4);
				} else if (var0 == 50) {
					class401.setLoginResponseString("", "Updating date of birth...", "");
					class150.method3489(class6.archive10, PendingSpawn.archive8, class355.field3850, false, 7);
				} else if (var0 != 0 && Login.clearLoginScreen) {
					Login.titleboxSprite = null;
					Login.titlebuttonSprite = null;
					Login.runesSprite = null;
					SoundCache.leftTitleSprite = null;
					class155.rightTitleSprite = null;
					class87.logoSprite = null;
					Login.title_muteSprite = null;
					WorldMapDecoration.options_buttons_0Sprite = null;
					class187.options_buttons_2Sprite = null;
					StructComposition.worldSelectBackSprites = null;
					NPCComposition.worldSelectFlagSprites = null;
					class342.worldSelectArrows = null;
					class72.worldSelectStars = null;
					class361.field3909 = null;
					FloorDecoration.loginScreenRunesAnimation.method2663();
					class177.method3764(0, 100);
					JagNetThread var1 = AsyncHttpResponse.field77;
					var1.method7744(true);
					Login.clearLoginScreen = false;
				}
			} else {
				boolean var3 = AbstractWorldMapIcon.clientPreferences.getEULA() >= Client.field515;
				int var2 = var3 ? 0 : 12;
				class150.method3489(class6.archive10, PendingSpawn.archive8, class355.field3850, true, var2);
			}

			Client.gameState = var0;
		}
	}
}
