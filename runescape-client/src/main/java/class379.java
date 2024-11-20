import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("om")
public class class379 {
	@ObfuscatedName("ao")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;
	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("widgetDefinition")
	static WidgetDefinition widgetDefinition;

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-161328997"
	)
	static void method7475() {
		class354.field3791 = new int[2000];
		int var0 = 0;
		int var1 = 240;

		int var3;
		for (byte var2 = 12; var0 < 16; var1 -= var2) {
			var3 = Client.method1517((double)((float)var1 / 360.0F), 0.9998999834060669D, (double)(0.075F + 0.425F * (float)var0 / 16.0F));
			class354.field3791[var0] = var3;
			++var0;
		}

		var1 = 48;

		for (int var5 = var1 / 6; var0 < class354.field3791.length; var1 -= var5) {
			var3 = var0 * 2;

			for (int var4 = Client.method1517((double)((float)var1 / 360.0F), 0.9998999834060669D, 0.5D); var0 < var3 && var0 < class354.field3791.length; ++var0) {
				class354.field3791[var0] = var4;
			}
		}

	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(Loa;Ljava/lang/String;B)V",
		garbageValue = "2"
	)
	static void method7476(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1);
		Client.archiveLoaders.add(var2);
		Client.field549 += var2.groupCount;
	}

	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "113232182"
	)
	@Export("formatItemStacks")
	static final String formatItemStacks(int var0) {
		String var1 = Integer.toString(var0);

		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
			var1 = var1.substring(0, var2) + "," + var1.substring(var2);
		}

		if (var1.length() > 9) {
			return " " + class438.colorStartTag(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
		} else {
			return var1.length() > 6 ? " " + class438.colorStartTag(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + class438.colorStartTag(16776960) + var1 + "</col>";
		}
	}
}
