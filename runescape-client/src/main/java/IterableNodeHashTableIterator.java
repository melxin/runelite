import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pf")
@Implements("IterableNodeHashTableIterator")
public class IterableNodeHashTableIterator implements Iterator {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lqv;"
	)
	@Export("hashTable")
	IterableNodeHashTable hashTable;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	@Export("head")
	Node head;
	@ObfuscatedName("au")
	@Export("index")
	int index;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	@Export("last")
	Node last;

	@ObfuscatedSignature(
		descriptor = "(Lqv;)V"
	)
	public IterableNodeHashTableIterator(IterableNodeHashTable var1) {
		this.last = null;
		this.hashTable = var1;
		this.start();
	}

	@ObfuscatedName("ab")
	@Export("start")
	void start() {
		this.head = this.hashTable.buckets[0].previous;
		this.index = 1;
		this.last = null;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()Luy;"
	)
	public Node method7899() {
		this.start();
		return (Node)this.next();
	}

	public Object next() {
		Node var1;
		if (this.hashTable.buckets[this.index - 1] != this.head) {
			var1 = this.head;
			this.head = var1.previous;
			this.last = var1;
			return var1;
		} else {
			do {
				if (this.index >= this.hashTable.size) {
					return null;
				}

				var1 = this.hashTable.buckets[this.index++].previous;
			} while(var1 == this.hashTable.buckets[this.index - 1]);

			this.head = var1.previous;
			this.last = var1;
			return var1;
		}
	}

	public boolean hasNext() {
		if (this.hashTable.buckets[this.index - 1] != this.head) {
			return true;
		} else {
			while (this.index < this.hashTable.size) {
				if (this.hashTable.buckets[this.index++].previous != this.hashTable.buckets[this.index - 1]) {
					this.head = this.hashTable.buckets[this.index - 1].previous;
					return true;
				}

				this.head = this.hashTable.buckets[this.index - 1];
			}

			return false;
		}
	}

	public void remove() {
		this.last.remove();
		this.last = null;
	}
}
