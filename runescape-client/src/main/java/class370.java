import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("om")
public class class370 {
	@ObfuscatedName("ol")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "-1021519632"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase();
		short[] var2 = new short[16];
		int var3 = 0;

		for (int var4 = 0; var4 < ItemComposition.ItemDefinition_fileCount; ++var4) {
			ItemComposition var9 = AttackOption.ItemDefinition_get(var4);
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) {
				if (var3 >= 250) {
					ModelData0.foundItemIdCount = -1;
					WorldEntityCoord.foundItemIds = null;
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

		WorldEntityCoord.foundItemIds = var2;
		HttpRequestTask.foundItemIndex = 0;
		ModelData0.foundItemIdCount = var3;
		String[] var8 = new String[ModelData0.foundItemIdCount];

		for (int var5 = 0; var5 < ModelData0.foundItemIdCount; ++var5) {
			var8[var5] = AttackOption.ItemDefinition_get(var2[var5]).name;
		}

		SpotAnimationDefinition.method4404(var8, WorldEntityCoord.foundItemIds);
	}
}
