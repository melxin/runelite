import java.util.HashMap;
import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mc")
public final class class332 {
	@ObfuscatedName("ag")
	static final HashMap field3836;

	static {
		field3836 = new HashMap();
		java.util.Calendar.getInstance(method7064("Europe/London"));
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/util/TimeZone;",
		garbageValue = "-1871173999"
	)
	static TimeZone method7064(String var0) {
		synchronized(field3836) {
			TimeZone var2 = (TimeZone)field3836.get(var0);
			if (var2 == null) {
				var2 = TimeZone.getTimeZone(var0);
				field3836.put(var0, var2);
			}

			return var2;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lcb;I)V",
		garbageValue = "-381107610"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		class163.runScript(var0, 500000, 475000);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1279080979"
	)
	static void method7066() {
		class421.field5084 = new int[2000];
		int var0 = 0;
		int var1 = 240;

		int var3;
		for (byte var2 = 12; var0 < 16; var1 -= var2) {
			var3 = class179.method4208((double)((float)var1 / 360.0F), 0.9998999834060669D, (double)(0.075F + (float)var0 * 0.425F / 16.0F));
			class421.field5084[var0] = var3;
			++var0;
		}

		var1 = 48;

		for (int var5 = var1 / 6; var0 < class421.field5084.length; var1 -= var5) {
			var3 = var0 * 2;

			for (int var4 = class179.method4208((double)((float)var1 / 360.0F), 0.9998999834060669D, 0.5D); var0 < var3 && var0 < class421.field5084.length; ++var0) {
				class421.field5084[var0] = var4;
			}
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[IS)V",
		garbageValue = "-2597"
	)
	public static void method7071(String[] var0, int[] var1) {
		class27.quicksortStringsWithCorrespondingIntegers(var0, var1, 0, var0.length - 1);
	}
}
