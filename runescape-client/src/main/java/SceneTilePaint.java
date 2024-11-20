import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("je")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1670433163
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1605189343
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 863023123
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 642262955
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1109237081
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("ac")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1214465059
	)
	@Export("rgb")
	int rgb;

	SceneTilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.isFlat = true;
		this.swColor = var1;
		this.seColor = var2;
		this.neColor = var3;
		this.nwColor = var4;
		this.texture = var5;
		this.rgb = var6;
		this.isFlat = var7;
	}
}
