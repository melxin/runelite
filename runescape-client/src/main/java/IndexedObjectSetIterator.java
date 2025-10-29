import java.util.Iterator;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qo")
@Implements("IndexedObjectSetIterator")
public class IndexedObjectSetIterator implements Iterator {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	IndexedObjectSet field5132;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	IndexedObjectNode field5131;
	@ObfuscatedName("ag")
	int field5133;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	IndexedObjectNode field5134;

	@ObfuscatedSignature(
		descriptor = "(Lqu;)V"
	)
	IndexedObjectSetIterator(IndexedObjectSet var1) {
		this.field5134 = null;
		this.field5132 = var1;
		this.method8891();
	}

	@ObfuscatedName("av")
	void method8891() {
		this.field5131 = this.field5132.nodes[0].nextNode;
		this.field5133 = 1;
		this.field5134 = null;
	}

	public Object next() {
		IndexedObjectNode var1;
		if (this.field5132.nodes[this.field5133 - 1] != this.field5131) {
			var1 = this.field5131;
			this.field5131 = var1.nextNode;
			this.field5134 = var1;
			return var1;
		} else {
			do {
				if (this.field5133 >= this.field5132.size) {
					return null;
				}

				var1 = this.field5132.nodes[this.field5133++].nextNode;
			} while(var1 == this.field5132.nodes[this.field5133 - 1]);

			this.field5131 = var1.nextNode;
			this.field5134 = var1;
			return var1;
		}
	}

	public boolean hasNext() {
		if (this.field5132.nodes[this.field5133 - 1] != this.field5131) {
			return true;
		} else {
			while (this.field5133 < this.field5132.size) {
				if (this.field5132.nodes[this.field5133++].nextNode != this.field5132.nodes[this.field5133 - 1]) {
					this.field5131 = this.field5132.nodes[this.field5133 - 1].nextNode;
					return true;
				}

				this.field5131 = this.field5132.nodes[this.field5133 - 1];
			}

			return false;
		}
	}

	public void remove() {
		if (this.field5134 == null) {
			throw new IllegalStateException();
		} else {
			this.field5134.detach();
			this.field5134 = null;
		}
	}
}
