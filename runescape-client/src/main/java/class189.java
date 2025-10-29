import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hx")
public class class189 {
	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	@Export("archive4")
	static Archive archive4;
	@ObfuscatedName("op")
	@ObfuscatedSignature(
		descriptor = "Lvj;"
	)
	static Fonts field2051;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Liz;",
		garbageValue = "1974749890"
	)
	public static FloorOverlayDefinition method4415(int var0) {
		FloorOverlayDefinition var1 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var0);
			var1 = new FloorOverlayDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode();
			FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-33"
	)
	public static void method4412(boolean var0) {
		if (var0 != TileItem.ItemDefinition_inMembersWorld) {
			ItemComposition.ItemDefinition_cached.clear();
			ItemComposition.ItemDefinition_cachedModels.clear();
			ItemComposition.ItemDefinition_cachedSprites.clear();
			TileItem.ItemDefinition_inMembersWorld = var0;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ldk;I)I",
		garbageValue = "451420728"
	)
	static int method4414(RawPcmStream var0) {
		return var0 != null ? var0.method3287() : 0;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1836679532"
	)
	@Export("isAlphaNumeric")
	public static boolean isAlphaNumeric(char var0) {
		return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}
}
