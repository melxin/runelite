import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sv")
class class487 implements Comparator {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lsf;"
	)
	final class488 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lsf;)V"
	)
	class487(class488 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lsc;Lsc;S)I",
		garbageValue = "-27185"
	)
	int method9904(class489 var1, class489 var2) {
		if (var1.field5418 > var2.field5418) {
			return 1;
		} else {
			return var1.field5418 < var2.field5418 ? -1 : 0;
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method9904((class489)var1, (class489)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "2"
	)
	static final int method9908(int var0, int var1) {
		int var2 = class377.method8177(var0 - 1, var1 - 1) + class377.method8177(1 + var0, var1 - 1) + class377.method8177(var0 - 1, 1 + var1) + class377.method8177(1 + var0, 1 + var1);
		int var3 = class377.method8177(var0 - 1, var1) + class377.method8177(1 + var0, var1) + class377.method8177(var0, var1 - 1) + class377.method8177(var0, 1 + var1);
		int var4 = class377.method8177(var0, var1);
		return var2 / 16 + var3 / 8 + var4 / 4;
	}
}
