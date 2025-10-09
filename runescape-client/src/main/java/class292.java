import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("li")
public class class292 implements WorldMapSection {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1249918445
	)
	int field3393;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1258698705
	)
	int field3385;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1002421873
	)
	int field3386;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -2035258571
	)
	int field3387;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 416495615
	)
	int field3390;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1781879675
	)
	int field3389;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 421840277
	)
	int field3392;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1382019373
	)
	int field3391;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -817024143
	)
	int field3384;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -279823241
	)
	int field3388;

	class292() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Llh;I)V",
		garbageValue = "-321528483"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field3390) {
			var1.regionLowX = this.field3390;
		}

		if (var1.regionHighX < this.field3390) {
			var1.regionHighX = this.field3390;
		}

		if (var1.regionLowY > this.field3389) {
			var1.regionLowY = this.field3389;
		}

		if (var1.regionHighY < this.field3389) {
			var1.regionHighY = this.field3389;
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1647486588"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field3393 && var1 < this.field3385 + this.field3393) {
			return var2 >= (this.field3386 << 6) + (this.field3392 << 3) && var2 <= (this.field3386 << 6) + (this.field3392 << 3) + 7 && var3 >= (this.field3387 << 6) + (this.field3391 << 3) && var3 <= (this.field3387 << 6) + (this.field3391 << 3) + 7;
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
		return var1 >= (this.field3390 << 6) + (this.field3384 << 3) && var1 <= (this.field3390 << 6) + (this.field3384 << 3) + 7 && var2 >= (this.field3389 << 6) + (this.field3388 << 3) && var2 <= (this.field3389 << 6) + (this.field3388 << 3) + 7;
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
			int[] var4 = new int[]{this.field3390 * 64 - this.field3386 * 64 + var2 + (this.field3384 * 8 - this.field3392 * 8), var3 + (this.field3389 * 64 - this.field3387 * 64) + (this.field3388 * 8 - this.field3391 * 8)};
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
			int var3 = this.field3386 * 64 - this.field3390 * 64 + (this.field3392 * 8 - this.field3384 * 8) + var1;
			int var4 = this.field3387 * 64 - this.field3389 * 64 + var2 + (this.field3391 * 8 - this.field3388 * 8);
			return new Coord(this.field3393, var3, var4);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lwj;B)V",
		garbageValue = "-7"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field3393 = var1.readUnsignedByte();
		this.field3385 = var1.readUnsignedByte();
		this.field3386 = var1.readUnsignedShort();
		this.field3392 = var1.readUnsignedByte();
		this.field3387 = var1.readUnsignedShort();
		this.field3391 = var1.readUnsignedByte();
		this.field3390 = var1.readUnsignedShort();
		this.field3384 = var1.readUnsignedByte();
		this.field3389 = var1.readUnsignedShort();
		this.field3388 = var1.readUnsignedByte();
		this.method6734();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1781200568"
	)
	void method6734() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-186822531"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		Player.addChatMessage(var0, var1, var2, (String)null);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)[Lpp;",
		garbageValue = "-40"
	)
	public static class393[] method6727() {
		return new class393[]{class393.field4852, class393.field4849, class393.field4850, class393.field4851};
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "8387104"
	)
	@Export("isAlphaNumeric")
	public static boolean isAlphaNumeric(char var0) {
		return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}
}
