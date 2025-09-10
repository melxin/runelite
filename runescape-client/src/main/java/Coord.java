import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("na")
@Implements("Coord")
public class Coord {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1110557383
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1526442279
	)
	@Export("x")
	public int x;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1470369101
	)
	@Export("y")
	public int y;

	@ObfuscatedSignature(
		descriptor = "(Lna;)V"
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2019438893"
	)
	public void method7470(int var1) {
		if (var1 == -1) {
			this.plane = -1;
		} else {
			this.plane = var1 >> 28 & 3;
			this.x = var1 >> 14 & 16383;
			this.y = var1 & 16383;
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-619371584"
	)
	@Export("packed")
	public int packed() {
		return !this.method7462() ? -1 : method7461(this.plane, this.x, this.y);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1252148852"
	)
	public int method7426() {
		return method7461(this.plane, this.x >> 13, this.y >> 13);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "2"
	)
	public void method7422(int var1, int var2, int var3) {
		int var4 = var1 >> 14 & 255;
		int var5 = var1 & 255;
		this.plane = var1 >> 28;
		this.x = (var4 << 13) + var2;
		this.y = var3 + (var5 << 13);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-160803120"
	)
	boolean method7462() {
		return this.plane != -1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lna;I)Z",
		garbageValue = "2144353590"
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "-100"
	)
	@Export("toString")
	String toString(String var1) {
		return this.plane + var1 + (this.x >> 6) + var1 + (this.y >> 6) + var1 + (this.x & 63) + var1 + (this.y & 63);
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

	public int hashCode() {
		return this.packed();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-2012142743"
	)
	public static int method7461(int var0, int var1, int var2) {
		return var0 << 28 | var1 << 14 | var2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1980768950"
	)
	public static int method7413(int var0) {
		return var0 >> 28;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-749084993"
	)
	public static int method7424(int var0) {
		return var0 >> 14 & 16383;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-17"
	)
	public static int method7415(int var0) {
		return var0 & 16383;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "495308240"
	)
	public static int method7412(int var0) {
		return var0 << 6;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-187354178"
	)
	public static int method7417(int var0) {
		return var0 << 7;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "-30607"
	)
	public static int method7418(int var0, int var1) {
		return var0 + (var1 << 6);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1362396848"
	)
	public static int method7416(int var0) {
		return (var0 << 7) + 64;
	}
}
