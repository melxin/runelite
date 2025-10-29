import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sx")
public class class487 extends SongTask {
	@ObfuscatedName("ut")
	@ObfuscatedGetter(
		intValue = 1021621853
	)
	static int field5389;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	AbstractArchive field5387;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	AbstractArchive field5386;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	AbstractArchive field5388;

	@ObfuscatedSignature(
		descriptor = "(Lsz;Lqm;Lqm;Lqm;)V"
	)
	public class487(SongTask var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4) {
		super(var1);
		this.field5387 = var2;
		this.field5386 = var3;
		this.field5388 = var4;
		super.field5378 = "LoadSongTask";
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "111"
	)
	public boolean vmethod9974() {
		int var1 = 0;
		Iterator var2 = class345.midiRequests.iterator();

		while (true) {
			while (var2.hasNext()) {
				MidiRequest var3 = (MidiRequest)var2.next();
				if (var3 != null && var3.midiPcmStream.field3948 > 1 && var3.midiPcmStream.method7442()) {
					this.method9950("Attempted to load patches of already loading midiplayer!");
					return true;
				}

				if (var3 != null && !var3.field4044) {
					try {
						if (var3.musicTrackArchive != null && var3.musicTrackGroupId != -1 && var3.musicTrackFileId != -1) {
							if (var3.field4054 == null) {
								var3.field4054 = MusicTrack.readTrack(var3.musicTrackArchive, var3.musicTrackGroupId, var3.musicTrackFileId);
								if (var3.field4054 == null) {
									continue;
								}
							}

							if (var3.field4053 == null) {
								var3.field4053 = new SoundCache(this.field5388, this.field5386);
							}

							if (var3.midiPcmStream.updateExternalPlayer(var3.field4054, this.field5387, var3.field4053)) {
								++var1;
								var3.field4044 = true;
								var3.midiPcmStream.method7367();
							}
						} else {
							++var1;
						}
					} catch (Exception var5) {
						PlayerType.RunException_sendStackTrace((String)null, var5);
						this.method9950(var5.getMessage());
						return true;
					}
				} else {
					++var1;
				}
			}

			if (var1 == class345.midiRequests.size()) {
				return true;
			}

			return false;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	static void method9976() {
		if (Login.loginIndex == 34) {
			SpotAnimationDefinition.Login_promptCredentials(false);
		}

		Login.worldSelectOpen = false;
		Rasterizer2D.Rasterizer2D_fillRectangle(0, 0, Rasterizer2D.Rasterizer2D_width, Rasterizer2D.Rasterizer2D_height, 0);
		class560.leftTitleSprite.drawAt(Login.xPadding, 0);
		WorldMapData_1.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
		class50.logoSprite.drawAt(Login.xPadding + 382 - class50.logoSprite.subWidth / 2, 18);
	}
}
