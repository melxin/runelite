import java.text.ParseException;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lk")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
	@ObfuscatedName("ax")
	@Export("fontHelvetica13")
	static java.awt.Font fontHelvetica13;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 835026009
	)
	@Export("oldZ")
	int oldZ;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 8205355
	)
	@Export("newZ")
	int newZ;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 70054765
	)
	@Export("oldX")
	int oldX;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 150218947
	)
	@Export("oldY")
	int oldY;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 545353129
	)
	@Export("newX")
	int newX;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1219878721
	)
	@Export("newY")
	int newY;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -707073553
	)
	@Export("oldChunkXLow")
	int oldChunkXLow;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1022973279
	)
	@Export("oldChunkYLow")
	int oldChunkYLow;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 181015963
	)
	@Export("oldChunkXHigh")
	int oldChunkXHigh;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1354720123
	)
	@Export("oldChunkYHigh")
	int oldChunkYHigh;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 2056337049
	)
	@Export("newChunkXLow")
	int newChunkXLow;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1748002321
	)
	@Export("newChunkYLow")
	int newChunkYLow;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 914272673
	)
	@Export("newChunkXHigh")
	int newChunkXHigh;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -373254213
	)
	@Export("newChunkYHigh")
	int newChunkYHigh;

	WorldMapSection0() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Llh;I)V",
		garbageValue = "-321528483"
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1647486588"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.oldZ && var1 < this.oldZ + this.newZ) {
			return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "16374902"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "-10"
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)Lny;",
		garbageValue = "126893021"
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lwj;B)V",
		garbageValue = "-7"
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-841452392"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1502628452"
	)
	static boolean method6793() {
		Date var0;
		try {
			var0 = class67.method2190();
		} catch (ParseException var6) {
			GrandExchangeOfferWorldComparator.method8565("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
			return false;
		}

		if (var0 == null) {
			return false;
		} else {
			boolean var4 = class139.method3814(var0);
			Date var3 = class203.method4567();
			boolean var2 = var0.after(var3);
			if (!var2) {
				GrandExchangeOfferWorldComparator.method8565("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
				return false;
			} else {
				if (!var4) {
					class165.field1886 = 8388607;
				} else {
					class165.field1886 = (int)(var0.getTime() / 86400000L - 11745L);
				}

				return true;
			}
		}
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(B)J",
		garbageValue = "17"
	)
	@Export("getUserHash")
	static long getUserHash() {
		return Client.userHash;
	}
}
