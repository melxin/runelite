import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qm")
public class class417 implements Iterator {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	class414 field4799;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	Renderable field4796;
	@ObfuscatedName("au")
	int field4798;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	Renderable field4797;

	@ObfuscatedSignature(
		descriptor = "(Lpj;)V"
	)
	class417(class414 var1) {
		this.field4797 = null;
		this.field4799 = var1;
		this.method7943();
	}

	@ObfuscatedName("ab")
	void method7943() {
		this.field4796 = this.field4799.field4783[0].field5291;
		this.field4798 = 1;
		this.field4797 = null;
	}

	public boolean hasNext() {
		if (this.field4799.field4783[this.field4798 - 1] != this.field4796) {
			return true;
		} else {
			while (this.field4798 < this.field4799.field4785) {
				if (this.field4799.field4783[this.field4798++].field5291 != this.field4799.field4783[this.field4798 - 1]) {
					this.field4796 = this.field4799.field4783[this.field4798 - 1].field5291;
					return true;
				}

				this.field4796 = this.field4799.field4783[this.field4798 - 1];
			}

			return false;
		}
	}

	public Object next() {
		Renderable var1;
		if (this.field4799.field4783[this.field4798 - 1] != this.field4796) {
			var1 = this.field4796;
			this.field4796 = var1.field5291;
			this.field4797 = var1;
			return var1;
		} else {
			do {
				if (this.field4798 >= this.field4799.field4785) {
					return null;
				}

				var1 = this.field4799.field4783[this.field4798++].field5291;
			} while(var1 == this.field4799.field4783[this.field4798 - 1]);

			this.field4796 = var1.field5291;
			this.field4797 = var1;
			return var1;
		}
	}

	public void remove() {
		if (this.field4797 == null) {
			throw new IllegalStateException();
		} else {
			this.field4797.method9623();
			this.field4797 = null;
		}
	}
}
