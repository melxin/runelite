import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cw")
@Implements("Login")
public class Login {
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 53383595
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 1439150157
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("bk")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 386143697
	)
	@Export("Login_banType")
	static int Login_banType;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -739684033
	)
	static int field735;
	@ObfuscatedName("bf")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("bw")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -470643107
	)
	static int field738;
	@ObfuscatedName("cz")
	static String[] field739;
	@ObfuscatedName("ci")
	@Export("rememberUsername")
	static boolean rememberUsername;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -1677396459
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -30338501
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("co")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("ck")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("ct")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("ch")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("cs")
	@Export("displayName")
	static String displayName;
	@ObfuscatedName("ds")
	static boolean field727;
	@ObfuscatedName("dt")
	static boolean field749;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = -450173939
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("dw")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = -1369164661
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = -1025910609
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = 233820001
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		longValue = 6414092843493180553L
	)
	static long field757;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		longValue = -766820427029736397L
	)
	static long field734;
	@ObfuscatedName("df")
	static String[] field759;
	@ObfuscatedName("dx")
	static String[] field760;
	@ObfuscatedName("di")
	static String[] field761;

	static {
		new DecimalFormat("##0.00");
		new class142();
		xPadding = 0;
		Login_loadingPercent = 10;
		Login_loadingText = "";
		Login_banType = -1;
		field735 = 1;
		Login_username = "";
		Login_password = "";
		field738 = 0;
		field739 = new String[8];
		rememberUsername = true;
		loginBoxX = xPadding + 202;
		loginIndex = 0;
		Login_response0 = "";
		Login_response1 = "";
		Login_response2 = "";
		Login_response3 = "";
		displayName = "";
		field727 = false;
		field749 = false;
		currentLoginField = 0;
		worldSelectOpen = false;
		hoveredWorldIndex = -1;
		worldSelectPage = 0;
		worldSelectPagesCount = 0;
		field757 = -1L;
		field734 = -1L;
		field759 = new String[]{"title.jpg"};
		field760 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"};
		field761 = new String[]{"logo_speedrunning", "logo_ugc_world"};
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1124113315"
	)
	static final void method1909() {
		WorldMapData_0.method6354();
	}
}
