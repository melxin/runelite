import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("re")
public class class452 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lre;"
	)
	public static final class452 field5174;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lre;"
	)
	public static final class452 field5170;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Lre;"
	)
	public static class452[] field5171;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1383181451
	)
	static int field5172;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -275683013
	)
	public static int field5173;
	@ObfuscatedName("aq")
	public float field5175;
	@ObfuscatedName("ao")
	public float field5176;
	@ObfuscatedName("as")
	public float field5169;

	static {
		new class452(0.0F, 0.0F, 0.0F);
		new class452(1.0F, 1.0F, 1.0F);
		new class452(1.0F, 0.0F, 0.0F);
		field5174 = new class452(0.0F, 1.0F, 0.0F);
		new class452(0.0F, 0.0F, 1.0F);
		new class452(1.0F, 0.0F, 0.0F);
		new class452(-1.0F, 0.0F, 0.0F);
		new class452(0.0F, 0.0F, 1.0F);
		field5170 = new class452(0.0F, 0.0F, -1.0F);
		new class452(0.0F, 1.0F, 0.0F);
		new class452(0.0F, -1.0F, 0.0F);
		field5171 = new class452[0];
		field5172 = 16;
		field5171 = new class452[16];
		field5173 = 0;
	}

	public class452() {
	}

	class452(float var1, float var2, float var3) {
		this.field5175 = var1;
		this.field5176 = var2;
		this.field5169 = var3;
	}

	@ObfuscatedSignature(
		descriptor = "(Lre;)V"
	)
	class452(class452 var1) {
		this.field5175 = var1.field5175;
		this.field5176 = var1.field5176;
		this.field5169 = var1.field5169;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-61"
	)
	public void method8992() {
		synchronized(field5171) {
			if (field5173 < field5172) {
				field5171[++field5173 - 1] = this;
			}

		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "1267188025"
	)
	public void method8993(float var1, float var2, float var3) {
		this.field5175 = var1;
		this.field5176 = var2;
		this.field5169 = var3;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lre;I)V",
		garbageValue = "-452990603"
	)
	void method9018(class452 var1) {
		this.method8993(var1.field5175, var1.field5176, var1.field5169);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "94"
	)
	public final void method9004() {
		this.field5169 = 0.0F;
		this.field5176 = 0.0F;
		this.field5175 = 0.0F;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lre;I)Z",
		garbageValue = "883469030"
	)
	boolean method8996(class452 var1) {
		return var1.field5175 == this.field5175 && var1.field5176 == this.field5176 && var1.field5169 == this.field5169;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "743103878"
	)
	public final void method9042() {
		float var1 = 1.0F / this.method9002();
		this.field5175 *= var1;
		this.field5176 *= var1;
		this.field5169 *= var1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lre;I)V",
		garbageValue = "-2114967621"
	)
	final void method8997(class452 var1) {
		this.field5175 += var1.field5175;
		this.field5176 += var1.field5176;
		this.field5169 += var1.field5169;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "1107831140"
	)
	public final void method9006(float var1, float var2, float var3) {
		this.field5175 += var1;
		this.field5176 += var2;
		this.field5169 += var3;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lre;B)V",
		garbageValue = "-51"
	)
	public final void method9052(class452 var1) {
		this.field5175 -= var1.field5175;
		this.field5176 -= var1.field5176;
		this.field5169 -= var1.field5169;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lre;B)F",
		garbageValue = "125"
	)
	final float method8999(class452 var1) {
		return this.field5176 * var1.field5176 + this.field5175 * var1.field5175 + var1.field5169 * this.field5169;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lre;I)V",
		garbageValue = "1257986450"
	)
	final void method9020(class452 var1) {
		this.method8993(var1.field5169 * this.field5176 - var1.field5176 * this.field5169, this.field5169 * var1.field5175 - this.field5175 * var1.field5169, this.field5175 * var1.field5176 - this.field5176 * var1.field5175);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "-1674747920"
	)
	final float method9002() {
		return (float)Math.sqrt((double)(this.field5175 * this.field5175 + this.field5176 * this.field5176 + this.field5169 * this.field5169));
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "2126967161"
	)
	public final void method9003(float var1) {
		this.field5175 *= var1;
		this.field5176 *= var1;
		this.field5169 *= var1;
	}

	public String toString() {
		return this.field5175 + ", " + this.field5176 + ", " + this.field5169;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([IIIS)V",
		garbageValue = "-440"
	)
	static void method9046(int[] var0, int var1, int var2) {
		while (var1 < var2) {
			int var3 = var0[var1];
			var0[var1] = var0[var2];
			var0[var2] = var3;
			++var1;
			--var2;
		}

	}

	@ObfuscatedName("oz")
	@ObfuscatedSignature(
		descriptor = "(Loi;IIII)V",
		garbageValue = "-1443455720"
	)
	static final void method9051(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.method8005(UrlRequester.widgetDefinition, false);
		if (var4 != null) {
			if (Client.minimapState < 3) {
				class168.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

		}
	}
}
