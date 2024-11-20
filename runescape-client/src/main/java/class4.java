import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ao")
public final class class4 {
	@ObfuscatedName("aa")
	@Export("userHomeDirectory")
	static String userHomeDirectory;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	static GameBuild field10;

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "-387650301"
	)
	public static String method19(CharSequence var0) {
		return Occluder.method5164('*', var0.length());
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZB)I",
		garbageValue = "-29"
	)
	static int method18(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) {
			PrivateChatMode.Interpreter_intStackSize -= 2;
			Client.field797 = (short)GraphicsObject.method2245(Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize]);
			if (Client.field797 <= 0) {
				Client.field797 = 256;
			}

			Client.field511 = (short)GraphicsObject.method2245(Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1]);
			if (Client.field511 <= 0) {
				Client.field511 = 256;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) {
			PrivateChatMode.Interpreter_intStackSize -= 2;
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
			if (Client.zoomHeight <= 0) {
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
			if (Client.zoomWidth <= 0) {
				Client.zoomWidth = 320;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) {
			PrivateChatMode.Interpreter_intStackSize -= 4;
			Client.field783 = (short)Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
			if (Client.field783 <= 0) {
				Client.field783 = 1;
			}

			Client.field784 = (short)Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
			if (Client.field784 <= 0) {
				Client.field784 = 32767;
			} else if (Client.field784 < Client.field783) {
				Client.field784 = Client.field783;
			}

			Client.field785 = (short)Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 2];
			if (Client.field785 <= 0) {
				Client.field785 = 1;
			}

			Client.field786 = (short)Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 3];
			if (Client.field786 <= 0) {
				Client.field786 = 32767;
			} else if (Client.field786 < Client.field785) {
				Client.field786 = Client.field785;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) {
			if (Client.viewportWidget != null) {
				WorldMapID.setViewportShape(0, 0, Client.viewportWidget.width * 1063514007, Client.viewportWidget.height * 1899982693, false);
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Client.viewportWidth;
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Client.viewportHeight;
			} else {
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = -1;
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = -1;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) {
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Client.zoomHeight;
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Client.zoomWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) {
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = HttpResponse.method270(Client.field797);
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = HttpResponse.method270(Client.field511);
			return 1;
		} else if (var0 == 6220) {
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6221) {
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6222) {
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class329.canvasWidth;
			return 1;
		} else if (var0 == 6223) {
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class535.canvasHeight;
			return 1;
		} else {
			return 2;
		}
	}
}
