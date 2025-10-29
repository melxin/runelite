import java.util.Calendar;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ae")
public final class class4 {
	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "Lul;"
	)
	static class533 field4;
	@ObfuscatedName("pb")
	@ObfuscatedGetter(
		intValue = -1781017119
	)
	@Export("oculusOrbFocalPointY")
	static int oculusOrbFocalPointY;

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Date;I)Z",
		garbageValue = "-848273070"
	)
	static boolean method17(Date var0) {
		Calendar var2 = Calendar.getInstance();
		var2.set(2, 0);
		var2.set(5, 1);
		var2.set(1, 1900);
		Date var1 = var2.getTime();
		return var0.after(var1);
	}

	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "-61"
	)
	@Export("formatItemStacks")
	static final String formatItemStacks(int var0) {
		String var1 = Integer.toString(var0);

		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
			var1 = var1.substring(0, var2) + "," + var1.substring(var2);
		}

		if (var1.length() > 9) {
			return " " + class144.colorStartTag(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
		} else {
			return var1.length() > 6 ? " " + class144.colorStartTag(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + class144.colorStartTag(16776960) + var1 + "</col>";
		}
	}
}
