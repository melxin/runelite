import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bk")
@Implements("Login")
public class Login {
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -1282120513
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -738551839
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("bv")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -639443783
	)
	@Export("Login_banType")
	static int Login_banType;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 1888337121
	)
	static int field712;
	@ObfuscatedName("bd")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("bt")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 1932509845
	)
	static int field715;
	@ObfuscatedName("cy")
	static String[] field714;
	@ObfuscatedName("cl")
	@Export("rememberUsername")
	static boolean rememberUsername;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -1432903169
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -1449081183
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("cc")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("cd")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("cm")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("co")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("cg")
	@Export("displayName")
	static String displayName;
	@ObfuscatedName("dt")
	static boolean field728;
	@ObfuscatedName("dq")
	static boolean field726;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = 453582389
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("dl")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "Lxc;"
	)
	static IndexedSprite field731;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = -1439064883
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = -1878725487
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = -1286801169
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		longValue = -1220327297563305153L
	)
	static long field725;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		longValue = -8558240262965170717L
	)
	static long field709;
	@ObfuscatedName("dk")
	static String[] field737;
	@ObfuscatedName("db")
	static String[] field706;
	@ObfuscatedName("de")
	static String[] field739;

	static {
		new DecimalFormat("##0.00");
		new class141();
		xPadding = 0;
		Login_loadingPercent = 10;
		Login_loadingText = "";
		Login_banType = -1;
		field712 = 1;
		Login_username = "";
		Login_password = "";
		field715 = 0;
		field714 = new String[8];
		rememberUsername = true;
		loginBoxX = xPadding + 202;
		loginIndex = 0;
		Login_response0 = "";
		Login_response1 = "";
		Login_response2 = "";
		Login_response3 = "";
		displayName = "";
		field728 = false;
		field726 = false;
		currentLoginField = 0;
		worldSelectOpen = false;
		hoveredWorldIndex = -1;
		worldSelectPage = 0;
		worldSelectPagesCount = 0;
		field725 = -1L;
		field709 = -1L;
		field737 = new String[]{"title.jpg"};
		field706 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"};
		field739 = new String[]{"logo_speedrunning", "logo_ugc_world"};
	}

	@ObfuscatedName("oo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1535071577"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		SwapSongTask.method9698();
		if (class445.friendsChat != null) {
			class445.friendsChat.invalidateIgnoreds();
		}

	}
}
