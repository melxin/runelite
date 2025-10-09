import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("re")
public class class450 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lre;"
	)
	public static final class450 field5220;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lre;"
	)
	public static final class450 field5212;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lre;"
	)
	public static final class450 field5211;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lre;"
	)
	public static final class450 field5213;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lre;"
	)
	static final class450[] field5214;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -122179541
	)
	static final int field5215;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1136280245
	)
	static int field5210;
	@ObfuscatedName("ax")
	@Export("Tiles_hueMultiplier")
	static int[] Tiles_hueMultiplier;
	@ObfuscatedName("pa")
	@ObfuscatedSignature(
		descriptor = "[Lxc;"
	)
	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;
	@ObfuscatedName("aq")
	public float field5216;
	@ObfuscatedName("ac")
	public float field5218;
	@ObfuscatedName("aa")
	public float field5219;

	static {
		field5220 = new class450(0.0F, 0.0F, 0.0F);
		new class450(1.0F, 1.0F, 1.0F);
		new class450(1.0F, 0.0F, 0.0F);
		field5212 = new class450(0.0F, 1.0F, 0.0F);
		new class450(0.0F, 0.0F, 1.0F);
		new class450(1.0F, 0.0F, 0.0F);
		new class450(-1.0F, 0.0F, 0.0F);
		new class450(0.0F, 0.0F, 1.0F);
		field5211 = new class450(0.0F, 0.0F, -1.0F);
		new class450(0.0F, 1.0F, 0.0F);
		field5213 = new class450(0.0F, -1.0F, 0.0F);
		field5210 = 0;
		field5215 = 16;
		field5214 = new class450[field5215];
	}

	public class450() {
	}

	class450(float var1, float var2, float var3) {
		this.field5216 = var1;
		this.field5218 = var2;
		this.field5219 = var3;
	}

	@ObfuscatedSignature(
		descriptor = "(Lre;)V"
	)
	class450(class450 var1) {
		this.field5216 = var1.field5216;
		this.field5218 = var1.field5218;
		this.field5219 = var1.field5219;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-947600722"
	)
	public void method9065() {
		synchronized(field5214) {
			if (field5210 < field5215) {
				field5214[++field5210 - 1] = this;
			}

		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "-471208602"
	)
	public void method9066(float var1, float var2, float var3) {
		this.field5216 = var1;
		this.field5218 = var2;
		this.field5219 = var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lre;I)V",
		garbageValue = "-1731222272"
	)
	void method9067(class450 var1) {
		this.method9066(var1.field5216, var1.field5218, var1.field5219);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-3"
	)
	final void method9068() {
		this.field5219 = 0.0F;
		this.field5218 = 0.0F;
		this.field5216 = 0.0F;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lre;B)Z",
		garbageValue = "83"
	)
	boolean method9085(class450 var1) {
		return var1.field5216 == this.field5216 && this.field5218 == var1.field5218 && var1.field5219 == this.field5219;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "59"
	)
	public final void method9070() {
		float var1 = 1.0F / this.method9076();
		this.field5216 *= var1;
		this.field5218 *= var1;
		this.field5219 *= var1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lre;I)V",
		garbageValue = "-2041581085"
	)
	final void method9064(class450 var1) {
		this.field5216 += var1.field5216;
		this.field5218 += var1.field5218;
		this.field5219 += var1.field5219;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "-712492383"
	)
	public final void method9072(float var1, float var2, float var3) {
		this.field5216 += var1;
		this.field5218 += var2;
		this.field5219 += var3;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lre;I)V",
		garbageValue = "1197334661"
	)
	public final void method9073(class450 var1) {
		this.field5216 -= var1.field5216;
		this.field5218 -= var1.field5218;
		this.field5219 -= var1.field5219;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lre;I)F",
		garbageValue = "478068504"
	)
	public final float method9074(class450 var1) {
		return this.field5219 * var1.field5219 + this.field5216 * var1.field5216 + this.field5218 * var1.field5218;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lre;S)V",
		garbageValue = "-688"
	)
	final void method9075(class450 var1) {
		this.method9066(this.field5218 * var1.field5219 - this.field5219 * var1.field5218, this.field5219 * var1.field5216 - var1.field5219 * this.field5216, var1.field5218 * this.field5216 - var1.field5216 * this.field5218);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "1667350538"
	)
	public final float method9076() {
		return (float)Math.sqrt((double)(this.field5218 * this.field5218 + this.field5216 * this.field5216 + this.field5219 * this.field5219));
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "-97"
	)
	public final void method9096(float var1) {
		this.field5216 *= var1;
		this.field5218 *= var1;
		this.field5219 *= var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lrt;I)V",
		garbageValue = "988704457"
	)
	public final void method9110(class451 var1) {
		float var3 = this.field5216;
		float var4 = this.field5218;
		float var5 = this.field5219;
		class451 var2;
		synchronized(class451.field5228) {
			if (class451.field5224 == 0) {
				var2 = new class451(var3, var4, var5, 0.0F);
			} else {
				class451.field5228[--class451.field5224].method9126(var3, var4, var5, 0.0F);
				var2 = class451.field5228[class451.field5224];
			}
		}

		class451 var7 = SpriteBufferProperties.method54(var1);
		class451 var9;
		synchronized(class451.field5228) {
			if (class451.field5224 == 0) {
				var9 = new class451(var7);
			} else {
				class451.field5228[--class451.field5224].method9145(var7);
				var9 = class451.field5228[class451.field5224];
			}
		}

		var9.method9129(var2);
		var9.method9129(var1);
		this.method9066(var9.field5222, var9.field5226, var9.field5227);
		var2.method9120();
		var7.method9120();
		var9.method9120();
	}

	public String toString() {
		return this.field5216 + ", " + this.field5218 + ", " + this.field5219;
	}
}
