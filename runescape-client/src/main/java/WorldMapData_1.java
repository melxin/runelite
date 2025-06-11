import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lu")
@Implements("WorldMapData_1")
public class WorldMapData_1 extends AbstractWorldMapData {
	@ObfuscatedName("mp")
	@ObfuscatedGetter(
		intValue = -53317489
	)
	@Export("cameraPitch")
	static int cameraPitch;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 541915447
	)
	@Export("chunkXLow")
	int chunkXLow;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 494197731
	)
	@Export("chunkYLow")
	int chunkYLow;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1990878815
	)
	@Export("chunkX")
	int chunkX;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -117555121
	)
	@Export("chunkY")
	int chunkY;

	WorldMapData_1() {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwt;B)V",
		garbageValue = "-103"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 != WorldMapID.field3308.value) {
			throw new IllegalStateException("");
		} else {
			super.minPlane = var1.readUnsignedByte();
			super.planes = var1.readUnsignedByte();
			super.regionXLow = var1.readUnsignedShort() * 4096;
			super.regionYLow = var1.readUnsignedShort() * 4096;
			this.chunkXLow = var1.readUnsignedByte();
			this.chunkYLow = var1.readUnsignedByte();
			super.regionX = var1.readUnsignedShort();
			super.regionY = var1.readUnsignedShort();
			this.chunkX = var1.readUnsignedByte();
			this.chunkY = var1.readUnsignedByte();
			super.groupId = var1.method10873();
			super.fileId = var1.method10873();
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)V",
		garbageValue = "-1467436394"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4);
		super.floorUnderlayIds = new short[1][64][64];
		super.floorOverlayIds = new short[super.planes][64][64];
		super.field3273 = new byte[super.planes][64][64];
		super.field3274 = new byte[super.planes][64][64];
		super.decorations = new WorldMapDecoration[super.planes][64][64][];
		int var2 = var1.readUnsignedByte();
		if (var2 != class300.field3302.value) {
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1107641553"
	)
	@Export("getChunkXLow")
	int getChunkXLow() {
		return this.chunkXLow;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "38"
	)
	@Export("getChunkYLow")
	int getChunkYLow() {
		return this.chunkYLow;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "77"
	)
	@Export("getChunkX")
	int getChunkX() {
		return this.chunkX;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-63164875"
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
			if (super.regionX == var2.regionX && super.regionY == var2.regionY) {
				return this.chunkX == var2.chunkX && var2.chunkY == this.chunkY;
			} else {
				return false;
			}
		}
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8 | this.chunkX << 16 | this.chunkY << 24;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "1"
	)
	@Export("Messages_getHistorySize")
	static int Messages_getHistorySize(int var0) {
		ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var1 == null ? 0 : var1.size();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ltp;IIB)V",
		garbageValue = "79"
	)
	public static void method6492(class509 var0, int var1, int var2) {
		class573.method10775(var0);
		if (var1 >= 0 && var2 >= 0 && var1 < var0.method9937() && var2 < var0.method9937()) {
			if (var2 != var1) {
				if (var0.field5288 == class563.field5600) {
					int[] var3 = var0.method9965();
					int var8 = var3[var1];
					var3[var1] = var3[var2];
					var3[var2] = var8;
				} else if (var0.field5288 == class563.field5594) {
					long[] var9 = var0.method9973();
					long var6 = var9[var1];
					var9[var1] = var9[var2];
					var9[var2] = var6;
				} else {
					Object[] var10 = var0.method9936();
					Object var4 = var10[var1];
					var10[var1] = var10[var2];
					var10[var2] = var4;
				}
			}

		} else {
			throw new RuntimeException();
		}
	}
}
