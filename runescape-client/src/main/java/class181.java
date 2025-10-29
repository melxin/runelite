import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gr")
public class class181 extends DualNode {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("field1915")
	public static EvictingDualNodeHashTable field1915;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lrl;"
	)
	static Bounds field1964;

	static {
		field1915 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Lhm;",
		garbageValue = "286277246"
	)
	@Export("SpotAnimationDefinition_get")
	public static SpotAnimationDefinition SpotAnimationDefinition_get(int var0) {
		SpotAnimationDefinition var1 = (SpotAnimationDefinition)SpotAnimationDefinition.SpotAnimationDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = SpotAnimationDefinition.field2199.takeFile(13, var0);
			var1 = new SpotAnimationDefinition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "([BI)Lsu;",
		garbageValue = "16777215"
	)
	public static Font method4292(byte[] var0) {
		if (var0 == null) {
			return null;
		} else {
			Font var1 = new Font(var0, class615.SpriteBuffer_xOffsets, class615.SpriteBuffer_yOffsets, IntHashTable.SpriteBuffer_spriteWidths, class615.SpriteBuffer_spriteHeights, BufferedSource.SpriteBuffer_spritePalette, class320.SpriteBuffer_pixels);
			class615.SpriteBuffer_xOffsets = null;
			class615.SpriteBuffer_yOffsets = null;
			IntHashTable.SpriteBuffer_spriteWidths = null;
			class615.SpriteBuffer_spriteHeights = null;
			BufferedSource.SpriteBuffer_spritePalette = null;
			class320.SpriteBuffer_pixels = null;
			return var1;
		}
	}
}
