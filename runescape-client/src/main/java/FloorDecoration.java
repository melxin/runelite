import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("is")
@Implements("FloorDecoration")
public final class FloorDecoration {
	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	@Export("varcs")
	static Varcs varcs;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = 5282745047579754191L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 535412003
	)
	@Export("z")
	int z;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -2142622221
	)
	@Export("x")
	int x;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -373793125
	)
	@Export("y")
	int y;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1355434533
	)
	@Export("flags")
	int flags;

	FloorDecoration() {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-2140439516"
	)
	public static int method4871(int var0, int var1, int var2) {
		int var3 = PacketWriter.method2930(var2 - var1 + 1);
		var3 <<= var1;
		return var0 & ~var3;
	}

	@ObfuscatedName("nq")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-85"
	)
	static boolean method4872(int var0) {
		for (int var1 = 0; var1 < Client.field421; ++var1) {
			if (Client.field423[var1] == var0) {
				return true;
			}
		}

		return false;
	}
}
