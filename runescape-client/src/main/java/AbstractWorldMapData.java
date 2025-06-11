import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lq")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("al")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 864915456
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -256929792
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -2064708809
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1038960535
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1822880975
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 613742515
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1602899163
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1984284143
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("af")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("ak")
	byte[][][] field3273;
	@ObfuscatedName("az")
	byte[][][] field3274;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[[[[Lld;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("at")
	boolean field3263;
	@ObfuscatedName("ae")
	boolean field3277;

	AbstractWorldMapData() {
		this.groupId = -1;
		this.fileId = -1;
		this.field3263 = false;
		this.field3277 = false;
		new LinkedList();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)V",
		garbageValue = "-1467436394"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-665681810"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field3263 && this.field3277;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lps;I)V",
		garbageValue = "2027329039"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) {
			byte[] var2 = var1.takeFile(this.groupId, this.fileId);
			if (var2 != null) {
				this.readGeography(new Buffer(var2));
				this.field3263 = true;
				this.field3277 = true;
			}

		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null;
		this.floorOverlayIds = null;
		this.field3273 = null;
		this.field3274 = null;
		this.decorations = null;
		this.field3263 = false;
		this.field3277 = false;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IILwt;I)V",
		garbageValue = "1044847370"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte();
		if (var4 != 0) {
			if ((var4 & 1) != 0) {
				this.method6580(var1, var2, var3, var4);
			} else {
				this.method6582(var1, var2, var3, var4);
			}

		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IILwt;IB)V",
		garbageValue = "-81"
	)
	void method6580(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IILwt;IB)V",
		garbageValue = "70"
	)
	void method6582(int var1, int var2, Buffer var3, int var4) {
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
					this.field3273[var9][var1][var2] = (byte)(var11 >> 2);
					this.field3274[var9][var1][var2] = (byte)(var11 & 3);
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-480931281"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1356553924"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY;
	}
}
