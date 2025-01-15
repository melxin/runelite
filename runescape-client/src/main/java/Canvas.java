import java.awt.Component;
import java.awt.Graphics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ap")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("ay")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1;
	}

	public final void update(Graphics var1) {
		this.component.update(var1);
	}

	public final void paint(Graphics var1) {
		this.component.paint(var1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)[Ljt;",
		garbageValue = "1660841300"
	)
	static HorizontalAlignment[] method338() {
		return new HorizontalAlignment[]{HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field2605, HorizontalAlignment.field2609};
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lue;III)I",
		garbageValue = "452391295"
	)
	static int method336(IterableNodeHashTable var0, int var1, int var2) {
		if (var0 == null) {
			return var2;
		} else {
			IntegerNode var3 = (IntegerNode)var0.get((long)var1);
			return var3 == null ? var2 : var3.integer;
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZS)I",
		garbageValue = "13847"
	)
	static int method339(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) {
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = TextureProvider.getWindowedMode();
			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) {
				var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					PacketBuffer.setWindowedMode(var3);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) {
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class544.clientPreferences.getWindowMode();
				return 1;
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) {
				if (var0 == 5310) {
					--ScriptFrame.Interpreter_intStackSize;
					return 1;
				} else {
					return 2;
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					class544.clientPreferences.updateWindowMode(var3);
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "(I)Lua;",
		garbageValue = "-752612347"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return class420.worldMap;
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-944852240"
	)
	static final void method335() {
		int var0;
		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		if (Client.oculusOrbState == 0) {
			var0 = class53.entity.getX();
			var1 = class53.entity.getY();
			if (Client.field781 != -1) {
				Player var11 = ModeWhere.localPlayer.worldView.players[Client.field781];
				if (var11 != null) {
					Coord var12 = var11.method2785(ModeWhere.localPlayer.worldView);
					var0 = var12.x;
					var1 = var12.y;
				}
			}

			var2 = class53.entity.getPlane();
			if (VarpDefinition.oculusOrbFocalPointX - var0 < -500 || VarpDefinition.oculusOrbFocalPointX - var0 > 500 || class7.oculusOrbFocalPointY - var1 < -500 || class7.oculusOrbFocalPointY - var1 > 500) {
				VarpDefinition.oculusOrbFocalPointX = var0;
				class7.oculusOrbFocalPointY = var1;
			}

			if (var0 != VarpDefinition.oculusOrbFocalPointX) {
				VarpDefinition.oculusOrbFocalPointX += (var0 - VarpDefinition.oculusOrbFocalPointX) / 16;
			}

			if (var1 != class7.oculusOrbFocalPointY) {
				class7.oculusOrbFocalPointY += (var1 - class7.oculusOrbFocalPointY) / 16;
			}

			var3 = VarpDefinition.oculusOrbFocalPointX >> 7;
			var4 = class7.oculusOrbFocalPointY >> 7;
			var5 = getTileHeight(GameEngine.topLevelWorldView, VarpDefinition.oculusOrbFocalPointX, class7.oculusOrbFocalPointY, var2);
			int var6 = 0;
			int var7;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (var7 = var3 - 4; var7 <= var3 + 4; ++var7) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
						int var9 = var2;
						if (var2 < 3 && (GameEngine.topLevelWorldView.tileSettings[1][var7][var8] & 2) == 2) {
							var9 = var2 + 1;
						}

						int var10 = var5 - GameEngine.topLevelWorldView.tileHeights[var9][var7][var8];
						if (var10 > var6) {
							var6 = var10;
						}
					}
				}
			}

			var7 = var6 * 192;
			if (var7 > 98048) {
				var7 = 98048;
			}

			if (var7 < 32768) {
				var7 = 32768;
			}

			if (var7 > Client.field679) {
				Client.field679 += (var7 - Client.field679) / 24;
			} else if (var7 < Client.field679) {
				Client.field679 += (var7 - Client.field679) / 80;
			}

			ClientPacket.oculusOrbFocalPointZ = getTileHeight(GameEngine.topLevelWorldView, var0, var1, var2) - Client.camFollowHeight;
		} else if (Client.oculusOrbState == 1) {
			if (Client.field602 && ModeWhere.localPlayer != null) {
				var0 = ModeWhere.localPlayer.pathX[0];
				var1 = ModeWhere.localPlayer.pathY[0];
				if (var0 >= 0 && 104 > var0 && var1 >= 0 && 104 > var1) {
					VarpDefinition.oculusOrbFocalPointX = ModeWhere.localPlayer.x;
					var2 = getTileHeight(GameEngine.topLevelWorldView, ModeWhere.localPlayer.x, ModeWhere.localPlayer.y, GameEngine.topLevelWorldView.plane) - Client.camFollowHeight;
					if (var2 < ClientPacket.oculusOrbFocalPointZ) {
						ClientPacket.oculusOrbFocalPointZ = var2;
					}

					class7.oculusOrbFocalPointY = ModeWhere.localPlayer.y;
					Client.field602 = false;
				}
			}

			short var13 = -1;
			if (Client.indexCheck.isValidIndexInRange(33)) {
				var13 = 0;
			} else if (Client.indexCheck.isValidIndexInRange(49)) {
				var13 = 1024;
			}

			if (Client.indexCheck.isValidIndexInRange(48)) {
				if (var13 == 0) {
					var13 = 1792;
				} else if (var13 == 1024) {
					var13 = 1280;
				} else {
					var13 = 1536;
				}
			} else if (Client.indexCheck.isValidIndexInRange(50)) {
				if (var13 == 0) {
					var13 = 256;
				} else if (var13 == 1024) {
					var13 = 768;
				} else {
					var13 = 512;
				}
			}

			byte var14 = 0;
			if (Client.indexCheck.isValidIndexInRange(35)) {
				var14 = -1;
			} else if (Client.indexCheck.isValidIndexInRange(51)) {
				var14 = 1;
			}

			var2 = 0;
			if (var13 >= 0 || var14 != 0) {
				var2 = Client.indexCheck.isValidIndexInRange(81) ? Client.oculusOrbSlowedSpeed : Client.oculusOrbNormalSpeed;
				var2 *= 16;
				Client.field539 = var13;
				Client.field626 = var14;
			}

			if (Client.field596 < var2) {
				Client.field596 += var2 / 8;
				if (Client.field596 > var2) {
					Client.field596 = var2;
				}
			} else if (Client.field596 > var2) {
				Client.field596 = Client.field596 * 9 / 10;
			}

			if (Client.field596 > 0) {
				var3 = Client.field596 / 16;
				if (Client.field539 >= 0) {
					var0 = Client.field539 - IntProjection.cameraYaw & 2047;
					var4 = Rasterizer3D.Rasterizer3D_sine[var0];
					var5 = Rasterizer3D.Rasterizer3D_cosine[var0];
					VarpDefinition.oculusOrbFocalPointX += var4 * var3 / 65536;
					class7.oculusOrbFocalPointY += var3 * var5 / 65536;
				}

				if (Client.field626 != 0) {
					ClientPacket.oculusOrbFocalPointZ += var3 * Client.field626;
					if (ClientPacket.oculusOrbFocalPointZ > 0) {
						ClientPacket.oculusOrbFocalPointZ = 0;
					}
				}
			} else {
				Client.field539 = -1;
				Client.field626 = -1;
			}

			if (Client.indexCheck.isValidIndexInRange(13)) {
				class380.method7644();
			}
		}

		if (MouseHandler.MouseHandler_currentButton == 4 && KeyHandler.mouseCam) {
			var0 = MouseHandler.MouseHandler_y - Client.mouseCamClickedY;
			Client.camAngleDX = var0 * 2;
			Client.mouseCamClickedY = var0 != -1 && var0 != 1 ? (MouseHandler.MouseHandler_y + Client.mouseCamClickedY) / 2 : MouseHandler.MouseHandler_y;
			var1 = Client.mouseCamClickedX - MouseHandler.MouseHandler_x;
			Client.camAngleDY = var1 * 2;
			Client.mouseCamClickedX = var1 != -1 && var1 != 1 ? (Client.mouseCamClickedX + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x;
		} else {
			if (Client.indexCheck.isValidIndexInRange(96)) {
				Client.camAngleDY += (-24 - Client.camAngleDY) / 2;
			} else if (Client.indexCheck.isValidIndexInRange(97)) {
				Client.camAngleDY += (24 - Client.camAngleDY) / 2;
			} else {
				Client.camAngleDY /= 2;
			}

			if (Client.indexCheck.isValidIndexInRange(98)) {
				Client.camAngleDX += (12 - Client.camAngleDX) / 2;
			} else if (Client.indexCheck.isValidIndexInRange(99)) {
				Client.camAngleDX += (-12 - Client.camAngleDX) / 2;
			} else {
				Client.camAngleDX /= 2;
			}

			Client.mouseCamClickedY = MouseHandler.MouseHandler_y;
			Client.mouseCamClickedX = MouseHandler.MouseHandler_x;
		}

		Client.camAngleY = Client.camAngleDY / 2 + Client.camAngleY & 2047;
		Client.camAngleX += Client.camAngleDX / 2;
		if (Client.camAngleX < 128) {
			Client.camAngleX = 128;
		}

		if (Client.camAngleX > 383) {
			Client.camAngleX = 383;
		}

	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(Ldz;IIIB)I",
		garbageValue = "54"
	)
	@Export("getTileHeight")
	static final int getTileHeight(WorldView var0, int var1, int var2, int var3) {
		int var4 = var1 >> 7;
		int var5 = var2 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 < var0.tileSettings[0].length && var5 < var0.tileSettings[0][0].length) {
			int var6 = var3;
			if (var3 < 3 && (var0.tileSettings[1][var4][var5] & 2) == 2) {
				var6 = var3 + 1;
			}

			int var7 = var1 & 127;
			int var8 = var2 & 127;
			int var9 = var0.tileHeights[var6][var4 + 1][var5] * var7 + var0.tileHeights[var6][var4][var5] * (128 - var7) >> 7;
			int var10 = var7 * var0.tileHeights[var6][var4 + 1][var5 + 1] + var0.tileHeights[var6][var4][var5 + 1] * (128 - var7) >> 7;
			return var9 * (128 - var8) + var8 * var10 >> 7;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("ou")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1261539671"
	)
	static String method334(String var0) {
		PlayerType[] var1 = class151.PlayerType_values();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			PlayerType var3 = var1[var2];
			if (var3.modIcon != -1 && var0.startsWith(WorldMapElement.method5195(var3.modIcon))) {
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length());
				break;
			}
		}

		return var0;
	}
}
