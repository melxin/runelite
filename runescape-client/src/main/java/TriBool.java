import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sd")
@Implements("TriBool")
public class TriBool {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lsd;"
	)
	@Export("TriBool_unknown")
	public static final TriBool TriBool_unknown;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lsd;"
	)
	@Export("TriBool_true")
	public static final TriBool TriBool_true;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lsd;"
	)
	@Export("TriBool_false")
	public static final TriBool TriBool_false;

	static {
		TriBool_unknown = new TriBool();
		TriBool_true = new TriBool();
		TriBool_false = new TriBool();
	}

	TriBool() {
	}

	@ObfuscatedName("ol")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "110"
	)
	static boolean method9327() {
		return Renderable.clientPreferences.getEULA() >= Client.field791;
	}
}
