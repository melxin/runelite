import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("js")
public class class241 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Lfe;"
	)
	class134[] field2615;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 780019395
	)
	int field2616;

	@ObfuscatedSignature(
		descriptor = "(Lvj;I)V"
	)
	class241(Buffer var1, int var2) {
		this.field2615 = new class134[var2];
		this.field2616 = var1.readUnsignedByte();

		for (int var3 = 0; var3 < this.field2615.length; ++var3) {
			class134 var4 = new class134(this.field2616, var1, false);
			this.field2615[var3] = var4;
		}

		this.method4810();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "24"
	)
	void method4810() {
		class134[] var1 = this.field2615;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class134 var3 = var1[var2];
			if (var3.field1544 >= 0) {
				var3.field1541 = this.field2615[var3.field1544];
			}
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2060169951"
	)
	public int method4808() {
		return this.field2615.length;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lfe;",
		garbageValue = "-1616526404"
	)
	class134 method4809(int var1) {
		return var1 >= this.method4808() ? null : this.field2615[var1];
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)[Lfe;",
		garbageValue = "48"
	)
	class134[] method4811() {
		return this.field2615;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lfz;IB)V",
		garbageValue = "71"
	)
	void method4815(class145 var1, int var2) {
		this.method4818(var1, var2, (boolean[])null, false);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lfz;I[ZZI)V",
		garbageValue = "942478868"
	)
	void method4818(class145 var1, int var2, boolean[] var3, boolean var4) {
		int var5 = var1.method3405();
		int var6 = 0;
		class134[] var7 = this.method4811();

		for (int var8 = 0; var8 < var7.length; ++var8) {
			class134 var9 = var7[var8];
			if (var3 == null || var4 == var3[var6]) {
				var1.method3424(var2, var9, var6, var5);
			}

			++var6;
		}

	}
}
