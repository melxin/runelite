import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uj")
@Implements("HttpContentType")
public class HttpContentType {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Luj;"
	)
	@Export("APPLICATION_JSON")
	public static final HttpContentType APPLICATION_JSON;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Luj;"
	)
	@Export("TEXT_PLAIN")
	static final HttpContentType TEXT_PLAIN;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Luj;"
	)
	@Export("APPLICATION_X_WWW_FORM_URLENCODED")
	static final HttpContentType APPLICATION_X_WWW_FORM_URLENCODED;
	@ObfuscatedName("ac")
	@Export("contentType")
	String contentType;

	static {
		APPLICATION_JSON = new HttpContentType("application/json");
		TEXT_PLAIN = new HttpContentType("text/plain");
		APPLICATION_X_WWW_FORM_URLENCODED = new HttpContentType("application/x-www-form-urlencoded");
	}

	HttpContentType(String var1) {
		this.contentType = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1122320589"
	)
	@Export("getValue")
	public String getValue() {
		return this.contentType;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2015424076"
	)
	static boolean method10482() {
		Date var0;
		try {
			SimpleDateFormat var2 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
			var2.setLenient(false);
			StringBuilder var3 = new StringBuilder();
			String[] var4 = Login.field739;
			int var5 = 0;

			while (true) {
				Date var1;
				if (var5 < var4.length) {
					String var6 = var4[var5];
					if (var6 != null) {
						var3.append(var6);
						++var5;
						continue;
					}

					class51.method1893("Date not valid.", "Please ensure all characters are populated.", "");
					var1 = null;
				} else {
					var3.append("12");
					var1 = var2.parse(var3.toString());
				}

				var0 = var1;
				break;
			}
		} catch (ParseException var9) {
			class51.method1893("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
			return false;
		}

		if (var0 == null) {
			return false;
		} else {
			boolean var7 = Tile.method4925(var0);
			boolean var8 = UserComparator10.method3580(var0);
			if (!var8) {
				class51.method1893("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
				return false;
			} else {
				if (!var7) {
					class563.field5778 = 8388607;
				} else {
					class563.field5778 = (int)(var0.getTime() / 86400000L - 11745L);
				}

				return true;
			}
		}
	}
}
