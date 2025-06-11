import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sr")
@Implements("Usernamed")
public interface Usernamed {
	@ObfuscatedName("qd")
	@ObfuscatedSignature(
		descriptor = "(B)Lxm;",
		garbageValue = "65"
	)
	@Export("username")
	Username username();
}
