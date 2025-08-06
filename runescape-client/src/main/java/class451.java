import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rq")
public class class451 {
	@ObfuscatedName("al")
	float field5077;
	@ObfuscatedName("ab")
	float field5081;
	@ObfuscatedName("ac")
	float field5078;
	@ObfuscatedName("av")
	float field5079;
	@ObfuscatedName("au")
	float field5080;
	@ObfuscatedName("as")
	float field5076;
	@ObfuscatedName("ah")
	float field5082;
	@ObfuscatedName("ap")
	float field5086;
	@ObfuscatedName("am")
	float field5083;
	@ObfuscatedName("aj")
	float field5085;
	@ObfuscatedName("ag")
	float field5084;
	@ObfuscatedName("ay")
	float field5087;

	static {
		new class451();
	}

	public class451() {
		this.method9198();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1109888408"
	)
	void method9198() {
		this.field5087 = 0.0F;
		this.field5084 = 0.0F;
		this.field5085 = 0.0F;
		this.field5086 = 0.0F;
		this.field5082 = 0.0F;
		this.field5076 = 0.0F;
		this.field5079 = 0.0F;
		this.field5078 = 0.0F;
		this.field5081 = 0.0F;
		this.field5083 = 1.0F;
		this.field5080 = 1.0F;
		this.field5077 = 1.0F;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "32768"
	)
	public void method9195(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field5081;
		float var5 = this.field5080;
		float var6 = this.field5086;
		float var7 = this.field5084;
		this.field5081 = var4 * var2 - this.field5078 * var3;
		this.field5078 = var3 * var4 + this.field5078 * var2;
		this.field5080 = var5 * var2 - var3 * this.field5076;
		this.field5076 = var2 * this.field5076 + var3 * var5;
		this.field5086 = var6 * var2 - var3 * this.field5083;
		this.field5083 = this.field5083 * var2 + var6 * var3;
		this.field5084 = var2 * var7 - var3 * this.field5087;
		this.field5087 = this.field5087 * var2 + var3 * var7;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-906889159"
	)
	public void method9205(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field5077;
		float var5 = this.field5079;
		float var6 = this.field5082;
		float var7 = this.field5085;
		this.field5077 = var3 * this.field5078 + var4 * var2;
		this.field5078 = this.field5078 * var2 - var4 * var3;
		this.field5079 = var3 * this.field5076 + var2 * var5;
		this.field5076 = this.field5076 * var2 - var3 * var5;
		this.field5082 = this.field5083 * var3 + var2 * var6;
		this.field5083 = var2 * this.field5083 - var6 * var3;
		this.field5085 = this.field5087 * var3 + var2 * var7;
		this.field5087 = var2 * this.field5087 - var7 * var3;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "223920238"
	)
	void method9194(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field5077;
		float var5 = this.field5079;
		float var6 = this.field5082;
		float var7 = this.field5085;
		this.field5077 = var2 * var4 - this.field5081 * var3;
		this.field5081 = var2 * this.field5081 + var4 * var3;
		this.field5079 = var5 * var2 - this.field5080 * var3;
		this.field5080 = var2 * this.field5080 + var5 * var3;
		this.field5082 = var2 * var6 - this.field5086 * var3;
		this.field5086 = var2 * this.field5086 + var3 * var6;
		this.field5085 = var2 * var7 - var3 * this.field5084;
		this.field5084 = var2 * this.field5084 + var3 * var7;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(FFFB)V",
		garbageValue = "5"
	)
	public void method9191(float var1, float var2, float var3) {
		this.field5085 += var1;
		this.field5084 += var2;
		this.field5087 += var3;
	}

	public String toString() {
		return this.field5077 + "," + this.field5079 + "," + this.field5082 + "," + this.field5085 + "\n" + this.field5081 + "," + this.field5080 + "," + this.field5086 + "," + this.field5084 + "\n" + this.field5078 + "," + this.field5076 + "," + this.field5083 + "," + this.field5087;
	}
}
