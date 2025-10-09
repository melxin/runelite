import java.util.Iterator;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qa")
@Implements("IndexedObjectSetIterator")
public class IndexedObjectSetIterator implements Iterator {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	IndexedObjectSet field5106;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	IndexedObjectNode field5107;
	@ObfuscatedName("ag")
	int field5108;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	IndexedObjectNode field5109;

	@ObfuscatedSignature(
		descriptor = "(Lqi;)V"
	)
	IndexedObjectSetIterator(IndexedObjectSet var1) {
		this.field5109 = null;
		this.field5106 = var1;
		this.method8670();
	}

	@ObfuscatedName("ab")
	void method8670() {
		this.field5107 = this.field5106.nodes[0].nextNode;
		this.field5108 = 1;
		this.field5109 = null;
	}

	public Object next() {
		IndexedObjectNode var1;
		if (this.field5106.nodes[this.field5108 - 1] != this.field5107) {
			var1 = this.field5107;
			this.field5107 = var1.nextNode;
			this.field5109 = var1;
			return var1;
		} else {
			do {
				if (this.field5108 >= this.field5106.size) {
					return null;
				}

				var1 = this.field5106.nodes[this.field5108++].nextNode;
			} while(var1 == this.field5106.nodes[this.field5108 - 1]);

			this.field5107 = var1.nextNode;
			this.field5109 = var1;
			return var1;
		}
	}

	public boolean hasNext() {
		if (this.field5106.nodes[this.field5108 - 1] != this.field5107) {
			return true;
		} else {
			while (this.field5108 < this.field5106.size) {
				if (this.field5106.nodes[this.field5108++].nextNode != this.field5106.nodes[this.field5108 - 1]) {
					this.field5107 = this.field5106.nodes[this.field5108 - 1].nextNode;
					return true;
				}

				this.field5107 = this.field5106.nodes[this.field5108 - 1];
			}

			return false;
		}
	}

	public void remove() {
		if (this.field5109 == null) {
			throw new IllegalStateException();
		} else {
			this.field5109.detach();
			this.field5109 = null;
		}
	}
}
