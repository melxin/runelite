import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qy")
public final class class440 {
	@ObfuscatedName("ap")
	@Export("base37Table")
	static final char[] base37Table;
	@ObfuscatedName("aj")
	static long[] field4943;

	static {
		base37Table = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		field4943 = new long[12];

		for (int var0 = 0; var0 < field4943.length; ++var0) {
			field4943[var0] = (long)Math.pow(37.0D, (double)var0);
		}

	}

	@ObfuscatedName("oa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "1464100876"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase();
		short[] var2 = new short[16];
		int var3 = 0;

		for (int var4 = 0; var4 < class550.ItemDefinition_fileCount; ++var4) {
			ItemComposition var9 = SceneTilePaint.ItemDefinition_get(var4);
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) {
				if (var3 >= 250) {
					class518.foundItemIdCount = -1;
					class226.foundItemIds = null;
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

		class226.foundItemIds = var2;
		GameObject.foundItemIndex = 0;
		class518.foundItemIdCount = var3;
		String[] var8 = new String[class518.foundItemIdCount];

		for (int var5 = 0; var5 < class518.foundItemIdCount; ++var5) {
			var8[var5] = SceneTilePaint.ItemDefinition_get(var2[var5]).name;
		}

		GraphicsObject.method1854(var8, class226.foundItemIds);
	}
}
