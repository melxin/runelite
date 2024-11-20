import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("la")
@Implements("WorldMapData_1")
public class WorldMapData_1 extends AbstractWorldMapData {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -386831387
	)
	@Export("chunkXLow")
	int chunkXLow;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 503776365
	)
	@Export("chunkYLow")
	int chunkYLow;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 434549639
	)
	@Export("chunkX")
	int chunkX;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1087098107
	)
	@Export("chunkY")
	int chunkY;

	WorldMapData_1() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvj;B)V",
		garbageValue = "-49"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 != WorldMapID.field3245.value) {
			throw new IllegalStateException("");
		} else {
			super.minPlane = var1.readUnsignedByte();
			super.planes = var1.readUnsignedByte();
			super.regionXLow = var1.readUnsignedShort() * 64;
			super.regionYLow = var1.readUnsignedShort() * 4096;
			this.chunkXLow = var1.readUnsignedByte();
			this.chunkYLow = var1.readUnsignedByte();
			super.regionX = var1.readUnsignedShort();
			super.regionY = var1.readUnsignedShort();
			this.chunkX = var1.readUnsignedByte();
			this.chunkY = var1.readUnsignedByte();
			super.groupId = var1.readNullableLargeSmart();
			super.fileId = var1.readNullableLargeSmart();
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lvj;B)V",
		garbageValue = "84"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4);
		super.floorUnderlayIds = new short[1][64][64];
		super.floorOverlayIds = new short[super.planes][64][64];
		super.field3211 = new byte[super.planes][64][64];
		super.field3220 = new byte[super.planes][64][64];
		super.decorations = new WorldMapDecoration[super.planes][64][64][];
		int var2 = var1.readUnsignedByte();
		if (var2 != class298.field3241.value) {
			throw new IllegalStateException("");
		} else {
			int var3 = var1.readUnsignedByte();
			int var4 = var1.readUnsignedByte();
			int var5 = var1.readUnsignedByte();
			int var6 = var1.readUnsignedByte();
			if (var3 == super.regionX && var4 == super.regionY && var5 == this.chunkX && var6 == this.chunkY) {
				for (int var7 = 0; var7 < 8; ++var7) {
					for (int var8 = 0; var8 < 8; ++var8) {
						this.readTile(var7 + this.chunkX * 8, var8 + this.chunkY * 8, var1);
					}
				}

			} else {
				throw new IllegalStateException("");
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "2"
	)
	@Export("getChunkXLow")
	int getChunkXLow() {
		return this.chunkXLow;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("getChunkYLow")
	int getChunkYLow() {
		return this.chunkYLow;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("getChunkX")
	int getChunkX() {
		return this.chunkX;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "60"
	)
	@Export("getChunkY")
	int getChunkY() {
		return this.chunkY;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_1)) {
			return false;
		} else {
			WorldMapData_1 var2 = (WorldMapData_1)var1;
			if (var2.regionX == super.regionX && var2.regionY == super.regionY) {
				return this.chunkX == var2.chunkX && this.chunkY == var2.chunkY;
			} else {
				return false;
			}
		}
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8 | this.chunkX << 16 | this.chunkY << 24;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "738653262"
	)
	public static int method6089(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
		var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459);
		var0 = var0 + (var0 >>> 4) & 252645135;
		var0 += var0 >>> 8;
		var0 += var0 >>> 16;
		return var0 & 255;
	}
}
