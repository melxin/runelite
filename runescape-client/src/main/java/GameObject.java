import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ju")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1008918747
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		longValue = -2827712403474703L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1432405507
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1145605769
	)
	@Export("z")
	int z;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1824669671
	)
	@Export("centerX")
	int centerX;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2064427561
	)
	@Export("centerY")
	int centerY;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1050130219
	)
	@Export("startX")
	int startX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 2125484985
	)
	@Export("endX")
	int endX;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -561334741
	)
	@Export("startY")
	int startY;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1381641623
	)
	@Export("endY")
	int endY;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1978577731
	)
	int field3060;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1926664053
	)
	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -37538361
	)
	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "1760046722"
	)
	public static int method5850(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			var2 = (var2 << 5) - var2 + var0.charAt(var3);
		}

		return var2;
	}
}
