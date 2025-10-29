import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bf")
@Implements("LoginState")
public class LoginState {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lbf;"
	)
	@Export("SHUTDOWN_PREVIOUS_CONNECTION")
	static final LoginState SHUTDOWN_PREVIOUS_CONNECTION;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lbf;"
	)
	@Export("INIT_MOUSEHANDLER_SOCKET")
	static final LoginState INIT_MOUSEHANDLER_SOCKET;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lbf;"
	)
	@Export("UNMAPPED_20")
	static final LoginState UNMAPPED_20;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lbf;"
	)
	@Export("READ_LOGIN_STATUS")
	static final LoginState READ_LOGIN_STATUS;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lbf;"
	)
	@Export("READ_RANDOM_VERIFICATION_NUMBER")
	static final LoginState READ_RANDOM_VERIFICATION_NUMBER;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lbf;"
	)
	@Export("WRITE_INITIAL_LOGIN_PACKET")
	static final LoginState WRITE_INITIAL_LOGIN_PACKET;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lbf;"
	)
	@Export("READ_CLIENT_INFO_STATUS")
	static final LoginState READ_CLIENT_INFO_STATUS;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lbf;"
	)
	@Export("READ_DIGEST_PARSER_PACKET_SIZE")
	static final LoginState READ_DIGEST_PARSER_PACKET_SIZE;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lbf;"
	)
	@Export("SUBMIT_DIGEST_PARSER_TASK")
	static final LoginState SUBMIT_DIGEST_PARSER_TASK;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lbf;"
	)
	@Export("WRITE_DIGEST_PARSER_RESULT")
	static final LoginState WRITE_DIGEST_PARSER_RESULT;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lbf;"
	)
	@Export("READ_STATE_11_PACKET_SIZE")
	static final LoginState READ_STATE_11_PACKET_SIZE;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lbf;"
	)
	@Export("UNMAPPED_11")
	static final LoginState UNMAPPED_11;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lbf;"
	)
	@Export("READ_PROFILE_TRANSFER_TIME")
	static final LoginState READ_PROFILE_TRANSFER_TIME;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lbf;"
	)
	@Export("PROFILE_TRANSFER")
	static final LoginState PROFILE_TRANSFER;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lbf;"
	)
	@Export("UNMAPPED")
	static final LoginState UNMAPPED;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lbf;"
	)
	@Export("READ_ACCOUNT_INFO")
	static final LoginState READ_ACCOUNT_INFO;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lbf;"
	)
	@Export("SET_SERVER_PROTOCOL")
	static final LoginState SET_SERVER_PROTOCOL;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lbf;"
	)
	@Export("UPDATE_PLAYER_AND_LOAD_REGIONS")
	static final LoginState UPDATE_PLAYER_AND_LOAD_REGIONS;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lbf;"
	)
	@Export("UNMAPPED_17")
	static final LoginState UNMAPPED_17;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lbf;"
	)
	@Export("UNMAPPED_18")
	static final LoginState UNMAPPED_18;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lbf;"
	)
	@Export("UNMAPPED_19")
	static final LoginState UNMAPPED_19;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lbf;"
	)
	@Export("REFRESHING_TOKEN")
	static final LoginState REFRESHING_TOKEN;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lbf;"
	)
	@Export("TOKEN_RESPONSE")
	static final LoginState TOKEN_RESPONSE;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lbf;"
	)
	@Export("UNMAPPED_21")
	static final LoginState UNMAPPED_21;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lbf;"
	)
	@Export("READ_ACCOUNT_INFO_PACKET_SIZE")
	static final LoginState READ_ACCOUNT_INFO_PACKET_SIZE;
	@ObfuscatedName("os")
	static int[] field277;

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

	@ObfuscatedName("av")
	public static final void method841(long var0) {
		if (var0 > 0L) {
			if (0L == var0 % 10L) {
				Interpreter.method1660(var0 - 1L);
				Interpreter.method1660(1L);
			} else {
				Interpreter.method1660(var0);
			}

		}
	}

	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "66154502"
	)
	@Export("setMusicVolume")
	static final void setMusicVolume(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255);
		if (var0 != class468.clientPreferences.getMusicVolume()) {
			label27: {
				if (class468.clientPreferences.getMusicVolume() == 0) {
					boolean var1 = !class345.field3928.isEmpty();
					if (var1) {
						GameObject.method6264(GrandExchangeOfferOwnWorldComparator.field248, var0);
						Client.playingJingle = false;
						break label27;
					}
				}

				if (var0 == 0) {
					class167.method4167(0, 0);
					Client.playingJingle = false;
				} else {
					GrandExchangeOfferOwnWorldComparator.method839(var0);
				}
			}

			class468.clientPreferences.updateMusicVolume(var0);
		}

	}
}
