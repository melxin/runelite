import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ee")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -309045551
	)
	static int field1494;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1433239355
	)
	static int field1490;
	@ObfuscatedName("tt")
	@ObfuscatedGetter(
		intValue = 1571659403
	)
	static int field1489;
	@ObfuscatedName("ae")
	final URL field1488;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1764092293
	)
	volatile int field1487;
	@ObfuscatedName("as")
	@Export("response0")
	volatile byte[] response0;

	static {
		field1494 = -1;
		field1490 = -2;
	}

	UrlRequest(URL var1) {
		this.field1487 = field1494;
		this.field1488 = var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1069362501"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.field1487 != field1494;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-574806100"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-119"
	)
	public String method3192() {
		return this.field1488.toString();
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1849966916"
	)
	static final void method3195() {
		if (Client.logoutTimer > 0) {
			class440.logOut();
		} else {
			Client.timer.method7591();
			class325.updateGameState(40);
			class329.field3664 = Client.packetWriter.getSocket();
			Client.packetWriter.removeSocket();
		}
	}

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lnh;I)Ljava/lang/String;",
		garbageValue = "2019099441"
	)
	static String method3194(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) {
			for (int var2 = 1; var2 <= 5; ++var2) {
				while (true) {
					int var3 = var0.indexOf("%" + var2);
					if (var3 == -1) {
						break;
					}

					var0 = var0.substring(0, var3) + SoundSystem.method862(class233.method5031(var1, var2 - 1)) + var0.substring(var3 + 2);
				}
			}
		}

		return var0;
	}
}
