import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sz")
public class class474 extends SongTask {
	@ObfuscatedSignature(
		descriptor = "(Lsi;)V"
	)
	public class474(SongTask var1) {
		super(var1);
		super.field5303 = "StartSongTask";
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "40"
	)
	public boolean vmethod9673() {
		Iterator var1 = class339.midiRequests.iterator();

		while (var1.hasNext()) {
			MidiRequest var2 = (MidiRequest)var1.next();
			if (var2 != null && !var2.field4009 && var2.midiPcmStream != null) {
				try {
					var2.midiPcmStream.method7142();
					var2.midiPcmStream.setPcmStreamVolume(0);
					if (var2.field4003 != null) {
						var2.midiPcmStream.setMusicTrack(var2.field4003, var2.musicTrackBoolean);
					}

					var2.field4003 = null;
					var2.field4006 = null;
					var2.musicTrackArchive = null;
					var2.field4009 = true;
				} catch (Exception var4) {
					class508.RunException_sendStackTrace((String)null, var4);
					this.method9659(var4.getMessage());
					return true;
				}
			}
		}

		super.field5301 = true;
		return true;
	}
}
