import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rc")
public final class class449 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Lrc;"
	)
	static class449[] field5068;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 856360719
	)
	static int field5064;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1642356603
	)
	static int field5065;
	@ObfuscatedName("av")
	float field5063;
	@ObfuscatedName("au")
	float field5067;
	@ObfuscatedName("as")
	float field5066;
	@ObfuscatedName("ah")
	float field5069;

	static {
		new class449();
		field5068 = new class449[0];
		field5064 = 16;
		field5068 = new class449[16];
		field5065 = 0;
	}

	class449() {
		this.method9079();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "32"
	)
	public void method9075() {
		synchronized(field5068) {
			if (field5065 < field5064) {
				field5068[++field5065 - 1] = this;
			}

		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "1816732860"
	)
	void method9076(float var1, float var2, float var3, float var4) {
		this.field5063 = var1;
		this.field5067 = var2;
		this.field5066 = var3;
		this.field5069 = var4;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "1598778752"
	)
	public void method9093(float var1, float var2, float var3, float var4) {
		float var5 = (float)Math.sin((double)(0.5F * var4));
		float var6 = (float)Math.cos((double)(0.5F * var4));
		this.field5063 = var5 * var1;
		this.field5067 = var2 * var5;
		this.field5066 = var3 * var5;
		this.field5069 = var6;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(FFFB)V",
		garbageValue = "82"
	)
	public void method9078(float var1, float var2, float var3) {
		this.method9093(0.0F, 1.0F, 0.0F, var1);
		class449 var4 = StudioGame.method8178();
		var4.method9093(1.0F, 0.0F, 0.0F, var2);
		this.method9080(var4);
		var4.method9093(0.0F, 0.0F, 1.0F, var3);
		this.method9080(var4);
		var4.method9075();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "845135122"
	)
	final void method9079() {
		this.field5066 = 0.0F;
		this.field5067 = 0.0F;
		this.field5063 = 0.0F;
		this.field5069 = 1.0F;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lrc;B)V",
		garbageValue = "93"
	)
	public final void method9080(class449 var1) {
		this.method9076(this.field5063 * var1.field5069 + this.field5069 * var1.field5063 + this.field5066 * var1.field5067 - var1.field5066 * this.field5067, this.field5067 * var1.field5069 - this.field5066 * var1.field5063 + var1.field5067 * this.field5069 + this.field5063 * var1.field5066, this.field5069 * var1.field5066 + (var1.field5063 * this.field5067 + this.field5066 * var1.field5069 - var1.field5067 * this.field5063), var1.field5069 * this.field5069 - var1.field5063 * this.field5063 - var1.field5067 * this.field5067 - var1.field5066 * this.field5066);
	}

	public int hashCode() {
		boolean var1 = true;
		float var2 = 1.0F;
		var2 = this.field5063 + 31.0F * var2;
		var2 = 31.0F * var2 + this.field5067;
		var2 = this.field5066 + var2 * 31.0F;
		var2 = 31.0F * var2 + this.field5069;
		return (int)var2;
	}

	public String toString() {
		return this.field5063 + "," + this.field5067 + "," + this.field5066 + "," + this.field5069;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class449)) {
			return false;
		} else {
			class449 var2 = (class449)var1;
			return this.field5063 == var2.field5063 && var2.field5067 == this.field5067 && this.field5066 == var2.field5066 && var2.field5069 == this.field5069;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lpx;II)V",
		garbageValue = "-1464603209"
	)
	static void method9087(AbstractArchive var0, int var1) {
		if ((var1 & class578.field5780.rsOrdinal()) != 0) {
			class205.logoSprite = class484.SpriteBuffer_getIndexedSpriteByName(var0, "logo_deadman_mode", "");
		} else if ((var1 & class578.field5766.rsOrdinal()) != 0) {
			class205.logoSprite = class484.SpriteBuffer_getIndexedSpriteByName(var0, "logo_seasonal_mode", "");
		} else if ((var1 & class578.field5759.rsOrdinal()) != 0) {
			class205.logoSprite = class484.SpriteBuffer_getIndexedSpriteByName(var0, "logo_speedrunning", "");
		} else {
			class205.logoSprite = class484.SpriteBuffer_getIndexedSpriteByName(var0, "logo", "");
		}

	}
}
