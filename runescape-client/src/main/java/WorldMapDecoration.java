import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("lx")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -814245525
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -484641233
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 2020167799
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1;
		this.decoration = var2;
		this.rotation = var3;
	}
}
