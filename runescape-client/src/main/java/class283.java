import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ka")
public class class283 implements Comparator {
	class283() {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lkq;Lkq;I)I",
		garbageValue = "-914353785"
	)
	int method6351(class276 var1, class276 var2) {
		return var1.method6230() - var2.method6230();
	}

	public int compare(Object var1, Object var2) {
		return this.method6351((class276)var1, (class276)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
