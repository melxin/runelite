import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ir")
@Implements("TileRenderMode")
public class TileRenderMode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	public static final TileRenderMode field2511;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	public static final TileRenderMode field2512;

	static {
		field2511 = new TileRenderMode();
		field2512 = new TileRenderMode();
	}

	TileRenderMode() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()[Lir;"
	)
	public static TileRenderMode[] method4889() {
		return new TileRenderMode[]{field2511, field2512};
	}
}
