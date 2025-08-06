import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rm")
public class class448 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	public static final class448 field5058;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	public static final class448 field5056;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[Lrm;"
	)
	public static class448[] field5055;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -608730641
	)
	static int field5057;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1522300705
	)
	public static int field5061;
	@ObfuscatedName("as")
	public float field5059;
	@ObfuscatedName("ah")
	public float field5060;
	@ObfuscatedName("ap")
	public float field5054;

	static {
		new class448(0.0F, 0.0F, 0.0F);
		new class448(1.0F, 1.0F, 1.0F);
		new class448(1.0F, 0.0F, 0.0F);
		field5058 = new class448(0.0F, 1.0F, 0.0F);
		new class448(0.0F, 0.0F, 1.0F);
		new class448(1.0F, 0.0F, 0.0F);
		new class448(-1.0F, 0.0F, 0.0F);
		new class448(0.0F, 0.0F, 1.0F);
		field5056 = new class448(0.0F, 0.0F, -1.0F);
		new class448(0.0F, 1.0F, 0.0F);
		new class448(0.0F, -1.0F, 0.0F);
		field5055 = new class448[0];
		field5057 = 16;
		field5055 = new class448[16];
		field5061 = 0;
	}

	public class448() {
	}

	class448(float var1, float var2, float var3) {
		this.field5059 = var1;
		this.field5060 = var2;
		this.field5054 = var3;
	}

	@ObfuscatedSignature(
		descriptor = "(Lrm;)V"
	)
	class448(class448 var1) {
		this.field5059 = var1.field5059;
		this.field5060 = var1.field5060;
		this.field5054 = var1.field5054;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "102"
	)
	public void method9038() {
		synchronized(field5055) {
			if (field5061 < field5057) {
				field5055[++field5061 - 1] = this;
			}

		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "-2009074324"
	)
	public void method9022(float var1, float var2, float var3) {
		this.field5059 = var1;
		this.field5060 = var2;
		this.field5054 = var3;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lrm;B)V",
		garbageValue = "1"
	)
	void method9057(class448 var1) {
		this.method9022(var1.field5059, var1.field5060, var1.field5054);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-112"
	)
	public final void method9024() {
		this.field5054 = 0.0F;
		this.field5060 = 0.0F;
		this.field5059 = 0.0F;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lrm;B)Z",
		garbageValue = "-61"
	)
	boolean method9025(class448 var1) {
		return this.field5059 == var1.field5059 && this.field5060 == var1.field5060 && var1.field5054 == this.field5054;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "87820310"
	)
	public final void method9047() {
		float var1 = 1.0F / this.method9031();
		this.field5059 *= var1;
		this.field5060 *= var1;
		this.field5054 *= var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lrm;B)V",
		garbageValue = "98"
	)
	final void method9026(class448 var1) {
		this.field5059 += var1.field5059;
		this.field5060 += var1.field5060;
		this.field5054 += var1.field5054;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(FFFB)V",
		garbageValue = "-86"
	)
	public final void method9044(float var1, float var2, float var3) {
		this.field5059 += var1;
		this.field5060 += var2;
		this.field5054 += var3;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lrm;B)V",
		garbageValue = "120"
	)
	public final void method9028(class448 var1) {
		this.field5059 -= var1.field5059;
		this.field5060 -= var1.field5060;
		this.field5054 -= var1.field5054;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lrm;B)F",
		garbageValue = "81"
	)
	public final float method9060(class448 var1) {
		return var1.field5059 * this.field5059 + this.field5060 * var1.field5060 + this.field5054 * var1.field5054;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lrm;I)V",
		garbageValue = "1745032020"
	)
	final void method9058(class448 var1) {
		this.method9022(var1.field5054 * this.field5060 - var1.field5060 * this.field5054, this.field5054 * var1.field5059 - var1.field5054 * this.field5059, this.field5059 * var1.field5060 - this.field5060 * var1.field5059);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "-66"
	)
	final float method9031() {
		return (float)Math.sqrt((double)(this.field5054 * this.field5054 + this.field5059 * this.field5059 + this.field5060 * this.field5060));
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "491510060"
	)
	public final void method9032(float var1) {
		this.field5059 *= var1;
		this.field5060 *= var1;
		this.field5054 *= var1;
	}

	public String toString() {
		return this.field5059 + ", " + this.field5060 + ", " + this.field5054;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ltn;III)V",
		garbageValue = "2137305218"
	)
	public static void method9073(DynamicArray var0, int var1, int var2) {
		if (var0 != null && var0.method10351() > 1) {
			class150.method3792(var0, (class570)null, true);
			if (var0.field5399 == class570.field5721) {
				class476.method9686(var0.method10348(), var0.method10351(), var1, var2);
			} else if (var0.field5399 == class570.field5724) {
				class476.method9687(var0.method10377(), var0.method10351(), var1, var2);
			} else {
				class476.method9688(var0.method10393(), var0.method10351(), var1, var2);
			}

		}
	}

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-906490024"
	)
	static void method9062() {
		Client.menu.menuOptionsCount = 0;
		Client.isMenuOpen = false;
	}
}
