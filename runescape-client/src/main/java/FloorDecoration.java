import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jr")
@Implements("FloorDecoration")
public final class FloorDecoration {
	@ObfuscatedName("jo")
	static int[] field2539;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -967127495
	)
	@Export("z")
	int z;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1483991035
	)
	@Export("x")
	int x;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1787793063
	)
	@Export("y")
	int y;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = -2654504293480129969L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 466405665
	)
	@Export("flags")
	int flags;

	FloorDecoration() {
	}

	@ObfuscatedName("na")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1072566168"
	)
	static void method4686() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) {
			int var1 = var0.group;
			if (class379.widgetDefinition.loadInterface(var1)) {
				boolean var2 = true;
				Widget[] var3 = class379.widgetDefinition.Widget_interfaceComponents[var1];

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) {
					if (var3[var4] != null) {
						var2 = var3[var4].isIf3;
						break;
					}
				}

				if (!var2) {
					var4 = (int)var0.key;
					Widget var5 = class379.widgetDefinition.method6875(var4);
					if (var5 != null) {
						class178.invalidateWidget(var5);
					}
				}
			}
		}

	}
}
