import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
@Implements("Login")
public class Login {
	@ObfuscatedName("ah")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 842190767
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	static IndexedSprite field953;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	@Export("options_buttons_0Sprite")
	static IndexedSprite options_buttons_0Sprite;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1302722243
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1956762505
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("ab")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1208359389
	)
	@Export("Login_banType")
	static int Login_banType;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -530189941
	)
	static int field933;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -1665646229
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("cc")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("co")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("ca")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("cg")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("cp")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("cz")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -1569124111
	)
	static int field941;
	@ObfuscatedName("cq")
	static String[] field922;
	@ObfuscatedName("cw")
	@Export("displayName")
	static String displayName;
	@ObfuscatedName("cm")
	static boolean field944;
	@ObfuscatedName("ce")
	static boolean field945;
	@ObfuscatedName("dh")
	@Export("rememberUsername")
	static boolean rememberUsername;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = -2132296769
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("dk")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = -379107653
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = 1580884855
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = -677325775
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		longValue = 1896037882520525433L
	)
	static long field954;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		longValue = 7759505693981960565L
	)
	static long field927;
	@ObfuscatedName("db")
	static String[] field956;
	@ObfuscatedName("du")
	static String[] field960;
	@ObfuscatedName("da")
	static String[] field958;

	static {
		xPadding = 0;
		loginBoxX = xPadding + 202;
		Login_loadingPercent = 10;
		Login_loadingText = "";
		Login_banType = -1;
		field933 = 1;
		loginIndex = 0;
		Login_response0 = "";
		Login_response1 = "";
		Login_response2 = "";
		Login_response3 = "";
		Login_username = "";
		Login_password = "";
		field941 = 0;
		field922 = new String[8];
		displayName = "";
		field944 = false;
		field945 = false;
		rememberUsername = true;
		currentLoginField = 0;
		worldSelectOpen = false;
		hoveredWorldIndex = -1;
		worldSelectPage = 0;
		worldSelectPagesCount = 0;
		new DecimalFormat("##0.00");
		new class140();
		field954 = -1L;
		field927 = -1L;
		field956 = new String[]{"title.jpg"};
		field960 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"};
		field958 = new String[]{"logo_speedrunning"};
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)[Ldw;",
		garbageValue = "520429248"
	)
	static class92[] method2388() {
		return new class92[]{class92.field1102, class92.field1108, class92.field1097, class92.field1100, class92.field1099};
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "905060007"
	)
	static final boolean method2449() {
		return ViewportMouse.ViewportMouse_isInViewport;
	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "2034434558"
	)
	static void method2450(int var0, int var1, int var2, int var3, int var4, int var5) {
		NodeDeque var6 = class30.worldView.groundItems[var0][var1][var2];
		if (var6 != null) {
			for (TileItem var7 = (TileItem)var6.last(); var7 != null; var7 = (TileItem)var6.previous()) {
				if ((var3 & 32767) == var7.id && var4 == var7.quantity) {
					var7.quantity = var5;
					break;
				}
			}

			ByteArrayPool.updateItemPile(var0, var1, var2);
		}

	}
}
