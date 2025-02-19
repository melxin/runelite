import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ku")
@Implements("WorldEntityCoord")
public class WorldEntityCoord {
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "Lws;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 986557265
	)
	@Export("currentRotationAngle")
	int currentRotationAngle;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -589896517
	)
	@Export("x")
	int x;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 697492007
	)
	@Export("y")
	int y;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -405580393
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
		descriptor = "(B)I",
		garbageValue = "19"
	)
	@Export("getX")
	public int getX() {
		return this.x;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1349987698"
	)
	@Export("getZ")
	public int getZ() {
		return this.z;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1172449722"
	)
	@Export("getY")
	public int getY() {
		return this.y;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2020545739"
	)
	@Export("getTileX")
	public int getTileX() {
		return this.x >> 7;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "703857090"
	)
	@Export("getTileY")
	public int getTileY() {
		return this.y >> 7;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "475407581"
	)
	@Export("getCurrentRotationAngle")
	public int getCurrentRotationAngle() {
		return this.currentRotationAngle;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lku;I)V",
		garbageValue = "-1693557961"
	)
	public void method5747(WorldEntityCoord var1) {
		this.currentRotationAngle = var1.currentRotationAngle;
		this.x = var1.x;
		this.z = var1.z;
		this.y = var1.y;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2013492847"
	)
	public void method5748(int var1, int var2) {
		this.x = var1;
		this.y = var2;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-19"
	)
	@Export("setCurrentRotationAngle")
	public void setCurrentRotationAngle(int var1) {
		this.currentRotationAngle = var1 & 2047;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2042852794"
	)
	@Export("setZ")
	public void setZ(int var1) {
		this.z = var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1185400996"
	)
	@Export("setDirection")
	public void setDirection(int var1, int var2) {
		this.x += var1;
		this.y += var2;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1383151892"
	)
	public void method5752(int var1, int var2, int var3, int var4) {
		this.x += var1;
		this.z += var2;
		this.y += var3;
		this.setCurrentRotationAngle(var4 + this.currentRotationAngle);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1191339749"
	)
	@Export("changeWorldSelectSorting")
	static void changeWorldSelectSorting(int var0, int var1) {
		int[] var2 = new int[4];
		int[] var3 = new int[4];
		var2[0] = var0;
		var3[0] = var1;
		int var4 = 1;

		for (int var5 = 0; var5 < 4; ++var5) {
			if (World.World_sortOption1[var5] != var0) {
				var2[var4] = World.World_sortOption1[var5];
				var3[var4] = World.World_sortOption2[var5];
				++var4;
			}
		}

		World.World_sortOption1 = var2;
		World.World_sortOption2 = var3;
		WorldMapEvent.sortWorlds(GZipDecompressor.World_worlds, 0, GZipDecompressor.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
	}
}
