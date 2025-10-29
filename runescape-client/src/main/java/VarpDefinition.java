import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hw")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1537704075
	)
	public static int field1976;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	@Export("VarpDefinition_archive")
	static AbstractArchive VarpDefinition_archive;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("VarpDefinition_cached")
	public static EvictingDualNodeHashTable VarpDefinition_cached;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -840015355
	)
	static int field1979;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 138999049
	)
	@Export("type")
	public int type;

	static {
		VarpDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	VarpDefinition() {
		this.type = 0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lxa;S)V",
		garbageValue = "-770"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				this.method4301();
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lxa;II)V",
		garbageValue = "-1778326048"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 5) {
			this.type = var1.readUnsignedShort();
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "65"
	)
	void method4301() {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lut;IB)V",
		garbageValue = "30"
	)
	public static void method4310(DynamicArray var0, int var1) {
		class461.method9375(var0, (class586)null, true);
		int var2 = var0.method10652();
		if (var2 > 1) {
			var1 %= var2;
			if (var1 != 0) {
				if (var1 < 0) {
					var1 += var2;
				}

				if (var0.field5584 == class586.field5937) {
					int[] var3 = var0.method10650();
					LoginScreenAnimation.method2636(var3, 0, var2 - 1);
					LoginScreenAnimation.method2636(var3, 0, var1 - 1);
					LoginScreenAnimation.method2636(var3, var1, var2 - 1);
				} else if (var0.field5584 == class586.field5942) {
					long[] var4 = var0.method10651();
					HttpResponse.method307(var4, 0, var2 - 1);
					HttpResponse.method307(var4, 0, var1 - 1);
					HttpResponse.method307(var4, var1, var2 - 1);
				} else {
					Object[] var5 = var0.method10681();
					class151.method3977(var5, 0, var2 - 1);
					class151.method3977(var5, 0, var1 - 1);
					class151.method3977(var5, var1, var2 - 1);
				}

			}
		}
	}
}
