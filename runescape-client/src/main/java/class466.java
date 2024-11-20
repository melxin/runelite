import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rh")
public final class class466 implements Comparable {
	@ObfuscatedName("ab")
	Object field4969;
	@ObfuscatedName("aw")
	Object field4967;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = 3323132709681120067L
	)
	long field4968;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = 8352754032266256715L
	)
	long field4970;

	class466(Object var1, Object var2) {
		this.field4969 = var1;
		this.field4967 = var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lrh;I)I",
		garbageValue = "518719793"
	)
	int method8898(class466 var1) {
		if (this.field4970 < var1.field4970) {
			return -1;
		} else {
			return this.field4970 > var1.field4970 ? 1 : 0;
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof class466) {
			return this.field4967.equals(((class466)var1).field4967);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public int hashCode() {
		return this.field4967.hashCode();
	}

	public int compareTo(Object var1) {
		return this.method8898((class466)var1);
	}
}
