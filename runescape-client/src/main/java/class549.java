import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vf")
class class549 implements Iterator {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	public static AbstractArchive field5509;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1119650107
	)
	int field5508;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lvs;"
	)
	final class550 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lvs;)V"
	)
	class549(class550 var1) {
		this.this$0 = var1;
	}

	public boolean hasNext() {
		return this.field5508 < this.this$0.method9582();
	}

	public Object next() {
		int var1 = ++this.field5508 - 1;
		class511 var2 = (class511)this.this$0.field5511.get((long)var1);
		return var2 != null ? var2 : this.this$0.method10105(var1);
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}
