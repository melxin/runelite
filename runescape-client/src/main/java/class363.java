import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nh")
public class class363 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lea;"
	)
	UrlRequest field4061;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lxt;"
	)
	SpritePixels field4063;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lel;)V"
	)
	class363(String var1, UrlRequester var2) {
		try {
			this.field4061 = var2.request(new URL(var1));
		} catch (MalformedURLException var4) {
			this.field4061 = null;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Lea;)V"
	)
	class363(UrlRequest var1) {
		this.field4061 = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Lxt;",
		garbageValue = "-999062412"
	)
	SpritePixels method7519() {
		if (this.field4063 == null && this.field4061 != null && this.field4061.isDone()) {
			if (this.field4061.getResponse() != null) {
				this.field4063 = class179.readSpritePixelsFromBytes(this.field4061.getResponse());
			}

			this.field4061 = null;
		}

		return this.field4063;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lwb;BIB)I",
		garbageValue = "114"
	)
	public static int method7521(Buffer var0, byte var1, int var2) {
		int var3 = var1 >> var2 & 3;
		if (var3 == 3) {
			return var0.readShortSmart();
		} else if (var3 == 2) {
			return var0.readShort();
		} else {
			return var3 == 1 ? var0.readByte() : 0;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1572048165"
	)
	@Export("isCharPrintable")
	public static boolean isCharPrintable(char var0) {
		if (var0 >= ' ' && var0 <= '~') {
			return true;
		} else if (var0 >= 160 && var0 <= 255) {
			return true;
		} else {
			return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376;
		}
	}
}
