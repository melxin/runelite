import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("wg")
@Implements("RunException")
public class RunException extends RuntimeException {
	@ObfuscatedName("ay")
	@Export("RunException_applet")
	public static Applet RunException_applet;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1050277641
	)
	@Export("RunException_revision")
	public static int RunException_revision;
	@ObfuscatedName("an")
	@Export("message")
	String message;
	@ObfuscatedName("ae")
	@Export("throwable")
	Throwable throwable;

	RunException(Throwable var1, String var2) {
		this.message = var2;
		this.throwable = var1;
	}
}
