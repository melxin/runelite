import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lb")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("ab")
	@Export("text")
	String text;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1623083813
	)
	@Export("width")
	int width;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1183141771
	)
	@Export("height")
	int height;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILka;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1;
		this.width = var2;
		this.height = var3;
		this.size = var4;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-121089648"
	)
	@Export("isCharAlphabetic")
	public static boolean isCharAlphabetic(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}
}
