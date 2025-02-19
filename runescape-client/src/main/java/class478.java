import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sk")
public final class class478 implements Comparable {
	@ObfuscatedName("qd")
	@ObfuscatedSignature(
		descriptor = "Lvv;"
	)
	static class550 field5096;
	@ObfuscatedName("ab")
	Object field5095;
	@ObfuscatedName("ay")
	Object field5091;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		longValue = 8371277348609302149L
	)
	long field5092;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		longValue = -4383044295174628915L
	)
	long field5093;

	class478(Object var1, Object var2) {
		this.field5095 = var1;
		this.field5091 = var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lsk;B)I",
		garbageValue = "1"
	)
	int method9056(class478 var1) {
		if (this.field5093 < var1.field5093) {
			return -1;
		} else {
			return this.field5093 > var1.field5093 ? 1 : 0;
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof class478) {
			return this.field5091.equals(((class478)var1).field5091);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public int hashCode() {
		return this.field5091.hashCode();
	}

	public int compareTo(Object var1) {
		return this.method9056((class478)var1);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "1588214400"
	)
	@Export("SpriteBuffer_decode")
	public static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		var1.field5570 = var0.length - 2;
		class561.SpriteBuffer_spriteCount = var1.readUnsignedShort();
		Canvas.SpriteBuffer_xOffsets = new int[class561.SpriteBuffer_spriteCount];
		class194.SpriteBuffer_yOffsets = new int[class561.SpriteBuffer_spriteCount];
		SpriteBufferProperties.SpriteBuffer_spriteWidths = new int[class561.SpriteBuffer_spriteCount];
		class456.SpriteBuffer_spriteHeights = new int[class561.SpriteBuffer_spriteCount];
		SpriteBufferProperties.SpriteBuffer_pixels = new byte[class561.SpriteBuffer_spriteCount][];
		var1.field5570 = var0.length - 7 - class561.SpriteBuffer_spriteCount * 8;
		SpriteBufferProperties.SpriteBuffer_spriteWidth = var1.readUnsignedShort();
		SpriteBufferProperties.SpriteBuffer_spriteHeight = var1.readUnsignedShort();
		int var2 = (var1.readUnsignedByte() & 255) + 1;

		int var3;
		for (var3 = 0; var3 < class561.SpriteBuffer_spriteCount; ++var3) {
			Canvas.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class561.SpriteBuffer_spriteCount; ++var3) {
			class194.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class561.SpriteBuffer_spriteCount; ++var3) {
			SpriteBufferProperties.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class561.SpriteBuffer_spriteCount; ++var3) {
			class456.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.field5570 = var0.length - 7 - class561.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3;
		DbTable.SpriteBuffer_spritePalette = new int[var2];

		for (var3 = 1; var3 < var2; ++var3) {
			DbTable.SpriteBuffer_spritePalette[var3] = var1.readMedium();
			if (DbTable.SpriteBuffer_spritePalette[var3] == 0) {
				DbTable.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.field5570 = 0;

		for (var3 = 0; var3 < class561.SpriteBuffer_spriteCount; ++var3) {
			int var4 = SpriteBufferProperties.SpriteBuffer_spriteWidths[var3];
			int var5 = class456.SpriteBuffer_spriteHeights[var3];
			int var6 = var5 * var4;
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
						var7[var9 + var4 * var10] = var1.readByte();
					}
				}
			}
		}

	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "96"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (AbstractWorldMapIcon.clientPreferences.getSoundEffectsVolume() != 0 && var1 != 0 && Client.soundEffectCount < 50) {
			Client.soundEffectIds[Client.soundEffectCount] = var0;
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1;
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2;
			Client.soundEffects[Client.soundEffectCount] = null;
			Client.soundLocations[Client.soundEffectCount] = 0;
			Client.field772[Client.soundEffectCount] = 0;
			++Client.soundEffectCount;
		}

	}

	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "1535"
	)
	static void method9065() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) {
			int var1 = var0.group;
			if (class376.widgetDefinition.loadInterface(var1)) {
				boolean var2 = true;
				Widget[] var3 = class376.widgetDefinition.Widget_interfaceComponents[var1];

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) {
					if (var3[var4] != null) {
						var2 = var3[var4].isIf3;
						break;
					}
				}

				if (!var2) {
					var4 = (int)var0.key;
					Widget var5 = class376.widgetDefinition.method6918(var4);
					if (var5 != null) {
						MilliClock.invalidateWidget(var5);
					}
				}
			}
		}

	}
}
