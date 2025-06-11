import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nj")
public class class346 implements Comparator {
	class346() {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lnk;Lnk;B)I",
		garbageValue = "118"
	)
	int method7154(class339 var1, class339 var2) {
		return var1.field3762 - var2.field3762;
	}

	public int compare(Object var1, Object var2) {
		return this.method7154((class339)var1, (class339)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("or")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)Ljava/lang/String;",
		garbageValue = "-1700702958"
	)
	static String method7159(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://";
		if (Client.gameBuild == 1) {
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) {
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) {
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) {
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) {
			var0 = "local";
		}

		String var3 = "";
		if (ApproximateRouteStrategy.field267 != null) {
			var3 = "/p=" + ApproximateRouteStrategy.field267;
		}

		String var4 = "runescape.com";
		return var2 + var0 + "." + var4 + "/l=" + class28.clientLanguage + "/a=" + class134.field1582 + var3 + "/";
	}

	@ObfuscatedName("on")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)V",
		garbageValue = "1878500685"
	)
	static void method7158(Buffer var0) {
		if (Client.randomDatData != null) {
			var0.writeBytes(Client.randomDatData, 0, Client.randomDatData.length);
		} else {
			byte[] var1 = class101.randomDatData2();
			var0.writeBytes(var1, 0, var1.length);
		}
	}
}
