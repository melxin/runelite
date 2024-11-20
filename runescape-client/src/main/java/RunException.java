import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("wt")
@Implements("RunException")
public class RunException extends RuntimeException {
	@ObfuscatedName("ab")
	@Export("RunException_applet")
	public static Applet RunException_applet;
	@ObfuscatedName("aw")
	public static String field5640;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 999860171
	)
	@Export("RunException_revision")
	public static int RunException_revision;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -848465771
	)
	public static int field5642;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 2052170263
	)
	public static int field5645;
	@ObfuscatedName("ac")
	@Export("message")
	String message;
	@ObfuscatedName("aj")
	@Export("throwable")
	Throwable throwable;

	RunException(Throwable var1, String var2) {
		this.message = var2;
		this.throwable = var1;
	}
}
