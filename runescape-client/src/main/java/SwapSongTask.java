import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rl")
@Implements("SwapSongTask")
public class SwapSongTask extends SongTask {
	@ObfuscatedSignature(
		descriptor = "(Lrg;)V"
	)
	public SwapSongTask(SongTask var1) {
		super(var1);
		super.field4876 = "SwapSongTask";
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-1"
	)
	public boolean vmethod8722() {
		if (class333.musicSongs.size() > 1 && class333.musicSongs.get(0) != null && ((MusicSong)class333.musicSongs.get(0)).midiPcmStream.isReady() && class333.musicSongs.get(1) != null && ((MusicSong)class333.musicSongs.get(1)).midiPcmStream.isReady()) {
			MusicSong var1 = (MusicSong)class333.musicSongs.get(0);
			class333.musicSongs.set(0, class333.musicSongs.get(1));
			class333.musicSongs.set(1, var1);
		}

		return true;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1757489082"
	)
	public static void method8677() {
		DbRowType.DBRowType_cache.clear();
	}
}
