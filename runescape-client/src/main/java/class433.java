import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qz")
public class class433 implements Iterator {
	@ObfuscatedName("ps")
	@ObfuscatedGetter(
		intValue = 886392145
	)
	static int field4786;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	class434 field4791;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 685335463
	)
	int field4790;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 316027243
	)
	int field4788;

	@ObfuscatedSignature(
		descriptor = "(Lqn;)V"
	)
	class433(class434 var1) {
		this.field4790 = 0;
		this.field4788 = this.field4791.field4796;
		this.field4791 = var1;
	}

	public boolean hasNext() {
		return this.field4790 < this.field4791.field4792;
	}

	public Object next() {
		if (this.field4791.field4796 != this.field4788) {
			throw new ConcurrentModificationException();
		} else if (this.field4790 < this.field4791.field4792) {
			Object var1 = this.field4791.field4793[this.field4790].field4785;
			++this.field4790;
			return var1;
		} else {
			throw new NoSuchElementException();
		}
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}
