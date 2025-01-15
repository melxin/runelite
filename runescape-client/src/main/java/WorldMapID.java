import java.util.concurrent.ThreadPoolExecutor;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lw")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Llw;"
	)
	static final WorldMapID field3247;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Llw;"
	)
	static final WorldMapID field3241;
	@ObfuscatedName("ae")
	static int[][] field3244;
	@ObfuscatedName("ax")
	static ThreadPoolExecutor field3245;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -112446325
	)
	@Export("value")
	final int value;

	static {
		field3247 = new WorldMapID(0);
		field3241 = new WorldMapID(1);
	}

	WorldMapID(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)[I",
		garbageValue = "2004102191"
	)
	static int[] method6402(int var0, int var1, int var2, int var3, int var4) {
		int[] var5 = new int[256];

		int var6;
		for (var6 = 0; var6 < 64; ++var6) {
			var5[var6] = class135.method3445(var0, var1, var6);
		}

		for (var6 = 0; var6 < 64; ++var6) {
			var5[var6 + 64] = class135.method3445(var1, var2, var6);
		}

		for (var6 = 0; var6 < 64; ++var6) {
			var5[var6 + 128] = class135.method3445(var2, var3, var6);
		}

		for (var6 = 0; var6 < 64; ++var6) {
			var5[var6 + 192] = class135.method3445(var3, var4, var6);
		}

		return var5;
	}
}
