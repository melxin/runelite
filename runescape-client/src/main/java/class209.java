import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("if")
public class class209 extends DualNode {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("field2136")
	public static EvictingDualNodeHashTable field2136;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	@Export("WorldMapElement_archive")
	static AbstractArchive WorldMapElement_archive;

	static {
		field2136 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1148857744"
	)
	@Export("ItemContainer_getCount")
	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Lxm;",
		garbageValue = "35"
	)
	static IndexedSprite method4666() {
		IndexedSprite var0 = new IndexedSprite();
		var0.width = class208.SpriteBuffer_spriteWidth;
		var0.height = class144.SpriteBuffer_spriteHeight;
		var0.xOffset = class615.SpriteBuffer_xOffsets[0];
		var0.yOffset = class615.SpriteBuffer_yOffsets[0];
		var0.subWidth = IntHashTable.SpriteBuffer_spriteWidths[0];
		var0.subHeight = class615.SpriteBuffer_spriteHeights[0] * 449044205;
		var0.palette = BufferedSource.SpriteBuffer_spritePalette;
		var0.pixels = class320.SpriteBuffer_pixels[0];
		class615.SpriteBuffer_xOffsets = null;
		class615.SpriteBuffer_yOffsets = null;
		IntHashTable.SpriteBuffer_spriteWidths = null;
		class615.SpriteBuffer_spriteHeights = null;
		BufferedSource.SpriteBuffer_spritePalette = null;
		class320.SpriteBuffer_pixels = null;
		return var0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-4"
	)
	public static int method4664(int var0) {
		if (var0 > 0) {
			return 1;
		} else {
			return var0 < 0 ? -1 : 0;
		}
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(ILcu;ZB)I",
		garbageValue = "99"
	)
	static int method4665(int var0, Script var1, boolean var2) {
		if (var0 == 13337) {
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Interpreter.field615;
			return 1;
		} else {
			return 2;
		}
	}
}
