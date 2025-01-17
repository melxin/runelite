import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rp")
@Implements("SwapSongTask")
public class SwapSongTask extends SongTask {
	@ObfuscatedSignature(
		descriptor = "(Lrh;)V"
	)
	public SwapSongTask(SongTask var1) {
		super(var1);
		super.field4868 = "SwapSongTask";
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1892560666"
	)
	public boolean vmethod8883() {
		if (class333.midiRequests.size() > 1 && class333.midiRequests.get(0) != null && ((MidiRequest)class333.midiRequests.get(0)).midiPcmStream.isReady() && class333.midiRequests.get(1) != null && ((MidiRequest)class333.midiRequests.get(1)).midiPcmStream.isReady()) {
			MidiRequest var1 = (MidiRequest)class333.midiRequests.get(0);
			class333.midiRequests.set(0, class333.midiRequests.get(1));
			class333.midiRequests.set(1, var1);
		}

		return true;
	}
}
