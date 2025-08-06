import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ix")
@Implements("AABB")
public class AABB {
	@ObfuscatedName("ag")
	@Export("Tiles_underlays")
	static short[][][] Tiles_underlays;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1125797647
	)
	@Export("orientation")
	final int orientation;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -392229937
	)
	@Export("xMid")
	int xMid;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1559004315
	)
	@Export("yMid")
	int yMid;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -877901307
	)
	@Export("zMid")
	int zMid;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -246552103
	)
	@Export("xMidOffset")
	int xMidOffset;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -959237305
	)
	@Export("yMidOffset")
	int yMidOffset;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1345952159
	)
	@Export("zMidOffset")
	int zMidOffset;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lix;"
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "2067864621"
	)
	static final int method5347(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}
}
