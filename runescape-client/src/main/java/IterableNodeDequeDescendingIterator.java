import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qq")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	@Export("deque")
	IterableNodeDeque deque;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	Node field5125;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	Node field5126;

	@ObfuscatedSignature(
		descriptor = "(Lqn;)V"
	)
	IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
		this.field5126 = null;
		this.setDeque(var1);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lqn;)V"
	)
	@Export("setDeque")
	void setDeque(IterableNodeDeque var1) {
		this.deque = var1;
		this.start();
	}

	@ObfuscatedName("aw")
	@Export("start")
	void start() {
		this.field5125 = this.deque != null ? this.deque.sentinel.previous : null;
		this.field5126 = null;
	}

	public Object next() {
		Node var1 = this.field5125;
		if (var1 == this.deque.sentinel) {
			var1 = null;
			this.field5125 = null;
		} else {
			this.field5125 = var1.previous;
		}

		this.field5126 = var1;
		return var1;
	}

	public void remove() {
		if (this.field5126 == null) {
			throw new IllegalStateException();
		} else {
			this.field5126.remove();
			this.field5126 = null;
		}
	}

	public boolean hasNext() {
		return this.deque.sentinel != this.field5125 && this.field5125 != null;
	}
}
