import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uq")
public class class531 {
	@ObfuscatedName("av")
	static final int[] field5464;
	@ObfuscatedName("au")
	static final int[] field5461;
	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	@Export("guestClanChannel")
	static ClanChannel guestClanChannel;

	static {
		field5464 = new int[16384];
		field5461 = new int[16384];
		double var0 = 3.834951969714103E-4D;

		for (int var2 = 0; var2 < 16384; ++var2) {
			field5464[var2] = (int)(16384.0D * Math.sin(var0 * (double)var2));
			field5461[var2] = (int)(16384.0D * Math.cos(var0 * (double)var2));
		}

	}
}
