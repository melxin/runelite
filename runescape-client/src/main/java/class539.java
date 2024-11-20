import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uz")
public class class539 extends class497 implements class311 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	final AbstractArchive field5384;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	final DemotingHashTable field5382;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1601683009
	)
	final int field5383;

	@ObfuscatedSignature(
		descriptor = "(Loc;ILpw;Lpi;)V"
	)
	public class539(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0);
		this.field5382 = new DemotingHashTable(64);
		this.field5384 = var4;
		this.field5383 = var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)Ltt;",
		garbageValue = "64"
	)
	protected class499 vmethod9904(int var1) {
		synchronized(this.field5382) {
			class498 var2 = (class498)this.field5382.get((long)var1);
			if (var2 == null) {
				var2 = this.method9906(var1);
				this.field5382.method6397(var2, (long)var1);
			}

			return var2;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)Ltr;",
		garbageValue = "-409525690"
	)
	class498 method9906(int var1) {
		byte[] var2 = this.field5384.takeFile(this.field5383, var1);
		class498 var3 = new class498(var1);
		if (var2 != null) {
			var3.method9349(new Buffer(var2));
		}

		return var3;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-40"
	)
	public void method9910() {
		synchronized(this.field5382) {
			this.field5382.clear();
		}
	}

	public Iterator iterator() {
		return new class538(this);
	}
}
