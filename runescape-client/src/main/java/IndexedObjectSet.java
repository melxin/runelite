import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qf")
@Implements("IndexedObjectSet")
public final class IndexedObjectSet implements Iterable {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	@Export("iterator")
	final IndexedObjectSetIterator iterator;
	@ObfuscatedName("aw")
	@Export("size")
	int size;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Lus;"
	)
	@Export("nodes")
	IndexedObjectNode[] nodes;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lus;"
	)
	@Export("currentNode")
	IndexedObjectNode currentNode;

	public IndexedObjectSet(int var1) {
		this.size = var1;
		this.nodes = new IndexedObjectNode[var1];

		for (int var2 = 0; var2 < var1; ++var2) {
			IndexedObjectNode var3 = this.nodes[var2] = new IndexedObjectNode();
			var3.nextNode = var3;
			var3.previousNode = var3;
		}

		this.iterator = new IndexedObjectSetIterator(this);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(J)Lus;"
	)
	@Export("get")
	public IndexedObjectNode get(long var1) {
		IndexedObjectNode var3 = this.nodes[(int)(var1 & (long)(this.size - 1))];

		for (this.currentNode = var3.nextNode; var3 != this.currentNode; this.currentNode = this.currentNode.nextNode) {
			if (this.currentNode.idx == var1) {
				IndexedObjectNode var4 = this.currentNode;
				this.currentNode = this.currentNode.nextNode;
				return var4;
			}
		}

		this.currentNode = null;
		return null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lus;J)V"
	)
	@Export("add")
	public void add(IndexedObjectNode var1, long var2) {
		if (var1.previousNode != null) {
			var1.detach();
		}

		IndexedObjectNode var4 = this.nodes[(int)(var2 & (long)(this.size - 1))];
		var1.previousNode = var4.previousNode;
		var1.nextNode = var4;
		var1.previousNode.nextNode = var1;
		var1.nextNode.previousNode = var1;
		var1.idx = var2;
	}

	@ObfuscatedName("at")
	@Export("clear")
	public void clear() {
		for (int var1 = 0; var1 < this.size; ++var1) {
			IndexedObjectNode var2 = this.nodes[var1];

			while (true) {
				IndexedObjectNode var3 = var2.nextNode;
				if (var3 == var2) {
					break;
				}

				var3.detach();
			}
		}

		this.currentNode = null;
	}

	public Iterator iterator() {
		this.iterator.method8618();
		return this.iterator;
	}
}
