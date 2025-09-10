import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sy")
public class class472 extends SongTask {
	@ObfuscatedName("af")
	ArrayList field5287;

	@ObfuscatedSignature(
		descriptor = "(Lsi;Ljava/util/ArrayList;)V"
	)
	public class472(SongTask var1, ArrayList var2) {
		super(var1);
		super.field5303 = "ClearRequestTask";
		this.field5287 = var2;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "40"
	)
	public boolean vmethod9673() {
		if (this.field5287.isEmpty()) {
			return true;
		} else {
			Iterator var1 = this.field5287.iterator();

			while (var1.hasNext()) {
				MidiRequest var2 = (MidiRequest)var1.next();

				try {
					if (class339.midiRequests.contains(var2)) {
						if (var2 == null) {
							class339.midiRequests.remove(var2);
						} else {
							if (var2.midiPcmStream.field3904 > 0) {
								--var2.midiPcmStream.field3904;
							}

							if (var2.midiPcmStream.field3904 == 0) {
								var2.midiPcmStream.clear();
								var2.midiPcmStream.method7143();
								var2.midiPcmStream.setPcmStreamVolume(0);
							}

							int var3 = var2.musicTrackGroupId;
							int var4 = var2.musicTrackFileId;
							Iterator var5 = class339.field3893.iterator();

							while (var5.hasNext()) {
								class345 var6 = (class345)var5.next();
								var6.vmethod7338(var3, var4);
							}

							class339.midiRequests.remove(var2);
						}
					}
				} catch (Exception var8) {
					class508.RunException_sendStackTrace((String)null, var8);
					this.method9659(var8.getMessage());
					class339.midiRequests.clear();
					return true;
				}
			}

			return true;
		}
	}
}
