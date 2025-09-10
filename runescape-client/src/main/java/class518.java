import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tb")
public enum class518 implements Enum {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ltb;"
	)
	field5492(0, 0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ltb;"
	)
	field5493(1, 1),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ltb;"
	)
	field5494(2, 2);

	@ObfuscatedName("rc")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	@Export("textureProvider")
	static TextureProvider textureProvider;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 555401257
	)
	final int field5495;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1795631439
	)
	final int field5496;

	class518(int var3, int var4) {
		this.field5495 = var3;
		this.field5496 = var4;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1935172756"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5496;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lny;IB)Lny;",
		garbageValue = "-63"
	)
	public static WidgetConfigNode method10317(WidgetConfigNode var0, int var1) {
		for (WidgetConfigNode var2 = var0; var2 != null; var2 = var2.nextWidgetConfigNode) {
			if (var1 >= var2.start && var1 <= var2.end) {
				return var2;
			}
		}

		return null;
	}
}
