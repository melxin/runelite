import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rj")
@Implements("SwapSongTask")
public class SwapSongTask extends SongTask {
	@ObfuscatedName("wb")
	@ObfuscatedGetter(
		intValue = 1418334393
	)
	static int field5023;

	@ObfuscatedSignature(
		descriptor = "(Lro;)V"
	)
	public SwapSongTask(SongTask var1) {
		super(var1);
		super.field5039 = "SwapSongTask";
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1093204820"
	)
	public boolean vmethod8938() {
		if (class335.midiRequests.size() > 1 && class335.midiRequests.get(0) != null && ((MidiRequest)class335.midiRequests.get(0)).midiPcmStream.isReady() && class335.midiRequests.get(1) != null && ((MidiRequest)class335.midiRequests.get(1)).midiPcmStream.isReady()) {
			MidiRequest var1 = (MidiRequest)class335.midiRequests.get(0);
			class335.midiRequests.set(0, class335.midiRequests.get(1));
			class335.midiRequests.set(1, var1);
		}

		return true;
	}
}
