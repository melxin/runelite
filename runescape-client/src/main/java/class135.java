import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
public class class135 implements Callable {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	final class136 field1589;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	final class137 field1587;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	final class138 field1588;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 621118179
	)
	final int field1591;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	final class143 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfj;Lfg;Lfi;Lfx;I)V"
	)
	class135(class143 var1, class136 var2, class137 var3, class138 var4, int var5) {
		this.this$0 = var1;
		this.field1589 = var2;
		this.field1587 = var3;
		this.field1588 = var4;
		this.field1591 = var5;
	}

	public Object call() {
		this.field1589.method3528();
		class136[][] var1;
		if (this.field1587 == class137.field1621) {
			var1 = this.this$0.field1673;
		} else {
			var1 = this.this$0.field1667;
		}

		var1[this.field1591][this.field1588.method3571()] = this.field1589;
		return null;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lps;Lps;I)V",
		garbageValue = "309025478"
	)
	public static void method3525(AbstractArchive var0, AbstractArchive var1) {
		HealthBarDefinition.HealthBarDefinition_archive = var0;
		HealthBarDefinition.field1966 = var1;
	}
}
