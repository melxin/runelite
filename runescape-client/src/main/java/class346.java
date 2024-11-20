import java.util.BitSet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nu")
public class class346 extends Node {
	@ObfuscatedName("vy")
	@ObfuscatedSignature(
		descriptor = "Lsr;"
	)
	@Export("masterDisk")
	static ArchiveDisk masterDisk;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1319749501
	)
	int field3752;
	@ObfuscatedName("aw")
	BitSet field3750;

	class346(int var1) {
		this.field3752 = var1;
		this.field3750 = new BitSet(128);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ldm;IIIII)V",
		garbageValue = "-1746359288"
	)
	static final void method6797(WorldView var0, int var1, int var2, int var3, int var4) {
		int[][][] var5 = var0.tileHeights;
		int var6 = var0.sizeX - 1;
		int var7 = var0.sizeY - 1;

		for (int var8 = var2; var8 <= var2 + var4; ++var8) {
			for (int var9 = var1; var9 <= var3 + var1; ++var9) {
				if (var9 >= 0 && var9 < var5[0].length - 1 && var8 >= 0 && var8 < var5[0][0].length - 1) {
					DirectByteArrayCopier.Tiles_underlays2[0][var9][var8] = 127;
					if (var9 == var1 && var9 > 0) {
						var5[0][var9][var8] = var5[0][var9 - 1][var8];
					}

					if (var3 + var1 == var9 && var9 < var6) {
						var5[0][var9][var8] = var5[0][var9 + 1][var8];
					}

					if (var8 == var2 && var8 > 0) {
						var5[0][var9][var8] = var5[0][var9][var8 - 1];
					}

					if (var8 == var2 + var4 && var8 < var7) {
						var5[0][var9][var8] = var5[0][var9][var8 + 1];
					}
				}
			}
		}

	}
}
