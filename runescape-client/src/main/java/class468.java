import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sl")
public class class468 extends SongTask {
	@ObfuscatedName("al")
	ArrayList field5174;

	@ObfuscatedSignature(
		descriptor = "(Lsj;Ljava/util/ArrayList;)V"
	)
	public class468(SongTask var1, ArrayList var2) {
		super(var1);
		super.field5191 = "ClearRequestTask";
		this.field5174 = var2;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1329200530"
	)
	public boolean vmethod9672() {
		if (this.field5174.isEmpty()) {
			return true;
		} else {
			Iterator var1 = this.field5174.iterator();

			while (var1.hasNext()) {
				MidiRequest var2 = (MidiRequest)var1.next();

				try {
					if (class337.midiRequests.contains(var2)) {
						if (var2 == null) {
							class337.midiRequests.remove(var2);
						} else {
							if (var2.midiPcmStream.field3806 > 0) {
								--var2.midiPcmStream.field3806;
							}

							if (var2.midiPcmStream.field3806 == 0) {
								var2.midiPcmStream.clear();
								var2.midiPcmStream.method7210();
								var2.midiPcmStream.setPcmStreamVolume(0);
							}

							class33.method522(var2.musicTrackGroupId, var2.musicTrackFileId);
							class337.midiRequests.remove(var2);
						}
					}
				} catch (Exception var4) {
					class559.RunException_sendStackTrace((String)null, var4);
					this.method9654(var4.getMessage());
					class337.midiRequests.clear();
					return true;
				}
			}

			return true;
		}
	}
}
