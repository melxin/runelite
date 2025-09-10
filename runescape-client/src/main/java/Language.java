import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qh")
@Implements("Language")
public class Language implements Enum {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Lqh;"
	)
	@Export("Language_valuesOrdered")
	static final Language[] Language_valuesOrdered;
	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "[Lxc;"
	)
	static IndexedSprite[] field5104;
	@ObfuscatedName("as")
	final String field5099;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -753098375
	)
	@Export("id")
	final int id;
	@ObfuscatedName("ai")
	@Export("language")
	final String language;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field5120, 0, "GB");
		Language_DE = new Language("DE", "de", "German", ModeWhere.field5120, 1, "DE");
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field5120, 2, "FR");
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field5120, 3, "BR");
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field5107, 4, "NL");
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field5107, 5, "ES");
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field5120, 6, "MX");
		Language[] var0 = method8659();
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
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqy;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field5099 = var1;
		this.language = var2;
		this.id = var5;
		if (var6 != null) {
			new Locale(var2.substring(0, 2), var6);
		} else {
			new Locale(var2.substring(0, 2));
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1935172756"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "945116391"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language;
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Lqh;",
		garbageValue = "-1095462795"
	)
	static Language[] method8659() {
		return new Language[]{Language_ES, Language_FR, Language_DE, Language_PT, Language_EN, Language_NL, Language_ES_MX};
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Lqh;",
		garbageValue = "-776001967"
	)
	public static Language method8648(int var0) {
		return var0 >= 0 && var0 < Language_valuesOrdered.length ? Language_valuesOrdered[var0] : null;
	}

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(I)Lvj;",
		garbageValue = "1408246229"
	)
	@Export("getPlatformInfo")
	static PlatformInfo getPlatformInfo() {
		return AbstractWorldMapIcon.platformInfo;
	}
}
