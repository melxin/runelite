import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mo")
public class class328 implements class323 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	public static final class328 field3657;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	public static final class328 field3647;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	public static final class328 field3655;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	public static final class328 field3646;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	public static final class328 field3650;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	public static final class328 field3651;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	static final class328 field3652;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	public static final class328 field3653;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lmo;"
	)
	static final class328[] field3654;
	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "Lct;"
	)
	@Export("mouseRecorder")
	static MouseRecorder mouseRecorder;
	@ObfuscatedName("vz")
	@ObfuscatedSignature(
		descriptor = "Lwd;"
	)
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -648932871
	)
	public final int field3658;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1385176893
	)
	public final int field3656;

	static {
		field3657 = new class328(14, 0);
		field3647 = new class328(15, 20);
		field3655 = new class328(16, -2);
		field3646 = new class328(18, -2);
		field3650 = new class328(19, -2);
		field3651 = new class328(21, 37);
		field3652 = new class328(27, 0);
		field3653 = new class328(32, 66);
		field3654 = new class328[33];
		class328[] var0 = new class328[]{field3647, field3646, field3653, field3650, field3651, field3655, field3652, field3657};
		class328[] var1 = var0;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			field3654[var1[var2].field3658] = var1[var2];
		}

	}

	class328(int var1, int var2) {
		this.field3658 = var1;
		this.field3656 = var2;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "68"
	)
	static void method6844() {
		if (Login.loginIndex == 34) {
			MidiRequest.Login_promptCredentials(false);
		}

		Login.worldSelectOpen = false;
		Rasterizer2D.Rasterizer2D_fillRectangle(0, 0, Rasterizer2D.Rasterizer2D_width, Rasterizer2D.Rasterizer2D_height, 0);
		InterfaceParent.leftTitleSprite.drawAt(Login.xPadding, 0);
		UserComparator4.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
		class348.logoSprite.drawAt(Login.xPadding + 382 - class348.logoSprite.subWidth / 2, 18);
	}
}
