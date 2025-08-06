import java.util.HashMap;
import java.util.TimeZone;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("me")
public final class class331 {
	@ObfuscatedName("ac")
	static final HashMap field3733;

	static {
		field3733 = new HashMap();
		TimeZone var0;
		synchronized(field3733) {
			TimeZone var2 = (TimeZone)field3733.get("Europe/London");
			if (var2 == null) {
				var2 = TimeZone.getTimeZone("Europe/London");
				field3733.put("Europe/London", var2);
			}

			var0 = var2;
		}

		java.util.Calendar.getInstance(var0);
	}

	@ObfuscatedName("al")
	static boolean method7039(long var0) {
		int var2 = (int)(var0 >>> 16 & 7L);
		return var2 == 2;
	}
}
