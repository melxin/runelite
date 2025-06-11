import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oj")
public class class364 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Leo;"
	)
	UrlRequest field3894;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lwd;"
	)
	SpritePixels field3892;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Les;)V"
	)
	class364(String var1, UrlRequester var2) {
		try {
			this.field3894 = var2.request(new URL(var1));
		} catch (MalformedURLException var4) {
			this.field3894 = null;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Leo;)V"
	)
	class364(UrlRequest var1) {
		this.field3894 = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Lwd;",
		garbageValue = "90"
	)
	SpritePixels method7309() {
		if (this.field3892 == null && this.field3894 != null && this.field3894.isDone()) {
			if (this.field3894.getResponse() != null) {
				this.field3892 = Tile.readSpritePixelsFromBytes(this.field3894.getResponse());
			}

			this.field3894 = null;
		}

		return this.field3892;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZI)I",
		garbageValue = "500369613"
	)
	public static int method7312(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			boolean var3 = false;
			boolean var4 = false;
			int var5 = 0;
			int var6 = var0.length();

			for (int var7 = 0; var7 < var6; ++var7) {
				char var8 = var0.charAt(var7);
				if (var7 == 0) {
					if (var8 == '-') {
						var3 = true;
						continue;
					}

					if (var8 == '+') {
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') {
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') {
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') {
						throw new NumberFormatException();
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) {
					throw new NumberFormatException();
				}

				if (var3) {
					var10 = -var10;
				}

				int var9 = var10 + var5 * var1;
				if (var9 / var1 != var5) {
					throw new NumberFormatException();
				}

				var5 = var9;
				var4 = true;
			}

			if (!var4) {
				throw new NumberFormatException();
			} else {
				return var5;
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(Ldl;IIIB)I",
		garbageValue = "43"
	)
	static int method7313(WorldView var0, int var1, int var2, int var3) {
		int var4 = DevicePcmPlayerProvider.method329(var0, var1, var2, var3);
		WorldEntity var5 = (WorldEntity)Sound.topLevelWorldView.worldEntities.get((long)var0.id);
		if (var5 != null) {
			var4 += DevicePcmPlayerProvider.method329(Sound.topLevelWorldView, var5.getY(), var5.getPlane(), var5.getX());
		}

		return var4;
	}
}
