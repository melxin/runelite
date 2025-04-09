import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lw")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("te")
	@ObfuscatedSignature(
		descriptor = "[Lnh;"
	)
	static Widget[] field3304;
	@ObfuscatedName("ao")
	@Export("text")
	String text;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1179207711
	)
	@Export("width")
	int width;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1762444229
	)
	@Export("height")
	int height;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILkh;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1;
		this.width = var2;
		this.height = var3;
		this.size = var4;
	}
}
