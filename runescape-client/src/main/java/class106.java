import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ed")
public class class106 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1498762183
	)
	int field1400;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1060987869
	)
	int field1395;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -230670305
	)
	int field1396;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1799315863
	)
	int field1397;

	class106(int var1, int var2, int var3, int var4) {
		this.field1400 = var1;
		this.field1395 = var2;
		this.field1396 = var3;
		this.field1397 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1442371487"
	)
	int method2935() {
		return this.field1400;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-15"
	)
	int method2936() {
		return this.field1395;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-222359523"
	)
	int method2937() {
		return this.field1396;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1786326525"
	)
	int method2938() {
		return this.field1397;
	}

	@ObfuscatedName("ox")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1086213130"
	)
	static void method2944(int var0) {
		Client.oculusOrbState = var0;
	}
}
