import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rj")
public class class457 implements Iterator {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lrq;"
	)
	class458 field5262;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1736114905
	)
	int field5263;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 495205855
	)
	int field5264;

	@ObfuscatedSignature(
		descriptor = "(Lrq;)V"
	)
	class457(class458 var1) {
		this.field5263 = 0;
		this.field5264 = this.field5262.field5269;
		this.field5262 = var1;
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	public Object next() {
		if (this.field5262.field5269 != this.field5264) {
			throw new ConcurrentModificationException();
		} else if (this.field5263 < this.field5262.field5266) {
			Object var1 = this.field5262.field5265[this.field5263].field5256;
			++this.field5263;
			return var1;
		} else {
			throw new NoSuchElementException();
		}
	}

	public boolean hasNext() {
		return this.field5263 < this.field5262.field5266;
	}
}
