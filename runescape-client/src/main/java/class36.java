import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bu")
public class class36 {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	@Export("reflectionChecks")
	static IterableNodeDeque reflectionChecks;
	@ObfuscatedName("ac")
	static File field217;

	static {
		reflectionChecks = new IterableNodeDeque();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-35"
	)
	static void method710() {
		Tiles.Tiles_minPlane = 99;
		DirectByteArrayCopier.Tiles_underlays = new short[4][104][104];
		WorldEntityCoord.Tiles_overlays = new short[4][104][104];
		class195.Tiles_shapes = new byte[4][104][104];
		class302.field3316 = new byte[4][104][104];
		Varps.field3836 = new int[4][105][105];
		DevicePcmPlayerProvider.Tiles_underlays2 = new byte[4][105][105];
		class543.field5472 = new int[105][105];
		HttpJsonRequestBody.Tiles_hue = new int[104];
		class235.Tiles_saturation = new int[104];
		ScriptEvent.Tiles_lightness = new int[104];
		class28.Tiles_hueMultiplier = new int[104];
		class272.field3094 = new int[104];
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "238111526"
	)
	public static void method711() {
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear();
	}

	@ObfuscatedName("os")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)V",
		garbageValue = "1"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase();
		short[] var2 = new short[16];
		int var3 = 0;

		for (int var4 = 0; var4 < class472.ItemDefinition_fileCount; ++var4) {
			ItemComposition var9 = class231.ItemDefinition_get(var4);
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) {
				if (var3 >= 250) {
					class110.foundItemIdCount = -1;
					class165.foundItemIds = null;
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

		class165.foundItemIds = var2;
		LoginPacket.foundItemIndex = 0;
		class110.foundItemIdCount = var3;
		String[] var8 = new String[class110.foundItemIdCount];

		for (int var5 = 0; var5 < class110.foundItemIdCount; ++var5) {
			var8[var5] = class231.ItemDefinition_get(var2[var5]).name;
		}

		short[] var10 = class165.foundItemIds;
		class330.sortItemsByName(var8, var10, 0, var8.length - 1);
	}
}
