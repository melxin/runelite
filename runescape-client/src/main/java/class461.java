import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rm")
public class class461 extends SongTask {
	@ObfuscatedName("ap")
	@Export("BZip2Decompressor_block")
	static int[] BZip2Decompressor_block;

	@ObfuscatedSignature(
		descriptor = "(Lrt;)V"
	)
	public class461(SongTask var1) {
		super(var1);
		super.field5028 = "StartSongTask";
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2115930134"
	)
	public boolean vmethod8896() {
		Iterator var1 = class335.midiRequests.iterator();

		while (var1.hasNext()) {
			MidiRequest var2 = (MidiRequest)var1.next();
			if (var2 != null && !var2.field3799 && var2.midiPcmStream != null) {
				try {
					var2.midiPcmStream.method6611();
					var2.midiPcmStream.setPcmStreamVolume(0);
					if (var2.field3811 != null) {
						var2.midiPcmStream.setMusicTrack(var2.field3811, var2.musicTrackBoolean);
					}

					var2.field3811 = null;
					var2.field3810 = null;
					var2.musicTrackArchive = null;
					var2.field3799 = true;
				} catch (Exception var4) {
					class213.RunException_sendStackTrace((String)null, var4);
					this.method8875(var4.getMessage());
					return true;
				}
			}
		}

		super.field5032 = true;
		return true;
	}
}
