import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sb")
@Implements("TriBool")
public class TriBool {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lsb;"
	)
	@Export("TriBool_unknown")
	public static final TriBool TriBool_unknown;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lsb;"
	)
	@Export("TriBool_true")
	public static final TriBool TriBool_true;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lsb;"
	)
	@Export("TriBool_false")
	public static final TriBool TriBool_false;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;

	static {
		TriBool_unknown = new TriBool();
		TriBool_true = new TriBool();
		TriBool_false = new TriBool();
	}

	TriBool() {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "-1385881134"
	)
	public static float method9284(int var0) {
		var0 &= 16383;
		return (float)(3.834951969714103E-4D * (double)((float)var0));
	}
}
