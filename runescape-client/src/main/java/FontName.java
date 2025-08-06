import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vp")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lvp;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lvp;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lvp;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lvp;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lvp;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lvp;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1714928913
	)
	static int field5650;
	@ObfuscatedName("ah")
	@Export("name")
	String name;

	static {
		FontName_plain11 = new FontName("p11_full");
		FontName_plain12 = new FontName("p12_full");
		FontName_bold12 = new FontName("b12_full");
		FontName_verdana11 = new FontName("verdana_11pt_regular");
		FontName_verdana13 = new FontName("verdana_13pt_regular");
		FontName_verdana15 = new FontName("verdana_15pt_regular");
	}

	FontName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)[Lvp;",
		garbageValue = "1437619795"
	)
	public static FontName[] method10903() {
		return new FontName[]{FontName_plain12, FontName_verdana15, FontName_bold12, FontName_verdana11, FontName_verdana13, FontName_plain11};
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1266463018"
	)
	public static void method10904() {
		HealthBarDefinition.HealthBarDefinition_cached.clear();
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ltn;Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1677319468"
	)
	public static String method10901(DynamicArray var0, String var1) {
		class267.method6013(var0, class570.field5718);
		int var2 = var0.method10351();
		String[] var3 = (String[])((String[])var0.method10393());
		if (var2 == 0) {
			return "";
		} else if (var2 == 1) {
			return var3[0];
		} else {
			int var4 = var1.length();
			int var5 = var4 * (var2 - 1);

			for (int var6 = 0; var6 < var2; ++var6) {
				var5 += var3[var6].length();
			}

			char[] var9 = new char[var5];
			int var7 = 0;

			for (int var8 = 0; var8 < var2; ++var8) {
				if (var8 > 0) {
					var1.getChars(0, var4, var9, var7);
					var7 += var4;
				}

				var3[var8].getChars(0, var3[var8].length(), var9, var7);
				var7 += var3[var8].length();
			}

			return new String(var9);
		}
	}
}
