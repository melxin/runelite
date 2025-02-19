import java.util.Comparator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nd")
public class class346 implements Comparator {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1975425553
	)
	public static int field3798;
	@ObfuscatedName("us")
	@ObfuscatedGetter(
		intValue = 380414627
	)
	static int field3797;

	class346() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lnh;Lnh;B)I",
		garbageValue = "59"
	)
	int method6840(class339 var1, class339 var2) {
		return var1.field3753 - var2.field3753;
	}

	public int compare(Object var1, Object var2) {
		return this.method6840((class339)var1, (class339)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
