import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("np")
@Implements("Coord")
public class Coord {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 719968039
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1137350719
	)
	@Export("x")
	public int x;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1165521101
	)
	@Export("y")
	public int y;

	@ObfuscatedSignature(
		descriptor = "(Lnp;)V"
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "779893730"
	)
	public void method7241(int var1) {
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
		garbageValue = "1719340139"
	)
	@Export("packed")
	public int packed() {
		return !this.method7259() ? -1 : method7221(this.plane, this.x, this.y);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "297729785"
	)
	public int method7232() {
		return method7221(this.plane, this.x >> 13, this.y >> 13);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "665640436"
	)
	public void method7233(int var1, int var2, int var3) {
		int var4 = var1 >> 14 & 255;
		int var5 = var1 & 255;
		this.plane = var1 >> 28;
		this.x = (var4 << 13) + var2;
		this.y = var3 + (var5 << 13);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-13"
	)
	boolean method7259() {
		return this.plane != -1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lnp;I)Z",
		garbageValue = "-755170264"
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "-32"
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

	public String toString() {
		return this.toString(",");
	}

	public int hashCode() {
		return this.packed();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "2097484421"
	)
	public static int method7221(int var0, int var1, int var2) {
		return var0 << 28 | var1 << 14 | var2;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "20496"
	)
	public static int method7222(int var0) {
		return var0 >> 28;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1031594843"
	)
	public static int method7223(int var0) {
		return var0 >> 14 & 16383;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1032160004"
	)
	public static int method7224(int var0) {
		return var0 & 16383;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-320881403"
	)
	public static int method7225(int var0) {
		return var0 >> 3;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1576449522"
	)
	public static int method7274(int var0) {
		return var0 << 6;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1986357472"
	)
	public static int method7263(int var0) {
		return var0 << 3;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "1"
	)
	public static int method7228(int var0) {
		return var0 << 7;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "907970504"
	)
	public static int method7242(int var0) {
		return (var0 << 7) + 64;
	}
}
