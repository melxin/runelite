import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rt")
@Implements("SwapSongTask")
public class SwapSongTask extends SongTask {
	@ObfuscatedSignature(
		descriptor = "(Lsj;)V"
	)
	public SwapSongTask(SongTask var1) {
		super(var1);
		super.field5191 = "SwapSongTask";
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1329200530"
	)
	public boolean vmethod9672() {
		if (class337.midiRequests.size() > 1 && class337.midiRequests.get(0) != null && ((MidiRequest)class337.midiRequests.get(0)).midiPcmStream.isReady() && class337.midiRequests.get(1) != null && ((MidiRequest)class337.midiRequests.get(1)).midiPcmStream.isReady()) {
			MidiRequest var1 = (MidiRequest)class337.midiRequests.get(0);
			class337.midiRequests.set(0, class337.midiRequests.get(1));
			class337.midiRequests.set(1, var1);
		}

		return true;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)[Lms;",
		garbageValue = "909118085"
	)
	public static class326[] method9633() {
		return new class326[]{class326.field3552, class326.field3550, class326.field3549, class326.field3560, class326.field3553, class326.field3554, class326.field3559, class326.field3556, class326.field3555, class326.field3558, class326.field3562, class326.field3561, class326.field3557};
	}
}
