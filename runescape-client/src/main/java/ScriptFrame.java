import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bq")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -1475006867
	)
	@Export("otpMedium")
	static int otpMedium;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lcg;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -540892599
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("at")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("ac")
	@Export("stringLocals")
	Object[] stringLocals;

	ScriptFrame() {
		this.pc = -1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lti;Ljava/lang/Object;III)I",
		garbageValue = "429502153"
	)
	public static int method741(DynamicArray var0, Object var1, int var2, int var3) {
		if (var2 < 0) {
			var2 = 0;
		}

		if (var3 < 0 || var3 > var0.method10322()) {
			var3 = var0.method10322();
		}

		int var5;
		if (var0.field5504 == class574.field5820) {
			int[] var11 = var0.method10318();
			var5 = (Integer)var1;

			for (int var6 = var3 - 1; var6 >= var2; --var6) {
				if (var5 == var11[var6]) {
					return var6;
				}
			}
		} else if (var0.field5504 == class574.field5816) {
			long[] var10 = var0.method10320();
			long var8 = (Long)var1;

			for (int var7 = var3 - 1; var7 >= var2; --var7) {
				if (var10[var7] == var8) {
					return var7;
				}
			}
		} else {
			Object[] var4 = var0.method10321();

			for (var5 = var3 - 1; var5 >= var2; --var5) {
				if (var4[var5] == var1 || var4[var5] != null && var4[var5].equals(var1)) {
					return var5;
				}
			}
		}

		return -1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-5"
	)
	@Export("focusPasswordWhenUsernameFilled")
	static void focusPasswordWhenUsernameFilled() {
		if (KeyHandler.method399()) {
			if (Client.Login_isUsernameRemembered && Login.Login_username != null && !Login.Login_username.isEmpty()) {
				Login.currentLoginField = 1;
			} else {
				Login.currentLoginField = 0;
			}
		} else {
			class265.Login_promptCredentials(false);
		}

	}
}
