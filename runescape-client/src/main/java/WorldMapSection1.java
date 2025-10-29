import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mn")
@Implements("WorldMapSection1")
public class WorldMapSection1 implements WorldMapSection {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 452965039
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1542708359
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 58323403
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -2121914509
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1591800825
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -370042613
	)
	@Export("regionEndY")
	int regionEndY;

	WorldMapSection1() {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lla;I)V",
		garbageValue = "-1683202969"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.regionEndX) {
			var1.regionLowX = this.regionEndX;
		}

		if (var1.regionHighX < this.regionEndX) {
			var1.regionHighX = this.regionEndX;
		}

		if (var1.regionLowY > this.regionEndY) {
			var1.regionLowY = this.regionEndY;
		}

		if (var1.regionHighY < this.regionEndY) {
			var1.regionHighY = this.regionEndY;
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "-15"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.minPlane + this.planes) {
			return var2 >> 6 == this.regionStartX && var3 >> 6 == this.regionStartY;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1836111411"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 == this.regionEndX && var2 >> 6 == this.regionEndY;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "35"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.regionEndX * 64 - this.regionStartX * 64 + var2, var3 + (this.regionEndY * 64 - this.regionStartY * 64)};
			return var4;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)Loj;",
		garbageValue = "216292671"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.regionStartX * 64 - this.regionEndX * 64 + var1;
			int var4 = this.regionStartY * 64 - this.regionEndY * 64 + var2;
			return new Coord(this.minPlane, var3, var4);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lxa;I)V",
		garbageValue = "-1666502772"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte();
		this.planes = var1.readUnsignedByte();
		this.regionStartX = var1.readUnsignedShort();
		this.regionStartY = var1.readUnsignedShort();
		this.regionEndX = var1.readUnsignedShort();
		this.regionEndY = var1.readUnsignedShort();
		this.postRead();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1494140945"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1760144535"
	)
	public static void method7059() {
		class182.field1851.clear();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfq;",
		garbageValue = "-97"
	)
	static class140 method7031(int var0) {
		class140[] var1 = new class140[]{class140.field1678, class140.field1673, class140.field1674, class140.field1672, class140.field1675, class140.field1676};
		class140 var2 = (class140)GrandExchangeOffer.findEnumerated(var1, var0);
		if (var2 == null) {
			var2 = class140.field1678;
		}

		return var2;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIIIB)Z",
		garbageValue = "1"
	)
	static boolean method7061(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		++var8;
		++var9;
		--var10;
		--var11;
		if (var0 >= var8 && var0 <= var10 && var1 >= var9 && var1 <= var11) {
			return true;
		} else if (var2 >= var8 && var2 <= var10 && var3 >= var9 && var3 <= var11) {
			return true;
		} else if (var4 >= var8 && var4 <= var10 && var5 >= var9 && var5 <= var11) {
			return true;
		} else if (var6 >= var8 && var6 <= var10 && var7 >= var9 && var7 <= var11) {
			return true;
		} else if (!WorldMapArea.method6694(var8, var9, var0, var1, var2, var3, var4, var5) && !WorldMapArea.method6694(var8, var11, var0, var1, var2, var3, var4, var5) && !WorldMapArea.method6694(var10, var9, var0, var1, var2, var3, var4, var5) && !WorldMapArea.method6694(var10, var11, var0, var1, var2, var3, var4, var5)) {
			return Actor.method2588(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var9) || Actor.method2588(var0, var1, var2, var3, var4, var5, var6, var7, var10, var9, var10, var11) || Actor.method2588(var0, var1, var2, var3, var4, var5, var6, var7, var10, var11, var8, var11) || Actor.method2588(var0, var1, var2, var3, var4, var5, var6, var7, var8, var11, var8, var9);
		} else {
			return true;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lky;IIIIFFFFIIII)Z",
		garbageValue = "201035158"
	)
	static final boolean method7043(Model var0, int var1, int var2, int var3, int var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11) {
		boolean var12 = ViewportMouse.ViewportMouse_isInViewport;
		if (!var12) {
			return false;
		} else {
			WorldMapEvent.method7176(var5, var6, var7, var8, var9, var10, var11);
			return class179.method4285(var0, var1, var2, var3, var4);
		}
	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(Lcr;I)V",
		garbageValue = "2124146858"
	)
	static final void method7032(Actor var0) {
		int var1 = Math.max(1, var0.spotAnimation - Client.cycle);
		int var2 = var0.size * -767295488 + var0.field1059 * 128;
		int var3 = var0.size * -767295488 + var0.field1061 * 128;
		var0.x += (var2 - var0.x) / var1;
		var0.y += (var3 - var0.y) / var1;
		var0.field1074 = 0;
		var0.orientation = var0.field1021;
	}
}
