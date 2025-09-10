import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kp")
public class class278 {
	@ObfuscatedName("af")
	final int[][] field3265;
	@ObfuscatedName("aw")
	final int[][] field3263;
	@ObfuscatedName("at")
	final int[] field3264;
	@ObfuscatedName("ac")
	final int[] field3266;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1253395125
	)
	final int field3267;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1498593853
	)
	int field3262;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1292544345
	)
	int field3268;

	class278(int var1, int var2) {
		this.field3265 = new int[var1][var2];
		this.field3263 = new int[var1][var2];
		int var3 = var2 * var1;
		int var4 = class165.method4019(var3 / 4);
		this.field3264 = new int[var4];
		this.field3266 = new int[var4];
		this.field3267 = var4 - 1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1797721623"
	)
	void method6264() {
		for (int var1 = 0; var1 < this.field3265.length; ++var1) {
			for (int var2 = 0; var2 < this.field3265[var1].length; ++var2) {
				this.field3265[var1][var2] = 0;
				this.field3263[var1][var2] = 99999999;
			}
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-315649790"
	)
	void method6242(int var1, int var2) {
		this.field3262 = var1;
		this.field3268 = var2;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "4"
	)
	int method6241() {
		return this.field3262;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "24"
	)
	int method6245() {
		return this.field3268;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "443170206"
	)
	int method6246() {
		return this.field3265.length;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "514791268"
	)
	int method6259() {
		return this.field3265[0].length;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)[[I",
		garbageValue = "1861442335"
	)
	int[][] method6248() {
		return this.field3265;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)[[I",
		garbageValue = "-255839951"
	)
	int[][] method6249() {
		return this.field3263;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-2116420366"
	)
	int[] method6250() {
		return this.field3264;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1961131868"
	)
	int[] method6251() {
		return this.field3266;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-73"
	)
	int method6252() {
		return this.field3267;
	}
}
