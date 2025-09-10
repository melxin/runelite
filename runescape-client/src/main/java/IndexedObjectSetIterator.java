import java.util.Iterator;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qa")
@Implements("IndexedObjectSetIterator")
public class IndexedObjectSetIterator implements Iterator {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	IndexedObjectSet field5077;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lus;"
	)
	IndexedObjectNode field5075;
	@ObfuscatedName("at")
	int field5078;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lus;"
	)
	IndexedObjectNode field5076;

	@ObfuscatedSignature(
		descriptor = "(Lqf;)V"
	)
	IndexedObjectSetIterator(IndexedObjectSet var1) {
		this.field5076 = null;
		this.field5077 = var1;
		this.method8618();
	}

	@ObfuscatedName("af")
	void method8618() {
		this.field5075 = this.field5077.nodes[0].nextNode;
		this.field5078 = 1;
		this.field5076 = null;
	}

	public Object next() {
		IndexedObjectNode var1;
		if (this.field5077.nodes[this.field5078 - 1] != this.field5075) {
			var1 = this.field5075;
			this.field5075 = var1.nextNode;
			this.field5076 = var1;
			return var1;
		} else {
			do {
				if (this.field5078 >= this.field5077.size) {
					return null;
				}

				var1 = this.field5077.nodes[this.field5078++].nextNode;
			} while(var1 == this.field5077.nodes[this.field5078 - 1]);

			this.field5075 = var1.nextNode;
			this.field5076 = var1;
			return var1;
		}
	}

	public boolean hasNext() {
		if (this.field5077.nodes[this.field5078 - 1] != this.field5075) {
			return true;
		} else {
			while (this.field5078 < this.field5077.size) {
				if (this.field5077.nodes[this.field5078++].nextNode != this.field5077.nodes[this.field5078 - 1]) {
					this.field5075 = this.field5077.nodes[this.field5078 - 1].nextNode;
					return true;
				}

				this.field5075 = this.field5077.nodes[this.field5078 - 1];
			}

			return false;
		}
	}

	public void remove() {
		if (this.field5076 == null) {
			throw new IllegalStateException();
		} else {
			this.field5076.detach();
			this.field5076 = null;
		}
	}
}
