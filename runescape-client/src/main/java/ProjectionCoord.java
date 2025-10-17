import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("re")
@Implements("ProjectionCoord")
public class ProjectionCoord {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lre;"
	)
	public static final ProjectionCoord field5220;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lre;"
	)
	public static final ProjectionCoord field5212;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lre;"
	)
	public static final ProjectionCoord field5211;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lre;"
	)
	public static final ProjectionCoord field5213;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lre;"
	)
	static final ProjectionCoord[] field5214;
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
	@Export("x")
	public float x;
	@ObfuscatedName("ac")
	@Export("z")
	public float z;
	@ObfuscatedName("aa")
	@Export("y")
	public float y;

	static {
		field5220 = new ProjectionCoord(0.0F, 0.0F, 0.0F);
		new ProjectionCoord(1.0F, 1.0F, 1.0F);
		new ProjectionCoord(1.0F, 0.0F, 0.0F);
		field5212 = new ProjectionCoord(0.0F, 1.0F, 0.0F);
		new ProjectionCoord(0.0F, 0.0F, 1.0F);
		new ProjectionCoord(1.0F, 0.0F, 0.0F);
		new ProjectionCoord(-1.0F, 0.0F, 0.0F);
		new ProjectionCoord(0.0F, 0.0F, 1.0F);
		field5211 = new ProjectionCoord(0.0F, 0.0F, -1.0F);
		new ProjectionCoord(0.0F, 1.0F, 0.0F);
		field5213 = new ProjectionCoord(0.0F, -1.0F, 0.0F);
		field5210 = 0;
		field5215 = 16;
		field5214 = new ProjectionCoord[field5215];
	}

	public ProjectionCoord() {
	}

	ProjectionCoord(float var1, float var2, float var3) {
		this.x = var1;
		this.z = var2;
		this.y = var3;
	}

	@ObfuscatedSignature(
		descriptor = "(Lre;)V"
	)
	ProjectionCoord(ProjectionCoord var1) {
		this.x = var1.x;
		this.z = var1.z;
		this.y = var1.y;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-947600722"
	)
	@Export("release")
	public void release() {
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
		this.x = var1;
		this.z = var2;
		this.y = var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lre;I)V",
		garbageValue = "-1731222272"
	)
	void method9067(ProjectionCoord var1) {
		this.method9066(var1.x, var1.z, var1.y);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-3"
	)
	final void method9068() {
		this.y = 0.0F;
		this.z = 0.0F;
		this.x = 0.0F;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lre;B)Z",
		garbageValue = "83"
	)
	boolean method9085(ProjectionCoord var1) {
		return var1.x == this.x && this.z == var1.z && var1.y == this.y;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "59"
	)
	public final void method9070() {
		float var1 = 1.0F / this.method9076();
		this.x *= var1;
		this.z *= var1;
		this.y *= var1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lre;I)V",
		garbageValue = "-2041581085"
	)
	final void method9064(ProjectionCoord var1) {
		this.x += var1.x;
		this.z += var1.z;
		this.y += var1.y;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "-712492383"
	)
	public final void method9072(float var1, float var2, float var3) {
		this.x += var1;
		this.z += var2;
		this.y += var3;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lre;I)V",
		garbageValue = "1197334661"
	)
	public final void method9073(ProjectionCoord var1) {
		this.x -= var1.x;
		this.z -= var1.z;
		this.y -= var1.y;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lre;I)F",
		garbageValue = "478068504"
	)
	public final float method9074(ProjectionCoord var1) {
		return this.y * var1.y + this.x * var1.x + this.z * var1.z;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lre;S)V",
		garbageValue = "-688"
	)
	final void method9075(ProjectionCoord var1) {
		this.method9066(this.z * var1.y - this.y * var1.z, this.y * var1.x - var1.y * this.x, var1.z * this.x - var1.x * this.z);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "1667350538"
	)
	public final float method9076() {
		return (float)Math.sqrt((double)(this.z * this.z + this.x * this.x + this.y * this.y));
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "-97"
	)
	public final void method9096(float var1) {
		this.x *= var1;
		this.z *= var1;
		this.y *= var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lrt;I)V",
		garbageValue = "988704457"
	)
	public final void method9110(class451 var1) {
		float var3 = this.x;
		float var4 = this.z;
		float var5 = this.y;
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
		return this.x + ", " + this.z + ", " + this.y;
	}
}
