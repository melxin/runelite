import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("om")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("LIVE")
	public static final GameBuild LIVE;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("BUILDLIVE")
	public static final GameBuild BUILDLIVE;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("RC")
	public static final GameBuild RC;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("WIP")
	public static final GameBuild WIP;
	@ObfuscatedName("ah")
	@Export("name")
	public final String name;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 2079755729
	)
	@Export("buildId")
	public final int buildId;

	static {
		LIVE = new GameBuild("LIVE", 0);
		BUILDLIVE = new GameBuild("BUILDLIVE", 3);
		RC = new GameBuild("RC", 1);
		WIP = new GameBuild("WIP", 2);
	}

	GameBuild(String var1, int var2) {
		this.name = var1;
		this.buildId = var2;
	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "52"
	)
	static final void method7512(boolean var0) {
		UrlRequester.method3151();
		++Client.packetWriter.pendingWrites;
		if (Client.packetWriter.pendingWrites >= 50 || var0) {
			Client.packetWriter.pendingWrites = 0;
			if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) {
				PacketBufferNode var1 = class272.getPacketBufferNode(ClientPacket.NO_TIMEOUT, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var1);

				try {
					Client.packetWriter.flush();
				} catch (IOException var3) {
					Client.hadNetworkError = true;
				}
			}

		}
	}
}
