import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pv")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	@Export("deque")
	IterableNodeDeque deque;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ltz;"
	)
	Node field4712;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ltz;"
	)
	Node field4711;

	@ObfuscatedSignature(
		descriptor = "(Lpc;)V"
	)
	IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
		this.field4711 = null;
		this.setDeque(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpc;)V"
	)
	@Export("setDeque")
	void setDeque(IterableNodeDeque var1) {
		this.deque = var1;
		this.start();
	}

	@ObfuscatedName("aw")
	@Export("start")
	void start() {
		this.field4712 = this.deque != null ? this.deque.sentinel.previous : null;
		this.field4711 = null;
	}

	public Object next() {
		Node var1 = this.field4712;
		if (var1 == this.deque.sentinel) {
			var1 = null;
			this.field4712 = null;
		} else {
			this.field4712 = var1.previous;
		}

		this.field4711 = var1;
		return var1;
	}

	public boolean hasNext() {
		return this.deque.sentinel != this.field4712 && this.field4712 != null;
	}

	public void remove() {
		if (this.field4711 == null) {
			throw new IllegalStateException();
		} else {
			this.field4711.remove();
			this.field4711 = null;
		}
	}
}
