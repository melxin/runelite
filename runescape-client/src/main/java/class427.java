import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qs")
public final class class427 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lqs;"
	)
	static class427[] field4768;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1349560017
	)
	static int field4769;
	@ObfuscatedName("ae")
	float field4770;
	@ObfuscatedName("ao")
	float field4771;
	@ObfuscatedName("ac")
	float field4772;
	@ObfuscatedName("aj")
	float field4773;

	static {
		field4768 = new class427[0];
		Calendar.method7436(100);
		new class427();
	}

	class427() {
		this.method8180();
	}

	public class427(float var1, float var2, float var3) {
		this.method8164(var1, var2, var3);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2072750898"
	)
	public void method8199() {
		synchronized(field4768) {
			if (field4769 < NPCComposition.field2035 - 1) {
				field4768[++field4769 - 1] = this;
			}

		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "575186970"
	)
	void method8162(float var1, float var2, float var3, float var4) {
		this.field4770 = var1;
		this.field4771 = var2;
		this.field4772 = var3;
		this.field4773 = var4;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "1619332226"
	)
	public void method8163(float var1, float var2, float var3, float var4) {
		float var5 = (float)Math.sin((double)(var4 * 0.5F));
		float var6 = (float)Math.cos((double)(0.5F * var4));
		this.field4770 = var1 * var5;
		this.field4771 = var5 * var2;
		this.field4772 = var5 * var3;
		this.field4773 = var6;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "1832913237"
	)
	public void method8164(float var1, float var2, float var3) {
		this.method8163(0.0F, 1.0F, 0.0F, var1);
		class427 var4 = class309.method6386();
		var4.method8163(1.0F, 0.0F, 0.0F, var2);
		this.method8166(var4);
		var4.method8163(0.0F, 0.0F, 1.0F, var3);
		this.method8166(var4);
		var4.method8199();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1776152987"
	)
	final void method8180() {
		this.field4772 = 0.0F;
		this.field4771 = 0.0F;
		this.field4770 = 0.0F;
		this.field4773 = 1.0F;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lqs;B)V",
		garbageValue = "16"
	)
	public final void method8166(class427 var1) {
		this.method8162(var1.field4771 * this.field4772 + var1.field4773 * this.field4770 + var1.field4770 * this.field4773 - var1.field4772 * this.field4771, this.field4771 * var1.field4773 - this.field4772 * var1.field4770 + this.field4773 * var1.field4771 + var1.field4772 * this.field4770, this.field4773 * var1.field4772 + (this.field4772 * var1.field4773 + this.field4771 * var1.field4770 - var1.field4771 * this.field4770), this.field4773 * var1.field4773 - this.field4770 * var1.field4770 - this.field4771 * var1.field4771 - this.field4772 * var1.field4772);
	}

	public int hashCode() {
		boolean var1 = true;
		float var2 = 1.0F;
		var2 = var2 * 31.0F + this.field4770;
		var2 = var2 * 31.0F + this.field4771;
		var2 = var2 * 31.0F + this.field4772;
		var2 = var2 * 31.0F + this.field4773;
		return (int)var2;
	}

	public String toString() {
		return this.field4770 + "," + this.field4771 + "," + this.field4772 + "," + this.field4773;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class427)) {
			return false;
		} else {
			class427 var2 = (class427)var1;
			return this.field4770 == var2.field4770 && this.field4771 == var2.field4771 && var2.field4772 == this.field4772 && var2.field4773 == this.field4773;
		}
	}
}
