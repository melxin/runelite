import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vw")
class class556 implements Iterator {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 261099391
	)
	int field5581;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lvh;"
	)
	final class557 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lvh;)V"
	)
	class556(class557 var1) {
		this.this$0 = var1;
	}

	public Object next() {
		int var1 = ++this.field5581 - 1;
		class517 var2 = (class517)this.this$0.field5584.get((long)var1);
		return var2 != null ? var2 : this.this$0.method10585(var1);
	}

	public boolean hasNext() {
		return this.field5581 < this.this$0.method10064();
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}
