import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sr")
public final class class491 implements Comparable {
	@ObfuscatedName("af")
	Object field5366;
	@ObfuscatedName("aw")
	Object field5364;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = 4488842729093890673L
	)
	long field5365;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = -1222121280041794025L
	)
	long field5367;

	class491(Object var1, Object var2) {
		this.field5366 = var1;
		this.field5364 = var2;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lsr;I)I",
		garbageValue = "395864971"
	)
	int method9838(class491 var1) {
		if (this.field5367 < var1.field5367) {
			return -1;
		} else {
			return this.field5367 > var1.field5367 ? 1 : 0;
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof class491) {
			return this.field5364.equals(((class491)var1).field5364);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public int compareTo(Object var1) {
		return this.method9838((class491)var1);
	}

	public int hashCode() {
		return this.field5364.hashCode();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Lwv;",
		garbageValue = "-63"
	)
	public static class574 method9850(int var0) {
		int var1 = class572.field5813[var0];
		if (var1 == 1) {
			return class574.field5820;
		} else if (var1 == 2) {
			return class574.field5824;
		} else {
			return var1 == 3 ? class574.field5816 : null;
		}
	}
}
