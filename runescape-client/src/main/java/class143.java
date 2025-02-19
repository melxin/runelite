import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
class class143 implements Callable {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	final class144 this$0;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	final Buffer val$p;
	// $FF: synthetic field
	final int val$version;

	@ObfuscatedSignature(
		descriptor = "(Lfb;Lvy;I)V"
	)
	class143(class144 var1, Buffer var2, int var3) {
		this.this$0 = var1;
		this.val$p = var2;
		this.val$version = var3;
	}

	public Object call() {
		this.this$0.method3411(this.val$p, this.val$version);
		return null;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[Lms;",
		garbageValue = "-1264801467"
	)
	public static class325[] method3406() {
		return new class325[]{class325.field3488, class325.field3482, class325.field3484, class325.field3495, class325.field3486, class325.field3487, class325.field3489, class325.field3485, class325.field3490, class325.field3491, class325.field3492, class325.field3493, class325.field3494};
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "19"
	)
	public static int method3409(int var0, int var1, int var2) {
		int var3 = AsyncRestClient.method145(var2 - var1 + 1);
		var3 <<= var1;
		var0 |= var3;
		return var0;
	}
}
