import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("js")
@Implements("TextureLoader")
public interface TextureLoader {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "-954219982"
	)
	@Export("getTexturePixels")
	int[] getTexturePixels(int var1);

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-50"
	)
	@Export("getAverageTextureRGB")
	int getAverageTextureRGB(int var1);

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "20355"
	)
	@Export("isLowDetail")
	boolean isLowDetail(int var1);
}
