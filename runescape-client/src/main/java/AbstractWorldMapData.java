import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lm")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("au")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1902950720
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 323676352
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1371372753
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1571400723
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1221483109
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 489737901
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 285764143
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1451109245
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("ai")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("ak")
	byte[][][] field3356;
	@ObfuscatedName("ar")
	byte[][][] field3357;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[[[[Lld;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("ax")
	boolean field3359;
	@ObfuscatedName("aq")
	boolean field3360;

	AbstractWorldMapData() {
		this.groupId = -1;
		this.fileId = -1;
		this.field3359 = false;
		this.field3360 = false;
		new LinkedList();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "-1513260144"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2050325649"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field3359 && this.field3360;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "789219683"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) {
			byte[] var2 = var1.takeFile(this.groupId, this.fileId);
			if (var2 != null) {
				this.readGeography(new Buffer(var2));
				this.field3359 = true;
				this.field3360 = true;
			}

		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null;
		this.floorOverlayIds = null;
		this.field3356 = null;
		this.field3357 = null;
		this.decorations = null;
		this.field3359 = false;
		this.field3360 = false;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(IILwj;I)V",
		garbageValue = "-729969503"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte();
		if (var4 != 0) {
			if ((var4 & 1) != 0) {
				this.method6768(var1, var2, var3, var4);
			} else {
				this.method6792(var1, var2, var3, var4);
			}

		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(IILwj;II)V",
		garbageValue = "-1546635483"
	)
	void method6768(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(IILwj;IB)V",
		garbageValue = "16"
	)
	void method6792(int var1, int var2, Buffer var3, int var4) {
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
					this.field3356[var9][var1][var2] = (byte)(var11 >> 2);
					this.field3357[var9][var1][var2] = (byte)(var11 & 3);
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
		garbageValue = "35"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1647727794"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lqq;I)I",
		garbageValue = "-368207663"
	)
	@Export("compareStrings")
	public static int compareStrings(CharSequence var0, CharSequence var1, Language var2) {
		int var3 = var0.length();
		int var4 = var1.length();
		int var5 = 0;
		int var6 = 0;
		byte var7 = 0;
		byte var8 = 0;

		while (var5 - var7 < var3 || var6 - var8 < var4) {
			if (var5 - var7 >= var3) {
				return -1;
			}

			if (var6 - var8 >= var4) {
				return 1;
			}

			char var9;
			if (var7 != 0) {
				var9 = (char)var7;
				boolean var14 = false;
			} else {
				var9 = var0.charAt(var5++);
			}

			char var10;
			if (var8 != 0) {
				var10 = (char)var8;
				boolean var15 = false;
			} else {
				var10 = var1.charAt(var6++);
			}

			byte var11;
			if (var9 == 198) {
				var11 = 69;
			} else if (var9 == 230) {
				var11 = 101;
			} else if (var9 == 223) {
				var11 = 115;
			} else if (var9 == 338) {
				var11 = 69;
			} else if (var9 == 339) {
				var11 = 101;
			} else {
				var11 = 0;
			}

			var7 = var11;
			byte var12;
			if (var10 == 198) {
				var12 = 69;
			} else if (var10 == 230) {
				var12 = 101;
			} else if (var10 == 223) {
				var12 = 115;
			} else if (var10 == 338) {
				var12 = 69;
			} else if (var10 == 339) {
				var12 = 101;
			} else {
				var12 = 0;
			}

			var8 = var12;
			var9 = class141.standardizeChar(var9, var2);
			var10 = class141.standardizeChar(var10, var2);
			if (var10 != var9 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) {
				var9 = Character.toLowerCase(var9);
				var10 = Character.toLowerCase(var10);
				if (var9 != var10) {
					return WorldMapRegion.lowercaseChar(var9, var2) - WorldMapRegion.lowercaseChar(var10, var2);
				}
			}
		}

		int var16 = Math.min(var3, var4);

		int var17;
		char var20;
		for (var17 = 0; var17 < var16; ++var17) {
			if (var2 == Language.Language_FR) {
				var5 = var3 - 1 - var17;
				var6 = var4 - 1 - var17;
			} else {
				var6 = var17;
				var5 = var17;
			}

			char var18 = var0.charAt(var5);
			var20 = var1.charAt(var6);
			if (var20 != var18 && Character.toUpperCase(var18) != Character.toUpperCase(var20)) {
				var18 = Character.toLowerCase(var18);
				var20 = Character.toLowerCase(var20);
				if (var20 != var18) {
					return WorldMapRegion.lowercaseChar(var18, var2) - WorldMapRegion.lowercaseChar(var20, var2);
				}
			}
		}

		var17 = var3 - var4;
		if (var17 != 0) {
			return var17;
		} else {
			for (int var19 = 0; var19 < var16; ++var19) {
				var20 = var0.charAt(var19);
				char var13 = var1.charAt(var19);
				if (var20 != var13) {
					return WorldMapRegion.lowercaseChar(var20, var2) - WorldMapRegion.lowercaseChar(var13, var2);
				}
			}

			return 0;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1340940558"
	)
	static void method6797() {
		ItemContainer.itemContainers = new NodeHashTable(32);
	}

	@ObfuscatedName("md")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-15"
	)
	static boolean method6798(int var0, int var1) {
		if (var1 >= 2000) {
			var1 -= 2000;
		}

		class512 var2 = Client.worldViewManager.method2313(var0);
		boolean var3 = var0 == -1;
		boolean var4 = var0 == Client.field326;
		boolean var5 = true;
		boolean var6 = var1 == 1 || var1 == 2 || var1 >= 3 && var1 <= 6 || var1 == 1001;
		if (var6 && !var2.method10297(var5, var3, var4)) {
			return false;
		} else if (class153.method3821(var1) && !var2.method10298(var5, var3, var4)) {
			return false;
		} else {
			boolean var7 = var1 == 7 || var1 == 8 || var1 >= 9 && var1 <= 13;
			if (var7 && !var2.method10310(var5, var3, var4)) {
				return false;
			} else {
				boolean var8 = var1 == 14 || var1 == 15 || var1 >= 44 && var1 <= 51;
				if (var8 && !var2.method10300(var5, var3, var4)) {
					return false;
				} else if (var1 == 1002 && !var2.method10301(var5, var3, var4)) {
					return false;
				} else if (var1 == 1004 && !var2.method10302(var5, var3, var4)) {
					return false;
				} else {
					return var1 != 1003 || var2.method10319(var5, var3, var4);
				}
			}
		}
	}
}
