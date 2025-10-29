import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ks")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
	@ObfuscatedName("ub")
	@ObfuscatedGetter(
		intValue = 549453511
	)
	static int field3280;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -119525533
	)
	@Export("approxDestinationX")
	public int approxDestinationX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1419634615
	)
	@Export("approxDestinationY")
	public int approxDestinationY;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 2063768593
	)
	@Export("approxDestinationSizeY")
	public int approxDestinationSizeY;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1083678259
	)
	@Export("approxDestinationSizeX")
	public int approxDestinationSizeX;

	protected RouteStrategy() {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIILkk;B)Z",
		garbageValue = "64"
	)
	@Export("hasArrived")
	protected abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([BIII)Ljava/lang/String;",
		garbageValue = "1895064943"
	)
	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2];
		int var4 = 0;

		for (int var5 = 0; var5 < var2; ++var5) {
			int var6 = var0[var5 + var1] & 255;
			if (var6 != 0) {
				if (var6 >= 128 && var6 < 160) {
					char var7 = class451.cp1252AsciiExtension[var6 - 128];
					if (var7 == 0) {
						var7 = '?';
					}

					var6 = var7;
				}

				var3[var4++] = (char)var6;
			}
		}

		return new String(var3, 0, var4);
	}
}
