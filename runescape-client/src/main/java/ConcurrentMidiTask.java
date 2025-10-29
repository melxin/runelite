import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sv")
@Implements("ConcurrentMidiTask")
public class ConcurrentMidiTask extends SongTask {
	@ObfuscatedName("av")
	ArrayList field5384;

	@ObfuscatedSignature(
		descriptor = "(Lsz;Ljava/util/ArrayList;)V"
	)
	public ConcurrentMidiTask(SongTask var1, ArrayList var2) {
		super(var1);
		this.field5384 = var2;
		super.field5378 = "ConcurrentMidiTask";
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "111"
	)
	public boolean vmethod9974() {
		for (int var1 = 0; var1 < this.field5384.size(); ++var1) {
			SongTask var2 = (SongTask)this.field5384.get(var1);
			if (var2 == null) {
				this.field5384.remove(var1);
				--var1;
			} else if (var2.vmethod9974()) {
				if (var2.method9961()) {
					this.method9950(var2.method9948());
					this.field5384.clear();
					return true;
				}

				if (var2.method9949() != null) {
					this.field5384.add(var2.method9949());
				}

				super.field5379 = var2.field5379;
				this.field5384.remove(var1);
				--var1;
			}
		}

		if (this.field5384.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-628487630"
	)
	@Export("SpriteBuffer_decode")
	static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		var1.offset = (var0.length - 2) * 1741769013;
		class615.SpriteBuffer_spriteCount = var1.readUnsignedShort();
		class615.SpriteBuffer_xOffsets = new int[class615.SpriteBuffer_spriteCount];
		class615.SpriteBuffer_yOffsets = new int[class615.SpriteBuffer_spriteCount];
		IntHashTable.SpriteBuffer_spriteWidths = new int[class615.SpriteBuffer_spriteCount];
		class615.SpriteBuffer_spriteHeights = new int[class615.SpriteBuffer_spriteCount];
		class320.SpriteBuffer_pixels = new byte[class615.SpriteBuffer_spriteCount][];
		var1.offset = (var0.length - 7 - class615.SpriteBuffer_spriteCount * 8) * 1741769013;
		class208.SpriteBuffer_spriteWidth = var1.readUnsignedShort();
		class144.SpriteBuffer_spriteHeight = var1.readUnsignedShort();
		int var2 = (var1.readUnsignedByte() & 255) + 1;

		int var3;
		for (var3 = 0; var3 < class615.SpriteBuffer_spriteCount; ++var3) {
			class615.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class615.SpriteBuffer_spriteCount; ++var3) {
			class615.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class615.SpriteBuffer_spriteCount; ++var3) {
			IntHashTable.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class615.SpriteBuffer_spriteCount; ++var3) {
			class615.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = (var0.length - 7 - class615.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3) * 1741769013;
		BufferedSource.SpriteBuffer_spritePalette = new int[var2];

		for (var3 = 1; var3 < var2; ++var3) {
			BufferedSource.SpriteBuffer_spritePalette[var3] = var1.readMedium();
			if (BufferedSource.SpriteBuffer_spritePalette[var3] == 0) {
				BufferedSource.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0;

		for (var3 = 0; var3 < class615.SpriteBuffer_spriteCount; ++var3) {
			int var4 = IntHashTable.SpriteBuffer_spriteWidths[var3];
			int var5 = class615.SpriteBuffer_spriteHeights[var3];
			int var6 = var4 * var5;
			byte[] var7 = new byte[var6];
			class320.SpriteBuffer_pixels[var3] = var7;
			int var8 = var1.readUnsignedByte();
			boolean var9 = (var8 & 1) == 1;
			boolean var10 = (var8 & 2) == 2;
			int var11;
			if (!var9) {
				for (var11 = 0; var11 < var6; ++var11) {
					var7[var11] = var1.readByte();
				}
			} else {
				for (var11 = 0; var11 < var4; ++var11) {
					for (int var12 = 0; var12 < var5; ++var12) {
						var7[var11 + var4 * var12] = var1.readByte();
					}
				}
			}

			if (var10) {
				var1.offset += 1741769013 * var6;
			}
		}

	}

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(Ldd;III)V",
		garbageValue = "419251448"
	)
	@Export("updateItemPile3")
	static final void updateItemPile3(WorldView var0, int var1, int var2) {
		class348.updateItemPile2(var0, var0.plane, var1, var2);
	}
}
