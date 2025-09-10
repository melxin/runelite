import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fo")
class class141 implements Callable {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	@Export("scriptActiveWidget")
	static Widget scriptActiveWidget;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class146 this$0;
	// $FF: synthetic field
	final int val$workStart;
	// $FF: synthetic field
	final int val$workEnd;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "[Lfy;"
	)
	final class137[] val$curveLoadJobs;

	@ObfuscatedSignature(
		descriptor = "(Lfh;II[Lfy;)V"
	)
	class141(class146 var1, int var2, int var3, class137[] var4) {
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
		descriptor = "(Lrj;I)Lrj;",
		garbageValue = "342105169"
	)
	public static TransformationMatrix method3729(TransformationMatrix var0) {
		synchronized(TransformationMatrix.field5185) {
			if (class172.field1931 == 0) {
				return new TransformationMatrix(var0);
			} else {
				TransformationMatrix.field5185[--class172.field1931].method9092(var0);
				return TransformationMatrix.field5185[class172.field1931];
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)I",
		garbageValue = "0"
	)
	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			var2 = (var2 << 5) - var2 + UrlRequest.charToByteCp1252(var0.charAt(var3));
		}

		return var2;
	}
}
