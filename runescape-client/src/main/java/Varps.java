import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("nm")
@Implements("Varps")
public class Varps {
	@ObfuscatedName("ab")
	@Export("Varps_temp")
	public static int[] Varps_temp;
	@ObfuscatedName("at")
	@Export("Varps_main")
	public static int[] Varps_main;
	@ObfuscatedName("ag")
	@Export("Varps_masks")
	static int[] Varps_masks;

	static {
		Varps_masks = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			Varps_masks[var1] = var0 - 1;
			var0 += var0;
		}

	}
}
