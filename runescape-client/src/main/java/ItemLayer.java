import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
@Implements("ItemLayer")
public final class ItemLayer {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1742420161
	)
	@Export("z")
	int z;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1662479507
	)
	@Export("x")
	int x;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 671669857
	)
	@Export("y")
	int y;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("first")
	Renderable first;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("second")
	Renderable second;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("third")
	Renderable third;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = 907455366364395703L
	)
	@Export("tag")
	long tag;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 683028921
	)
	@Export("height")
	int height;

	ItemLayer() {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-18"
	)
	static final int method4825(int var0, int var1) {
		if (var0 == -1) {
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lti;Lwv;ZI)V",
		garbageValue = "-1160584371"
	)
	static void method4826(DynamicArray var0, class574 var1, boolean var2) {
		if (var0 == null) {
			throw new RuntimeException();
		} else if (var1 != null && var0.field5504 != var1) {
			throw new RuntimeException();
		} else if (var2 && !var0.field5501) {
			throw new RuntimeException();
		}
	}
}
