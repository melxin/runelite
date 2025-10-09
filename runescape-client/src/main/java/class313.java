import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mx")
public abstract class class313 implements class315 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -726288089
	)
	protected int field3525;

	@ObfuscatedSignature(
		descriptor = "(Loh;Lqd;I)V"
	)
	protected class313(StudioGame var1, Language var2, int var3) {
		this.field3525 = var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)[Lxc;",
		garbageValue = "1681570784"
	)
	public static IndexedSprite[] method6975() {
		IndexedSprite[] var0 = new IndexedSprite[class604.SpriteBuffer_spriteCount];

		for (int var1 = 0; var1 < class604.SpriteBuffer_spriteCount; ++var1) {
			IndexedSprite var2 = var0[var1] = new IndexedSprite();
			var2.width = class604.SpriteBuffer_spriteWidth;
			var2.height = class604.SpriteBuffer_spriteHeight;
			var2.xOffset = class604.SpriteBuffer_xOffsets[var1];
			var2.yOffset = class604.SpriteBuffer_yOffsets[var1];
			var2.subWidth = class604.SpriteBuffer_spriteWidths[var1];
			var2.subHeight = ItemContainer.SpriteBuffer_spriteHeights[var1];
			var2.palette = class604.SpriteBuffer_spritePalette;
			var2.pixels = class604.SpriteBuffer_pixels[var1];
		}

		class366.method7888();
		return var0;
	}
}
