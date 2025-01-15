import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("os")
public enum class384 implements Enum {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	field4498(0),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	field4494(1),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	field4496(2),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	field4497(3);

	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 629776237
	)
	public final int field4495;

	class384(int var3) {
		this.field4495 = var3;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "118"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4495;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "130353676"
	)
	public static int method7653(int var0) {
		return var0 >>> 4 & class550.field5421;
	}

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIIIILdx;I)V",
		garbageValue = "-1315165544"
	)
	static void method7652(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, Player var13) {
		ObjectComposition var14 = class142.getObjectDefinition(var6);
		int var15;
		int var16;
		if (var4 != 1 && var4 != 3) {
			var15 = var14.sizeX;
			var16 = var14.sizeY;
		} else {
			var15 = var14.sizeY;
			var16 = var14.sizeX;
		}

		int var17 = (var15 >> 1) + var1;
		int var18 = (var15 + 1 >> 1) + var1;
		int var19 = (var16 >> 1) + var2;
		int var20 = var2 + (var16 + 1 >> 1);
		int[][] var21 = class30.worldView.tileHeights[var0];
		int var22 = var21[var17][var19] + var21[var18][var19] + var21[var17][var20] + var21[var18][var20] >> 2;
		int var23 = (var1 << 7) + (var15 << 6);
		int var24 = (var2 << 7) + (var16 << 6);
		Model var25 = var14.getModel(var3, var4, var21, var23, var22, var24);
		if (var25 != null) {
			Varcs.method3211(class30.worldView, var0, var1, var2, var5, -1, 0, 0, 31, (String[])null, var7 + 1, var8 + 1);
			var13.animationCycleStart = var7 + Client.cycle;
			var13.animationCycleEnd = var8 + Client.cycle;
			var13.model0 = var25;
			var13.field1131 = var15 * 64 + var1 * 128;
			var13.field1133 = var2 * 128 + var16 * 64;
			var13.tileHeight2 = var22;
			int var26;
			if (var9 > var11) {
				var26 = var9;
				var9 = var11;
				var11 = var26;
			}

			if (var10 > var12) {
				var26 = var10;
				var10 = var12;
				var12 = var26;
			}

			var13.minX = var9 + var1;
			var13.maxX = var11 + var1;
			var13.minY = var10 + var2;
			var13.maxY = var2 + var12;
		}

	}
}
