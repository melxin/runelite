import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oy")
@Implements("StudioGame")
public enum StudioGame implements Enum {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("ah")
	@Export("name")
	public final String name;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1968675415
	)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3;
		this.id = var5;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-164877066"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lrc;",
		garbageValue = "834407628"
	)
	public static class449 method8178() {
		synchronized(class449.field5068) {
			if (class449.field5065 == 0) {
				return new class449();
			} else {
				class449.field5068[--class449.field5065].method9079();
				return class449.field5068[class449.field5065];
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "98"
	)
	public static boolean method8176(char var0) {
		if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
			if (var0 != 0) {
				char[] var1 = class439.cp1252AsciiExtension;

				for (int var2 = 0; var2 < var1.length; ++var2) {
					char var3 = var1[var2];
					if (var0 == var3) {
						return true;
					}
				}
			}

			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "27020042"
	)
	public static void method8181() {
		SequenceDefinition.SequenceDefinition_cached.clear();
		SequenceDefinition.SequenceDefinition_cachedFrames.clear();
		SequenceDefinition.SequenceDefinition_cachedModel.clear();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ltn;II)V",
		garbageValue = "-1013268529"
	)
	public static void method8179(class515 var0, int var1) {
		class150.method3792(var0, (class570)null, true);
		int var2 = var0.method10351();
		if (var2 > 1) {
			var1 %= var2;
			if (var1 != 0) {
				if (var1 < 0) {
					var1 += var2;
				}

				if (var0.field5399 == class570.field5721) {
					int[] var3 = var0.method10348();
					class50.method1869(var3, 0, var2 - 1);
					class50.method1869(var3, 0, var1 - 1);
					class50.method1869(var3, var1, var2 - 1);
				} else if (var0.field5399 == class570.field5724) {
					long[] var4 = var0.method10377();
					class505.method10192(var4, 0, var2 - 1);
					class505.method10192(var4, 0, var1 - 1);
					class505.method10192(var4, var1, var2 - 1);
				} else {
					Object[] var5 = var0.method10393();
					class361.method7510(var5, 0, var2 - 1);
					class361.method7510(var5, 0, var1 - 1);
					class361.method7510(var5, var1, var2 - 1);
				}

			}
		}
	}
}
