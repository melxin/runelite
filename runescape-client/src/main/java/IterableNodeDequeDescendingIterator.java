import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rg")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	@Export("deque")
	IterableNodeDeque deque;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lvz;"
	)
	Node field5184;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lvz;"
	)
	Node field5182;

	@ObfuscatedSignature(
		descriptor = "(Lrm;)V"
	)
	IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
		this.field5182 = null;
		this.setDeque(var1);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lrm;)V"
	)
	@Export("setDeque")
	void setDeque(IterableNodeDeque var1) {
		this.deque = var1;
		this.start();
	}

	@ObfuscatedName("at")
	@Export("start")
	void start() {
		this.field5184 = this.deque != null ? this.deque.sentinel.previous : null;
		this.field5182 = null;
	}

	public Object next() {
		Node var1 = this.field5184;
		if (var1 == this.deque.sentinel) {
			var1 = null;
			this.field5184 = null;
		} else {
			this.field5184 = var1.previous;
		}

		this.field5182 = var1;
		return var1;
	}

	public void remove() {
		if (this.field5182 == null) {
			throw new IllegalStateException();
		} else {
			this.field5182.remove();
			this.field5182 = null;
		}
	}

	public boolean hasNext() {
		return this.deque.sentinel != this.field5184 && this.field5184 != null;
	}
}
