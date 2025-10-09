import java.util.BitSet;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nf")
public class class351 extends Node {
	@ObfuscatedName("ab")
	BitSet field4031;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1809241449
	)
	int field4030;

	class351(int var1) {
		this.field4030 = var1;
		this.field4031 = new BitSet(128);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)[Lmv;",
		garbageValue = "-112"
	)
	static class330[] method7401() {
		return new class330[]{class330.field3814, class330.field3817, class330.field3818, class330.field3820, class330.field3819, class330.field3816, class330.field3821, class330.field3815};
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(Lok;I)V",
		garbageValue = "-1433955981"
	)
	static void method7400(Widget var0) {
		var0.method7935();
		var0.method8041().method7752(new class85(var0));
		var0.method8041().method7654(new class86(var0));
	}

	@ObfuscatedName("pu")
	@ObfuscatedSignature(
		descriptor = "(Lwj;II)V",
		garbageValue = "-1322771007"
	)
	static void method7402(Buffer var0, int var1) {
		SecureUrlRequester.method3586(var0.array, var1);
		if (JagexCache.JagexCache_randomDat != null) {
			try {
				JagexCache.JagexCache_randomDat.seek(0L);
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24);
			} catch (Exception var3) {
			}
		}

	}
}
