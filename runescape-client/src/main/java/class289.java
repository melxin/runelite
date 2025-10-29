import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ly")
public class class289 implements Comparator {
	@ObfuscatedName("px")
	@ObfuscatedGetter(
		intValue = -971818949
	)
	@Export("oculusOrbFocalPointZ")
	static int oculusOrbFocalPointZ;

	class289() {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lkc;Lkc;B)I",
		garbageValue = "58"
	)
	int method6550(class282 var1, class282 var2) {
		return var1.method6399() - var2.method6399();
	}

	public int compare(Object var1, Object var2) {
		return this.method6550((class282)var1, (class282)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
