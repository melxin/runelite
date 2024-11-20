import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("cj")
@Implements("LoginState")
public class LoginState {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("SHUTDOWN_PREVIOUS_CONNECTION")
	static final LoginState SHUTDOWN_PREVIOUS_CONNECTION;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("INIT_MOUSEHANDLER_SOCKET")
	static final LoginState INIT_MOUSEHANDLER_SOCKET;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("UNMAPPED_20")
	static final LoginState UNMAPPED_20;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("READ_LOGIN_STATUS")
	static final LoginState READ_LOGIN_STATUS;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("READ_RANDOM_VERIFICATION_NUMBER")
	static final LoginState READ_RANDOM_VERIFICATION_NUMBER;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("WRITE_INITIAL_LOGIN_PACKET")
	static final LoginState WRITE_INITIAL_LOGIN_PACKET;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("READ_CLIENT_INFO_STATUS")
	static final LoginState READ_CLIENT_INFO_STATUS;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("READ_DIGEST_PARSER_PACKET_SIZE")
	static final LoginState READ_DIGEST_PARSER_PACKET_SIZE;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("SUBMIT_DIGEST_PARSER_TASK")
	static final LoginState SUBMIT_DIGEST_PARSER_TASK;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("WRITE_DIGEST_PARSER_RESULT")
	static final LoginState WRITE_DIGEST_PARSER_RESULT;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("READ_STATE_11_PACKET_SIZE")
	static final LoginState READ_STATE_11_PACKET_SIZE;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("UNMAPPED_11")
	static final LoginState UNMAPPED_11;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("READ_PROFILE_TRANSFER_TIME")
	static final LoginState READ_PROFILE_TRANSFER_TIME;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("PROFILE_TRANSFER")
	static final LoginState PROFILE_TRANSFER;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("UNMAPPED")
	static final LoginState UNMAPPED;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("READ_ACCOUNT_INFO")
	static final LoginState READ_ACCOUNT_INFO;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("SET_SERVER_PROTOCOL")
	static final LoginState SET_SERVER_PROTOCOL;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("UPDATE_PLAYER_AND_LOAD_REGIONS")
	static final LoginState UPDATE_PLAYER_AND_LOAD_REGIONS;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("UNMAPPED_17")
	static final LoginState UNMAPPED_17;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("UNMAPPED_18")
	static final LoginState UNMAPPED_18;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("UNMAPPED_19")
	static final LoginState UNMAPPED_19;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("REFRESHING_TOKEN")
	static final LoginState REFRESHING_TOKEN;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("TOKEN_RESPONSE")
	static final LoginState TOKEN_RESPONSE;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("UNMAPPED_21")
	static final LoginState UNMAPPED_21;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("READ_ACCOUNT_INFO_PACKET_SIZE")
	static final LoginState READ_ACCOUNT_INFO_PACKET_SIZE;
	@ObfuscatedName("jp")
	static byte[][] field507;

	static {
		SHUTDOWN_PREVIOUS_CONNECTION = new LoginState();
		INIT_MOUSEHANDLER_SOCKET = new LoginState();
		UNMAPPED_20 = new LoginState();
		READ_LOGIN_STATUS = new LoginState();
		READ_RANDOM_VERIFICATION_NUMBER = new LoginState();
		WRITE_INITIAL_LOGIN_PACKET = new LoginState();
		READ_CLIENT_INFO_STATUS = new LoginState();
		READ_DIGEST_PARSER_PACKET_SIZE = new LoginState();
		SUBMIT_DIGEST_PARSER_TASK = new LoginState();
		WRITE_DIGEST_PARSER_RESULT = new LoginState();
		READ_STATE_11_PACKET_SIZE = new LoginState();
		UNMAPPED_11 = new LoginState();
		READ_PROFILE_TRANSFER_TIME = new LoginState();
		PROFILE_TRANSFER = new LoginState();
		UNMAPPED = new LoginState();
		READ_ACCOUNT_INFO = new LoginState();
		SET_SERVER_PROTOCOL = new LoginState();
		UPDATE_PLAYER_AND_LOAD_REGIONS = new LoginState();
		UNMAPPED_17 = new LoginState();
		UNMAPPED_18 = new LoginState();
		UNMAPPED_19 = new LoginState();
		REFRESHING_TOKEN = new LoginState();
		TOKEN_RESPONSE = new LoginState();
		UNMAPPED_21 = new LoginState();
		READ_ACCOUNT_INFO_PACKET_SIZE = new LoginState();
	}

	LoginState() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "153907376"
	)
	public static int method1233(int var0, int var1) {
		return (int)(Math.atan2((double)var0, (double)var1) * 325.94932345220167D) & 2047;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "1"
	)
	public static boolean method1231(int var0) {
		return (var0 & 1) != 0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;",
		garbageValue = "433328508"
	)
	@Export("loadClassFromDescriptor")
	static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) {
			return Byte.TYPE;
		} else if (var0.equals("I")) {
			return Integer.TYPE;
		} else if (var0.equals("S")) {
			return Short.TYPE;
		} else if (var0.equals("J")) {
			return Long.TYPE;
		} else if (var0.equals("Z")) {
			return Boolean.TYPE;
		} else if (var0.equals("F")) {
			return Float.TYPE;
		} else if (var0.equals("D")) {
			return Double.TYPE;
		} else if (var0.equals("C")) {
			return Character.TYPE;
		} else {
			return var0.equals("void") ? Void.TYPE : Reflection.findClass(var0);
		}
	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(III)Lkz;",
		garbageValue = "-2072278275"
	)
	static RouteStrategy method1232(int var0, int var1) {
		Client.field809.approxDestinationX = var0;
		Client.field809.approxDestinationY = var1;
		Client.field809.approxDestinationSizeX = 1;
		Client.field809.approxDestinationSizeY = 1;
		return Client.field809;
	}
}
