import java.util.BitSet;
import java.util.Date;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("nb")
public class class348 extends Node {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1931916443
	)
	int field3816;
	@ObfuscatedName("ay")
	BitSet field3817;

	class348(int var1) {
		this.field3816 = var1;
		this.field3817 = new BitSet(128);
	}

	@ObfuscatedName("on")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "93"
	)
	static void method6848(String var0) {
		Sound.field1770 = var0;

		try {
			String var1 = class569.client.getParameter(Integer.toString(18));
			String var2 = class569.client.getParameter(Integer.toString(13));
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2;
			String var5;
			if (var0.length() == 0) {
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				String var4 = var3 + "; Expires=";
				long var6 = InterfaceParent.method2434() + 94608000000L;
				Calendar.Calendar_calendar.setTime(new Date(var6));
				int var8 = Calendar.Calendar_calendar.get(7);
				int var9 = Calendar.Calendar_calendar.get(5);
				int var10 = Calendar.Calendar_calendar.get(2);
				int var11 = Calendar.Calendar_calendar.get(1);
				int var12 = Calendar.Calendar_calendar.get(11);
				int var13 = Calendar.Calendar_calendar.get(12);
				int var14 = Calendar.Calendar_calendar.get(13);
				var5 = Calendar.DAYS_OF_THE_WEEK[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + Calendar.MONTH_NAMES_ENGLISH_GERMAN[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
				var3 = var4 + var5 + "; Max-Age=" + 94608000L;
			}

			Client var16 = class569.client;
			var5 = "document.cookie=\"" + var3 + "\"";
			JSObject.getWindow(var16).eval(var5);
		} catch (Throwable var15) {
		}

	}
}
