import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("os")
public final class class382 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;S)[B",
		garbageValue = "9897"
	)
	public static byte[] method8180(CharSequence var0) {
		int var1 = var0.length();
		byte[] var2 = new byte[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if (var4 > 127) {
				var2[var3] = 63;
			} else {
				var2[var3] = (byte)var4;
			}
		}

		return var2;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([BZB)Ljava/lang/Object;",
		garbageValue = "-9"
	)
	public static Object method8182(byte[] var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0.length > 136) {
			DirectByteArrayCopier var2 = new DirectByteArrayCopier();
			var2.set(var0);
			return var2;
		} else {
			return var0;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)Lti;",
		garbageValue = "540851298"
	)
	static DynamicArray method8181(int var0, Object var1) {
		DynamicArray var2 = (DynamicArray)var1;
		if (var2 == null) {
			throw new RuntimeException();
		} else {
			return var2;
		}
	}

	@ObfuscatedName("mn")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "1156249591"
	)
	static final void method8179(int var0, int var1, int var2, boolean var3) {
		if (UrlRequester.widgetDefinition.loadInterface(var0)) {
			class537.resizeInterface(UrlRequester.widgetDefinition.Widget_interfaceComponents[var0], 0, UrlRequester.widgetDefinition.Widget_interfaceComponents[var0].length - 1, -1, -1, var1, var2, var3);
		}
	}
}
