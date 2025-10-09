import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("og")
@Implements("Calendar")
public class Calendar {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	public static void method8180() {
		FileSystem.FileSystem_cacheFiles.clear();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "48"
	)
	public static String method8178(String var0) {
		int var1 = var0.length();
		char[] var2 = new char[var1];
		byte var3 = 2;

		for (int var4 = 0; var4 < var1; ++var4) {
			char var5 = var0.charAt(var4);
			if (var3 == 0) {
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) {
				var5 = class144.method3834(var5);
			}

			if (Character.isLetter(var5)) {
				var3 = 0;
			} else if (var5 != '.' && var5 != '?' && var5 != '!') {
				if (Character.isSpaceChar(var5)) {
					if (var3 != 2) {
						var3 = 1;
					}
				} else {
					var3 = 1;
				}
			} else {
				var3 = 2;
			}

			var2[var4] = var5;
		}

		return new String(var2);
	}

	@ObfuscatedName("mu")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "9280197"
	)
	static boolean method8179(int var0, int var1) {
		if (var1 >= 2000) {
			var1 -= 2000;
		}

		class514 var2 = Client.worldViewManager.method2417(var0);
		WorldEntity var3 = (WorldEntity)Client.worldViewManager.method2366().worldEntities.get((long)var0);
		boolean var4 = var0 == -1;
		boolean var5 = var0 == Client.currentWorldViewId;
		boolean var6 = false;
		if (var3 != null) {
			var6 = var3.method10185() != class391.field4828;
			if (!var5) {
				class377 var7 = var3.field5482.method4525();
				boolean var8 = var1 == 1002 || var1 == 1003 || var1 == 1004 || var1 == 1013;
				if (var8 && !var7.field4390) {
					return false;
				}

				boolean var10 = class323.method7033(var1);
				boolean var11;
				if (!var10) {
					var11 = var1 == 7 || var1 == 8 || var1 >= 9 && var1 <= 13;
					var10 = var11;
				}

				var11 = var10 || class199.method4474(var1);
				if (!var11) {
					boolean var12 = var1 >= 61 && var1 <= 67;
					var11 = var12;
				}

				if (var11 && !var7.field4391) {
					return false;
				}
			}
		}

		if (class323.method7033(var1) && !var2.method10391(var6, var4, var5)) {
			return false;
		} else if (class199.method4474(var1) && !var2.method10392(var6, var4, var5)) {
			return false;
		} else {
			boolean var13 = var1 == 7 || var1 == 8 || var1 >= 9 && var1 <= 13;
			if (var13 && !var2.method10393(var6, var4, var5)) {
				return false;
			} else if (DevicePcmPlayerProvider.method319(var1) && !var2.method10414(var6, var4, var5)) {
				return false;
			} else if (var1 == 1002 && !var2.method10413(var6, var4, var5)) {
				return false;
			} else if (var1 == 1004 && !var2.method10396(var6, var4, var5)) {
				return false;
			} else {
				return var1 != 1003 || var2.method10397(var6, var4, var5);
			}
		}
	}
}
