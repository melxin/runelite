import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
public enum class67 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	field907(0, -1),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	field903(1, 2),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	field904(2, 3),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	field905(3, 4),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	field906(4, 5),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	field911(5, 6),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	field908(6, 21);

	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -74735139
	)
	final int field909;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1136079159
	)
	final int field910;

	class67(int var3, int var4) {
		this.field909 = var3;
		this.field910 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1012656358"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field910;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Date;",
		garbageValue = "-1680495975"
	)
	static Date method2190() throws ParseException {
		SimpleDateFormat var0 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
		var0.setLenient(false);
		StringBuilder var1 = new StringBuilder();
		String[] var2 = Login.field714;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			String var4 = var2[var3];
			if (var4 == null) {
				GrandExchangeOfferWorldComparator.method8565("Date not valid.", "Please ensure all characters are populated.", "");
				return null;
			}

			var1.append(var4);
		}

		var1.append("12");
		return var0.parse(var1.toString());
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;IIB)V",
		garbageValue = "-51"
	)
	static void method2192(Object[] var0, int var1, int var2) {
		while (var1 < var2) {
			Object var3 = var0[var1];
			var0[var1] = var0[var2];
			var0[var2] = var3;
			++var1;
			--var2;
		}

	}
}
