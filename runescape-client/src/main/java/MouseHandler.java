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

@ObfuscatedName("bu")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1204830639
	)
	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 495142011
	)
	@Export("MouseHandler_x")
	public static int MouseHandler_x;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1644381073
	)
	@Export("MouseHandler_y")
	public static int MouseHandler_y;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = -3199721905843835043L
	)
	@Export("MouseHandler_millis")
	public static long MouseHandler_millis;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 2037611401
	)
	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1009522985
	)
	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1840042617
	)
	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		longValue = -9120968784112877799L
	)
	@Export("MouseHandler_lastPressedTimeMillis")
	public static long MouseHandler_lastPressedTimeMillis;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lbu;"
	)
	@Export("MouseHandler_instance")
	public static MouseHandler MouseHandler_instance;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 2100522689
	)
	@Export("MouseHandler_idleCycles")
	static volatile int MouseHandler_idleCycles;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 720764801
	)
	@Export("MouseHandler_currentButtonVolatile")
	public static volatile int MouseHandler_currentButtonVolatile;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -119618485
	)
	@Export("MouseHandler_xVolatile")
	public static volatile int MouseHandler_xVolatile;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1103304199
	)
	@Export("MouseHandler_yVolatile")
	public static volatile int MouseHandler_yVolatile;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		longValue = 5196155728524489887L
	)
	@Export("MouseHandler_lastMovedVolatile")
	public static volatile long MouseHandler_lastMovedVolatile;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1685756481
	)
	@Export("MouseHandler_lastButtonVolatile")
	public static volatile int MouseHandler_lastButtonVolatile;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1385872721
	)
	@Export("MouseHandler_lastPressedXVolatile")
	public static volatile int MouseHandler_lastPressedXVolatile;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -648146295
	)
	@Export("MouseHandler_lastPressedYVolatile")
	public static volatile int MouseHandler_lastPressedYVolatile;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		longValue = -4803846616333254941L
	)
	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	public static volatile long MouseHandler_lastPressedTimeMillisVolatile;

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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;B)I",
		garbageValue = "-102"
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

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_currentButtonVolatile = 0;
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final synchronized void focusLost(FocusEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_currentButtonVolatile = 0;
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

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final synchronized void mousePressed(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_lastPressedXVolatile = var1.getX();
			MouseHandler_lastPressedYVolatile = var1.getY();
			MouseHandler_lastPressedTimeMillisVolatile = class281.method6373();
			MouseHandler_lastButtonVolatile = this.getButton(var1);
			if (MouseHandler_lastButtonVolatile != 0) {
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
			}
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(FI)F",
		garbageValue = "587685172"
	)
	static final float method724(float var0) {
		var0 = 1.0100503F * (var0 - 75.0F);
		return 150.75377F / var0 + 1.0100503F;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ldm;[BIIIIB)V",
		garbageValue = "-61"
	)
	static final void method679(WorldView var0, byte[] var1, int var2, int var3, int var4, int var5) {
		int var8;
		int var9;
		if (var0.collisionMaps != null) {
			for (int var6 = 0; var6 < 4; ++var6) {
				CollisionMap var13 = var0.collisionMaps[var6];

				for (var8 = var2; var8 < var2 + 64; ++var8) {
					for (var9 = var3; var9 < var3 + 64; ++var9) {
						if (var13.method6182(var8, var9)) {
							var13.method6216(var8, var9, 1073741824);
						}
					}
				}
			}
		}

		Buffer var12 = new Buffer(var1);

		int var7;
		int var10;
		int var11;
		for (var7 = 0; var7 < 4; ++var7) {
			for (var8 = 0; var8 < 64; ++var8) {
				for (var9 = 0; var9 < 64; ++var9) {
					var10 = var8 + var2;
					var11 = var3 + var9;
					HealthBarDefinition.loadTerrain(var0, var12, var7, var10, var11, var10 + var4, var5 + var11, 0);
				}
			}
		}

		var7 = var12.offset < var12.array.length ? var12.readUnsignedByte() : 0;
		boolean var14 = (var7 & 1) != 0;
		if (var14) {
			for (var9 = 0; var9 < 64; ++var9) {
				for (var10 = 0; var10 < 64; ++var10) {
					while (true) {
						var11 = var12.readUnsignedShort();
						if (var11 == 0) {
							break;
						}

						if (var11 == 1) {
							var12.readUnsignedByte();
							break;
						}

						if (var11 <= 49) {
							var12.readShort();
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(Ldm;Lps;I)V",
		garbageValue = "2125788260"
	)
	static void method712(WorldView var0, class391 var1) {
		int var2 = 0;

		for (int var3 = 0; var3 < var0.field1170.method9887(); ++var3) {
			WorldEntity var4 = (WorldEntity)var0.worldEntities.get((long)var0.field1170.method9886(var3));
			if (var4 != null && var4.field5483.id != Client.currentWorldViewId && var4.method10185() == var1) {
				boolean var5 = var2 < Client.field364;
				if (var5) {
					++var2;
					boolean var6 = false;
					if (var1 == class391.field4831) {
						Bounds var8 = class182.method4229(var4.worldEntityCoord, var4.field5482.method4516());

						boolean var7;
						label121: {
							int var9;
							for (var9 = 0; var9 < Client.playerUpdateManager.playerCount; ++var9) {
								Player var10 = (Player)var0.players.get((long)Client.playerUpdateManager.playerIndices[var9]);
								if (var10 != null && var8.method9035(var10.x, var10.y)) {
									var8.method9032();
									var7 = true;
									break label121;
								}
							}

							var9 = 0;

							label104:
							while (true) {
								if (var9 >= var0.field1169.method9887()) {
									for (var9 = 0; var9 < var0.field1170.method9887(); ++var9) {
										WorldEntity var14 = (WorldEntity)var0.worldEntities.get((long)var0.field1170.method9886(var9));
										if (var14 != null && var14 != var4 && var14.field5483.scene.cycle == Client.cycle) {
											Bounds var11 = class182.method4229(var14.worldEntityCoord, var14.field5482.method4516());
											if (var8.method9025(var11)) {
												var8.method9032();
												var11.method9032();
												var7 = true;
												break label104;
											}

											var11.method9032();
										}
									}

									var8.method9032();
									var7 = false;
									break;
								}

								NPC var13 = (NPC)var0.npcs.get((long)var0.field1169.method9886(var9));
								if (var13 != null && var8.method9035(var13.x, var13.y)) {
									for (int var12 = 0; var12 < var13.definition.actions.length; ++var12) {
										if (var13.definition.actions[var12] != null) {
											var8.method9032();
											var7 = true;
											break label104;
										}
									}
								}

								++var9;
							}
						}

						var6 = var7;
					}

					class404.method8319(var0, var4, var6);
				}
			}
		}

	}
}
