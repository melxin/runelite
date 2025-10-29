import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qb")
@Implements("GrandExchangeOfferUnitPriceComparator")
final class GrandExchangeOfferUnitPriceComparator implements Comparator {
	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "Lpz;"
	)
	@Export("cameraViewMode")
	static CameraViewMode cameraViewMode;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lqk;Lqk;I)I",
		garbageValue = "145243852"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.grandExchangeOffer.unitPrice < var2.grandExchangeOffer.unitPrice ? -1 : (var2.grandExchangeOffer.unitPrice == var1.grandExchangeOffer.unitPrice ? 0 : 1);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lsj;ILse;B)I",
		garbageValue = "79"
	)
	public static int method8811(AnimationSequence var0, int var1, class476 var2) {
		int var3 = 0;
		if (!var0.isActive()) {
			var0.method9902(0);
			return var3;
		} else {
			SequenceDefinition var4 = var0.getSequenceDefinition();
			if (var4.frameCount == -1) {
				var3 |= 8;
			}

			if (var4.method4925()) {
				var0.method9902(0);
			} else {
				var0.method9902(var0.method9874() + var1);
			}

			int var7;
			int var8;
			SequenceDefinition var9;
			int var10;
			int var11;
			int var12;
			if (!var4.isCachedModelIdSet()) {
				var7 = var1;
				var8 = 0;
				var9 = var0.getSequenceDefinition();
				if (var9.frameCount > 0 && var9.field2491 > 0) {
					var7 = var1 % var9.field2491;
				}

				var10 = var0.getFrame();
				var11 = var0.getFrameCycle();
				var12 = var0.method9871();
				if (var10 >= var9.frameIds.length) {
					var10 = 0;
					var11 = 0;
				}

				var11 += var7;

				while (true) {
					do {
						if (var11 <= var9.frameLengths[var10]) {
							var0.method9883(var10, var11, var12);
							var3 |= var8;
							return var3;
						}

						var11 -= var9.frameLengths[var10];
						++var10;
						var8 |= 4;
						if ((var8 & 2) == 0 && var2 != null) {
							var2.vmethod11280(var9, var10);
						}
					} while(var10 < var9.frameIds.length);

					++var12;
					var8 |= 1;
					var10 -= var9.frameCount;
					if (var12 >= var9.field2485) {
						var8 |= 2;
					}

					if (var10 < 0 || var10 >= var9.frameIds.length) {
						var8 |= 2;
						var10 = 0;
					}

					if ((var8 & 2) == 0 && var2 != null) {
						var2.vmethod11280(var9, var10);
					}
				}
			} else {
				var7 = var1;
				var8 = 0;
				var9 = var0.getSequenceDefinition();
				if (var9.frameCount > 0 && var1 > 0) {
					var7 = var1 - (var1 - 1) / var9.frameCount * var9.frameCount;
				}

				var10 = var0.getFrame();
				var11 = var0.method9871();

				while (true) {
					do {
						if (var7 <= 0) {
							var0.method9879(var10, var11);
							var3 |= var8;
							return var3;
						}

						--var7;
						++var10;
						var8 |= 4;
						if ((var8 & 2) == 0 && var2 != null) {
							var2.vmethod11280(var9, var10);
						}

						var12 = var9.getMayaAnimFrame();
					} while(var10 < var12);

					++var11;
					var8 |= 1;
					var10 -= var9.frameCount;
					if (var11 >= var9.field2485) {
						var8 |= 2;
					}

					if (var10 < 0 || var10 >= var12) {
						var8 |= 2;
						var10 = 0;
					}

					if ((var8 & 2) == 0 && var2 != null) {
						var2.vmethod11280(var9, var10);
					}
				}
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(BI)C",
		garbageValue = "-234838055"
	)
	public static char method8810(byte var0) {
		int var1 = var0 & 255;
		if (var1 == 0) {
			throw new IllegalArgumentException("" + Integer.toString(var1, 16));
		} else {
			if (var1 >= 128 && var1 < 160) {
				char var2 = class451.cp1252AsciiExtension[var1 - 128];
				if (var2 == 0) {
					var2 = '?';
				}

				var1 = var2;
			}

			return (char)var1;
		}
	}
}
