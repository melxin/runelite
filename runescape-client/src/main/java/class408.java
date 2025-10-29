import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pp")
public class class408 {
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -2022221137
	)
	@Export("KitDefinition_fileCount")
	public static int KitDefinition_fileCount;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 327716789
	)
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-473888564"
	)
	public static final void method8493(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) {
			if (Client.rootWidgetXs[var4] + Client.rootWidgetWidths[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetYs[var4] + Client.rootWidgetHeights[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) {
				Client.field523[var4] = true;
			}
		}

	}

	@ObfuscatedName("pz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "-1213394640"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase();
		short[] var2 = new short[16];
		int var3 = 0;

		for (int var4 = 0; var4 < class394.ItemDefinition_fileCount; ++var4) {
			ItemComposition var9 = class150.ItemDefinition_get(var4);
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) {
				if (var3 >= 250) {
					class136.foundItemIdCount = -1;
					class468.foundItemIds = null;
					return;
				}

				if (var3 >= var2.length) {
					short[] var6 = new short[var2.length * 2];

					for (int var7 = 0; var7 < var3; ++var7) {
						var6[var7] = var2[var7];
					}

					var2 = var6;
				}

				var2[var3++] = (short)var4;
			}
		}

		class468.foundItemIds = var2;
		AbstractByteArrayCopier.foundItemIndex = 0;
		class136.foundItemIdCount = var3;
		String[] var8 = new String[class136.foundItemIdCount];

		for (int var5 = 0; var5 < class136.foundItemIdCount; ++var5) {
			var8[var5] = class150.ItemDefinition_get(var2[var5]).name;
		}

		class411.method8513(var8, class468.foundItemIds);
	}
}
