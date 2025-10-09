import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jt")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[Lvy;"
	)
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	@Export("JagexCache_randomDat")
	public static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("ai")
	static String[] field3115;

	static {
		JagexCache_dat2File = null;
		JagexCache_idx255File = null;
		JagexCache_randomDat = null;
	}

	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1461365294"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop;
	}
}
