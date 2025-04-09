import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mu")
public class class328 implements class323 {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	public static final class328 field3659;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	public static final class328 field3650;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	public static final class328 field3651;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	public static final class328 field3652;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	public static final class328 field3653;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	public static final class328 field3654;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	static final class328 field3649;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	public static final class328 field3656;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "[Lmu;"
	)
	static final class328[] field3657;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1559059103
	)
	public final int field3658;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1797468993
	)
	public final int field3660;

	static {
		field3659 = new class328(14, 0);
		field3650 = new class328(15, 20);
		field3651 = new class328(16, -2);
		field3652 = new class328(18, -2);
		field3653 = new class328(19, -2);
		field3654 = new class328(21, 37);
		field3649 = new class328(27, 0);
		field3656 = new class328(32, 66);
		field3657 = new class328[33];
		class328[] var0 = new class328[]{field3653, field3659, field3656, field3652, field3649, field3650, field3654, field3651};
		class328[] var1 = var0;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			field3657[var1[var2].field3658] = var1[var2];
		}

	}

	class328(int var1, int var2) {
		this.field3658 = var1;
		this.field3660 = var2;
	}

	@ObfuscatedName("nr")
	@ObfuscatedSignature(
		descriptor = "(Lnh;IIII)V",
		garbageValue = "-1473516358"
	)
	static final void method6564(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.method7359(class232.widgetDefinition, false);
		if (var4 != null) {
			if (Client.minimapState < 3) {
				UserComparator9.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

		}
	}
}
