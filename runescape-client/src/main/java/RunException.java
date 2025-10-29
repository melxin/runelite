import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("yg")
@Implements("RunException")
public class RunException extends RuntimeException {
	@ObfuscatedName("at")
	public static String field6189;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1528671493
	)
	@Export("RunException_revision")
	public static int RunException_revision;
	@ObfuscatedName("aj")
	@Export("message")
	String message;
	@ObfuscatedName("ak")
	@Export("throwable")
	Throwable throwable;

	RunException(Throwable var1, String var2) {
		this.message = var2;
		this.throwable = var1;
	}
}
