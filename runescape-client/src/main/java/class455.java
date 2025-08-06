import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rs")
public class class455 implements Iterator {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lrd;"
	)
	class456 field5093;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -194722363
	)
	int field5094;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 917862249
	)
	int field5095;

	@ObfuscatedSignature(
		descriptor = "(Lrd;)V"
	)
	class455(class456 var1) {
		this.field5094 = 0;
		this.field5095 = this.field5093.field5100;
		this.field5093 = var1;
	}

	public boolean hasNext() {
		return this.field5094 < this.field5093.field5096;
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	public Object next() {
		if (this.field5093.field5100 != this.field5095) {
			throw new ConcurrentModificationException();
		} else if (this.field5094 < this.field5093.field5096) {
			Object var1 = this.field5093.field5097[this.field5094].field5091;
			++this.field5094;
			return var1;
		} else {
			throw new NoSuchElementException();
		}
	}

	@ObfuscatedName("np")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2067432153"
	)
	static void method9225(int var0, int var1) {
		Archive.method8326(NPCComposition.tempMenuAction, var0, var1);
		NPCComposition.tempMenuAction = null;
	}
}
