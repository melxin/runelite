import java.applet.Applet;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("gc")
public class class178 extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("field1915")
	static EvictingDualNodeHashTable field1915;
	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	@Export("mouseRecorder")
	static MouseRecorder mouseRecorder;

	static {
		field1915 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "925306139"
	)
	public static String method3770(String var0) {
		return var0 != null && !var0.isEmpty() && var0.charAt(0) != '#' ? var0 : "";
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Z",
		garbageValue = "1965829944"
	)
	static boolean method3767(String var0, int var1, String var2) {
		if (var1 == 0) {
			try {
				if (!WorldEntity.field144.startsWith("win")) {
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
					throw new Exception();
				} else {
					String var11 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

					for (int var4 = 0; var4 < var0.length(); ++var4) {
						if (var11.indexOf(var0.charAt(var4)) == -1) {
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
					return true;
				}
			} catch (Throwable var5) {
				return false;
			}
		} else if (var1 == 1) {
			try {
				Object var10 = class26.method339(WorldEntity.field153, var2, new Object[]{(new URL(WorldEntity.field153.getCodeBase(), var0)).toString()});
				return var10 != null;
			} catch (Throwable var6) {
				return false;
			}
		} else if (var1 == 2) {
			try {
				WorldEntity.field153.getAppletContext().showDocument(new URL(WorldEntity.field153.getCodeBase(), var0), "_blank");
				return true;
			} catch (Exception var7) {
				return false;
			}
		} else if (var1 == 3) {
			try {
				Applet var3 = WorldEntity.field153;
				JSObject.getWindow(var3).call("loggedout", (Object[])null);
			} catch (Throwable var9) {
			}

			try {
				WorldEntity.field153.getAppletContext().showDocument(new URL(WorldEntity.field153.getCodeBase(), var0), "_top");
				return true;
			} catch (Exception var8) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-279709401"
	)
	@Export("isAlphaNumeric")
	public static boolean isAlphaNumeric(char var0) {
		return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(Ldt;IIIII)V",
		garbageValue = "692291258"
	)
	static final void method3769(Player var0, int var1, int var2, int var3, int var4) {
		if (var0.field1271 != Client.localPlayerIndex) {
			if (Client.menu.menuOptionsCount < 400) {
				String var5;
				int var8;
				if (var0.field1141 == 0) {
					String var6 = var0.actions[0] + var0.username + var0.actions[1];
					var8 = var0.combatLevel;
					int var9 = class132.localPlayer.combatLevel;
					int var10 = var9 - var8;
					String var7;
					if (var10 < -9) {
						var7 = MilliClock.colorStartTag(16711680);
					} else if (var10 < -6) {
						var7 = MilliClock.colorStartTag(16723968);
					} else if (var10 < -3) {
						var7 = MilliClock.colorStartTag(16740352);
					} else if (var10 < 0) {
						var7 = MilliClock.colorStartTag(16756736);
					} else if (var10 > 9) {
						var7 = MilliClock.colorStartTag(65280);
					} else if (var10 > 6) {
						var7 = MilliClock.colorStartTag(4259584);
					} else if (var10 > 3) {
						var7 = MilliClock.colorStartTag(8453888);
					} else if (var10 > 0) {
						var7 = MilliClock.colorStartTag(12648192);
					} else {
						var7 = MilliClock.colorStartTag(16776960);
					}

					var5 = var6 + var7 + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2];
				} else {
					var5 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.field1141 + ")" + var0.actions[2];
				}

				int var11;
				if (Client.isItemSelected == 1) {
					WorldMapSprite.insertMenuItem("Use", Client.field674 + " " + "->" + " " + MilliClock.colorStartTag(16777215) + var5, 14, var1, var2, var3, -1, false, var4);
				} else if (Client.isSpellSelected) {
					if ((Message.selectedSpellFlags & 8) == 8) {
						WorldMapSprite.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + MilliClock.colorStartTag(16777215) + var5, 15, var1, var2, var3, -1, false, var4);
					}
				} else {
					for (var11 = 7; var11 >= 0; --var11) {
						if (Client.playerMenuActions[var11] != null) {
							short var12 = 0;
							if (Client.playerMenuActions[var11].equalsIgnoreCase("Attack")) {
								if (Client.playerAttackOption == AttackOption.AttackOption_hidden) {
									continue;
								}

								if (Client.playerAttackOption == AttackOption.AttackOption_alwaysRightClick || AttackOption.AttackOption_dependsOnCombatLevels == Client.playerAttackOption && var0.combatLevel > class132.localPlayer.combatLevel) {
									var12 = 2000;
								}

								if (class132.localPlayer.team != 0 && var0.team != 0) {
									if (var0.team == class132.localPlayer.team) {
										var12 = 2000;
									} else {
										var12 = 0;
									}
								} else if (Client.playerAttackOption == AttackOption.field1407 && var0.isClanMember()) {
									var12 = 2000;
								}
							} else if (Client.playerOptionsPriorities[var11]) {
								var12 = 2000;
							}

							boolean var13 = false;
							var8 = Client.field654[var11] + var12;
							WorldMapSprite.insertMenuItem(Client.playerMenuActions[var11], MilliClock.colorStartTag(16777215) + var5, var8, var1, var2, var3, -1, false, var4);
						}
					}
				}

				for (var11 = 0; var11 < Client.menu.menuOptionsCount; ++var11) {
					if (Client.menu.menuOpcodes[var11] == 23) {
						Client.menu.menuTargets[var11] = MilliClock.colorStartTag(16777215) + var5;
						break;
					}
				}

			}
		}
	}
}
