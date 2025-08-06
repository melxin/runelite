import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jp")
@Implements("BoundaryObject")
public final class BoundaryObject {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = -9114907871266542199L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 113748867
	)
	@Export("z")
	int z;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -738263123
	)
	@Export("x")
	int x;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -255134201
	)
	@Export("y")
	int y;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 2071044347
	)
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1173420951
	)
	@Export("orientationB")
	int orientationB;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1753440193
	)
	@Export("flags")
	int flags;

	BoundaryObject() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1476039788"
	)
	public static int method5776(int var0) {
		return class531.field5464[var0 & 16383];
	}

	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "-62"
	)
	@Export("formatItemStacks")
	static final String formatItemStacks(int var0) {
		String var1 = Integer.toString(var0);

		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
			var1 = var1.substring(0, var2) + "," + var1.substring(var2);
		}

		if (var1.length() > 9) {
			return " " + ObjectSound.colorStartTag(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
		} else {
			return var1.length() > 6 ? " " + ObjectSound.colorStartTag(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + ObjectSound.colorStartTag(16776960) + var1 + "</col>";
		}
	}
}
