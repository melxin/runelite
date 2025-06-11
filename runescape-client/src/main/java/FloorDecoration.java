import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jd")
@Implements("FloorDecoration")
public final class FloorDecoration {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ljr;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = 4010746377285225209L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1210278711
	)
	@Export("z")
	int z;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 2127434873
	)
	@Export("x")
	int x;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 108491785
	)
	@Export("y")
	int y;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1480057111
	)
	@Export("flags")
	int flags;

	FloorDecoration() {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "103"
	)
	public static void method4979(int var0, int var1, int var2, int var3) {
		if (class335.midiRequests.size() > 1 && class335.midiRequests.get(0) != null && ((MidiRequest)class335.midiRequests.get(0)).midiPcmStream.isReady() && class335.midiRequests.get(1) != null && ((MidiRequest)class335.midiRequests.get(1)).midiPcmStream.isReady()) {
			class175.method3946(var0, var1, var2, var3);
			class335.field3699.add(new SwapSongTask((SongTask)null));
			ArrayList var4 = new ArrayList();
			var4.add(new DelayFadeTask(new FadeInTask((SongTask)null, 1, false, class335.field3703), class335.field3702));
			var4.add(new DelayFadeTask(new FadeOutTask((SongTask)null, 0, false, class335.field3697), class335.musicPlayerStatus));
			class335.field3699.add(new ConcurrentMidiTask((SongTask)null, var4));
			if (class335.field3698.get(0) != null && class335.field3698.get(1) != null) {
				MidiRequest var5 = (MidiRequest)class335.field3698.get(0);
				class335.field3698.set(0, class335.midiRequests.get(1));
				class335.field3698.set(1, var5);
			}
		}

	}
}
