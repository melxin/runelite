import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("xs")
public class class598 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1619582201
	)
	public final int field6048;
	@ObfuscatedName("at")
	public Object field6046;

	public class598(int var1) {
		this.field6048 = var1;
	}

	public class598(int var1, Object var2) {
		this.field6048 = var1;
		this.field6046 = var2;
	}

	public int hashCode() {
		return super.hashCode();
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class598)) {
			return false;
		} else {
			class598 var2 = (class598)var1;
			if (var2.field6046 == null && this.field6046 != null) {
				return false;
			} else if (this.field6046 == null && var2.field6046 != null) {
				return false;
			} else {
				return this.field6048 == var2.field6048 && var2.field6046.equals(this.field6046);
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Lxc;",
		garbageValue = "-896183514"
	)
	static IndexedSprite method11717() {
		IndexedSprite var0 = new IndexedSprite();
		var0.width = class604.SpriteBuffer_spriteWidth;
		var0.height = class604.SpriteBuffer_spriteHeight;
		var0.xOffset = class604.SpriteBuffer_xOffsets[0];
		var0.yOffset = class604.SpriteBuffer_yOffsets[0];
		var0.subWidth = class604.SpriteBuffer_spriteWidths[0];
		var0.subHeight = ItemContainer.SpriteBuffer_spriteHeights[0];
		var0.palette = class604.SpriteBuffer_spritePalette;
		var0.pixels = class604.SpriteBuffer_pixels[0];
		class366.method7888();
		return var0;
	}
}
