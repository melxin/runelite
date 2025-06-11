import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rd")
@Implements("SwapSongTask")
public class SwapSongTask extends SongTask {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	public static AbstractArchive field5075;

	@ObfuscatedSignature(
		descriptor = "(Lrh;)V"
	)
	public SwapSongTask(SongTask var1) {
		super(var1);
		super.field5090 = "SwapSongTask";
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1822823713"
	)
	public boolean vmethod9290() {
		if (class335.midiRequests.size() > 1 && class335.midiRequests.get(0) != null && ((MidiRequest)class335.midiRequests.get(0)).midiPcmStream.isReady() && class335.midiRequests.get(1) != null && ((MidiRequest)class335.midiRequests.get(1)).midiPcmStream.isReady()) {
			MidiRequest var1 = (MidiRequest)class335.midiRequests.get(0);
			class335.midiRequests.set(0, class335.midiRequests.get(1));
			class335.midiRequests.set(1, var1);
		}

		return true;
	}
}
