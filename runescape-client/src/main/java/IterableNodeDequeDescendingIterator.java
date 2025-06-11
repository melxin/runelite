import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qb")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	@Export("deque")
	IterableNodeDeque deque;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	Node field4915;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	Node field4916;

	@ObfuscatedSignature(
		descriptor = "(Lqh;)V"
	)
	IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
		this.field4916 = null;
		this.setDeque(var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lqh;)V"
	)
	@Export("setDeque")
	void setDeque(IterableNodeDeque var1) {
		this.deque = var1;
		this.start();
	}

	@ObfuscatedName("aj")
	@Export("start")
	void start() {
		this.field4915 = this.deque != null ? this.deque.sentinel.previous : null;
		this.field4916 = null;
	}

	public Object next() {
		Node var1 = this.field4915;
		if (var1 == this.deque.sentinel) {
			var1 = null;
			this.field4915 = null;
		} else {
			this.field4915 = var1.previous;
		}

		this.field4916 = var1;
		return var1;
	}

	public boolean hasNext() {
		return this.deque.sentinel != this.field4915 && this.field4915 != null;
	}

	public void remove() {
		if (this.field4916 == null) {
			throw new IllegalStateException();
		} else {
			this.field4916.remove();
			this.field4916 = null;
		}
	}
}
