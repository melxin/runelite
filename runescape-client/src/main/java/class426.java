import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qh")
public class class426 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	public static final class426 field4745;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	public static final class426 field4743;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[Lqh;"
	)
	public static class426[] field4746;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -2124964589
	)
	static int field4748;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -311402611
	)
	public static int field4742;
	@ObfuscatedName("an")
	public float field4747;
	@ObfuscatedName("ae")
	float field4744;
	@ObfuscatedName("ax")
	public float field4749;

	static {
		new class426(0.0F, 0.0F, 0.0F);
		new class426(1.0F, 1.0F, 1.0F);
		new class426(1.0F, 0.0F, 0.0F);
		field4745 = new class426(0.0F, 1.0F, 0.0F);
		new class426(0.0F, 0.0F, 1.0F);
		new class426(1.0F, 0.0F, 0.0F);
		new class426(-1.0F, 0.0F, 0.0F);
		new class426(0.0F, 0.0F, 1.0F);
		field4743 = new class426(0.0F, 0.0F, -1.0F);
		new class426(0.0F, 1.0F, 0.0F);
		new class426(0.0F, -1.0F, 0.0F);
		field4746 = new class426[0];
		field4748 = 100;
		field4746 = new class426[100];
		field4742 = 0;
	}

	public class426(float var1, float var2, float var3) {
		this.field4747 = var1;
		this.field4744 = var2;
		this.field4749 = var3;
	}

	public class426() {
	}

	@ObfuscatedSignature(
		descriptor = "(Lqh;)V"
	)
	public class426(class426 var1) {
		this.field4747 = var1.field4747;
		this.field4744 = var1.field4744;
		this.field4749 = var1.field4749;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "6"
	)
	public void method8317() {
		synchronized(field4746) {
			if (field4742 < field4748 - 1) {
				field4746[++field4742 - 1] = this;
			}

		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "1169986659"
	)
	public void method8285(float var1, float var2, float var3) {
		this.field4747 = var1;
		this.field4744 = var2;
		this.field4749 = var3;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lqh;B)V",
		garbageValue = "110"
	)
	public void method8316(class426 var1) {
		this.method8285(var1.field4747, var1.field4744, var1.field4749);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	final void method8287() {
		this.field4749 = 0.0F;
		this.field4744 = 0.0F;
		this.field4747 = 0.0F;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lqh;B)Z",
		garbageValue = "91"
	)
	boolean method8288(class426 var1) {
		return var1.field4747 == this.field4747 && this.field4744 == var1.field4744 && var1.field4749 == this.field4749;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1106726003"
	)
	public final void method8289() {
		float var1 = 1.0F / this.method8308();
		this.field4747 *= var1;
		this.field4744 *= var1;
		this.field4749 *= var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lqh;I)V",
		garbageValue = "-618418035"
	)
	public final void method8297(class426 var1) {
		this.field4747 += var1.field4747;
		this.field4744 += var1.field4744;
		this.field4749 += var1.field4749;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lqh;I)V",
		garbageValue = "-1168010802"
	)
	final void method8291(class426 var1) {
		this.field4747 -= var1.field4747;
		this.field4744 -= var1.field4744;
		this.field4749 -= var1.field4749;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lqh;I)F",
		garbageValue = "1591624557"
	)
	public final float method8305(class426 var1) {
		return var1.field4747 * this.field4747 + var1.field4744 * this.field4744 + this.field4749 * var1.field4749;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lqh;I)V",
		garbageValue = "-1050500857"
	)
	public final void method8293(class426 var1) {
		this.method8285(this.field4744 * var1.field4749 - this.field4749 * var1.field4744, this.field4749 * var1.field4747 - var1.field4749 * this.field4747, this.field4747 * var1.field4744 - var1.field4747 * this.field4744);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "0"
	)
	final float method8308() {
		return (float)Math.sqrt((double)(this.field4749 * this.field4749 + this.field4747 * this.field4747 + this.field4744 * this.field4744));
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "2042549892"
	)
	public final void method8327(float var1) {
		this.field4747 *= var1;
		this.field4744 *= var1;
		this.field4749 *= var1;
	}

	public String toString() {
		return this.field4747 + ", " + this.field4744 + ", " + this.field4749;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)Z",
		garbageValue = "110"
	)
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		return class53.method1131(var0, 10, true);
	}
}
