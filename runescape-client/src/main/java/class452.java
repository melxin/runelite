import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rr")
public class class452 implements Iterator {
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	public static AbstractArchive field5016;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lrq;"
	)
	class453 field5013;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -811791685
	)
	int field5014;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 315447363
	)
	int field5015;

	@ObfuscatedSignature(
		descriptor = "(Lrq;)V"
	)
	class452(class453 var1) {
		this.field5014 = 0;
		this.field5015 = this.field5013.field5021;
		this.field5013 = var1;
	}

	public boolean hasNext() {
		return this.field5014 < this.field5013.field5020;
	}

	public Object next() {
		if (this.field5013.field5021 != this.field5015) {
			throw new ConcurrentModificationException();
		} else if (this.field5014 < this.field5013.field5020) {
			Object var1 = this.field5013.field5018[this.field5014].field5012;
			++this.field5014;
			return var1;
		} else {
			throw new NoSuchElementException();
		}
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}
