import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bz")
public class class40 {
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1586571039
	)
	public static int field261;
	@ObfuscatedName("jd")
	@ObfuscatedGetter(
		intValue = -240659991
	)
	static int field257;

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2036367281"
	)
	public static void method771(int var0) {
		MouseHandler.MouseHandler_idleCycles = var0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "46"
	)
	static final int method778(int var0, int var1, int var2, int var3) {
		int var4 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var2 * 1024 / var3] >> 1;
		return ((65536 - var4) * var0 >> 16) + (var4 * var1 >> 16);
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(ILcj;ZI)I",
		garbageValue = "-95507653"
	)
	static int method775(int var0, Script var1, boolean var2) {
		return 2;
	}

	@ObfuscatedName("mi")
	@ObfuscatedSignature(
		descriptor = "(Ldt;IIIII)V",
		garbageValue = "-117577603"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPC var0, int var1, int var2, int var3, int var4) {
		NPCComposition var5 = var0.definition;
		if (Client.menu.menuOptionsCount < 400) {
			if (var5.transforms != null) {
				var5 = var5.transform();
			}

			if (var5 != null) {
				if (var5.isInteractable) {
					if (!var5.isFollower || Client.followerIndex == var1) {
						String var6 = var0.method2828();
						int var7;
						int var10;
						if (var5.combatLevel != 0 && var0.field1057 != 0) {
							var7 = var0.field1057 != -1 ? var0.field1057 : var5.combatLevel;
							var10 = class159.localPlayer.combatLevel;
							int var11 = var10 - var7;
							String var9;
							if (var11 < -9) {
								var9 = class171.colorStartTag(16711680);
							} else if (var11 < -6) {
								var9 = class171.colorStartTag(16723968);
							} else if (var11 < -3) {
								var9 = class171.colorStartTag(16740352);
							} else if (var11 < 0) {
								var9 = class171.colorStartTag(16756736);
							} else if (var11 > 9) {
								var9 = class171.colorStartTag(65280);
							} else if (var11 > 6) {
								var9 = class171.colorStartTag(4259584);
							} else if (var11 > 3) {
								var9 = class171.colorStartTag(8453888);
							} else if (var11 > 0) {
								var9 = class171.colorStartTag(12648192);
							} else {
								var9 = class171.colorStartTag(16776960);
							}

							var6 = var6 + var9 + " " + " (" + "level-" + var7 + ")";
						}

						if (var5.lowPriorityFollowerOps && Client.followerOpsLowPriority) {
							class162.insertMenuItem("Examine", class171.colorStartTag(16776960) + var6, 1003, var1, var2, var3, -1, false, var4);
						}

						if (!Skills.field4383 && Client.isItemSelected == 1) {
							class162.insertMenuItem("Use", Client.field485 + " " + "->" + " " + class171.colorStartTag(16776960) + var6, 7, var1, var2, var3, -1, false, var4);
						} else if (Client.isSpellSelected) {
							if (!Skills.field4383 && (class266.selectedSpellFlags & 2) == 2) {
								class162.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class171.colorStartTag(16776960) + var6, 8, var1, var2, var3, -1, false, var4);
							}
						} else {
							var7 = var5.lowPriorityFollowerOps && Client.followerOpsLowPriority ? 2000 : 0;
							String[] var8 = var5.actions;
							int var12;
							if (var8 != null) {
								for (var12 = 4; var12 >= 0; --var12) {
									if (!Skills.field4383 && var0.method2780(var12) && var8[var12] != null && !var8[var12].equalsIgnoreCase("Attack")) {
										var10 = 0;
										if (var12 == 0) {
											var10 = var7 + 9;
										}

										if (var12 == 1) {
											var10 = var7 + 10;
										}

										if (var12 == 2) {
											var10 = var7 + 11;
										}

										if (var12 == 3) {
											var10 = var7 + 12;
										}

										if (var12 == 4) {
											var10 = var7 + 13;
										}

										class162.insertMenuItem(var8[var12], class171.colorStartTag(16776960) + var6, var10, var1, var2, var3, -1, false, var4);
									}
								}
							}

							if (var8 != null) {
								for (var12 = 4; var12 >= 0; --var12) {
									if (!Skills.field4383 && var0.method2780(var12) && var8[var12] != null && var8[var12].equalsIgnoreCase("Attack")) {
										short var13 = 0;
										if (Client.npcAttackOption != AttackOption.AttackOption_hidden) {
											if (Client.npcAttackOption == AttackOption.AttackOption_alwaysRightClick || AttackOption.AttackOption_dependsOnCombatLevels == Client.npcAttackOption && var5.combatLevel > class159.localPlayer.combatLevel) {
												var13 = 2000;
											}

											var10 = 0;
											if (var12 == 0) {
												var10 = var13 + 9;
											}

											if (var12 == 1) {
												var10 = var13 + 10;
											}

											if (var12 == 2) {
												var10 = var13 + 11;
											}

											if (var12 == 3) {
												var10 = var13 + 12;
											}

											if (var12 == 4) {
												var10 = var13 + 13;
											}

											class162.insertMenuItem(var8[var12], class171.colorStartTag(16776960) + var6, var10, var1, var2, var3, -1, false, var4);
										}
									}
								}
							}

							if (!var5.lowPriorityFollowerOps || !Client.followerOpsLowPriority) {
								class162.insertMenuItem("Examine", class171.colorStartTag(16776960) + var6, 1003, var1, var2, var3, -1, false, var4);
							}
						}

					}
				}
			}
		}
	}
}
