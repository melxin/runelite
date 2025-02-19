import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nt")
public class class358 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	UrlRequest field3857;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lwg;"
	)
	SpritePixels field3856;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lec;)V"
	)
	class358(String var1, UrlRequester var2) {
		try {
			this.field3857 = var2.request(new URL(var1));
		} catch (MalformedURLException var4) {
			this.field3857 = null;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Ley;)V"
	)
	class358(UrlRequest var1) {
		this.field3857 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lwg;",
		garbageValue = "1372636047"
	)
	SpritePixels method6943() {
		if (this.field3856 == null && this.field3857 != null && this.field3857.isDone()) {
			if (this.field3857.getResponse() != null) {
				this.field3856 = class395.readSpritePixelsFromBytes(this.field3857.getResponse());
			}

			this.field3857 = null;
		}

		return this.field3856;
	}
}
