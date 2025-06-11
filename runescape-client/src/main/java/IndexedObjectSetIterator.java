import java.util.Iterator;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qj")
@Implements("IndexedObjectSetIterator")
public class IndexedObjectSetIterator implements Iterator {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lqx;"
	)
	IndexedObjectSet field4864;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Luw;"
	)
	IndexedObjectNode field4862;
	@ObfuscatedName("an")
	int field4863;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Luw;"
	)
	IndexedObjectNode field4865;

	@ObfuscatedSignature(
		descriptor = "(Lqx;)V"
	)
	IndexedObjectSetIterator(IndexedObjectSet var1) {
		this.field4865 = null;
		this.field4864 = var1;
		this.method8337();
	}

	@ObfuscatedName("ap")
	void method8337() {
		this.field4862 = this.field4864.nodes[0].nextNode;
		this.field4863 = 1;
		this.field4865 = null;
	}

	public boolean hasNext() {
		if (this.field4864.nodes[this.field4863 - 1] != this.field4862) {
			return true;
		} else {
			while (this.field4863 < this.field4864.size) {
				if (this.field4864.nodes[this.field4863++].nextNode != this.field4864.nodes[this.field4863 - 1]) {
					this.field4862 = this.field4864.nodes[this.field4863 - 1].nextNode;
					return true;
				}

				this.field4862 = this.field4864.nodes[this.field4863 - 1];
			}

			return false;
		}
	}

	public void remove() {
		if (this.field4865 == null) {
			throw new IllegalStateException();
		} else {
			this.field4865.detach();
			this.field4865 = null;
		}
	}

	public Object next() {
		IndexedObjectNode var1;
		if (this.field4864.nodes[this.field4863 - 1] != this.field4862) {
			var1 = this.field4862;
			this.field4862 = var1.nextNode;
			this.field4865 = var1;
			return var1;
		} else {
			do {
				if (this.field4863 >= this.field4864.size) {
					return null;
				}

				var1 = this.field4864.nodes[this.field4863++].nextNode;
			} while(var1 == this.field4864.nodes[this.field4863 - 1]);

			this.field4862 = var1.nextNode;
			this.field4865 = var1;
			return var1;
		}
	}
}
