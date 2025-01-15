import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lu")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("jq")
	@ObfuscatedGetter(
		intValue = 930710513
	)
	static int field3215;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1598926912
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 938496000
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 780184599
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -950004071
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -432409417
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -171903861
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1411211197
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -921447447
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("aq")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("af")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("aa")
	byte[][][] field3210;
	@ObfuscatedName("ak")
	byte[][][] field3205;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[[[[Llx;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("av")
	boolean field3213;
	@ObfuscatedName("ag")
	boolean field3214;

	AbstractWorldMapData() {
		this.groupId = -1;
		this.fileId = -1;
		new LinkedList();
		this.field3213 = false;
		this.field3214 = false;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lvy;B)V",
		garbageValue = "-46"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1510656174"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field3213 && this.field3214;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lpq;I)V",
		garbageValue = "1797083612"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) {
			byte[] var2 = var1.takeFile(this.groupId, this.fileId);
			if (var2 != null) {
				this.readGeography(new Buffer(var2));
				this.field3213 = true;
				this.field3214 = true;
			}

		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2138652093"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null;
		this.floorOverlayIds = null;
		this.field3210 = null;
		this.field3205 = null;
		this.decorations = null;
		this.field3213 = false;
		this.field3214 = false;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IILvy;B)V",
		garbageValue = "4"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte();
		if (var4 != 0) {
			if ((var4 & 1) != 0) {
				this.method6367(var1, var2, var3, var4);
			} else {
				this.method6368(var1, var2, var3, var4);
			}

		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IILvy;II)V",
		garbageValue = "-91703415"
	)
	void method6367(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IILvy;IB)V",
		garbageValue = "-67"
	)
	void method6368(int var1, int var2, Buffer var3, int var4) {
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
					this.field3210[var9][var1][var2] = (byte)(var11 >> 2);
					this.field3205[var9][var1][var2] = (byte)(var11 & 3);
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "16"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "35"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Lqe;",
		garbageValue = "1411520419"
	)
	public static TransformationMatrix method6389() {
		synchronized(TransformationMatrix.field4758) {
			if (TransformationMatrix.field4759 == 0) {
				return new TransformationMatrix();
			} else {
				TransformationMatrix.field4758[--TransformationMatrix.field4759].method8372();
				return TransformationMatrix.field4758[TransformationMatrix.field4759];
			}
		}
	}
}
