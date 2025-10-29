import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("nv")
public class class338 {
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ILcu;ZI)I",
		garbageValue = "-222241638"
	)
	static int method7283(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) {
			class408.Interpreter_intStackSize -= 2;
			Client.field331 = (short)SequenceDefinition.method4937(Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize]);
			if (Client.field331 <= 0) {
				Client.field331 = 256;
			}

			Client.field519 = (short)SequenceDefinition.method4937(Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1]);
			if (Client.field519 <= 0) {
				Client.field519 = 256;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) {
			class408.Interpreter_intStackSize -= 2;
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
			if (Client.zoomHeight <= 0) {
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
			if (Client.zoomWidth <= 0) {
				Client.zoomWidth = 320;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) {
			class408.Interpreter_intStackSize -= 4;
			Client.field335 = (short)Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
			if (Client.field335 <= 0) {
				Client.field335 = 1;
			}

			Client.field332 = (short)Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
			if (Client.field332 <= 0) {
				Client.field332 = 32767;
			} else if (Client.field332 < Client.field335) {
				Client.field332 = Client.field335;
			}

			Client.field337 = (short)Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 2];
			if (Client.field337 <= 0) {
				Client.field337 = 1;
			}

			Client.field529 = (short)Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 3];
			if (Client.field529 <= 0) {
				Client.field529 = 32767;
			} else if (Client.field529 < Client.field337) {
				Client.field529 = Client.field337;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) {
			if (Client.viewportWidget != null) {
				SoundCache.setViewportShape(0, 0, Client.viewportWidget.width * -1946208531, Client.viewportWidget.height * -905446999, false);
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Client.viewportWidth;
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Client.viewportHeight;
			} else {
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = -1;
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = -1;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) {
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Client.zoomHeight;
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Client.zoomWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) {
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class160.method4034(Client.field331);
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class160.method4034(Client.field519);
			return 1;
		} else if (var0 == 6220) {
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6221) {
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6222) {
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class489.canvasWidth;
			return 1;
		} else if (var0 == 6223) {
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class374.canvasHeight;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1868866219"
	)
	static final void method7282() {
		for (Projectile var0 = (Projectile)Client.projectiles.last(); var0 != null; var0 = (Projectile)Client.projectiles.previous()) {
			if (Client.cycle > var0.cycleEnd) {
				var0.remove();
			} else if (Client.cycle >= var0.cycleStart) {
				var0.setDestination(Client.worldViewManager, Client.cycle, Client.graphicsCycle);
				Occluder.topLevelWorldView.scene.drawEntity(var0.sourceLevel, (int)var0.x, (int)var0.y, (int)var0.z, 60, var0, var0.orientation, -1L, false);
			}
		}

	}
}
