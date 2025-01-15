import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iu")
public class class211 extends class226 {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1492450491
	)
	int field2353;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	final class223 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lic;Ljava/lang/String;I)V"
	)
	class211(class223 var1, String var2, int var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field2353 = var3;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-681041604"
	)
	public int vmethod5060() {
		return 0;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2027661207"
	)
	public int vmethod5064() {
		return this.field2353;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-83"
	)
	public static void method4837() {
		class241.field2007.clear();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lph;I)I",
		garbageValue = "783041897"
	)
	@Export("compareStrings")
	public static int compareStrings(CharSequence var0, CharSequence var1, Language var2) {
		int var3 = var0.length();
		int var4 = var1.length();
		int var5 = 0;
		int var6 = 0;
		char var7 = 0;
		char var8 = 0;

		while (var5 - var7 < var3 || var6 - var8 < var4) {
			if (var5 - var7 >= var3) {
				return -1;
			}

			if (var6 - var8 >= var4) {
				return 1;
			}

			char var9;
			if (var7 != 0) {
				var9 = var7;
				boolean var14 = false;
			} else {
				var9 = var0.charAt(var5++);
			}

			char var10;
			if (var8 != 0) {
				var10 = var8;
				boolean var15 = false;
			} else {
				var10 = var1.charAt(var6++);
			}

			var7 = class172.method3861(var9);
			var8 = class172.method3861(var10);
			var9 = HealthBarUpdate.standardizeChar(var9, var2);
			var10 = HealthBarUpdate.standardizeChar(var10, var2);
			if (var10 != var9 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) {
				var9 = Character.toLowerCase(var9);
				var10 = Character.toLowerCase(var10);
				if (var9 != var10) {
					return class390.lowercaseChar(var9, var2) - class390.lowercaseChar(var10, var2);
				}
			}
		}

		int var16 = Math.min(var3, var4);

		char var12;
		int var17;
		for (var17 = 0; var17 < var16; ++var17) {
			if (var2 == Language.Language_FR) {
				var5 = var3 - 1 - var17;
				var6 = var4 - 1 - var17;
			} else {
				var6 = var17;
				var5 = var17;
			}

			char var11 = var0.charAt(var5);
			var12 = var1.charAt(var6);
			if (var11 != var12 && Character.toUpperCase(var11) != Character.toUpperCase(var12)) {
				var11 = Character.toLowerCase(var11);
				var12 = Character.toLowerCase(var12);
				if (var11 != var12) {
					return class390.lowercaseChar(var11, var2) - class390.lowercaseChar(var12, var2);
				}
			}
		}

		var17 = var3 - var4;
		if (var17 != 0) {
			return var17;
		} else {
			for (int var18 = 0; var18 < var16; ++var18) {
				var12 = var0.charAt(var18);
				char var13 = var1.charAt(var18);
				if (var12 != var13) {
					return class390.lowercaseChar(var12, var2) - class390.lowercaseChar(var13, var2);
				}
			}

			return 0;
		}
	}

	@ObfuscatedName("oy")
	@ObfuscatedSignature(
		descriptor = "(Lna;S)Lna;",
		garbageValue = "3509"
	)
	static Widget method4832(Widget var0) {
		int var2 = class232.getWidgetFlags(var0);
		int var1 = var2 >> 17 & 7;
		int var3 = var1;
		if (var1 == 0) {
			return null;
		} else {
			for (int var4 = 0; var4 < var3; ++var4) {
				var0 = ClanChannel.widgetDefinition.method7031(var0.parentId);
				if (var0 == null) {
					return null;
				}
			}

			return var0;
		}
	}
}
