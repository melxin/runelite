import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pu")
public enum class394 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	field4857(0),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	field4854(1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	field4856(2),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	field4858(3);

	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1974962229
	)
	public final int field4855;

	class394(int var3) {
		this.field4855 = var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1012656358"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4855;
	}

	@ObfuscatedName("no")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "95"
	)
	static final void method8274(int var0) {
		if (class35.widgetDefinition.loadInterface(var0)) {
			UserComparator9.drawModelComponents(class35.widgetDefinition.Widget_interfaceComponents[var0], 0, class35.widgetDefinition.Widget_interfaceComponents[var0].length - 1, -1, -1);
		}
	}
}
