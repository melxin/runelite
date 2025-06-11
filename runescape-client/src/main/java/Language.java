import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qt")
@Implements("Language")
public class Language implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lqt;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lqt;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lqt;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lqt;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lqt;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lqt;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lqt;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lqt;"
	)
	@Export("Language_valuesOrdered")
	public static final Language[] Language_valuesOrdered;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1685787363
	)
	static int field4892;
	@ObfuscatedName("am")
	final String field4887;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -433478557
	)
	@Export("id")
	final int id;
	@ObfuscatedName("au")
	@Export("language")
	final String language;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field4909, 0, "GB");
		Language_DE = new Language("DE", "de", "German", ModeWhere.field4909, 1, "DE");
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field4909, 2, "FR");
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field4909, 3, "BR");
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field4896, 4, "NL");
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field4896, 5, "ES");
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field4909, 6, "MX");
		Language[] var0 = method8377();
		Language_valuesOrdered = new Language[var0.length];
		Language[] var1 = var0;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			Language var3 = var1[var2];
			if (Language_valuesOrdered[var3.id] != null) {
				throw new IllegalStateException();
			}

			Language_valuesOrdered[var3.id] = var3;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqm;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field4887 = var1;
		this.language = var2;
		this.id = var5;
		if (var6 != null) {
			new Locale(var2.substring(0, 2), var6);
		} else {
			new Locale(var2.substring(0, 2));
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "26"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1662937496"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language;
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)[Lqt;",
		garbageValue = "-16"
	)
	static Language[] method8377() {
		return new Language[]{Language_FR, Language_DE, Language_ES_MX, Language_EN, Language_PT, Language_ES, Language_NL};
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(ILcr;ZB)I",
		garbageValue = "-1"
	)
	static int method8369(int var0, Script var1, boolean var2) {
		return 2;
	}

	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "659903836"
	)
	public static final void method8379(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) {
			if (Client.rootWidgetXs[var4] + Client.rootWidgetWidths[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetHeights[var4] + Client.rootWidgetYs[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) {
				Client.validRootWidgets[var4] = true;
			}
		}

	}
}
