import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("qd")
@Implements("Language")
public class Language implements Enum {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lqd;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lqd;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lqd;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lqd;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lqd;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lqd;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lqd;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Lqd;"
	)
	@Export("Language_valuesOrdered")
	public static final Language[] Language_valuesOrdered;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	@Export("ItemDefinition_modelArchive")
	public static AbstractArchive ItemDefinition_modelArchive;
	@ObfuscatedName("aw")
	final String field5149;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1526259553
	)
	@Export("id")
	final int id;
	@ObfuscatedName("au")
	@Export("language")
	final String language;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field5178, 0, "GB");
		Language_DE = new Language("DE", "de", "German", ModeWhere.field5178, 1, "DE");
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field5178, 2, "FR");
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field5178, 3, "BR");
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field5166, 4, "NL");
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field5166, 5, "ES");
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field5178, 6, "MX");
		Language[] var0 = method8934();
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
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqa;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field5149 = var1;
		this.language = var2;
		this.id = var5;
		if (var6 != null) {
			new Locale(var2.substring(0, 2), var6);
		} else {
			new Locale(var2.substring(0, 2));
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "20"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1737140580"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language;
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)[Lqd;",
		garbageValue = "694448490"
	)
	static Language[] method8934() {
		return new Language[]{Language_ES, Language_NL, Language_ES_MX, Language_FR, Language_PT, Language_DE, Language_EN};
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILcu;ZI)I",
		garbageValue = "-857343037"
	)
	static int method8940(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = LoginPacket.Widget_unpackTargetMask(class191.getWidgetFlags(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.CC_GETOP) {
			if (var0 == ScriptOpcodes.CC_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
			}

			return 1;
		}
	}

	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;IIIIIII)V",
		garbageValue = "1976279533"
	)
	static final void method8932(int var0, String var1, String var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (!Client.isMenuOpen) {
			if (HttpRequestTask.method288(var8, var3)) {
				if (var0 >= 0 && var0 < Client.menu.subMenus.length) {
					if (Client.menu.subMenus[var0] == null) {
						Client.menu.subMenus[var0] = new Menu(false);
					}

					Client.menu.subMenus[var0].insertMenuItem(var1, var2, var3, var4, var5, var6, var7, false, var8);
				}
			}
		}
	}
}
