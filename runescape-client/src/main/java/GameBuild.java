import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ot")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("LIVE")
	public static final GameBuild LIVE;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("BUILDLIVE")
	public static final GameBuild BUILDLIVE;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("RC")
	public static final GameBuild RC;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("WIP")
	public static final GameBuild WIP;
	@ObfuscatedName("au")
	@Export("name")
	public final String name;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 67425121
	)
	@Export("buildId")
	public final int buildId;

	static {
		LIVE = new GameBuild("LIVE", 0);
		BUILDLIVE = new GameBuild("BUILDLIVE", 3);
		RC = new GameBuild("RC", 1);
		WIP = new GameBuild("WIP", 2);
	}

	GameBuild(String var1, int var2) {
		this.name = var1;
		this.buildId = var2;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIFFFI)F",
		garbageValue = "-1981323685"
	)
	public static float method8169(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
		float var11 = (float)((var6 - var7) * (var2 - var4) + (var5 - var7) * (var4 - var3));
		float var12 = (float)((var6 - var7) * (var0 - var4) + (var1 - var7) * (var4 - var3)) / var11;
		float var13 = (float)((var7 - var5) * (var0 - var4) + (var1 - var7) * (var2 - var4)) / var11;
		float var14 = 1.0F - var12 - var13;
		return var14 * var10 + var12 * var8 + var9 * var13;
	}
}
