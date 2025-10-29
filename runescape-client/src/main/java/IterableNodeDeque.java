import java.util.Collection;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rm")
@Implements("IterableNodeDeque")
public class IterableNodeDeque implements Iterable, Collection {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lvz;"
	)
	@Export("sentinel")
	Node sentinel;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lvz;"
	)
	Node field5185;

	public IterableNodeDeque() {
		this.sentinel = new Node();
		this.sentinel.previous = this.sentinel;
		this.sentinel.next = this.sentinel;
	}

	@ObfuscatedName("at")
	@Export("rsClear")
	public void rsClear() {
		while (this.sentinel.previous != this.sentinel) {
			this.sentinel.previous.remove();
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lvz;)V"
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lvz;)V"
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Lvz;"
	)
	@Export("last")
	public Node last() {
		return this.method9010((Node)null);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lvz;)Lvz;"
	)
	Node method9010(Node var1) {
		Node var2;
		if (var1 == null) {
			var2 = this.sentinel.previous;
		} else {
			var2 = var1;
		}

		if (var2 == this.sentinel) {
			this.field5185 = null;
			return null;
		} else {
			this.field5185 = var2.previous;
			return var2;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()Lvz;"
	)
	@Export("previous")
	public Node previous() {
		Node var1 = this.field5185;
		if (var1 == this.sentinel) {
			this.field5185 = null;
			return null;
		} else {
			this.field5185 = var1.previous;
			return var1;
		}
	}

	@ObfuscatedName("aw")
	int method9012() {
		int var1 = 0;

		for (Node var2 = this.sentinel.previous; var2 != this.sentinel; var2 = var2.previous) {
			++var1;
		}

		return var1;
	}

	@ObfuscatedName("ap")
	public boolean method9013() {
		return this.sentinel.previous == this.sentinel;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()[Lvz;"
	)
	Node[] method9014() {
		Node[] var1 = new Node[this.method9012()];
		int var2 = 0;

		for (Node var3 = this.sentinel.previous; var3 != this.sentinel; var3 = var3.previous) {
			var1[var2++] = var3;
		}

		return var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lvz;)Z"
	)
	boolean method9016(Node var1) {
		this.addFirst(var1);
		return true;
	}

	public Iterator iterator() {
		return new IterableNodeDequeDescendingIterator(this);
	}

	public int size() {
		return this.method9012();
	}

	public boolean isEmpty() {
		return this.method9013();
	}

	public Object[] toArray() {
		return this.method9014();
	}

	public Object[] toArray(Object[] var1) {
		int var2 = 0;

		for (Node var3 = this.sentinel.previous; var3 != this.sentinel; var3 = var3.previous) {
			var1[var2++] = var3;
		}

		return var1;
	}

	public void clear() {
		this.rsClear();
	}

	public boolean containsAll(Collection var1) {
		throw new RuntimeException();
	}

	public boolean removeAll(Collection var1) {
		throw new RuntimeException();
	}

	public boolean retainAll(Collection var1) {
		throw new RuntimeException();
	}

	public boolean add(Object var1) {
		return this.method9016((Node)var1);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public boolean remove(Object var1) {
		throw new RuntimeException();
	}

	public boolean contains(Object var1) {
		throw new RuntimeException();
	}

	public int hashCode() {
		return super.hashCode();
	}

	public boolean addAll(Collection var1) {
		throw new RuntimeException();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lvz;Lvz;)V"
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
