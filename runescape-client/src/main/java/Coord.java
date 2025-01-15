import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nz")
@Implements("Coord")
public class Coord {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1769372871
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -556958301
	)
	@Export("x")
	public int x;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1962491797
	)
	@Export("y")
	public int y;

	@ObfuscatedSignature(
		descriptor = "(Lnz;)V"
	)
	public Coord(Coord var1) {
		this.plane = var1.plane;
		this.x = var1.x;
		this.y = var1.y;
	}

	public Coord(int var1, int var2, int var3) {
		this.plane = var1;
		this.x = var2;
		this.y = var3;
	}

	public Coord() {
		this.plane = -1;
	}

	public Coord(int var1) {
		if (var1 == -1) {
			this.plane = -1;
		} else {
			this.plane = var1 >> 28 & 3;
			this.x = var1 >> 14 & 16383;
			this.y = var1 & 16383;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1106107104"
	)
	public void method6967(int var1) {
		if (var1 == -1) {
			this.plane = -1;
		} else {
			this.plane = var1 >> 28 & 3;
			this.x = var1 >> 14 & 16383;
			this.y = var1 & 16383;
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "80"
	)
	@Export("packed")
	public int packed() {
		return method6969(this.plane, this.x, this.y);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "30362"
	)
	public int method6973() {
		return method6969(this.plane, this.x >> 13, this.y >> 13);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-331645768"
	)
	public void method7009(int var1, int var2, int var3) {
		int var4 = var1 >> 14 & 255;
		int var5 = var1 & 255;
		this.plane = var1 >> 28;
		this.x = (var4 << 13) + var2;
		this.y = var3 + (var5 << 13);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lnz;I)Z",
		garbageValue = "1423613074"
	)
	@Export("equalsCoord")
	boolean equalsCoord(Coord var1) {
		if (this.plane != var1.plane) {
			return false;
		} else if (this.x != var1.x) {
			return false;
		} else {
			return this.y == var1.y;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "-112"
	)
	@Export("toString")
	String toString(String var1) {
		return this.plane + var1 + (this.x >> 6) + var1 + (this.y >> 6) + var1 + (this.x & 63) + var1 + (this.y & 63);
	}

	public boolean equals(Object var1) {
		if (this == var1) {
			return true;
		} else {
			return !(var1 instanceof Coord) ? false : this.equalsCoord((Coord)var1);
		}
	}

	public int hashCode() {
		return this.packed();
	}

	public String toString() {
		return this.toString(",");
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "53"
	)
	public static int method6969(int var0, int var1, int var2) {
		return var0 << 28 | var1 << 14 | var2;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "257643024"
	)
	public static int method6965(int var0) {
		return var0 >> 28;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-820910170"
	)
	public static int method6971(int var0) {
		return var0 >> 14 & 16383;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-203751494"
	)
	public static int method6972(int var0) {
		return var0 & 16383;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "897125856"
	)
	public static int method6976(int var0) {
		return var0 >> 3;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "4"
	)
	public static int method6970(int var0) {
		return var0 << 3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1803954006"
	)
	public static int method6978(int var0) {
		return var0 << 6;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "36970397"
	)
	public static int method6979(int var0) {
		return var0 << 3;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1562226791"
	)
	public static int method6980(int var0) {
		return (var0 << 7) + 64;
	}
}
