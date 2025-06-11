import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rw")
public final class class446 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Lrw;"
	)
	static class446[] field4979;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1454620925
	)
	static int field4973;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1880340437
	)
	static int field4978;
	@ObfuscatedName("ai")
	float field4975;
	@ObfuscatedName("al")
	float field4976;
	@ObfuscatedName("ac")
	float field4977;
	@ObfuscatedName("aa")
	float field4972;

	static {
		new class446();
		field4979 = new class446[0];
		field4973 = 16;
		field4979 = new class446[16];
		field4978 = 0;
	}

	class446() {
		this.method8744();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-655322342"
	)
	public void method8769() {
		synchronized(field4979) {
			if (field4978 < field4973) {
				field4979[++field4978 - 1] = this;
			}

		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "-1695580763"
	)
	void method8741(float var1, float var2, float var3, float var4) {
		this.field4975 = var1;
		this.field4976 = var2;
		this.field4977 = var3;
		this.field4972 = var4;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "1795429539"
	)
	public void method8770(float var1, float var2, float var3, float var4) {
		float var5 = (float)Math.sin((double)(0.5F * var4));
		float var6 = (float)Math.cos((double)(var4 * 0.5F));
		this.field4975 = var5 * var1;
		this.field4976 = var2 * var5;
		this.field4977 = var3 * var5;
		this.field4972 = var6;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "-495368862"
	)
	public void method8740(float var1, float var2, float var3) {
		this.method8770(0.0F, 1.0F, 0.0F, var1);
		class446 var4 = GrandExchangeEvent.method8240();
		var4.method8770(1.0F, 0.0F, 0.0F, var2);
		this.method8743(var4);
		var4.method8770(0.0F, 0.0F, 1.0F, var3);
		this.method8743(var4);
		var4.method8769();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2085242843"
	)
	final void method8744() {
		this.field4977 = 0.0F;
		this.field4976 = 0.0F;
		this.field4975 = 0.0F;
		this.field4972 = 1.0F;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lrw;I)V",
		garbageValue = "-1952176513"
	)
	public final void method8743(class446 var1) {
		this.method8741(this.field4977 * var1.field4976 + var1.field4975 * this.field4972 + this.field4975 * var1.field4972 - var1.field4977 * this.field4976, var1.field4972 * this.field4976 - var1.field4975 * this.field4977 + var1.field4976 * this.field4972 + this.field4975 * var1.field4977, var1.field4977 * this.field4972 + (this.field4976 * var1.field4975 + this.field4977 * var1.field4972 - this.field4975 * var1.field4976), this.field4972 * var1.field4972 - var1.field4975 * this.field4975 - var1.field4976 * this.field4976 - this.field4977 * var1.field4977);
	}

	public int hashCode() {
		boolean var1 = true;
		float var2 = 1.0F;
		var2 = 31.0F * var2 + this.field4975;
		var2 = var2 * 31.0F + this.field4976;
		var2 = this.field4977 + 31.0F * var2;
		var2 = this.field4972 + var2 * 31.0F;
		return (int)var2;
	}

	public String toString() {
		return this.field4975 + "," + this.field4976 + "," + this.field4977 + "," + this.field4972;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class446)) {
			return false;
		} else {
			class446 var2 = (class446)var1;
			return this.field4975 == var2.field4975 && var2.field4976 == this.field4976 && this.field4977 == var2.field4977 && var2.field4972 == this.field4972;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1467820326"
	)
	static int method8755(int var0) {
		return var0 - 1;
	}
}
