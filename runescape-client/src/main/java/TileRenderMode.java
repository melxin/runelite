import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
@Implements("TileRenderMode")
public class TileRenderMode {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final TileRenderMode field2669;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public static final TileRenderMode field2670;

	static {
		field2669 = new TileRenderMode();
		field2670 = new TileRenderMode();
	}

	TileRenderMode() {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()[Ljn;"
	)
	public static TileRenderMode[] method5254() {
		return new TileRenderMode[]{field2669, field2670};
	}
}
