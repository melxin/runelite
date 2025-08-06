import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("na")
public class class358 {
	@ObfuscatedName("av")
	@Export("javaVendor")
	public static String javaVendor;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 2035455669
	)
	static int field3965;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 791485867
	)
	public int field3966;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 48389859
	)
	public int field3962;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1961953701
	)
	public int field3963;

	class358() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-513679147"
	)
	public static void method7489() {
		WorldMapRegion.WorldMapRegion_cachedSprites.demote(5);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lox;ZI)V",
		garbageValue = "-1411940473"
	)
	static void method7491(Widget var0, boolean var1) {
		if (var0 != null) {
			Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 1;
			if (var1) {
				class392.scriptDotWidget = var0;
			} else {
				Interpreter.scriptActiveWidget = var0;
			}
		} else {
			Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
		}

	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-327123067"
	)
	static boolean method7490() {
		return (Client.drawPlayerNames & 2) != 0;
	}
}
