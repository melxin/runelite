import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cm")
public class class58 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Ldl;"
	)
	@Export("soundEffects")
	static final SoundEffect[] soundEffects;
	@ObfuscatedName("at")
	static final int[] field829;
	@ObfuscatedName("ac")
	@Export("soundEffectIds")
	static final int[] soundEffectIds;
	@ObfuscatedName("ap")
	@Export("soundLocations")
	static final int[] soundLocations;
	@ObfuscatedName("aq")
	@Export("queuedSoundEffectDelays")
	static final int[] queuedSoundEffectDelays;
	@ObfuscatedName("ao")
	@Export("queuedSoundEffectLoops")
	static final int[] queuedSoundEffectLoops;
	@ObfuscatedName("as")
	static final int[] field834;
	@ObfuscatedName("al")
	static final boolean[] field835;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -921638467
	)
	@Export("soundEffectCount")
	static int soundEffectCount;

	static {
		soundEffects = new SoundEffect[50];
		field829 = new int[50];
		soundEffectIds = new int[50];
		soundLocations = new int[50];
		queuedSoundEffectDelays = new int[50];
		queuedSoundEffectLoops = new int[50];
		field834 = new int[50];
		field835 = new boolean[50];
		soundEffectCount = 0;
	}
}
