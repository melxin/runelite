import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oq")
@Implements("Skills")
public class Skills {
	@ObfuscatedName("ay")
	@Export("Skills_enabled")
	public static final boolean[] Skills_enabled;
	@ObfuscatedName("au")
	@Export("Skills_experienceTable")
	public static int[] Skills_experienceTable;

	static {
		Skills_enabled = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false};
		Skills_experienceTable = new int[99];
		int var0 = 0;

		for (int var1 = 0; var1 < 99; ++var1) {
			int var2 = var1 + 1;
			int var3 = (int)((double)var2 + 300.0D * Math.pow(2.0D, (double)var2 / 7.0D));
			var0 += var3;
			Skills_experienceTable[var1] = var0 / 4;
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1773586847"
	)
	public static int method7501(int var0) {
		return (var0 & class561.field5517) - 1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lpl;II)Z",
		garbageValue = "1357021198"
	)
	public static boolean method7500(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1);
		if (var2 == null) {
			return false;
		} else {
			class478.SpriteBuffer_decode(var2);
			return true;
		}
	}
}
