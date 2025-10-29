import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hk")
@Implements("VerticalAlignment")
public enum VerticalAlignment implements Enum {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lhk;"
	)
	field2178(2, 0),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lhk;"
	)
	@Export("VerticalAlignment_centered")
	VerticalAlignment_centered(0, 1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lhk;"
	)
	field2180(1, 2);

	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1167722475
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -704843113
	)
	@Export("id")
	final int id;

	VerticalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "20"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "77"
	)
	static int method4541(int var0, int var1) {
		FloorOverlayDefinition var2 = class189.method4415(var0);
		if (var2 == null) {
			return var1;
		} else {
			int var3;
			int var4;
			if (var2.secondaryRgb >= 0) {
				var3 = MoveSpeed.method6513(var2.secondaryHue, var2.secondarySaturation, var2.secondaryLightness);
				var4 = class239.method5241(var3, 96);
				return Rasterizer3D.Rasterizer3D_colorPalette[var4] | -16777216;
			} else if (var2.texture >= 0) {
				var3 = class239.method5241(Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture), 96);
				return Rasterizer3D.Rasterizer3D_colorPalette[var3] | -16777216;
			} else if (var2.primaryRgb == 16711935) {
				return var1;
			} else {
				var3 = MoveSpeed.method6513(var2.hue, var2.saturation, var2.lightness);
				var4 = class239.method5241(var3, 96);
				return Rasterizer3D.Rasterizer3D_colorPalette[var4] | -16777216;
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2056965400"
	)
	public static void method4544() {
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear();
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ILcu;ZI)I",
		garbageValue = "757613230"
	)
	static int method4548(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.ADD) {
			class408.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var4 + var9;
			return 1;
		} else if (var0 == ScriptOpcodes.SUB) {
			class408.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var9 - var4;
			return 1;
		} else if (var0 == ScriptOpcodes.MULTIPLY) {
			class408.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var4 * var9;
			return 1;
		} else if (var0 == ScriptOpcodes.DIV) {
			class408.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var9 / var4;
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOM) {
			var9 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var9);
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOMINC) {
			var9 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var9 + 1));
			return 1;
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) {
				class408.Interpreter_intStackSize -= 5;
				var9 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 3];
				var7 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 4];
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var9 + (var4 - var9) * (var7 - var5) / (var6 - var5);
				return 1;
			} else if (var0 == ScriptOpcodes.ADDPERCENT) {
				class408.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var9 + var4 * var9 / 100;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT) {
				class408.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var9 | 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT) {
				class408.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var9 & -1 - (1 << var4);
				return 1;
			} else if (var0 == ScriptOpcodes.TESTBIT) {
				class408.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = (var9 & 1 << var4) != 0 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.MOD) {
				class408.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var9 % var4;
				return 1;
			} else if (var0 == ScriptOpcodes.POW) {
				class408.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
				if (var9 == 0) {
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, (double)var4);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.INVPOW) {
				class408.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
				if (var9 == 0) {
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
					return 1;
				} else {
					switch(var4) {
					case 0:
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Integer.MAX_VALUE;
						break;
					case 1:
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var9;
						break;
					case 2:
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var9);
						break;
					case 3:
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var9);
						break;
					case 4:
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var9));
						break;
					default:
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, 1.0D / (double)var4);
					}

					return 1;
				}
			} else if (var0 == ScriptOpcodes.AND) {
				class408.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var9 & var4;
				return 1;
			} else if (var0 == ScriptOpcodes.OR) {
				class408.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var9 | var4;
				return 1;
			} else if (var0 == 4016) {
				class408.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var9 < var4 ? var9 : var4;
				return 1;
			} else if (var0 == 4017) {
				class408.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var9 > var4 ? var9 : var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SCALE) {
				class408.Interpreter_intStackSize -= 3;
				long var10 = (long)Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
				long var12 = (long)Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
				long var14 = (long)Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = (int)(var10 * var14 / var12);
				return 1;
			} else if (var0 == ScriptOpcodes.BITCOUNT) {
				var9 = ServerPacket.method7279(Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var9;
				return 1;
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) {
				class408.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var9 ^ 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) {
				class408.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class309.method7018(var9, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) {
				class408.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = FloatProjection.method5820(var9, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) {
				class408.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 2];
				var6 = 31 - var5;
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var9 << var6 >>> var4 + var6;
				return 1;
			} else if (var0 == 4030) {
				class408.Interpreter_intStackSize -= 4;
				var9 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 3];
				var9 = FloatProjection.method5820(var9, var5, var6);
				var7 = SpotAnimationDefinition.method4582(var6 - var5 + 1);
				if (var4 > var7) {
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var9 | var4 << var5;
				return 1;
			} else if (var0 == 4032) {
				Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize - 1] = class137.method3827(Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4033) {
				Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize - 1] = class33.method518(Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4034) {
				class408.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
				var5 = class394.method8396(var9, var4);
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var5;
				return 1;
			} else if (var0 == 4035) {
				Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4036) {
				String var3 = (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
				var4 = -1;
				if (ViewportMouse.isNumber(var3)) {
					var4 = Message.method778(var3);
				}

				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var4;
				return 1;
			} else {
				return 2;
			}
		}
	}

	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIII)I",
		garbageValue = "-702991691"
	)
	static final int method4546(String var0, String var1, int var2, int var3, int var4, int var5, int var6) {
		return ClanChannel.insertMenuItem(var0, var1, var2, var3, var4, var5, var6, false, -1);
	}
}
