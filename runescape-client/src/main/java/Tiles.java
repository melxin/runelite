import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dq")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -738950123
	)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("ay")
	@Export("Tiles_underlays")
	static short[][][] Tiles_underlays;
	@ObfuscatedName("au")
	@Export("Tiles_overlays")
	static short[][][] Tiles_overlays;
	@ObfuscatedName("ad")
	@Export("Tiles_shapes")
	static byte[][][] Tiles_shapes;
	@ObfuscatedName("ah")
	static byte[][][] field1047;
	@ObfuscatedName("af")
	@Export("Tiles_hue")
	static int[] Tiles_hue;
	@ObfuscatedName("ar")
	static final int[] field1051;
	@ObfuscatedName("ag")
	static final int[] field1052;
	@ObfuscatedName("az")
	static final int[] field1053;
	@ObfuscatedName("am")
	static final int[] field1058;
	@ObfuscatedName("aq")
	static final int[] field1055;
	@ObfuscatedName("aw")
	static final int[] field1056;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1120843555
	)
	@Export("rndHue")
	static int rndHue;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 280863731
	)
	@Export("rndLightness")
	static int rndLightness;
	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	@Export("urlRequester")
	static UrlRequester urlRequester;

	static {
		Tiles_minPlane = 99;
		field1051 = new int[]{1, 2, 4, 8};
		field1052 = new int[]{16, 32, 64, 128};
		field1053 = new int[]{1, 0, -1, 0};
		field1058 = new int[]{0, -1, 0, 1};
		field1055 = new int[]{1, -1, -1, 1};
		field1056 = new int[]{-1, -1, 1, 1};
		rndHue = (int)(Math.random() * 17.0D) - 8;
		rndLightness = (int)(Math.random() * 33.0D) - 16;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "-849452344"
	)
	public static int method2370(CharSequence var0) {
		return GrandExchangeEvents.method7781(var0, 10, true);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ldp;[BIIIIIII)V"
	)
	static final void method2354(WorldView var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Buffer var9 = new Buffer(var1);
		int var10 = -1;

		while (true) {
			int var11 = var9.readIncrSmallSmart();
			if (var11 == 0) {
				return;
			}

			var10 += var11;
			int var12 = 0;

			while (true) {
				int var13 = var9.readUShortSmart();
				if (var13 == 0) {
					break;
				}

				var12 += var13 - 1;
				int var14 = var12 & 63;
				int var15 = var12 >> 6 & 63;
				int var16 = var12 >> 12;
				int var17 = var9.readUnsignedByte();
				int var18 = var17 >> 2;
				int var19 = var17 & 3;
				if (var5 == var16 && var15 >= var6 && var15 < var6 + 8 && var14 >= var7 && var14 < var7 + 8) {
					ObjectComposition var20 = class177.getObjectDefinition(var10);
					int var21 = var3 + HttpMethod.method73(var15 & 7, var14 & 7, var8, var20.sizeX, var20.sizeY, var19);
					int var24 = var15 & 7;
					int var25 = var14 & 7;
					int var27 = var20.sizeX;
					int var28 = var20.sizeY;
					int var29;
					if ((var19 & 1) == 1) {
						var29 = var27;
						var27 = var28;
						var28 = var29;
					}

					int var26 = var8 & 3;
					int var23;
					if (var26 == 0) {
						var23 = var25;
					} else if (var26 == 1) {
						var23 = 7 - var24 - (var27 - 1);
					} else if (var26 == 2) {
						var23 = 7 - var25 - (var28 - 1);
					} else {
						var23 = var24;
					}

					var29 = var23 + var4;
					if (var21 > 0 && var29 > 0 && var21 < var0.sizeX - 1 && var29 < var0.sizeY - 1) {
						int var30 = var2;
						if ((var0.tileSettings[1][var21][var29] & 2) == 2) {
							var30 = var2 - 1;
						}

						CollisionMap var31 = null;
						if (var30 >= 0 && var0.collisionMaps != null) {
							var31 = var0.collisionMaps[var30];
						}

						class581.addObjects(var0, var2, var21, var29, var10, var19 + var8 & 3, var18, var31);
					}
				}
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILdy;ZI)I",
		garbageValue = "1218039325"
	)
	static int method2396(int var0, Script var1, boolean var2) {
		Widget var3 = class376.widgetDefinition.method6918(Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = ItemLayer.Widget_unpackTargetMask(class441.getWidgetFlags(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.IF_GETOP) {
			if (var0 == ScriptOpcodes.IF_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
			}

			return 1;
		}
	}

	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "([Lnz;IIIZB)V",
		garbageValue = "-29"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) {
			Widget var6 = var0[var5];
			if (var6 != null && var6.parentId == var1) {
				class569.alignWidgetSize(var6, var2, var3, var4);
				KitDefinition.alignWidgetPosition(var6, var2, var3);
				if (var6.scrollX > var6.scrollWidth - var6.width * 779142065) {
					var6.scrollX = var6.scrollWidth - var6.width * 779142065;
				}

				if (var6.scrollX < 0) {
					var6.scrollX = 0;
				}

				if (var6.scrollY > var6.scrollHeight - var6.height * 1836304183) {
					var6.scrollY = var6.scrollHeight - var6.height * 1836304183;
				}

				if (var6.scrollY < 0) {
					var6.scrollY = 0;
				}

				if (var6.type == 0) {
					class95.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}

	}
}
