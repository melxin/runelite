import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("it")
@Implements("Clock")
public abstract class Clock {
	Clock() {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1922091569"
	)
	@Export("mark")
	public abstract void mark();

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1083508360"
	)
	@Export("wait")
	public abstract int wait(int var1, int var2);

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)[Lme;",
		garbageValue = "-2107103455"
	)
	static class326[] method5073() {
		return new class326[]{class326.field3587, class326.field3582, class326.field3593, class326.field3584, class326.field3588, class326.field3586, class326.field3589, class326.field3583};
	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(Ldd;B)V",
		garbageValue = "74"
	)
	static void method5078(class95 var0) {
		if (Client.field533 != var0) {
			Client.field533 = var0;
		}
	}

	@ObfuscatedName("mn")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1664298343"
	)
	static boolean method5074(int var0) {
		for (int var1 = 0; var1 < Client.field733; ++var1) {
			if (Client.field735[var1] == var0) {
				return true;
			}
		}

		return false;
	}
}
