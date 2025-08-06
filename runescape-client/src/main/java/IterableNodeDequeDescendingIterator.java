import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qt")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	@Export("deque")
	IterableNodeDeque deque;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Luj;"
	)
	Node field5009;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Luj;"
	)
	Node field5011;

	@ObfuscatedSignature(
		descriptor = "(Lqm;)V"
	)
	IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
		this.field5011 = null;
		this.setDeque(var1);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lqm;)V"
	)
	@Export("setDeque")
	void setDeque(IterableNodeDeque var1) {
		this.deque = var1;
		this.start();
	}

	@ObfuscatedName("ab")
	@Export("start")
	void start() {
		this.field5009 = this.deque != null ? this.deque.sentinel.previous : null;
		this.field5011 = null;
	}

	public boolean hasNext() {
		return this.deque.sentinel != this.field5009 && this.field5009 != null;
	}

	public Object next() {
		Node var1 = this.field5009;
		if (var1 == this.deque.sentinel) {
			var1 = null;
			this.field5009 = null;
		} else {
			this.field5009 = var1.previous;
		}

		this.field5011 = var1;
		return var1;
	}

	public void remove() {
		if (this.field5011 == null) {
			throw new IllegalStateException();
		} else {
			this.field5011.remove();
			this.field5011 = null;
		}
	}
}
