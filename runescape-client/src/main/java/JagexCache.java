import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lvv;"
	)
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lvv;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "[Lvv;"
	)
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;
	@ObfuscatedName("an")
	@Export("osNameLowercase")
	public static String osNameLowercase;
	@ObfuscatedName("ay")
	static File field3109;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -15820721
	)
	static int field3110;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lvv;"
	)
	@Export("JagexCache_randomDat")
	static BufferedFile JagexCache_randomDat;

	static {
		JagexCache_dat2File = null;
		JagexCache_idx255File = null;
		JagexCache_randomDat = null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZI)V",
		garbageValue = "60502392"
	)
	static void method5932(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
		class58.soundEffectIds[class58.soundEffectCount] = var0;
		class58.soundEffects[class58.soundEffectCount] = null;
		class58.soundLocations[class58.soundEffectCount] = var4 + (var3 << 8) + (var2 << 16);
		class58.field834[class58.soundEffectCount] = var1;
		class58.queuedSoundEffectLoops[class58.soundEffectCount] = var6;
		class58.queuedSoundEffectDelays[class58.soundEffectCount] = var7;
		class58.field829[class58.soundEffectCount] = var5;
		class58.field835[class58.soundEffectCount] = var8;
		++class58.soundEffectCount;
	}
}
