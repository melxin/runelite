import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
@Implements("TextureLoader")
public interface TextureLoader {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)[I",
		garbageValue = "-36"
	)
	@Export("getTexturePixels")
	int[] getTexturePixels(int var1);

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-203742621"
	)
	@Export("getAverageTextureRGB")
	int getAverageTextureRGB(int var1);

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "0"
	)
	boolean vmethod5526(int var1);

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-882535974"
	)
	@Export("isLowDetail")
	boolean isLowDetail(int var1);
}
