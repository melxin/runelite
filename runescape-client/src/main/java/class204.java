import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hc")
public class class204 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lhc;"
	)
	static final class204 field2244;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lhc;"
	)
	static final class204 field2238;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lhc;"
	)
	static final class204 field2239;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lhc;"
	)
	static final class204 field2240;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lhc;"
	)
	static final class204 field2241;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	@Export("World_request")
	static UrlRequest World_request;
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = 1984505983
	)
	@Export("Players_count")
	static int Players_count;
	@ObfuscatedName("pu")
	static byte[][] field2245;

	static {
		field2244 = new class204(0);
		field2238 = new class204(1);
		field2239 = new class204(2);
		field2240 = new class204(3);
		field2241 = new class204(4);
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "0"
	)
	class204(int var1) {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "602968736"
	)
	static void method4571() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.field990.last(); var0 != null; var0 = (ObjectSound)ObjectSound.field990.previous()) {
			var0.method2275();
		}

	}
}
