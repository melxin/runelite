import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lc")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 344526015
	)
	@Export("width")
	int width;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1523531445
	)
	@Export("height")
	int height;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -2127076021
	)
	@Export("x")
	int x;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -841957029
	)
	@Export("y")
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	final WorldMapRenderer this$0;

	@ObfuscatedSignature(
		descriptor = "(Llm;)V"
	)
	WorldMapRectangle(WorldMapRenderer var1) {
		this.this$0 = var1;
	}
}
