import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sh")
public class class475 extends SongTask {
	@ObfuscatedName("ai")
	@Export("PcmPlayer_stereo")
	protected static boolean PcmPlayer_stereo;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	AbstractArchive field5195;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	AbstractArchive field5198;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	AbstractArchive field5196;

	@ObfuscatedSignature(
		descriptor = "(Lsj;Lpx;Lpx;Lpx;)V"
	)
	public class475(SongTask var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4) {
		super(var1);
		this.field5195 = var2;
		this.field5198 = var3;
		this.field5196 = var4;
		super.field5191 = "LoadSongTask";
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1329200530"
	)
	public boolean vmethod9672() {
		int var1 = 0;
		Iterator var2 = class337.midiRequests.iterator();

		while (true) {
			while (var2.hasNext()) {
				MidiRequest var3 = (MidiRequest)var2.next();
				if (var3 != null && var3.midiPcmStream.field3806 > 1 && var3.midiPcmStream.method7198()) {
					this.method9654("Attempted to load patches of already loading midiplayer!");
					return true;
				}

				if (var3 != null && !var3.field3917) {
					try {
						if (var3.musicTrackArchive != null && var3.musicTrackGroupId != -1 && var3.musicTrackFileId != -1) {
							if (var3.field3920 == null) {
								var3.field3920 = MusicTrack.readTrack(var3.musicTrackArchive, var3.musicTrackGroupId, var3.musicTrackFileId);
								if (var3.field3920 == null) {
									continue;
								}
							}

							if (var3.field3919 == null) {
								var3.field3919 = new SoundCache(this.field5196, this.field5198);
							}

							if (var3.midiPcmStream.updateExternalPlayer(var3.field3920, this.field5195, var3.field3919)) {
								++var1;
								var3.field3917 = true;
								var3.midiPcmStream.method7253();
							}
						} else {
							++var1;
						}
					} catch (Exception var5) {
						class559.RunException_sendStackTrace((String)null, var5);
						this.method9654(var5.getMessage());
						return true;
					}
				} else {
					++var1;
				}
			}

			if (var1 == class337.midiRequests.size()) {
				return true;
			}

			return false;
		}
	}
}
