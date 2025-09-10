import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jt")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("uv")
	@ObfuscatedSignature(
		descriptor = "Lxt;"
	)
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -746157747
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 904993827
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1242918247
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1594956405
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 2096886293
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("aq")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 795459049
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
