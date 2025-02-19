import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nq")
@Implements("Coord")
public class Coord {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1857558767
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 209378121
	)
	@Export("x")
	public int x;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -2010145965
	)
	@Export("y")
	public int y;

	@ObfuscatedSignature(
		descriptor = "(Lnq;)V"
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "78"
	)
	public void method6907(int var1) {
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
		descriptor = "(B)I",
		garbageValue = "96"
	)
	@Export("packed")
	public int packed() {
		return !this.method6877() ? -1 : method6863(this.plane, this.x, this.y);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1096251662"
	)
	public int method6867() {
		return method6863(this.plane, this.x >> 13, this.y >> 13);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1693544864"
	)
	public void method6868(int var1, int var2, int var3) {
		int var4 = var1 >> 14 & 255;
		int var5 = var1 & 255;
		this.plane = var1 >> 28;
		this.x = (var4 << 13) + var2;
		this.y = var3 + (var5 << 13);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "852426778"
	)
	boolean method6877() {
		return this.plane != -1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lnq;I)Z",
		garbageValue = "-1335221899"
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "10"
	)
	@Export("toString")
	String toString(String var1) {
		return this.plane + var1 + (this.x >> 6) + var1 + (this.y >> 6) + var1 + (this.x & 63) + var1 + (this.y & 63);
	}

	public int hashCode() {
		return this.packed();
	}

	public boolean equals(Object var1) {
		if (this == var1) {
			return true;
		} else {
			return !(var1 instanceof Coord) ? false : this.equalsCoord((Coord)var1);
		}
	}

	public String toString() {
		return this.toString(",");
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "830583216"
	)
	public static int method6863(int var0, int var1, int var2) {
		return var0 << 28 | var1 << 14 | var2;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-31"
	)
	public static int method6864(int var0) {
		return var0 >> 28;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1403132544"
	)
	public static int method6865(int var0) {
		return var0 >> 14 & 16383;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "54"
	)
	public static int method6861(int var0) {
		return var0 & 16383;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "735903678"
	)
	public static int method6874(int var0) {
		return var0 >> 3;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1688966731"
	)
	public static int method6875(int var0) {
		return var0 << 3;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-927950639"
	)
	public static int method6905(int var0) {
		return (var0 << 7) + 64;
	}
}
