import java.util.Iterator;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sn")
@Implements("SwapSongTask")
public class SwapSongTask extends SongTask {
	@ObfuscatedSignature(
		descriptor = "(Lsw;)V"
	)
	public SwapSongTask(SongTask var1) {
		super(var1);
		super.field5350 = "SwapSongTask";
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1369867803"
	)
	public boolean vmethod9763() {
		if (class338.midiRequests.size() > 1 && class338.midiRequests.get(0) != null && ((MidiRequest)class338.midiRequests.get(0)).midiPcmStream.isReady() && class338.midiRequests.get(1) != null && ((MidiRequest)class338.midiRequests.get(1)).midiPcmStream.isReady()) {
			MidiRequest var1 = (MidiRequest)class338.midiRequests.get(0);
			class338.midiRequests.set(0, class338.midiRequests.get(1));
			class338.midiRequests.set(1, var1);
		}

		return true;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1150692534"
	)
	static void method9698() {
		Iterator var0 = Messages.Messages_hashTable.iterator();

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next();
			var1.clearIsFromIgnored();
		}

	}
}
