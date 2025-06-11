import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kc")
@Implements("TextureLoader")
public interface TextureLoader {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "1086905002"
	)
	@Export("getTexturePixels")
	int[] getTexturePixels(int var1);

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1205864267"
	)
	@Export("getAverageTextureRGB")
	int getAverageTextureRGB(int var1);

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "973328106"
	)
	boolean vmethod5847(int var1);

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2032088871"
	)
	@Export("isLowDetail")
	boolean isLowDetail(int var1);
}
