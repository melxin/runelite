import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("ka")
public class class269 extends Node {
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -38709149
	)
	public int field3055;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 366055703
	)
	public int field3056;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -319439607
	)
	public int field3060;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lnh;"
	)
	public Widget field3058;

	@ObfuscatedSignature(
		descriptor = "(IIILnh;)V"
	)
	public class269(int var1, int var2, int var3, Widget var4) {
		this.field3060 = var1;
		this.field3055 = var2;
		this.field3056 = var3;
		this.field3058 = var4;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1400526196"
	)
	public static int method5665(int var0) {
		return class519.field5291[var0 & 16383];
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Lcr;",
		garbageValue = "0"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? World.World_worlds[++World.World_listCount - 1] : null;
	}

	@ObfuscatedName("oj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "889039084"
	)
	static void method5663(String var0) {
		SecureRandomFuture.field1003 = var0;

		try {
			String var1 = SecureRandomCallable.client.getParameter(Integer.toString(18));
			String var2 = SecureRandomCallable.client.getParameter(Integer.toString(13));
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2;
			String var5;
			if (var0.isEmpty()) {
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				String var4 = var3 + "; Expires=";
				long var6 = class282.method5908() + 94608000000L;
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

			Client var16 = SecureRandomCallable.client;
			var5 = "document.cookie=\"" + var3 + "\"";
			JSObject.getWindow(var16).eval(var5);
		} catch (Throwable var15) {
		}

	}
}
