import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kg")
@Implements("WorldEntityCoord")
public class WorldEntityCoord {
	@ObfuscatedName("ap")
	@Export("Interpreter_objectLocals")
	static Object[] Interpreter_objectLocals;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -920600271
	)
	@Export("currentRotationAngle")
	int currentRotationAngle;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1017755391
	)
	@Export("x")
	int x;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 855251639
	)
	@Export("y")
	int y;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1774290117
	)
	@Export("z")
	int z;

	public WorldEntityCoord() {
		this.currentRotationAngle = 0;
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-703798972"
	)
	@Export("getX")
	public int getX() {
		return this.x;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "3"
	)
	@Export("getZ")
	public int getZ() {
		return this.z;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-423275440"
	)
	@Export("getY")
	public int getY() {
		return this.y;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-286734746"
	)
	@Export("getTileX")
	public int getTileX() {
		return this.x >> 7;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "456590338"
	)
	@Export("getTileY")
	public int getTileY() {
		return this.y >> 7;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1806229771"
	)
	@Export("getCurrentRotationAngle")
	public int getCurrentRotationAngle() {
		return this.currentRotationAngle;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "13492"
	)
	@Export("setCurrentRotationAngle")
	public void setCurrentRotationAngle(int var1) {
		this.currentRotationAngle = var1 & 2047;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lkg;B)V",
		garbageValue = "0"
	)
	public void method6291(WorldEntityCoord var1) {
		this.currentRotationAngle = var1.currentRotationAngle;
		this.x = var1.x;
		this.z = var1.z;
		this.y = var1.y;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-54"
	)
	public void method6292(int var1, int var2) {
		this.x = var1;
		this.y = var2;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1400492960"
	)
	@Export("setZ")
	public void setZ(int var1) {
		this.z = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-963978268"
	)
	@Export("setDirection")
	public void setDirection(int var1, int var2) {
		this.x += var1;
		this.y += var2;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1464069935"
	)
	public void method6294(int var1, int var2, int var3, int var4) {
		this.x += var1;
		this.z += var2;
		this.y += var3;
		this.setCurrentRotationAngle(var4 + this.currentRotationAngle);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lkg;B)Z",
		garbageValue = "1"
	)
	boolean method6296(WorldEntityCoord var1) {
		return this.x == var1.x && this.z == var1.z && this.y == var1.y && this.currentRotationAngle == var1.currentRotationAngle;
	}

	public String toString() {
		return this.x + ", " + this.z + ", " + this.y + ", " + this.currentRotationAngle;
	}

	public boolean equals(Object var1) {
		return var1 instanceof WorldEntityCoord ? this.method6296((WorldEntityCoord)var1) : false;
	}
}
