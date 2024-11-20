import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qd")
public class class433 implements Iterator {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	class434 field4799;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -484308311
	)
	int field4797;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1782549181
	)
	int field4798;

	@ObfuscatedSignature(
		descriptor = "(Lqy;)V"
	)
	class433(class434 var1) {
		this.field4797 = 0;
		this.field4798 = this.field4799.field4800;
		this.field4799 = var1;
	}

	public boolean hasNext() {
		return this.field4797 < this.field4799.field4802;
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	public Object next() {
		if (this.field4799.field4800 != this.field4798) {
			throw new ConcurrentModificationException();
		} else if (this.field4797 < this.field4799.field4802) {
			Object var1 = this.field4799.field4804[this.field4797].field4795;
			++this.field4797;
			return var1;
		} else {
			throw new NoSuchElementException();
		}
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(Ldm;IIIIB)Lda;",
		garbageValue = "42"
	)
	static final PendingSpawn method8339(WorldView var0, int var1, int var2, int var3, int var4) {
		for (PendingSpawn var5 = (PendingSpawn)var0.pendingSpawns.last(); var5 != null; var5 = (PendingSpawn)var0.pendingSpawns.previous()) {
			if (var5.plane == var1 && var2 == var5.x && var3 == var5.y && var4 == var5.type) {
				return var5;
			}
		}

		return null;
	}
}
