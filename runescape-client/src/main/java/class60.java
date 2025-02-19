import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("co")
public class class60 {
	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	static Archive field422;
	@ObfuscatedName("ab")
	byte[] field425;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1146618635
	)
	int field423;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -927105055
	)
	int field424;

	class60() {
		this.field425 = null;
		this.field423 = 0;
		this.field424 = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2118681753"
	)
	int method1141(int var1) {
		int var2 = 0;

		int var3;
		int var4;
		for (var3 = 0; var1 >= 8 - this.field424; var1 -= var4) {
			var4 = 8 - this.field424;
			int var5 = (1 << var4) - 1;
			var2 += (this.field425[this.field423] >> this.field424 & var5) << var3;
			this.field424 = 0;
			++this.field423;
			var3 += var4;
		}

		if (var1 > 0) {
			var4 = (1 << var1) - 1;
			var2 += (this.field425[this.field423] >> this.field424 & var4) << var3;
			this.field424 += var1;
		}

		return var2;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1771700260"
	)
	int method1150() {
		int var1 = this.field425[this.field423] >> this.field424 & 1;
		++this.field424;
		this.field423 += this.field424 >> 3;
		this.field424 &= 7;
		return var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([BII)V",
		garbageValue = "-1391120544"
	)
	void method1143(byte[] var1, int var2) {
		this.field425 = var1;
		this.field423 = var2;
		this.field424 = 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	public static void method1155() {
		HitSplatDefinition.HitSplatDefinition_cached.clear();
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear();
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear();
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ILdy;ZI)I",
		garbageValue = "-696772208"
	)
	static int method1158(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) {
			HealthBarConfig.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
			int var4 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
			if (!Client.isCameraLocked) {
				Client.camAngleX = var3;
				Client.camAngleY = var4;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) {
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = Client.camAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) {
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = Client.camAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) {
			var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
			if (var3 < 0) {
				var3 = 0;
			}

			Client.camFollowHeight = var3;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) {
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = Client.camFollowHeight;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-50"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close();
		class105.clear();
		Client.worldViewManager.clear();
		Client.playerUpdateManager.method3020();
		Client.field749.method5559();
		System.gc();
		class177.method3764(0, 0);
		class47.method860();
		Client.playingJingle = false;
		RouteStrategy.method5690();
		class511.updateGameState(10);
		Client.field598 = 0;
		class152.method3501().method4517();
		class152.method3501().method4518();
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-125"
	)
	static final void method1156() {
		if (Client.field799 != class200.topLevelWorldView.plane) {
			Client.field799 = class200.topLevelWorldView.plane;
			int var0 = class200.topLevelWorldView.plane;
			int[] var1 = MidiRequest.sceneMinimapSprite.pixels;
			int var2 = var1.length;

			int var3;
			for (var3 = 0; var3 < var2; ++var3) {
				var1[var3] = 0;
			}

			int var4;
			int var5;
			for (var3 = 1; var3 < 103; ++var3) {
				var4 = (103 - var3) * 2048 + 24628;

				for (var5 = 1; var5 < 103; ++var5) {
					if ((class200.topLevelWorldView.tileSettings[var0][var5][var3] & 24) == 0) {
						class200.topLevelWorldView.scene.drawTileMinimap(var1, var4, 512, var0, var5, var3);
					}

					if (var0 < 3 && (class200.topLevelWorldView.tileSettings[var0 + 1][var5][var3] & 8) != 0) {
						class200.topLevelWorldView.scene.drawTileMinimap(var1, var4, 512, var0 + 1, var5, var3);
					}

					var4 += 4;
				}
			}

			var3 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
			var4 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
			MidiRequest.sceneMinimapSprite.setRaster();

			int var6;
			for (var5 = 1; var5 < 103; ++var5) {
				for (var6 = 1; var6 < 103; ++var6) {
					if ((class200.topLevelWorldView.tileSettings[var0][var6][var5] & 24) == 0) {
						class331.drawObject(var0, var6, var5, var3, var4);
					}

					if (var0 < 3 && (class200.topLevelWorldView.tileSettings[var0 + 1][var6][var5] & 8) != 0) {
						class331.drawObject(var0 + 1, var6, var5, var3, var4);
					}
				}
			}

			Client.mapIconCount = 0;

			for (var5 = 0; var5 < 104; ++var5) {
				for (var6 = 0; var6 < 104; ++var6) {
					long var7 = class200.topLevelWorldView.scene.getFloorDecorationTag(class200.topLevelWorldView.plane, var5, var6);
					if (var7 != 0L) {
						int var9 = class248.Entity_unpackID(var7);
						int var10 = class177.getObjectDefinition(var9).mapIconId;
						if (var10 >= 0 && Canvas.WorldMapElement_get(var10).field1931) {
							Client.mapIcons[Client.mapIconCount] = Canvas.WorldMapElement_get(var10).getSpriteBool(false);
							Client.mapIconXs[Client.mapIconCount] = var5;
							Client.mapIconYs[Client.mapIconCount] = var6;
							++Client.mapIconCount;
						}
					}
				}
			}

			class159.rasterProvider.apply();
		}

	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(I)Lqb;",
		garbageValue = "-1933756623"
	)
	public static NodeDeque method1154() {
		return Client.scriptEvents;
	}

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIB)I",
		garbageValue = "90"
	)
	static final int method1157(String var0, String var1, int var2, int var3, int var4, int var5, int var6) {
		return WorldMapSprite.insertMenuItem(var0, var1, var2, var3, var4, var5, var6, false, -1);
	}

	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "(Lnz;I)Z",
		garbageValue = "1563245872"
	)
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) {
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) {
				int var2 = class263.method5541(var0, var1);
				int var3 = var0.cs1ComparisonValues[var1];
				if (var0.cs1Comparisons[var1] == 2) {
					if (var2 >= var3) {
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) {
					if (var2 <= var3) {
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) {
					if (var3 == var2) {
						return false;
					}
				} else if (var2 != var3) {
					return false;
				}
			}

			return true;
		}
	}
}
