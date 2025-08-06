import java.util.Iterator;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qh")
@Implements("IndexedObjectSetIterator")
public class IndexedObjectSetIterator implements Iterator {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	IndexedObjectSet field4957;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lui;"
	)
	IndexedObjectNode field4956;
	@ObfuscatedName("ac")
	int field4955;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lui;"
	)
	IndexedObjectNode field4958;

	@ObfuscatedSignature(
		descriptor = "(Lqw;)V"
	)
	IndexedObjectSetIterator(IndexedObjectSet var1) {
		this.field4958 = null;
		this.field4957 = var1;
		this.method8648();
	}

	@ObfuscatedName("al")
	void method8648() {
		this.field4956 = this.field4957.nodes[0].nextNode;
		this.field4955 = 1;
		this.field4958 = null;
	}

	public Object next() {
		IndexedObjectNode var1;
		if (this.field4957.nodes[this.field4955 - 1] != this.field4956) {
			var1 = this.field4956;
			this.field4956 = var1.nextNode;
			this.field4958 = var1;
			return var1;
		} else {
			do {
				if (this.field4955 >= this.field4957.size) {
					return null;
				}

				var1 = this.field4957.nodes[this.field4955++].nextNode;
			} while(var1 == this.field4957.nodes[this.field4955 - 1]);

			this.field4956 = var1.nextNode;
			this.field4958 = var1;
			return var1;
		}
	}

	public void remove() {
		if (this.field4958 == null) {
			throw new IllegalStateException();
		} else {
			this.field4958.detach();
			this.field4958 = null;
		}
	}

	public boolean hasNext() {
		if (this.field4957.nodes[this.field4955 - 1] != this.field4956) {
			return true;
		} else {
			while (this.field4955 < this.field4957.size) {
				if (this.field4957.nodes[this.field4955++].nextNode != this.field4957.nodes[this.field4955 - 1]) {
					this.field4956 = this.field4957.nodes[this.field4955 - 1].nextNode;
					return true;
				}

				this.field4956 = this.field4957.nodes[this.field4955 - 1];
			}

			return false;
		}
	}
}
