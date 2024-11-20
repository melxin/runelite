import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hp")
public class class188 extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("field2007")
	public static EvictingDualNodeHashTable field2007;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 1908956819
	)
	static int field1953;

	static {
		field2007 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ab")
	public static final void method3857(long var0) {
		if (var0 > 0L) {
			if (var0 % 10L == 0L) {
				long var2 = var0 - 1L;

				try {
					Thread.sleep(var2);
				} catch (InterruptedException var8) {
				}

				try {
					Thread.sleep(1L);
				} catch (InterruptedException var7) {
				}
			} else {
				try {
					Thread.sleep(var0);
				} catch (InterruptedException var6) {
				}
			}

		}
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "-70"
	)
	static void method3856(int var0, int var1, int var2, int var3, int var4) {
		NodeDeque var5 = Projection.worldView.groundItems[var0][var1][var2];
		if (var5 != null) {
			for (TileItem var6 = (TileItem)var5.last(); var6 != null; var6 = (TileItem)var5.previous()) {
				if ((var3 & 32767) == var6.id && var4 == var6.quantity) {
					var6.remove();
					break;
				}
			}

			if (var5.last() == null) {
				Projection.worldView.groundItems[var0][var1][var2] = null;
			}

			class173.updateItemPile(var0, var1, var2);
		}

	}
}
