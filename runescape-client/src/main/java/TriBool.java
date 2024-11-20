import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sx")
@Implements("TriBool")
public class TriBool {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lsx;"
	)
	@Export("TriBool_unknown")
	public static final TriBool TriBool_unknown;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lsx;"
	)
	@Export("TriBool_true")
	public static final TriBool TriBool_true;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lsx;"
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-1357687384"
	)
	static boolean method9132(String var0) {
		if (var0 == null) {
			return false;
		} else {
			try {
				new URL(var0);
				return true;
			} catch (MalformedURLException var2) {
				return false;
			}
		}
	}
}
