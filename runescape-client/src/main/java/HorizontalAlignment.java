import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hn")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements Enum {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lhn;"
	)
	field2059(2, 0),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lhn;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(1, 1),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lhn;"
	)
	field2055(0, 2);

	@ObfuscatedName("ai")
	@Export("osNameLowercase")
	public static String osNameLowercase;
	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;
	@ObfuscatedName("wx")
	@ObfuscatedSignature(
		descriptor = "Lpt;"
	)
	static JagNetThread field2060;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 2087013143
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -46558727
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-164877066"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("aa")
	static final void method4304(long var0) {
		ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var0;
	}
}
