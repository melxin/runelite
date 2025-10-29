import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sa")
public class class482 extends SongTask {
	@ObfuscatedName("pm")
	@ObfuscatedGetter(
		intValue = 1791732441
	)
	static int field5369;

	@ObfuscatedSignature(
		descriptor = "(Lsz;)V"
	)
	public class482(SongTask var1) {
		super(var1);
		super.field5378 = "StartSongTask";
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "111"
	)
	public boolean vmethod9974() {
		Iterator var1 = class345.midiRequests.iterator();

		while (var1.hasNext()) {
			MidiRequest var2 = (MidiRequest)var1.next();
			if (var2 != null && !var2.field4049 && var2.midiPcmStream != null) {
				try {
					var2.midiPcmStream.method7369();
					var2.midiPcmStream.setPcmStreamVolume(0);
					if (var2.field4054 != null) {
						var2.midiPcmStream.setMusicTrack(var2.field4054, var2.musicTrackBoolean);
					}

					var2.field4054 = null;
					var2.field4053 = null;
					var2.musicTrackArchive = null;
					var2.field4049 = true;
				} catch (Exception var4) {
					PlayerType.RunException_sendStackTrace((String)null, var4);
					this.method9950(var4.getMessage());
					return true;
				}
			}
		}

		super.field5379 = true;
		return true;
	}
}
