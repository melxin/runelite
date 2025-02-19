import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cj")
@Implements("Decimator")
public class Decimator {
	@ObfuscatedName("ui")
	@ObfuscatedGetter(
		intValue = 2112032923
	)
	static int field399;
	@ObfuscatedName("vn")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	@Export("platformInfo")
	static PlatformInfo platformInfo;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -561299537
	)
	@Export("inputRate")
	int inputRate;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -993990095
	)
	@Export("outputRate")
	int outputRate;
	@ObfuscatedName("ac")
	@Export("table")
	int[][] table;

	public Decimator(int var1, int var2) {
		if (var2 != var1) {
			int var4 = var1;
			int var5 = var2;
			if (var2 > var1) {
				var4 = var2;
				var5 = var1;
			}

			while (var5 != 0) {
				int var6 = var4 % var5;
				var4 = var5;
				var5 = var6;
			}

			var1 /= var4;
			var2 /= var4;
			this.inputRate = var1;
			this.outputRate = var2;
			this.table = new int[var1][14];

			for (int var7 = 0; var7 < var1; ++var7) {
				int[] var8 = this.table[var7];
				double var9 = 6.0D + (double)var7 / (double)var1;
				int var11 = (int)Math.floor(1.0D + (var9 - 7.0D));
				if (var11 < 0) {
					var11 = 0;
				}

				int var12 = (int)Math.ceil(var9 + 7.0D);
				if (var12 > 14) {
					var12 = 14;
				}

				for (double var13 = (double)var2 / (double)var1; var11 < var12; ++var11) {
					double var15 = ((double)var11 - var9) * 3.141592653589793D;
					double var17 = var13;
					if (var15 < -1.0E-4D || var15 > 1.0E-4D) {
						var17 = var13 * (Math.sin(var15) / var15);
					}

					var17 *= 0.54D + 0.46D * Math.cos(0.2243994752564138D * ((double)var11 - var9));
					var8[var11] = (int)Math.floor(65536.0D * var17 + 0.5D);
				}
			}

		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "143788683"
	)
	@Export("resample")
	byte[] resample(byte[] var1) {
		if (this.table != null) {
			int var2 = (int)((long)var1.length * (long)this.outputRate / (long)this.inputRate) + 14;
			int[] var3 = new int[var2];
			int var4 = 0;
			int var5 = 0;

			int var6;
			for (var6 = 0; var6 < var1.length; ++var6) {
				byte var7 = var1[var6];
				int[] var8 = this.table[var5];

				int var9;
				for (var9 = 0; var9 < 14; ++var9) {
					var3[var9 + var4] += var7 * var8[var9];
				}

				var5 += this.outputRate;
				var9 = var5 / this.inputRate;
				var4 += var9;
				var5 -= var9 * this.inputRate;
			}

			var1 = new byte[var2];

			for (var6 = 0; var6 < var2; ++var6) {
				int var10 = var3[var6] + 32768 >> 16;
				if (var10 < -128) {
					var1[var6] = -128;
				} else if (var10 > 127) {
					var1[var6] = 127;
				} else {
					var1[var6] = (byte)var10;
				}
			}
		}

		return var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1274589404"
	)
	@Export("scaleRate")
	int scaleRate(int var1) {
		if (this.table != null) {
			var1 = (int)((long)var1 * (long)this.outputRate / (long)this.inputRate);
		}

		return var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-29742966"
	)
	@Export("scalePosition")
	int scalePosition(int var1) {
		if (this.table != null) {
			var1 = (int)((long)var1 * (long)this.outputRate / (long)this.inputRate) + 6;
		}

		return var1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)[Lhh;",
		garbageValue = "-1909847341"
	)
	static VerticalAlignment[] method1111() {
		return new VerticalAlignment[]{VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field2086, VerticalAlignment.field2090};
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILdy;ZI)I",
		garbageValue = "-228598003"
	)
	static int method1110(int var0, Script var1, boolean var2) {
		int var3 = -1;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
			var4 = class376.widgetDefinition.method6918(var3);
		} else {
			var4 = var2 ? class132.scriptDotWidget : PlayerCompositionColorTextureOverride.scriptActiveWidget;
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) {
			HealthBarConfig.Interpreter_intStackSize -= 4;
			var4.rawX = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
			var4.rawY = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
			var4.xAlignment = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 2];
			var4.yAlignment = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 3];
			MilliClock.invalidateWidget(var4);
			class569.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				class95.revalidateWidgetScroll(class376.widgetDefinition.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) {
			HealthBarConfig.Interpreter_intStackSize -= 4;
			var4.rawWidth = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
			var4.rawHeight = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
			var4.widthAlignment = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 2];
			var4.heightAlignment = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 3];
			MilliClock.invalidateWidget(var4);
			class569.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				class95.revalidateWidgetScroll(class376.widgetDefinition.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) {
			boolean var5 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize] == 1;
			if (var5 != var4.isHidden) {
				var4.isHidden = var5;
				MilliClock.invalidateWidget(var4);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) {
			var4.noClickThrough = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize] == 1;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) {
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize] == 1;
			return 1;
		} else {
			return 2;
		}
	}
}
