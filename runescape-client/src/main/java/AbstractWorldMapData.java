import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lo")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -536979392
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1505980416
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1583058985
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -33317531
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1573989971
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 324613351
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -2078793049
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1452969485
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("al")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("ar")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("as")
	byte[][][] field3211;
	@ObfuscatedName("az")
	byte[][][] field3220;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[[[[Lls;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("ap")
	boolean field3222;
	@ObfuscatedName("ah")
	boolean field3223;

	AbstractWorldMapData() {
		this.groupId = -1;
		this.fileId = -1;
		new LinkedList();
		this.field3222 = false;
		this.field3223 = false;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lvj;B)V",
		garbageValue = "84"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1100215159"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field3222 && this.field3223;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lpi;S)V",
		garbageValue = "-13594"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) {
			byte[] var2 = var1.takeFile(this.groupId, this.fileId);
			if (var2 != null) {
				this.readGeography(new Buffer(var2));
				this.field3222 = true;
				this.field3223 = true;
			}

		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-574968618"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null;
		this.floorOverlayIds = null;
		this.field3211 = null;
		this.field3220 = null;
		this.decorations = null;
		this.field3222 = false;
		this.field3223 = false;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IILvj;B)V",
		garbageValue = "-11"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte();
		if (var4 != 0) {
			if ((var4 & 1) != 0) {
				this.method6199(var1, var2, var3, var4);
			} else {
				this.method6217(var1, var2, var3, var4);
			}

		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IILvj;IB)V",
		garbageValue = "-86"
	)
	void method6199(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IILvj;IB)V",
		garbageValue = "-84"
	)
	void method6217(int var1, int var2, Buffer var3, int var4) {
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
					this.field3211[var9][var1][var2] = (byte)(var11 >> 2);
					this.field3220[var9][var1][var2] = (byte)(var11 & 3);
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

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-74"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-29834"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lnp;I)I",
		garbageValue = "-1556312447"
	)
	static int method6228(Widget var0) {
		if (var0.type != 11) {
			Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize - 1] = "";
			return 1;
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var0.method7270(var1);
			return 1;
		}
	}
}
