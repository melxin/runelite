import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rj")
public class class445 {
	@ObfuscatedName("ab")
	float field4927;
	@ObfuscatedName("ay")
	float field4916;
	@ObfuscatedName("au")
	float field4919;
	@ObfuscatedName("ad")
	float field4924;
	@ObfuscatedName("ah")
	float field4920;
	@ObfuscatedName("ac")
	float field4921;
	@ObfuscatedName("ao")
	float field4918;
	@ObfuscatedName("af")
	float field4923;
	@ObfuscatedName("aa")
	float field4922;
	@ObfuscatedName("as")
	float field4925;
	@ObfuscatedName("ae")
	float field4926;
	@ObfuscatedName("ax")
	float field4917;

	static {
		new class445();
	}

	public class445() {
		this.method8498();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "327051610"
	)
	void method8498() {
		this.field4917 = 0.0F;
		this.field4926 = 0.0F;
		this.field4925 = 0.0F;
		this.field4923 = 0.0F;
		this.field4918 = 0.0F;
		this.field4921 = 0.0F;
		this.field4924 = 0.0F;
		this.field4919 = 0.0F;
		this.field4916 = 0.0F;
		this.field4922 = 1.0F;
		this.field4920 = 1.0F;
		this.field4927 = 1.0F;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "1733088576"
	)
	public void method8481(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4916;
		float var5 = this.field4920;
		float var6 = this.field4923;
		float var7 = this.field4926;
		this.field4916 = var2 * var4 - var3 * this.field4919;
		this.field4919 = this.field4919 * var2 + var4 * var3;
		this.field4920 = var2 * var5 - this.field4921 * var3;
		this.field4921 = var3 * var5 + var2 * this.field4921;
		this.field4923 = var2 * var6 - this.field4922 * var3;
		this.field4922 = var6 * var3 + this.field4922 * var2;
		this.field4926 = var2 * var7 - var3 * this.field4917;
		this.field4917 = this.field4917 * var2 + var7 * var3;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-109042634"
	)
	public void method8482(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4927;
		float var5 = this.field4924;
		float var6 = this.field4918;
		float var7 = this.field4925;
		this.field4927 = var2 * var4 + this.field4919 * var3;
		this.field4919 = var2 * this.field4919 - var4 * var3;
		this.field4924 = var2 * var5 + this.field4921 * var3;
		this.field4921 = var2 * this.field4921 - var3 * var5;
		this.field4918 = var3 * this.field4922 + var2 * var6;
		this.field4922 = this.field4922 * var2 - var6 * var3;
		this.field4925 = this.field4917 * var3 + var7 * var2;
		this.field4917 = this.field4917 * var2 - var7 * var3;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-320433657"
	)
	void method8491(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4927;
		float var5 = this.field4924;
		float var6 = this.field4918;
		float var7 = this.field4925;
		this.field4927 = var4 * var2 - this.field4916 * var3;
		this.field4916 = var3 * var4 + var2 * this.field4916;
		this.field4924 = var5 * var2 - var3 * this.field4920;
		this.field4920 = var3 * var5 + var2 * this.field4920;
		this.field4918 = var2 * var6 - this.field4923 * var3;
		this.field4923 = var6 * var3 + var2 * this.field4923;
		this.field4925 = var2 * var7 - this.field4926 * var3;
		this.field4926 = this.field4926 * var2 + var7 * var3;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(FFFB)V",
		garbageValue = "1"
	)
	public void method8483(float var1, float var2, float var3) {
		this.field4925 += var1;
		this.field4926 += var2;
		this.field4917 += var3;
	}

	public String toString() {
		return this.field4927 + "," + this.field4924 + "," + this.field4918 + "," + this.field4925 + "\n" + this.field4916 + "," + this.field4920 + "," + this.field4923 + "," + this.field4926 + "\n" + this.field4919 + "," + this.field4921 + "," + this.field4922 + "," + this.field4917;
	}
}
