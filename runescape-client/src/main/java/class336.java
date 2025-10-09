import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ma")
public enum class336 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	field3851(0, 0),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	field3870(1, 1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	field3867(2, 2),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	field3852(3, 3),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	field3872(4, 4),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	field3854(5, 5),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	field3855(6, 6),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	field3856(7, 7),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	field3857(8, 8),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	field3858(9, 9),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	field3859(10, 10),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	field3860(11, 11),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	field3878(12, 12),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	field3853(13, 13),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	field3863(14, 14),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	field3861(15, 15),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	field3865(16, 16),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	field3866(17, 17),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	field3862(18, 18),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	field3868(19, 19),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	field3869(20, 20),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	field3849(21, 21),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	field3871(22, 22),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	field3850(23, 23),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	field3864(24, 24),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	field3877(25, 25),
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	field3875(26, 26),
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	field3876(27, 27);

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "[Lma;"
	)
	public static final class336[] field3873;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 997348497
	)
	final int field3874;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1391817075
	)
	final int field3879;

	static {
		class336[] var0 = class256.method5921();
		field3873 = new class336[var0.length];
		class336[] var1 = var0;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class336 var3 = var1[var2];
			field3873[var3.field3879] = var3;
		}

	}

	class336(int var3, int var4) {
		this.field3874 = var3;
		this.field3879 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1012656358"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3879;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "1663214507"
	)
	public static float method7116(int var0) {
		var0 &= 16383;
		return (float)(3.834951969714103E-4D * (double)((float)var0));
	}
}
