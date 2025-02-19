import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kg")
@Implements("TextureLoader")
public interface TextureLoader {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "-1465130929"
	)
	@Export("getTexturePixels")
	int[] getTexturePixels(int var1);

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "3127"
	)
	@Export("getAverageTextureRGB")
	int getAverageTextureRGB(int var1);

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "-16592"
	)
	boolean vmethod5544(int var1);

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-28"
	)
	@Export("isLowDetail")
	boolean isLowDetail(int var1);
}
