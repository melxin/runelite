import java.util.BitSet;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nb")
public class class350 extends Node {
	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	static Archive field3925;
	@ObfuscatedName("al")
	BitSet field3924;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -481979687
	)
	int field3923;

	class350(int var1) {
		this.field3923 = var1;
		this.field3924 = new BitSet(128);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	public static void method7370() {
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ltn;II)V",
		garbageValue = "2086876142"
	)
	static void method7369(class515 var0, int var1) {
		if (var1 < 0 || var1 >= var0.method10351()) {
			throw new RuntimeException();
		}
	}
}
