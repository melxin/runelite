import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rv")
public class class461 extends SongTask {
	@ObfuscatedSignature(
		descriptor = "(Lro;)V"
	)
	public class461(SongTask var1) {
		super(var1);
		super.field5039 = "StartSongTask";
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1093204820"
	)
	public boolean vmethod8938() {
		Iterator var1 = class335.midiRequests.iterator();

		while (var1.hasNext()) {
			MidiRequest var2 = (MidiRequest)var1.next();
			if (var2 != null && !var2.field3818 && var2.midiPcmStream != null) {
				try {
					var2.midiPcmStream.method6634();
					var2.midiPcmStream.setPcmStreamVolume(0);
					if (var2.field3823 != null) {
						var2.midiPcmStream.setMusicTrack(var2.field3823, var2.musicTrackBoolean);
					}

					var2.field3823 = null;
					var2.field3822 = null;
					var2.musicTrackArchive = null;
					var2.field3818 = true;
				} catch (Exception var4) {
					class290.RunException_sendStackTrace((String)null, var4);
					this.method8920(var4.getMessage());
					return true;
				}
			}
		}

		super.field5036 = true;
		return true;
	}
}
