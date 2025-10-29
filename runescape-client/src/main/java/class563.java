import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vu")
public class class563 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Lvu;"
	)
	static final class563[] field5834;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1570242397
	)
	static final int field5835;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -640625525
	)
	static int field5836;
	@ObfuscatedName("av")
	final int[] field5830;
	@ObfuscatedName("at")
	final int[] field5829;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1805765655
	)
	int field5833;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1190339569
	)
	int field5832;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 524937177
	)
	int field5831;

	static {
		field5836 = 0;
		field5835 = 16;
		field5834 = new class563[field5835];
	}

	class563() {
		this.field5830 = new int[4];
		this.field5829 = new int[4];
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "109"
	)
	public void method11210() {
		synchronized(field5834) {
			if (field5836 < field5835) {
				field5834[++field5836 - 1] = this;
			}

		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-3"
	)
	void method11223() {
		this.field5833 = 0;
		this.field5832 = 0;
		this.field5831 = 0;
		Arrays.fill(this.field5830, 0);
		Arrays.fill(this.field5829, 0);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "2"
	)
	int method11205(int var1) {
		return this.field5830[var1];
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1955071929"
	)
	int method11206(int var1) {
		return this.field5829[var1];
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "63"
	)
	int method11230() {
		return this.field5833;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1412419434"
	)
	int method11208() {
		return this.field5832;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-97"
	)
	int method11233() {
		return this.field5831;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lvt;IIIB)V",
		garbageValue = "-75"
	)
	public void method11207(class564 var1, int var2, int var3, int var4) {
		this.field5833 = var2;
		this.field5832 = var3;
		this.field5831 = var1.field5850;
		int var5 = class169.method4184(var4);
		this.field5830[0] = var2 + var1.method11236(var5, 0);
		this.field5829[0] = var3 + var1.method11235(var5, 0);
		this.field5830[1] = var2 + var1.method11236(var5, 1);
		this.field5829[1] = var3 + var1.method11235(var5, 1);
		this.field5830[2] = var2 + var1.method11236(var5, 2);
		this.field5829[2] = var3 + var1.method11235(var5, 2);
		this.field5830[3] = var2 + var1.method11236(var5, 3);
		this.field5829[3] = var3 + var1.method11235(var5, 3);
	}
}
