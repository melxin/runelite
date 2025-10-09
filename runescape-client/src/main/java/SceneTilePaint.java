import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("jw")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 977029191
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1343097663
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1226403731
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1394093475
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 950732569
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("af")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 162588445
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
