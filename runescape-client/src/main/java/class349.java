import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nw")
public class class349 implements Comparator {
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1445448445
	)
	public static int field4014;
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "Lxc;"
	)
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;

	class349() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lnb;Lnb;I)I",
		garbageValue = "857312692"
	)
	int method7393(class342 var1, class342 var2) {
		return var1.field3960 - var2.field3960;
	}

	public int compare(Object var1, Object var2) {
		return this.method7393((class342)var1, (class342)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "612513511"
	)
	public static int method7392(CharSequence var0) {
		return AsyncRestClient.method178(var0, 10, true);
	}
}
