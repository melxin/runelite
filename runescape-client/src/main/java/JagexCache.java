import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("in")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lws;"
	)
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lws;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;
	@ObfuscatedName("ac")
	@Export("userHomeDirectory")
	static String userHomeDirectory;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lws;"
	)
	@Export("JagexCache_randomDat")
	public static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("oh")
	static byte[][] field2586;

	static {
		JagexCache_dat2File = null;
		JagexCache_idx255File = null;
		JagexCache_randomDat = null;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lxa;[II)[Ljava/lang/Object;",
		garbageValue = "-983926347"
	)
	static Object[] method5102(Buffer var0, int[] var1) {
		int var2 = var0.readUShortSmart();
		Object[] var3 = new Object[var1.length * var2];

		for (int var4 = 0; var4 < var2; ++var4) {
			for (int var5 = 0; var5 < var1.length; ++var5) {
				int var6 = var1.length * var4 + var5;
				class586 var7 = class251.method5495(var1[var5]);
				var3[var6] = var7.method11436(var0);
			}
		}

		return var3;
	}
}
