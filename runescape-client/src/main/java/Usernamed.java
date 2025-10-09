import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sq")
@Implements("Usernamed")
public interface Usernamed {
	@ObfuscatedName("qx")
	@ObfuscatedSignature(
		descriptor = "(I)Lxp;",
		garbageValue = "-112636545"
	)
	@Export("username")
	Username username();
}
