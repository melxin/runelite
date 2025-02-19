import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rv")
public class class459 extends SongTask {
	@ObfuscatedName("ab")
	ArrayList field5013;

	@ObfuscatedSignature(
		descriptor = "(Lrt;Ljava/util/ArrayList;)V"
	)
	public class459(SongTask var1, ArrayList var2) {
		super(var1);
		super.field5028 = "ClearRequestTask";
		this.field5013 = var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2115930134"
	)
	public boolean vmethod8896() {
		if (this.field5013.isEmpty()) {
			return true;
		} else {
			Iterator var1 = this.field5013.iterator();

			while (var1.hasNext()) {
				MidiRequest var2 = (MidiRequest)var1.next();

				try {
					if (class335.midiRequests.contains(var2)) {
						if (var2 == null) {
							class335.midiRequests.remove(var2);
						} else {
							if (var2.midiPcmStream.field3728 > 0) {
								--var2.midiPcmStream.field3728;
							}

							if (var2.midiPcmStream.field3728 == 0) {
								var2.midiPcmStream.clear();
								var2.midiPcmStream.method6619();
								var2.midiPcmStream.setPcmStreamVolume(0);
							}

							JagexCache.method4478(var2.musicTrackGroupId, var2.musicTrackFileId);
							class335.midiRequests.remove(var2);
						}
					}
				} catch (Exception var4) {
					class213.RunException_sendStackTrace((String)null, var4);
					this.method8875(var4.getMessage());
					class335.midiRequests.clear();
					return true;
				}
			}

			return true;
		}
	}
}
