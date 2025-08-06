import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lw")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
	@ObfuscatedName("ax")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1669504503
	)
	@Export("oldZ")
	int oldZ;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1328466649
	)
	@Export("newZ")
	int newZ;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1180236205
	)
	@Export("oldX")
	int oldX;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 307620759
	)
	@Export("oldY")
	int oldY;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1856998199
	)
	@Export("newX")
	int newX;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1596745743
	)
	@Export("newY")
	int newY;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -488546445
	)
	@Export("oldChunkXLow")
	int oldChunkXLow;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -538963373
	)
	@Export("oldChunkYLow")
	int oldChunkYLow;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1972274185
	)
	@Export("oldChunkXHigh")
	int oldChunkXHigh;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 403026883
	)
	@Export("oldChunkYHigh")
	int oldChunkYHigh;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 371590161
	)
	@Export("newChunkXLow")
	int newChunkXLow;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -678259523
	)
	@Export("newChunkYLow")
	int newChunkYLow;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1899377085
	)
	@Export("newChunkXHigh")
	int newChunkXHigh;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1461562753
	)
	@Export("newChunkYHigh")
	int newChunkYHigh;

	WorldMapSection0() {
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Llr;B)V",
		garbageValue = "78"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.newX) {
			var1.regionLowX = this.newX;
		}

		if (var1.regionHighX < this.newX) {
			var1.regionHighX = this.newX;
		}

		if (var1.regionLowY > this.newY) {
			var1.regionLowY = this.newY;
		}

		if (var1.regionHighY < this.newY) {
			var1.regionHighY = this.newY;
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "828092552"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.oldZ && var1 < this.oldZ + this.newZ) {
			return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-29"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-826920955"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.newX * 64 - this.oldX * 64 + var2 + (this.newChunkXLow * 8 - this.oldChunkXLow * 8), var3 + (this.newY * 64 - this.oldY * 64) + (this.newChunkYLow * 8 - this.oldChunkYLow * 8)};
			return var4;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)Lng;",
		garbageValue = "-596761800"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.oldX * 64 - this.newX * 64 + (this.oldChunkXLow * 8 - this.newChunkXLow * 8) + var1;
			int var4 = this.oldY * 64 - this.newY * 64 + var2 + (this.oldChunkYLow * 8 - this.newChunkYLow * 8);
			return new Coord(this.oldZ, var3, var4);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "-1001820155"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.oldZ = var1.readUnsignedByte();
		this.newZ = var1.readUnsignedByte();
		this.oldX = var1.readUnsignedShort();
		this.oldChunkXLow = var1.readUnsignedByte();
		this.oldChunkXHigh = var1.readUnsignedByte();
		this.oldY = var1.readUnsignedShort();
		this.oldChunkYLow = var1.readUnsignedByte();
		this.oldChunkYHigh = var1.readUnsignedByte();
		this.newX = var1.readUnsignedShort();
		this.newChunkXLow = var1.readUnsignedByte();
		this.newChunkXHigh = var1.readUnsignedByte();
		this.newY = var1.readUnsignedShort();
		this.newChunkYLow = var1.readUnsignedByte();
		this.newChunkYHigh = var1.readUnsignedByte();
		this.postRead();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1526617711"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ltn;Ljava/lang/Object;IIB)I",
		garbageValue = "8"
	)
	public static int method6725(class515 var0, Object var1, int var2, int var3) {
		if (var2 < 0) {
			var2 = 0;
		}

		if (var3 < 0 || var3 > var0.method10351()) {
			var3 = var0.method10351();
		}

		int var4 = 0;
		int var6;
		if (var0.field5399 == class570.field5721) {
			int[] var5 = var0.method10348();
			var6 = (Integer)var1;

			for (int var7 = var2; var7 < var3; ++var7) {
				if (var6 == var5[var7]) {
					++var4;
				}
			}
		} else if (var0.field5399 == class570.field5724) {
			long[] var11 = var0.method10377();
			long var9 = (Long)var1;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var9 == var11[var8]) {
					++var4;
				}
			}
		} else {
			Object[] var12 = var0.method10393();

			for (var6 = var2; var6 < var3; ++var6) {
				if (var12[var6] == var1 || var12[var6] != null && var12[var6].equals(var1)) {
					++var4;
				}
			}
		}

		return var4;
	}

	@ObfuscatedName("ms")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lox;I)Ljava/lang/String;",
		garbageValue = "1817046756"
	)
	static String method6746(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) {
			for (int var2 = 1; var2 <= 5; ++var2) {
				while (true) {
					int var3 = var0.indexOf("%" + var2);
					if (var3 == -1) {
						break;
					}

					String var4 = var0.substring(0, var3);
					int var6 = class198.method4384(var1, var2 - 1);
					String var5;
					if (var6 < 999999999) {
						var5 = Integer.toString(var6);
					} else {
						var5 = "*";
					}

					var0 = var4 + var5 + var0.substring(var3 + 2);
				}
			}
		}

		return var0;
	}
}
