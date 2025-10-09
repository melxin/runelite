import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
public class class210 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -2093062933
	)
	public int field2294;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1850449181
	)
	public int field2299;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1285080315
	)
	public int field2296;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -322782025
	)
	public int field2295;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -798752939
	)
	public int field2298;

	class210(int var1, int var2, int var3, int var4, int var5) {
		this.field2294 = 0;
		this.field2299 = 1;
		this.field2296 = 0;
		this.field2295 = 0;
		this.field2298 = 0;
		this.field2294 = var1;
		this.field2299 = var2;
		this.field2296 = var3;
		this.field2295 = var4;
		this.field2298 = var5;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "76"
	)
	public static int method4671(int var0) {
		return var0 >> 14 & 1023;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "27"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (class154.clientPreferences.getSoundEffectsVolume() != 0 && var1 != 0 && class57.soundEffectCount < 50) {
			class421.method8618(-1, var0, 0, 0, 0, 0, var1, var2, false);
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lok;B)I",
		garbageValue = "4"
	)
	static int method4670(Widget var0) {
		if (var0.type != 11) {
			Interpreter.Interpreter_objectStack[Message.Interpreter_objectStackSize - 1] = "";
			return 1;
		} else {
			String var1 = (String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
			Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var0.method7953(var1);
			return 1;
		}
	}
}
