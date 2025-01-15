import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qp")
public class class429 {
	@ObfuscatedName("ay")
	float field4768;
	@ObfuscatedName("ah")
	float field4766;
	@ObfuscatedName("az")
	float field4773;
	@ObfuscatedName("ao")
	float field4775;
	@ObfuscatedName("ad")
	float field4765;
	@ObfuscatedName("an")
	float field4770;
	@ObfuscatedName("ae")
	float field4771;
	@ObfuscatedName("ax")
	float field4772;
	@ObfuscatedName("at")
	float field4767;
	@ObfuscatedName("ac")
	float field4769;
	@ObfuscatedName("au")
	float field4774;
	@ObfuscatedName("as")
	float field4776;

	static {
		new class429();
	}

	public class429() {
		this.method8456();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1450694311"
	)
	void method8456() {
		this.field4776 = 0.0F;
		this.field4774 = 0.0F;
		this.field4769 = 0.0F;
		this.field4772 = 0.0F;
		this.field4771 = 0.0F;
		this.field4770 = 0.0F;
		this.field4775 = 0.0F;
		this.field4773 = 0.0F;
		this.field4766 = 0.0F;
		this.field4767 = 1.0F;
		this.field4765 = 1.0F;
		this.field4768 = 1.0F;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-62247449"
	)
	public void method8459(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4766;
		float var5 = this.field4765;
		float var6 = this.field4772;
		float var7 = this.field4774;
		this.field4766 = var2 * var4 - var3 * this.field4773;
		this.field4773 = var3 * var4 + this.field4773 * var2;
		this.field4765 = var2 * var5 - this.field4770 * var3;
		this.field4770 = var2 * this.field4770 + var5 * var3;
		this.field4772 = var6 * var2 - var3 * this.field4767;
		this.field4767 = var3 * var6 + this.field4767 * var2;
		this.field4774 = var2 * var7 - this.field4776 * var3;
		this.field4776 = this.field4776 * var2 + var7 * var3;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "1632786425"
	)
	public void method8460(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4768;
		float var5 = this.field4775;
		float var6 = this.field4771;
		float var7 = this.field4769;
		this.field4768 = var3 * this.field4773 + var2 * var4;
		this.field4773 = this.field4773 * var2 - var4 * var3;
		this.field4775 = var3 * this.field4770 + var5 * var2;
		this.field4770 = var2 * this.field4770 - var5 * var3;
		this.field4771 = var2 * var6 + var3 * this.field4767;
		this.field4767 = this.field4767 * var2 - var3 * var6;
		this.field4769 = var7 * var2 + this.field4776 * var3;
		this.field4776 = var2 * this.field4776 - var3 * var7;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-2120399841"
	)
	void method8455(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4768;
		float var5 = this.field4775;
		float var6 = this.field4771;
		float var7 = this.field4769;
		this.field4768 = var4 * var2 - this.field4766 * var3;
		this.field4766 = var2 * this.field4766 + var4 * var3;
		this.field4775 = var5 * var2 - this.field4765 * var3;
		this.field4765 = var3 * var5 + this.field4765 * var2;
		this.field4771 = var2 * var6 - var3 * this.field4772;
		this.field4772 = var3 * var6 + this.field4772 * var2;
		this.field4769 = var7 * var2 - this.field4774 * var3;
		this.field4774 = var2 * this.field4774 + var7 * var3;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "280070721"
	)
	public void method8458(float var1, float var2, float var3) {
		this.field4769 += var1;
		this.field4774 += var2;
		this.field4776 += var3;
	}

	public String toString() {
		return this.field4768 + "," + this.field4775 + "," + this.field4771 + "," + this.field4769 + "\n" + this.field4766 + "," + this.field4765 + "," + this.field4772 + "," + this.field4774 + "\n" + this.field4773 + "," + this.field4770 + "," + this.field4767 + "," + this.field4776;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)J",
		garbageValue = "502696532"
	)
	public static long method8477(CharSequence var0) {
		long var1 = 0L;
		int var3 = var0.length();

		for (int var4 = 0; var4 < var3; ++var4) {
			var1 *= 37L;
			char var5 = var0.charAt(var4);
			if (var5 >= 'A' && var5 <= 'Z') {
				var1 += (long)(var5 + 1 - 65);
			} else if (var5 >= 'a' && var5 <= 'z') {
				var1 += (long)(var5 + 1 - 97);
			} else if (var5 >= '0' && var5 <= '9') {
				var1 += (long)(var5 + 27 - 48);
			}

			if (var1 >= 177917621779460413L) {
				break;
			}
		}

		while (0L == var1 % 37L && 0L != var1) {
			var1 /= 37L;
		}

		return var1;
	}

	@ObfuscatedName("my")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1831833354"
	)
	static final String method8471(int var0) {
		return var0 < 999999999 ? Integer.toString(var0) : "*";
	}
}
