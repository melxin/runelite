import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aa")
@Implements("HttpMethod")
public class HttpMethod implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	@Export("POST")
	public static final HttpMethod POST;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	@Export("GET")
	public static final HttpMethod GET;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	@Export("PUT")
	static final HttpMethod PUT;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	@Export("PATCH")
	static final HttpMethod PATCH;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	@Export("DELETE")
	static final HttpMethod DELETE;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "Lxl;"
	)
	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -571964659
	)
	int field35;
	@ObfuscatedName("ae")
	@Export("name")
	String name;
	@ObfuscatedName("aq")
	boolean field39;
	@ObfuscatedName("ac")
	boolean field32;

	static {
		POST = new HttpMethod(0, "POST", true, true);
		GET = new HttpMethod(1, "GET", true, false);
		PUT = new HttpMethod(2, "PUT", false, true);
		PATCH = new HttpMethod(3, "PATCH", false, true);
		DELETE = new HttpMethod(4, "DELETE", false, true);
	}

	HttpMethod(int var1, String var2, boolean var3, boolean var4) {
		this.field35 = var1;
		this.name = var2;
		this.field39 = var3;
		this.field32 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1012656358"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field35;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	boolean method71() {
		return this.field39;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "52"
	)
	@Export("getName")
	public String getName() {
		return this.name;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2139143616"
	)
	boolean method68() {
		return this.field32;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II[BIB)I",
		garbageValue = "53"
	)
	@Export("encodeStringCp1252")
	public static int encodeStringCp1252(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var5 = var2 - var1;

		for (int var6 = 0; var6 < var5; ++var6) {
			char var7 = var0.charAt(var6 + var1);
			if ((var7 <= 0 || var7 >= 128) && (var7 < 160 || var7 > 255)) {
				if (var7 == 8364) {
					var3[var6 + var4] = -128;
				} else if (var7 == 8218) {
					var3[var6 + var4] = -126;
				} else if (var7 == 402) {
					var3[var6 + var4] = -125;
				} else if (var7 == 8222) {
					var3[var6 + var4] = -124;
				} else if (var7 == 8230) {
					var3[var6 + var4] = -123;
				} else if (var7 == 8224) {
					var3[var6 + var4] = -122;
				} else if (var7 == 8225) {
					var3[var6 + var4] = -121;
				} else if (var7 == 710) {
					var3[var6 + var4] = -120;
				} else if (var7 == 8240) {
					var3[var6 + var4] = -119;
				} else if (var7 == 352) {
					var3[var6 + var4] = -118;
				} else if (var7 == 8249) {
					var3[var6 + var4] = -117;
				} else if (var7 == 338) {
					var3[var6 + var4] = -116;
				} else if (var7 == 381) {
					var3[var6 + var4] = -114;
				} else if (var7 == 8216) {
					var3[var6 + var4] = -111;
				} else if (var7 == 8217) {
					var3[var6 + var4] = -110;
				} else if (var7 == 8220) {
					var3[var6 + var4] = -109;
				} else if (var7 == 8221) {
					var3[var6 + var4] = -108;
				} else if (var7 == 8226) {
					var3[var6 + var4] = -107;
				} else if (var7 == 8211) {
					var3[var6 + var4] = -106;
				} else if (var7 == 8212) {
					var3[var6 + var4] = -105;
				} else if (var7 == 732) {
					var3[var6 + var4] = -104;
				} else if (var7 == 8482) {
					var3[var6 + var4] = -103;
				} else if (var7 == 353) {
					var3[var6 + var4] = -102;
				} else if (var7 == 8250) {
					var3[var6 + var4] = -101;
				} else if (var7 == 339) {
					var3[var6 + var4] = -100;
				} else if (var7 == 382) {
					var3[var6 + var4] = -98;
				} else if (var7 == 376) {
					var3[var6 + var4] = -97;
				} else {
					var3[var6 + var4] = 63;
				}
			} else {
				var3[var6 + var4] = (byte)var7;
			}
		}

		return var5;
	}
}
