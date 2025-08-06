import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
public class class188 extends DualNode {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("field2007")
	public static EvictingDualNodeHashTable field2007;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lgk;"
	)
	static ClanSettings field2029;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -1376314429
	)
	static int field2027;
	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("archive8")
	static Archive archive8;

	static {
		field2007 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lpx;Lpx;II)Lin;",
		garbageValue = "-929524560"
	)
	public static Frames method4266(AbstractArchive var0, AbstractArchive var1, int var2) {
		boolean var3 = true;
		int var4 = -1;
		int[] var5 = var0.getGroupFileIds(var2);

		for (int var6 = 0; var6 < var5.length; ++var6) {
			byte[] var7 = var0.getFile(var2, var5[var6]);
			if (var7 == null) {
				var3 = false;
			} else if (var4 == -1) {
				var4 = (var7[0] & 255) << 8 | var7[1] & 255;
			}
		}

		if (var4 != -1) {
			byte[] var8 = var1.getFile(var4, 0);
			if (var8 == null) {
				var3 = false;
			}
		} else {
			var3 = false;
		}

		if (!var3) {
			return null;
		} else {
			try {
				return new Frames(var0, var1, var2);
			} catch (Exception var9) {
				return null;
			}
		}
	}
}
