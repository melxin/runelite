import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ru")
public class class459 implements Iterator {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	class460 field5212;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1301429347
	)
	int field5211;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1587579453
	)
	int field5210;

	@ObfuscatedSignature(
		descriptor = "(Lry;)V"
	)
	class459(class460 var1) {
		this.field5211 = 0;
		this.field5210 = this.field5212.field5214;
		this.field5212 = var1;
	}

	public Object next() {
		if (this.field5212.field5214 != this.field5210) {
			throw new ConcurrentModificationException();
		} else if (this.field5211 < this.field5212.field5216) {
			Object var1 = this.field5212.field5218[this.field5211].field5206;
			++this.field5211;
			return var1;
		} else {
			throw new NoSuchElementException();
		}
	}

	public boolean hasNext() {
		return this.field5211 < this.field5212.field5216;
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}
