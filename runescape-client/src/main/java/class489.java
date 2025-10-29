import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sg")
public class class489 {
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 120179835
	)
	@Export("canvasWidth")
	public static int canvasWidth;
	@ObfuscatedName("aw")
	@Export("hasFocus")
	protected static boolean hasFocus;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 366003319
	)
	int field5391;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 74375141
	)
	int field5395;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -682217117
	)
	int field5392;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -341250883
	)
	int field5393;

	public String toString() {
		boolean var1 = true;
		int var2 = 10 - Integer.toString(this.field5391).length();
		int var3 = 10 - Integer.toString(this.field5392).length();
		int var4 = 10 - Integer.toString(this.field5395).length();
		String var5 = "          ".substring(10 - var2);
		String var6 = "          ".substring(10 - var3);
		String var7 = "          ".substring(10 - var4);
		return "    Size: " + this.field5391 + var5 + "Created: " + this.field5395 + var7 + "Total used: " + this.field5392 + var6 + "Max-In-Use: " + this.field5393;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/Socket;IIB)Ltd;",
		garbageValue = "-71"
	)
	public static AbstractSocket method10024(Socket var0, int var1, int var2) throws IOException {
		return new BufferedNetSocket(var0, var1, var2);
	}
}
