import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("by")
@Implements("Login")
public class Login {
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1123335267
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -2118509137
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("bg")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -655582147
	)
	@Export("Login_banType")
	static int Login_banType;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 870328619
	)
	static int field713;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lri;"
	)
	static Bounds field714;
	@ObfuscatedName("bk")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("bb")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 1818581031
	)
	static int field708;
	@ObfuscatedName("cs")
	static String[] field706;
	@ObfuscatedName("cq")
	@Export("rememberUsername")
	static boolean rememberUsername;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Lxa;"
	)
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = -1249640365
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -565834461
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("co")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("ca")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("cz")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("cd")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("cf")
	@Export("displayName")
	static String displayName;
	@ObfuscatedName("da")
	static boolean field710;
	@ObfuscatedName("di")
	static boolean field729;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = -1061282721
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("dt")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = -853645697
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = -592512357
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = -983693715
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		longValue = 2666286902612077441L
	)
	static long field737;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		longValue = 2676173680281822733L
	)
	static long field738;
	@ObfuscatedName("dv")
	static String[] field734;
	@ObfuscatedName("dm")
	static String[] field740;
	@ObfuscatedName("dl")
	static String[] field741;
	@ObfuscatedName("vz")
	@ObfuscatedGetter(
		intValue = 1981743369
	)
	static int field743;

	static {
		new DecimalFormat("##0.00");
		new class140();
		xPadding = 0;
		Login_loadingPercent = 10;
		Login_loadingText = "";
		Login_banType = -1;
		field713 = 1;
		Login_username = "";
		Login_password = "";
		field708 = 0;
		field706 = new String[8];
		rememberUsername = true;
		loginBoxX = xPadding + 202;
		loginIndex = 0;
		Login_response0 = "";
		Login_response1 = "";
		Login_response2 = "";
		Login_response3 = "";
		displayName = "";
		field710 = false;
		field729 = false;
		currentLoginField = 0;
		worldSelectOpen = false;
		hoveredWorldIndex = -1;
		worldSelectPage = 0;
		worldSelectPagesCount = 0;
		field737 = -1L;
		field738 = -1L;
		field734 = new String[]{"title.jpg"};
		field740 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"};
		field741 = new String[]{"logo_speedrunning"};
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lnw;IB)Lnw;",
		garbageValue = "-93"
	)
	public static class357 method1930(class357 var0, int var1) {
		for (class357 var2 = var0; var2 != null; var2 = var2.field3959) {
			if (var1 >= var2.field3956 && var1 <= var2.field3957) {
				return var2;
			}
		}

		return null;
	}
}
