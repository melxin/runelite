import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bs")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("au")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lxt;"
	)
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;
	@ObfuscatedName("am")
	static final double field634;
	@ObfuscatedName("aj")
	@Export("Interpreter_intLocals")
	static int[] Interpreter_intLocals;
	@ObfuscatedName("ag")
	@Export("Interpreter_objectLocals")
	static Object[] Interpreter_objectLocals;
	@ObfuscatedName("ay")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("ai")
	@Export("Interpreter_objectStack")
	static Object[] Interpreter_objectStack;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1482797897
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Lbc;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	@Export("scriptActiveWidget")
	static Widget scriptActiveWidget;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	static class366 field642;
	@ObfuscatedName("az")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("aw")
	static boolean field629;
	@ObfuscatedName("af")
	static boolean field645;
	@ObfuscatedName("an")
	static ArrayList field646;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2010101367
	)
	static int field644;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Lxa;"
	)
	@Export("options_buttons_0Sprite")
	static IndexedSprite options_buttons_0Sprite;
	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "Lru;"
	)
	@Export("fontPlain11")
	static Font fontPlain11;
	@ObfuscatedName("lb")
	@Export("worldHost")
	static String worldHost;

	static {
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		field634 = Math.log(2.0D);
		Interpreter_intStack = new int[1000];
		Interpreter_objectStack = new Object[1000];
		Interpreter_frameDepth = 0;
		Interpreter_frames = new ScriptFrame[50];
		field642 = new class366();
		Interpreter_calendar = java.util.Calendar.getInstance();
		field629 = false;
		field645 = false;
		field646 = new ArrayList();
		field644 = 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([BB)Llf;",
		garbageValue = "0"
	)
	static WorldMapSprite method1733(byte[] var0) {
		return var0 == null ? new WorldMapSprite() : new WorldMapSprite(class177.readSpritePixelsFromBytes(var0).pixels);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lce;",
		garbageValue = "41"
	)
	@Export("getScript")
	static Script getScript(int var0, int var1) {
		Script var2 = (Script)Script.Script_cached.get((long)(var0 << 16));
		if (var2 != null) {
			return var2;
		} else {
			String var3 = String.valueOf(var0);
			int var4 = Canvas.archive12.getGroupId(var3);
			if (var4 == -1) {
				return null;
			} else {
				byte[] var5 = Canvas.archive12.takeFileFlat(var4);
				if (var5 != null) {
					if (var5.length <= 1) {
						return null;
					}

					var2 = class70.newScript(var5);
					if (var2 != null) {
						Script.Script_cached.put(var2, (long)(var0 << 16));
						return var2;
					}
				}

				return null;
			}
		}
	}
}
