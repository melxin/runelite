import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rd")
public class class445 extends SongTask {
	@ObfuscatedSignature(
		descriptor = "(Lrh;)V"
	)
	public class445(SongTask var1) {
		super(var1);
		super.field4868 = "StartSongTask";
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1892560666"
	)
	public boolean vmethod8883() {
		Iterator var1 = class333.midiRequests.iterator();

		while (var1.hasNext()) {
			MidiRequest var2 = (MidiRequest)var1.next();
			if (var2 != null && !var2.field3742 && var2.midiPcmStream != null) {
				try {
					var2.midiPcmStream.method6713();
					var2.midiPcmStream.setPcmStreamVolume(0);
					if (var2.field3747 != null) {
						var2.midiPcmStream.setMusicTrack(var2.field3747, var2.musicTrackBoolean);
					}

					var2.field3747 = null;
					var2.field3746 = null;
					var2.musicTrackArchive = null;
					var2.field3742 = true;
				} catch (Exception var4) {
					class255.RunException_sendStackTrace((String)null, var4);
					this.method8861(var4.getMessage());
					return true;
				}
			}
		}

		super.field4870 = true;
		return true;
	}
}
