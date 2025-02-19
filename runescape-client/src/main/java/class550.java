import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vv")
public class class550 extends class510 implements class313 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	final AbstractArchive field5486;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	final DemotingHashTable field5483;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1475261733
	)
	final int field5484;

	@ObfuscatedSignature(
		descriptor = "(Lot;ILqt;Lpl;)V"
	)
	public class550(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0);
		this.field5483 = new DemotingHashTable(64);
		this.field5486 = var4;
		this.field5484 = var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Ltg;",
		garbageValue = "945027352"
	)
	protected class512 vmethod10020(int var1) {
		synchronized(this.field5483) {
			class511 var2 = (class511)this.field5483.get((long)var1);
			if (var2 == null) {
				var2 = this.method10021(var1);
				this.field5483.method6432(var2, (long)var1);
			}

			return var2;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IS)Ltv;",
		garbageValue = "8656"
	)
	class511 method10021(int var1) {
		byte[] var2 = this.field5486.takeFile(this.field5484, var1);
		class511 var3 = new class511(var1);
		if (var2 != null) {
			var3.method9553(new Buffer(var2));
		}

		return var3;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "190071571"
	)
	public void method10019() {
		synchronized(this.field5483) {
			this.field5483.clear();
		}
	}

	public Iterator iterator() {
		return new class549(this);
	}
}
