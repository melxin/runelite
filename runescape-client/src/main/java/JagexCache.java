import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lus;"
	)
	@Export("JagexCache_randomDat")
	public static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lus;"
	)
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lus;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;

	static {
		JagexCache_randomDat = null;
		JagexCache_dat2File = null;
		JagexCache_idx255File = null;
	}
}
