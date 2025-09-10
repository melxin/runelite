import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("la")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 918663535
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1429189785
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1543150995
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 126941049
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1126996333
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1276808359
	)
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 915645513
	)
	int field3322;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1525203979
	)
	int field3323;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1185983241
	)
	int field3317;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1405319925
	)
	int field3325;

	WorldMapSection2() {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lll;I)V",
		garbageValue = "1896416407"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field3322) {
			var1.regionLowX = this.field3322;
		}

		if (var1.regionHighX < this.field3317) {
			var1.regionHighX = this.field3317;
		}

		if (var1.regionLowY > this.field3323) {
			var1.regionLowY = this.field3323;
		}

		if (var1.regionHighY < this.field3325) {
			var1.regionHighY = this.field3325;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-739948834"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) {
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY;
		} else {
			return false;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-51"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 >= this.field3322 && var1 >> 6 <= this.field3317 && var2 >> 6 >= this.field3323 && var2 >> 6 <= this.field3325;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-2061697618"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.field3322 * 64 - this.regionStartX * 64 + var2, var3 + (this.field3323 * 64 - this.regionStartY * 64)};
			return var4;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lna;",
		garbageValue = "1"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.regionStartX * 64 - this.field3322 * 64 + var1;
			int var4 = this.regionStartY * 64 - this.field3323 * 64 + var2;
			return new Coord(this.minPlane, var3, var4);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)V",
		garbageValue = "-1979822224"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte();
		this.planes = var1.readUnsignedByte();
		this.regionStartX = var1.readUnsignedShort();
		this.regionStartY = var1.readUnsignedShort();
		this.regionEndX = var1.readUnsignedShort();
		this.regionEndY = var1.readUnsignedShort();
		this.field3322 = var1.readUnsignedShort();
		this.field3323 = var1.readUnsignedShort();
		this.field3317 = var1.readUnsignedShort();
		this.field3325 = var1.readUnsignedShort();
		this.postRead();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1011254922"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lqh;I)I",
		garbageValue = "319270884"
	)
	@Export("compareStrings")
	public static int compareStrings(CharSequence var0, CharSequence var1, Language var2) {
		int var3 = var0.length();
		int var4 = var1.length();
		int var5 = 0;
		int var6 = 0;
		char var7 = 0;
		char var8 = 0;

		while (var5 - var7 < var3 || var6 - var8 < var4) {
			if (var5 - var7 >= var3) {
				return -1;
			}

			if (var6 - var8 >= var4) {
				return 1;
			}

			char var9;
			if (var7 != 0) {
				var9 = var7;
				boolean var14 = false;
			} else {
				var9 = var0.charAt(var5++);
			}

			char var10;
			if (var8 != 0) {
				var10 = var8;
				boolean var15 = false;
			} else {
				var10 = var1.charAt(var6++);
			}

			var7 = SecureUrlRequester.method3517(var9);
			var8 = SecureUrlRequester.method3517(var10);
			var9 = class525.standardizeChar(var9, var2);
			var10 = class525.standardizeChar(var10, var2);
			if (var9 != var10 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) {
				var9 = Character.toLowerCase(var9);
				var10 = Character.toLowerCase(var10);
				if (var10 != var9) {
					return class410.lowercaseChar(var9, var2) - class410.lowercaseChar(var10, var2);
				}
			}
		}

		int var16 = Math.min(var3, var4);

		char var12;
		int var17;
		for (var17 = 0; var17 < var16; ++var17) {
			if (var2 == Language.Language_FR) {
				var5 = var3 - 1 - var17;
				var6 = var4 - 1 - var17;
			} else {
				var6 = var17;
				var5 = var17;
			}

			char var11 = var0.charAt(var5);
			var12 = var1.charAt(var6);
			if (var11 != var12 && Character.toUpperCase(var11) != Character.toUpperCase(var12)) {
				var11 = Character.toLowerCase(var11);
				var12 = Character.toLowerCase(var12);
				if (var11 != var12) {
					return class410.lowercaseChar(var11, var2) - class410.lowercaseChar(var12, var2);
				}
			}
		}

		var17 = var3 - var4;
		if (var17 != 0) {
			return var17;
		} else {
			for (int var18 = 0; var18 < var16; ++var18) {
				var12 = var0.charAt(var18);
				char var13 = var1.charAt(var18);
				if (var13 != var12) {
					return class410.lowercaseChar(var12, var2) - class410.lowercaseChar(var13, var2);
				}
			}

			return 0;
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-2090592192"
	)
	@Export("stringCp1252NullTerminatedByteSize")
	public static int stringCp1252NullTerminatedByteSize(String var0) {
		return var0.length() + 1;
	}
}
