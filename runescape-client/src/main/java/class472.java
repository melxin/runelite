import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sh")
public class class472 extends SongTask {
	@ObfuscatedSignature(
		descriptor = "(Lsw;)V"
	)
	public class472(SongTask var1) {
		super(var1);
		super.field5350 = "StartSongTask";
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1369867803"
	)
	public boolean vmethod9763() {
		Iterator var1 = class338.midiRequests.iterator();

		while (var1.hasNext()) {
			MidiRequest var2 = (MidiRequest)var1.next();
			if (var2 != null && !var2.field4021 && var2.midiPcmStream != null) {
				try {
					var2.midiPcmStream.method7153();
					var2.midiPcmStream.setPcmStreamVolume(0);
					if (var2.field4027 != null) {
						var2.midiPcmStream.setMusicTrack(var2.field4027, var2.musicTrackBoolean);
					}

					var2.field4027 = null;
					var2.field4022 = null;
					var2.musicTrackArchive = null;
					var2.field4021 = true;
				} catch (Exception var4) {
					ArchiveDiskActionHandler.RunException_sendStackTrace((String)null, var4);
					this.method9741(var4.getMessage());
					return true;
				}
			}
		}

		super.field5351 = true;
		return true;
	}
}
