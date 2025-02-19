import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ki")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
	@ObfuscatedName("wz")
	@ObfuscatedSignature(
		descriptor = "Ltu;"
	)
	@Export("masterDisk")
	static ArchiveDisk masterDisk;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 389583579
	)
	@Export("approxDestinationX")
	public int approxDestinationX;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -74497855
	)
	@Export("approxDestinationY")
	public int approxDestinationY;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -943619721
	)
	@Export("approxDestinationSizeX")
	public int approxDestinationSizeX;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1233727717
	)
	@Export("approxDestinationSizeY")
	public int approxDestinationSizeY;

	protected RouteStrategy() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIILkj;B)Z",
		garbageValue = "82"
	)
	@Export("hasArrived")
	protected abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-62"
	)
	static void method5690() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var0.stream1 != null) {
				WorldMapIcon_0.pcmStreamMixer.removeSubStream(var0.stream1);
				var0.stream1 = null;
			}

			if (var0.stream2 != null) {
				WorldMapIcon_0.pcmStreamMixer.removeSubStream(var0.stream2);
				var0.stream2 = null;
			}
		}

		ObjectSound.objectSounds.clear();
	}
}
