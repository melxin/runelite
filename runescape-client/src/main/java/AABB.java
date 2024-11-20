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
	final int field2753;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1457712909
	)
	int field2748;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 565410795
	)
	int field2750;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -841799799
	)
	int field2745;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -252446047
	)
	int field2746;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -297231209
	)
	int field2747;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1584322801
	)
	int field2744;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	@Export("aabb")
	AABB aabb;

	AABB(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.field2753 = var1;
		this.field2748 = var2;
		this.field2750 = var3;
		this.field2745 = var4;
		this.field2746 = var5;
		this.field2747 = var6;
		this.field2744 = var7;
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
