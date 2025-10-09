import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rr")
public class class453 {
	@ObfuscatedName("ab")
	float field5248;
	@ObfuscatedName("at")
	float field5237;
	@ObfuscatedName("ag")
	float field5238;
	@ObfuscatedName("aj")
	float field5239;
	@ObfuscatedName("ah")
	float field5240;
	@ObfuscatedName("af")
	float field5241;
	@ObfuscatedName("ae")
	float field5244;
	@ObfuscatedName("aq")
	float field5243;
	@ObfuscatedName("ac")
	float field5246;
	@ObfuscatedName("aa")
	float field5245;
	@ObfuscatedName("ap")
	float field5247;
	@ObfuscatedName("ad")
	float field5236;

	static {
		new class453();
	}

	public class453() {
		this.method9259();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "996867666"
	)
	void method9259() {
		this.field5236 = 0.0F;
		this.field5247 = 0.0F;
		this.field5245 = 0.0F;
		this.field5243 = 0.0F;
		this.field5244 = 0.0F;
		this.field5241 = 0.0F;
		this.field5239 = 0.0F;
		this.field5238 = 0.0F;
		this.field5237 = 0.0F;
		this.field5246 = 1.0F;
		this.field5240 = 1.0F;
		this.field5248 = 1.0F;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(FS)V",
		garbageValue = "-32198"
	)
	public void method9260(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field5237;
		float var5 = this.field5240;
		float var6 = this.field5243;
		float var7 = this.field5247;
		this.field5237 = var2 * var4 - var3 * this.field5238;
		this.field5238 = var4 * var3 + var2 * this.field5238;
		this.field5240 = var5 * var2 - this.field5241 * var3;
		this.field5241 = this.field5241 * var2 + var5 * var3;
		this.field5243 = var2 * var6 - this.field5246 * var3;
		this.field5246 = this.field5246 * var2 + var6 * var3;
		this.field5247 = var2 * var7 - this.field5236 * var3;
		this.field5236 = var3 * var7 + var2 * this.field5236;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-824192707"
	)
	public void method9261(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field5248;
		float var5 = this.field5239;
		float var6 = this.field5244;
		float var7 = this.field5245;
		this.field5248 = this.field5238 * var3 + var4 * var2;
		this.field5238 = var2 * this.field5238 - var3 * var4;
		this.field5239 = var5 * var2 + var3 * this.field5241;
		this.field5241 = var2 * this.field5241 - var3 * var5;
		this.field5244 = var6 * var2 + var3 * this.field5246;
		this.field5246 = var2 * this.field5246 - var6 * var3;
		this.field5245 = this.field5236 * var3 + var2 * var7;
		this.field5236 = this.field5236 * var2 - var3 * var7;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "34"
	)
	void method9262(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field5248;
		float var5 = this.field5239;
		float var6 = this.field5244;
		float var7 = this.field5245;
		this.field5248 = var4 * var2 - this.field5237 * var3;
		this.field5237 = var3 * var4 + this.field5237 * var2;
		this.field5239 = var5 * var2 - this.field5240 * var3;
		this.field5240 = var5 * var3 + var2 * this.field5240;
		this.field5244 = var2 * var6 - this.field5243 * var3;
		this.field5243 = this.field5243 * var2 + var6 * var3;
		this.field5245 = var2 * var7 - this.field5247 * var3;
		this.field5247 = this.field5247 * var2 + var3 * var7;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "-745100649"
	)
	public void method9263(float var1, float var2, float var3) {
		this.field5245 += var1;
		this.field5247 += var2;
		this.field5236 += var3;
	}

	public String toString() {
		return this.field5248 + "," + this.field5239 + "," + this.field5244 + "," + this.field5245 + "\n" + this.field5237 + "," + this.field5240 + "," + this.field5243 + "," + this.field5247 + "\n" + this.field5238 + "," + this.field5241 + "," + this.field5246 + "," + this.field5236;
	}
}
