import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("xv")
@Implements("RunException")
public class RunException extends RuntimeException {
	@ObfuscatedName("at")
	public static String field6151;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 2028568107
	)
	public static int field6152;
	@ObfuscatedName("af")
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
