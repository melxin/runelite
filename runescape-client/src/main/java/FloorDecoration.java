import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ir")
@Implements("FloorDecoration")
public final class FloorDecoration {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	@Export("soundSystem")
	public static SoundSystem soundSystem;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = 7455486665087214275L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1639897407
	)
	@Export("z")
	int z;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 2098674451
	)
	@Export("x")
	int x;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1597463225
	)
	@Export("y")
	int y;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1239571067
	)
	@Export("flags")
	int flags;

	FloorDecoration() {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-613264871"
	)
	public static void method4911(int var0, int var1) {
		VarbitComposition var2 = MenuAction.method1890(var0);
		int var3 = var2.baseVar;
		int var4 = var2.startBit;
		int var5 = var2.endBit;
		int var6 = Varps.Varps_masks[var5 - var4];
		if (var1 < 0 || var1 > var6) {
			var1 = 0;
		}

		var6 <<= var4;
		Varps.Varps_main[var3] = Varps.Varps_main[var3] & ~var6 | var1 << var4 & var6;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-23"
	)
	static int method4910(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
		if (var1 == null) {
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count;
		}
	}
}
