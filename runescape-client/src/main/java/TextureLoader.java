import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ju")
@Implements("TextureLoader")
public interface TextureLoader {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "1719377543"
	)
	@Export("getTexturePixels")
	int[] getTexturePixels(int var1);

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1759511923"
	)
	@Export("getAverageTextureRGB")
	int getAverageTextureRGB(int var1);

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-593453582"
	)
	@Export("isLowDetail")
	boolean isLowDetail(int var1);
}
