import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lr")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 309112832
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1556097216
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1548761135
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1649035655
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1794354395
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1227508487
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -827235575
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -862015397
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("ai")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("ak")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("aj")
	byte[][][] field3280;
	@ObfuscatedName("av")
	byte[][][] field3284;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[[[[Llq;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("ag")
	boolean field3286;
	@ObfuscatedName("az")
	boolean field3287;

	AbstractWorldMapData() {
		this.groupId = -1;
		this.fileId = -1;
		new LinkedList();
		this.field3286 = false;
		this.field3287 = false;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "650368316"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1756556106"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field3286 && this.field3287;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lpl;I)V",
		garbageValue = "1608907740"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) {
			byte[] var2 = var1.takeFile(this.groupId, this.fileId);
			if (var2 != null) {
				this.readGeography(new Buffer(var2));
				this.field3286 = true;
				this.field3287 = true;
			}

		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-86541057"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null;
		this.floorOverlayIds = null;
		this.field3280 = null;
		this.field3284 = null;
		this.decorations = null;
		this.field3286 = false;
		this.field3287 = false;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IILvy;B)V",
		garbageValue = "4"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte();
		if (var4 != 0) {
			if ((var4 & 1) != 0) {
				this.method6251(var1, var2, var3, var4);
			} else {
				this.method6282(var1, var2, var3, var4);
			}

		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IILvy;II)V",
		garbageValue = "-1789228277"
	)
	void method6251(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IILvy;IB)V",
		garbageValue = "1"
	)
	void method6282(int var1, int var2, Buffer var3, int var4) {
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
					this.field3280[var9][var1][var2] = (byte)(var11 >> 2);
					this.field3284[var9][var1][var2] = (byte)(var11 & 3);
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1268291206"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-19000"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "-2094779987"
	)
	static ArrayList method6246() {
		ArrayList var0 = new ArrayList();
		Iterator var1 = class335.midiRequests.iterator();

		while (var1.hasNext()) {
			MidiRequest var2 = (MidiRequest)var1.next();
			var0.add(var2);
		}

		return var0;
	}
}
