import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uw")
class class538 implements Iterator {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Lvi;"
	)
	@Export("runesSprite")
	static IndexedSprite[] runesSprite;
	@ObfuscatedName("aq")
	static int[][][] field5380;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1212790791
	)
	int field5381;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Luf;"
	)
	final class539 this$0;

	@ObfuscatedSignature(
		descriptor = "(Luf;)V"
	)
	class538(class539 var1) {
		this.this$0 = var1;
	}

	public boolean hasNext() {
		return this.field5381 < this.this$0.method9511();
	}

	public Object next() {
		int var1 = ++this.field5381 - 1;
		class498 var2 = (class498)this.this$0.field5383.get((long)var1);
		return var2 != null ? var2 : this.this$0.method10081(var1);
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Lfm;",
		garbageValue = "759007110"
	)
	static class138 method10069(int var0) {
		class138[] var1 = new class138[]{class138.field1608, class138.field1606, class138.field1607, class138.field1619, class138.field1617, class138.field1610, class138.field1625, class138.field1612, class138.field1613, class138.field1614, class138.field1615, class138.field1616, class138.field1611, class138.field1618, class138.field1605, class138.field1620, class138.field1621};
		class138 var2 = (class138)StructComposition.findEnumerated(var1, var0);
		if (var2 == null) {
			var2 = class138.field1608;
		}

		return var2;
	}
}
