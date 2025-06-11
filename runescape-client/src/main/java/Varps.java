import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nd")
@Implements("Varps")
public class Varps {
	@ObfuscatedName("aj")
	@Export("Varps_temp")
	public static int[] Varps_temp;
	@ObfuscatedName("an")
	@Export("Varps_main")
	public static int[] Varps_main;
	@ObfuscatedName("ai")
	@Export("Varps_masks")
	static int[] Varps_masks;
	@ObfuscatedName("al")
	@Export("SpriteBuffer_yOffsets")
	static int[] SpriteBuffer_yOffsets;
	@ObfuscatedName("ql")
	@ObfuscatedSignature(
		descriptor = "[Lwd;"
	)
	@Export("headIconHintSprites")
	static SpritePixels[] headIconHintSprites;
	@ObfuscatedName("wt")
	@ObfuscatedSignature(
		descriptor = "Ltb;"
	)
	@Export("masterDisk")
	static ArchiveDisk masterDisk;

	static {
		Varps_temp = new int[5000];
		Varps_main = new int[5000];
		Varps_masks = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			Varps_masks[var1] = var0 - 1;
			var0 += var0;
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "1"
	)
	public static void method7213(int var0, int var1) {
		VarbitComposition var2 = Interpreter.method1757(var0);
		int var3 = var2.baseVar;
		int var4 = var2.startBit;
		int var5 = var2.endBit;
		int var6 = Varps_masks[var5 - var4];
		if (var1 < 0 || var1 > var6) {
			var1 = 0;
		}

		var6 <<= var4;
		Varps_main[var3] = Varps_main[var3] & ~var6 | var1 << var4 & var6;
	}
}
