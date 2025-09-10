import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("if")
public class class211 {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1550815553
	)
	public int field2304;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1849651589
	)
	public int field2305;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 2140247079
	)
	public int field2306;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -905707341
	)
	public int field2303;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 523483301
	)
	public int field2307;

	class211(int var1, int var2, int var3, int var4, int var5) {
		this.field2304 = 0;
		this.field2305 = 1;
		this.field2306 = 0;
		this.field2303 = 0;
		this.field2307 = 0;
		this.field2304 = var1;
		this.field2305 = var2;
		this.field2306 = var3;
		this.field2303 = var4;
		this.field2307 = var5;
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-9235"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		int var1 = Login.loginIndex;
		if (var0 == -3) {
			MouseRecorder.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) {
			MouseRecorder.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) {
			MouseRecorder.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) {
			ClientPreferences.method2677(3);
			Login.field735 = 1;
		} else if (var0 == 4) {
			ClientPreferences.method2677(14);
			Login.Login_banType = 0;
		} else if (var0 == 5) {
			Login.field735 = 2;
			MouseRecorder.setLoginResponseString("Either your account is still logged in, or the last", "world you were using has become unavailable.", "Please try again later.");
		} else if (var0 == 68) {
			if (!Client.field454) {
				Client.field454 = true;
				class173.method4099();
				return;
			}

			MouseRecorder.setLoginResponseString("RuneScape has been updated!", "Please restart your client.", "");
		} else if (!Client.onMobile && var0 == 6) {
			MouseRecorder.setLoginResponseString("RuneScape has been updated!", "Please restart your client.", "");
		} else if (var0 == 7) {
			MouseRecorder.setLoginResponseString("This world is full.", "Please use a different world.", "");
		} else if (var0 == 8) {
			MouseRecorder.setLoginResponseString("Unable to connect.", "Login server offline.", "");
		} else if (var0 == 9) {
			MouseRecorder.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
		} else if (var0 == 10) {
			MouseRecorder.setLoginResponseString("Unable to connect.", "Bad session id.", "");
		} else if (var0 == 11) {
			MouseRecorder.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
		} else if (var0 == 12) {
			UrlRequest.updateGameState(10);
			MouseRecorder.setLoginResponseString("You need a members' account to use this world.", "Please subscribe to login to this world,", "or use a different world.");
			ClientPreferences.method2677(34);
		} else if (var0 == 13) {
			MouseRecorder.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
		} else if (var0 == 14) {
			MouseRecorder.setLoginResponseString("The server is being updated.", "Please wait a few minutes", "before trying again.");
		} else if (var0 == 16) {
			MouseRecorder.setLoginResponseString("Too many login attempts.", "You can use the Jagex Launcher to continue playing.", "Press the button below to download it now.");
			ClientPreferences.method2677(33);
		} else if (var0 == 17) {
			MouseRecorder.setLoginResponseString("To access this free world, log into a", "members world and move your character", "to a non-members area.");
		} else if (var0 == 18) {
			ClientPreferences.method2677(14);
			Login.Login_banType = 1;
		} else if (var0 == 19) {
			MouseRecorder.setLoginResponseString("This world is running a", "closed Beta. Please ", "use a different world.");
		} else if (var0 == 20) {
			MouseRecorder.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
		} else if (var0 == 22) {
			MouseRecorder.setLoginResponseString("Malformed login packet.", "Please try again.", "");
		} else if (var0 == 23) {
			MouseRecorder.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 24) {
			MouseRecorder.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
		} else if (var0 == 25) {
			MouseRecorder.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
		} else if (var0 == 26) {
			MouseRecorder.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
		} else if (var0 == 27) {
			MouseRecorder.setLoginResponseString("", "Service unavailable.", "");
		} else if (var0 == 31) {
			MouseRecorder.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
		} else if (var0 == 32) {
			ClientPreferences.method2677(14);
			Login.Login_banType = 2;
		} else if (var0 == 37) {
			MouseRecorder.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
		} else if (var0 == 38) {
			MouseRecorder.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
		} else if (var0 == 74) {
			MouseRecorder.setLoginResponseString("Access to this world is", "restricted. Please use", "a different world.");
		} else if (var0 == 55) {
			ClientPreferences.method2677(8);
		} else {
			if (var0 == 56) {
				MouseRecorder.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", "");
				UrlRequest.updateGameState(11);
				return;
			}

			if (var0 == 57) {
				MouseRecorder.setLoginResponseString("The code you entered was incorrect.", "Please try again.", "");
				UrlRequest.updateGameState(11);
				return;
			}

			if (var0 == 61) {
				MouseRecorder.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", "");
				ClientPreferences.method2677(7);
			} else {
				if (var0 == 62) {
					UrlRequest.updateGameState(10);
					ClientPreferences.method2677(9);
					MouseRecorder.setLoginResponseString("Login attempt timed out.", "Please try again.", "");
					return;
				}

				if (var0 == 63) {
					UrlRequest.updateGameState(10);
					ClientPreferences.method2677(9);
					MouseRecorder.setLoginResponseString("You were signed out.", "Please sign in again.", "");
					return;
				}

				if (var0 == 65 || var0 == 67) {
					UrlRequest.updateGameState(10);
					ClientPreferences.method2677(9);
					MouseRecorder.setLoginResponseString("Failed to login.", "Please try again.", "");
					return;
				}

				if (var0 == 71) {
					UrlRequest.updateGameState(10);
					ClientPreferences.method2677(7);
					MouseRecorder.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
				} else if (var0 == 73) {
					UrlRequest.updateGameState(10);
					ClientPreferences.method2677(6);
					MouseRecorder.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly.");
				} else if (var0 == 72) {
					UrlRequest.updateGameState(10);
					ClientPreferences.method2677(32);
				} else {
					MouseRecorder.setLoginResponseString("Unexpected server response", "Please try using a different world.", "");
				}
			}
		}

		UrlRequest.updateGameState(10);
		int var4 = Login.loginIndex;
		boolean var5 = var4 != var1;
		if (!var5 && Client.field330.method11512()) {
			ClientPreferences.method2677(9);
		}

	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(Lme;B)V",
		garbageValue = "31"
	)
	static final void method4600(class328 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer;
		int var3;
		int var4;
		int var5;
		int var6;
		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		int var15;
		int var16;
		int var18;
		int var27;
		int var30;
		int var31;
		if (class328.field3651 == var0) {
			var27 = var1.readSignedShort();
			var3 = var1.readShortLE();
			var4 = var1.readInt();
			var5 = var1.readShortLE();
			var6 = var1.method11247();
			var30 = var1.method11254();
			var31 = Coord.method7413(var30);
			var9 = Coord.method7424(var30);
			var10 = Coord.method7415(var30);
			var11 = var1.readShortLE();
			var12 = var1.readUnsignedShortAddLE();
			var13 = var1.readSignedShort();
			int var34 = var1.readUnsignedShortLE();
			var15 = var1.readUnsignedShortLE();
			var16 = HttpHeaders.worldView.plane;
			int var26 = (var15 >> 4 & 7) + class148.field1756 + HttpHeaders.worldView.baseX;
			var18 = (var15 & 7) + class163.field1873 + HttpHeaders.worldView.baseY;
			if (var27 != 65535) {
				Projectile var19 = new Projectile(var16, var26, var18, var12, var4, var31, var9, var10, var3, var6, var27, var11 + Client.cycle, var13 + Client.cycle, var34, var5);
				Client.projectiles.addFirst(var19);
			}

		} else if (class328.field3648 == var0) {
			var27 = var1.readUnsignedShortAdd();
			var3 = (var27 >> 4 & 7) + class148.field1756;
			var4 = (var27 & 7) + class163.field1873;
			var5 = var1.readUnsignedShortLE();
			var6 = var5 >> 2;
			var30 = var5 & 3;
			var31 = Client.field320[var6];
			if (var3 >= 0 && var4 >= 0 && var3 < HttpHeaders.worldView.sizeX && var4 < HttpHeaders.worldView.sizeY) {
				var9 = Client.overheadTextLimit == -1 ? HttpHeaders.worldView.plane : Client.overheadTextLimit;
				WorldView.method2702(HttpHeaders.worldView, var9, var3, var4, var31, -1, var6, var30, 31, (String[])null, 0, -1);
			}

		} else if (class328.field3645 == var0) {
			boolean var28 = var1.readUnsignedByte() == 1;
			var3 = var1.readUnsignedShortLE();
			var4 = var1.readUnsignedByteSub();
			var5 = (var4 >> 4 & 7) + class148.field1756;
			var6 = (var4 & 7) + class163.field1873;
			var30 = var1.readUnsignedShortAddLE();
			var31 = var1.readUnsignedShortLE();
			var9 = var1.readShortLE();
			var10 = var1.readUnsignedShortAddLE();
			var11 = var1.method11252();
			if (var5 >= 0 && var6 >= 0 && var5 < HttpHeaders.worldView.sizeX && var6 < HttpHeaders.worldView.sizeY) {
				var12 = Client.overheadTextLimit == -1 ? HttpHeaders.worldView.plane : Client.overheadTextLimit;
				class71.addTileItemToGroundItems(var12, var5, var6, var9, var11, var31, var10, var30, var3, var28);
			}

		} else if (class328.field3653 == var0) {
			var27 = var1.readUnsignedShort();
			var3 = var1.readUnsignedShortLE();
			var4 = (var3 >> 4 & 7) + class148.field1756;
			var5 = (var3 & 7) + class163.field1873;
			var6 = var1.readUnsignedShortLE();
			var30 = var6 >> 2;
			var31 = var6 & 3;
			var9 = Client.field320[var30];
			if (0 <= var4 && var4 < 103 && 0 <= var5 && var5 < 103) {
				var10 = Client.overheadTextLimit == -1 ? HttpHeaders.worldView.plane : Client.overheadTextLimit;
				PendingSpawn var24 = class456.method9208(HttpHeaders.worldView, var10, var4, var5, var9);
				if (var24 != null) {
					ObjectComposition var25 = ModeWhere.getObjectDefinition(var24.field1027);
					if (var25.field2323) {
						ClientPacket.method7038(var10, var4, var5, var30, var31, var9, var27);
						var24.field1023 = var27;
						return;
					}
				}

				boolean var33 = ClientPacket.method7038(var10, var4, var5, var30, var31, var9, var27);
				if (var33) {
					return;
				}

				if (var24 != null) {
					var24.field1023 = var27;
				}
			}

		} else if (class328.field3655 == var0) {
			var27 = var1.readUnsignedByte();
			var3 = (var27 >> 4 & 7) + class148.field1756;
			var4 = (var27 & 7) + class163.field1873;
			var5 = var1.readShortLE();
			var6 = var1.readUnsignedShortAddLE();
			var30 = var1.readUnsignedShortAdd();
			if (var3 >= 0 && var4 >= 0 && var3 < HttpHeaders.worldView.sizeX && var4 < HttpHeaders.worldView.sizeY) {
				var3 = Coord.method7416(var3);
				var4 = Coord.method7416(var4);
				var31 = Client.overheadTextLimit == -1 ? HttpHeaders.worldView.plane : Client.overheadTextLimit;
				GraphicsObject var35 = new GraphicsObject(HttpHeaders.worldView, var6, var31, var3, var4, JagNetThread.method8434(HttpHeaders.worldView, var3, var4, var31) - var30, var5, Client.cycle);
				HttpHeaders.worldView.graphicsObjects.addFirst(var35);
			}

		} else if (class328.field3646 == var0) {
			var27 = var1.readUnsignedShortAddLE();
			var3 = var1.method11254();
			var4 = var1.readUnsignedShortAdd();
			var5 = (var4 >> 4 & 7) + class148.field1756;
			var6 = (var4 & 7) + class163.field1873;
			var30 = HttpHeaders.worldView.plane;
			if (0 <= var5 && var5 < 104 && 0 <= var6 && var6 < 104) {
				var31 = Client.overheadTextLimit == -1 ? var30 : Client.overheadTextLimit;
				class183.method4179(var31, var5, var6, var27, var3);
			}

		} else if (class328.field3644 == var0) {
			var27 = var1.readUnsignedShortAdd();
			var3 = (var27 >> 4 & 7) + class148.field1756;
			var4 = (var27 & 7) + class163.field1873;
			var5 = var1.readShortLE();
			var6 = var1.method11254();
			if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
				var30 = Client.overheadTextLimit == -1 ? HttpHeaders.worldView.plane : Client.overheadTextLimit;
				class114.method3454(var30, var3, var4, var5, var6);
			}

		} else if (class328.field3643 == var0) {
			var27 = var1.method11295();
			var3 = var1.readUnsignedShortAdd();
			var4 = (var3 >> 4 & 7) + class148.field1756;
			var5 = (var3 & 7) + class163.field1873;
			var6 = var1.readUnsignedShortAddLE();
			var30 = var1.method11254();
			if (var4 >= 0 && var5 >= 0 && var4 < HttpHeaders.worldView.sizeX && var5 < HttpHeaders.worldView.sizeY) {
				var31 = Client.overheadTextLimit == -1 ? HttpHeaders.worldView.plane : Client.overheadTextLimit;
				class51.method1895(var31, var4, var5, var6, var30, var27);
			}

		} else if (class328.field3650 == var0) {
			var27 = var1.readUnsignedIntLE();
			var3 = var1.readUnsignedShortAdd();
			var4 = (var3 >> 4 & 7) + class148.field1756;
			var5 = (var3 & 7) + class163.field1873;
			short var29 = (short)var1.readShort();
			var30 = var1.method11295();
			var31 = var1.readUnsignedShortAddLE();
			var9 = var1.readUnsignedShortAddLE();
			var10 = var1.readUnsignedIntME();
			short var32 = (short)var1.readShort();
			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				var12 = Client.overheadTextLimit == -1 ? HttpHeaders.worldView.plane : Client.overheadTextLimit;
				SpotAnimationDefinition.method4425(var12, var4, var5, var31, var30, var29, var27, var32, var10, var9);
			}

		} else if (class328.field3654 == var0) {
			var27 = var1.readUnsignedShortLE();
			String[] var22 = null;
			if (var27 > 0) {
				var22 = new String[5];

				for (var4 = 0; var4 < var27; ++var4) {
					var5 = var1.readUnsignedShortAdd();
					String var23 = var1.readStringCp1252NullTerminated();
					if (var5 >= 0 && var5 < 5) {
						var22[var5] = var23;
					}
				}
			}

			var4 = var1.readUnsignedShortLE();
			var5 = (var4 >> 4 & 7) + class148.field1756;
			var6 = (var4 & 7) + class163.field1873;
			var30 = var1.readUnsignedShortLE();
			var31 = var30 >> 2;
			var9 = var30 & 3;
			var10 = Client.field320[var31];
			var11 = var1.readUnsignedShortAddLE();
			var12 = var1.readUnsignedByte();
			if (var5 >= 0 && var6 >= 0 && var5 < HttpHeaders.worldView.sizeX && var6 < HttpHeaders.worldView.sizeY) {
				var13 = Client.overheadTextLimit == -1 ? HttpHeaders.worldView.plane : Client.overheadTextLimit;
				WorldView.method2702(HttpHeaders.worldView, var13, var5, var6, var10, var11, var31, var9, var12, var22, 0, -1);
			}

		} else if (class328.field3652 == var0) {
			var27 = var1.readUnsignedShortAdd();
			var3 = var1.readSignedShort();
			var4 = var1.readUnsignedByteSub();
			var5 = var1.readUnsignedByteSub() & 31;
			var6 = var1.readUnsignedByte();
			var30 = var1.readUnsignedShortAdd();
			var31 = (var30 >> 4 & 7) + class148.field1756;
			var9 = (var30 & 7) + class163.field1873;
			if (var31 >= 0 && var9 >= 0 && var31 < HttpHeaders.worldView.sizeX && var9 < HttpHeaders.worldView.sizeY) {
				var10 = var5 + 1;
				if (HealthBarUpdate.localPlayer.pathX[0] >= var31 - var10 && HealthBarUpdate.localPlayer.pathX[0] <= var10 + var31 && HealthBarUpdate.localPlayer.pathY[0] >= var9 - var10 && HealthBarUpdate.localPlayer.pathY[0] <= var9 + var10) {
					GameEngine.method684(HttpHeaders.worldView.id, var3, var31, var9, var5, var27, var4, var6);
				}
			}

		} else {
			if (class328.field3647 == var0) {
				byte var2 = var1.readByteNeg();
				var3 = var1.readUnsignedShort();
				var4 = var1.readUnsignedShortAdd();
				var5 = (var4 >> 4 & 7) + class148.field1756;
				var6 = (var4 & 7) + class163.field1873;
				byte var7 = var1.readByteSub();
				byte var8 = var1.readByteNeg();
				var9 = var1.readUnsignedShort();
				var10 = var1.readUnsignedByteSub();
				var11 = var10 >> 2;
				var12 = var10 & 3;
				var13 = Client.field320[var11];
				byte var14 = var1.readByteSub();
				var15 = var1.readUnsignedShortAddLE();
				var16 = var1.readSignedShort();
				Player var17;
				if (var3 == Client.localPlayerIndex) {
					var17 = HealthBarUpdate.localPlayer;
				} else {
					var17 = (Player)HttpHeaders.worldView.players.get((long)var3);
				}

				if (var17 != null) {
					var18 = Client.overheadTextLimit == -1 ? HttpHeaders.worldView.plane : Client.overheadTextLimit;
					Skills.method8174(var18, var5, var6, var11, var12, var13, var15, var9, var16, var8, var2, var14, var7, var17);
				}
			}

			if (class328.field3649 == var0) {
				var27 = var1.readUnsignedShort();
				var3 = var1.readUnsignedByteSub();
				var4 = (var3 >> 4 & 7) + class148.field1756;
				var5 = (var3 & 7) + class163.field1873;
				var6 = var1.readUnsignedShortLE();
				var30 = HttpHeaders.worldView.plane;
				if (var4 >= 0 && var5 >= 0 && var4 < HttpHeaders.worldView.sizeX && var5 < HttpHeaders.worldView.sizeY) {
					NodeDeque var20 = HttpHeaders.worldView.groundItems[var30][var4][var5];
					if (var20 != null) {
						for (TileItem var21 = (TileItem)var20.last(); var21 != null; var21 = (TileItem)var20.previous()) {
							if ((var27 & 32767) == var21.id) {
								var21.setFlag(var6);
								break;
							}
						}
					}

					if (var4 >= 0 && var5 >= 0 && var4 < HttpHeaders.worldView.sizeX && var5 < HttpHeaders.worldView.sizeY) {
						var9 = Client.overheadTextLimit == -1 ? HttpHeaders.worldView.plane : Client.overheadTextLimit;
						WorldMapCacheName.method6895(var9, var4, var5, var27, var6);
					}

					return;
				}
			}

		}
	}
}
