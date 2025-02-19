import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ep")
@Implements("AttackOption")
public enum AttackOption implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lep;"
	)
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lep;"
	)
	@Export("AttackOption_alwaysRightClick")
	AttackOption_alwaysRightClick(1),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lep;"
	)
	field1404(2),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lep;"
	)
	@Export("AttackOption_hidden")
	AttackOption_hidden(3),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lep;"
	)
	field1407(4);

	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -62437479
	)
	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "32"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([BILjava/lang/CharSequence;I)I",
		garbageValue = "-1613605709"
	)
	public static int method2952(byte[] var0, int var1, CharSequence var2) {
		int var3 = var2.length();
		int var4 = var1;

		for (int var5 = 0; var5 < var3; ++var5) {
			char var6 = var2.charAt(var5);
			if (var6 <= 127) {
				var0[var4++] = (byte)var6;
			} else if (var6 <= 2047) {
				var0[var4++] = (byte)(192 | var6 >> 6);
				var0[var4++] = (byte)(128 | var6 & '?');
			} else {
				var0[var4++] = (byte)(224 | var6 >> '\f');
				var0[var4++] = (byte)(128 | var6 >> 6 & 63);
				var0[var4++] = (byte)(128 | var6 & '?');
			}
		}

		return var4 - var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-687064702"
	)
	static void method2950(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			var1.remove();
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lnz;I[B[BB)V",
		garbageValue = "120"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3939 == null) {
			if (var2 == null) {
				return;
			}

			var0.field3939 = new byte[11][];
			var0.field4012 = new byte[11][];
			var0.field4011 = new int[11];
			var0.field4014 = new int[11];
		}

		var0.field3939[var1] = var2;
		if (var2 != null) {
			var0.field3976 = true;
		} else {
			var0.field3976 = false;

			for (int var4 = 0; var4 < var0.field3939.length; ++var4) {
				if (var0.field3939[var4] != null) {
					var0.field3976 = true;
					break;
				}
			}
		}

		var0.field4012[var1] = var3;
	}
}
