import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sx")
@Implements("Usernamed")
public interface Usernamed {
	@ObfuscatedName("qt")
	@ObfuscatedSignature(
		descriptor = "(I)Lxf;",
		garbageValue = "-483132180"
	)
	@Export("username")
	Username username();
}
