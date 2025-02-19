import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
public class class135 implements Callable {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	final class136 field1602;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	final class137 field1601;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	final class138 field1603;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -129259055
	)
	final int field1604;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	final class144 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfb;Lfn;Lfq;Lfu;I)V"
	)
	class135(class144 var1, class136 var2, class137 var3, class138 var4, int var5) {
		this.this$0 = var1;
		this.field1602 = var2;
		this.field1601 = var3;
		this.field1603 = var4;
		this.field1604 = var5;
	}

	public Object call() {
		this.field1602.method3353();
		class136[][] var1;
		if (this.field1601 == class137.field1632) {
			var1 = this.this$0.field1685;
		} else {
			var1 = this.this$0.field1681;
		}

		var1[this.field1604][this.field1603.method3393()] = this.field1602;
		return null;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)Lvt;",
		garbageValue = "-31"
	)
	@Export("getDbRowType")
	public static DbRowType getDbRowType(int var0) {
		DbRowType var1 = (DbRowType)DbRowType.DBRowType_cache.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = DbRowType.field5516.takeFile(38, var0);
			var1 = new DbRowType();
			if (var2 != null) {
				var1.method10118(new Buffer(var2));
			}

			var1.method10121();
			DbRowType.DBRowType_cache.put(var1, (long)var0);
			return var1;
		}
	}
}
