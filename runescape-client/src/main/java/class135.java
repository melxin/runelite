import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
public class class135 implements Callable {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	final class136 field1567;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	final class137 field1569;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	final class138 field1566;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 2124282617
	)
	final int field1568;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	final class144 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfl;Lff;Lfs;Lfm;I)V"
	)
	class135(class144 var1, class136 var2, class137 var3, class138 var4, int var5) {
		this.this$0 = var1;
		this.field1567 = var2;
		this.field1569 = var3;
		this.field1566 = var4;
		this.field1568 = var5;
	}

	public Object call() {
		this.field1567.method3448();
		class136[][] var1;
		if (this.field1569 == class137.field1600) {
			var1 = this.this$0.field1638;
		} else {
			var1 = this.this$0.field1639;
		}

		var1[this.field1568][this.field1566.method3491()] = this.field1567;
		return null;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "43"
	)
	static int method3445(int var0, int var1, int var2) {
		int var3 = var0 >> 16 & 255;
		int var4 = var0 >> 8 & 255;
		int var5 = var0 & 255;
		int var6 = var1 >> 16 & 255;
		int var7 = var1 >> 8 & 255;
		int var8 = var1 & 255;
		int var9 = var3 + (var6 - var3 + 1) * var2 / 64 & 255;
		int var10 = var4 + (var7 - var4 + 1) * var2 / 64 & 255;
		int var11 = (var8 - var5 + 1) * var2 / 64 + var5 & 255;
		return var9 << 16 | var10 << 8 | var11;
	}
}
