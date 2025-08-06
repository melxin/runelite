import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oz")
public class class386 {
	@ObfuscatedName("ab")
	static final void method8193(long var0) {
		try {
			Thread.sleep(var0);
		} catch (InterruptedException var3) {
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IZI)[B",
		garbageValue = "-138746386"
	)
	@Export("ByteArrayPool_getArrayBool")
	public static byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
		synchronized(ByteArrayPool.field5210) {
			byte[] var3;
			if ((var0 == 100 || var0 < 100 && var1) && ByteArrayPool.ByteArrayPool_smallCount > 0) {
				var3 = ByteArrayPool.ByteArrayPool_small[--ByteArrayPool.ByteArrayPool_smallCount];
				ByteArrayPool.ByteArrayPool_small[ByteArrayPool.ByteArrayPool_smallCount] = null;
				return var3;
			}

			if ((var0 == 5000 || var0 < 5000 && var1) && ByteArrayPool.ByteArrayPool_mediumCount > 0) {
				var3 = ByteArrayPool.ByteArrayPool_medium[--ByteArrayPool.ByteArrayPool_mediumCount];
				ByteArrayPool.ByteArrayPool_medium[ByteArrayPool.ByteArrayPool_mediumCount] = null;
				return var3;
			}

			if ((var0 == 10000 || var0 < 10000 && var1) && ByteArrayPool.ByteArrayPool_largeCount > 0) {
				var3 = ByteArrayPool.ByteArrayPool_large[--ByteArrayPool.ByteArrayPool_largeCount];
				ByteArrayPool.ByteArrayPool_large[ByteArrayPool.ByteArrayPool_largeCount] = null;
				return var3;
			}

			if ((var0 == 30000 || var0 < 30000 && var1) && ByteArrayPool.field5206 > 0) {
				var3 = ByteArrayPool.field5219[--ByteArrayPool.field5206];
				ByteArrayPool.field5219[ByteArrayPool.field5206] = null;
				return var3;
			}

			int var6;
			if (WorldMapData_1.ByteArrayPool_arrays != null) {
				for (var6 = 0; var6 < class566.ByteArrayPool_alternativeSizes.length; ++var6) {
					if ((class566.ByteArrayPool_alternativeSizes[var6] == var0 || var0 < class566.ByteArrayPool_alternativeSizes[var6] && var1) && FriendSystem.ByteArrayPool_altSizeArrayCounts[var6] > 0) {
						byte[] var4 = WorldMapData_1.ByteArrayPool_arrays[var6][--FriendSystem.ByteArrayPool_altSizeArrayCounts[var6]];
						WorldMapData_1.ByteArrayPool_arrays[var6][FriendSystem.ByteArrayPool_altSizeArrayCounts[var6]] = null;
						return var4;
					}
				}
			}

			if (var1 && class566.ByteArrayPool_alternativeSizes != null) {
				for (var6 = 0; var6 < class566.ByteArrayPool_alternativeSizes.length; ++var6) {
					if (var0 <= class566.ByteArrayPool_alternativeSizes[var6] && FriendSystem.ByteArrayPool_altSizeArrayCounts[var6] < WorldMapData_1.ByteArrayPool_arrays[var6].length) {
						return new byte[class566.ByteArrayPool_alternativeSizes[var6]];
					}
				}
			}
		}

		return new byte[var0];
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZLjava/lang/String;ZB)V",
		garbageValue = "-5"
	)
	static void method8196(String var0, boolean var1, String var2, boolean var3) {
		if (var1) {
			if (!var3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
				try {
					Desktop.getDesktop().browse(new URI(var0));
					return;
				} catch (Exception var5) {
				}
			}

			if (class31.field146.startsWith("win") && !var3) {
				class157.method3868(var0, 0, "openjs");
				return;
			}

			if (class31.field146.startsWith("mac")) {
				class157.method3868(var0, 1, var2);
				return;
			}

			class157.method3868(var0, 2, "openjs");
		} else {
			class157.method3868(var0, 3, "openjs");
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/security/SecureRandom;",
		garbageValue = "2141031864"
	)
	static SecureRandom method8197() {
		SecureRandom var0 = new SecureRandom();
		var0.nextInt();
		return var0;
	}

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "336675399"
	)
	static final void method8195(int var0, int var1) {
		if (Client.menu.menuOptionsCount >= 2 || Client.isItemSelected != 0 || Client.isSpellSelected) {
			if (Client.showMouseOverText) {
				int var2 = Client.menu.menuOptionsCount - 1;
				String var4;
				if (Client.isItemSelected == 1 && Client.menu.menuOptionsCount < 2) {
					var4 = "Use" + " " + Client.field501 + " " + "->";
				} else if (Client.isSpellSelected && Client.menu.menuOptionsCount < 2) {
					var4 = Client.selectedSpellActionName + " " + Client.selectedSpellName + " " + "->";
				} else {
					var4 = Client.menu.method11858(var2);
				}

				if (Client.menu.menuOptionsCount > 2) {
					var4 = var4 + ObjectSound.colorStartTag(16777215) + " " + '/' + " " + (Client.menu.menuOptionsCount - 2) + " more options";
				}

				HttpJsonRequestBody.fontBold12.drawRandomAlphaAndSpacing(var4, var0 + 4, var1 + 15, 16777215, 0, Client.cycle / 1000);
			}
		}
	}
}
