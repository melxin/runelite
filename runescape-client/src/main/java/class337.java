import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mx")
public enum class337 implements Enum {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3853(0, 0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3847(1, 1),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3848(2, 2),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3849(3, 3),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3850(4, 4),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3851(5, 5),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3852(6, 6),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3870(7, 7),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3854(8, 8),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3868(9, 9),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3856(10, 10),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3857(11, 11),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3858(12, 12),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3855(13, 13),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3859(14, 14),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3861(15, 15),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3862(16, 16),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3863(17, 17),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3867(18, 18),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3877(19, 19),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3864(20, 20),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3873(21, 21),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3875(22, 22),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3869(23, 23),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3871(24, 24),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3846(25, 25),
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3872(26, 26),
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3866(27, 27);

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "[Lmx;"
	)
	public static final class337[] field3860;
	@ObfuscatedName("sh")
	@ObfuscatedGetter(
		intValue = -643377373
	)
	@Export("selectedSpellFlags")
	static int selectedSpellFlags;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -77670489
	)
	final int field3874;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 1472328093
	)
	final int field3876;

	static {
		class337[] var0 = new class337[]{field3853, field3847, field3848, field3849, field3850, field3851, field3852, field3870, field3854, field3868, field3856, field3857, field3858, field3855, field3859, field3861, field3862, field3863, field3867, field3877, field3864, field3873, field3875, field3869, field3871, field3846, field3872, field3866};
		field3860 = new class337[var0.length];
		class337[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			class337 var4 = var2[var3];
			field3860[var4.field3876] = var4;
		}

	}

	class337(int var3, int var4) {
		this.field3874 = var3;
		this.field3876 = var4;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1935172756"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3876;
	}
}
