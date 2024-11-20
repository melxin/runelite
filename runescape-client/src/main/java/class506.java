import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tm")
public class class506 {
	@ObfuscatedName("ac")
	static final int[] field5141;
	@ObfuscatedName("aj")
	static final int[] field5148;
	@ObfuscatedName("av")
	@Export("soundSystemExecutor")
	static ScheduledExecutorService soundSystemExecutor;
	@ObfuscatedName("wl")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	public static class402 field5147;

	static {
		field5141 = new int[16384];
		field5148 = new int[16384];
		double var0 = 3.834951969714103E-4D;

		for (int var2 = 0; var2 < 16384; ++var2) {
			field5141[var2] = (int)(16384.0D * Math.sin((double)var2 * var0));
			field5148[var2] = (int)(16384.0D * Math.cos((double)var2 * var0));
		}

	}
}
