import java.awt.datatransfer.Clipboard;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("th")
@Implements("TriBool")
public class TriBool {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	@Export("TriBool_unknown")
	public static final TriBool TriBool_unknown;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	@Export("TriBool_true")
	public static final TriBool TriBool_true;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	@Export("TriBool_false")
	public static final TriBool TriBool_false;
	@ObfuscatedName("as")
	@Export("SpriteBuffer_spritePalette")
	public static int[] SpriteBuffer_spritePalette;

	static {
		TriBool_unknown = new TriBool();
		TriBool_true = new TriBool();
		TriBool_false = new TriBool();
	}

	TriBool() {
	}

	@ObfuscatedName("pp")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/datatransfer/Clipboard;",
		garbageValue = "195320137"
	)
	public static Clipboard method10061() {
		return class521.client.method685();
	}
}
