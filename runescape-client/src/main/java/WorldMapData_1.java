import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lc")
@Implements("WorldMapData_1")
public class WorldMapData_1 extends AbstractWorldMapData {
	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "[Lxt;"
	)
	@Export("worldSelectBackSprites")
	static SpritePixels[] worldSelectBackSprites;
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "Lxc;"
	)
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -939145015
	)
	@Export("chunkXLow")
	int chunkXLow;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 381949617
	)
	@Export("chunkYLow")
	int chunkYLow;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 719315667
	)
	@Export("chunkX")
	int chunkX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1828466757
	)
	@Export("chunkY")
	int chunkY;

	WorldMapData_1() {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)V",
		garbageValue = "-2015769013"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 != WorldMapID.field3466.value) {
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
		descriptor = "(Lwb;I)V",
		garbageValue = "1975102326"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4);
		super.floorUnderlayIds = new short[1][64][64];
		super.floorOverlayIds = new short[super.planes][64][64];
		super.field3435 = new byte[super.planes][64][64];
		super.field3436 = new byte[super.planes][64][64];
		super.decorations = new WorldMapDecoration[super.planes][64][64][];
		int var2 = var1.readUnsignedByte();
		if (var2 != class303.field3462.value) {
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
		garbageValue = "62"
	)
	@Export("getChunkXLow")
	int getChunkXLow() {
		return this.chunkXLow;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1842342027"
	)
	@Export("getChunkYLow")
	int getChunkYLow() {
		return this.chunkYLow;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-97475939"
	)
	@Export("getChunkX")
	int getChunkX() {
		return this.chunkX;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-667716871"
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
			if (var2.regionX == super.regionX && super.regionY == var2.regionY) {
				return var2.chunkX == this.chunkX && this.chunkY == var2.chunkY;
			} else {
				return false;
			}
		}
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8 | this.chunkX << 16 | this.chunkY << 24;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lpx;Lpx;II)Ljj;",
		garbageValue = "-908959487"
	)
	public static Frames method6690(AbstractArchive var0, AbstractArchive var1, int var2) {
		boolean var3 = true;
		int var4 = -1;
		int[] var5 = var0.getGroupFileIds(var2);

		for (int var6 = 0; var6 < var5.length; ++var6) {
			byte[] var7 = var0.getFile(var2, var5[var6]);
			if (var7 == null) {
				var3 = false;
			} else if (var4 == -1) {
				var4 = (var7[0] & 255) << 8 | var7[1] & 255;
			}
		}

		if (var4 != -1) {
			byte[] var8 = var1.getFile(var4, 0);
			if (var8 == null) {
				var3 = false;
			}
		} else {
			var3 = false;
		}

		if (!var3) {
			return null;
		} else {
			try {
				return new Frames(var0, var1, var2);
			} catch (Exception var9) {
				return null;
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "0"
	)
	static void method6698(boolean var0) {
		if (var0) {
			FloatProjection.method5344();
		} else {
			for (int var1 = 0; var1 < class339.midiRequests.size(); ++var1) {
				MidiRequest var2 = (MidiRequest)class339.midiRequests.get(var1);
				if (var2 == null) {
					class339.midiRequests.remove(var1);
					--var1;
				} else if (var2.field4011) {
					if (var2.midiPcmStream.field3904 > 0) {
						--var2.midiPcmStream.field3904;
					}

					var2.midiPcmStream.clear();
					var2.midiPcmStream.method7143();
					var2.midiPcmStream.setPcmStreamVolume(0);
					class339.midiRequests.remove(var1);
					--var1;
				} else {
					var2.field4011 = true;
				}
			}
		}

	}
}
