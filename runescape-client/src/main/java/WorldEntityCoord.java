import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ks")
@Implements("WorldEntityCoord")
public class WorldEntityCoord {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -369415215
	)
	@Export("currentRotationAngle")
	int currentRotationAngle;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1846867525
	)
	@Export("x")
	int x;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1806402917
	)
	@Export("y")
	int y;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1220751115
	)
	@Export("z")
	int z;

	public WorldEntityCoord() {
		this.currentRotationAngle = 0;
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "80"
	)
	@Export("getX")
	public int getX() {
		return this.x;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-58"
	)
	@Export("getZ")
	public int getZ() {
		return this.z;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "864235813"
	)
	@Export("getY")
	public int getY() {
		return this.y;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "431390191"
	)
	@Export("getTileX")
	public int getTileX() {
		return this.x >> 7;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-53"
	)
	@Export("getTileY")
	public int getTileY() {
		return this.y >> 7;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-87"
	)
	@Export("getCurrentRotationAngle")
	public int getCurrentRotationAngle() {
		return this.currentRotationAngle;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lks;I)V",
		garbageValue = "-33689973"
	)
	public void method5899(WorldEntityCoord var1) {
		this.currentRotationAngle = var1.currentRotationAngle;
		this.x = var1.x;
		this.z = var1.z;
		this.y = var1.y;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "116"
	)
	public void method5902(int var1, int var2) {
		this.x = var1;
		this.y = var2;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "93"
	)
	public void method5900(int var1, int var2) {
		int var3 = var1 << 7;
		this.x = var3 + 64;
		int var4 = var2 << 7;
		this.y = var4 + 64;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1108931288"
	)
	@Export("setCurrentRotationAngle")
	public void setCurrentRotationAngle(int var1) {
		this.currentRotationAngle = var1 & 2047;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-771103473"
	)
	@Export("setZ")
	public void setZ(int var1) {
		this.z = var1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "251491445"
	)
	@Export("setDirection")
	public void setDirection(int var1, int var2) {
		this.x += var1;
		this.y += var2;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-84"
	)
	void method5921(int var1, int var2, int var3, int var4) {
		this.x += var1;
		this.z += var2;
		this.y += var3;
		this.setCurrentRotationAngle(var4 + this.currentRotationAngle);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-43"
	)
	@Export("isAlphaNumeric")
	public static boolean isAlphaNumeric(char var0) {
		return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}
}
