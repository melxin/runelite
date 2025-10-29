import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dy")
public class class82 {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1024858103
	)
	int field1185;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -117088583
	)
	int field1184;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1558853963
	)
	int field1181;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1454671025
	)
	int field1182;

	class82(int var1, int var2, int var3, int var4) {
		this.field1185 = var1;
		this.field1184 = var2;
		this.field1181 = var3;
		this.field1182 = var4;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "178472165"
	)
	int method2884() {
		return this.field1185;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-6"
	)
	int method2886() {
		return this.field1184;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "2489"
	)
	int method2885() {
		return this.field1181;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	int method2893() {
		return this.field1182;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1561811723"
	)
	public static boolean method2890(int var0) {
		return (var0 >> 20 & 1) != 0;
	}
}
