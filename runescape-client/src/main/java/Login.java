import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cr")
@Implements("Login")
public class Login {
	@ObfuscatedName("ay")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1389049225
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[Lws;"
	)
	@Export("runesSprite")
	static IndexedSprite[] runesSprite;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lws;"
	)
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lws;"
	)
	@Export("titlebuttonSprite")
	static IndexedSprite titlebuttonSprite;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lws;"
	)
	static IndexedSprite field946;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lws;"
	)
	static IndexedSprite field947;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[Lws;"
	)
	@Export("title_muteSprite")
	static IndexedSprite[] title_muteSprite;
	@ObfuscatedName("ag")
	@Export("ByteArrayPool_alternativeSizes")
	public static int[] ByteArrayPool_alternativeSizes;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1501746543
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 520241235
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("ap")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 2129302267
	)
	@Export("Login_banType")
	static int Login_banType;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -1971964937
	)
	static int field954;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 1154302603
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("cp")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("ca")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("cs")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("cj")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("cy")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("cb")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -1654829431
	)
	static int field940;
	@ObfuscatedName("cv")
	static String[] field963;
	@ObfuscatedName("cg")
	@Export("displayName")
	static String displayName;
	@ObfuscatedName("cq")
	static boolean field968;
	@ObfuscatedName("cz")
	static boolean field969;
	@ObfuscatedName("dc")
	@Export("rememberUsername")
	static boolean rememberUsername;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = 1463208947
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("dq")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = -2070413495
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = -1913450351
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = 1430076403
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		longValue = -5074583641304882139L
	)
	static long field975;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		longValue = 8780390375410215115L
	)
	static long field976;
	@ObfuscatedName("dv")
	static String[] field977;
	@ObfuscatedName("df")
	static String[] field965;
	@ObfuscatedName("de")
	static String[] field953;

	static {
		xPadding = 0;
		loginBoxX = xPadding + 202;
		Login_loadingPercent = 10;
		Login_loadingText = "";
		Login_banType = -1;
		field954 = 1;
		loginIndex = 0;
		Login_response0 = "";
		Login_response1 = "";
		Login_response2 = "";
		Login_response3 = "";
		Login_username = "";
		Login_password = "";
		field940 = 0;
		field963 = new String[8];
		displayName = "";
		field968 = false;
		field969 = false;
		rememberUsername = true;
		currentLoginField = 0;
		worldSelectOpen = false;
		hoveredWorldIndex = -1;
		worldSelectPage = 0;
		worldSelectPagesCount = 0;
		new DecimalFormat("##0.00");
		new class140();
		field975 = -1L;
		field976 = -1L;
		field977 = new String[]{"title.jpg"};
		field965 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"};
		field953 = new String[]{"logo_speedrunning"};
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Lgh;",
		garbageValue = "1646293372"
	)
	@Export("VarpDefinition_get")
	public static VarpDefinition VarpDefinition_get(int var0) {
		VarpDefinition var1 = (VarpDefinition)VarpDefinition.VarpDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class447.VarpDefinition_archive.takeFile(16, var0);
			var1 = new VarpDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			VarpDefinition.VarpDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ng")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ldn;",
		garbageValue = "-1575770184"
	)
	@Export("openInterface")
	static final InterfaceParent openInterface(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent();
		var3.group = var1;
		var3.type = var2;
		Client.interfaceParents.put(var3, (long)var0);
		class133.method3315(var1);
		Widget var4 = class376.widgetDefinition.method6918(var0);
		MilliClock.invalidateWidget(var4);
		if (Client.meslayerContinueWidget != null) {
			MilliClock.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		class95.revalidateWidgetScroll(class376.widgetDefinition.Widget_interfaceComponents[var0 >> 16], var4, false);
		SecureRandomCallable.runWidgetOnLoadListener(var1);
		if (Client.rootInterface != -1) {
			UrlRequester.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3;
	}
}
