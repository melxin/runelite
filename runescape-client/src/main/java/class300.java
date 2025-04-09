import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lr")
public class class300 {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	static final class300 field3307;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	static final class300 field3305;
	@ObfuscatedName("pb")
	@ObfuscatedGetter(
		intValue = 1718488003
	)
	static int field3306;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 2050316303
	)
	@Export("value")
	final int value;

	static {
		field3307 = new class300(0);
		field3305 = new class300(1);
	}

	class300(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "106"
	)
	public static int method6349(int var0, int var1) {
		return (int)Math.round(Math.atan2((double)var0, (double)var1) * 325.94932345220167D) - 512 & 2047;
	}
}
