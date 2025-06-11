import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rc")
public class class456 {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1018179181
	)
	int field5043;

	@ObfuscatedSignature(
		descriptor = "(IZ)V",
		garbageValue = "1"
	)
	class456(int var1, boolean var2) {
		this.field5043 = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1995146636"
	)
	public int method9081() {
		return this.field5043;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "([JB)Ltp;",
		garbageValue = "-59"
	)
	static class509 method9082(long[] var0) {
		class509 var1 = new class509(class563.field5594, false);
		var1.field5289 = var0;
		var1.field5287 = var0.length * 1090132113;
		var1.field5291 = var0.length;
		return var1;
	}
}
