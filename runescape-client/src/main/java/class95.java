import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dj")
public class class95 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	static final class95 field1154;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	static final class95 field1151;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	static final class95 field1162;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	static final class95 field1152;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	static final class95 field1153;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	static final class95 field1157;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	static final class95 field1156;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	static final class95 field1150;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	static final class95 field1158;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	static final class95 field1159;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	static final class95 field1160;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	static final class95 field1164;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	static final class95 field1167;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	static final class95 field1163;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	static final class95 field1161;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	static final class95 field1165;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	static final class95 field1166;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	static final class95 field1155;

	static {
		field1154 = new class95();
		field1151 = new class95();
		field1162 = new class95();
		field1152 = new class95();
		field1153 = new class95();
		field1157 = new class95();
		field1156 = new class95();
		field1150 = new class95();
		field1158 = new class95();
		field1159 = new class95();
		field1160 = new class95();
		field1164 = new class95();
		field1167 = new class95();
		field1163 = new class95();
		field1161 = new class95();
		field1165 = new class95();
		field1166 = new class95();
		field1155 = new class95();
	}

	class95() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "10"
	)
	static final boolean method2586(int var0) {
		return var0 == 1002 || var0 == 1003 || var0 == 1004;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "-56"
	)
	@Export("SpriteBuffer_decode")
	static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		var1.offset = var0.length - 2;
		SpriteBufferProperties.SpriteBuffer_spriteCount = var1.readUnsignedShort();
		SpriteBufferProperties.SpriteBuffer_xOffsets = new int[SpriteBufferProperties.SpriteBuffer_spriteCount];
		HttpResponse.SpriteBuffer_yOffsets = new int[SpriteBufferProperties.SpriteBuffer_spriteCount];
		SpriteBufferProperties.SpriteBuffer_spriteWidths = new int[SpriteBufferProperties.SpriteBuffer_spriteCount];
		WorldMapCacheName.SpriteBuffer_spriteHeights = new int[SpriteBufferProperties.SpriteBuffer_spriteCount];
		SpriteBufferProperties.SpriteBuffer_pixels = new byte[SpriteBufferProperties.SpriteBuffer_spriteCount][];
		var1.offset = var0.length - 7 - SpriteBufferProperties.SpriteBuffer_spriteCount * 8;
		SpriteBufferProperties.SpriteBuffer_spriteWidth = var1.readUnsignedShort();
		SecureRandomFuture.SpriteBuffer_spriteHeight = var1.readUnsignedShort();
		int var2 = (var1.readUnsignedByte() & 255) + 1;

		int var3;
		for (var3 = 0; var3 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var3) {
			SpriteBufferProperties.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var3) {
			HttpResponse.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var3) {
			SpriteBufferProperties.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var3) {
			WorldMapCacheName.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - SpriteBufferProperties.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3;
		class140.SpriteBuffer_spritePalette = new int[var2];

		for (var3 = 1; var3 < var2; ++var3) {
			class140.SpriteBuffer_spritePalette[var3] = var1.readMedium();
			if (class140.SpriteBuffer_spritePalette[var3] == 0) {
				class140.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0;

		for (var3 = 0; var3 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var3) {
			int var4 = SpriteBufferProperties.SpriteBuffer_spriteWidths[var3];
			int var5 = WorldMapCacheName.SpriteBuffer_spriteHeights[var3];
			int var6 = var4 * var5;
			byte[] var7 = new byte[var6];
			SpriteBufferProperties.SpriteBuffer_pixels[var3] = var7;
			int var8 = var1.readUnsignedByte();
			int var9;
			if (var8 == 0) {
				for (var9 = 0; var9 < var6; ++var9) {
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) {
				for (var9 = 0; var9 < var4; ++var9) {
					for (int var10 = 0; var10 < var5; ++var10) {
						var7[var9 + var10 * var4] = var1.readByte();
					}
				}
			}
		}

	}
}
