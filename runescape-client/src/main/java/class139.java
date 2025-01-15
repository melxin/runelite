import java.util.Date;
import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fx")
class class139 implements Callable {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfl;"
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
		descriptor = "(Lfl;II[Lfg;)V"
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Date;I)Z",
		garbageValue = "-1573591192"
	)
	static boolean method3500(Date var0) {
		java.util.Calendar var1 = java.util.Calendar.getInstance();
		var1.set(1, var1.get(1) - 13);
		var1.set(5, var1.get(5) + 1);
		var1.set(11, 0);
		var1.set(12, 0);
		var1.set(13, 0);
		var1.set(14, 0);
		Date var2 = var1.getTime();
		return var0.before(var2);
	}
}
