import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ut")
class class538 implements Iterator {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -728593359
	)
	int field5380;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Luz;"
	)
	final class539 this$0;

	@ObfuscatedSignature(
		descriptor = "(Luz;)V"
	)
	class538(class539 var1) {
		this.this$0 = var1;
	}

	public boolean hasNext() {
		return this.field5380 < this.this$0.method9329();
	}

	public Object next() {
		int var1 = ++this.field5380 - 1;
		class498 var2 = (class498)this.this$0.field5382.get((long)var1);
		return var2 != null ? var2 : this.this$0.method9906(var1);
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}
