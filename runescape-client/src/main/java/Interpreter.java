import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("an")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("ae")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("ax")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("ac")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 702679413
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[Lcf;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("aw")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("ai")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("am")
	static boolean field850;
	@ObfuscatedName("ap")
	static boolean field862;
	@ObfuscatedName("ab")
	static ArrayList field863;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1673138457
	)
	static int field864;
	@ObfuscatedName("bb")
	static final double field854;
	@ObfuscatedName("or")
	@ObfuscatedGetter(
		intValue = 1192369403
	)
	static int field866;

	static {
		Interpreter_arrayLengths = new int[5];
		Interpreter_arrays = new int[5][5000];
		Interpreter_intStack = new int[1000];
		Interpreter_stringStack = new String[1000];
		Interpreter_frameDepth = 0;
		Interpreter_frames = new ScriptFrame[50];
		Interpreter_calendar = java.util.Calendar.getInstance();
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		field850 = false;
		field862 = false;
		field863 = new ArrayList();
		field864 = 0;
		field854 = Math.log(2.0D);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-1931393022"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		Script.addChatMessage(var0, var1, var2, (String)null);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-171463991"
	)
	static void method2269() {
		Iterator var0 = Messages.Messages_hashTable.iterator();

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next();
			var1.clearIsFromFriend();
		}

	}
}
