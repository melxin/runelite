import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ot")
public class class375 {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	UrlRequest field4133;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lxt;"
	)
	SpritePixels field4134;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lei;)V"
	)
	class375(String var1, UrlRequester var2) {
		try {
			this.field4133 = var2.request(new URL(var1));
		} catch (MalformedURLException var4) {
			this.field4133 = null;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Ley;)V"
	)
	class375(UrlRequest var1) {
		this.field4133 = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Lxt;",
		garbageValue = "59"
	)
	SpritePixels method7765() {
		if (this.field4134 == null && this.field4133 != null && this.field4133.isDone()) {
			if (this.field4133.getResponse() != null) {
				this.field4134 = class201.readSpritePixelsFromBytes(this.field4133.getResponse());
			}

			this.field4133 = null;
		}

		return this.field4134;
	}
}
