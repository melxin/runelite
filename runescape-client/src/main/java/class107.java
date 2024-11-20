import java.util.Date;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("en")
public class class107 {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1075498559
	)
	static int field1369;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -2101626321
	)
	int field1370;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1024308975
	)
	int field1374;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 409985969
	)
	int field1371;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1048722379
	)
	int field1372;

	class107(int var1, int var2, int var3, int var4) {
		this.field1370 = var1;
		this.field1374 = var2;
		this.field1371 = var3;
		this.field1372 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1100448072"
	)
	int method2968() {
		return this.field1370;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "14"
	)
	int method2969() {
		return this.field1374;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "651131888"
	)
	int method2970() {
		return this.field1371;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1859263197"
	)
	int method2971() {
		return this.field1372;
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(Lmc;I)V",
		garbageValue = "-185550320"
	)
	static void method2981(PacketBufferNode var0) {
		var0.packetBuffer.writeIntLE(class450.archive12.hash);
		var0.packetBuffer.writeIntLE(Language.field4688.hash);
		var0.packetBuffer.writeIntLE(class309.archive9.hash);
		var0.packetBuffer.writeIntME(ViewportMouse.field2903.hash);
		var0.packetBuffer.writeIntLE(class204.field2110.hash);
		var0.packetBuffer.writeIntLE(0);
		var0.packetBuffer.writeIntME(class171.field1814.hash);
		var0.packetBuffer.writeIntME(AbstractArchive.field4596.hash);
		var0.packetBuffer.writeIntME(WorldMapCacheName.archive4.hash);
		var0.packetBuffer.writeInt(GameEngine.archive2.hash);
		var0.packetBuffer.writeIntLE(class483.field5042.hash);
		var0.packetBuffer.writeInt(class419.field4733.hash);
		var0.packetBuffer.writeIntME(class390.field4572.hash);
		var0.packetBuffer.writeIntIME(UserComparator10.field1505.hash);
	}

	@ObfuscatedName("oz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1721967107"
	)
	static void method2973(String var0) {
		class141.field1630 = var0;

		try {
			String var1 = NpcOverrides.client.getParameter(Integer.toString(18));
			String var2 = NpcOverrides.client.getParameter(Integer.toString(13));
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2;
			String var5;
			if (var0.length() == 0) {
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				String var4 = var3 + "; Expires=";
				long var6 = class59.method1150() + 94608000000L;
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

			Client var16 = NpcOverrides.client;
			var5 = "document.cookie=\"" + var3 + "\"";
			JSObject.getWindow(var16).eval(var5);
		} catch (Throwable var15) {
		}

	}
}
