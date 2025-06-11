import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rx")
public class class462 extends SongTask {
	@ObfuscatedName("ak")
	@Export("Tiles_underlays2")
	static byte[][][] Tiles_underlays2;
	@ObfuscatedName("ap")
	ArrayList field5077;

	@ObfuscatedSignature(
		descriptor = "(Lrh;Ljava/util/ArrayList;)V"
	)
	public class462(SongTask var1, ArrayList var2) {
		super(var1);
		super.field5090 = "ClearRequestTask";
		this.field5077 = var2;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1822823713"
	)
	public boolean vmethod9290() {
		if (this.field5077.isEmpty()) {
			return true;
		} else {
			Iterator var1 = this.field5077.iterator();

			while (var1.hasNext()) {
				MidiRequest var2 = (MidiRequest)var1.next();

				try {
					if (class335.midiRequests.contains(var2)) {
						if (var2 == null) {
							class335.midiRequests.remove(var2);
						} else {
							if (var2.midiPcmStream.field3739 > 0) {
								--var2.midiPcmStream.field3739;
							}

							if (var2.midiPcmStream.field3739 == 0) {
								var2.midiPcmStream.clear();
								var2.midiPcmStream.method6981();
								var2.midiPcmStream.setPcmStreamVolume(0);
							}

							GameEngine.method578(var2.musicTrackGroupId, var2.musicTrackFileId);
							class335.midiRequests.remove(var2);
						}
					}
				} catch (Exception var4) {
					class569.RunException_sendStackTrace((String)null, var4);
					this.method9268(var4.getMessage());
					class335.midiRequests.clear();
					return true;
				}
			}

			return true;
		}
	}

	@ObfuscatedName("ny")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "69"
	)
	static final void method9240(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		ClientPacket.clientPreferences.updateAreaSoundEffectsVolume(var0);
	}
}
