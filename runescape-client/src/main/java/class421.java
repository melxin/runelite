import java.awt.datatransfer.Clipboard;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qj")
public final class class421 {
	@ObfuscatedName("ay")
	@Export("base37Table")
	static final char[] base37Table;
	@ObfuscatedName("ah")
	static long[] field4725;

	static {
		base37Table = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		field4725 = new long[12];

		for (int var0 = 0; var0 < field4725.length; ++var0) {
			field4725[var0] = (long)Math.pow(37.0D, (double)var0);
		}

	}

	@ObfuscatedName("oc")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/datatransfer/Clipboard;",
		garbageValue = "1286264344"
	)
	public static Clipboard method8239() {
		return Client.client.method551();
	}
}
