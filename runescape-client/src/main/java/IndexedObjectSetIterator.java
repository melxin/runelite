import java.util.Iterator;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qe")
@Implements("IndexedObjectSetIterator")
public class IndexedObjectSetIterator implements Iterator {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lpd;"
	)
	IndexedObjectSet field4819;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Luj;"
	)
	IndexedObjectNode field4820;
	@ObfuscatedName("ae")
	int field4822;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Luj;"
	)
	IndexedObjectNode field4821;

	@ObfuscatedSignature(
		descriptor = "(Lpd;)V"
	)
	IndexedObjectSetIterator(IndexedObjectSet var1) {
		this.field4821 = null;
		this.field4819 = var1;
		this.method7968();
	}

	@ObfuscatedName("ao")
	void method7968() {
		this.field4820 = this.field4819.nodes[0].nextNode;
		this.field4822 = 1;
		this.field4821 = null;
	}

	public Object next() {
		IndexedObjectNode var1;
		if (this.field4819.nodes[this.field4822 - 1] != this.field4820) {
			var1 = this.field4820;
			this.field4820 = var1.nextNode;
			this.field4821 = var1;
			return var1;
		} else {
			do {
				if (this.field4822 >= this.field4819.size) {
					return null;
				}

				var1 = this.field4819.nodes[this.field4822++].nextNode;
			} while(var1 == this.field4819.nodes[this.field4822 - 1]);

			this.field4820 = var1.nextNode;
			this.field4821 = var1;
			return var1;
		}
	}

	public boolean hasNext() {
		if (this.field4819.nodes[this.field4822 - 1] != this.field4820) {
			return true;
		} else {
			while (this.field4822 < this.field4819.size) {
				if (this.field4819.nodes[this.field4822++].nextNode != this.field4819.nodes[this.field4822 - 1]) {
					this.field4820 = this.field4819.nodes[this.field4822 - 1].nextNode;
					return true;
				}

				this.field4820 = this.field4819.nodes[this.field4822 - 1];
			}

			return false;
		}
	}

	public void remove() {
		if (this.field4821 == null) {
			throw new IllegalStateException();
		} else {
			this.field4821.detach();
			this.field4821 = null;
		}
	}
}
