import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rx")
@Implements("ProjectionCoord")
public class ProjectionCoord {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lrx;"
	)
	public static final ProjectionCoord field5242;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lrx;"
	)
	public static final ProjectionCoord field5240;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lrx;"
	)
	public static final ProjectionCoord field5234;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lrx;"
	)
	public static final ProjectionCoord field5237;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lrx;"
	)
	public static final ProjectionCoord[] field5238;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 2018536245
	)
	static final int field5239;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1970955523
	)
	public static int field5236;
	@ObfuscatedName("aw")
	@Export("x")
	public float x;
	@ObfuscatedName("ap")
	@Export("z")
	public float z;
	@ObfuscatedName("ay")
	@Export("y")
	public float y;

	static {
		field5242 = new ProjectionCoord(0.0F, 0.0F, 0.0F);
		new ProjectionCoord(1.0F, 1.0F, 1.0F);
		new ProjectionCoord(1.0F, 0.0F, 0.0F);
		field5240 = new ProjectionCoord(0.0F, 1.0F, 0.0F);
		new ProjectionCoord(0.0F, 0.0F, 1.0F);
		new ProjectionCoord(1.0F, 0.0F, 0.0F);
		new ProjectionCoord(-1.0F, 0.0F, 0.0F);
		new ProjectionCoord(0.0F, 0.0F, 1.0F);
		field5234 = new ProjectionCoord(0.0F, 0.0F, -1.0F);
		new ProjectionCoord(0.0F, 1.0F, 0.0F);
		field5237 = new ProjectionCoord(0.0F, -1.0F, 0.0F);
		field5236 = 0;
		field5239 = 16;
		field5238 = new ProjectionCoord[field5239];
	}

	public ProjectionCoord() {
	}

	ProjectionCoord(float var1, float var2, float var3) {
		this.x = var1;
		this.z = var2;
		this.y = var3;
	}

	@ObfuscatedSignature(
		descriptor = "(Lrx;)V"
	)
	ProjectionCoord(ProjectionCoord var1) {
		this.x = var1.x;
		this.z = var1.z;
		this.y = var1.y;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-804947546"
	)
	@Export("release")
	public void release() {
		synchronized(field5238) {
			if (field5236 < field5239) {
				field5238[++field5236 - 1] = this;
			}

		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "1146629800"
	)
	public void method9296(float var1, float var2, float var3) {
		this.x = var1;
		this.z = var2;
		this.y = var3;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lrx;B)V",
		garbageValue = "8"
	)
	void method9342(ProjectionCoord var1) {
		this.method9296(var1.x, var1.z, var1.y);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1701153650"
	)
	public final void method9349() {
		this.y = 0.0F;
		this.z = 0.0F;
		this.x = 0.0F;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lrx;I)Z",
		garbageValue = "2137113714"
	)
	boolean method9298(ProjectionCoord var1) {
		return this.x == var1.x && this.z == var1.z && this.y == var1.y;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "3141"
	)
	public final void method9299() {
		float var1 = 1.0F / this.method9306();
		this.x *= var1;
		this.z *= var1;
		this.y *= var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lrx;B)V",
		garbageValue = "-3"
	)
	public final void method9294(ProjectionCoord var1) {
		this.x += var1.x;
		this.z += var1.z;
		this.y += var1.y;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "1519953141"
	)
	public final void method9301(float var1, float var2, float var3) {
		this.x += var1;
		this.z += var2;
		this.y += var3;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lrx;I)V",
		garbageValue = "1902119957"
	)
	public final void method9293(ProjectionCoord var1) {
		this.x -= var1.x;
		this.z -= var1.z;
		this.y -= var1.y;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lrx;I)F",
		garbageValue = "1524499395"
	)
	public final float method9303(ProjectionCoord var1) {
		return this.z * var1.z + this.x * var1.x + var1.y * this.y;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lrx;I)V",
		garbageValue = "-296521489"
	)
	final void method9304(ProjectionCoord var1) {
		this.method9296(var1.y * this.z - this.y * var1.z, var1.x * this.y - this.x * var1.y, var1.z * this.x - var1.x * this.z);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "-8"
	)
	public final float method9306() {
		return (float)Math.sqrt((double)(this.y * this.y + this.z * this.z + this.x * this.x));
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "-65"
	)
	final void method9334(float var1) {
		this.x *= var1;
		this.z *= var1;
		this.y *= var1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lra;I)V",
		garbageValue = "1314896004"
	)
	public final void method9307(class461 var1) {
		class461 var2 = class139.method3857(this.x, this.z, this.y, 0.0F);
		class461 var3 = AbstractByteArrayCopier.method7629(var1);
		class461 var5;
		synchronized(class461.field5251) {
			if (class461.field5245 == 0) {
				var5 = new class461(var3);
			} else {
				class461.field5251[--class461.field5245].method9364(var3);
				var5 = class461.field5251[class461.field5245];
			}
		}

		var5.method9373(var2);
		var5.method9373(var1);
		this.method9296(var5.field5254, var5.field5249, var5.field5250);
		var2.method9362();
		var3.method9362();
		var5.method9362();
	}

	public String toString() {
		return this.x + ", " + this.z + ", " + this.y;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lut;ILjava/lang/Object;I)V",
		garbageValue = "1789263116"
	)
	public static void method9358(DynamicArray var0, int var1, Object var2) {
		class461.method9375(var0, (class586)null, true);
		if (var1 >= 0 && var1 <= var0.size * 1583568339) {
			var0.method10656(var0.size * 1583568339 + 1);
			if (var1 < var0.size * 1583568339) {
				HttpResponse.method296(var0, var1, var0, var1 + 1, var0.size * 1583568339 - var1);
			}

			var0.method10663(var1, var2);
			var0.size += -1205286309;
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lut;Lwh;I)V",
		garbageValue = "283306842"
	)
	static void method9359(DynamicArray var0, class586 var1) {
		class461.method9375(var0, var1, false);
	}
}
