import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lp")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("ap")
	@Export("text")
	String text;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -254153767
	)
	@Export("width")
	int width;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1793098319
	)
	@Export("height")
	int height;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILki;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1;
		this.width = var2;
		this.height = var3;
		this.size = var4;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([F[II)V",
		garbageValue = "1240421715"
	)
	public static void method6622(float[] var0, int[] var1) {
		ActorSpotAnim.method9799(var0, var1, 0, var0.length - 1);
	}
}
