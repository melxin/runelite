import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sb")
@Implements("Usernamed")
public interface Usernamed {
	@ObfuscatedName("od")
	@ObfuscatedSignature(
		descriptor = "(B)Lwm;",
		garbageValue = "-53"
	)
	@Export("username")
	Username username();
}
