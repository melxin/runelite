import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nh")
public class class361 {
	@ObfuscatedName("lx")
	@ObfuscatedGetter(
		intValue = -1045180231
	)
	static int field3982;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	UrlRequest field3981;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lxv;"
	)
	SpritePixels field3977;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Les;)V"
	)
	class361(String var1, UrlRequester var2) {
		try {
			this.field3981 = var2.request(new URL(var1));
		} catch (MalformedURLException var4) {
			this.field3981 = null;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Leu;)V"
	)
	class361(UrlRequest var1) {
		this.field3981 = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lxv;",
		garbageValue = "-453617960"
	)
	SpritePixels method7504() {
		if (this.field3977 == null && this.field3981 != null && this.field3981.isDone()) {
			if (this.field3981.getResponse() != null) {
				this.field3977 = class177.readSpritePixelsFromBytes(this.field3981.getResponse());
			}

			this.field3981 = null;
		}

		return this.field3977;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;III)V",
		garbageValue = "46606302"
	)
	static void method7510(Object[] var0, int var1, int var2) {
		while (var1 < var2) {
			Object var3 = var0[var1];
			var0[var1] = var0[var2];
			var0[var2] = var3;
			++var1;
			--var2;
		}

	}
}
