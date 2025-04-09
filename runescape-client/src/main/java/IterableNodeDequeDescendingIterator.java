import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qm")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	@Export("deque")
	IterableNodeDeque deque;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Luz;"
	)
	Node field4867;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Luz;"
	)
	Node field4868;

	@ObfuscatedSignature(
		descriptor = "(Lqi;)V"
	)
	IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
		this.field4868 = null;
		this.setDeque(var1);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lqi;)V"
	)
	@Export("setDeque")
	void setDeque(IterableNodeDeque var1) {
		this.deque = var1;
		this.start();
	}

	@ObfuscatedName("an")
	@Export("start")
	void start() {
		this.field4867 = this.deque != null ? this.deque.sentinel.previous : null;
		this.field4868 = null;
	}

	public void remove() {
		if (this.field4868 == null) {
			throw new IllegalStateException();
		} else {
			this.field4868.remove();
			this.field4868 = null;
		}
	}

	public boolean hasNext() {
		return this.deque.sentinel != this.field4867 && this.field4867 != null;
	}

	public Object next() {
		Node var1 = this.field4867;
		if (var1 == this.deque.sentinel) {
			var1 = null;
			this.field4867 = null;
		} else {
			this.field4867 = var1.previous;
		}

		this.field4868 = var1;
		return var1;
	}
}
