import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hf")
@Implements("TextureLoader")
public interface TextureLoader {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "-294472347"
	)
	@Export("getTexturePixels")
	int[] getTexturePixels(int var1);

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "667540605"
	)
	@Export("getAverageTextureRGB")
	int getAverageTextureRGB(int var1);

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1748706073"
	)
	boolean vmethod4810(int var1);

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2020085258"
	)
	@Export("isLowDetail")
	boolean isLowDetail(int var1);
}
