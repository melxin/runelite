import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("km")
public class class284 {
	@ObfuscatedName("av")
	final int[][] field3290;
	@ObfuscatedName("at")
	final int[][] field3286;
	@ObfuscatedName("ag")
	final int[] field3287;
	@ObfuscatedName("an")
	final int[] field3288;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1803700773
	)
	final int field3289;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -896174215
	)
	int field3292;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1638078021
	)
	int field3291;

	class284(int var1, int var2) {
		this.field3290 = new int[var1][var2];
		this.field3286 = new int[var1][var2];
		int var3 = var2 * var1;
		int var4 = class161.method4040(var3 / 4);
		this.field3287 = new int[var4];
		this.field3288 = new int[var4];
		this.field3289 = var4 - 1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "768477798"
	)
	void method6411() {
		for (int var1 = 0; var1 < this.field3290.length; ++var1) {
			for (int var2 = 0; var2 < this.field3290[var1].length; ++var2) {
				this.field3290[var1][var2] = 0;
				this.field3286[var1][var2] = 99999999;
			}
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-768637108"
	)
	void method6412(int var1, int var2) {
		this.field3292 = var1;
		this.field3291 = var2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "104"
	)
	int method6413() {
		return this.field3292;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1041465838"
	)
	int method6414() {
		return this.field3291;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	int method6415() {
		return this.field3290.length;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-26"
	)
	int method6416() {
		return this.field3290[0].length;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)[[I",
		garbageValue = "100"
	)
	int[][] method6417() {
		return this.field3290;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(S)[[I",
		garbageValue = "222"
	)
	int[][] method6418() {
		return this.field3286;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "563513550"
	)
	int[] method6419() {
		return this.field3287;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1159686019"
	)
	int[] method6420() {
		return this.field3288;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "255"
	)
	int method6429() {
		return this.field3289;
	}
}
