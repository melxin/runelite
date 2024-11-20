import java.util.Collection;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pc")
@Implements("IterableNodeDeque")
public class IterableNodeDeque implements Iterable, Collection {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ltz;"
	)
	@Export("sentinel")
	Node sentinel;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ltz;"
	)
	Node field4714;

	public IterableNodeDeque() {
		this.sentinel = new Node();
		this.sentinel.previous = this.sentinel;
		this.sentinel.next = this.sentinel;
	}

	@ObfuscatedName("ab")
	@Export("rsClear")
	public void rsClear() {
		while (this.sentinel.previous != this.sentinel) {
			this.sentinel.previous.remove();
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ltz;)V"
	)
	@Export("addFirst")
	public void addFirst(Node var1) {
		if (var1.next != null) {
			var1.remove();
		}

		var1.next = this.sentinel.next;
		var1.previous = this.sentinel;
		var1.next.previous = var1;
		var1.previous.next = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;)V"
	)
	@Export("addLast")
	public void addLast(Node var1) {
		if (var1.next != null) {
			var1.remove();
		}

		var1.next = this.sentinel;
		var1.previous = this.sentinel.previous;
		var1.next.previous = var1;
		var1.previous.next = var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()Ltz;"
	)
	@Export("last")
	public Node last() {
		return this.method7874((Node)null);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ltz;)Ltz;"
	)
	Node method7874(Node var1) {
		Node var2;
		if (var1 == null) {
			var2 = this.sentinel.previous;
		} else {
			var2 = var1;
		}

		if (var2 == this.sentinel) {
			this.field4714 = null;
			return null;
		} else {
			this.field4714 = var2.previous;
			return var2;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()Ltz;"
	)
	@Export("previous")
	public Node previous() {
		Node var1 = this.field4714;
		if (var1 == this.sentinel) {
			this.field4714 = null;
			return null;
		} else {
			this.field4714 = var1.previous;
			return var1;
		}
	}

	@ObfuscatedName("av")
	int method7906() {
		int var1 = 0;

		for (Node var2 = this.sentinel.previous; var2 != this.sentinel; var2 = var2.previous) {
			++var1;
		}

		return var1;
	}

	@ObfuscatedName("au")
	public boolean method7934() {
		return this.sentinel.previous == this.sentinel;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()[Ltz;"
	)
	Node[] method7878() {
		Node[] var1 = new Node[this.method7906()];
		int var2 = 0;

		for (Node var3 = this.sentinel.previous; var3 != this.sentinel; var3 = var3.previous) {
			var1[var2++] = var3;
		}

		return var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ltz;)Z"
	)
	boolean method7922(Node var1) {
		this.addFirst(var1);
		return true;
	}

	public boolean add(Object var1) {
		return this.method7922((Node)var1);
	}

	public int size() {
		return this.method7906();
	}

	public boolean isEmpty() {
		return this.method7934();
	}

	public Object[] toArray() {
		return this.method7878();
	}

	public boolean remove(Object var1) {
		throw new RuntimeException();
	}

	public boolean containsAll(Collection var1) {
		throw new RuntimeException();
	}

	public boolean addAll(Collection var1) {
		throw new RuntimeException();
	}

	public Iterator iterator() {
		return new IterableNodeDequeDescendingIterator(this);
	}

	public boolean retainAll(Collection var1) {
		throw new RuntimeException();
	}

	public void clear() {
		this.rsClear();
	}

	public boolean contains(Object var1) {
		throw new RuntimeException();
	}

	public int hashCode() {
		return super.hashCode();
	}

	public Object[] toArray(Object[] var1) {
		int var2 = 0;

		for (Node var3 = this.sentinel.previous; var3 != this.sentinel; var3 = var3.previous) {
			var1[var2++] = var3;
		}

		return var1;
	}

	public boolean removeAll(Collection var1) {
		throw new RuntimeException();
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ltz;Ltz;)V"
	)
	@Export("IterableNodeDeque_addBefore")
	public static void IterableNodeDeque_addBefore(Node var0, Node var1) {
		if (var0.next != null) {
			var0.remove();
		}

		var0.next = var1;
		var0.previous = var1.previous;
		var0.next.previous = var0;
		var0.previous.next = var0;
	}
}
