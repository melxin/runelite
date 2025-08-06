import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jk")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1421468181
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = 782806108569820031L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1932754019
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -728590613
	)
	@Export("z")
	int z;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -419408947
	)
	@Export("centerX")
	int centerX;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1233022439
	)
	@Export("centerY")
	int centerY;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1816823841
	)
	@Export("startX")
	int startX;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -571975095
	)
	@Export("endX")
	int endX;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 113764389
	)
	@Export("startY")
	int startY;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -2115151203
	)
	@Export("endY")
	int endY;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -456866839
	)
	int field2999;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1044956951
	)
	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 18817421
	)
	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "28"
	)
	static int method5790(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
		if (var1 == null) {
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count;
		}
	}
}
