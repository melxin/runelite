import java.lang.management.GarbageCollectorMXBean;
import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nx")
public class class356 {
	@ObfuscatedName("bd")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	UrlRequest field3793;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lvr;"
	)
	SpritePixels field3794;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lel;)V"
	)
	class356(String var1, UrlRequester var2) {
		try {
			this.field3793 = var2.request(new URL(var1));
		} catch (MalformedURLException var4) {
			this.field3793 = null;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Lem;)V"
	)
	class356(UrlRequest var1) {
		this.field3793 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lvr;",
		garbageValue = "142746837"
	)
	SpritePixels method6892() {
		if (this.field3794 == null && this.field3793 != null && this.field3793.isDone()) {
			if (this.field3793.getResponse() != null) {
				this.field3794 = World.readSpritePixelsFromBytes(this.field3793.getResponse());
			}

			this.field3793 = null;
		}

		return this.field3794;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([BIII)Ljava/lang/String;",
		garbageValue = "-1985153851"
	)
	public static String method6891(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2];
		int var4 = 0;
		int var5 = var1;

		int var8;
		for (int var6 = var2 + var1; var5 < var6; var3[var4++] = (char)var8) {
			int var7 = var0[var5++] & 255;
			if (var7 < 128) {
				if (var7 == 0) {
					var8 = 65533;
				} else {
					var8 = var7;
				}
			} else if (var7 < 192) {
				var8 = 65533;
			} else if (var7 < 224) {
				if (var5 < var6 && (var0[var5] & 192) == 128) {
					var8 = (var7 & 31) << 6 | var0[var5++] & 63;
					if (var8 < 128) {
						var8 = 65533;
					}
				} else {
					var8 = 65533;
				}
			} else if (var7 < 240) {
				if (var5 + 1 < var6 && (var0[var5] & 192) == 128 && (var0[var5 + 1] & 192) == 128) {
					var8 = (var7 & 15) << 12 | (var0[var5++] & 63) << 6 | var0[var5++] & 63;
					if (var8 < 2048) {
						var8 = 65533;
					}
				} else {
					var8 = 65533;
				}
			} else if (var7 < 248) {
				if (var5 + 2 < var6 && (var0[var5] & 192) == 128 && (var0[var5 + 1] & 192) == 128 && (var0[var5 + 2] & 192) == 128) {
					var8 = (var7 & 7) << 18 | (var0[var5++] & 63) << 12 | (var0[var5++] & 63) << 6 | var0[var5++] & 63;
					if (var8 >= 65536 && var8 <= 1114111) {
						var8 = 65533;
					} else {
						var8 = 65533;
					}
				} else {
					var8 = 65533;
				}
			} else {
				var8 = 65533;
			}
		}

		return new String(var3, 0, var4);
	}
}
