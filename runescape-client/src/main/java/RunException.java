import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("xe")
@Implements("RunException")
public class RunException extends RuntimeException {
	@ObfuscatedName("af")
	@Export("RunException_applet")
	public static Applet RunException_applet;
	@ObfuscatedName("aw")
	public static String field6086;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 422833867
	)
	@Export("RunException_revision")
	public static int RunException_revision;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -570724943
	)
	public static int field6088;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1710137891
	)
	public static int field6089;
	@ObfuscatedName("aq")
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
