import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lv")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("bh")
	static String field3495;
	@ObfuscatedName("km")
	@ObfuscatedGetter(
		intValue = -31361431
	)
	@Export("worldPort")
	static int worldPort;
	@ObfuscatedName("av")
	@Export("text")
	final String text;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1322204423
	)
	@Export("width")
	final int width;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1989742749
	)
	@Export("height")
	final int height;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("size")
	final WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILlp;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1;
		this.width = var2;
		this.height = var3;
		this.size = var4;
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "104"
	)
	static void method7017(int var0, int var1, int var2, int var3, int var4) {
		class179.method4283(AsyncHttpResponse.worldView, var0, var1, var2, var3, var4);
	}
}
