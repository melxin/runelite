import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sa")
@Implements("Usernamed")
public interface Usernamed {
	@ObfuscatedName("oq")
	@ObfuscatedSignature(
		descriptor = "(B)Lwo;",
		garbageValue = "-67"
	)
	@Export("username")
	Username username();
}
