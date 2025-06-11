import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bq")
public class class31 {
	@ObfuscatedName("al")
	public static Applet field151;
	@ObfuscatedName("ac")
	public static String field155;
	@ObfuscatedName("ar")
	@Export("Tiles_overlays")
	static short[][][] Tiles_overlays;
	@ObfuscatedName("sw")
	@ObfuscatedSignature(
		descriptor = "Lbh;"
	)
	@Export("tempMenuAction")
	static MenuAction tempMenuAction;

	static {
		field151 = null;
		field155 = "";
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgq;",
		garbageValue = "-86"
	)
	@Export("getInvDefinition")
	public static InvDefinition getInvDefinition(int var0) {
		InvDefinition var1 = (InvDefinition)InvDefinition.InvDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = InvDefinition.InvDefinition_archive.takeFile(5, var0);
			var1 = new InvDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			InvDefinition.InvDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1342978777"
	)
	public static int method456(int var0) {
		return var0 >> 1 & 1023;
	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-510830099"
	)
	static void method461() {
		for (class270 var0 = (class270)Client.field427.last(); var0 != null; var0 = (class270)Client.field427.previous()) {
			var0.remove();
		}

	}
}
