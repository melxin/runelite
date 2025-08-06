import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tj")
public class class502 {
	@ObfuscatedName("ar")
	@Export("userHomeDirectory")
	static String userHomeDirectory;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	final WorldEntityCoord field5331;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1444115259
	)
	int field5328;

	class502() {
		this.field5331 = new WorldEntityCoord();
	}
}
