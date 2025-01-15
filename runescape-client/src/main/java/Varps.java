import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nu")
@Implements("Varps")
public class Varps {
	@ObfuscatedName("ay")
	@Export("Varps_masks")
	static int[] Varps_masks;
	@ObfuscatedName("az")
	@Export("Varps_temp")
	public static int[] Varps_temp;
	@ObfuscatedName("ao")
	@Export("Varps_main")
	public static int[] Varps_main;

	static {
		Varps_masks = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			Varps_masks[var1] = var0 - 1;
			var0 += var0;
		}

		Varps_temp = new int[5000];
		Varps_main = new int[5000];
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(FFFI)Lqh;",
		garbageValue = "798739498"
	)
	public static class426 method6964(float var0, float var1, float var2) {
		synchronized(class426.field4746) {
			if (class426.field4742 == 0) {
				return new class426(var0, var1, var2);
			} else {
				class426.field4746[--class426.field4742].method8285(var0, var1, var2);
				return class426.field4746[class426.field4742];
			}
		}
	}
}
