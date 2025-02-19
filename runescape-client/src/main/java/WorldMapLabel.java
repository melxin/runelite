import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lj")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("oj")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	static Widget field3311;
	@ObfuscatedName("ab")
	@Export("text")
	String text;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -657140489
	)
	@Export("width")
	int width;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1555966817
	)
	@Export("height")
	int height;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILks;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1;
		this.width = var2;
		this.height = var3;
		this.size = var4;
	}
}
