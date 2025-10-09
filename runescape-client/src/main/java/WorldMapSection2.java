import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lt")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1287091267
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 242636085
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -678872803
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1708659059
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 265684353
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1729810089
	)
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 960772947
	)
	int field3322;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 387211005
	)
	int field3321;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -152016361
	)
	int field3324;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1790164985
	)
	int field3325;

	WorldMapSection2() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Llh;I)V",
		garbageValue = "-321528483"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field3322) {
			var1.regionLowX = this.field3322;
		}

		if (var1.regionHighX < this.field3324) {
			var1.regionHighX = this.field3324;
		}

		if (var1.regionLowY > this.field3321) {
			var1.regionLowY = this.field3321;
		}

		if (var1.regionHighY < this.field3325) {
			var1.regionHighY = this.field3325;
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1647486588"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.minPlane + this.planes) {
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY;
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
		return var1 >> 6 >= this.field3322 && var1 >> 6 <= this.field3324 && var2 >> 6 >= this.field3321 && var2 >> 6 <= this.field3325;
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
			int[] var4 = new int[]{this.field3322 * 64 - this.regionStartX * 64 + var2, var3 + (this.field3321 * 64 - this.regionStartY * 64)};
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
			int var3 = this.regionStartX * 64 - this.field3322 * 64 + var1;
			int var4 = this.regionStartY * 64 - this.field3321 * 64 + var2;
			return new Coord(this.minPlane, var3, var4);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lwj;B)V",
		garbageValue = "-7"
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
		this.field3321 = var1.readUnsignedShort();
		this.field3324 = var1.readUnsignedShort();
		this.field3325 = var1.readUnsignedShort();
		this.postRead();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1717188096"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("af")
	static long method6436(long var0) {
		return var0 & -524289L;
	}
}
