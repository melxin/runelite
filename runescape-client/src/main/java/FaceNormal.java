import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("hr")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1536851083
	)
	@Export("x")
	int x;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 866025671
	)
	@Export("y")
	int y;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -337492657
	)
	@Export("z")
	int z;

	FaceNormal() {
	}
}
