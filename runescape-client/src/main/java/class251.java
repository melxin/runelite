import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jq")
public class class251 {
	@ObfuscatedName("ay")
	@Export("Interpreter_intLocals")
	static int[] Interpreter_intLocals;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Lfs;"
	)
	class136[] field2816;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1712769811
	)
	int field2817;

	@ObfuscatedSignature(
		descriptor = "(Lxa;I)V"
	)
	class251(Buffer var1, int var2) {
		this.field2816 = new class136[var2];
		this.field2817 = var1.readUnsignedByte();

		for (int var3 = 0; var3 < this.field2816.length; ++var3) {
			class136 var4 = new class136(this.field2817, var1, false);
			this.field2816[var3] = var4;
		}

		this.method5491();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1725817435"
	)
	void method5491() {
		class136[] var1 = this.field2816;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class136 var3 = var1[var2];
			if (var3.field1613 >= 0) {
				var3.field1614 = this.field2816[var3.field1613];
			}
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1305165838"
	)
	public int method5475() {
		return this.field2816.length;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Lfs;",
		garbageValue = "-146335463"
	)
	public class136 method5476(int var1) {
		return var1 >= this.method5475() ? null : this.field2816[var1];
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfs;",
		garbageValue = "-836818276"
	)
	class136[] method5477() {
		return this.field2816;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lfy;IB)V",
		garbageValue = "48"
	)
	public void method5478(class146 var1, int var2) {
		this.method5479(var1, var2, (boolean[])null, false);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lfy;I[ZZI)V",
		garbageValue = "-1942430699"
	)
	void method5479(class146 var1, int var2, boolean[] var3, boolean var4) {
		int var5 = var1.method3906();
		int var6 = 0;
		class136[] var7 = this.method5477();

		for (int var8 = 0; var8 < var7.length; ++var8) {
			class136 var9 = var7[var8];
			if (var3 == null || var4 == var3[var6]) {
				var1.method3908(var2, var9, var6, var5);
			}

			++var6;
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lwh;",
		garbageValue = "-1703539756"
	)
	public static class586 method5495(int var0) {
		int var1 = class584.field5935[var0];
		if (var1 == 1) {
			return class586.field5937;
		} else if (var1 == 2) {
			return class586.field5939;
		} else {
			return var1 == 3 ? class586.field5942 : null;
		}
	}
}
