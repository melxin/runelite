import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
public enum class135 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	field1636(0, 0),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	field1635(1, 1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	field1634(2, 2),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	field1641(3, 3),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	field1637(4, 4);

	@ObfuscatedName("au")
	static File field1640;
	@ObfuscatedName("pb")
	static int[][] field1642;
	@ObfuscatedName("ug")
	@ObfuscatedSignature(
		descriptor = "Lxl;"
	)
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;
	@ObfuscatedName("uu")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	@Export("pcmPlayer1")
	static PcmPlayer pcmPlayer1;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1347895857
	)
	final int field1639;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -823044467
	)
	final int field1638;

	class135(int var3, int var4) {
		this.field1639 = var3;
		this.field1638 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1012656358"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1638;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lrt;",
		garbageValue = "-27794798"
	)
	public static class451 method3746() {
		synchronized(class451.field5228) {
			if (class451.field5224 == 0) {
				return new class451();
			} else {
				class451.field5228[--class451.field5224].method9144();
				return class451.field5228[class451.field5224];
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Lcg;",
		garbageValue = "-4"
	)
	static ClientPreferences method3745() {
		AccessFile var0 = null;
		ClientPreferences var1 = new ClientPreferences();

		try {
			var0 = LoginState.getPreferencesFile("", NpcOverrides.field2082.name, false);
			byte[] var2 = new byte[(int)var0.length()];

			int var4;
			for (int var3 = 0; var3 < var2.length; var3 += var4) {
				var4 = var0.read(var2, var3, var2.length - var3);
				if (var4 == -1) {
					throw new IOException();
				}
			}

			var1 = new ClientPreferences(new Buffer(var2));
		} catch (Exception var6) {
		}

		try {
			if (var0 != null) {
				var0.close();
			}
		} catch (Exception var5) {
		}

		return var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1016199801"
	)
	public static final void method3744(int var0, int var1) {
		ViewportMouse.ViewportMouse_x = var0;
		ViewportMouse.ViewportMouse_y = var1;
		ViewportMouse.ViewportMouse_isInViewport = true;
		ViewportMouse.ViewportMouse_entityCount = 0;
		ViewportMouse.ViewportMouse_entityTags[0] = -1L;
		ViewportMouse.field2958[0] = Integer.MAX_VALUE;
		ViewportMouse.ViewportMouse_false0 = false;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lkg;Lkg;FLkg;I)V",
		garbageValue = "-1416604479"
	)
	static void method3748(WorldEntityCoord var0, WorldEntityCoord var1, float var2, WorldEntityCoord var3) {
		var2 = FontName.method11000(0.0F, 1.0F, var2);
		int var4 = var1.getX() - var0.getX();
		int var5 = var1.getY() - var0.getY();
		var4 = (int)((float)var4 * var2);
		var5 = (int)(var2 * (float)var5);
		var3.method6292(var0.getX() + var4, var0.getY() + var5);
		int var6 = HealthBarDefinition.method4318(var0.getCurrentRotationAngle(), var1.getCurrentRotationAngle());
		var6 = (int)(var2 * (float)var6);
		var3.setCurrentRotationAngle(var0.getCurrentRotationAngle() + var6);
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-59"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) {
			if (Client.gameState == 30) {
				Client.field491.method6096();
			}

			if (Client.gameState == 0) {
				class32.client.method536();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) {
				class254.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
				Client.field386 = 0;
				Client.field387 = 0;
				Client.timer.method8295(var0);
				if (var0 != 20) {
					class379.method8181(false);
				}
			}

			if (var0 != 20 && var0 != 40 && class386.field4470 != null) {
				class386.field4470.close();
				class386.field4470 = null;
			}

			if (Client.gameState == 25) {
				Client.field394 = 0;
				Client.field390 = 0;
				Client.field391 = 1;
				Client.field392 = 0;
				Client.field393 = 1;
			}

			int var1;
			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					var1 = Client.gameState == 11 ? 4 : 0;
					class572.method11199(Projection.archive10, BoundaryObject.archive8, class155.field1804, false, var1);
				} else if (var0 == 11) {
					class572.method11199(Projection.archive10, BoundaryObject.archive8, class155.field1804, false, 4);
				} else if (var0 == 50) {
					class203.setLoginResponseString("", "Updating date of birth...", "");
					class572.method11199(Projection.archive10, BoundaryObject.archive8, class155.field1804, false, 7);
				} else if (var0 != 0) {
					class387.method8213();
				}
			} else {
				var1 = RouteStrategy.method6247() ? 0 : 12;
				class572.method11199(Projection.archive10, BoundaryObject.archive8, class155.field1804, true, var1);
			}

			Client.gameState = var0;
		}
	}

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-995474663"
	)
	static void method3743(int var0) {
		WorldView var1 = Client.worldViewManager.getWorldView(var0);
		if (var1 != null) {
			for (int var2 = 0; var2 < Client.playerUpdateManager.playerCount; ++var2) {
				int var3 = Client.playerUpdateManager.playerIndices[var2];
				Client.playerUpdateManager.method2944((Player)var1.players.get((long)var3));
			}

			Client.worldViewManager.removeWorldViewById(var0);
		}
	}

	@ObfuscatedName("md")
	@ObfuscatedSignature(
		descriptor = "(Lok;I)V",
		garbageValue = "74868060"
	)
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0) {
		if (var0.buttonType == 1) {
			LoginScreenAnimation.method2587(var0.buttonText, "", 24, 0, 0, var0.id, var0.itemId);
		}

		if (var0.buttonType == 2 && !Client.isSpellSelected) {
			String var1 = ClientPreferences.Widget_getSpellActionName(var0);
			if (var1 != null) {
				LoginScreenAnimation.method2587(var1, class171.colorStartTag(65280) + var0.field4305, 25, 0, -1, var0.id, var0.itemId);
			}
		}

		if (var0.buttonType == 3) {
			FileSystem.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id);
		}

		if (var0.buttonType == 4) {
			FileSystem.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id);
		}

		if (var0.buttonType == 5) {
			FileSystem.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id);
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) {
			FileSystem.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id);
		}

		if (var0.isIf3) {
			if (Client.isSpellSelected) {
				if (class367.method7918(MouseRecorder.method2181(var0)) && (class266.selectedSpellFlags & 32) == 32) {
					LoginScreenAnimation.method2587(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex * -2066937045, var0.id, var0.itemId);
				}
			} else {
				for (int var8 = 31; var8 >= 0; --var8) {
					String var2;
					if (var8 == var0.targetPriority * 1010706597) {
						var2 = ClientPreferences.Widget_getSpellActionName(var0);
						if (var2 != null) {
							LoginScreenAnimation.method2587(var2, var0.dataText, 25, 0, var0.childIndex * -2066937045, var0.id, var0.itemId);
						}
					}

					var2 = class440.method8918(var0, var8);
					if (var2 != null) {
						int var3;
						short var4;
						if (var8 > var0.targetPriority * 1010706597) {
							var4 = 1007;
							var3 = LoginScreenAnimation.method2587(var2, var0.dataText, var4, var8 + 1, var0.childIndex * -2066937045, var0.id, var0.itemId);
						} else {
							var4 = 57;
							var3 = class162.insertMenuItem(var2, var0.dataText, var4, var8 + 1, var0.childIndex * -2066937045, var0.id, var0.itemId, var0.prioritizeMenuEntry, -1);
						}

						if (var0.field4256 != null && var8 < var0.field4256.length && var0.field4256[var8] != null) {
							String[] var5 = var0.field4256[var8];

							for (int var6 = var5.length - 1; var6 >= 0; --var6) {
								int var7 = var6 + 1 << 16 | var8 + 1;
								if (var5[var6] != null && !var5[var6].isEmpty()) {
									Message.method765(var3, var5[var6], "", var4, var7, var0.childIndex * -2066937045, var0.id, var0.itemId, -1);
								}
							}
						}
					}
				}

				if (ItemContainer.method2154(MouseRecorder.method2181(var0))) {
					FileSystem.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex * -2066937045, var0.id);
				}
			}
		}

	}
}
