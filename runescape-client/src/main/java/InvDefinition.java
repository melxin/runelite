import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
@Implements("InvDefinition")
public class InvDefinition extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("InvDefinition_archive")
	static AbstractArchive InvDefinition_archive;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("InvDefinition_cached")
	static EvictingDualNodeHashTable InvDefinition_cached;
	@ObfuscatedName("gp")
	@ObfuscatedGetter(
		intValue = 1625230515
	)
	@Export("js5Port")
	static int js5Port;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 2054796503
	)
	@Export("size")
	public int size;

	static {
		InvDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	InvDefinition() {
		this.size = 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lvj;I)V",
		garbageValue = "2024845865"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lvj;II)V",
		garbageValue = "1447722129"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 2) {
			this.size = var1.readUnsignedShort();
		}

	}

	@ObfuscatedName("mr")
	@ObfuscatedSignature(
		descriptor = "(Lec;IIIII)V",
		garbageValue = "-1080346208"
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
						String var6 = var0.method2893();
						int var7;
						int var10;
						if (var5.combatLevel != 0 && var0.field1271 != 0) {
							var7 = var0.field1271 != -1 ? var0.field1271 : var5.combatLevel;
							var10 = AsyncHttpResponse.localPlayer.combatLevel;
							int var11 = var10 - var7;
							String var9;
							if (var11 < -9) {
								var9 = class438.colorStartTag(16711680);
							} else if (var11 < -6) {
								var9 = class438.colorStartTag(16723968);
							} else if (var11 < -3) {
								var9 = class438.colorStartTag(16740352);
							} else if (var11 < 0) {
								var9 = class438.colorStartTag(16756736);
							} else if (var11 > 9) {
								var9 = class438.colorStartTag(65280);
							} else if (var11 > 6) {
								var9 = class438.colorStartTag(4259584);
							} else if (var11 > 3) {
								var9 = class438.colorStartTag(8453888);
							} else if (var11 > 0) {
								var9 = class438.colorStartTag(12648192);
							} else {
								var9 = class438.colorStartTag(16776960);
							}

							var6 = var6 + var9 + " " + " (" + "level-" + var7 + ")";
						}

						if (var5.lowPriorityFollowerOps && Client.followerOpsLowPriority) {
							LoginScreenAnimation.insertMenuItem("Examine", class438.colorStartTag(16776960) + var6, 1003, var1, var2, var3, -1, false, var4);
						}

						if (!Language.field4683 && Client.isItemSelected == 1) {
							LoginScreenAnimation.insertMenuItem("Use", Client.field667 + " " + "->" + " " + class438.colorStartTag(16776960) + var6, 7, var1, var2, var3, -1, false, var4);
						} else if (Client.isSpellSelected) {
							if (!Language.field4683 && (class202.selectedSpellFlags & 2) == 2) {
								LoginScreenAnimation.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class438.colorStartTag(16776960) + var6, 8, var1, var2, var3, -1, false, var4);
							}
						} else {
							var7 = var5.lowPriorityFollowerOps && Client.followerOpsLowPriority ? 2000 : 0;
							String[] var8 = var5.actions;
							int var12;
							if (var8 != null) {
								for (var12 = 4; var12 >= 0; --var12) {
									if (!Language.field4683 && var0.method2892(var12) && var8[var12] != null && !var8[var12].equalsIgnoreCase("Attack")) {
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

										LoginScreenAnimation.insertMenuItem(var8[var12], class438.colorStartTag(16776960) + var6, var10, var1, var2, var3, -1, false, var4);
									}
								}
							}

							if (var8 != null) {
								for (var12 = 4; var12 >= 0; --var12) {
									if (!Language.field4683 && var0.method2892(var12) && var8[var12] != null && var8[var12].equalsIgnoreCase("Attack")) {
										short var13 = 0;
										if (AttackOption.AttackOption_hidden != Client.npcAttackOption) {
											if (Client.npcAttackOption == AttackOption.AttackOption_alwaysRightClick || AttackOption.AttackOption_dependsOnCombatLevels == Client.npcAttackOption && var5.combatLevel > AsyncHttpResponse.localPlayer.combatLevel) {
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

											LoginScreenAnimation.insertMenuItem(var8[var12], class438.colorStartTag(16776960) + var6, var10, var1, var2, var3, -1, false, var4);
										}
									}
								}
							}

							if (!var5.lowPriorityFollowerOps || !Client.followerOpsLowPriority) {
								LoginScreenAnimation.insertMenuItem("Examine", class438.colorStartTag(16776960) + var6, 1003, var1, var2, var3, -1, false, var4);
							}
						}

					}
				}
			}
		}
	}
}
