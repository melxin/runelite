import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vc")
final class class568 implements class567 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lwj;I)V",
		garbageValue = "-1304869252"
	)
	public void vmethod11207(Object var1, Buffer var2) {
		this.method11151((Integer)var1, var2);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lwj;S)Ljava/lang/Object;",
		garbageValue = "2047"
	)
	public Object vmethod11209(Buffer var1) {
		return var1.method11575();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;Lwj;I)V",
		garbageValue = "625680422"
	)
	void method11151(Integer var1, Buffer var2) {
		var2.writeInt(var1);
	}

	@ObfuscatedName("me")
	@ObfuscatedSignature(
		descriptor = "(Lcs;IIIII)V",
		garbageValue = "-1306234141"
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
					int var9 = class159.localPlayer.combatLevel;
					int var10 = var9 - var8;
					String var7;
					if (var10 < -9) {
						var7 = class171.colorStartTag(16711680);
					} else if (var10 < -6) {
						var7 = class171.colorStartTag(16723968);
					} else if (var10 < -3) {
						var7 = class171.colorStartTag(16740352);
					} else if (var10 < 0) {
						var7 = class171.colorStartTag(16756736);
					} else if (var10 > 9) {
						var7 = class171.colorStartTag(65280);
					} else if (var10 > 6) {
						var7 = class171.colorStartTag(4259584);
					} else if (var10 > 3) {
						var7 = class171.colorStartTag(8453888);
					} else if (var10 > 0) {
						var7 = class171.colorStartTag(12648192);
					} else {
						var7 = class171.colorStartTag(16776960);
					}

					var5 = var6 + var7 + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2];
				} else {
					var5 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2];
				}

				int var11;
				if (Client.isItemSelected == 1) {
					class162.insertMenuItem("Use", Client.field485 + " " + "->" + " " + class171.colorStartTag(16777215) + var5, 14, var1, var2, var3, -1, false, var4);
				} else if (Client.isSpellSelected) {
					if ((class266.selectedSpellFlags & 8) == 8) {
						class162.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class171.colorStartTag(16777215) + var5, 15, var1, var2, var3, -1, false, var4);
					}
				} else {
					for (var11 = 7; var11 >= 0; --var11) {
						if (Client.playerMenuActions[var11] != null) {
							short var12 = 0;
							if (Client.playerMenuActions[var11].equalsIgnoreCase("Attack")) {
								if (Client.playerAttackOption == AttackOption.AttackOption_hidden) {
									continue;
								}

								if (AttackOption.AttackOption_alwaysRightClick == Client.playerAttackOption || Client.playerAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var0.combatLevel > class159.localPlayer.combatLevel) {
									var12 = 2000;
								}

								if (class159.localPlayer.team != 0 && var0.team != 0) {
									if (var0.team == class159.localPlayer.team) {
										var12 = 2000;
									} else {
										var12 = 0;
									}
								} else if (AttackOption.field1211 == Client.playerAttackOption && var0.isClanMember()) {
									var12 = 2000;
								}
							} else if (Client.playerOptionsPriorities[var11]) {
								var12 = 2000;
							}

							boolean var13 = false;
							var8 = Client.playerMenuOpcodes[var11] + var12;
							class162.insertMenuItem(Client.playerMenuActions[var11], class171.colorStartTag(16777215) + var5, var8, var1, var2, var3, -1, false, var4);
						}
					}
				}

				for (var11 = 0; var11 < Client.menu.menuOptionsCount; ++var11) {
					if (Client.menu.menuOpcodes[var11] == 23) {
						Client.menu.menuTargets[var11] = class171.colorStartTag(16777215) + var5;
						break;
					}
				}

			}
		}
	}
}
