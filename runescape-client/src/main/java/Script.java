import java.awt.Component;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dy")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("ay")
	String field1019;
	@ObfuscatedName("au")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("ad")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("ah")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1492122487
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 784639269
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1202144317
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1985618717
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[Lqv;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;

	static {
		Script_cached = new EvictingDualNodeHashTable(128);
	}

	Script() {
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)[Lqv;",
		garbageValue = "1320858081"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1];
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lwf;"
	)
	@Export("newRunException")
	public static RunException newRunException(Throwable var0, String var1) {
		RunException var2;
		if (var0 instanceof RunException) {
			var2 = (RunException)var0;
			var2.message = var2.message + ' ' + var1;
		} else {
			var2 = new RunException(var0, var1);
		}

		return var2;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "836242365"
	)
	static void method2327(Component var0) {
		var0.removeMouseListener(MouseHandler.MouseHandler_instance);
		var0.removeMouseMotionListener(MouseHandler.MouseHandler_instance);
		var0.removeFocusListener(MouseHandler.MouseHandler_instance);
		MouseHandler.MouseHandler_currentButtonVolatile = 0;
	}

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(Lew;IIIIB)V",
		garbageValue = "-60"
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
						String var6 = var0.method2855();
						int var7;
						int var10;
						if (var5.combatLevel != 0 && var0.field1257 != 0) {
							var7 = var0.field1257 != -1 ? var0.field1257 : var5.combatLevel;
							var10 = class132.localPlayer.combatLevel;
							int var11 = var10 - var7;
							String var9;
							if (var11 < -9) {
								var9 = MilliClock.colorStartTag(16711680);
							} else if (var11 < -6) {
								var9 = MilliClock.colorStartTag(16723968);
							} else if (var11 < -3) {
								var9 = MilliClock.colorStartTag(16740352);
							} else if (var11 < 0) {
								var9 = MilliClock.colorStartTag(16756736);
							} else if (var11 > 9) {
								var9 = MilliClock.colorStartTag(65280);
							} else if (var11 > 6) {
								var9 = MilliClock.colorStartTag(4259584);
							} else if (var11 > 3) {
								var9 = MilliClock.colorStartTag(8453888);
							} else if (var11 > 0) {
								var9 = MilliClock.colorStartTag(12648192);
							} else {
								var9 = MilliClock.colorStartTag(16776960);
							}

							var6 = var6 + var9 + " " + " (" + "level-" + var7 + ")";
						}

						if (var5.lowPriorityFollowerOps && Client.followerOpsLowPriority) {
							WorldMapSprite.insertMenuItem("Examine", MilliClock.colorStartTag(16776960) + var6, 1003, var1, var2, var3, -1, false, var4);
						}

						if (!class7.field23 && Client.isItemSelected == 1) {
							WorldMapSprite.insertMenuItem("Use", Client.field674 + " " + "->" + " " + MilliClock.colorStartTag(16776960) + var6, 7, var1, var2, var3, -1, false, var4);
						} else if (Client.isSpellSelected) {
							if (!class7.field23 && (Message.selectedSpellFlags & 2) == 2) {
								WorldMapSprite.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + MilliClock.colorStartTag(16776960) + var6, 8, var1, var2, var3, -1, false, var4);
							}
						} else {
							var7 = var5.lowPriorityFollowerOps && Client.followerOpsLowPriority ? 2000 : 0;
							String[] var8 = var5.actions;
							int var12;
							if (var8 != null) {
								for (var12 = 4; var12 >= 0; --var12) {
									if (!class7.field23 && var0.method2854(var12) && var8[var12] != null && !var8[var12].equalsIgnoreCase("Attack")) {
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

										WorldMapSprite.insertMenuItem(var8[var12], MilliClock.colorStartTag(16776960) + var6, var10, var1, var2, var3, -1, false, var4);
									}
								}
							}

							if (var8 != null) {
								for (var12 = 4; var12 >= 0; --var12) {
									if (!class7.field23 && var0.method2854(var12) && var8[var12] != null && var8[var12].equalsIgnoreCase("Attack")) {
										short var13 = 0;
										if (Client.npcAttackOption != AttackOption.AttackOption_hidden) {
											if (Client.npcAttackOption == AttackOption.AttackOption_alwaysRightClick || AttackOption.AttackOption_dependsOnCombatLevels == Client.npcAttackOption && var5.combatLevel > class132.localPlayer.combatLevel) {
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

											WorldMapSprite.insertMenuItem(var8[var12], MilliClock.colorStartTag(16776960) + var6, var10, var1, var2, var3, -1, false, var4);
										}
									}
								}
							}

							if (!var5.lowPriorityFollowerOps || !Client.followerOpsLowPriority) {
								WorldMapSprite.insertMenuItem("Examine", MilliClock.colorStartTag(16776960) + var6, 1003, var1, var2, var3, -1, false, var4);
							}
						}

					}
				}
			}
		}
	}

	@ObfuscatedName("nc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1450353238"
	)
	static final void method2328() {
		Iterator var0 = Client.worldViewManager.iterator();

		while (var0.hasNext()) {
			WorldView var1 = (WorldView)var0.next();

			for (int var2 = 0; var2 < Client.playerUpdateManager.playerCount; ++var2) {
				Player var3 = (Player)var1.field1353.method7890((long)Client.playerUpdateManager.playerIndices[var2]);
				if (var3 != null) {
					var3.clearIsFriend();
				}
			}
		}

		var0 = Messages.Messages_hashTable.iterator();

		while (var0.hasNext()) {
			Message var4 = (Message)var0.next();
			var4.clearIsFromFriend();
		}

		if (class7.friendsChat != null) {
			class7.friendsChat.clearFriends();
		}

	}
}
