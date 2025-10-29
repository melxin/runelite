import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("he")
public class class182 extends DualNode {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("field1851")
	static EvictingDualNodeHashTable field1851;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = 8495838954768131187L
	)
	static long field1969;

	static {
		field1851 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "261830680"
	)
	public static void method4293(int var0, int var1, int var2, int var3) {
		if (class345.midiRequests.size() > 1 && class345.midiRequests.get(0) != null && ((MidiRequest)class345.midiRequests.get(0)).midiPcmStream.isReady() && class345.midiRequests.get(1) != null && ((MidiRequest)class345.midiRequests.get(1)).midiPcmStream.isReady()) {
			ItemLayer.method5256(var0, var1, var2, var3);
			class345.field3929.add(new SwapSongTask((SongTask)null));
			ArrayList var4 = new ArrayList();
			var4.add(new DelayFadeTask(new FadeInTask((SongTask)null, 1, false, class345.field3926), class345.field3932));
			var4.add(new DelayFadeTask(new FadeOutTask((SongTask)null, 0, false, class345.field3931), class345.musicPlayerStatus));
			class345.field3929.add(new ConcurrentMidiTask((SongTask)null, var4));
			if (class345.field3928.get(0) != null && class345.field3928.get(1) != null) {
				MidiRequest var5 = (MidiRequest)class345.field3928.get(0);
				class345.field3928.set(0, class345.midiRequests.get(1));
				class345.field3928.set(1, var5);
			}
		}

	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "120687688"
	)
	@Export("getWindowedMode")
	static int getWindowedMode() {
		return Client.isResizable ? 2 : 1;
	}
}
