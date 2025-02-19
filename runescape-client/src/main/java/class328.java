import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mm")
public class class328 implements class323 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmm;"
	)
	public static final class328 field3651;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmm;"
	)
	public static final class328 field3645;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmm;"
	)
	public static final class328 field3656;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmm;"
	)
	public static final class328 field3647;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmm;"
	)
	public static final class328 field3648;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmm;"
	)
	public static final class328 field3649;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmm;"
	)
	public static final class328 field3646;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmm;"
	)
	static final class328 field3650;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lmm;"
	)
	public static final class328 field3652;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[Lmm;"
	)
	static final class328[] field3655;
	@ObfuscatedName("qn")
	@ObfuscatedSignature(
		descriptor = "Lvv;"
	)
	static class550 field3644;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1200625681
	)
	public final int field3653;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1129085079
	)
	public final int field3654;

	static {
		field3651 = new class328(14, 0);
		field3645 = new class328(15, 20);
		field3656 = new class328(16, -2);
		field3647 = new class328(18, -2);
		field3648 = new class328(19, -2);
		field3649 = new class328(20, 58);
		field3646 = new class328(21, 37);
		field3650 = new class328(27, 0);
		field3652 = new class328(32, 66);
		field3655 = new class328[33];
		class328[] var0 = WorldMapEvent.method6422();

		for (int var1 = 0; var1 < var0.length; ++var1) {
			field3655[var0[var1].field3653] = var0[var1];
		}

	}

	class328(int var1, int var2) {
		this.field3653 = var1;
		this.field3654 = var2;
	}
}
