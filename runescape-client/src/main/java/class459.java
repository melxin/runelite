import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rs")
public class class459 extends SongTask {
	@ObfuscatedName("ao")
	ArrayList field5024;

	@ObfuscatedSignature(
		descriptor = "(Lro;Ljava/util/ArrayList;)V"
	)
	public class459(SongTask var1, ArrayList var2) {
		super(var1);
		super.field5039 = "ClearRequestTask";
		this.field5024 = var2;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1093204820"
	)
	public boolean vmethod8938() {
		if (this.field5024.isEmpty()) {
			return true;
		} else {
			Iterator var1 = this.field5024.iterator();

			while (var1.hasNext()) {
				MidiRequest var2 = (MidiRequest)var1.next();

				try {
					if (class335.midiRequests.contains(var2)) {
						if (var2 == null) {
							class335.midiRequests.remove(var2);
						} else {
							if (var2.midiPcmStream.field3708 > 0) {
								--var2.midiPcmStream.field3708;
							}

							if (var2.midiPcmStream.field3708 == 0) {
								var2.midiPcmStream.clear();
								var2.midiPcmStream.method6637();
								var2.midiPcmStream.setPcmStreamVolume(0);
							}

							class359.method6985(var2.musicTrackGroupId, var2.musicTrackFileId);
							class335.midiRequests.remove(var2);
						}
					}
				} catch (Exception var4) {
					class290.RunException_sendStackTrace((String)null, var4);
					this.method8920(var4.getMessage());
					class335.midiRequests.clear();
					return true;
				}
			}

			return true;
		}
	}
}
