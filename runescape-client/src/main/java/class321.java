import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mb")
public class class321 {
	@ObfuscatedName("an")
	@Export("userHomeDirectory")
	static String userHomeDirectory;

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)Ljava/lang/String;",
		garbageValue = "82"
	)
	public static String method6493(CharSequence var0) {
		int var1 = var0.length();
		StringBuilder var2 = new StringBuilder(var1);

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if ((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.' && var4 != '-' && var4 != '*' && var4 != '_') {
				if (var4 == ' ') {
					var2.append('+');
				} else {
					byte var5 = PcmPlayer.charToByteCp1252(var4);
					var2.append('%');
					int var6 = var5 >> 4 & 15;
					if (var6 >= 10) {
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48));
					}

					var6 = var5 & 15;
					if (var6 >= 10) {
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48));
					}
				}
			} else {
				var2.append(var4);
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "114"
	)
	public static boolean method6492(char var0) {
		if (var0 >= ' ' && var0 < 127 || var0 > 127 && var0 < 160 || var0 > 160 && var0 <= 255) {
			return true;
		} else {
			if (var0 != 0) {
				char[] var1 = class433.cp1252AsciiExtension;

				for (int var2 = 0; var2 < var1.length; ++var2) {
					char var3 = var1[var2];
					if (var0 == var3) {
						return true;
					}
				}
			}

			return false;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lbk;I)V",
		garbageValue = "750361994"
	)
	static void method6491(GameEngine var0) {
		IndexCheck var1 = PlayerUpdateManager.method2991();

		while (var1.method5597()) {
			if (var1.field3064 == 13) {
				ObjectComposition.method4205();
				return;
			}

			if (var1.field3064 == 96) {
				if (Login.worldSelectPage > 0 && class109.worldSelectLeftSprite != null) {
					--Login.worldSelectPage;
				}
			} else if (var1.field3064 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && WorldEntityCoord.worldSelectRightSprite != null) {
				++Login.worldSelectPage;
			}
		}

		if (MouseHandler.MouseHandler_lastButton == 1 || !class466.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
			int var2 = Login.xPadding + 280;
			if (MouseHandler.MouseHandler_lastPressedX >= var2 && MouseHandler.MouseHandler_lastPressedX <= var2 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				WorldEntityCoord.changeWorldSelectSorting(0, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var2 + 15 && MouseHandler.MouseHandler_lastPressedX <= var2 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				WorldEntityCoord.changeWorldSelectSorting(0, 1);
				return;
			}

			int var3 = Login.xPadding + 390;
			if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				WorldEntityCoord.changeWorldSelectSorting(1, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var3 + 15 && MouseHandler.MouseHandler_lastPressedX <= var3 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				WorldEntityCoord.changeWorldSelectSorting(1, 1);
				return;
			}

			int var4 = Login.xPadding + 500;
			if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				WorldEntityCoord.changeWorldSelectSorting(2, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				WorldEntityCoord.changeWorldSelectSorting(2, 1);
				return;
			}

			int var5 = Login.xPadding + 610;
			if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				WorldEntityCoord.changeWorldSelectSorting(3, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var5 + 15 && MouseHandler.MouseHandler_lastPressedX <= var5 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				WorldEntityCoord.changeWorldSelectSorting(3, 1);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) {
				ObjectComposition.method4205();
				return;
			}

			if (Login.hoveredWorldIndex != -1) {
				World var6 = GZipDecompressor.World_worlds[Login.hoveredWorldIndex];
				boolean var7 = class493.method9356(Client.worldProperties, class563.field5536);
				boolean var8 = var6.isDeadman();
				SecureRandomFuture.field1011 = var8;
				var6.field836 = var8 ? "beta" : var6.field836;
				ApproximateRouteStrategy.changeWorld(var6);
				ObjectComposition.method4205();
				if (var7 != var8) {
					ArchiveLoader.method2416();
				}

				return;
			}

			if (Login.worldSelectPage > 0 && class109.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= class109.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= SwapSongTask.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= SwapSongTask.canvasHeight / 2 + 50) {
				--Login.worldSelectPage;
			}

			if (Login.worldSelectPage < Login.worldSelectPagesCount && WorldEntityCoord.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= GameEngine.canvasWidth - WorldEntityCoord.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= GameEngine.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= SwapSongTask.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= SwapSongTask.canvasHeight / 2 + 50) {
				++Login.worldSelectPage;
			}
		}

	}
}
