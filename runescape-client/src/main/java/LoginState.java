import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cj")
@Implements("LoginState")
public class LoginState {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("SHUTDOWN_PREVIOUS_CONNECTION")
	static final LoginState SHUTDOWN_PREVIOUS_CONNECTION;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("INIT_MOUSEHANDLER_SOCKET")
	static final LoginState INIT_MOUSEHANDLER_SOCKET;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("UNMAPPED_20")
	static final LoginState UNMAPPED_20;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("READ_LOGIN_STATUS")
	static final LoginState READ_LOGIN_STATUS;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("READ_RANDOM_VERIFICATION_NUMBER")
	static final LoginState READ_RANDOM_VERIFICATION_NUMBER;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("WRITE_INITIAL_LOGIN_PACKET")
	static final LoginState WRITE_INITIAL_LOGIN_PACKET;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("READ_CLIENT_INFO_STATUS")
	static final LoginState READ_CLIENT_INFO_STATUS;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("READ_DIGEST_PARSER_PACKET_SIZE")
	static final LoginState READ_DIGEST_PARSER_PACKET_SIZE;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("SUBMIT_DIGEST_PARSER_TASK")
	static final LoginState SUBMIT_DIGEST_PARSER_TASK;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("WRITE_DIGEST_PARSER_RESULT")
	static final LoginState WRITE_DIGEST_PARSER_RESULT;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("READ_STATE_11_PACKET_SIZE")
	static final LoginState READ_STATE_11_PACKET_SIZE;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("UNMAPPED_11")
	static final LoginState UNMAPPED_11;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("READ_PROFILE_TRANSFER_TIME")
	static final LoginState READ_PROFILE_TRANSFER_TIME;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("PROFILE_TRANSFER")
	static final LoginState PROFILE_TRANSFER;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("UNMAPPED")
	static final LoginState UNMAPPED;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("READ_ACCOUNT_INFO")
	static final LoginState READ_ACCOUNT_INFO;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("SET_SERVER_PROTOCOL")
	static final LoginState SET_SERVER_PROTOCOL;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("UPDATE_PLAYER_AND_LOAD_REGIONS")
	static final LoginState UPDATE_PLAYER_AND_LOAD_REGIONS;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("UNMAPPED_17")
	static final LoginState UNMAPPED_17;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("UNMAPPED_18")
	static final LoginState UNMAPPED_18;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("UNMAPPED_19")
	static final LoginState UNMAPPED_19;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("REFRESHING_TOKEN")
	static final LoginState REFRESHING_TOKEN;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("TOKEN_RESPONSE")
	static final LoginState TOKEN_RESPONSE;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("UNMAPPED_21")
	static final LoginState UNMAPPED_21;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("READ_ACCOUNT_INFO_PACKET_SIZE")
	static final LoginState READ_ACCOUNT_INFO_PACKET_SIZE;
	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("archive9")
	static Archive archive9;

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
}
