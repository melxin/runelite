import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rw")
public class class466 extends SongTask {
	@ObfuscatedName("ed")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	AbstractArchive field5037;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	AbstractArchive field5035;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	AbstractArchive field5036;

	@ObfuscatedSignature(
		descriptor = "(Lrt;Lpl;Lpl;Lpl;)V"
	)
	public class466(SongTask var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4) {
		super(var1);
		this.field5037 = var2;
		this.field5035 = var3;
		this.field5036 = var4;
		super.field5028 = "LoadSongTask";
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2115930134"
	)
	public boolean vmethod8896() {
		int var1 = 0;
		Iterator var2 = class335.midiRequests.iterator();

		while (true) {
			while (var2.hasNext()) {
				MidiRequest var3 = (MidiRequest)var2.next();
				if (var3 != null && var3.midiPcmStream.field3728 > 1 && var3.midiPcmStream.method6606()) {
					this.method8875("Attempted to load patches of already loading midiplayer!");
					return true;
				}

				if (var3 != null && !var3.field3805) {
					try {
						if (var3.musicTrackArchive != null && var3.musicTrackGroupId != -1 && var3.musicTrackFileId != -1) {
							if (var3.field3811 == null) {
								var3.field3811 = MusicTrack.readTrack(var3.musicTrackArchive, var3.musicTrackGroupId, var3.musicTrackFileId);
								if (var3.field3811 == null) {
									continue;
								}
							}

							if (var3.field3810 == null) {
								var3.field3810 = new SoundCache(this.field5036, this.field5035);
							}

							if (var3.midiPcmStream.updateExternalPlayer(var3.field3811, this.field5037, var3.field3810)) {
								++var1;
								var3.field3805 = true;
								var3.midiPcmStream.method6610();
							}
						} else {
							++var1;
						}
					} catch (Exception var5) {
						class213.RunException_sendStackTrace((String)null, var5);
						this.method8875(var5.getMessage());
						return true;
					}
				} else {
					++var1;
				}
			}

			if (var1 == class335.midiRequests.size()) {
				return true;
			}

			return false;
		}
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2069187067"
	)
	static void method8895(int var0, int var1) {
		if (AbstractWorldMapIcon.clientPreferences.getMusicVolume() != 0 && var0 != -1) {
			ArrayList var2 = new ArrayList();
			var2.add(new MidiRequest(PlayerUpdateManager.archive6, var0, 0, AbstractWorldMapIcon.clientPreferences.getMusicVolume(), false));
			UserComparator3.method3219(var2, 0, 0, 0, 0, true);
			Client.playingJingle = true;
		}

	}
}
