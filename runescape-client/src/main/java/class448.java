import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rg")
public class class448 {
	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	public static class416 field5001;
	@ObfuscatedName("ss")
	@ObfuscatedGetter(
		intValue = -805103121
	)
	@Export("selectedSpellFlags")
	static int selectedSpellFlags;
	@ObfuscatedName("ap")
	float field4996;
	@ObfuscatedName("aj")
	float field4989;
	@ObfuscatedName("an")
	float field4990;
	@ObfuscatedName("ai")
	float field4991;
	@ObfuscatedName("al")
	float field4992;
	@ObfuscatedName("ac")
	float field4997;
	@ObfuscatedName("aa")
	float field4994;
	@ObfuscatedName("am")
	float field5000;
	@ObfuscatedName("ah")
	float field4993;
	@ObfuscatedName("ag")
	float field4995;
	@ObfuscatedName("au")
	float field4998;
	@ObfuscatedName("ar")
	float field4999;

	static {
		new class448();
	}

	public class448() {
		this.method8874();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1023999147"
	)
	void method8874() {
		this.field4999 = 0.0F;
		this.field4998 = 0.0F;
		this.field4995 = 0.0F;
		this.field5000 = 0.0F;
		this.field4994 = 0.0F;
		this.field4997 = 0.0F;
		this.field4991 = 0.0F;
		this.field4990 = 0.0F;
		this.field4989 = 0.0F;
		this.field4993 = 1.0F;
		this.field4992 = 1.0F;
		this.field4996 = 1.0F;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-1240324780"
	)
	public void method8875(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4989;
		float var5 = this.field4992;
		float var6 = this.field5000;
		float var7 = this.field4998;
		this.field4989 = var2 * var4 - var3 * this.field4990;
		this.field4990 = var3 * var4 + this.field4990 * var2;
		this.field4992 = var2 * var5 - var3 * this.field4997;
		this.field4997 = var2 * this.field4997 + var5 * var3;
		this.field5000 = var2 * var6 - this.field4993 * var3;
		this.field4993 = this.field4993 * var2 + var3 * var6;
		this.field4998 = var7 * var2 - this.field4999 * var3;
		this.field4999 = var7 * var3 + var2 * this.field4999;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-1731284191"
	)
	public void method8876(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4996;
		float var5 = this.field4991;
		float var6 = this.field4994;
		float var7 = this.field4995;
		this.field4996 = var4 * var2 + this.field4990 * var3;
		this.field4990 = this.field4990 * var2 - var4 * var3;
		this.field4991 = var2 * var5 + this.field4997 * var3;
		this.field4997 = this.field4997 * var2 - var5 * var3;
		this.field4994 = var3 * this.field4993 + var6 * var2;
		this.field4993 = var2 * this.field4993 - var6 * var3;
		this.field4995 = var2 * var7 + this.field4999 * var3;
		this.field4999 = var2 * this.field4999 - var7 * var3;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "-100"
	)
	void method8877(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4996;
		float var5 = this.field4991;
		float var6 = this.field4994;
		float var7 = this.field4995;
		this.field4996 = var4 * var2 - this.field4989 * var3;
		this.field4989 = var2 * this.field4989 + var4 * var3;
		this.field4991 = var5 * var2 - this.field4992 * var3;
		this.field4992 = var5 * var3 + this.field4992 * var2;
		this.field4994 = var6 * var2 - var3 * this.field5000;
		this.field5000 = var6 * var3 + var2 * this.field5000;
		this.field4995 = var7 * var2 - var3 * this.field4998;
		this.field4998 = var2 * this.field4998 + var3 * var7;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "1928086572"
	)
	public void method8878(float var1, float var2, float var3) {
		this.field4995 += var1;
		this.field4998 += var2;
		this.field4999 += var3;
	}

	public String toString() {
		return this.field4996 + "," + this.field4991 + "," + this.field4994 + "," + this.field4995 + "\n" + this.field4989 + "," + this.field4992 + "," + this.field5000 + "," + this.field4998 + "\n" + this.field4990 + "," + this.field4997 + "," + this.field4993 + "," + this.field4999;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ltp;B)I",
		garbageValue = "1"
	)
	public static int method8880(class509 var0) {
		class377.method7917(var0);
		byte var1 = 0;
		int var2 = var0.method9937();
		int var3 = -1;
		int var8;
		if (var0.field5288 == class563.field5600) {
			int[] var4 = var0.method9965();

			for (var8 = var1; var8 < var2; ++var8) {
				if (var3 == -1 || var4[var8] < var4[var3]) {
					var3 = var8;
				}
			}
		} else if (var0.field5288 == class563.field5594) {
			long[] var9 = var0.method9973();

			for (var8 = var1; var8 < var2; ++var8) {
				if (var3 == -1 || var9[var8] < var9[var3]) {
					var3 = var8;
				}
			}
		} else if (var0.field5288 == class563.field5595) {
			String var10 = null;
			Object[] var5 = var0.method9936();

			for (int var6 = var1; var6 < var2; ++var6) {
				String var7 = (String)var5[var6];
				if (var3 == -1 || var7 != null && var7.compareTo(var10) < 0) {
					var3 = var6;
					var10 = var7;
				}
			}
		}

		return var3;
	}
}
