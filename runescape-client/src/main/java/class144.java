import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fb")
class class144 implements Callable {
	@ObfuscatedName("ue")
	@ObfuscatedGetter(
		intValue = 1572276865
	)
	static int field1638;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class145 this$0;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lvj;"
	)
	final Buffer val$p;
	// $FF: synthetic field
	final int val$version;

	@ObfuscatedSignature(
		descriptor = "(Lfz;Lvj;I)V"
	)
	class144(class145 var1, Buffer var2, int var3) {
		this.this$0 = var1;
		this.val$p = var2;
		this.val$version = var3;
	}

	public Object call() {
		this.this$0.method3403(this.val$p, this.val$version);
		return null;
	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(IZZZZB)Loa;",
		garbageValue = "12"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
		ArchiveDisk var5 = null;
		if (JagexCache.JagexCache_dat2File != null) {
			var5 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, UserComparator7.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var5, class346.masterDisk, GrandExchangeOfferTotalQuantityComparator.field4633, var0, var1, var2, var3, var4, false);
	}
}
