import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lq")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("as")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -757280768
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 576510528
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1201070683
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 855584789
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1033988837
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1019072733
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1811076469
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 83740699
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("au")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("aj")
	byte[][][] field3281;
	@ObfuscatedName("al")
	byte[][][] field3278;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[[[[Llm;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("ay")
	boolean field3271;
	@ObfuscatedName("ak")
	boolean field3285;

	AbstractWorldMapData() {
		this.groupId = -1;
		this.fileId = -1;
		this.field3271 = false;
		this.field3285 = false;
		new LinkedList();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lve;I)V",
		garbageValue = "-1112243034"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "535841035"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field3271 && this.field3285;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lph;I)V",
		garbageValue = "-1293799702"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) {
			byte[] var2 = var1.takeFile(this.groupId, this.fileId);
			if (var2 != null) {
				this.readGeography(new Buffer(var2));
				this.field3271 = true;
				this.field3285 = true;
			}

		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1428872437"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null;
		this.floorOverlayIds = null;
		this.field3281 = null;
		this.field3278 = null;
		this.decorations = null;
		this.field3271 = false;
		this.field3285 = false;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IILve;I)V",
		garbageValue = "-1869474376"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte();
		if (var4 != 0) {
			if ((var4 & 1) != 0) {
				this.method6315(var1, var2, var3, var4);
			} else {
				this.method6310(var1, var2, var3, var4);
			}

		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IILve;II)V",
		garbageValue = "-2082691000"
	)
	void method6315(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IILve;II)V",
		garbageValue = "81087353"
	)
	void method6310(int var1, int var2, Buffer var3, int var4) {
		int var5 = ((var4 & 24) >> 3) + 1;
		boolean var6 = (var4 & 2) != 0;
		boolean var7 = (var4 & 4) != 0;
		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
		int var8;
		int var9;
		int var11;
		if (var6) {
			var8 = var3.readUnsignedByte();

			for (var9 = 0; var9 < var8; ++var9) {
				int var14 = var3.readUnsignedShort();
				if (var14 != 0) {
					this.floorOverlayIds[var9][var1][var2] = (short)var14;
					var11 = var3.readUnsignedByte();
					this.field3281[var9][var1][var2] = (byte)(var11 >> 2);
					this.field3278[var9][var1][var2] = (byte)(var11 & 3);
				}
			}
		}

		if (var7) {
			for (var8 = 0; var8 < var5; ++var8) {
				var9 = var3.readUnsignedByte();
				if (var9 != 0) {
					WorldMapDecoration[] var10 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9];

					for (var11 = 0; var11 < var9; ++var11) {
						int var12 = var3.readNullableLargeSmart();
						int var13 = var3.readUnsignedByte();
						var10[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3);
					}
				}
			}
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1718091735"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-109"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY;
	}
}
