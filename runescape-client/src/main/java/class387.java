import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("og")
public enum class387 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	field4560(-1),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	field4559(0),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	field4564(1),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	field4561(2);

	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 10760653
	)
	final int field4562;

	class387(int var3) {
		this.field4562 = var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "32"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4562;
	}

	@ObfuscatedName("ab")
	static double method7531(double var0, double var2, double var4) {
		double var8 = (var0 - var2) / var4;
		double var6 = Math.exp(-var8 * var8 / 2.0D) / Math.sqrt(6.283185307179586D);
		return var6 / var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILdx;I)Ldp;",
		garbageValue = "16711935"
	)
	public static WorldView method7530(int var0, WorldViewManager var1) {
		Iterator var2 = var1.iterator();

		WorldView var3;
		do {
			if (!var2.hasNext()) {
				return var1.method2532();
			}

			var3 = (WorldView)var2.next();
		} while(var3.npcs.get((long)var0) == null);

		return var3;
	}
}
