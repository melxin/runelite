import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rt")
public final class class451 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lrt;"
	)
	static final class451[] field5228;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1406761839
	)
	static final int field5225;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 543635739
	)
	static int field5224;
	@ObfuscatedName("aj")
	float field5222;
	@ObfuscatedName("ah")
	float field5226;
	@ObfuscatedName("af")
	float field5227;
	@ObfuscatedName("ae")
	float field5223;

	static {
		new class451();
		field5224 = 0;
		field5225 = 16;
		field5228 = new class451[field5225];
	}

	class451() {
		this.method9144();
	}

	class451(float var1, float var2, float var3, float var4) {
		this.method9126(var1, var2, var3, var4);
	}

	@ObfuscatedSignature(
		descriptor = "(Lrt;)V"
	)
	class451(class451 var1) {
		this.method9145(var1);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1177012732"
	)
	public void method9120() {
		synchronized(field5228) {
			if (field5224 < field5225) {
				field5228[++field5224 - 1] = this;
			}

		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(FFFFB)V",
		garbageValue = "-107"
	)
	void method9126(float var1, float var2, float var3, float var4) {
		this.field5222 = var1;
		this.field5226 = var2;
		this.field5227 = var3;
		this.field5223 = var4;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lrt;B)V",
		garbageValue = "-22"
	)
	void method9145(class451 var1) {
		this.field5222 = var1.field5222;
		this.field5226 = var1.field5226;
		this.field5227 = var1.field5227;
		this.field5223 = var1.field5223;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lre;FI)V",
		garbageValue = "1576887687"
	)
	void method9162(ProjectionCoord var1, float var2) {
		this.method9123(var1.x, var1.z, var1.y, var2);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "350347093"
	)
	public void method9123(float var1, float var2, float var3, float var4) {
		float var5 = (float)Math.sin((double)(0.5F * var4));
		float var6 = (float)Math.cos((double)(0.5F * var4));
		this.field5222 = var1 * var5;
		this.field5226 = var2 * var5;
		this.field5227 = var5 * var3;
		this.field5223 = var6;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "1389879152"
	)
	public void method9130(float var1, float var2, float var3) {
		this.method9123(0.0F, 1.0F, 0.0F, var1);
		class451 var4 = class135.method3746();
		var4.method9123(1.0F, 0.0F, 0.0F, var2);
		this.method9129(var4);
		var4.method9123(0.0F, 0.0F, 1.0F, var3);
		this.method9129(var4);
		var4.method9120();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lre;Lre;I)V",
		garbageValue = "-722988358"
	)
	public void method9153(ProjectionCoord var1, ProjectionCoord var2) {
		ProjectionCoord var3 = NPC.method2851(var1, var2);
		float var4 = var1.method9074(var2);
		float var6 = (float)Math.acos((double)var4);
		var3.method9070();
		this.method9162(var3, var6);
		var3.release();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "659119611"
	)
	final void method9144() {
		this.field5227 = 0.0F;
		this.field5226 = 0.0F;
		this.field5222 = 0.0F;
		this.field5223 = 1.0F;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-763496692"
	)
	final void method9127() {
		this.field5222 = -this.field5222;
		this.field5226 = -this.field5226;
		this.field5227 = -this.field5227;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-774176169"
	)
	public final void method9128() {
		float var1 = 1.0F / ServerPacket.method7056(this);
		this.field5222 *= var1;
		this.field5226 *= var1;
		this.field5227 *= var1;
		this.field5223 *= var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lrt;B)F",
		garbageValue = "5"
	)
	final float method9152(class451 var1) {
		return this.field5226 * var1.field5226 + this.field5222 * var1.field5222 + var1.field5227 * this.field5227 + var1.field5223 * this.field5223;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lrt;I)V",
		garbageValue = "-1505183502"
	)
	public final void method9129(class451 var1) {
		this.method9126(var1.field5226 * this.field5227 + var1.field5223 * this.field5222 + var1.field5222 * this.field5223 - var1.field5227 * this.field5226, var1.field5227 * this.field5222 + var1.field5223 * this.field5226 - var1.field5222 * this.field5227 + var1.field5226 * this.field5223, this.field5227 * var1.field5223 + var1.field5222 * this.field5226 - this.field5222 * var1.field5226 + this.field5223 * var1.field5227, var1.field5223 * this.field5223 - var1.field5222 * this.field5222 - this.field5226 * var1.field5226 - var1.field5227 * this.field5227);
	}

	public int hashCode() {
		boolean var1 = true;
		float var2 = 1.0F;
		var2 = 31.0F * var2 + this.field5222;
		var2 = 31.0F * var2 + this.field5226;
		var2 = 31.0F * var2 + this.field5227;
		var2 = var2 * 31.0F + this.field5223;
		return (int)var2;
	}

	public String toString() {
		return this.field5222 + "," + this.field5226 + "," + this.field5227 + "," + this.field5223;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class451)) {
			return false;
		} else {
			class451 var2 = (class451)var1;
			return this.field5222 == var2.field5222 && var2.field5226 == this.field5226 && var2.field5227 == this.field5227 && var2.field5223 == this.field5223;
		}
	}
}
