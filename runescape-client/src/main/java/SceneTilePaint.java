import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kz")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("gt")
	@ObfuscatedGetter(
		intValue = 1362339427
	)
	static int field3136;
	@ObfuscatedName("pl")
	@ObfuscatedSignature(
		descriptor = "[Lxt;"
	)
	@Export("headIconHintSprites")
	static SpritePixels[] headIconHintSprites;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1705968521
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1789756031
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -120051743
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 94297073
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -699583661
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("aj")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -453092939
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

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-442259464"
	)
	static void method6128(int var0, String var1) {
		Login.Login_loadingText = var1;
		Login.Login_loadingPercent = var0;
	}
}
