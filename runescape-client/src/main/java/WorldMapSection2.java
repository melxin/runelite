import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ki")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -904257313
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -809934677
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1931349009
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1887456797
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1530824837
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1609849153
	)
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1402100071
	)
	int field3181;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1195146833
	)
	int field3182;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1870976453
	)
	int field3175;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1779255361
	)
	int field3184;

	WorldMapSection2() {
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lli;B)V",
		garbageValue = "121"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field3181) {
			var1.regionLowX = this.field3181;
		}

		if (var1.regionHighX < this.field3175) {
			var1.regionHighX = this.field3175;
		}

		if (var1.regionLowY > this.field3182) {
			var1.regionLowY = this.field3182;
		}

		if (var1.regionHighY < this.field3184) {
			var1.regionHighY = this.field3184;
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "51"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) {
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1479617515"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 >= this.field3181 && var1 >> 6 <= this.field3175 && var2 >> 6 >= this.field3182 && var2 >> 6 <= this.field3184;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "1854006794"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.field3181 * 64 - this.regionStartX * 64 + var2, var3 + (this.field3182 * 64 - this.regionStartY * 64)};
			return var4;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(III)Lnt;",
		garbageValue = "1321767121"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.regionStartX * 64 - this.field3181 * 64 + var1;
			int var4 = this.regionStartY * 64 - this.field3182 * 64 + var2;
			return new Coord(this.minPlane, var3, var4);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lve;I)V",
		garbageValue = "1096753286"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte();
		this.planes = var1.readUnsignedByte();
		this.regionStartX = var1.readUnsignedShort();
		this.regionStartY = var1.readUnsignedShort();
		this.regionEndX = var1.readUnsignedShort();
		this.regionEndY = var1.readUnsignedShort();
		this.field3181 = var1.readUnsignedShort();
		this.field3182 = var1.readUnsignedShort();
		this.field3175 = var1.readUnsignedShort();
		this.field3184 = var1.readUnsignedShort();
		this.postRead();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1712602154"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)[Lmx;",
		garbageValue = "-1104253426"
	)
	public static class325[] method5969() {
		return new class325[]{class325.field3484, class325.field3485, class325.field3486, class325.field3496, class325.field3487, class325.field3489, class325.field3490, class325.field3491, class325.field3488, class325.field3493, class325.field3494, class325.field3495, class325.field3492};
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(CB)C",
		garbageValue = "-44"
	)
	static char method5968(char var0) {
		return var0 != 181 && var0 != 402 ? Character.toTitleCase(var0) : var0;
	}
}
