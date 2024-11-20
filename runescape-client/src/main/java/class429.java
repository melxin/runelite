import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qn")
public class class429 {
	@ObfuscatedName("ab")
	float field4789;
	@ObfuscatedName("aw")
	float field4782;
	@ObfuscatedName("at")
	float field4783;
	@ObfuscatedName("ae")
	float field4788;
	@ObfuscatedName("ao")
	float field4787;
	@ObfuscatedName("ac")
	float field4786;
	@ObfuscatedName("aj")
	float field4781;
	@ObfuscatedName("av")
	float field4792;
	@ObfuscatedName("au")
	float field4784;
	@ObfuscatedName("an")
	float field4790;
	@ObfuscatedName("af")
	float field4791;
	@ObfuscatedName("ai")
	float field4785;

	static {
		new class429();
	}

	public class429() {
		this.method8299();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "32"
	)
	void method8299() {
		this.field4785 = 0.0F;
		this.field4791 = 0.0F;
		this.field4790 = 0.0F;
		this.field4792 = 0.0F;
		this.field4781 = 0.0F;
		this.field4786 = 0.0F;
		this.field4788 = 0.0F;
		this.field4783 = 0.0F;
		this.field4782 = 0.0F;
		this.field4784 = 1.0F;
		this.field4787 = 1.0F;
		this.field4789 = 1.0F;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "715497630"
	)
	public void method8310(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4782;
		float var5 = this.field4787;
		float var6 = this.field4792;
		float var7 = this.field4791;
		this.field4782 = var2 * var4 - this.field4783 * var3;
		this.field4783 = this.field4783 * var2 + var4 * var3;
		this.field4787 = var5 * var2 - var3 * this.field4786;
		this.field4786 = var3 * var5 + this.field4786 * var2;
		this.field4792 = var2 * var6 - this.field4784 * var3;
		this.field4784 = var6 * var3 + this.field4784 * var2;
		this.field4791 = var7 * var2 - var3 * this.field4785;
		this.field4785 = var2 * this.field4785 + var7 * var3;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-645634484"
	)
	public void method8301(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4789;
		float var5 = this.field4788;
		float var6 = this.field4781;
		float var7 = this.field4790;
		this.field4789 = var2 * var4 + var3 * this.field4783;
		this.field4783 = this.field4783 * var2 - var3 * var4;
		this.field4788 = this.field4786 * var3 + var2 * var5;
		this.field4786 = this.field4786 * var2 - var3 * var5;
		this.field4781 = var6 * var2 + this.field4784 * var3;
		this.field4784 = this.field4784 * var2 - var3 * var6;
		this.field4790 = var2 * var7 + var3 * this.field4785;
		this.field4785 = var2 * this.field4785 - var7 * var3;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-2023894857"
	)
	void method8303(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4789;
		float var5 = this.field4788;
		float var6 = this.field4781;
		float var7 = this.field4790;
		this.field4789 = var4 * var2 - this.field4782 * var3;
		this.field4782 = var3 * var4 + var2 * this.field4782;
		this.field4788 = var2 * var5 - var3 * this.field4787;
		this.field4787 = var2 * this.field4787 + var5 * var3;
		this.field4781 = var2 * var6 - this.field4792 * var3;
		this.field4792 = var2 * this.field4792 + var6 * var3;
		this.field4790 = var2 * var7 - this.field4791 * var3;
		this.field4791 = var3 * var7 + this.field4791 * var2;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "931674506"
	)
	public void method8304(float var1, float var2, float var3) {
		this.field4790 += var1;
		this.field4791 += var2;
		this.field4785 += var3;
	}

	public String toString() {
		return this.field4789 + "," + this.field4788 + "," + this.field4781 + "," + this.field4790 + "\n" + this.field4782 + "," + this.field4787 + "," + this.field4792 + "," + this.field4791 + "\n" + this.field4783 + "," + this.field4786 + "," + this.field4784 + "," + this.field4785;
	}
}
