import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("lm")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 550393211
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1034669467
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 840684461
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1;
		this.decoration = var2;
		this.rotation = var3;
	}
}
