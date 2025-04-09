import java.util.Comparator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("np")
public class class346 implements Comparator {
	@ObfuscatedName("vz")
	@ObfuscatedGetter(
		intValue = 1639087159
	)
	static int field3809;

	class346() {
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lna;Lna;I)I",
		garbageValue = "-1772614296"
	)
	int method6860(class339 var1, class339 var2) {
		return var1.field3764 - var2.field3764;
	}

	public int compare(Object var1, Object var2) {
		return this.method6860((class339)var1, (class339)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
