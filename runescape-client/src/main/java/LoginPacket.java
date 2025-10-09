import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fe")
@Implements("LoginPacket")
public class LoginPacket extends class150 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = 2388692783052772727L
	)
	long field1763;
	@ObfuscatedName("at")
	String field1762;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	LoginPacket(class153 var1) {
		this.this$0 = var1;
		this.field1763 = -1L;
		this.field1762 = null;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "1804820754"
	)
	void vmethod4162(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1763 = var1.readLong();
		}

		this.field1762 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lgh;I)V",
		garbageValue = "1850606911"
	)
	void vmethod4163(ClanSettings var1) {
		var1.method3987(this.field1763, this.field1762, 0);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)Lxl;",
		garbageValue = "59"
	)
	static SpritePixels method3890() {
		SpritePixels var0 = new SpritePixels();
		var0.width = class604.SpriteBuffer_spriteWidth;
		var0.height = class604.SpriteBuffer_spriteHeight;
		var0.xOffset = class604.SpriteBuffer_xOffsets[0];
		var0.yOffset = class604.SpriteBuffer_yOffsets[0];
		var0.subWidth = class604.SpriteBuffer_spriteWidths[0];
		var0.subHeight = ItemContainer.SpriteBuffer_spriteHeights[0];
		int var1 = var0.subWidth * var0.subHeight;
		byte[] var2 = class604.SpriteBuffer_pixels[0];
		var0.pixels = new int[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			var0.pixels[var3] = class604.SpriteBuffer_spritePalette[var2[var3] & 255];
		}

		class366.method7888();
		return var0;
	}
}
