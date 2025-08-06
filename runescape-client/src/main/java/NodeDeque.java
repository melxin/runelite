import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qp")
@Implements("NodeDeque")
public class NodeDeque {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Luj;"
	)
	@Export("sentinel")
	public Node sentinel;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Luj;"
	)
	@Export("current")
	Node current;

	public NodeDeque() {
		this.sentinel = new Node();
		this.sentinel.previous = this.sentinel;
		this.sentinel.next = this.sentinel;
	}

	@ObfuscatedName("ab")
	@Export("clear")
	public void clear() {
		while (true) {
			Node var1 = this.sentinel.previous;
			if (var1 == this.sentinel) {
				this.current = null;
				return;
			}

			var1.vmethod10593();
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Luj;)V"
	)
	@Export("addFirst")
	public void addFirst(Node var1) {
		if (var1.next != null) {
			var1.vmethod10593();
		}

		var1.next = this.sentinel.next;
		var1.previous = this.sentinel;
		var1.next.previous = var1;
		var1.previous.next = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Luj;)V"
	)
	@Export("addLast")
	public void addLast(Node var1) {
		if (var1.next != null) {
			var1.vmethod10593();
		}

		var1.next = this.sentinel;
		var1.previous = this.sentinel.previous;
		var1.next.previous = var1;
		var1.previous.next = var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()Luj;"
	)
	@Export("removeLast")
	public Node removeLast() {
		Node var1 = this.sentinel.previous;
		if (var1 == this.sentinel) {
			return null;
		} else {
			var1.vmethod10593();
			return var1;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Luj;"
	)
	@Export("removeFirst")
	public Node removeFirst() {
		Node var1 = this.sentinel.next;
		if (var1 == this.sentinel) {
			return null;
		} else {
			var1.vmethod10593();
			return var1;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()Luj;"
	)
	@Export("last")
	public Node last() {
		Node var1 = this.sentinel.previous;
		if (var1 == this.sentinel) {
			this.current = null;
			return null;
		} else {
			this.current = var1.previous;
			return var1;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()Luj;"
	)
	@Export("first")
	public Node first() {
		Node var1 = this.sentinel.next;
		if (var1 == this.sentinel) {
			this.current = null;
			return null;
		} else {
			this.current = var1.next;
			return var1;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()Luj;"
	)
	@Export("previous")
	public Node previous() {
		Node var1 = this.current;
		if (var1 == this.sentinel) {
			this.current = null;
			return null;
		} else {
			this.current = var1.previous;
			return var1;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()Luj;"
	)
	@Export("next")
	public Node next() {
		Node var1 = this.current;
		if (var1 == this.sentinel) {
			this.current = null;
			return null;
		} else {
			this.current = var1.next;
			return var1;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Luj;Luj;)V"
	)
	@Export("NodeDeque_addBefore")
	public static void NodeDeque_addBefore(Node var0, Node var1) {
		if (var0.next != null) {
			var0.vmethod10593();
		}

		var0.next = var1.next;
		var0.previous = var1;
		var0.next.previous = var0;
		var0.previous.next = var0;
	}
}
