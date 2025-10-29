import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bv")
@Implements("Login")
public class Login {
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 921778921
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 1230510771
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("bn")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1858173113
	)
	@Export("Login_banType")
	static int Login_banType;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1340994199
	)
	static int field688;
	@ObfuscatedName("bq")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("bx")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 465659907
	)
	static int field706;
	@ObfuscatedName("ce")
	static String[] field694;
	@ObfuscatedName("cm")
	@Export("rememberUsername")
	static boolean rememberUsername;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 743318851
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -1614560929
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("cw")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("cr")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("cj")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("ca")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("cl")
	@Export("displayName")
	static String displayName;
	@ObfuscatedName("dv")
	static boolean field684;
	@ObfuscatedName("df")
	static boolean field696;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = 244972893
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("dt")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = 1691792603
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = 1401993025
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = 2126332771
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		longValue = 4427354477760720883L
	)
	static long field710;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		longValue = 9079282278280122649L
	)
	static long field711;
	@ObfuscatedName("dg")
	static String[] field712;
	@ObfuscatedName("ds")
	static String[] field701;
	@ObfuscatedName("de")
	static String[] field714;
	@ObfuscatedName("ox")
	static byte[][] field717;

	static {
		new DecimalFormat("##0.00");
		new class142();
		xPadding = 0;
		Login_loadingPercent = 10;
		Login_loadingText = "";
		Login_banType = -1;
		field688 = 1;
		Login_username = "";
		Login_password = "";
		field706 = 0;
		field694 = new String[8];
		rememberUsername = true;
		loginBoxX = xPadding + 202;
		loginIndex = 0;
		Login_response0 = "";
		Login_response1 = "";
		Login_response2 = "";
		Login_response3 = "";
		displayName = "";
		field684 = false;
		field696 = false;
		currentLoginField = 0;
		worldSelectOpen = false;
		hoveredWorldIndex = -1;
		worldSelectPage = 0;
		worldSelectPagesCount = 0;
		field710 = -1L;
		field711 = -1L;
		field712 = new String[]{"title.jpg"};
		field701 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"};
		field714 = new String[]{"logo_speedrunning", "logo_ugc_world"};
	}

	@ObfuscatedName("ov")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	static final void method1967() {
		PacketBufferNode var0 = ReflectionCheck.getPacketBufferNode(ClientPacket.CLOSE_MODAL, Client.packetWriter.isaacCipher);
		Client.packetWriter.addNode(var0);
		Interpreter.field618 = true;

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) {
			if (var1.type == 0 || var1.type == 3) {
				class39.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) {
			class376.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		Interpreter.field618 = false;
	}
}
