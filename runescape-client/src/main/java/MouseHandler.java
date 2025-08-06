import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bx")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1911959133
	)
	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1356785139
	)
	@Export("MouseHandler_x")
	public static int MouseHandler_x;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1953188989
	)
	@Export("MouseHandler_y")
	public static int MouseHandler_y;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		longValue = 2432735971272170539L
	)
	@Export("MouseHandler_millis")
	public static long MouseHandler_millis;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -570635915
	)
	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 2120075361
	)
	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -134735055
	)
	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		longValue = 4013550640572753771L
	)
	@Export("MouseHandler_lastPressedTimeMillis")
	public static long MouseHandler_lastPressedTimeMillis;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lbx;"
	)
	@Export("MouseHandler_instance")
	static MouseHandler MouseHandler_instance;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1013399747
	)
	@Export("MouseHandler_idleCycles")
	public static volatile int MouseHandler_idleCycles;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 471871107
	)
	@Export("MouseHandler_currentButtonVolatile")
	static volatile int MouseHandler_currentButtonVolatile;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1170399895
	)
	@Export("MouseHandler_xVolatile")
	static volatile int MouseHandler_xVolatile;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1837161663
	)
	@Export("MouseHandler_yVolatile")
	static volatile int MouseHandler_yVolatile;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = 7599897987387028893L
	)
	@Export("MouseHandler_lastMovedVolatile")
	static volatile long MouseHandler_lastMovedVolatile;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1423305777
	)
	@Export("MouseHandler_lastButtonVolatile")
	static volatile int MouseHandler_lastButtonVolatile;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1552845379
	)
	@Export("MouseHandler_lastPressedXVolatile")
	static volatile int MouseHandler_lastPressedXVolatile;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1889212963
	)
	@Export("MouseHandler_lastPressedYVolatile")
	static volatile int MouseHandler_lastPressedYVolatile;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		longValue = -2929706532147763757L
	)
	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	static volatile long MouseHandler_lastPressedTimeMillisVolatile;

	static {
		MouseHandler_currentButton = 0;
		MouseHandler_x = 0;
		MouseHandler_y = 0;
		MouseHandler_millis = 0L;
		MouseHandler_lastButton = 0;
		MouseHandler_lastPressedX = 0;
		MouseHandler_lastPressedY = 0;
		MouseHandler_lastPressedTimeMillis = 0L;
		MouseHandler_instance = new MouseHandler();
		MouseHandler_idleCycles = 0;
		MouseHandler_currentButtonVolatile = 0;
		MouseHandler_xVolatile = -1;
		MouseHandler_yVolatile = -1;
		MouseHandler_lastMovedVolatile = -1L;
		MouseHandler_lastButtonVolatile = 0;
		MouseHandler_lastPressedXVolatile = 0;
		MouseHandler_lastPressedYVolatile = 0;
		MouseHandler_lastPressedTimeMillisVolatile = 0L;
	}

	MouseHandler() {
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;I)I",
		garbageValue = "1418624462"
	)
	@Export("getButton")
	final int getButton(MouseEvent var1) {
		int var2 = var1.getButton();
		if (!var1.isAltDown() && var2 != 2) {
			return !var1.isMetaDown() && var2 != 3 ? 1 : 2;
		} else {
			return 4;
		}
	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_xVolatile = var1.getX();
			MouseHandler_yVolatile = var1.getY();
			MouseHandler_lastMovedVolatile = var1.getWhen();
		}

	}

	public final synchronized void mousePressed(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_lastPressedXVolatile = var1.getX();
			MouseHandler_lastPressedYVolatile = var1.getY();
			MouseHandler_lastPressedTimeMillisVolatile = UserComparator7.method3496();
			MouseHandler_lastButtonVolatile = this.getButton(var1);
			if (MouseHandler_lastButtonVolatile != 0) {
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
			}
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_currentButtonVolatile = 0;
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	public final synchronized void mouseExited(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_xVolatile = -1;
			MouseHandler_yVolatile = -1;
			MouseHandler_lastMovedVolatile = var1.getWhen();
		}

	}

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	public final void focusGained(FocusEvent var1) {
	}

	public final synchronized void focusLost(FocusEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_currentButtonVolatile = 0;
		}

	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1064992595"
	)
	static final void method722() {
		if (Client.pcmPlayer1 != null) {
			Client.pcmPlayer1.run();
		}

	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(Ldj;IIIIIIII[Ljava/lang/String;III)V",
		garbageValue = "1900381948"
	)
	static void method743(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, String[] var9, int var10, int var11) {
		NodeDeque var12 = var0.pendingSpawns;
		PendingSpawn var13 = null;

		for (PendingSpawn var14 = (PendingSpawn)var12.last(); var14 != null; var14 = (PendingSpawn)var12.previous()) {
			if (var14.plane == var1 && var2 == var14.x && var3 == var14.y && var4 == var14.type) {
				var13 = var14;
				break;
			}
		}

		if (var13 == null) {
			var13 = new PendingSpawn();
			var13.plane = var1;
			var13.type = var4;
			var13.x = var2;
			var13.y = var3;
			var13.field1003 = -1;
			VarbitComposition.method4480(var0, var13);
			var12.addFirst(var13);
		}

		var13.field1011 = var5;
		var13.field1013 = var6;
		var13.field1012 = var7;
		var13.delay = var10;
		var13.hitpoints = var11;
		var13.method2366(var8);
		var13.method2370(var9);
	}

	@ObfuscatedName("mg")
	@ObfuscatedSignature(
		descriptor = "(Lda;IIIII)V",
		garbageValue = "1372835507"
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
						String var6 = var0.method2666();
						int var7;
						int var10;
						if (var5.combatLevel != 0 && var0.field1087 != 0) {
							var7 = var0.field1087 != -1 ? var0.field1087 : var5.combatLevel;
							var10 = class27.localPlayer.combatLevel;
							int var11 = var10 - var7;
							String var9;
							if (var11 < -9) {
								var9 = ObjectSound.colorStartTag(16711680);
							} else if (var11 < -6) {
								var9 = ObjectSound.colorStartTag(16723968);
							} else if (var11 < -3) {
								var9 = ObjectSound.colorStartTag(16740352);
							} else if (var11 < 0) {
								var9 = ObjectSound.colorStartTag(16756736);
							} else if (var11 > 9) {
								var9 = ObjectSound.colorStartTag(65280);
							} else if (var11 > 6) {
								var9 = ObjectSound.colorStartTag(4259584);
							} else if (var11 > 3) {
								var9 = ObjectSound.colorStartTag(8453888);
							} else if (var11 > 0) {
								var9 = ObjectSound.colorStartTag(12648192);
							} else {
								var9 = ObjectSound.colorStartTag(16776960);
							}

							var6 = var6 + var9 + " " + " (" + "level-" + var7 + ")";
						}

						if (var5.lowPriorityFollowerOps && Client.followerOpsLowPriority) {
							ClanSettings.insertMenuItem("Examine", ObjectSound.colorStartTag(16776960) + var6, 1003, var1, var2, var3, -1, false, var4);
						}

						if (!WorldMapRenderer.field3290 && Client.isItemSelected == 1) {
							ClanSettings.insertMenuItem("Use", Client.field501 + " " + "->" + " " + ObjectSound.colorStartTag(16776960) + var6, 7, var1, var2, var3, -1, false, var4);
						} else if (Client.isSpellSelected) {
							if (!WorldMapRenderer.field3290 && (class533.selectedSpellFlags & 2) == 2) {
								ClanSettings.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + ObjectSound.colorStartTag(16776960) + var6, 8, var1, var2, var3, -1, false, var4);
							}
						} else {
							var7 = var5.lowPriorityFollowerOps && Client.followerOpsLowPriority ? 2000 : 0;
							String[] var8 = var5.actions;
							int var12;
							if (var8 != null) {
								for (var12 = 4; var12 >= 0; --var12) {
									if (!WorldMapRenderer.field3290 && var0.method2665(var12) && var8[var12] != null && !var8[var12].equalsIgnoreCase("Attack")) {
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

										ClanSettings.insertMenuItem(var8[var12], ObjectSound.colorStartTag(16776960) + var6, var10, var1, var2, var3, -1, false, var4);
									}
								}
							}

							if (var8 != null) {
								for (var12 = 4; var12 >= 0; --var12) {
									if (!WorldMapRenderer.field3290 && var0.method2665(var12) && var8[var12] != null && var8[var12].equalsIgnoreCase("Attack")) {
										short var13 = 0;
										if (Client.npcAttackOption != AttackOption.AttackOption_hidden) {
											if (Client.npcAttackOption == AttackOption.AttackOption_alwaysRightClick || Client.npcAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var5.combatLevel > class27.localPlayer.combatLevel) {
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

											ClanSettings.insertMenuItem(var8[var12], ObjectSound.colorStartTag(16776960) + var6, var10, var1, var2, var3, -1, false, var4);
										}
									}
								}
							}

							if (!var5.lowPriorityFollowerOps || !Client.followerOpsLowPriority) {
								ClanSettings.insertMenuItem("Examine", ObjectSound.colorStartTag(16776960) + var6, 1003, var1, var2, var3, -1, false, var4);
							}
						}

					}
				}
			}
		}
	}
}
