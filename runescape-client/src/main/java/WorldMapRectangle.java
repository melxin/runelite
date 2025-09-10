import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ln")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -476040071
	)
	@Export("width")
	int width;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1718449145
	)
	@Export("height")
	int height;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -652245765
	)
	@Export("x")
	int x;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1057871737
	)
	@Export("y")
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Llw;"
	)
	final WorldMapRenderer this$0;

	@ObfuscatedSignature(
		descriptor = "(Llw;)V"
	)
	WorldMapRectangle(WorldMapRenderer var1) {
		this.this$0 = var1;
	}
}
