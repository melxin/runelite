import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rp")
@Implements("SwapSongTask")
public class SwapSongTask extends SongTask {
	@ObfuscatedSignature(
		descriptor = "(Lrh;)V"
	)
	public SwapSongTask(SongTask var1) {
		super(var1);
		super.field4868 = "SwapSongTask";
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1892560666"
	)
	public boolean vmethod8883() {
		if (class333.musicSongs.size() > 1 && class333.musicSongs.get(0) != null && ((MusicSong)class333.musicSongs.get(0)).midiPcmStream.isReady() && class333.musicSongs.get(1) != null && ((MusicSong)class333.musicSongs.get(1)).midiPcmStream.isReady()) {
			MusicSong var1 = (MusicSong)class333.musicSongs.get(0);
			class333.musicSongs.set(0, class333.musicSongs.get(1));
			class333.musicSongs.set(1, var1);
		}

		return true;
	}
}
