import java.applet.Applet;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("ba")
public class class26 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)V",
		garbageValue = "1967870338"
	)
	public static void method389(Applet var0, String var1) throws Throwable {
		JSObject.getWindow(var0).eval(var1);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;",
		garbageValue = "269207742"
	)
	public static Object method387(Applet var0, String var1) throws Throwable {
		return JSObject.getWindow(var0).call(var1, (Object[])null);
	}
}
