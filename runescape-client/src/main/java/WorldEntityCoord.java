import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ky")
@Implements("WorldEntityCoord")
public class WorldEntityCoord {
	@ObfuscatedName("au")
	static int[] field3277;
	@ObfuscatedName("ii")
	@Export("foundItemIds")
	static short[] foundItemIds;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 315892635
	)
	@Export("currentRotationAngle")
	int currentRotationAngle;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1103380165
	)
	@Export("x")
	int x;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -161970543
	)
	@Export("y")
	int y;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -397258981
	)
	@Export("z")
	int z;

	public WorldEntityCoord() {
		this.currentRotationAngle = 0;
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2136285697"
	)
	@Export("getX")
	public int getX() {
		return this.x;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1567439517"
	)
	@Export("getZ")
	public int getZ() {
		return this.z;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1928100821"
	)
	@Export("getY")
	public int getY() {
		return this.y;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "2"
	)
	@Export("getTileX")
	public int getTileX() {
		return this.x >> 7;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("getTileY")
	public int getTileY() {
		return this.y >> 7;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-200874373"
	)
	@Export("getCurrentRotationAngle")
	public int getCurrentRotationAngle() {
		return this.currentRotationAngle;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2061775482"
	)
	@Export("setCurrentRotationAngle")
	public void setCurrentRotationAngle(int var1) {
		this.currentRotationAngle = var1 & 2047;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lky;S)V",
		garbageValue = "8585"
	)
	public void method6282(WorldEntityCoord var1) {
		this.currentRotationAngle = var1.currentRotationAngle;
		this.x = var1.x;
		this.z = var1.z;
		this.y = var1.y;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-479093105"
	)
	public void method6275(int var1, int var2) {
		this.x = var1;
		this.y = var2;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-98"
	)
	@Export("setZ")
	public void setZ(int var1) {
		this.z = var1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "11641"
	)
	@Export("setDirection")
	public void setDirection(int var1, int var2) {
		this.x += var1;
		this.y += var2;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-2111902836"
	)
	public void method6301(int var1, int var2, int var3, int var4) {
		this.x += var1;
		this.z += var2;
		this.y += var3;
		this.setCurrentRotationAngle(var4 + this.currentRotationAngle);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lky;B)Z",
		garbageValue = "-116"
	)
	boolean method6287(WorldEntityCoord var1) {
		return this.x == var1.x && this.z == var1.z && this.y == var1.y && this.currentRotationAngle == var1.currentRotationAngle;
	}

	public boolean equals(Object var1) {
		return var1 instanceof WorldEntityCoord ? this.method6287((WorldEntityCoord)var1) : false;
	}

	public String toString() {
		return this.x + ", " + this.z + ", " + this.y + ", " + this.currentRotationAngle;
	}

	@ObfuscatedName("ng")
	@ObfuscatedSignature(
		descriptor = "(Lcu;ZI)V",
		garbageValue = "-788686614"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group;
		int var3 = (int)var0.key;
		var0.remove();
		if (var1) {
			UrlRequester.widgetDefinition.method7479(var2);
		}

		GameObject.method5797(var2);
		Widget var4 = UrlRequester.widgetDefinition.method7476(var3);
		if (var4 != null) {
			class89.invalidateWidget(var4);
		}

		if (Client.rootInterface != -1) {
			class142.runIntfCloseListeners(Client.rootInterface, 1);
		}

	}
}
