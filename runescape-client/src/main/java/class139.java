import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fx")
class class139 implements Callable {
	@ObfuscatedName("jz")
	static byte[][] field1661;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	final class144 this$0;
	// $FF: synthetic field
	final int val$workStart;
	// $FF: synthetic field
	final int val$workEnd;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "[Lfg;"
	)
	final class135[] val$curveLoadJobs;

	@ObfuscatedSignature(
		descriptor = "(Lfb;II[Lfg;)V"
	)
	class139(class144 var1, int var2, int var3, class135[] var4) {
		this.this$0 = var1;
		this.val$workStart = var2;
		this.val$workEnd = var3;
		this.val$curveLoadJobs = var4;
	}

	public Object call() {
		for (int var1 = this.val$workStart; var1 < this.val$workEnd; ++var1) {
			this.val$curveLoadJobs[var1].call();
		}

		return null;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ILdy;ZB)I",
		garbageValue = "47"
	)
	static int method3394(int var0, Script var1, boolean var2) {
		return 2;
	}
}
