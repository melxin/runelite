import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mx")
public enum class335 implements Enum {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3773(0, 0),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3747(1, 1),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3748(2, 2),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3749(3, 3),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3750(4, 4),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3751(5, 5),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3752(6, 6),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3753(7, 7),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3777(8, 8),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3755(9, 9),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3756(10, 10),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3757(11, 11),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3767(12, 12),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3759(13, 13),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3762(14, 14),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3746(15, 15),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3763(16, 16),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3754(17, 17),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3774(18, 18),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3765(19, 19),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3764(20, 20),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3760(21, 21),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3768(22, 22),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3769(23, 23),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3770(24, 24),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3771(25, 25),
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3772(26, 26),
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field3766(27, 27);

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "[Lmx;"
	)
	static final class335[] field3775;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 511940993
	)
	final int field3761;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -413197345
	)
	final int field3776;

	static {
		class335[] var0 = new class335[]{field3773, field3747, field3748, field3749, field3750, field3751, field3752, field3753, field3777, field3755, field3756, field3757, field3767, field3759, field3762, field3746, field3763, field3754, field3774, field3765, field3764, field3760, field3768, field3769, field3770, field3771, field3772, field3766};
		field3775 = new class335[var0.length];
		class335[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			class335 var4 = var2[var3];
			field3775[var4.field3776] = var4;
		}

	}

	class335(int var3, int var4) {
		this.field3761 = var3;
		this.field3776 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-164877066"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3776;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-13114"
	)
	static void method7086() {
		class460.setLoginResponseString("", "Connecting to server...", "");
		Client.field388 = class591.field5874;
		Client.authenticationScheme = FriendSystem.clientPreferences.containsKey(Login.Login_username) ? AuthenticationScheme.USERNAME_PASSWORD_REMEMBER : AuthenticationScheme.USERNAME_PASSWORD;
		AuthenticationScheme.updateGameState(20);
	}
}
