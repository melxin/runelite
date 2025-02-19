import java.util.HashMap;
import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("me")
public final class class330 {
	@ObfuscatedName("au")
	static final HashMap field3664;
	@ObfuscatedName("ae")
	@Export("Tiles_hueMultiplier")
	static int[] Tiles_hueMultiplier;

	static {
		field3664 = new HashMap();
		java.util.Calendar.getInstance(method6521("Europe/London"));
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/util/TimeZone;",
		garbageValue = "1442757006"
	)
	static TimeZone method6521(String var0) {
		synchronized(field3664) {
			TimeZone var2 = (TimeZone)field3664.get(var0);
			if (var2 == null) {
				var2 = TimeZone.getTimeZone(var0);
				field3664.put(var0, var2);
			}

			return var2;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Lvg;",
		garbageValue = "1269816920"
	)
	public static class555 method6526(int var0) {
		int var1 = class553.field5488[var0];
		if (var1 == 1) {
			return class555.field5495;
		} else if (var1 == 2) {
			return class555.field5492;
		} else {
			return var1 == 3 ? class555.field5491 : null;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2121671807"
	)
	public static void method6523(int var0) {
		MouseHandler.MouseHandler_idleCycles = var0;
	}
}
