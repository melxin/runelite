import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("in")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("ao")
	static File field2389;
	@ObfuscatedName("ad")
	@Export("cacheDir")
	static File cacheDir;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Luc;"
	)
	@Export("JagexCache_randomDat")
	public static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Luc;"
	)
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Luc;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;

	static {
		JagexCache_randomDat = null;
		JagexCache_dat2File = null;
		JagexCache_idx255File = null;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1315514448"
	)
	static void method4938(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			var1.remove();
		}
	}
}
