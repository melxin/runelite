import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bc")
@Implements("LoginState")
public class LoginState {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("SHUTDOWN_PREVIOUS_CONNECTION")
	static final LoginState SHUTDOWN_PREVIOUS_CONNECTION;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("INIT_MOUSEHANDLER_SOCKET")
	static final LoginState INIT_MOUSEHANDLER_SOCKET;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("UNMAPPED_20")
	static final LoginState UNMAPPED_20;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("READ_LOGIN_STATUS")
	static final LoginState READ_LOGIN_STATUS;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("READ_RANDOM_VERIFICATION_NUMBER")
	static final LoginState READ_RANDOM_VERIFICATION_NUMBER;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("WRITE_INITIAL_LOGIN_PACKET")
	static final LoginState WRITE_INITIAL_LOGIN_PACKET;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("READ_CLIENT_INFO_STATUS")
	static final LoginState READ_CLIENT_INFO_STATUS;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("READ_DIGEST_PARSER_PACKET_SIZE")
	static final LoginState READ_DIGEST_PARSER_PACKET_SIZE;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("SUBMIT_DIGEST_PARSER_TASK")
	static final LoginState SUBMIT_DIGEST_PARSER_TASK;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("WRITE_DIGEST_PARSER_RESULT")
	static final LoginState WRITE_DIGEST_PARSER_RESULT;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("READ_STATE_11_PACKET_SIZE")
	static final LoginState READ_STATE_11_PACKET_SIZE;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("UNMAPPED_11")
	static final LoginState UNMAPPED_11;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("READ_PROFILE_TRANSFER_TIME")
	static final LoginState READ_PROFILE_TRANSFER_TIME;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("PROFILE_TRANSFER")
	static final LoginState PROFILE_TRANSFER;
	@ObfuscatedName("ar")
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
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("SET_SERVER_PROTOCOL")
	static final LoginState SET_SERVER_PROTOCOL;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("UPDATE_PLAYER_AND_LOAD_REGIONS")
	static final LoginState UPDATE_PLAYER_AND_LOAD_REGIONS;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("UNMAPPED_17")
	static final LoginState UNMAPPED_17;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("UNMAPPED_18")
	static final LoginState UNMAPPED_18;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("UNMAPPED_19")
	static final LoginState UNMAPPED_19;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("REFRESHING_TOKEN")
	static final LoginState REFRESHING_TOKEN;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("TOKEN_RESPONSE")
	static final LoginState TOKEN_RESPONSE;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("UNMAPPED_21")
	static final LoginState UNMAPPED_21;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("READ_ACCOUNT_INFO_PACKET_SIZE")
	static final LoginState READ_ACCOUNT_INFO_PACKET_SIZE;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 1599639353
	)
	static int field291;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lra;"
	)
	static Bounds field266;

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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lha;",
		garbageValue = "595673260"
	)
	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < WorldMapElement.WorldMapElement_cached.length && WorldMapElement.WorldMapElement_cached[var0] != null ? WorldMapElement.WorldMapElement_cached[var0] : new WorldMapElement(var0);
	}

	@ObfuscatedName("at")
	public static boolean method798(long var0) {
		boolean var2 = 0L != var0;
		if (var2) {
			boolean var3 = (int)(var0 >>> 19 & 1L) == 1;
			var2 = !var3;
		}

		return var2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;ZI)Lvp;",
		garbageValue = "1796623746"
	)
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(DbTable.cacheDir, "preferences" + var0 + ".dat");
		if (var3.exists()) {
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L);
				return var10;
			} catch (IOException var9) {
			}
		}

		String var4 = "";
		if (class380.cacheGamebuild == 33) {
			var4 = "_rc";
		} else if (class380.cacheGamebuild == 34) {
			var4 = "_wip";
		}

		File var5 = new File(ItemContainer.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
		AccessFile var6;
		if (!var2 && var5.exists()) {
			try {
				var6 = new AccessFile(var5, "rw", 10000L);
				return var6;
			} catch (IOException var8) {
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L);
			return var6;
		} catch (IOException var7) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lfu;FZI)F",
		garbageValue = "1875662583"
	)
	static float method793(class137 var0, float var1, boolean var2) {
		float var3 = 0.0F;
		if (var0 != null && var0.method3766() != 0) {
			float var4 = (float)var0.field1655[0].field1607;
			float var5 = (float)var0.field1655[var0.method3766() - 1].field1607;
			float var6 = var5 - var4;
			if (var6 == 0.0F) {
				return var0.field1655[0].field1605;
			} else {
				float var7 = 0.0F;
				if (var1 > var5) {
					var7 = (var1 - var5) / var6;
				} else {
					var7 = (var1 - var4) / var6;
				}

				float var8 = (float)((int)var7);
				float var9 = Math.abs(var7 - var8);
				float var10 = var9 * var6;
				var8 = Math.abs(var8 + 1.0F);
				float var11 = var8 / 2.0F;
				float var12 = (float)((int)var11);
				var9 = var11 - var12;
				float var13;
				float var14;
				if (var2) {
					if (var0.field1653 == class135.field1637) {
						if (0.0F != var9) {
							var10 += var4;
						} else {
							var10 = var5 - var10;
						}
					} else if (var0.field1653 != class135.field1634 && var0.field1653 != class135.field1641) {
						if (var0.field1653 == class135.field1635) {
							var10 = var4 - var1;
							var13 = var0.field1655[0].field1604;
							var14 = var0.field1655[0].field1606;
							var3 = var0.field1655[0].field1605;
							if (var13 != 0.0F) {
								var3 -= var14 * var10 / var13;
							}

							return var3;
						}
					} else {
						var10 = var5 - var10;
					}
				} else if (var0.field1654 == class135.field1637) {
					if (var9 != 0.0F) {
						var10 = var5 - var10;
					} else {
						var10 += var4;
					}
				} else if (var0.field1654 != class135.field1634 && var0.field1654 != class135.field1641) {
					if (var0.field1654 == class135.field1635) {
						var10 = var1 - var5;
						var13 = var0.field1655[var0.method3766() - 1].field1608;
						var14 = var0.field1655[var0.method3766() - 1].field1609;
						var3 = var0.field1655[var0.method3766() - 1].field1605;
						if (0.0F != var13) {
							var3 += var10 * var14 / var13;
						}

						return var3;
					}
				} else {
					var10 += var4;
				}

				var3 = Skills.method8170(var0, var10);
				float var15;
				if (var2 && var0.field1653 == class135.field1641) {
					var15 = var0.field1655[var0.method3766() - 1].field1605 - var0.field1655[0].field1605;
					var3 -= var15 * var8;
				} else if (!var2 && var0.field1654 == class135.field1641) {
					var15 = var0.field1655[var0.method3766() - 1].field1605 - var0.field1655[0].field1605;
					var3 += var15 * var8;
				}

				return var3;
			}
		} else {
			return var3;
		}
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(IZZZZZI)Lpg;",
		garbageValue = "-1307154833"
	)
	static Archive method795(int var0, boolean var1, boolean var2, boolean var3, boolean var4, boolean var5) {
		ArchiveDisk var6 = null;
		if (JagexCache.JagexCache_dat2File != null) {
			var6 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var6, class479.masterDisk, BufferedNetSocket.field5515, var0, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("or")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-378169520"
	)
	static final void method794() {
		Iterator var0 = Client.worldViewManager.iterator();

		while (var0.hasNext()) {
			WorldView var1 = (WorldView)var0.next();

			for (int var2 = 0; var2 < Client.playerUpdateManager.playerCount; ++var2) {
				Player var3 = (Player)class547.topLevelWorldView.players.get((long)Client.playerUpdateManager.playerIndices[var2]);
				if (var3 != null) {
					var3.clearIsInFriendsChat();
				}
			}
		}

	}
}
