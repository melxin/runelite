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
		intValue = -954068989
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 177892159
	)
	@Export("x")
	public int x;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1098615431
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1969102048"
	)
	public void method6811(int var1) {
		if (var1 == -1) {
			this.plane = -1;
		} else {
			this.plane = var1 >> 28 & 3;
			this.x = var1 >> 14 & 16383;
			this.y = var1 & 16383;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-995056173"
	)
	@Export("packed")
	public int packed() {
		return method6812(this.plane, this.x, this.y);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-304054772"
	)
	public int method6816() {
		return method6812(this.plane, this.x >> 13, this.y >> 13);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "38"
	)
	public void method6817(int var1, int var2, int var3) {
		int var4 = var1 >> 14 & 255;
		int var5 = var1 & 255;
		this.plane = var1 >> 28;
		this.x = (var4 << 13) + var2;
		this.y = var3 + (var5 << 13);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lny;I)Z",
		garbageValue = "312297903"
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1278757739"
	)
	@Export("toString")
	String toString(String var1) {
		return this.plane + var1 + (this.x >> 6) + var1 + (this.y >> 6) + var1 + (this.x & 63) + var1 + (this.y & 63);
	}

	public String toString() {
		return this.toString(",");
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "62"
	)
	public static int method6812(int var0, int var1, int var2) {
		return var0 << 28 | var1 << 14 | var2;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1546963530"
	)
	public static int method6813(int var0) {
		return var0 >> 28;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-860377"
	)
	public static int method6814(int var0) {
		return var0 >> 14 & 16383;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "923055916"
	)
	public static int method6815(int var0) {
		return var0 & 16383;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-6"
	)
	public static int method6822(int var0) {
		return var0 << 3;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-73"
	)
	public static int method6823(int var0) {
		return var0 << 6;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1321423993"
	)
	public static int method6819(int var0) {
		return var0 << 3;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "29"
	)
	public static int method6825(int var0) {
		return var0 << 7;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-769362130"
	)
	public static int method6843(int var0) {
		return (var0 << 7) + 64;
	}
}
