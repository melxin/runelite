import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hz")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 467024111
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1969534629
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1242849579
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1818002973
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 364631297
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("an")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1738255123
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1475607289"
	)
	public static int method4708() {
		return ++MouseHandler.MouseHandler_idleCycles - 1;
	}
}
