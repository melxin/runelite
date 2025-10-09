import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ti")
@Implements("TriBool")
public class TriBool {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lti;"
	)
	@Export("TriBool_unknown")
	public static final TriBool TriBool_unknown;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lti;"
	)
	@Export("TriBool_true")
	public static final TriBool TriBool_true;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lti;"
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([BILjava/lang/CharSequence;B)I",
		garbageValue = "5"
	)
	public static int method10171(byte[] var0, int var1, CharSequence var2) {
		int var3 = var2.length();
		int var4 = var1;

		for (int var5 = 0; var5 < var3; ++var5) {
			char var6 = var2.charAt(var5);
			if (var6 <= 127) {
				var0[var4++] = (byte)var6;
			} else if (var6 <= 2047) {
				var0[var4++] = (byte)(192 | var6 >> 6);
				var0[var4++] = (byte)(128 | var6 & '?');
			} else {
				var0[var4++] = (byte)(224 | var6 >> '\f');
				var0[var4++] = (byte)(128 | var6 >> 6 & 63);
				var0[var4++] = (byte)(128 | var6 & '?');
			}
		}

		return var4 - var1;
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1221961955"
	)
	static final void method10173() {
		Scene.Scene_isLowDetail = false;
		Client.isLowDetail = false;
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-575628468"
	)
	static void method10172(String var0, int var1) {
		Clock.method6092(0, 0);
		ArrayList var2 = new ArrayList();
		var2.add(new MidiRequest(class443.field5180, var0, "", var1, false));
		TextureProvider.method5489(var2, 0, 0, 0, 100, false);
	}
}
