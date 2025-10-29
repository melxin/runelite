import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rk")
public class class467 implements Iterator {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lsb;"
	)
	class468 field5289;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -439769195
	)
	int field5290;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1073278063
	)
	int field5291;

	@ObfuscatedSignature(
		descriptor = "(Lsb;)V"
	)
	class467(class468 var1) {
		this.field5290 = 0;
		this.field5291 = this.field5289.field5297;
		this.field5289 = var1;
	}

	public Object next() {
		if (this.field5289.field5297 != this.field5291) {
			throw new ConcurrentModificationException();
		} else if (this.field5290 < this.field5289.field5296) {
			Object var1 = this.field5289.field5300[this.field5290].field5286;
			++this.field5290;
			return var1;
		} else {
			throw new NoSuchElementException();
		}
	}

	public boolean hasNext() {
		return this.field5290 < this.field5289.field5296;
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}
