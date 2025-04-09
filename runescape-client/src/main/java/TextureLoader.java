import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hj")
@Implements("TextureLoader")
public interface TextureLoader {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "2121605786"
	)
	@Export("getTexturePixels")
	int[] getTexturePixels(int var1);

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1615037448"
	)
	@Export("getAverageTextureRGB")
	int getAverageTextureRGB(int var1);

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "1824"
	)
	boolean vmethod4697(int var1);

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "18"
	)
	@Export("isLowDetail")
	boolean isLowDetail(int var1);
}
