import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("mw")
public class class333 {
	@ObfuscatedName("ab")
	static int[] field3673;

	static {
		new Object();
		field3673 = new int[33];
		field3673[0] = 0;
		int var0 = 2;

		for (int var1 = 1; var1 < 33; ++var1) {
			field3673[var1] = var0 - 1;
			var0 += var0;
		}

	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ILdy;ZI)I",
		garbageValue = "433119699"
	)
	static int method6540(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) {
			HealthBarConfig.Interpreter_intStackSize -= 2;
			Client.field787 = (short)class213.method4365(Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize]);
			if (Client.field787 <= 0) {
				Client.field787 = 256;
			}

			Client.field788 = (short)class213.method4365(Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1]);
			if (Client.field788 <= 0) {
				Client.field788 = 256;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) {
			HealthBarConfig.Interpreter_intStackSize -= 2;
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
			if (Client.zoomHeight <= 0) {
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
			if (Client.zoomWidth <= 0) {
				Client.zoomWidth = 320;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) {
			HealthBarConfig.Interpreter_intStackSize -= 4;
			Client.field782 = (short)Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
			if (Client.field782 <= 0) {
				Client.field782 = 1;
			}

			Client.field675 = (short)Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
			if (Client.field675 <= 0) {
				Client.field675 = 32767;
			} else if (Client.field675 < Client.field782) {
				Client.field675 = Client.field782;
			}

			Client.field656 = (short)Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 2];
			if (Client.field656 <= 0) {
				Client.field656 = 1;
			}

			Client.field615 = (short)Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 3];
			if (Client.field615 <= 0) {
				Client.field615 = 32767;
			} else if (Client.field615 < Client.field656) {
				Client.field615 = Client.field656;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) {
			if (Client.viewportWidget != null) {
				ParamComposition.setViewportShape(0, 0, Client.viewportWidget.width * 779142065, Client.viewportWidget.height * 1836304183, false);
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = Client.viewportWidth;
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = Client.viewportHeight;
			} else {
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = -1;
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = -1;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) {
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = Client.zoomHeight;
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = Client.zoomWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) {
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = World.method1850(Client.field787);
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = World.method1850(Client.field788);
			return 1;
		} else if (var0 == 6220) {
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6221) {
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6222) {
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = GameEngine.canvasWidth;
			return 1;
		} else if (var0 == 6223) {
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = SwapSongTask.canvasHeight;
			return 1;
		} else {
			return 2;
		}
	}
}
