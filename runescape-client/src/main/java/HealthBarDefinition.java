import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hh")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("HealthBarDefinition_archive")
	static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	static AbstractArchive field2031;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("HealthBarDefinition_cached")
	public static EvictingDualNodeHashTable HealthBarDefinition_cached;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("HealthBarDefinition_cachedSprites")
	public static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -769175921
	)
	static int field2044;
	@ObfuscatedName("lm")
	@ObfuscatedGetter(
		intValue = 701780559
	)
	@Export("worldPort")
	static int worldPort;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 645274507
	)
	public int field2034;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 414350947
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -2081477753
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 445246779
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1828387355
	)
	public int field2040;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1480998725
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1878057051
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1974982281
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1578119937
	)
	@Export("width")
	public int width;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1388582271
	)
	@Export("widthPadding")
	public int widthPadding;

	static {
		HealthBarDefinition_cached = new EvictingDualNodeHashTable(64);
		HealthBarDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
	}

	HealthBarDefinition() {
		this.int1 = 255;
		this.int2 = 255;
		this.int3 = -1;
		this.field2040 = 1;
		this.int5 = 70;
		this.frontSpriteID = -1;
		this.backSpriteID = -1;
		this.width = 30;
		this.widthPadding = 0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "33491820"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lwj;II)V",
		garbageValue = "1454741063"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			var1.readUnsignedShort();
		} else if (var2 == 2) {
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 3) {
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 4) {
			this.int3 = 0;
		} else if (var2 == 5) {
			this.int5 = var1.readUnsignedShort();
		} else if (var2 == 6) {
			var1.readUnsignedByte();
		} else if (var2 == 7) {
			this.frontSpriteID = var1.readNullableLargeSmart();
		} else if (var2 == 8) {
			this.backSpriteID = var1.readNullableLargeSmart();
		} else if (var2 == 11) {
			this.int3 = var1.readUnsignedShort();
		} else if (var2 == 14) {
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) {
			this.widthPadding = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lxl;",
		garbageValue = "-1171719193"
	)
	@Export("getFrontSprite")
	public SpritePixels getFrontSprite() {
		if (this.frontSpriteID < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.frontSpriteID);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class455.SpriteBuffer_getSprite(field2031, this.frontSpriteID, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Lxl;",
		garbageValue = "27"
	)
	@Export("getBackSprite")
	public SpritePixels getBackSprite() {
		if (this.backSpriteID < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.backSpriteID);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class455.SpriteBuffer_getSprite(field2031, this.backSpriteID, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-186124279"
	)
	static void method4316() {
		Tiles.Tiles_underlays = null;
		Tiles.Tiles_overlays = null;
		Frames.Tiles_shapes = null;
		GrandExchangeEvents.field5045 = null;
		MusicPatch.field3967 = null;
		Tiles.Tiles_underlays2 = null;
		SpriteBufferProperties.field24 = null;
		class1.Tiles_hue = null;
		ClanChannel.Tiles_saturation = null;
		class165.Tiles_lightness = null;
		class450.Tiles_hueMultiplier = null;
		Language.field5129 = null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-2045596187"
	)
	public static int method4318(int var0, int var1) {
		int var2 = var1 - var0 & 2047;
		return var2 > 1024 ? -(2048 - var2) : var2;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ldm;Lwj;IIIIIIB)V",
		garbageValue = "8"
	)
	@Export("loadTerrain")
	static final void loadTerrain(WorldView var0, Buffer var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int[][][] var8 = var0.tileHeights;
		byte[][][] var9 = var0.tileSettings;
		int var10;
		if (var2 >= 0 && var2 < 4 && var3 >= 0 && var3 < var8[0].length - 1 && var4 >= 0 && var4 < var8[0][0].length - 1) {
			var9[var2][var3][var4] = 0;

			while (true) {
				var10 = var1.readUnsignedShort();
				if (var10 == 0) {
					if (var2 == 0) {
						var8[0][var3][var4] = -WorldMapID.method6843(var5 + 932731, 556238 + var6) * 8;
					} else {
						var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - 240;
					}
					break;
				}

				if (var10 == 1) {
					int var11 = var1.readUnsignedByte();
					if (var11 == 1) {
						var11 = 0;
					}

					if (var2 == 0) {
						var8[0][var3][var4] = -var11 * 8;
					} else {
						var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - var11 * 8;
					}
					break;
				}

				if (var10 <= 49) {
					Tiles.Tiles_overlays[var2][var3][var4] = (short)var1.readShort();
					Frames.Tiles_shapes[var2][var3][var4] = (byte)((var10 - 2) / 4);
					GrandExchangeEvents.field5045[var2][var3][var4] = (byte)(var10 - 2 + var7 & 3);
				} else if (var10 <= 81) {
					var9[var2][var3][var4] = (byte)(var10 - 49);
				} else {
					Tiles.Tiles_underlays[var2][var3][var4] = (short)(var10 - 81);
				}
			}
		} else {
			while (true) {
				var10 = var1.readUnsignedShort();
				if (var10 == 0) {
					break;
				}

				if (var10 == 1) {
					var1.readUnsignedByte();
					break;
				}

				if (var10 <= 49) {
					var1.readShort();
				}
			}
		}

	}
}
