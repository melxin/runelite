import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qt")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	@Export("deque")
	IterableNodeDeque deque;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lum;"
	)
	Node field5155;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lum;"
	)
	Node field5154;

	@ObfuscatedSignature(
		descriptor = "(Lqh;)V"
	)
	IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
		this.field5154 = null;
		this.setDeque(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lqh;)V"
	)
	@Export("setDeque")
	void setDeque(IterableNodeDeque var1) {
		this.deque = var1;
		this.start();
	}

	@ObfuscatedName("at")
	@Export("start")
	void start() {
		this.field5155 = this.deque != null ? this.deque.sentinel.previous : null;
		this.field5154 = null;
	}

	public boolean hasNext() {
		return this.deque.sentinel != this.field5155 && this.field5155 != null;
	}

	public Object next() {
		Node var1 = this.field5155;
		if (var1 == this.deque.sentinel) {
			var1 = null;
			this.field5155 = null;
		} else {
			this.field5155 = var1.previous;
		}

		this.field5154 = var1;
		return var1;
	}

	public void remove() {
		if (this.field5154 == null) {
			throw new IllegalStateException();
		} else {
			this.field5154.remove();
			this.field5154 = null;
		}
	}
}
