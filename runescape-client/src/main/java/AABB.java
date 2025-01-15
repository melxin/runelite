import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hr")
@Implements("AABB")
public class AABB {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1086242221
	)
	@Export("orientation")
	final int orientation;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -999433467
	)
	@Export("xMid")
	int xMid;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1443786081
	)
	@Export("yMid")
	int yMid;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1400987047
	)
	@Export("zMid")
	int zMid;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1660098557
	)
	@Export("xMidOffset")
	int xMidOffset;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -816988281
	)
	@Export("yMidOffset")
	int yMidOffset;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1447957023
	)
	@Export("zMidOffset")
	int zMidOffset;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lhr;"
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
