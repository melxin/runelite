import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bz")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("al")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("ah")
	static final double field663;
	@ObfuscatedName("au")
	@Export("Interpreter_stringLocals")
	static Object[] Interpreter_stringLocals;
	@ObfuscatedName("ar")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("ad")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("af")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1023999147
	)
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;
	@ObfuscatedName("az")
	@Export("Interpreter_stringStack")
	static Object[] Interpreter_stringStack;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -492415237
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lbt;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	static class369 field672;
	@ObfuscatedName("ax")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("aq")
	static boolean field664;
	@ObfuscatedName("ay")
	static boolean field665;
	@ObfuscatedName("ba")
	static ArrayList field670;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 260629727
	)
	static int field677;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1600536679
	)
	static int field680;
	@ObfuscatedName("vi")
	@ObfuscatedGetter(
		intValue = 1781614849
	)
	static int field676;

	static {
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		field663 = Math.log(2.0D);
		Interpreter_arrayLengths = new int[5];
		Interpreter_arrays = new int[5][5000];
		Interpreter_intStack = new int[1000];
		Interpreter_stringStack = new Object[1000];
		Interpreter_frameDepth = 0;
		Interpreter_frames = new ScriptFrame[50];
		field672 = new class369();
		Interpreter_calendar = java.util.Calendar.getInstance();
		field664 = false;
		field665 = false;
		field670 = new ArrayList();
		field677 = 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Lhn;",
		garbageValue = "-724431597"
	)
	public static VarbitComposition method1757(int var0) {
		VarbitComposition var1 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0);
			var1 = new VarbitComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			VarbitComposition.VarbitDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "10834"
	)
	public static boolean method1758() {
		return !class335.field3698.isEmpty();
	}
}
