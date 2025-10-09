import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kp")
public class class284 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;ZB)[B",
		garbageValue = "11"
	)
	public static byte[] method6399(Object var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0 instanceof byte[]) {
			byte[] var6 = (byte[])((byte[])var0);
			if (var1) {
				int var4 = var6.length;
				byte[] var5 = new byte[var4];
				System.arraycopy(var6, 0, var5, 0, var4);
				return var5;
			} else {
				return var6;
			}
		} else if (var0 instanceof AbstractByteArrayCopier) {
			AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0;
			return var2.get();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lni;IIIII)Lni;",
		garbageValue = "1879935098"
	)
	public static WidgetConfigNode method6398(WidgetConfigNode var0, int var1, int var2, int var3, int var4) {
		WidgetConfigNode var5 = var0;

		WidgetConfigNode var6;
		for (var6 = null; var5 != null; var5 = var5.nextWidgetConfigNode) {
			if (var5.end >= var1 && var5.start <= var2) {
				if (var6 != null) {
					var6.nextWidgetConfigNode = var5.nextWidgetConfigNode;
				} else {
					var0 = var5.nextWidgetConfigNode;
				}

				WidgetConfigNode var7;
				if (var5.start < var1) {
					var7 = new WidgetConfigNode(var5.start, var1 - 1, var5.clickMask, var5.opMask);
					if (var6 != null) {
						var7.nextWidgetConfigNode = var6.nextWidgetConfigNode;
					} else {
						var7.nextWidgetConfigNode = var0;
					}

					if (var6 != null) {
						var6.nextWidgetConfigNode = var7;
					} else {
						var0 = var7;
					}

					var6 = var7;
				}

				if (var5.end > var2) {
					var7 = new WidgetConfigNode(var2 + 1, var5.end, var5.clickMask, var5.opMask);
					if (var6 != null) {
						var7.nextWidgetConfigNode = var6.nextWidgetConfigNode;
					} else {
						var7.nextWidgetConfigNode = var0;
					}

					if (var6 != null) {
						var6.nextWidgetConfigNode = var7;
					} else {
						var0 = var7;
					}
				}
			}

			var6 = var5;
		}

		var5 = null;

		for (var6 = var0; var6 != null && var6.start <= var1; var6 = var6.nextWidgetConfigNode) {
			var5 = var6;
		}

		var6 = new WidgetConfigNode(var1, var2, var3, var4);
		if (var5 != null) {
			var6.nextWidgetConfigNode = var5.nextWidgetConfigNode;
		} else {
			var6.nextWidgetConfigNode = var0;
		}

		if (var5 != null) {
			var5.nextWidgetConfigNode = var6;
		} else {
			var0 = var6;
		}

		return var0;
	}
}
