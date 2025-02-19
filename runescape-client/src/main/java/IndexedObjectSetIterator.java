import java.util.Iterator;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qm")
@Implements("IndexedObjectSetIterator")
public class IndexedObjectSetIterator implements Iterator {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	IndexedObjectSet field4799;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	IndexedObjectNode field4796;
	@ObfuscatedName("au")
	int field4798;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	IndexedObjectNode field4797;

	@ObfuscatedSignature(
		descriptor = "(Lpj;)V"
	)
	IndexedObjectSetIterator(IndexedObjectSet var1) {
		this.field4797 = null;
		this.field4799 = var1;
		this.method7943();
	}

	@ObfuscatedName("ab")
	void method7943() {
		this.field4796 = this.field4799.nodes[0].nextNode;
		this.field4798 = 1;
		this.field4797 = null;
	}

	public boolean hasNext() {
		if (this.field4799.nodes[this.field4798 - 1] != this.field4796) {
			return true;
		} else {
			while (this.field4798 < this.field4799.size) {
				if (this.field4799.nodes[this.field4798++].nextNode != this.field4799.nodes[this.field4798 - 1]) {
					this.field4796 = this.field4799.nodes[this.field4798 - 1].nextNode;
					return true;
				}

				this.field4796 = this.field4799.nodes[this.field4798 - 1];
			}

			return false;
		}
	}

	public Object next() {
		IndexedObjectNode var1;
		if (this.field4799.nodes[this.field4798 - 1] != this.field4796) {
			var1 = this.field4796;
			this.field4796 = var1.nextNode;
			this.field4797 = var1;
			return var1;
		} else {
			do {
				if (this.field4798 >= this.field4799.size) {
					return null;
				}

				var1 = this.field4799.nodes[this.field4798++].nextNode;
			} while(var1 == this.field4799.nodes[this.field4798 - 1]);

			this.field4796 = var1.nextNode;
			this.field4797 = var1;
			return var1;
		}
	}

	public void remove() {
		if (this.field4797 == null) {
			throw new IllegalStateException();
		} else {
			this.field4797.detach();
			this.field4797 = null;
		}
	}
}
