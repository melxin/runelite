import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nr")
public class class360 {
	@ObfuscatedName("ay")
	public static final short[] field3860;
	@ObfuscatedName("ah")
	public static final short[][] field3858;
	@ObfuscatedName("az")
	public static final short[] field3856;
	@ObfuscatedName("ao")
	public static final short[][] field3855;
	@ObfuscatedName("jy")
	@ObfuscatedGetter(
		intValue = -465183433
	)
	static int field3857;

	static {
		field3860 = new short[]{6798, 8741, 25238, 4626, 4550};
		field3858 = new short[][]{{6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010, -22122, 937, 8130, -13422, 30385}, {8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {4626, 11146, 6439, 12, 4758, 10270}, {4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574, 17050, 0, 127, -31821, -17991}};
		field3856 = new short[]{-10304, 9104, -1, -1, -1};
		field3855 = new short[][]{{6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002, -22116, 945, 8144, -13414, 30389}, {9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019}, new short[0], new short[0], new short[0]};
	}

	@ObfuscatedName("ax")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return (int)(var0 >>> 17 & 4294967295L);
	}

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "99"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) {
			if (Client.gameState == 30) {
				Client.field575.method5738();
			}

			if (Client.gameState == 0) {
				Client.client.method557();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) {
				DevicePcmPlayerProvider.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
				Client.field501 = 0;
				Client.field743 = 0;
				Client.timer.method8944(var0);
				if (var0 != 20) {
					Client.authenticationScheme = class544.clientPreferences.containsKey(Login.Login_username) ? AuthenticationScheme.USERNAME_PASSWORD_REMEMBER : AuthenticationScheme.USERNAME_PASSWORD;
				}
			}

			if (var0 != 20 && var0 != 40 && VarpDefinition.field2508 != null) {
				VarpDefinition.field2508.close();
				VarpDefinition.field2508 = null;
			}

			if (Client.gameState == 25) {
				Client.field573 = 0;
				Client.field760 = 0;
				Client.field615 = 1;
				Client.field561 = 0;
				Client.field572 = 1;
			}

			int var1;
			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					var1 = Client.gameState == 11 ? 4 : 0;
					class267.method5753(class166.archive10, PcmPlayer.archive8, class30.field133, false, var1);
				} else if (var0 == 11) {
					class267.method5753(class166.archive10, PcmPlayer.archive8, class30.field133, false, 4);
				} else if (var0 == 50) {
					class150.setLoginResponseString("", "Updating date of birth...", "");
					class267.method5753(class166.archive10, PcmPlayer.archive8, class30.field133, false, 7);
				} else if (var0 != 0) {
					HttpMethod.method84();
				}
			} else {
				var1 = LoginScreenAnimation.method2876() ? 0 : 12;
				class267.method5753(class166.archive10, PcmPlayer.archive8, class30.field133, true, var1);
			}

			Client.gameState = var0;
		}
	}

	@ObfuscatedName("oq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "1224893635"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase();
		short[] var2 = new short[16];
		int var3 = 0;

		for (int var4 = 0; var4 < Sound.ItemDefinition_fileCount; ++var4) {
			ItemComposition var9 = FaceNormal.ItemDefinition_get(var4);
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) {
				if (var3 >= 250) {
					HttpResponse.foundItemIdCount = -1;
					WorldMapSection1.foundItemIds = null;
					return;
				}

				if (var3 >= var2.length) {
					short[] var6 = new short[var2.length * 2];

					for (int var7 = 0; var7 < var3; ++var7) {
						var6[var7] = var2[var7];
					}

					var2 = var6;
				}

				var2[var3++] = (short)var4;
			}
		}

		WorldMapSection1.foundItemIds = var2;
		class271.foundItemIndex = 0;
		HttpResponse.foundItemIdCount = var3;
		String[] var8 = new String[HttpResponse.foundItemIdCount];

		for (int var5 = 0; var5 < HttpResponse.foundItemIdCount; ++var5) {
			var8[var5] = FaceNormal.ItemDefinition_get(var2[var5]).name;
		}

		short[] var10 = WorldMapSection1.foundItemIds;
		class174.sortItemsByName(var8, var10, 0, var8.length - 1);
	}
}
