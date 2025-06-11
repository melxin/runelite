import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sm")
public class class469 extends SongTask {
	@ObfuscatedName("td")
	@ObfuscatedGetter(
		intValue = -680874303
	)
	static int field5099;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	AbstractArchive field5096;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	AbstractArchive field5097;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	AbstractArchive field5098;

	@ObfuscatedSignature(
		descriptor = "(Lrh;Lps;Lps;Lps;)V"
	)
	public class469(SongTask var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4) {
		super(var1);
		this.field5096 = var2;
		this.field5097 = var3;
		this.field5098 = var4;
		super.field5090 = "LoadSongTask";
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1822823713"
	)
	public boolean vmethod9290() {
		int var1 = 0;
		Iterator var2 = class335.midiRequests.iterator();

		while (true) {
			while (var2.hasNext()) {
				MidiRequest var3 = (MidiRequest)var2.next();
				if (var3 != null && var3.midiPcmStream.field3739 > 1 && var3.midiPcmStream.method6951()) {
					this.method9268("Attempted to load patches of already loading midiplayer!");
					return true;
				}

				if (var3 != null && !var3.field3820) {
					try {
						if (var3.musicTrackArchive != null && var3.musicTrackGroupId != -1 && var3.musicTrackFileId != -1) {
							if (var3.field3822 == null) {
								var3.field3822 = MusicTrack.readTrack(var3.musicTrackArchive, var3.musicTrackGroupId, var3.musicTrackFileId);
								if (var3.field3822 == null) {
									continue;
								}
							}

							if (var3.field3821 == null) {
								var3.field3821 = new SoundCache(this.field5098, this.field5097);
							}

							if (var3.midiPcmStream.updateExternalPlayer(var3.field3822, this.field5096, var3.field3821)) {
								++var1;
								var3.field3820 = true;
								var3.midiPcmStream.method7044();
							}
						} else {
							++var1;
						}
					} catch (Exception var5) {
						class569.RunException_sendStackTrace((String)null, var5);
						this.method9268(var5.getMessage());
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "2134975272"
	)
	public static int method9292(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if (var4 <= 127) {
				++var2;
			} else if (var4 <= 2047) {
				var2 += 2;
			} else {
				var2 += 3;
			}
		}

		return var2;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-739749205"
	)
	static void method9294(int var0, String var1) {
		Login.Login_loadingText = var1;
		Login.Login_loadingPercent = var0;
	}
}
