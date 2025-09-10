import java.net.URL;
import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ea")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1505293149
	)
	static int field1562;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1053060671
	)
	static int field1558;
	@ObfuscatedName("oh")
	static SecureRandom field1561;
	@ObfuscatedName("at")
	final URL field1559;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1761040065
	)
	volatile int field1557;
	@ObfuscatedName("ap")
	@Export("response0")
	volatile byte[] response0;

	static {
		field1562 = -1;
		field1558 = -2;
	}

	UrlRequest(URL var1) {
		this.field1557 = field1562;
		this.field1559 = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-63"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.field1557 != field1562;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "61839400"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1382447281"
	)
	public String method3527() {
		return this.field1559.toString();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(CI)B",
		garbageValue = "-505757566"
	)
	@Export("charToByteCp1252")
	public static byte charToByteCp1252(char var0) {
		byte var1;
		if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
			if (var0 == 8364) {
				var1 = -128;
			} else if (var0 == 8218) {
				var1 = -126;
			} else if (var0 == 402) {
				var1 = -125;
			} else if (var0 == 8222) {
				var1 = -124;
			} else if (var0 == 8230) {
				var1 = -123;
			} else if (var0 == 8224) {
				var1 = -122;
			} else if (var0 == 8225) {
				var1 = -121;
			} else if (var0 == 710) {
				var1 = -120;
			} else if (var0 == 8240) {
				var1 = -119;
			} else if (var0 == 352) {
				var1 = -118;
			} else if (var0 == 8249) {
				var1 = -117;
			} else if (var0 == 338) {
				var1 = -116;
			} else if (var0 == 381) {
				var1 = -114;
			} else if (var0 == 8216) {
				var1 = -111;
			} else if (var0 == 8217) {
				var1 = -110;
			} else if (var0 == 8220) {
				var1 = -109;
			} else if (var0 == 8221) {
				var1 = -108;
			} else if (var0 == 8226) {
				var1 = -107;
			} else if (var0 == 8211) {
				var1 = -106;
			} else if (var0 == 8212) {
				var1 = -105;
			} else if (var0 == 732) {
				var1 = -104;
			} else if (var0 == 8482) {
				var1 = -103;
			} else if (var0 == 353) {
				var1 = -102;
			} else if (var0 == 8250) {
				var1 = -101;
			} else if (var0 == 339) {
				var1 = -100;
			} else if (var0 == 382) {
				var1 = -98;
			} else if (var0 == 376) {
				var1 = -97;
			} else {
				var1 = 63;
			}
		} else {
			var1 = (byte)var0;
		}

		return var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lpx;B)V",
		garbageValue = "9"
	)
	public static void method3528(AbstractArchive var0) {
		VarbitComposition.VarbitDefinition_archive = var0;
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1616444191"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) {
			if (Client.gameState == 30) {
				Client.field598.method6085();
			}

			if (Client.gameState == 0) {
				class521.client.method541();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) {
				DefaultsGroup.method10432(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
				Client.field351 = 0;
				Client.field448 = 0;
				Client.timer.method8249(var0);
				if (var0 != 20) {
					class325.method7035(false);
				}
			}

			if (var0 != 20 && var0 != 40 && HttpRequest.field50 != null) {
				HttpRequest.field50.close();
				HttpRequest.field50 = null;
			}

			if (Client.gameState == 25) {
				Client.field476 = 0;
				Client.field410 = 0;
				Client.field411 = 1;
				Client.field329 = 0;
				Client.field413 = 1;
			}

			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					int var4 = Client.gameState == 11 ? 4 : 0;
					class192.method4313(class27.archive10, Friend.archive8, class332.field3827, false, var4);
				} else if (var0 == 11) {
					class192.method4313(class27.archive10, Friend.archive8, class332.field3827, false, 4);
				} else if (var0 == 50) {
					MouseRecorder.setLoginResponseString("", "Updating date of birth...", "");
					class192.method4313(class27.archive10, Friend.archive8, class332.field3827, false, 7);
				} else if (var0 != 0 && class4.clearLoginScreen) {
					ConcurrentMidiTask.titleboxSprite = null;
					class199.titlebuttonSprite = null;
					class447.runesSprite = null;
					Projectile.leftTitleSprite = null;
					class406.rightTitleSprite = null;
					class139.logoSprite = null;
					Message.title_muteSprite = null;
					WorldMapArea.options_buttons_0Sprite = null;
					class199.options_buttons_2Sprite = null;
					WorldMapData_1.worldSelectBackSprites = null;
					GrandExchangeOfferOwnWorldComparator.worldSelectFlagSprites = null;
					UserComparator4.worldSelectArrows = null;
					class395.worldSelectStars = null;
					CollisionMap.field3231 = null;
					class155.loginScreenRunesAnimation.method2517();
					class257.method5884(0, 100);
					JagNetThread var1 = WorldMapSectionType.field3418;
					var1.method8436(true);
					class4.clearLoginScreen = false;
				}
			} else {
				boolean var3 = class36.clientPreferences.getEULA() >= Client.field388;
				int var2 = var3 ? 0 : 12;
				class192.method4313(class27.archive10, Friend.archive8, class332.field3827, true, var2);
			}

			Client.gameState = var0;
		}
	}

	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "(Lcv;IIIIB)V",
		garbageValue = "-20"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3, int var4) {
		if (var0.index != Client.localPlayerIndex) {
			if (Client.menu.menuOptionsCount < 400) {
				String var5;
				if (var0.skillLevel == 0) {
					var5 = var0.actions[0] + var0.username + var0.actions[1] + class444.method8880(var0.combatLevel, HealthBarUpdate.localPlayer.combatLevel) + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2];
				} else {
					var5 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2];
				}

				int var6;
				if (Client.isItemSelected == 1) {
					class423.insertMenuItem("Use", Client.field528 + " " + "->" + " " + class134.colorStartTag(16777215) + var5, 14, var1, var2, var3, -1, false, var4);
				} else if (Client.isSpellSelected) {
					if ((class337.selectedSpellFlags & 8) == 8) {
						class423.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class134.colorStartTag(16777215) + var5, 15, var1, var2, var3, -1, false, var4);
					}
				} else {
					for (var6 = 7; var6 >= 0; --var6) {
						if (Client.playerMenuActions[var6] != null) {
							short var7 = 0;
							if (Client.playerMenuActions[var6].equalsIgnoreCase("Attack")) {
								if (Client.playerAttackOption == AttackOption.AttackOption_hidden) {
									continue;
								}

								if (Client.playerAttackOption == AttackOption.AttackOption_alwaysRightClick || AttackOption.AttackOption_dependsOnCombatLevels == Client.playerAttackOption && var0.combatLevel > HealthBarUpdate.localPlayer.combatLevel) {
									var7 = 2000;
								}

								if (HealthBarUpdate.localPlayer.team != 0 && var0.team != 0) {
									if (var0.team == HealthBarUpdate.localPlayer.team) {
										var7 = 2000;
									} else {
										var7 = 0;
									}
								} else if (AttackOption.field1216 == Client.playerAttackOption && var0.isClanMember()) {
									var7 = 2000;
								}
							} else if (Client.playerOptionsPriorities[var6]) {
								var7 = 2000;
							}

							boolean var8 = false;
							int var9 = Client.playerMenuOpcodes[var6] + var7;
							class423.insertMenuItem(Client.playerMenuActions[var6], class134.colorStartTag(16777215) + var5, var9, var1, var2, var3, -1, false, var4);
						}
					}
				}

				for (var6 = 0; var6 < Client.menu.menuOptionsCount; ++var6) {
					if (Client.menu.menuOpcodes[var6] == 23) {
						Client.menu.menuTargets[var6] = class134.colorStartTag(16777215) + var5;
						break;
					}
				}

			}
		}
	}
}
