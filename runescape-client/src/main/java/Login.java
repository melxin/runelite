import java.text.DecimalFormat;
import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
@Implements("Login")
public class Login {
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -558458943
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1787117131
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("bg")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 1788265615
	)
	@Export("Login_banType")
	static int Login_banType;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -45553965
	)
	static int field741;
	@ObfuscatedName("bk")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("bh")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -691955639
	)
	static int field744;
	@ObfuscatedName("cy")
	static String[] field757;
	@ObfuscatedName("cu")
	@Export("rememberUsername")
	static boolean rememberUsername;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Lwy;"
	)
	static IndexedSprite field747;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 1117025431
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -63164875
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("cc")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("cn")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("cv")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("cb")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("cm")
	@Export("displayName")
	static String displayName;
	@ObfuscatedName("dk")
	static boolean field758;
	@ObfuscatedName("de")
	static boolean field732;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = -1097018047
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("dd")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "[Lwy;"
	)
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = -1362492151
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = 1138797359
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = -494498901
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		longValue = -1003298551003445581L
	)
	static long field765;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		longValue = 6325125506606795807L
	)
	static long field766;
	@ObfuscatedName("da")
	static String[] field769;
	@ObfuscatedName("dz")
	static String[] field768;
	@ObfuscatedName("do")
	static String[] field737;
	@ObfuscatedName("ix")
	@ObfuscatedGetter(
		intValue = -467516851
	)
	static int field771;

	static {
		new DecimalFormat("##0.00");
		new class139();
		xPadding = 0;
		Login_loadingPercent = 10;
		Login_loadingText = "";
		Login_banType = -1;
		field741 = 1;
		Login_username = "";
		Login_password = "";
		field744 = 0;
		field757 = new String[8];
		rememberUsername = true;
		loginBoxX = xPadding + 202;
		loginIndex = 0;
		Login_response0 = "";
		Login_response1 = "";
		Login_response2 = "";
		Login_response3 = "";
		displayName = "";
		field758 = false;
		field732 = false;
		currentLoginField = 0;
		worldSelectOpen = false;
		hoveredWorldIndex = -1;
		worldSelectPage = 0;
		worldSelectPagesCount = 0;
		field765 = -1L;
		field766 = -1L;
		field769 = new String[]{"title.jpg"};
		field768 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"};
		field737 = new String[]{"logo_speedrunning"};
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIII)V",
		garbageValue = "-659173007"
	)
	public static void method1870(ArrayList var0, int var1, int var2, int var3, int var4) {
		class335.field3698.clear();
		class335.field3698.addAll(var0);
		class335.musicPlayerStatus = var1;
		class335.field3697 = var2;
		class335.field3702 = var3;
		class335.field3703 = var4;
	}
}
