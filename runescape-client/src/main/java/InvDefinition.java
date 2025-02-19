import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gv")
@Implements("InvDefinition")
public class InvDefinition extends DualNode {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("InvDefinition_cached")
	static EvictingDualNodeHashTable InvDefinition_cached;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 487397955
	)
	@Export("size")
	public int size;

	static {
		InvDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	InvDefinition() {
		this.size = 0;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lvy;B)V",
		garbageValue = "-75"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lvy;IB)V",
		garbageValue = "1"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 2) {
			this.size = var1.readUnsignedShort();
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfs;",
		garbageValue = "-2098268102"
	)
	static class145[] method3760() {
		return new class145[]{class145.field1702, class145.field1704, class145.field1696, class145.field1697, class145.field1698, class145.field1700, class145.field1699, class145.field1701, class145.field1695};
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1972787827"
	)
	static final void method3751(int var0, int var1, int var2) {
		if (class181.cameraX < var0) {
			class181.cameraX = (var0 - class181.cameraX) * FloatProjection.field2789 / 1000 + class181.cameraX + ItemContainer.field1069;
			if (class181.cameraX > var0) {
				class181.cameraX = var0;
			}
		}

		if (class181.cameraX > var0) {
			class181.cameraX -= (class181.cameraX - var0) * FloatProjection.field2789 / 1000 + ItemContainer.field1069;
			if (class181.cameraX < var0) {
				class181.cameraX = var0;
			}
		}

		if (GrandExchangeOfferUnitPriceComparator.cameraY < var1) {
			GrandExchangeOfferUnitPriceComparator.cameraY = (var1 - GrandExchangeOfferUnitPriceComparator.cameraY) * FloatProjection.field2789 / 1000 + GrandExchangeOfferUnitPriceComparator.cameraY + ItemContainer.field1069;
			if (GrandExchangeOfferUnitPriceComparator.cameraY > var1) {
				GrandExchangeOfferUnitPriceComparator.cameraY = var1;
			}
		}

		if (GrandExchangeOfferUnitPriceComparator.cameraY > var1) {
			GrandExchangeOfferUnitPriceComparator.cameraY -= (GrandExchangeOfferUnitPriceComparator.cameraY - var1) * FloatProjection.field2789 / 1000 + ItemContainer.field1069;
			if (GrandExchangeOfferUnitPriceComparator.cameraY < var1) {
				GrandExchangeOfferUnitPriceComparator.cameraY = var1;
			}
		}

		if (ApproximateRouteStrategy.cameraZ < var2) {
			ApproximateRouteStrategy.cameraZ = (var2 - ApproximateRouteStrategy.cameraZ) * FloatProjection.field2789 / 1000 + ApproximateRouteStrategy.cameraZ + ItemContainer.field1069;
			if (ApproximateRouteStrategy.cameraZ > var2) {
				ApproximateRouteStrategy.cameraZ = var2;
			}
		}

		if (ApproximateRouteStrategy.cameraZ > var2) {
			ApproximateRouteStrategy.cameraZ -= (ApproximateRouteStrategy.cameraZ - var2) * FloatProjection.field2789 / 1000 + ItemContainer.field1069;
			if (ApproximateRouteStrategy.cameraZ < var2) {
				ApproximateRouteStrategy.cameraZ = var2;
			}
		}

	}
}
