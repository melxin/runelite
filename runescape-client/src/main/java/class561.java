import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vx")
public class class561 implements Enum {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lvx;"
	)
	public static final class561 field5530;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lvx;"
	)
	public static final class561 field5525;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lvx;"
	)
	static final class561 field5526;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lvx;"
	)
	static final class561 field5527;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lvx;"
	)
	static final class561 field5524;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lvx;"
	)
	static final class561 field5529;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -42420991
	)
	static int field5532;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 994383499
	)
	final int field5528;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -2080132907
	)
	final int field5531;

	static {
		field5530 = new class561(3, 0);
		field5525 = new class561(0, 2);
		field5526 = new class561(1, 5);
		field5527 = new class561(2, 6);
		field5524 = new class561(4, 7);
		field5529 = new class561(5, 8);
	}

	class561(int var1, int var2) {
		this.field5528 = var1;
		this.field5531 = var2;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "328272051"
	)
	public boolean method10576() {
		return this == field5525;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "118"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5531;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "-106"
	)
	public static String method10574(String var0) {
		StringBuilder var1 = new StringBuilder(var0.length());
		int var2 = 0;
		int var3 = -1;

		for (int var4 = 0; var4 < var0.length(); ++var4) {
			char var5 = var0.charAt(var4);
			if (var5 == '<') {
				var1.append(var0.substring(var2, var4));
				var3 = var4;
			} else if (var5 == '>' && var3 != -1) {
				String var6 = var0.substring(var3 + 1, var4);
				var3 = -1;
				if (var6.equals("lt")) {
					var1.append("<");
				} else if (var6.equals("gt")) {
					var1.append(">");
				} else if (var6.equals("br")) {
					var1.append("\n");
				}

				var2 = var4 + 1;
			}
		}

		if (var2 < var0.length()) {
			var1.append(var0.substring(var2, var0.length()));
		}

		return var1.toString();
	}
}
