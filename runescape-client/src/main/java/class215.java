import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iy")
public class class215 {
	@ObfuscatedName("ol")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-18"
	)
	@Export("updateLoginIndex")
	static void updateLoginIndex(int var0) {
		Client.oculusOrbState = var0;
	}
}
