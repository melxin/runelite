import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bv")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("ap")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("al")
	static final double field657;
	@ObfuscatedName("ai")
	@Export("Interpreter_objectLocals")
	static Object[] Interpreter_objectLocals;
	@ObfuscatedName("aa")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("an")
	@Export("Interpreter_objectStack")
	static Object[] Interpreter_objectStack;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1771498025
	)
	@Export("Interpreter_objectStackSize")
	static int Interpreter_objectStackSize;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1141760993
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[Lbq;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 222371735
	)
	static int field653;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	static class368 field665;
	@ObfuscatedName("ab")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("ak")
	static boolean field667;
	@ObfuscatedName("aj")
	static boolean field652;
	@ObfuscatedName("az")
	static ArrayList field669;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 658483381
	)
	static int field670;

	static {
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		field657 = Math.log(2.0D);
		Interpreter_intStack = new int[1000];
		Interpreter_objectStack = new Object[1000];
		Interpreter_frameDepth = 0;
		Interpreter_frames = new ScriptFrame[50];
		field653 = 0;
		field665 = new class368();
		Interpreter_calendar = java.util.Calendar.getInstance();
		field667 = false;
		field652 = false;
		field669 = new ArrayList();
		field670 = 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lsp;ILsk;I)I",
		garbageValue = "-892555755"
	)
	static int method1774(AnimationSequence var0, int var1, class468 var2) {
		int var3 = 0;
		SequenceDefinition var4 = var0.getSequenceDefinition();
		if (var4.frameCount > 0 && var4.field2477 > 0) {
			var1 %= var4.field2477;
		}

		int var5 = var0.getFrame();
		int var6 = var0.getFrameCycle();
		int var7 = var0.method9620();
		if (var5 >= var4.frameIds.length) {
			var5 = 0;
			var6 = 0;
		}

		var6 += var1;

		while (true) {
			do {
				if (var6 <= var4.frameLengths[var5]) {
					var0.method9624(var5, var6, var7);
					return var3;
				}

				var6 -= var4.frameLengths[var5];
				++var5;
				var3 |= 4;
				if ((var3 & 2) == 0 && var2 != null) {
					var2.vmethod10858(var4, var5);
				}
			} while(var5 < var4.frameIds.length);

			++var7;
			var3 |= 1;
			var5 -= var4.frameCount;
			if (var7 >= var4.field2486) {
				var3 |= 2;
			}

			if (var5 < 0 || var5 >= var4.frameIds.length) {
				var3 |= 2;
				var5 = 0;
			}

			if ((var3 & 2) == 0 && var2 != null) {
				var2.vmethod10858(var4, var5);
			}
		}
	}

	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ldr;",
		garbageValue = "698620686"
	)
	static WorldView method1773(int var0, int var1, int var2) {
		return Client.worldViewManager.method2363(var0, var1, var2, class36.clientPreferences.getDrawDistance(), class217.field2511);
	}
}
