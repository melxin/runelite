import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("nl")
class class338 implements ThreadFactory {
	@ObfuscatedName("lo")
	@ObfuscatedGetter(
		intValue = 1272218955
	)
	@Export("js5Port")
	static int js5Port;
	@ObfuscatedName("ws")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	@Export("worldMap")
	static WorldMap worldMap;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	final MidiPcmStream this$0;

	@ObfuscatedSignature(
		descriptor = "(Lmt;)V"
	)
	class338(MidiPcmStream var1) {
		this.this$0 = var1;
	}

	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS WAV Load");
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILcr;ZI)I",
		garbageValue = "584657797"
	)
	static int method7098(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class539.scriptDotWidget : Huffman.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class187.method4098(class255.method5526(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.CC_GETOP) {
			if (var0 == ScriptOpcodes.CC_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = "";
			}

			return 1;
		}
	}
}
