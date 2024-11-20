import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rf")
public class class450 extends SongTask {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lgc;"
	)
	static ClanChannel field4885;
	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("archive12")
	static Archive archive12;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	AbstractArchive field4886;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	AbstractArchive field4888;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	AbstractArchive field4887;

	@ObfuscatedSignature(
		descriptor = "(Lrg;Lpi;Lpi;Lpi;)V"
	)
	public class450(SongTask var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4) {
		super(var1);
		this.field4886 = var2;
		this.field4888 = var3;
		this.field4887 = var4;
		super.field4876 = "LoadSongTask";
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-1"
	)
	public boolean vmethod8722() {
		int var1 = 0;
		Iterator var2 = class333.musicSongs.iterator();

		while (true) {
			while (var2.hasNext()) {
				MusicSong var3 = (MusicSong)var2.next();
				if (var3 != null && var3.midiPcmStream.field3667 > 1 && var3.midiPcmStream.method6677()) {
					this.method8702("Attempted to load patches of already loading midiplayer!");
					return true;
				}

				if (var3 != null && !var3.field3741) {
					try {
						if (var3.musicTrackArchive != null && var3.musicTrackGroupId != -1 && var3.musicTrackFileId != -1) {
							if (var3.field3747 == null) {
								var3.field3747 = MusicTrack.readTrack(var3.musicTrackArchive, var3.musicTrackGroupId, var3.musicTrackFileId);
								if (var3.field3747 == null) {
									continue;
								}
							}

							if (var3.field3746 == null) {
								var3.field3746 = new SoundCache(this.field4887, this.field4888);
							}

							if (var3.midiPcmStream.updateExternalPlayer(var3.field3747, this.field4886, var3.field3746)) {
								++var1;
								var3.field3741 = true;
								var3.midiPcmStream.method6557();
							}
						} else {
							++var1;
						}
					} catch (Exception var5) {
						ArchiveLoader.RunException_sendStackTrace((String)null, var5);
						this.method8702(var5.getMessage());
						return true;
					}
				} else {
					++var1;
				}
			}

			if (var1 == class333.musicSongs.size()) {
				return true;
			}

			return false;
		}
	}
}
