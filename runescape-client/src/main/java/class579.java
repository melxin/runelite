import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wz")
class class579 implements Iterator {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[Lxt;"
	)
	static SpritePixels[] field5923;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1670710245
	)
	int field5924;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lwq;"
	)
	final class580 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lwq;)V"
	)
	class579(class580 var1) {
		this.this$0 = var1;
	}

	public boolean hasNext() {
		return this.field5924 < this.this$0.method10790();
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	public Object next() {
		int var1 = ++this.field5924 - 1;
		class535 var2 = (class535)this.this$0.field5931.get((long)var1);
		return var2 != null ? var2 : this.this$0.method11386(var1);
	}
}
