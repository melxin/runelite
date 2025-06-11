import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bt")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("qr")
	@ObfuscatedSignature(
		descriptor = "[Lwd;"
	)
	@Export("crossSprites")
	static SpritePixels[] crossSprites;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lcr;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 44048889
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("an")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("ai")
	@Export("stringLocals")
	Object[] stringLocals;

	ScriptFrame() {
		this.pc = -1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lna;I)V",
		garbageValue = "-1336494519"
	)
	public static void method708(Huffman var0) {
		class351.huffman = var0;
	}

	@ObfuscatedName("nz")
	@ObfuscatedSignature(
		descriptor = "(Lov;I)V",
		garbageValue = "-1391817524"
	)
	@Export("invalidateWidget")
	public static void invalidateWidget(Widget var0) {
		if (var0 != null && var0.cycle == Client.field556) {
			Client.validRootWidgets[var0.rootIndex] = true;
		}

	}
}
