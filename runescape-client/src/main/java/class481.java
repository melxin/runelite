import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sa")
public final class class481 implements Comparable {
	@ObfuscatedName("ap")
	Object field5158;
	@ObfuscatedName("aj")
	Object field5155;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		longValue = -6635221834971663709L
	)
	long field5157;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		longValue = -4853514340487862447L
	)
	long field5156;

	class481(Object var1, Object var2) {
		this.field5158 = var1;
		this.field5155 = var2;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lsa;B)I",
		garbageValue = "-102"
	)
	int method9484(class481 var1) {
		if (this.field5156 < var1.field5156) {
			return -1;
		} else {
			return this.field5156 > var1.field5156 ? 1 : 0;
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof class481) {
			return this.field5155.equals(((class481)var1).field5155);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public int hashCode() {
		return this.field5155.hashCode();
	}

	public int compareTo(Object var1) {
		return this.method9484((class481)var1);
	}
}
