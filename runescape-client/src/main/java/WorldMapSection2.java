import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kp")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static Archive field3102;
	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "[Lvi;"
	)
	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1440027847
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -437334943
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 878567445
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1988309377
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1369617375
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 97173577
	)
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2004531413
	)
	int field3096;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1888039883
	)
	int field3095;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1409237689
	)
	int field3092;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 174576573
	)
	int field3099;

	WorldMapSection2() {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lkg;B)V",
		garbageValue = "43"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field3096) {
			var1.regionLowX = this.field3096;
		}

		if (var1.regionHighX < this.field3092) {
			var1.regionHighX = this.field3092;
		}

		if (var1.regionLowY > this.field3095) {
			var1.regionLowY = this.field3095;
		}

		if (var1.regionHighY < this.field3099) {
			var1.regionHighY = this.field3099;
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "53"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.minPlane + this.planes) {
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY;
		} else {
			return false;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-177019651"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 >= this.field3096 && var1 >> 6 <= this.field3092 && var2 >> 6 >= this.field3095 && var2 >> 6 <= this.field3099;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "1"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.field3096 * 64 - this.regionStartX * 64 + var2, var3 + (this.field3095 * 64 - this.regionStartY * 64)};
			return var4;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(III)Lnz;",
		garbageValue = "-425070677"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.regionStartX * 64 - this.field3096 * 64 + var1;
			int var4 = this.regionStartY * 64 - this.field3095 * 64 + var2;
			return new Coord(this.minPlane, var3, var4);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "-1542767096"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte();
		this.planes = var1.readUnsignedByte();
		this.regionStartX = var1.readUnsignedShort();
		this.regionStartY = var1.readUnsignedShort();
		this.regionEndX = var1.readUnsignedShort();
		this.regionEndY = var1.readUnsignedShort();
		this.field3096 = var1.readUnsignedShort();
		this.field3095 = var1.readUnsignedShort();
		this.field3092 = var1.readUnsignedShort();
		this.field3099 = var1.readUnsignedShort();
		this.postRead();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1998585367"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(Lda;I)V",
		garbageValue = "-2014514008"
	)
	static final void method6018(Actor var0) {
		int var1 = Math.max(1, var0.spotAnimation - Client.cycle);
		int var2 = var0.field1247 * 128 + var0.field1268 * 936633408;
		int var3 = var0.field1249 * 128 + var0.field1268 * 936633408;
		var0.x += (var2 - var0.x) / var1;
		var0.y += (var3 - var0.y) / var1;
		var0.field1269 = 0;
		var0.orientation = var0.field1253;
	}
}
