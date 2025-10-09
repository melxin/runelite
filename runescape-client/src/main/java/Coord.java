import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ny")
@Implements("Coord")
public class Coord {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1767433947
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -560139499
	)
	@Export("x")
	public int x;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 119460563
	)
	@Export("y")
	public int y;

	@ObfuscatedSignature(
		descriptor = "(Lny;)V"
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "4"
	)
	public void method7426(int var1) {
		if (var1 == -1) {
			this.plane = -1;
		} else {
			this.plane = var1 >> 28 & 3;
			this.x = var1 >> 14 & 16383;
			this.y = var1 & 16383;
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "972055690"
	)
	@Export("packed")
	public int packed() {
		return !this.method7430() ? -1 : method7419(this.plane, this.x, this.y);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1427015003"
	)
	public int method7428() {
		return method7419(this.plane, this.x >> 13, this.y >> 13);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "430670964"
	)
	public void method7431(int var1, int var2, int var3) {
		int var4 = var1 >> 14 & 255;
		int var5 = var1 & 255;
		this.plane = var1 >> 28;
		this.x = (var4 << 13) + var2;
		this.y = var3 + (var5 << 13);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	boolean method7430() {
		return this.plane != -1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lny;I)Z",
		garbageValue = "309318297"
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "50"
	)
	@Export("toString")
	String toString(String var1) {
		return this.plane + var1 + (this.x >> 6) + var1 + (this.y >> 6) + var1 + (this.x & 63) + var1 + (this.y & 63);
	}

	public int hashCode() {
		return this.packed();
	}

	public String toString() {
		return this.toString(",");
	}

	public boolean equals(Object var1) {
		if (this == var1) {
			return true;
		} else {
			return !(var1 instanceof Coord) ? false : this.equalsCoord((Coord)var1);
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1731925"
	)
	public static int method7419(int var0, int var1, int var2) {
		return var0 << 28 | var1 << 14 | var2;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1083884545"
	)
	public static int method7460(int var0) {
		return var0 >> 28;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1207807198"
	)
	public static int method7421(int var0) {
		return var0 >> 14 & 16383;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "2"
	)
	public static int method7469(int var0) {
		return var0 & 16383;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "839329896"
	)
	public static int method7423(int var0) {
		return var0 << 3;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-73"
	)
	public static int method7440(int var0) {
		return var0 << 7;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "8254594"
	)
	public static int method7425(int var0) {
		return (var0 << 7) + 64;
	}
}
