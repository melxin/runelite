import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ci")
public class class57 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Ldz;"
	)
	@Export("soundEffects")
	static final SoundEffect[] soundEffects;
	@ObfuscatedName("ag")
	static final int[] field813;
	@ObfuscatedName("aj")
	@Export("soundEffectIds")
	static final int[] soundEffectIds;
	@ObfuscatedName("ah")
	@Export("soundLocations")
	static final int[] soundLocations;
	@ObfuscatedName("af")
	@Export("queuedSoundEffectDelays")
	static final int[] queuedSoundEffectDelays;
	@ObfuscatedName("ae")
	@Export("queuedSoundEffectLoops")
	static final int[] queuedSoundEffectLoops;
	@ObfuscatedName("aq")
	static final int[] field811;
	@ObfuscatedName("ac")
	static final boolean[] field812;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1880050749
	)
	@Export("soundEffectCount")
	public static int soundEffectCount;

	static {
		soundEffects = new SoundEffect[50];
		field813 = new int[50];
		soundEffectIds = new int[50];
		soundLocations = new int[50];
		queuedSoundEffectDelays = new int[50];
		queuedSoundEffectLoops = new int[50];
		field811 = new int[50];
		field812 = new boolean[50];
		soundEffectCount = 0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1523621566"
	)
	static final void method2062() {
		Frames.method5459("You can't add yourself to your own ignore list");
	}

	@ObfuscatedName("pj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "57"
	)
	static void method2069() {
		if (Client.oculusOrbState == 1) {
			Client.field440 = true;
		}

	}
}
