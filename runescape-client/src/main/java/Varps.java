import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nf")
@Implements("Varps")
public class Varps {
	@ObfuscatedName("an")
	@Export("Varps_temp")
	public static int[] Varps_temp;
	@ObfuscatedName("ae")
	@Export("Varps_main")
	public static int[] Varps_main;
	@ObfuscatedName("af")
	@Export("Varps_masks")
	static int[] Varps_masks;
	@ObfuscatedName("ad")
	static int[][][] field3836;

	static {
		Varps_temp = new int[5000];
		Varps_main = new int[5000];
		Varps_masks = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			Varps_masks[var1] = var0 - 1;
			var0 += var0;
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lnh;I)I",
		garbageValue = "377639309"
	)
	static int method6884(Widget var0) {
		if (var0.type != 11) {
			--class338.Interpreter_stringStackSize;
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--class338.Interpreter_stringStackSize];
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var0.method7435(var1);
			return 1;
		}
	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1863212373"
	)
	static void method6885() {
		WorldMapEvent.accessToken = System.getenv("JX_ACCESS_TOKEN");
		DynamicObject.refreshToken = System.getenv("JX_REFRESH_TOKEN");
		class320.sessionId = System.getenv("JX_SESSION_ID");
		class134.characterId = System.getenv("JX_CHARACTER_ID");
		class393.method7609(System.getenv("JX_DISPLAY_NAME"));
	}
}
