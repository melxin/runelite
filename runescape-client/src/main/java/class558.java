import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vq")
public class class558 extends class560 {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 813582751
	)
	int field5752;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -284046771
	)
	int field5753;

	public class558(int var1, int var2, int var3, int var4) {
		super(var3, var4);
		this.field5752 = 0;
		this.field5753 = 0;
		this.field5752 = var1;
		this.field5753 = var2;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-19"
	)
	public int method10969() {
		double var1 = this.method10984();
		return (int)Math.round((double)this.field5752 + var1 * (double)(this.field5753 - this.field5752));
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "18818"
	)
	@Export("openURL")
	public static void openURL(String var0) {
		if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
			try {
				Desktop.getDesktop().browse(new URI(var0));
			} catch (Exception var2) {
			}
		}

	}
}
