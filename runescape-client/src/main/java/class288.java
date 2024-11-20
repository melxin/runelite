import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lr")
public class class288 implements WorldMapSection {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1970889319
	)
	int field3169;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1806835323
	)
	int field3163;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -767858491
	)
	int field3165;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1450359933
	)
	int field3166;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 649575547
	)
	int field3167;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -604202055
	)
	int field3168;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 145149299
	)
	int field3164;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -62256197
	)
	int field3170;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -128473443
	)
	int field3171;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 119763703
	)
	int field3172;

	class288() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lkt;I)V",
		garbageValue = "-1753900965"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field3167) {
			var1.regionLowX = this.field3167;
		}

		if (var1.regionHighX < this.field3167) {
			var1.regionHighX = this.field3167;
		}

		if (var1.regionLowY > this.field3168) {
			var1.regionLowY = this.field3168;
		}

		if (var1.regionHighY < this.field3168) {
			var1.regionHighY = this.field3168;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "58"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field3169 && var1 < this.field3163 + this.field3169) {
			return var2 >= (this.field3165 << 6) + (this.field3164 << 3) && var2 <= (this.field3165 << 6) + (this.field3164 << 3) + 7 && var3 >= (this.field3166 << 6) + (this.field3170 << 3) && var3 <= (this.field3166 << 6) + (this.field3170 << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "719649251"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field3167 << 6) + (this.field3171 << 3) && var1 <= (this.field3167 << 6) + (this.field3171 << 3) + 7 && var2 >= (this.field3168 << 6) + (this.field3172 << 3) && var2 <= (this.field3168 << 6) + (this.field3172 << 3) + 7;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-439069343"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.field3167 * 64 - this.field3165 * 64 + var2 + (this.field3171 * 8 - this.field3164 * 8), var3 + (this.field3168 * 64 - this.field3166 * 64) + (this.field3172 * 8 - this.field3170 * 8)};
			return var4;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIS)Lny;",
		garbageValue = "-17070"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.field3165 * 64 - this.field3167 * 64 + (this.field3164 * 8 - this.field3171 * 8) + var1;
			int var4 = this.field3166 * 64 - this.field3168 * 64 + var2 + (this.field3170 * 8 - this.field3172 * 8);
			return new Coord(this.field3169, var3, var4);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvj;I)V",
		garbageValue = "2089662585"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field3169 = var1.readUnsignedByte();
		this.field3163 = var1.readUnsignedByte();
		this.field3165 = var1.readUnsignedShort();
		this.field3164 = var1.readUnsignedByte();
		this.field3166 = var1.readUnsignedShort();
		this.field3170 = var1.readUnsignedByte();
		this.field3167 = var1.readUnsignedShort();
		this.field3171 = var1.readUnsignedByte();
		this.field3168 = var1.readUnsignedShort();
		this.field3172 = var1.readUnsignedByte();
		this.method6118();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1387781017"
	)
	void method6118() {
	}

	@ObfuscatedName("aj")
	public static int method6120(long var0) {
		return (int)(var0 >>> 14 & 3L);
	}
}
