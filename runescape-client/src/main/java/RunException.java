import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("xj")
@Implements("RunException")
public class RunException extends RuntimeException {
	@ObfuscatedName("al")
	@Export("RunException_applet")
	public static Applet RunException_applet;
	@ObfuscatedName("ab")
	public static String field5986;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 459245573
	)
	@Export("RunException_revision")
	public static int RunException_revision;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -965690727
	)
	public static int field5988;
	@ObfuscatedName("as")
	@Export("message")
	String message;
	@ObfuscatedName("ah")
	@Export("throwable")
	Throwable throwable;

	RunException(Throwable var1, String var2) {
		this.message = var2;
		this.throwable = var1;
	}
}
