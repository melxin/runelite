import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kx")
@Implements("MouseWheel")
public interface MouseWheel {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "5999"
	)
	@Export("useRotation")
	int useRotation();
}
