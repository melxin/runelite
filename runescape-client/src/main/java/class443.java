import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rc")
public final class class443 {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Lrc;"
	)
	static class443[] field4930;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1986431893
	)
	static int field4927;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -19024385
	)
	static int field4926;
	@ObfuscatedName("up")
	static boolean field4925;
	@ObfuscatedName("af")
	float field4931;
	@ObfuscatedName("as")
	float field4928;
	@ObfuscatedName("aq")
	float field4929;
	@ObfuscatedName("av")
	float field4924;

	static {
		new class443();
		field4930 = new class443[0];
		field4927 = 16;
		field4930 = new class443[16];
		field4926 = 0;
	}

	class443() {
		this.method8400();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1342351555"
	)
	public void method8397() {
		synchronized(field4930) {
			if (field4926 < field4927) {
				field4930[++field4926 - 1] = this;
			}

		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "-212231234"
	)
	void method8398(float var1, float var2, float var3, float var4) {
		this.field4931 = var1;
		this.field4928 = var2;
		this.field4929 = var3;
		this.field4924 = var4;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "1291818807"
	)
	public void method8401(float var1, float var2, float var3, float var4) {
		float var5 = (float)Math.sin((double)(var4 * 0.5F));
		float var6 = (float)Math.cos((double)(var4 * 0.5F));
		this.field4931 = var1 * var5;
		this.field4928 = var2 * var5;
		this.field4929 = var5 * var3;
		this.field4924 = var6;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "-1649396250"
	)
	public void method8399(float var1, float var2, float var3) {
		this.method8401(0.0F, 1.0F, 0.0F, var1);
		class443 var4 = IntProjection.method3961();
		var4.method8401(1.0F, 0.0F, 0.0F, var2);
		this.method8415(var4);
		var4.method8401(0.0F, 0.0F, 1.0F, var3);
		this.method8415(var4);
		var4.method8397();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "173957408"
	)
	final void method8400() {
		this.field4929 = 0.0F;
		this.field4928 = 0.0F;
		this.field4931 = 0.0F;
		this.field4924 = 1.0F;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lrc;B)V",
		garbageValue = "32"
	)
	public final void method8415(class443 var1) {
		this.method8398(var1.field4931 * this.field4924 + var1.field4924 * this.field4931 + var1.field4928 * this.field4929 - this.field4928 * var1.field4929, this.field4931 * var1.field4929 + var1.field4928 * this.field4924 + (var1.field4924 * this.field4928 - this.field4929 * var1.field4931), var1.field4931 * this.field4928 + var1.field4924 * this.field4929 - var1.field4928 * this.field4931 + this.field4924 * var1.field4929, var1.field4924 * this.field4924 - var1.field4931 * this.field4931 - this.field4928 * var1.field4928 - var1.field4929 * this.field4929);
	}

	public int hashCode() {
		boolean var1 = true;
		float var2 = 1.0F;
		var2 = this.field4931 + 31.0F * var2;
		var2 = 31.0F * var2 + this.field4928;
		var2 = 31.0F * var2 + this.field4929;
		var2 = this.field4924 + var2 * 31.0F;
		return (int)var2;
	}

	public String toString() {
		return this.field4931 + "," + this.field4928 + "," + this.field4929 + "," + this.field4924;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class443)) {
			return false;
		} else {
			class443 var2 = (class443)var1;
			return this.field4931 == var2.field4931 && this.field4928 == var2.field4928 && this.field4929 == var2.field4929 && this.field4924 == var2.field4924;
		}
	}
}
