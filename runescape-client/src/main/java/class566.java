import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vv")
public class class566 extends class524 implements class315 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	final DemotingHashTable field5869;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	final AbstractArchive field5870;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -229643273
	)
	final int field5871;

	@ObfuscatedSignature(
		descriptor = "(Loh;ILqd;Lpe;)V"
	)
	public class566(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0);
		this.field5869 = new DemotingHashTable(64);
		this.field5870 = var4;
		this.field5871 = var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)Lux;",
		garbageValue = "-99"
	)
	protected class526 vmethod11140(int var1) {
		synchronized(this.field5869) {
			class525 var2 = (class525)this.field5869.get((long)var1);
			if (var2 == null) {
				var2 = this.method11128(var1);
				this.field5869.method6983(var2, (long)var1);
			}

			return var2;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)Luf;",
		garbageValue = "-114"
	)
	class525 method11128(int var1) {
		byte[] var2 = this.field5870.takeFile(this.field5871, var1);
		class525 var3 = new class525(var1);
		if (var2 != null) {
			var3.method10586(new Buffer(var2));
		}

		return var3;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "815780932"
	)
	public void method11139() {
		synchronized(this.field5869) {
			this.field5869.clear();
		}
	}

	public Iterator iterator() {
		return new class565(this);
	}
}
