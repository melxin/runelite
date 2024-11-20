import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ln")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("ab")
	@Export("text")
	String text;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -169076069
	)
	@Export("width")
	int width;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -946816743
	)
	@Export("height")
	int height;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILkb;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1;
		this.width = var2;
		this.height = var3;
		this.size = var4;
	}
}
