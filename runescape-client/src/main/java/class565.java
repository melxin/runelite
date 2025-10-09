import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("va")
class class565 implements Iterator {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1376411013
	)
	int field5865;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lvv;"
	)
	final class566 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lvv;)V"
	)
	class565(class566 var1) {
		this.this$0 = var1;
	}

	public boolean hasNext() {
		return this.field5865 < this.this$0.method10564();
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	public Object next() {
		int var1 = ++this.field5865 - 1;
		class525 var2 = (class525)this.this$0.field5869.get((long)var1);
		return var2 != null ? var2 : this.this$0.method11128(var1);
	}
}
