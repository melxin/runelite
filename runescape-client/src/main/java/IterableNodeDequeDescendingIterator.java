import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pr")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("deque")
	IterableNodeDeque deque;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	Node field4697;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	Node field4699;

	@ObfuscatedSignature(
		descriptor = "(Lps;)V"
	)
	IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
		this.field4699 = null;
		this.setDeque(var1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lps;)V"
	)
	@Export("setDeque")
	void setDeque(IterableNodeDeque var1) {
		this.deque = var1;
		this.start();
	}

	@ObfuscatedName("ah")
	@Export("start")
	void start() {
		this.field4697 = this.deque != null ? this.deque.sentinel.previous : null;
		this.field4699 = null;
	}

	public void remove() {
		if (this.field4699 == null) {
			throw new IllegalStateException();
		} else {
			this.field4699.remove();
			this.field4699 = null;
		}
	}

	public boolean hasNext() {
		return this.deque.sentinel != this.field4697 && this.field4697 != null;
	}

	public Object next() {
		Node var1 = this.field4697;
		if (var1 == this.deque.sentinel) {
			var1 = null;
			this.field4697 = null;
		} else {
			this.field4697 = var1.previous;
		}

		this.field4699 = var1;
		return var1;
	}
}
