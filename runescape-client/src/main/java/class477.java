import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sf")
public class class477 {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 687530779
	)
	int field5199;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -31244103
	)
	int field5200;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1810979893
	)
	int field5201;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1863401497
	)
	int field5202;

	public String toString() {
		boolean var1 = true;
		int var2 = 10 - Integer.toString(this.field5199).length();
		int var3 = 10 - Integer.toString(this.field5201).length();
		int var4 = 10 - Integer.toString(this.field5200).length();
		String var5 = "          ".substring(10 - var2);
		String var6 = "          ".substring(10 - var3);
		String var7 = "          ".substring(10 - var4);
		return "    Size: " + this.field5199 + var5 + "Created: " + this.field5200 + var7 + "Total used: " + this.field5201 + var6 + "Max-In-Use: " + this.field5202;
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(Ldj;IIIB)I",
		garbageValue = "1"
	)
	static final int method9725(WorldView var0, int var1, int var2, int var3) {
		int var4 = var1 >> 7;
		int var5 = var2 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 < var0.tileSettings[0].length && var5 < var0.tileSettings[0][0].length) {
			int var6 = var3;
			if (var3 < 3 && (var0.tileSettings[1][var4][var5] & 2) == 2) {
				var6 = var3 + 1;
			}

			int var7 = var1 & 127;
			int var8 = var2 & 127;
			int var9 = var7 * var0.tileHeights[var6][var4 + 1][var5] + var0.tileHeights[var6][var4][var5] * (128 - var7) >> 7;
			int var10 = var0.tileHeights[var6][var4][var5 + 1] * (128 - var7) + var7 * var0.tileHeights[var6][var4 + 1][var5 + 1] >> 7;
			return var8 * var10 + var9 * (128 - var8) >> 7;
		} else {
			return 0;
		}
	}
}
