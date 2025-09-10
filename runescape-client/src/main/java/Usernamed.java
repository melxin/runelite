import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("se")
@Implements("Usernamed")
public interface Usernamed {
	@ObfuscatedName("qy")
	@ObfuscatedSignature(
		descriptor = "(I)Lxa;",
		garbageValue = "-768699461"
	)
	@Export("username")
	Username username();
}
