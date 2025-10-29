import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ri")
public class class452 {
	@ObfuscatedName("av")
	static char[] field5202;
	@ObfuscatedName("at")
	static char[] field5201;
	@ObfuscatedName("ag")
	static char[] field5204;
	@ObfuscatedName("an")
	static int[] field5200;
	@ObfuscatedName("ax")
	@Export("cacheDir")
	static File cacheDir;
	@ObfuscatedName("fh")
	static boolean field5203;

	static {
		field5202 = new char[64];

		int var0;
		for (var0 = 0; var0 < 26; ++var0) {
			field5202[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field5202[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field5202[var0] = (char)(var0 + 48 - 52);
		}

		field5202[62] = '+';
		field5202[63] = '/';
		field5201 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field5201[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field5201[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field5201[var0] = (char)(var0 + 48 - 52);
		}

		field5201[62] = '*';
		field5201[63] = '-';
		field5204 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field5204[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field5204[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field5204[var0] = (char)(var0 + 48 - 52);
		}

		field5204[62] = '-';
		field5204[63] = '_';
		field5200 = new int[128];

		for (var0 = 0; var0 < field5200.length; ++var0) {
			field5200[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) {
			field5200[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) {
			field5200[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) {
			field5200[var0] = var0 - 48 + 52;
		}

		int[] var2 = field5200;
		field5200[43] = 62;
		var2[42] = 62;
		int[] var1 = field5200;
		field5200[47] = 63;
		var1[45] = 63;
	}

	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "([Lof;IIIIIIZI)V",
		garbageValue = "-1999685430"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		for (int var8 = var1; var8 <= var2; ++var8) {
			Widget var9 = var0[var8];
			if (var9 != null && var3 == var9.parentId && var4 == var9.field4234) {
				class70.alignWidgetSize(var9, var5, var6, var7);
				Projectile.alignWidgetPosition(var9, var5, var6);
				if (var9.scrollX > var9.scrollWidth - var9.width * -1946208531) {
					var9.scrollX = var9.scrollWidth - var9.width * -1946208531;
				}

				if (var9.scrollX < 0) {
					var9.scrollX = 0;
				}

				if (var9.scrollY > var9.scrollHeight - var9.height * -905446999) {
					var9.scrollY = var9.scrollHeight - var9.height * -905446999;
				}

				if (var9.scrollY < 0) {
					var9.scrollY = 0;
				}

				if (var9.type == 0) {
					class339.revalidateWidgetScroll(var0, var9, var7);
				}
			}
		}

	}
}
