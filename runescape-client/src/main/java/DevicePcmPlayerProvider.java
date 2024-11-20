import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aa")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class51 {
	@ObfuscatedName("ak")
	static String[] field107;

	DevicePcmPlayerProvider() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Lbx;",
		garbageValue = "91"
	)
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1227939366"
	)
	public static void method297() {
		class177.field1842.clear();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IZI)[B",
		garbageValue = "-1644730683"
	)
	@Export("ByteArrayPool_getArrayBool")
	public static byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
		synchronized(ByteArrayPool.field4897) {
			byte[] var3;
			if ((var0 == 100 || var0 < 100 && var1) && ByteArrayPool.ByteArrayPool_smallCount > 0) {
				var3 = ByteArrayPool.ByteArrayPool_small[--ByteArrayPool.ByteArrayPool_smallCount];
				ByteArrayPool.ByteArrayPool_small[ByteArrayPool.ByteArrayPool_smallCount] = null;
				return var3;
			}

			if ((var0 == 5000 || var0 < 5000 && var1) && ByteArrayPool.ByteArrayPool_mediumCount > 0) {
				var3 = ByteArrayPool.ByteArrayPool_medium[--ByteArrayPool.ByteArrayPool_mediumCount];
				ByteArrayPool.ByteArrayPool_medium[ByteArrayPool.ByteArrayPool_mediumCount] = null;
				return var3;
			}

			if ((var0 == 10000 || var0 < 10000 && var1) && ByteArrayPool.ByteArrayPool_largeCount > 0) {
				var3 = ByteArrayPool.ByteArrayPool_large[--ByteArrayPool.ByteArrayPool_largeCount];
				ByteArrayPool.ByteArrayPool_large[ByteArrayPool.ByteArrayPool_largeCount] = null;
				return var3;
			}

			if ((var0 == 30000 || var0 < 30000 && var1) && ByteArrayPool.field4910 > 0) {
				var3 = ByteArrayPool.field4909[--ByteArrayPool.field4910];
				ByteArrayPool.field4909[ByteArrayPool.field4910] = null;
				return var3;
			}

			int var6;
			if (ByteArrayPool.ByteArrayPool_arrays != null) {
				for (var6 = 0; var6 < HealthBarDefinition.ByteArrayPool_alternativeSizes.length; ++var6) {
					if ((HealthBarDefinition.ByteArrayPool_alternativeSizes[var6] == var0 || var0 < HealthBarDefinition.ByteArrayPool_alternativeSizes[var6] && var1) && class201.ByteArrayPool_altSizeArrayCounts[var6] > 0) {
						byte[] var4 = ByteArrayPool.ByteArrayPool_arrays[var6][--class201.ByteArrayPool_altSizeArrayCounts[var6]];
						ByteArrayPool.ByteArrayPool_arrays[var6][class201.ByteArrayPool_altSizeArrayCounts[var6]] = null;
						return var4;
					}
				}
			}

			if (var1 && HealthBarDefinition.ByteArrayPool_alternativeSizes != null) {
				for (var6 = 0; var6 < HealthBarDefinition.ByteArrayPool_alternativeSizes.length; ++var6) {
					if (var0 <= HealthBarDefinition.ByteArrayPool_alternativeSizes[var6] && class201.ByteArrayPool_altSizeArrayCounts[var6] < ByteArrayPool.ByteArrayPool_arrays[var6].length) {
						return new byte[HealthBarDefinition.ByteArrayPool_alternativeSizes[var6]];
					}
				}
			}
		}

		return new byte[var0];
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lbc;I)V",
		garbageValue = "1526363551"
	)
	public static final void method301(class51 var0) {
		class31.pcmPlayerProvider = var0;
	}

	@ObfuscatedName("nw")
	@ObfuscatedSignature(
		descriptor = "(Lnp;IIII)V",
		garbageValue = "1001426737"
	)
	static final void method303(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.method7256(class379.widgetDefinition, false);
		if (var4 != null) {
			if (Client.minimapState < 3) {
				HealthBarDefinition.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

		}
	}
}
