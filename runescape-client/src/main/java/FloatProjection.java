import java.awt.Image;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ja")
@Implements("FloatProjection")
public class FloatProjection extends Projection {
	@ObfuscatedName("ax")
	static Image field2798;
	@ObfuscatedName("li")
	@ObfuscatedGetter(
		intValue = 910210817
	)
	@Export("currentPort")
	static int currentPort;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	@Export("transformationMatrix")
	TransformationMatrix transformationMatrix;
	@ObfuscatedName("aj")
	@Export("projection")
	float[] projection;

	@ObfuscatedSignature(
		descriptor = "(Lrz;)V"
	)
	FloatProjection(TransformationMatrix var1) {
		this.projection = new float[3];
		this.transformationMatrix = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljr;IIIIJ)V"
	)
	@Export("draw")
	void draw(Renderable var1, int var2, int var3, int var4, int var5, long var6) {
		var1.draw(var2, this.transformationMatrix, var3, var4, var5, var6);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljg;Lkb;IIIB)V",
		garbageValue = "83"
	)
	@Export("drawTileUnderlay")
	void drawTileUnderlay(Scene var1, SceneTilePaint var2, int var3, int var4, int var5) {
		int var6;
		int var7 = var6 = var4 << 7;
		int var8;
		int var9 = var8 = var5 << 7;
		int var10;
		int var11 = var10 = var7 + 128;
		int var12;
		int var13 = var12 = var9 + 128;
		int var14 = var1.tileHeights[var3][var4][var5];
		int var15 = var1.tileHeights[var3][var4 + 1][var5];
		int var16 = var1.tileHeights[var3][var4 + 1][var5 + 1];
		int var17 = var1.tileHeights[var3][var4][var5 + 1];
		this.transformationMatrix.transformPoint((float)var7, (float)var14, (float)var9, this.projection);
		var7 = (int)this.projection[0];
		var14 = (int)this.projection[1];
		var9 = (int)this.projection[2] | 1;
		this.transformationMatrix.transformPoint((float)var11, (float)var15, (float)var8, this.projection);
		var11 = (int)this.projection[0];
		var15 = (int)this.projection[1];
		var8 = (int)this.projection[2] | 1;
		this.transformationMatrix.transformPoint((float)var10, (float)var16, (float)var13, this.projection);
		var10 = (int)this.projection[0];
		var16 = (int)this.projection[1];
		var13 = (int)this.projection[2] | 1;
		this.transformationMatrix.transformPoint((float)var6, (float)var17, (float)var12, this.projection);
		var6 = (int)this.projection[0];
		var17 = (int)this.projection[1];
		var12 = (int)this.projection[2] | 1;
		this.drawSceneTilePaint(var1, var2, var4, var5, var7, var11, var10, var6, var14, var15, var16, var17, var9, var8, var13, var12);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljg;Ljn;III)V",
		garbageValue = "-1298388971"
	)
	@Export("drawTileOverlay")
	void drawTileOverlay(Scene var1, SceneTileModel var2, int var3, int var4) {
		int var5 = var2.vertexX.length;

		for (int var6 = 0; var6 < var5; ++var6) {
			int var7 = var2.vertexX[var6];
			int var8 = var2.vertexY[var6];
			int var9 = var2.vertexZ[var6];
			this.transformationMatrix.transformPoint((float)var7, (float)var8, (float)var9, this.projection);
			var7 = (int)this.projection[0];
			var8 = (int)this.projection[1];
			var9 = (int)this.projection[2];
			if (var2.triangleTextureId != null) {
				SceneTileModel.triangleTexturesX[var6] = var7;
				SceneTileModel.triangleTexturesY[var6] = var8;
				SceneTileModel.triangleTexturesZ[var6] = var9;
			}

			var9 |= 1;
			SceneTileModel.verticesX[var6] = Rasterizer3D.getClipMidX() + var7 * Rasterizer3D.get3dZoom() / var9;
			SceneTileModel.verticesY[var6] = Rasterizer3D.getClipMidY() + var8 * Rasterizer3D.get3dZoom() / var9;
			SceneTileModel.verticesZ[var6] = PlayerUpdateManager.method2740(var9);
		}

		this.drawSceneTileModel(var1, var2, var3, var4);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)[Lkq;",
		garbageValue = "2"
	)
	static class273[] method5436() {
		return new class273[]{class273.field3091, class273.field3094, class273.field3089, class273.field3088, class273.field3096, class273.field3087, class273.field3092};
	}

	@ObfuscatedName("an")
	@Export("base37DecodeLong")
	public static String base37DecodeLong(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (var0 % 37L == 0L) {
				return null;
			} else {
				int var2 = 0;

				for (long var3 = var0; var3 != 0L; var3 /= 37L) {
					++var2;
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); var0 != 0L; var5.append(var8)) {
					long var6 = var0;
					var0 /= 37L;
					var8 = class440.base37Table[(int)(var6 - 37L * var0)];
					if (var8 == '_') {
						int var9 = var5.length() - 1;
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
						var8 = 160;
					}
				}

				var5.reverse();
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
				return var5.toString();
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lwt;IB)V",
		garbageValue = "-21"
	)
	@Export("readReflectionCheck")
	public static void readReflectionCheck(Buffer var0, int var1) {
		ReflectionCheck var2 = new ReflectionCheck();
		var2.size = var0.readUnsignedByte();
		var2.id = var0.readInt();
		var2.operations = new int[var2.size];
		var2.creationErrors = new int[var2.size];
		var2.fields = new Field[var2.size];
		var2.intReplaceValues = new int[var2.size];
		var2.methods = new Method[var2.size];
		var2.arguments = new byte[var2.size][][];

		for (int var3 = 0; var3 < var2.size; ++var3) {
			try {
				int var4 = var0.readUnsignedByte();
				String var5;
				String var6;
				int var7;
				if (var4 != 0 && var4 != 1 && var4 != 2) {
					if (var4 == 3 || var4 == 4) {
						var5 = var0.readStringCp1252NullTerminated();
						var6 = var0.readStringCp1252NullTerminated();
						var7 = var0.readUnsignedByte();
						String[] var8 = new String[var7];

						for (int var9 = 0; var9 < var7; ++var9) {
							var8[var9] = var0.readStringCp1252NullTerminated();
						}

						String var20 = var0.readStringCp1252NullTerminated();
						byte[][] var10 = new byte[var7][];
						int var12;
						if (var4 == 3) {
							for (int var11 = 0; var11 < var7; ++var11) {
								var12 = var0.readInt();
								var10[var11] = new byte[var12];
								var0.readBytes(var10[var11], 0, var12);
							}
						}

						var2.operations[var3] = var4;
						Class[] var21 = new Class[var7];

						for (var12 = 0; var12 < var7; ++var12) {
							var21[var12] = class390.loadClassFromDescriptor(var8[var12]);
						}

						Class var22 = class390.loadClassFromDescriptor(var20);
						if (class390.loadClassFromDescriptor(var5).getClassLoader() == null) {
							throw new SecurityException();
						}

						Method[] var13 = class390.loadClassFromDescriptor(var5).getDeclaredMethods();
						Method[] var14 = var13;

						for (int var15 = 0; var15 < var14.length; ++var15) {
							Method var16 = var14[var15];
							if (Reflection.getMethodName(var16).equals(var6)) {
								Class[] var17 = Reflection.getParameterTypes(var16);
								if (var17.length == var21.length) {
									boolean var18 = true;

									for (int var19 = 0; var19 < var21.length; ++var19) {
										if (var17[var19] != var21[var19]) {
											var18 = false;
											break;
										}
									}

									if (var18 && var22 == var16.getReturnType()) {
										var2.methods[var3] = var16;
									}
								}
							}
						}

						var2.arguments[var3] = var10;
					}
				} else {
					var5 = var0.readStringCp1252NullTerminated();
					var6 = var0.readStringCp1252NullTerminated();
					var7 = 0;
					if (var4 == 1) {
						var7 = var0.readInt();
					}

					var2.operations[var3] = var4;
					var2.intReplaceValues[var3] = var7;
					if (class390.loadClassFromDescriptor(var5).getClassLoader() == null) {
						throw new SecurityException();
					}

					var2.fields[var3] = Reflection.findField(class390.loadClassFromDescriptor(var5), var6);
				}
			} catch (ClassNotFoundException var24) {
				var2.creationErrors[var3] = -1;
			} catch (SecurityException var25) {
				var2.creationErrors[var3] = -2;
			} catch (NullPointerException var26) {
				var2.creationErrors[var3] = -3;
			} catch (Exception var27) {
				var2.creationErrors[var3] = -4;
			} catch (Throwable var28) {
				var2.creationErrors[var3] = -5;
			}
		}

		class36.reflectionChecks.addFirst(var2);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "198930864"
	)
	public static void method5439() {
		WorldMapRegion.WorldMapRegion_cachedSprites.demote(5);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILcr;ZB)I",
		garbageValue = "16"
	)
	static int method5424(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class539.scriptDotWidget : Huffman.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else {
			class367 var7;
			if (var0 == ScriptOpcodes.CC_GETTEXT) {
				if (var3.type == 12) {
					var7 = var3.method7755();
					if (var7 != null) {
						Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = var7.method7446().method9021();
						return 1;
					}
				}

				Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = var3.text;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollWidth;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollHeight;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelZoom;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleX;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleZ;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleY;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETTRANS) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyTop;
				return 1;
			} else if (var0 == 1610) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyBot;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color2;
				return 1;
			} else if (var0 == 1613) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
				return 1;
			} else {
				class361 var4;
				if (var0 == 1617) {
					var4 = var3.method7774();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3885 : 0;
				}

				if (var0 == 1618) {
					var4 = var3.method7774();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3883 : 0;
					return 1;
				} else if (var0 == 1619) {
					var7 = var3.method7755();
					Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = var7 != null ? var7.method7447().method9021() : "";
					return 1;
				} else if (var0 == 1620) {
					var4 = var3.method7774();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3886 : 0;
					return 1;
				} else if (var0 == 1621) {
					var7 = var3.method7755();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method7457() : 0;
					return 1;
				} else if (var0 == 1622) {
					var7 = var3.method7755();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method7458() : 0;
					return 1;
				} else if (var0 == 1623) {
					var7 = var3.method7755();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method7459() : 0;
					return 1;
				} else if (var0 == 1624) {
					var7 = var3.method7755();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method7449() ? 1 : 0;
					return 1;
				} else if (var0 != 1625) {
					if (var0 == 1626) {
						var7 = var3.method7755();
						Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = var7 != null ? var7.method7421().method9215() : "";
						return 1;
					} else if (var0 == 1627) {
						var7 = var3.method7755();
						int var5 = var7 != null ? var7.method7615() : 0;
						int var6 = var7 != null ? var7.method7452() : 0;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.min(var5, var6);
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.max(var5, var6);
						return 1;
					} else if (var0 == 1628) {
						var7 = var3.method7755();
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method7452() : 0;
						return 1;
					} else if (var0 == 1629) {
						var7 = var3.method7755();
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method7513() : 0;
						return 1;
					} else if (var0 == 1630) {
						var7 = var3.method7755();
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method7617() : 0;
						return 1;
					} else if (var0 == 1631) {
						var7 = var3.method7755();
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method7464() : 0;
						return 1;
					} else if (var0 == 1632) {
						var7 = var3.method7755();
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method7473() : 0;
						return 1;
					} else {
						class27 var8;
						if (var0 == 1633) {
							var8 = var3.method7775();
							Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method428(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else if (var0 == 1634) {
							var8 = var3.method7775();
							Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method411((char)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var7 = var3.method7755();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method7450() ? 1 : 0;
					return 1;
				}
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "9"
	)
	static void method5441() {
		class85.method2689(24);
		MenuAction.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", "");
	}
}
