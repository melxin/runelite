import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jq")
public class class241 {
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	static GameBuild field2662;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = -1145055749
	)
	static int field2658;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[Lfe;"
	)
	class133[] field2661;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1510745129
	)
	int field2659;

	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V"
	)
	class241(Buffer var1, int var2) {
		this.field2661 = new class133[var2];
		this.field2659 = var1.readUnsignedByte();

		for (int var3 = 0; var3 < this.field2661.length; ++var3) {
			class133 var4 = new class133(this.field2659, var1, false);
			this.field2661[var3] = var4;
		}

		this.method4840();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "64"
	)
	void method4840() {
		class133[] var1 = this.field2661;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class133 var3 = var1[var2];
			if (var3.field1582 >= 0) {
				var3.field1581 = this.field2661[var3.field1582];
			}
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "22"
	)
	public int method4841() {
		return this.field2661.length;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Lfe;",
		garbageValue = "1581001094"
	)
	class133 method4842(int var1) {
		return var1 >= this.method4841() ? null : this.field2661[var1];
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfe;",
		garbageValue = "-1610359904"
	)
	class133[] method4843() {
		return this.field2661;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfb;II)V",
		garbageValue = "1704883477"
	)
	void method4852(class144 var1, int var2) {
		this.method4845(var1, var2, (boolean[])null, false);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lfb;I[ZZI)V",
		garbageValue = "-1276424296"
	)
	void method4845(class144 var1, int var2, boolean[] var3, boolean var4) {
		int var5 = var1.method3413();
		int var6 = 0;
		class133[] var7 = this.method4843();

		for (int var8 = 0; var8 < var7.length; ++var8) {
			class133 var9 = var7[var8];
			if (var3 == null || var4 == var3[var6]) {
				var1.method3440(var2, var9, var6, var5);
			}

			++var6;
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1871149789"
	)
	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitComposition var1 = ArchiveDisk.method9483(var0);
		int var2 = var1.baseVar;
		int var3 = var1.startBit;
		int var4 = var1.endBit;
		int var5 = Varps.Varps_masks[var4 - var3];
		return Varps.Varps_main[var2] >> var3 & var5;
	}

	@ObfuscatedName("ab")
	public static boolean method4839(long var0) {
		return 0L != var0 && !class92.method2465(var0);
	}

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "788016048"
	)
	static final boolean method4853(int var0) {
		if (var0 >= 2000) {
			var0 -= 2000;
		}

		return var0 == 1007;
	}
}
