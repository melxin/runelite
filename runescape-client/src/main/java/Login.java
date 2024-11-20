import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("df")
@Implements("Login")
public class Login {
	@ObfuscatedName("aw")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1261479289
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lvy;"
	)
	@Export("runesSprite")
	static IndexedSprite[] runesSprite;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	@Export("titlebuttonSprite")
	static IndexedSprite titlebuttonSprite;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	static IndexedSprite field930;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[Lvy;"
	)
	@Export("title_muteSprite")
	static IndexedSprite[] title_muteSprite;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	@Export("options_buttons_2Sprite")
	static IndexedSprite options_buttons_2Sprite;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1953712247
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 220988683
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("am")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1476619585
	)
	@Export("Login_banType")
	static int Login_banType;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -1461455765
	)
	static int field939;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 1236758477
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("cy")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("cv")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("cq")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("cn")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("ck")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("cs")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 956097323
	)
	static int field947;
	@ObfuscatedName("cl")
	static String[] field948;
	@ObfuscatedName("cw")
	@Export("displayName")
	static String displayName;
	@ObfuscatedName("cr")
	static boolean field949;
	@ObfuscatedName("cz")
	static boolean field935;
	@ObfuscatedName("df")
	@Export("rememberUsername")
	static boolean rememberUsername;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = 416222615
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("dr")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = 150919367
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = 2014905661
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = 1029848297
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		longValue = 3181080941858413467L
	)
	static long field960;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		longValue = -3028978127159337269L
	)
	static long field965;
	@ObfuscatedName("du")
	static String[] field962;
	@ObfuscatedName("da")
	static String[] field963;
	@ObfuscatedName("di")
	static String[] field942;

	static {
		xPadding = 0;
		loginBoxX = xPadding + 202;
		Login_loadingPercent = 10;
		Login_loadingText = "";
		Login_banType = -1;
		field939 = 1;
		loginIndex = 0;
		Login_response0 = "";
		Login_response1 = "";
		Login_response2 = "";
		Login_response3 = "";
		Login_username = "";
		Login_password = "";
		field947 = 0;
		field948 = new String[8];
		displayName = "";
		field949 = false;
		field935 = false;
		rememberUsername = true;
		currentLoginField = 0;
		worldSelectOpen = false;
		hoveredWorldIndex = -1;
		worldSelectPage = 0;
		worldSelectPagesCount = 0;
		new DecimalFormat("##0.00");
		new class141();
		field960 = -1L;
		field965 = -1L;
		field962 = new String[]{"title.jpg"};
		field963 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"};
		field942 = new String[]{"logo_speedrunning"};
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "-484492787"
	)
	static int method2330(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? RestClientThreadFactory.scriptDotWidget : WorldMapCacheName.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETX) {
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETY) {
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) {
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.width * 1063514007;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.height * 1899982693;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) {
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) {
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("mh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lnp;I)Ljava/lang/String;",
		garbageValue = "1123317981"
	)
	static String method2331(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) {
			for (int var2 = 1; var2 <= 5; ++var2) {
				while (true) {
					int var3 = var0.indexOf("%" + var2);
					if (var3 == -1) {
						break;
					}

					var0 = var0.substring(0, var3) + class544.method9956(class300.method6248(var1, var2 - 1)) + var0.substring(var3 + 2);
				}
			}
		}

		return var0;
	}

	@ObfuscatedName("nv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2112877366"
	)
	static final void method2332() {
		PacketBufferNode var0 = Message.getPacketBufferNode(ClientPacket.CLOSE_MODAL, Client.packetWriter.isaacCipher);
		Client.packetWriter.addNode(var0);
		Interpreter.field868 = true;

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) {
			if (var1.type == 0 || var1.type == 3) {
				class60.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) {
			class178.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		Interpreter.field868 = false;
	}
}
