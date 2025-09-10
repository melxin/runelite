import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ig")
public class class227 {
	@ObfuscatedName("vt")
	@ObfuscatedGetter(
		intValue = -608151739
	)
	static int field2654;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Lfa;"
	)
	class135[] field2656;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1399490225
	)
	int field2655;

	@ObfuscatedSignature(
		descriptor = "(Lwb;I)V"
	)
	class227(Buffer var1, int var2) {
		this.field2656 = new class135[var2];
		this.field2655 = var1.readUnsignedByte();

		for (int var3 = 0; var3 < this.field2656.length; ++var3) {
			class135 var4 = new class135(this.field2655, var1, false);
			this.field2656[var3] = var4;
		}

		this.method5025();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "68"
	)
	void method5025() {
		class135[] var1 = this.field2656;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class135 var3 = var1[var2];
			if (var3.field1633 >= 0) {
				var3.field1636 = this.field2656[var3.field1633];
			}
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2012758528"
	)
	public int method5026() {
		return this.field2656.length;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lfa;",
		garbageValue = "470408720"
	)
	class135 method5027(int var1) {
		return var1 >= this.method5026() ? null : this.field2656[var1];
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)[Lfa;",
		garbageValue = "-49"
	)
	class135[] method5037() {
		return this.field2656;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lfh;II)V",
		garbageValue = "-1139134305"
	)
	void method5029(class146 var1, int var2) {
		this.method5041(var1, var2, (boolean[])null, false);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lfh;I[ZZB)V",
		garbageValue = "-87"
	)
	void method5041(class146 var1, int var2, boolean[] var3, boolean var4) {
		int var5 = var1.method3755();
		int var6 = 0;
		class135[] var7 = this.method5037();

		for (int var8 = 0; var8 < var7.length; ++var8) {
			class135 var9 = var7[var8];
			if (var3 == null || var4 == var3[var6]) {
				var1.method3757(var2, var9, var6, var5);
			}

			++var6;
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-544260998"
	)
	public static boolean method5046(int var0) {
		return (var0 >> 20 & 1) != 0;
	}
}
