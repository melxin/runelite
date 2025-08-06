import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ta")
@Implements("TriBool")
public class TriBool {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lta;"
	)
	@Export("TriBool_unknown")
	public static final TriBool TriBool_unknown;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lta;"
	)
	@Export("TriBool_true")
	public static final TriBool TriBool_true;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lta;"
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ldj;IIII)I",
		garbageValue = "37926091"
	)
	static int method10090(WorldView var0, int var1, int var2, int var3) {
		if ((var0.tileSettings[var1][var2][var3] & 8) != 0) {
			return 0;
		} else {
			return var1 > 0 && (var0.tileSettings[1][var2][var3] & 2) != 0 ? var1 - 1 : var1;
		}
	}
}
