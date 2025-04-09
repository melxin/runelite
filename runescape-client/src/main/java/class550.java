import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vs")
public class class550 extends class510 implements class313 {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	final DemotingHashTable field5511;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	final AbstractArchive field5510;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1808972777
	)
	final int field5512;

	@ObfuscatedSignature(
		descriptor = "(Loi;ILqa;Lph;)V"
	)
	public class550(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0);
		this.field5511 = new DemotingHashTable(64);
		this.field5510 = var4;
		this.field5512 = var2;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Lts;",
		garbageValue = "1975982205"
	)
	protected class512 vmethod10094(int var1) {
		synchronized(this.field5511) {
			class511 var2 = (class511)this.field5511.get((long)var1);
			if (var2 == null) {
				var2 = this.method10105(var1);
				this.field5511.method6490(var2, (long)var1);
			}

			return var2;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Ltx;",
		garbageValue = "65533"
	)
	class511 method10105(int var1) {
		byte[] var2 = this.field5510.takeFile(this.field5512, var1);
		class511 var3 = new class511(var1);
		if (var2 != null) {
			var3.method9605(new Buffer(var2));
		}

		return var3;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "943291364"
	)
	public void method10097() {
		synchronized(this.field5511) {
			this.field5511.clear();
		}
	}

	public Iterator iterator() {
		return new class549(this);
	}
}
