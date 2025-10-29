import java.util.ArrayList;
import java.util.Calendar;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("br")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("ae")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("ap")
	static final double field609;
	@ObfuscatedName("au")
	@Export("Interpreter_objectLocals")
	static Object[] Interpreter_objectLocals;
	@ObfuscatedName("az")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("ai")
	@Export("Interpreter_objectStack")
	static Object[] Interpreter_objectStack;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -444245115
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lbt;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -2113340171
	)
	static int field615;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	static class380 field616;
	@ObfuscatedName("af")
	@Export("Interpreter_calendar")
	static Calendar Interpreter_calendar;
	@ObfuscatedName("ao")
	static boolean field620;
	@ObfuscatedName("aa")
	static boolean field618;
	@ObfuscatedName("aq")
	static ArrayList field621;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -196365427
	)
	static int field608;

	static {
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		field609 = Math.log(2.0D);
		Interpreter_intStack = new int[1000];
		Interpreter_objectStack = new Object[1000];
		Interpreter_frameDepth = 0;
		Interpreter_frames = new ScriptFrame[50];
		field615 = 0;
		field616 = new class380();
		Interpreter_calendar = Calendar.getInstance();
		field620 = false;
		field618 = false;
		field621 = new ArrayList();
		field608 = 0;
	}

	@ObfuscatedName("at")
	static final void method1660(long var0) {
		try {
			Thread.sleep(var0);
		} catch (InterruptedException var3) {
		}

	}
}
