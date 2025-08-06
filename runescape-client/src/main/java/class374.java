import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ow")
public class class374 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	@Export("huffman")
	public static Huffman huffman;

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-299720906"
	)
	static final void method8116(int var0, int var1) {
		if (var0 < 128) {
			var0 = 128;
		} else if (var0 > 383) {
			var0 = 383;
		}

		if (class187.cameraPitch < var0) {
			class187.cameraPitch = (var0 - class187.cameraPitch) * class141.field1694 / 1000 + class187.cameraPitch + EnumComposition.field2034;
			if (class187.cameraPitch > var0) {
				class187.cameraPitch = var0;
			}
		} else if (class187.cameraPitch > var0) {
			class187.cameraPitch -= (class187.cameraPitch - var0) * class141.field1694 / 1000 + EnumComposition.field2034;
			if (class187.cameraPitch < var0) {
				class187.cameraPitch = var0;
			}
		}

		var1 &= 2047;
		int var2 = var1 - class28.cameraYaw;
		if (var2 > 1024) {
			var2 -= 2048;
		} else if (var2 < -1024) {
			var2 += 2048;
		}

		if (var2 > 0) {
			class28.cameraYaw = class28.cameraYaw + EnumComposition.field2034 + var2 * class141.field1694 / 1000;
			class28.cameraYaw &= 2047;
		} else if (var2 < 0) {
			class28.cameraYaw -= EnumComposition.field2034 + -var2 * class141.field1694 / 1000;
			class28.cameraYaw &= 2047;
		}

		int var3 = var1 - class28.cameraYaw;
		if (var3 > 1024) {
			var3 -= 2048;
		} else if (var3 < -1024) {
			var3 += 2048;
		}

		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) {
			class28.cameraYaw = var1;
		}

	}

	@ObfuscatedName("od")
	@ObfuscatedSignature(
		descriptor = "(Lwj;IB)V",
		garbageValue = "72"
	)
	static void method8127(Buffer var0, int var1) {
		VarbitComposition.method4479(var0.offset, var1);
		class139.method3697(var0, var1);
	}
}
