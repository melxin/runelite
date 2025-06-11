import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bc")
@Implements("LoginState")
public class LoginState {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("SHUTDOWN_PREVIOUS_CONNECTION")
	static final LoginState SHUTDOWN_PREVIOUS_CONNECTION;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("INIT_MOUSEHANDLER_SOCKET")
	static final LoginState INIT_MOUSEHANDLER_SOCKET;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("UNMAPPED_20")
	static final LoginState UNMAPPED_20;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("READ_LOGIN_STATUS")
	static final LoginState READ_LOGIN_STATUS;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("READ_RANDOM_VERIFICATION_NUMBER")
	static final LoginState READ_RANDOM_VERIFICATION_NUMBER;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("WRITE_INITIAL_LOGIN_PACKET")
	static final LoginState WRITE_INITIAL_LOGIN_PACKET;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("READ_CLIENT_INFO_STATUS")
	static final LoginState READ_CLIENT_INFO_STATUS;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("READ_DIGEST_PARSER_PACKET_SIZE")
	static final LoginState READ_DIGEST_PARSER_PACKET_SIZE;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("SUBMIT_DIGEST_PARSER_TASK")
	static final LoginState SUBMIT_DIGEST_PARSER_TASK;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("WRITE_DIGEST_PARSER_RESULT")
	static final LoginState WRITE_DIGEST_PARSER_RESULT;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("READ_STATE_11_PACKET_SIZE")
	static final LoginState READ_STATE_11_PACKET_SIZE;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("UNMAPPED_11")
	static final LoginState UNMAPPED_11;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("READ_PROFILE_TRANSFER_TIME")
	static final LoginState READ_PROFILE_TRANSFER_TIME;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("PROFILE_TRANSFER")
	static final LoginState PROFILE_TRANSFER;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("UNMAPPED")
	static final LoginState UNMAPPED;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("READ_ACCOUNT_INFO")
	static final LoginState READ_ACCOUNT_INFO;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("SET_SERVER_PROTOCOL")
	static final LoginState SET_SERVER_PROTOCOL;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("UPDATE_PLAYER_AND_LOAD_REGIONS")
	static final LoginState UPDATE_PLAYER_AND_LOAD_REGIONS;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("UNMAPPED_17")
	static final LoginState UNMAPPED_17;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("UNMAPPED_18")
	static final LoginState UNMAPPED_18;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("UNMAPPED_19")
	static final LoginState UNMAPPED_19;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("REFRESHING_TOKEN")
	static final LoginState REFRESHING_TOKEN;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("TOKEN_RESPONSE")
	static final LoginState TOKEN_RESPONSE;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("UNMAPPED_21")
	static final LoginState UNMAPPED_21;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("READ_ACCOUNT_INFO_PACKET_SIZE")
	static final LoginState READ_ACCOUNT_INFO_PACKET_SIZE;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lrv;"
	)
	static Bounds field304;
	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	static Archive field283;

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

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-101"
	)
	static void method761() {
		if (ClientPacket.clientPreferences.isTitleMusicDisabled()) {
			HttpResponse.method306(0, 0);
		} else {
			HttpResponse.method306(0, 0);
			ArrayList var0 = new ArrayList();
			var0.add(new MidiRequest(ModeWhere.field4905, "scape main", "", 255, false));
			class30.method451(var0, 0, 0, 0, 100, false);
		}
	}
}
