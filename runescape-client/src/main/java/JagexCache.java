import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jb")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lvv;"
	)
	@Export("JagexCache_dat2File")
	public static AccessFile JagexCache_dat2File;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lvt;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lvt;"
	)
	@Export("JagexCache_randomDat")
	public static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("sm")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	@Export("mousedOverWidgetIf1")
	static Widget mousedOverWidgetIf1;

	static {
		JagexCache_dat2File = null;
		JagexCache_idx255File = null;
		JagexCache_randomDat = null;
	}
}
