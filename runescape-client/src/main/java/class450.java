import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rw")
public class class450 extends SongTask {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	AbstractArchive field4875;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	AbstractArchive field4874;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	AbstractArchive field4873;

	@ObfuscatedSignature(
		descriptor = "(Lrh;Lpq;Lpq;Lpq;)V"
	)
	public class450(SongTask var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4) {
		super(var1);
		this.field4875 = var2;
		this.field4874 = var3;
		this.field4873 = var4;
		super.field4868 = "LoadSongTask";
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1892560666"
	)
	public boolean vmethod8883() {
		int var1 = 0;
		Iterator var2 = class333.musicSongs.iterator();

		while (true) {
			while (var2.hasNext()) {
				MusicSong var3 = (MusicSong)var2.next();
				if (var3 != null && var3.midiPcmStream.field3668 > 1 && var3.midiPcmStream.method6749()) {
					this.method8861("Attempted to load patches of already loading midiplayer!");
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
								var3.field3746 = new SoundCache(this.field4873, this.field4874);
							}

							if (var3.midiPcmStream.updateExternalPlayer(var3.field3747, this.field4875, var3.field3746)) {
								++var1;
								var3.field3741 = true;
								var3.midiPcmStream.method6712();
							}
						} else {
							++var1;
						}
					} catch (Exception var5) {
						class255.RunException_sendStackTrace((String)null, var5);
						this.method8861(var5.getMessage());
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "([FIFI)F",
		garbageValue = "889884528"
	)
	static float method8887(float[] var0, int var1, float var2) {
		float var3 = var0[var1];

		for (int var4 = var1 - 1; var4 >= 0; --var4) {
			var3 = var0[var4] + var2 * var3;
		}

		return var3;
	}

	@ObfuscatedName("ng")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1840217495"
	)
	static final void method8884() {
		Iterator var0 = Client.worldViewManager.iterator();

		while (var0.hasNext()) {
			WorldView var1 = (WorldView)var0.next();

			for (int var2 = 0; var2 < Client.playerUpdateManager.playerCount; ++var2) {
				Player var3 = GameEngine.topLevelWorldView.players[Client.playerUpdateManager.playerIndices[var2]];
				if (var3 != null) {
					var3.method2662();
				}
			}
		}

	}
}
