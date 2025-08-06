import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aj")
@Implements("HttpMethod")
public class HttpMethod implements Enum {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Laj;"
	)
	@Export("POST")
	public static final HttpMethod POST;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Laj;"
	)
	@Export("GET")
	public static final HttpMethod GET;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Laj;"
	)
	@Export("PUT")
	static final HttpMethod PUT;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Laj;"
	)
	@Export("PATCH")
	static final HttpMethod PATCH;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Laj;"
	)
	@Export("DELETE")
	static final HttpMethod DELETE;
	@ObfuscatedName("ad")
	static String[] field41;
	@ObfuscatedName("ko")
	@ObfuscatedGetter(
		longValue = 2527990320718600839L
	)
	static long field38;
	@ObfuscatedName("py")
	@ObfuscatedSignature(
		descriptor = "[Lxv;"
	)
	@Export("headIconPrayerSprites")
	static SpritePixels[] headIconPrayerSprites;
	@ObfuscatedName("st")
	@ObfuscatedGetter(
		intValue = -608853119
	)
	static int field32;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -123983669
	)
	int field42;
	@ObfuscatedName("ah")
	@Export("name")
	String name;
	@ObfuscatedName("ap")
	boolean field37;
	@ObfuscatedName("am")
	boolean field34;

	static {
		POST = new HttpMethod(0, "POST", true, true);
		GET = new HttpMethod(1, "GET", true, false);
		PUT = new HttpMethod(2, "PUT", false, true);
		PATCH = new HttpMethod(3, "PATCH", false, true);
		DELETE = new HttpMethod(4, "DELETE", false, true);
	}

	HttpMethod(int var1, String var2, boolean var3, boolean var4) {
		this.field42 = var1;
		this.name = var2;
		this.field37 = var3;
		this.field34 = var4;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1171989961"
	)
	boolean method72() {
		return this.field37;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-164877066"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field42;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1873291526"
	)
	@Export("getName")
	public String getName() {
		return this.name;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1905712289"
	)
	boolean method75() {
		return this.field34;
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "707763979"
	)
	static int method67() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
			int var0 = 0;

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) {
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount;
			}

			return var0 * 10000 / Client.field480;
		} else {
			return 10000;
		}
	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2134089127"
	)
	static void method80(int var0, int var1) {
		if (FriendSystem.clientPreferences.getMusicVolume() != 0 && var0 != -1) {
			ArrayList var2 = new ArrayList();
			var2.add(new MidiRequest(MoveSpeed.archive6, var0, 0, FriendSystem.clientPreferences.getMusicVolume(), false));
			class30.method486(var2, 0, 0, 0, 0, true);
			Client.playingJingle = true;
		}

	}

	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "(Lcr;IIIII)V",
		garbageValue = "-1135954424"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3, int var4) {
		if (var0.index != Client.localPlayerIndex) {
			if (Client.menu.menuOptionsCount < 400) {
				String var5;
				int var8;
				if (var0.skillLevel == 0) {
					String var6 = var0.actions[0] + var0.username + var0.actions[1];
					var8 = var0.combatLevel;
					int var9 = class27.localPlayer.combatLevel;
					int var10 = var9 - var8;
					String var7;
					if (var10 < -9) {
						var7 = ObjectSound.colorStartTag(16711680);
					} else if (var10 < -6) {
						var7 = ObjectSound.colorStartTag(16723968);
					} else if (var10 < -3) {
						var7 = ObjectSound.colorStartTag(16740352);
					} else if (var10 < 0) {
						var7 = ObjectSound.colorStartTag(16756736);
					} else if (var10 > 9) {
						var7 = ObjectSound.colorStartTag(65280);
					} else if (var10 > 6) {
						var7 = ObjectSound.colorStartTag(4259584);
					} else if (var10 > 3) {
						var7 = ObjectSound.colorStartTag(8453888);
					} else if (var10 > 0) {
						var7 = ObjectSound.colorStartTag(12648192);
					} else {
						var7 = ObjectSound.colorStartTag(16776960);
					}

					var5 = var6 + var7 + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2];
				} else {
					var5 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2];
				}

				int var11;
				if (Client.isItemSelected == 1) {
					ClanSettings.insertMenuItem("Use", Client.field501 + " " + "->" + " " + ObjectSound.colorStartTag(16777215) + var5, 14, var1, var2, var3, -1, false, var4);
				} else if (Client.isSpellSelected) {
					if ((class533.selectedSpellFlags & 8) == 8) {
						ClanSettings.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + ObjectSound.colorStartTag(16777215) + var5, 15, var1, var2, var3, -1, false, var4);
					}
				} else {
					for (var11 = 7; var11 >= 0; --var11) {
						if (Client.playerMenuActions[var11] != null) {
							short var12 = 0;
							if (Client.playerMenuActions[var11].equalsIgnoreCase("Attack")) {
								if (AttackOption.AttackOption_hidden == Client.playerAttackOption) {
									continue;
								}

								if (Client.playerAttackOption == AttackOption.AttackOption_alwaysRightClick || AttackOption.AttackOption_dependsOnCombatLevels == Client.playerAttackOption && var0.combatLevel > class27.localPlayer.combatLevel) {
									var12 = 2000;
								}

								if (class27.localPlayer.team != 0 && var0.team != 0) {
									if (var0.team == class27.localPlayer.team) {
										var12 = 2000;
									} else {
										var12 = 0;
									}
								} else if (Client.playerAttackOption == AttackOption.field1197 && var0.isClanMember()) {
									var12 = 2000;
								}
							} else if (Client.playerOptionsPriorities[var11]) {
								var12 = 2000;
							}

							boolean var13 = false;
							var8 = Client.playerMenuOpcodes[var11] + var12;
							ClanSettings.insertMenuItem(Client.playerMenuActions[var11], ObjectSound.colorStartTag(16777215) + var5, var8, var1, var2, var3, -1, false, var4);
						}
					}
				}

				for (var11 = 0; var11 < Client.menu.menuOptionsCount; ++var11) {
					if (Client.menu.menuOpcodes[var11] == 23) {
						Client.menu.menuTargets[var11] = ObjectSound.colorStartTag(16777215) + var5;
						break;
					}
				}

			}
		}
	}
}
