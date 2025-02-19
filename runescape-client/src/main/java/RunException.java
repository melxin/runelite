import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("wf")
@Implements("RunException")
public class RunException extends RuntimeException {
	@ObfuscatedName("ab")
	@Export("RunException_applet")
	public static Applet RunException_applet;
	@ObfuscatedName("ay")
	public static String field5741;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 27193665
	)
	public static int field5742;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -141024669
	)
	public static int field5743;
	@ObfuscatedName("ac")
	@Export("message")
	String message;
	@ObfuscatedName("ao")
	@Export("throwable")
	Throwable throwable;

	RunException(Throwable var1, String var2) {
		this.message = var2;
		this.throwable = var1;
	}
}
