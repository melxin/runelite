import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("wu")
@Implements("RunException")
public class RunException extends RuntimeException {
	@ObfuscatedName("ao")
	@Export("RunException_applet")
	public static Applet RunException_applet;
	@ObfuscatedName("an")
	public static String field5759;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1292308967
	)
	public static int field5761;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1103091205
	)
	public static int field5762;
	@ObfuscatedName("aq")
	@Export("message")
	String message;
	@ObfuscatedName("av")
	@Export("throwable")
	Throwable throwable;

	RunException(Throwable var1, String var2) {
		this.message = var2;
		this.throwable = var1;
	}
}
