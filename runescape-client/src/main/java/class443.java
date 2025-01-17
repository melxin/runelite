import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("re")
public class class443 extends SongTask {
	@ObfuscatedName("ay")
	ArrayList field4856;

	@ObfuscatedSignature(
		descriptor = "(Lrh;Ljava/util/ArrayList;)V"
	)
	public class443(SongTask var1, ArrayList var2) {
		super(var1);
		super.field4868 = "ClearRequestTask";
		this.field4856 = var2;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1892560666"
	)
	public boolean vmethod8883() {
		if (this.field4856.isEmpty()) {
			return true;
		} else {
			Iterator var1 = this.field4856.iterator();

			while (var1.hasNext()) {
				MidiRequest var2 = (MidiRequest)var1.next();

				try {
					if (class333.midiRequests.contains(var2)) {
						if (var2 == null) {
							class333.midiRequests.remove(var2);
						} else {
							if (var2.midiPcmStream.field3668 > 0) {
								--var2.midiPcmStream.field3668;
							}

							if (var2.midiPcmStream.field3668 == 0) {
								var2.midiPcmStream.clear();
								var2.midiPcmStream.method6714();
								var2.midiPcmStream.setPcmStreamVolume(0);
							}

							int var3 = var2.musicTrackGroupId;
							int var4 = var2.musicTrackFileId;
							Iterator var5 = class333.field3627.iterator();

							while (var5.hasNext()) {
								class339 var6 = (class339)var5.next();
								var6.vmethod6894(var3, var4);
							}

							class333.midiRequests.remove(var2);
						}
					}
				} catch (Exception var8) {
					class255.RunException_sendStackTrace((String)null, var8);
					this.method8861(var8.getMessage());
					class333.midiRequests.clear();
					return true;
				}
			}

			return true;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "1336812875"
	)
	@Export("SpriteBuffer_decode")
	static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		var1.offset = var0.length - 2;
		SpriteBufferProperties.SpriteBuffer_spriteCount = var1.readUnsignedShort();
		class241.SpriteBuffer_xOffsets = new int[SpriteBufferProperties.SpriteBuffer_spriteCount];
		SpriteBufferProperties.SpriteBuffer_yOffsets = new int[SpriteBufferProperties.SpriteBuffer_spriteCount];
		SpriteBufferProperties.SpriteBuffer_spriteWidths = new int[SpriteBufferProperties.SpriteBuffer_spriteCount];
		class403.SpriteBuffer_spriteHeights = new int[SpriteBufferProperties.SpriteBuffer_spriteCount];
		class240.SpriteBuffer_pixels = new byte[SpriteBufferProperties.SpriteBuffer_spriteCount][];
		var1.offset = var0.length - 7 - SpriteBufferProperties.SpriteBuffer_spriteCount * 8;
		SpriteBufferProperties.SpriteBuffer_spriteWidth = var1.readUnsignedShort();
		class174.SpriteBuffer_spriteHeight = var1.readUnsignedShort();
		int var2 = (var1.readUnsignedByte() & 255) + 1;

		int var3;
		for (var3 = 0; var3 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var3) {
			class241.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var3) {
			SpriteBufferProperties.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var3) {
			SpriteBufferProperties.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var3) {
			class403.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - SpriteBufferProperties.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3;
		KeyHandler.SpriteBuffer_spritePalette = new int[var2];

		for (var3 = 1; var3 < var2; ++var3) {
			KeyHandler.SpriteBuffer_spritePalette[var3] = var1.readMedium();
			if (KeyHandler.SpriteBuffer_spritePalette[var3] == 0) {
				KeyHandler.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0;

		for (var3 = 0; var3 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var3) {
			int var4 = SpriteBufferProperties.SpriteBuffer_spriteWidths[var3];
			int var5 = class403.SpriteBuffer_spriteHeights[var3];
			int var6 = var5 * var4;
			byte[] var7 = new byte[var6];
			class240.SpriteBuffer_pixels[var3] = var7;
			int var8 = var1.readUnsignedByte();
			int var9;
			if (var8 == 0) {
				for (var9 = 0; var9 < var6; ++var9) {
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) {
				for (var9 = 0; var9 < var4; ++var9) {
					for (int var10 = 0; var10 < var5; ++var10) {
						var7[var9 + var4 * var10] = var1.readByte();
					}
				}
			}
		}

	}
}
