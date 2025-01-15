import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nm")
public class class356 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Len;"
	)
	UrlRequest field3794;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	SpritePixels field3793;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lez;)V"
	)
	class356(String var1, UrlRequester var2) {
		try {
			this.field3794 = var2.request(new URL(var1));
		} catch (MalformedURLException var4) {
			this.field3794 = null;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Len;)V"
	)
	class356(UrlRequest var1) {
		this.field3794 = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Lvf;",
		garbageValue = "-109"
	)
	SpritePixels method7045() {
		if (this.field3793 == null && this.field3794 != null && this.field3794.isDone()) {
			if (this.field3794.getResponse() != null) {
				this.field3793 = GrandExchangeOfferNameComparator.readSpritePixelsFromBytes(this.field3794.getResponse());
			}

			this.field3794 = null;
		}

		return this.field3793;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)[B",
		garbageValue = "71"
	)
	static byte[] method7046(String var0) {
		boolean var1 = true;
		boolean var2 = true;
		int var3 = "pattern".length();
		int var4 = 0;
		byte[] var5 = new byte[8];

		while (true) {
			int var6 = var3 + var4;
			if (var6 >= var0.length()) {
				return null;
			}

			char var7 = var0.charAt(var6);
			if (var7 == ':') {
				if (var4 == 0) {
					return null;
				}

				byte[] var8 = new byte[var4];
				System.arraycopy(var5, 0, var8, 0, var4);
				return var8;
			}

			if (var5.length == var4) {
				return null;
			}

			if (var7 >= '0' && var7 <= '9') {
				var7 = (char)(var7 - '0');
			} else {
				if (var7 < 'a' || var7 > 'z') {
					return null;
				}

				var7 = (char)(var7 - 'W');
			}

			var5[var4++] = (byte)var7;
		}
	}
}
