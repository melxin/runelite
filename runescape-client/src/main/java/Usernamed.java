import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sw")
@Implements("Usernamed")
public interface Usernamed {
	@ObfuscatedName("oe")
	@ObfuscatedSignature(
		descriptor = "(B)Lwb;",
		garbageValue = "-23"
	)
	@Export("username")
	Username username();
}
