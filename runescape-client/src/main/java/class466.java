import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rf")
public class class466 extends SongTask {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	AbstractArchive field5047;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	AbstractArchive field5045;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	AbstractArchive field5046;

	@ObfuscatedSignature(
		descriptor = "(Lro;Lph;Lph;Lph;)V"
	)
	public class466(SongTask var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4) {
		super(var1);
		this.field5047 = var2;
		this.field5045 = var3;
		this.field5046 = var4;
		super.field5039 = "LoadSongTask";
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1093204820"
	)
	public boolean vmethod8938() {
		int var1 = 0;
		Iterator var2 = class335.midiRequests.iterator();

		while (true) {
			while (var2.hasNext()) {
				MidiRequest var3 = (MidiRequest)var2.next();
				if (var3 != null && var3.midiPcmStream.field3708 > 1 && var3.midiPcmStream.method6641()) {
					this.method8920("Attempted to load patches of already loading midiplayer!");
					return true;
				}

				if (var3 != null && !var3.field3820) {
					try {
						if (var3.musicTrackArchive != null && var3.musicTrackGroupId != -1 && var3.musicTrackFileId != -1) {
							if (var3.field3823 == null) {
								var3.field3823 = MusicTrack.readTrack(var3.musicTrackArchive, var3.musicTrackGroupId, var3.musicTrackFileId);
								if (var3.field3823 == null) {
									continue;
								}
							}

							if (var3.field3822 == null) {
								var3.field3822 = new SoundCache(this.field5046, this.field5045);
							}

							if (var3.midiPcmStream.updateExternalPlayer(var3.field3823, this.field5047, var3.field3822)) {
								++var1;
								var3.field3820 = true;
								var3.midiPcmStream.method6635();
							}
						} else {
							++var1;
						}
					} catch (Exception var5) {
						class290.RunException_sendStackTrace((String)null, var5);
						this.method8920(var5.getMessage());
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-774702153"
	)
	public static int method8941(int var0) {
		return class519.field5288[var0 & 16383];
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1137532513"
	)
	@Export("stringCp1252NullTerminatedByteSize")
	public static int stringCp1252NullTerminatedByteSize(String var0) {
		return var0.length() + 1;
	}
}
