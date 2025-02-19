import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qf")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lqk;"
	)
	@Export("deque")
	IterableNodeDeque deque;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	Node field4853;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	Node field4852;

	@ObfuscatedSignature(
		descriptor = "(Lqk;)V"
	)
	IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
		this.field4852 = null;
		this.setDeque(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lqk;)V"
	)
	@Export("setDeque")
	void setDeque(IterableNodeDeque var1) {
		this.deque = var1;
		this.start();
	}

	@ObfuscatedName("ay")
	@Export("start")
	void start() {
		this.field4853 = this.deque != null ? this.deque.sentinel.previous : null;
		this.field4852 = null;
	}

	public Object next() {
		Node var1 = this.field4853;
		if (var1 == this.deque.sentinel) {
			var1 = null;
			this.field4853 = null;
		} else {
			this.field4853 = var1.previous;
		}

		this.field4852 = var1;
		return var1;
	}

	public void remove() {
		if (this.field4852 == null) {
			throw new IllegalStateException();
		} else {
			this.field4852.remove();
			this.field4852 = null;
		}
	}

	public boolean hasNext() {
		return this.deque.sentinel != this.field4853 && this.field4853 != null;
	}
}
