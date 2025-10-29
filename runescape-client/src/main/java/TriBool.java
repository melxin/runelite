import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tq")
@Implements("TriBool")
public class TriBool {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ltq;"
	)
	@Export("TriBool_unknown")
	public static final TriBool TriBool_unknown;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ltq;"
	)
	@Export("TriBool_true")
	public static final TriBool TriBool_true;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ltq;"
	)
	@Export("TriBool_false")
	public static final TriBool TriBool_false;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "Lxm;"
	)
	static IndexedSprite field5495;

	static {
		TriBool_unknown = new TriBool();
		TriBool_true = new TriBool();
		TriBool_false = new TriBool();
	}

	TriBool() {
	}
}
