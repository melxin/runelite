import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lv")
public abstract class class311 implements class313 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1121727633
	)
	protected int field3355;

	@ObfuscatedSignature(
		descriptor = "(Lot;Lqt;I)V"
	)
	protected class311(StudioGame var1, Language var2, int var3) {
		this.field3355 = var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1438372389"
	)
	static int method6425(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1;
		}
	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(Ldp;Ldf;IS)V",
		garbageValue = "-21847"
	)
	static void method6424(WorldView var0, Actor var1, int var2) {
		Coord var3 = var1.method2604(var0);
		int var5 = var1.x;
		int var6 = var1.size - 1;
		int var4 = var5 + (var6 << 6);
		int var9 = var1.y;
		int var10 = var1.size - 1;
		int var8 = var9 + (var10 << 6);
		VarpDefinition.worldToScreen(var0, var3.x, var3.y, var4, var8, var2);
	}
}
