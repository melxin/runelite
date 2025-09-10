import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rt")
public final class class447 {
	@ObfuscatedName("af")
	@Export("base37Table")
	public static final char[] base37Table;
	@ObfuscatedName("aw")
	static long[] field5150;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "[Lxc;"
	)
	@Export("runesSprite")
	static IndexedSprite[] runesSprite;

	static {
		base37Table = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		field5150 = new long[12];

		for (int var0 = 0; var0 < field5150.length; ++var0) {
			field5150[var0] = (long)Math.pow(37.0D, (double)var0);
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Lxc;",
		garbageValue = "-21"
	)
	public static IndexedSprite method8930() {
		IndexedSprite var0 = new IndexedSprite();
		var0.width = class606.SpriteBuffer_spriteWidth;
		var0.height = class581.SpriteBuffer_spriteHeight;
		var0.xOffset = LoginPacket.SpriteBuffer_xOffsets[0];
		var0.yOffset = class191.SpriteBuffer_yOffsets[0];
		var0.subWidth = class255.SpriteBuffer_spriteWidths[0];
		var0.subHeight = FriendLoginUpdate.SpriteBuffer_spriteHeights[0];
		var0.palette = TriBool.SpriteBuffer_spritePalette;
		var0.pixels = SpriteBufferProperties.SpriteBuffer_pixels[0];
		class388.method8205();
		return var0;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lti;Lti;IIII)V",
		garbageValue = "535461303"
	)
	public static void method8929(DynamicArray var0, DynamicArray var1, int var2, int var3, int var4) {
		ItemLayer.method4826(var0, (class574)null, false);
		class574 var5 = var0.field5504;
		ItemLayer.method4826(var1, var5, true);
		int var6 = var0.method10322();
		int var7 = var1.method10322();
		if (var4 == -1) {
			var4 = var0.method10322() - var2;
		}

		if (var4 != 0 && (var1 != var0 || var3 != var2)) {
			if (var2 >= 0 && var2 + var4 <= var6 && var3 >= 0 && var3 + var4 <= var7) {
				class82.method2773(var0, var2, var1, var3, var4);
			} else {
				throw new RuntimeException();
			}
		}
	}
}
