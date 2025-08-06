import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("km")
@Implements("WorldEntityCoord")
public class WorldEntityCoord {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1294571729
	)
	@Export("currentRotationAngle")
	int currentRotationAngle;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 885615569
	)
	@Export("x")
	int x;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1886997969
	)
	@Export("y")
	int y;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 277200389
	)
	@Export("z")
	int z;

	public WorldEntityCoord() {
		this.currentRotationAngle = 0;
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "761635057"
	)
	@Export("getX")
	public int getX() {
		return this.x;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "87"
	)
	@Export("getZ")
	public int getZ() {
		return this.z;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1319561534"
	)
	@Export("getY")
	public int getY() {
		return this.y;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1445057426"
	)
	@Export("getTileX")
	public int getTileX() {
		return this.x >> 7;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1972050185"
	)
	@Export("getTileY")
	public int getTileY() {
		return this.y >> 7;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "16494"
	)
	@Export("getCurrentRotationAngle")
	public int getCurrentRotationAngle() {
		return this.currentRotationAngle;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-108"
	)
	@Export("setCurrentRotationAngle")
	public void setCurrentRotationAngle(int var1) {
		this.currentRotationAngle = var1 & 2047;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lkm;S)V",
		garbageValue = "27818"
	)
	public void method6255(WorldEntityCoord var1) {
		this.currentRotationAngle = var1.currentRotationAngle;
		this.x = var1.x;
		this.z = var1.z;
		this.y = var1.y;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1229969979"
	)
	public void method6256(int var1, int var2) {
		this.x = var1;
		this.y = var2;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1397338774"
	)
	@Export("setZ")
	public void setZ(int var1) {
		this.z = var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "79"
	)
	@Export("setDirection")
	public void setDirection(int var1, int var2) {
		this.x += var1;
		this.y += var2;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-93"
	)
	void method6259(int var1, int var2, int var3, int var4) {
		this.x += var1;
		this.z += var2;
		this.y += var3;
		this.setCurrentRotationAngle(var4 + this.currentRotationAngle);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lkm;I)Z",
		garbageValue = "-734454456"
	)
	boolean method6260(WorldEntityCoord var1) {
		return this.x == var1.x && this.z == var1.z && this.y == var1.y && this.currentRotationAngle == var1.currentRotationAngle;
	}

	public String toString() {
		return this.x + ", " + this.z + ", " + this.y + ", " + this.currentRotationAngle;
	}

	public boolean equals(Object var1) {
		return var1 instanceof WorldEntityCoord ? this.method6260((WorldEntityCoord)var1) : false;
	}
}
