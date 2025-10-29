import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uh")
public enum class532 implements Enum {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Luh;"
	)
	field5635(3, 1),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Luh;"
	)
	field5630(1, 2),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Luh;"
	)
	field5631(2, 3),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Luh;"
	)
	field5632(0, 10);

	@ObfuscatedName("kb")
	@ObfuscatedGetter(
		intValue = 53560285
	)
	@Export("js5Port")
	static int js5Port;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 429561909
	)
	final int field5634;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 695919697
	)
	final int field5629;

	class532(int var3, int var4) {
		this.field5634 = var3;
		this.field5629 = var4;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "20"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5629;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lut;Ljava/lang/Object;III)V",
		garbageValue = "-1668673809"
	)
	public static void method10782(DynamicArray var0, Object var1, int var2, int var3) {
		class461.method9375(var0, (class586)null, true);
		if (var2 < 0) {
			var2 = 0;
		}

		int var4 = var3 + var2;
		if (var3 < 0 || var4 < 0 || var4 > var0.method10652()) {
			var4 = var0.method10652();
		}

		if (var0.field5584 == class586.field5937) {
			Arrays.fill(var0.method10650(), var2, var4, (Integer)var1);
		} else if (var0.field5584 == class586.field5942) {
			Arrays.fill(var0.method10651(), var2, var4, (Long)var1);
		} else {
			Arrays.fill(var0.method10681(), var2, var4, var1);
		}

	}

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "4036"
	)
	static int method10785(int var0, int var1) {
		int var2 = var1 - 334;
		if (var2 < 0) {
			var2 = 0;
		} else if (var2 > 100) {
			var2 = 100;
		}

		int var3 = (Client.zoomWidth - Client.zoomHeight) * var2 / 100 + Client.zoomHeight;
		return var0 * var3 / 256;
	}
}
