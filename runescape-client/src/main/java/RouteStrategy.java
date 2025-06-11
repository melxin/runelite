import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kn")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
	@ObfuscatedName("ln")
	@Export("worldHost")
	static String worldHost;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1407500511
	)
	@Export("approxDestinationX")
	public int approxDestinationX;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -475324681
	)
	@Export("approxDestinationY")
	public int approxDestinationY;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1740952503
	)
	@Export("approxDestinationSizeX")
	public int approxDestinationSizeX;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1789250817
	)
	@Export("approxDestinationSizeY")
	public int approxDestinationSizeY;

	protected RouteStrategy() {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIILkf;I)Z",
		garbageValue = "-1878565050"
	)
	@Export("hasArrived")
	protected abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);
}
