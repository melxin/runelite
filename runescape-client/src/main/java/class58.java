import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
public class class58 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Ldt;"
	)
	@Export("soundEffects")
	static final SoundEffect[] soundEffects;
	@ObfuscatedName("an")
	static final int[] field836;
	@ObfuscatedName("ai")
	@Export("soundEffectIds")
	static final int[] soundEffectIds;
	@ObfuscatedName("al")
	@Export("soundLocations")
	static final int[] soundLocations;
	@ObfuscatedName("ac")
	@Export("queuedSoundEffectDelays")
	static final int[] queuedSoundEffectDelays;
	@ObfuscatedName("aa")
	@Export("queuedSoundEffectLoops")
	static final int[] queuedSoundEffectLoops;
	@ObfuscatedName("am")
	static final int[] field834;
	@ObfuscatedName("ah")
	static final boolean[] field842;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1562287111
	)
	@Export("soundEffectCount")
	static int soundEffectCount;

	static {
		soundEffects = new SoundEffect[50];
		field836 = new int[50];
		soundEffectIds = new int[50];
		soundLocations = new int[50];
		queuedSoundEffectDelays = new int[50];
		queuedSoundEffectLoops = new int[50];
		field834 = new int[50];
		field842 = new boolean[50];
		soundEffectCount = 0;
	}
}
