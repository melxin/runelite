import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jh")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lws;"
	)
	static IndexedSprite field2978;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -874543525
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 191749339
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -171580963
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 424070781
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -914427957
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("ac")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -810840195
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
