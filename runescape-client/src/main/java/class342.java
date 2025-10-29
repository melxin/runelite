import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nj")
public class class342 {
	@ObfuscatedName("av")
	static int[] field3880;

	static {
		new Object();
		field3880 = new int[33];
		field3880[0] = 0;
		int var0 = 2;

		for (int var1 = 1; var1 < 33; ++var1) {
			field3880[var1] = var0 - 1;
			var0 += var0;
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lqm;I)V",
		garbageValue = "-833282750"
	)
	public static void method7324(AbstractArchive var0) {
		VarcInt.VarcInt_archive = var0;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(ILcu;ZB)I",
		garbageValue = "-91"
	)
	static int method7323(int var0, Script var1, boolean var2) {
		if (var0 == 7900) {
			int var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
			Client.field348 = Math.max(var3, 0);
			return 1;
		} else if (var0 == 7901) {
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Client.field348;
			return 1;
		} else {
			return 2;
		}
	}
}
