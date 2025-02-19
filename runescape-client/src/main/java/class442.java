import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rp")
public class class442 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lrp;"
	)
	public static final class442 field4897;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lrp;"
	)
	public static final class442 field4895;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Lrp;"
	)
	static class442[] field4894;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 172642731
	)
	static int field4896;
	@ObfuscatedName("ac")
	public float field4898;
	@ObfuscatedName("ao")
	public float field4899;
	@ObfuscatedName("af")
	public float field4900;

	static {
		new class442(0.0F, 0.0F, 0.0F);
		new class442(1.0F, 1.0F, 1.0F);
		new class442(1.0F, 0.0F, 0.0F);
		field4897 = new class442(0.0F, 1.0F, 0.0F);
		new class442(0.0F, 0.0F, 1.0F);
		new class442(1.0F, 0.0F, 0.0F);
		new class442(-1.0F, 0.0F, 0.0F);
		new class442(0.0F, 0.0F, 1.0F);
		field4895 = new class442(0.0F, 0.0F, -1.0F);
		new class442(0.0F, 1.0F, 0.0F);
		new class442(0.0F, -1.0F, 0.0F);
		field4894 = new class442[0];
		class217.method4439(16);
	}

	class442(float var1, float var2, float var3) {
		this.field4898 = var1;
		this.field4899 = var2;
		this.field4900 = var3;
	}

	public class442() {
	}

	@ObfuscatedSignature(
		descriptor = "(Lrp;)V"
	)
	class442(class442 var1) {
		this.field4898 = var1.field4898;
		this.field4899 = var1.field4899;
		this.field4900 = var1.field4900;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1472469068"
	)
	public void method8341() {
		synchronized(field4894) {
			if (class187.field1997 < field4896) {
				field4894[++class187.field1997 - 1] = this;
			}

		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "232435801"
	)
	public void method8296(float var1, float var2, float var3) {
		this.field4898 = var1;
		this.field4899 = var2;
		this.field4900 = var3;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lrp;B)V",
		garbageValue = "87"
	)
	void method8309(class442 var1) {
		this.method8296(var1.field4898, var1.field4899, var1.field4900);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-721371264"
	)
	final void method8331() {
		this.field4900 = 0.0F;
		this.field4899 = 0.0F;
		this.field4898 = 0.0F;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lrp;I)Z",
		garbageValue = "-245305657"
	)
	boolean method8348(class442 var1) {
		return var1.field4898 == this.field4898 && this.field4899 == var1.field4899 && this.field4900 == var1.field4900;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1233527241"
	)
	public final void method8300() {
		float var1 = 1.0F / this.method8304();
		this.field4898 *= var1;
		this.field4899 *= var1;
		this.field4900 *= var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lrp;I)V",
		garbageValue = "-2038199303"
	)
	final void method8322(class442 var1) {
		this.field4898 += var1.field4898;
		this.field4899 += var1.field4899;
		this.field4900 += var1.field4900;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(FFFB)V",
		garbageValue = "0"
	)
	public final void method8302(float var1, float var2, float var3) {
		this.field4898 += var1;
		this.field4899 += var2;
		this.field4900 += var3;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lrp;I)V",
		garbageValue = "-1205894729"
	)
	public final void method8295(class442 var1) {
		this.field4898 -= var1.field4898;
		this.field4899 -= var1.field4899;
		this.field4900 -= var1.field4900;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lrp;I)F",
		garbageValue = "-237628994"
	)
	final float method8303(class442 var1) {
		return this.field4900 * var1.field4900 + this.field4898 * var1.field4898 + var1.field4899 * this.field4899;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lrp;B)V",
		garbageValue = "-46"
	)
	public final void method8305(class442 var1) {
		this.method8296(var1.field4900 * this.field4899 - var1.field4899 * this.field4900, this.field4900 * var1.field4898 - this.field4898 * var1.field4900, this.field4898 * var1.field4899 - var1.field4898 * this.field4899);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "345019215"
	)
	final float method8304() {
		return (float)Math.sqrt((double)(this.field4899 * this.field4899 + this.field4898 * this.field4898 + this.field4900 * this.field4900));
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "1686238660"
	)
	public final void method8307(float var1) {
		this.field4898 *= var1;
		this.field4899 *= var1;
		this.field4900 *= var1;
	}

	public String toString() {
		return this.field4898 + ", " + this.field4899 + ", " + this.field4900;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1260100485"
	)
	static final int method8350(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
		return var3;
	}
}
