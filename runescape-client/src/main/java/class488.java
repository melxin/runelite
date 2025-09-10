import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sl")
public class class488 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	public static final class488 field5351;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	static final class488 field5350;
	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	static GameBuild field5353;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 975444257
	)
	final int field5352;

	static {
		field5351 = new class488(0);
		field5350 = new class488(1);
	}

	class488(int var1) {
		this.field5352 = var1;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "([BIB)I",
		garbageValue = "0"
	)
	public static int method9805(byte[] var0, int var1) {
		return class346.method7343(var0, 0, var1);
	}
}
