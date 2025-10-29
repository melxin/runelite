import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tp")
@Implements("Usernamed")
public interface Usernamed {
	@ObfuscatedName("qo")
	@ObfuscatedSignature(
		descriptor = "(I)Lxv;",
		garbageValue = "-1525411131"
	)
	@Export("username")
	Username username();
}
