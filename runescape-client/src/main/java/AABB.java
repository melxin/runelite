import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("je")
@Implements("AABB")
public class AABB {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1506356863
	)
	@Export("orientation")
	final int orientation;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1721312265
	)
	@Export("xMid")
	int xMid;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1267849313
	)
	@Export("yMid")
	int yMid;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 266507379
	)
	@Export("zMid")
	int zMid;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 984504841
	)
	@Export("xMidOffset")
	int xMidOffset;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -157622439
	)
	@Export("yMidOffset")
	int yMidOffset;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 528344083
	)
	@Export("zMidOffset")
	int zMidOffset;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lje;"
	)
	@Export("aabb")
	AABB aabb;

	AABB(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.orientation = var1;
		this.xMid = var2;
		this.yMid = var3;
		this.zMid = var4;
		this.xMidOffset = var5;
		this.yMidOffset = var6;
		this.zMidOffset = var7;
	}
}
