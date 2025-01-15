import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lg")
public abstract class class309 implements class311 {
	@ObfuscatedName("at")
	static int[] field3287;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1974898491
	)
	protected int field3286;

	@ObfuscatedSignature(
		descriptor = "(Lol;Lph;I)V"
	)
	protected class309(StudioGame var1, Language var2, int var3) {
		this.field3286 = var3;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)[Lvb;",
		garbageValue = "16"
	)
	@Export("FillMode_values")
	public static FillMode[] FillMode_values() {
		return new FillMode[]{FillMode.field5555, FillMode.SOLID, FillMode.field5556};
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "0"
	)
	public static void method6539(int var0, int var1, int var2, int var3) {
		if (class333.musicSongs.size() > 1 && class333.musicSongs.get(0) != null && ((MusicSong)class333.musicSongs.get(0)).midiPcmStream.isReady() && class333.musicSongs.get(1) != null && ((MusicSong)class333.musicSongs.get(1)).midiPcmStream.isReady()) {
			class333.musicPlayerStatus = var0;
			class333.field3632 = var1;
			class333.field3633 = var2;
			class333.field3634 = var3;
			class333.field3629.add(new SwapSongTask((SongTask)null));
			ArrayList var4 = new ArrayList();
			var4.add(new DelayFadeTask(new FadeInTask((SongTask)null, 1, false, class333.field3634), class333.field3633));
			var4.add(new DelayFadeTask(new FadeOutTask((SongTask)null, 0, false, class333.field3632), class333.musicPlayerStatus));
			class333.field3629.add(new ConcurrentMidiTask((SongTask)null, var4));
			if (class333.field3626.get(0) != null && class333.field3626.get(1) != null) {
				MusicSong var5 = (MusicSong)class333.field3626.get(0);
				class333.field3626.set(0, class333.musicSongs.get(1));
				class333.field3626.set(1, var5);
			}
		}

	}
}
