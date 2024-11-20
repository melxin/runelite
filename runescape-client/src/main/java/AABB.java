import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jk")
@Implements("AABB")
public class AABB {
	@ObfuscatedName("vq")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1764701235
	)
	@Export("orientation")
	final int orientation;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1457712909
	)
	@Export("xMid")
	int xMid;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 565410795
	)
	@Export("yMid")
	int yMid;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -841799799
	)
	@Export("zMid")
	int zMid;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -252446047
	)
	@Export("xMidOffset")
	int xMidOffset;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -297231209
	)
	@Export("yMidOffset")
	int yMidOffset;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1584322801
	)
	@Export("zMidOffset")
	int zMidOffset;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvj;BIS)I",
		garbageValue = "23401"
	)
	public static int method5139(Buffer var0, byte var1, int var2) {
		int var3 = var1 >> var2 & 3;
		if (var3 == 3) {
			return var0.readInt();
		} else if (var3 == 2) {
			return var0.readShort();
		} else {
			return var3 == 1 ? var0.readByte() : 0;
		}
	}
}
