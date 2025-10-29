import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lq")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("np")
	@ObfuscatedSignature(
		descriptor = "Lbf;"
	)
	@Export("loginState")
	static LoginState loginState;
	@ObfuscatedName("ae")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -39388864
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1401081856
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1415052445
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -588647407
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1100812969
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1789868441
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 2080583947
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1713870949
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("ai")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("as")
	byte[][][] field3468;
	@ObfuscatedName("ac")
	byte[][][] field3466;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[[[[Llm;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("ax")
	boolean field3461;
	@ObfuscatedName("ar")
	boolean field3462;

	AbstractWorldMapData() {
		this.groupId = -1;
		this.fileId = -1;
		this.field3461 = false;
		this.field3462 = false;
		new LinkedList();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lxa;I)V",
		garbageValue = "-1502866197"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "886741517"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field3461 && this.field3462;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lqm;I)V",
		garbageValue = "-1932060791"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) {
			byte[] var2 = var1.takeFile(this.groupId, this.fileId);
			if (var2 != null) {
				this.readGeography(new Buffer(var2));
				this.field3461 = true;
				this.field3462 = true;
			}

		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-87"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null;
		this.floorOverlayIds = null;
		this.field3468 = null;
		this.field3466 = null;
		this.decorations = null;
		this.field3461 = false;
		this.field3462 = false;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IILxa;B)V",
		garbageValue = "40"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte();
		if (var4 != 0) {
			if ((var4 & 1) != 0) {
				this.method6997(var1, var2, var3, var4);
			} else {
				this.method6977(var1, var2, var3, var4);
			}

		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IILxa;II)V",
		garbageValue = "2089758707"
	)
	void method6997(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(IILxa;II)V",
		garbageValue = "-231674939"
	)
	void method6977(int var1, int var2, Buffer var3, int var4) {
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
					this.field3468[var9][var1][var2] = (byte)(var11 >> 2);
					this.field3466[var9][var1][var2] = (byte)(var11 & 3);
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

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-120"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2117186632"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-580673349"
	)
	public static boolean method6974(char var0) {
		if (var0 >= ' ' && var0 < 127 || var0 > 127 && var0 < 160 || var0 > 160 && var0 <= 255) {
			return true;
		} else {
			if (var0 != 0) {
				char[] var1 = class451.cp1252AsciiExtension;

				for (int var2 = 0; var2 < var1.length; ++var2) {
					char var3 = var1[var2];
					if (var0 == var3) {
						return true;
					}
				}
			}

			return false;
		}
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(IIIIISISIII)V",
		garbageValue = "-63104703"
	)
	static void method7005(int var0, int var1, int var2, int var3, int var4, short var5, int var6, short var7, int var8, int var9) {
		WorldMapIcon_1.method6595(AsyncHttpResponse.worldView, var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "66"
	)
	static void method7004(int var0, int var1, int var2, int var3, int var4) {
		class136.method3805(AsyncHttpResponse.worldView, var0, var1, var2, var3, var4);
	}
}
