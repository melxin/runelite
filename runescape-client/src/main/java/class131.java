import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
public class class131 {
	@ObfuscatedName("af")
	public static final float field1545;
	@ObfuscatedName("as")
	public static final float field1546;

	static {
		field1545 = Math.ulp(1.0F);
		field1546 = 2.0F * field1545;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZLjava/lang/String;ZS)V",
		garbageValue = "22126"
	)
	static void method3265(String var0, boolean var1, String var2, boolean var3) {
		if (var1) {
			if (!var3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
				try {
					Desktop.getDesktop().browse(new URI(var0));
					return;
				} catch (Exception var5) {
				}
			}

			if (class31.field137.startsWith("win") && !var3) {
				AsyncRestClient.method175(var0, 0);
				return;
			}

			if (class31.field137.startsWith("mac")) {
				UserComparator5.method3225(var0, 1, var2);
				return;
			}

			AsyncRestClient.method175(var0, 2);
		} else {
			AsyncRestClient.method175(var0, 3);
		}

	}
}
