import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wq")
public class class580 extends class534 implements class322 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	final DemotingHashTable field5931;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	final AbstractArchive field5929;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -469179985
	)
	final int field5927;

	@ObfuscatedSignature(
		descriptor = "(Lpm;ILqd;Lqm;)V"
	)
	public class580(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0);
		this.field5931 = new DemotingHashTable(64);
		this.field5929 = var4;
		this.field5927 = var2;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Lue;",
		garbageValue = "-535565336"
	)
	protected class536 vmethod11384(int var1) {
		synchronized(this.field5931) {
			class535 var2 = (class535)this.field5931.get((long)var1);
			if (var2 == null) {
				var2 = this.method11386(var1);
				this.field5931.method7192(var2, (long)var1);
			}

			return var2;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)Luo;",
		garbageValue = "-50"
	)
	class535 method11386(int var1) {
		byte[] var2 = this.field5929.takeFile(this.field5927, var1);
		class535 var3 = new class535(var1);
		if (var2 != null) {
			var3.method10818(new Buffer(var2));
		}

		return var3;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-120"
	)
	public void method11387() {
		synchronized(this.field5931) {
			this.field5931.clear();
		}
	}

	public Iterator iterator() {
		return new class579(this);
	}
}
