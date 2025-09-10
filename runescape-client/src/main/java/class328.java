import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("me")
public class class328 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	public static final class328 field3643;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	public static final class328 field3644;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	public static final class328 field3645;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	public static final class328 field3646;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	public static final class328 field3647;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	public static final class328 field3648;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	public static final class328 field3655;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	public static final class328 field3649;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	public static final class328 field3650;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	public static final class328 field3652;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	public static final class328 field3653;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	public static final class328 field3654;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	public static final class328 field3651;

	static {
		field3643 = new class328(11);
		field3644 = new class328(7);
		field3645 = new class328(14);
		field3646 = new class328(7);
		field3647 = new class328(14);
		field3648 = new class328(2);
		field3655 = new class328(6);
		field3649 = new class328(4);
		field3650 = new class328(17);
		field3652 = new class328(7);
		field3653 = new class328(4);
		field3654 = new class328(-2);
		field3651 = new class328(24);
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "11"
	)
	class328(int var1) {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILoi;IIIII[FB)Loi;",
		garbageValue = "-110"
	)
	static Widget method7045(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
		Widget var8 = new Widget();
		var8.type = var0;
		var8.parentId = var1.id;
		var8.childIndex = var2 * -1618486649;
		var8.isIf3 = true;
		var8.xAlignment = var3;
		var8.yAlignment = var4;
		var8.widthAlignment = var5;
		var8.heightAlignment = var6;
		var8.rawX = (int)((float)(var1.width * 469894397) * var7[0]);
		var8.rawY = (int)((float)(var1.height * 1156037777) * var7[1]);
		var8.rawWidth = (int)(var7[2] * (float)(var1.width * 469894397));
		var8.rawHeight = (int)(var7[3] * (float)(var1.height * 1156037777));
		return var8;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "61"
	)
	public static boolean method7044(int var0) {
		return (var0 >> 22 & 1) != 0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lti;Lwv;I)V",
		garbageValue = "2019074334"
	)
	static void method7046(DynamicArray var0, class574 var1) {
		ItemLayer.method4826(var0, var1, false);
	}
}
