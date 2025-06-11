import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vh")
public class class557 extends class516 implements class313 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	final DemotingHashTable field5584;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	final AbstractArchive field5583;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -64969533
	)
	final int field5582;

	@ObfuscatedSignature(
		descriptor = "(Lon;ILqt;Lps;)V"
	)
	public class557(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0);
		this.field5584 = new DemotingHashTable(64);
		this.field5583 = var4;
		this.field5582 = var2;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Lth;",
		garbageValue = "1059633187"
	)
	protected class518 vmethod10584(int var1) {
		synchronized(this.field5584) {
			class517 var2 = (class517)this.field5584.get((long)var1);
			if (var2 == null) {
				var2 = this.method10585(var1);
				this.field5584.method6771(var2, (long)var1);
			}

			return var2;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Ltm;",
		garbageValue = "-1143491372"
	)
	class517 method10585(int var1) {
		byte[] var2 = this.field5583.takeFile(this.field5582, var1);
		class517 var3 = new class517(var1);
		if (var2 != null) {
			var3.method10096(new Buffer(var2));
		}

		return var3;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "35"
	)
	public void method10596() {
		synchronized(this.field5584) {
			this.field5584.clear();
		}
	}

	public Iterator iterator() {
		return new class556(this);
	}
}
