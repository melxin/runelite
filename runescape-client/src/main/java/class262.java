import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ko")
public class class262 extends class268 {
	@ObfuscatedName("al")
	String field3055;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	final class265 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lku;Ljava/lang/String;Ljava/lang/String;)V"
	)
	class262(class265 var1, String var2, String var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field3055 = var3;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "8"
	)
	public int vmethod6032() {
		return 1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1138888908"
	)
	public String vmethod6033() {
		return this.field3055;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "([BS)V",
		garbageValue = "-15300"
	)
	@Export("SpriteBuffer_decode")
	public static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		var1.field5818 = var0.length - 2;
		SpriteBufferProperties.SpriteBuffer_spriteCount = var1.readUnsignedShort();
		SpriteBufferProperties.SpriteBuffer_xOffsets = new int[SpriteBufferProperties.SpriteBuffer_spriteCount];
		class440.SpriteBuffer_yOffsets = new int[SpriteBufferProperties.SpriteBuffer_spriteCount];
		class333.SpriteBuffer_spriteWidths = new int[SpriteBufferProperties.SpriteBuffer_spriteCount];
		Buffer.SpriteBuffer_spriteHeights = new int[SpriteBufferProperties.SpriteBuffer_spriteCount];
		SpriteBufferProperties.SpriteBuffer_pixels = new byte[SpriteBufferProperties.SpriteBuffer_spriteCount][];
		var1.field5818 = var0.length - 7 - SpriteBufferProperties.SpriteBuffer_spriteCount * 8;
		SpriteBufferProperties.SpriteBuffer_spriteWidth = var1.readUnsignedShort();
		SpriteBufferProperties.SpriteBuffer_spriteHeight = var1.readUnsignedShort();
		int var2 = (var1.readUnsignedByte() & 255) + 1;

		int var3;
		for (var3 = 0; var3 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var3) {
			SpriteBufferProperties.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var3) {
			class440.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var3) {
			class333.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var3) {
			Buffer.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.field5818 = var0.length - 7 - SpriteBufferProperties.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3;
		class113.SpriteBuffer_spritePalette = new int[var2];

		for (var3 = 1; var3 < var2; ++var3) {
			class113.SpriteBuffer_spritePalette[var3] = var1.readMedium();
			if (class113.SpriteBuffer_spritePalette[var3] == 0) {
				class113.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.field5818 = 0;

		for (var3 = 0; var3 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var3) {
			int var4 = class333.SpriteBuffer_spriteWidths[var3];
			int var5 = Buffer.SpriteBuffer_spriteHeights[var3];
			int var6 = var5 * var4;
			byte[] var7 = new byte[var6];
			SpriteBufferProperties.SpriteBuffer_pixels[var3] = var7;
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
						var7[var11 + var12 * var4] = var1.readByte();
					}
				}
			}

			if (var10) {
				var1.field5818 += var6;
			}
		}

	}
}
