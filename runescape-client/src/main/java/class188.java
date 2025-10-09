import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hg")
public class class188 extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("field2007")
	static EvictingDualNodeHashTable field2007;

	static {
		field2007 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1474827121"
	)
	static void method4333() {
		if (class154.clientPreferences.isTitleMusicDisabled()) {
			Clock.method6092(0, 0);
		} else {
			TriBool.method10172("scape main", 255);
		}
	}

	@ObfuscatedName("pt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-37433018"
	)
	static String method4334(String var0) {
		PlayerType[] var1 = class113.PlayerType_values();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			PlayerType var3 = var1[var2];
			if (var3.modIcon != -1 && var0.startsWith(class132.method3671(var3.modIcon))) {
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length());
				break;
			}
		}

		return var0;
	}
}
