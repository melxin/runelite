import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ra")
public final class class461 {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[Lra;"
	)
	static final class461[] field5251;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1021415989
	)
	static final int field5246;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -603351739
	)
	static int field5245;
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "[Lxt;"
	)
	@Export("worldSelectBackSprites")
	static SpritePixels[] worldSelectBackSprites;
	@ObfuscatedName("an")
	float field5254;
	@ObfuscatedName("ae")
	float field5249;
	@ObfuscatedName("aj")
	float field5250;
	@ObfuscatedName("ak")
	float field5247;

	static {
		new class461();
		field5245 = 0;
		field5246 = 16;
		field5251 = new class461[field5246];
	}

	class461() {
		this.method9369();
	}

	class461(float var1, float var2, float var3, float var4) {
		this.method9361(var1, var2, var3, var4);
	}

	@ObfuscatedSignature(
		descriptor = "(Lra;)V"
	)
	class461(class461 var1) {
		this.method9364(var1);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-70"
	)
	public void method9362() {
		synchronized(field5251) {
			if (field5245 < field5246) {
				field5251[++field5245 - 1] = this;
			}

		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(FFFFB)V",
		garbageValue = "116"
	)
	void method9361(float var1, float var2, float var3, float var4) {
		this.field5254 = var1;
		this.field5249 = var2;
		this.field5250 = var3;
		this.field5247 = var4;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lra;I)V",
		garbageValue = "743318851"
	)
	void method9364(class461 var1) {
		this.field5254 = var1.field5254;
		this.field5249 = var1.field5249;
		this.field5250 = var1.field5250;
		this.field5247 = var1.field5247;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lrx;FS)V",
		garbageValue = "1024"
	)
	void method9370(ProjectionCoord var1, float var2) {
		this.method9400(var1.x, var1.z, var1.y, var2);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "1709440975"
	)
	public void method9400(float var1, float var2, float var3, float var4) {
		float var5 = (float)Math.sin((double)(0.5F * var4));
		float var6 = (float)Math.cos((double)(0.5F * var4));
		this.field5254 = var5 * var1;
		this.field5249 = var2 * var5;
		this.field5250 = var5 * var3;
		this.field5247 = var6;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "-1574760321"
	)
	public void method9367(float var1, float var2, float var3) {
		this.method9400(0.0F, 1.0F, 0.0F, var1);
		class461 var4 = class151.method3974();
		var4.method9400(1.0F, 0.0F, 0.0F, var2);
		this.method9373(var4);
		var4.method9400(0.0F, 0.0F, 1.0F, var3);
		this.method9373(var4);
		var4.method9362();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lrx;Lrx;I)V",
		garbageValue = "701614602"
	)
	public void method9368(ProjectionCoord var1, ProjectionCoord var2) {
		ProjectionCoord var3 = class451.method9146(var1, var2);
		float var4 = var1.method9303(var2);
		float var6 = (float)Math.acos((double)var4);
		var3.method9299();
		this.method9370(var3, var6);
		var3.release();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1845539078"
	)
	final void method9369() {
		this.field5250 = 0.0F;
		this.field5249 = 0.0F;
		this.field5254 = 0.0F;
		this.field5247 = 1.0F;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-92"
	)
	final void method9360() {
		this.field5254 = -this.field5254;
		this.field5249 = -this.field5249;
		this.field5250 = -this.field5250;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-108"
	)
	public final void method9371() {
		float var3 = this.method9372(this);
		float var1 = (float)Math.sqrt((double)var3);
		var3 = 1.0F / var1;
		this.field5254 *= var3;
		this.field5249 *= var3;
		this.field5250 *= var3;
		this.field5247 *= var3;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lra;I)F",
		garbageValue = "1153725407"
	)
	final float method9372(class461 var1) {
		return this.field5247 * var1.field5247 + var1.field5250 * this.field5250 + this.field5249 * var1.field5249 + var1.field5254 * this.field5254;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lra;B)V",
		garbageValue = "127"
	)
	public final void method9373(class461 var1) {
		this.method9361(var1.field5247 * this.field5254 + var1.field5254 * this.field5247 + this.field5250 * var1.field5249 - var1.field5250 * this.field5249, var1.field5249 * this.field5247 + (var1.field5247 * this.field5249 - this.field5250 * var1.field5254) + this.field5254 * var1.field5250, this.field5250 * var1.field5247 + var1.field5254 * this.field5249 - this.field5254 * var1.field5249 + var1.field5250 * this.field5247, var1.field5247 * this.field5247 - var1.field5254 * this.field5254 - var1.field5249 * this.field5249 - this.field5250 * var1.field5250);
	}

	public int hashCode() {
		boolean var1 = true;
		float var2 = 1.0F;
		var2 = var2 * 31.0F + this.field5254;
		var2 = this.field5249 + 31.0F * var2;
		var2 = var2 * 31.0F + this.field5250;
		var2 = this.field5247 + var2 * 31.0F;
		return (int)var2;
	}

	public String toString() {
		return this.field5254 + "," + this.field5249 + "," + this.field5250 + "," + this.field5247;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class461)) {
			return false;
		} else {
			class461 var2 = (class461)var1;
			return this.field5254 == var2.field5254 && this.field5249 == var2.field5249 && var2.field5250 == this.field5250 && var2.field5247 == this.field5247;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)Lxy;",
		garbageValue = "89"
	)
	public static PrivateChatMode method9363(int var0) {
		PrivateChatMode[] var1 = class33.method517();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			PrivateChatMode var3 = var1[var2];
			if (var0 == var3.field6176) {
				return var3;
			}
		}

		return null;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lut;Lwh;ZI)V",
		garbageValue = "-928498657"
	)
	static void method9375(DynamicArray var0, class586 var1, boolean var2) {
		if (var0 == null) {
			throw new RuntimeException();
		} else if (var1 != null && var0.field5584 != var1) {
			throw new RuntimeException();
		} else if (var2 && !var0.field5585) {
			throw new RuntimeException();
		}
	}
}
