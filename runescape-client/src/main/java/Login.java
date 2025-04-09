import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
@Implements("Login")
public class Login {
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 73802265
	)
	static int field963;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -2137639531
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -1060119059
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("bm")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1555139123
	)
	@Export("Login_banType")
	static int Login_banType;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 386961377
	)
	static int field956;
	@ObfuscatedName("by")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("bf")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -1320622535
	)
	static int field940;
	@ObfuscatedName("cg")
	static String[] field933;
	@ObfuscatedName("cs")
	@Export("rememberUsername")
	static boolean rememberUsername;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "[Lws;"
	)
	@Export("runesSprite")
	static IndexedSprite[] runesSprite;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 163102415
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -2142617037
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("cm")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("cn")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("ch")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("ce")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("cy")
	@Export("displayName")
	static String displayName;
	@ObfuscatedName("db")
	static boolean field943;
	@ObfuscatedName("dp")
	static boolean field952;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = -99582175
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("dc")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "[Lws;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = 1122153493
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = -2123998215
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = -2116346547
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		longValue = -7345220688028794647L
	)
	static long field944;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		longValue = -7462639598366167655L
	)
	static long field962;
	@ObfuscatedName("dy")
	static String[] field948;
	@ObfuscatedName("dw")
	static String[] field964;
	@ObfuscatedName("di")
	static String[] field965;

	static {
		new DecimalFormat("##0.00");
		new class138();
		xPadding = 0;
		Login_loadingPercent = 10;
		Login_loadingText = "";
		Login_banType = -1;
		field956 = 1;
		Login_username = "";
		Login_password = "";
		field940 = 0;
		field933 = new String[8];
		rememberUsername = true;
		loginBoxX = xPadding + 202;
		loginIndex = 0;
		Login_response0 = "";
		Login_response1 = "";
		Login_response2 = "";
		Login_response3 = "";
		displayName = "";
		field943 = false;
		field952 = false;
		currentLoginField = 0;
		worldSelectOpen = false;
		hoveredWorldIndex = -1;
		worldSelectPage = 0;
		worldSelectPagesCount = 0;
		field944 = -1L;
		field962 = -1L;
		field948 = new String[]{"title.jpg"};
		field964 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"};
		field965 = new String[]{"logo_speedrunning"};
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "31"
	)
	static final boolean method2323(int var0) {
		if (var0 >= 2000) {
			var0 -= 2000;
		}

		return var0 == 1007;
	}
}
