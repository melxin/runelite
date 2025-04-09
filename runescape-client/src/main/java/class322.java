import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mn")
public class class322 {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	public static void method6543() {
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear();
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(Lnh;Lnh;I)V",
		garbageValue = "-621936915"
	)
	static void method6542(Widget var0, Widget var1) {
		if (var0.type == 0) {
			for (int var2 = var0.field3962; var2 <= var0.field3968; ++var2) {
				Widget var3 = var1.children[var2];
				if (var0.childIndex * -1626125685 == var3.field3960) {
					method6542(var3, var1);
				}
			}
		}

		var1.children[var0.childIndex * -1626125685] = null;
	}

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(III)Ljava/lang/String;",
		garbageValue = "-1367957264"
	)
	static final String method6541(int var0, int var1) {
		int var2 = var1 - var0;
		if (var2 < -9) {
			return Decimator.colorStartTag(16711680);
		} else if (var2 < -6) {
			return Decimator.colorStartTag(16723968);
		} else if (var2 < -3) {
			return Decimator.colorStartTag(16740352);
		} else if (var2 < 0) {
			return Decimator.colorStartTag(16756736);
		} else if (var2 > 9) {
			return Decimator.colorStartTag(65280);
		} else if (var2 > 6) {
			return Decimator.colorStartTag(4259584);
		} else if (var2 > 3) {
			return Decimator.colorStartTag(8453888);
		} else {
			return var2 > 0 ? Decimator.colorStartTag(12648192) : Decimator.colorStartTag(16776960);
		}
	}

	@ObfuscatedName("mu")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1126958508"
	)
	static void method6540(int var0, int var1) {
		class76.method2258(class6.tempMenuAction, var0, var1);
		class6.tempMenuAction = null;
	}
}
