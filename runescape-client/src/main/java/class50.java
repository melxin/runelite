import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
public class class50 {
	@ObfuscatedName("al")
	static final BigInteger field698;
	@ObfuscatedName("ab")
	static final BigInteger field697;
	@ObfuscatedName("vg")
	@ObfuscatedGetter(
		intValue = 1612436693
	)
	static int field700;

	static {
		field698 = new BigInteger("10001", 16);
		field697 = new BigInteger("99448e9aa2a705a4c818cb5b861db2475e6966355cf44f8493c76026029ae6f6ef7ab96ee511485c58d6cedc9b67f1214bfc8347aee86d94f9619415d37fd0f3f41c0aaf6acb111c69e4088eb3a6d488fd45d6d20c1c9f885b2a524bbeda258ea11e7ccc39ab96e1c90e14c35700f329879cfa719a0afaa78f30392dcbe51f1b", 16);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lpx;B)V",
		garbageValue = "-72"
	)
	public static void method1868(AbstractArchive var0) {
		InvDefinition.InvDefinition_archive = var0;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "([IIIS)V",
		garbageValue = "-9616"
	)
	static void method1869(int[] var0, int var1, int var2) {
		while (var1 < var2) {
			int var3 = var0[var1];
			var0[var1] = var0[var2];
			var0[var2] = var3;
			++var1;
			--var2;
		}

	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;S)V",
		garbageValue = "3001"
	)
	static void method1867(int var0, String var1) {
		int var2 = Client.playerUpdateManager.playerCount;
		int[] var3 = Client.playerUpdateManager.playerIndices;
		boolean var4 = false;
		Username var5 = new Username(var1, class198.loginType);
		WorldView var6 = class27.localPlayer.getWorldView();
		if (var6 == null) {
			AuthenticationScheme.addGameMessage(4, "", "Unable to find " + var1 + ", current world null.");
		} else {
			for (int var7 = 0; var7 < var2; ++var7) {
				Player var8 = (Player)var6.players.get((long)var3[var7]);
				if (var8 != null && var8 != class27.localPlayer && var8.username != null && var8.username.equals(var5)) {
					PacketBufferNode var9;
					if (var0 == 1) {
						var9 = class291.getPacketBufferNode(ClientPacket.OPPLAYER1, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeShortLE(var3[var7]);
						var9.packetBuffer.writeByte(0);
						Client.packetWriter.addNode(var9);
					} else if (var0 == 4) {
						var9 = class291.getPacketBufferNode(ClientPacket.OPPLAYER4, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeByte(0);
						var9.packetBuffer.writeShortAddLE(var3[var7]);
						Client.packetWriter.addNode(var9);
					} else if (var0 == 6) {
						var9 = class291.getPacketBufferNode(ClientPacket.OPPLAYER6, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeShortAdd(var3[var7]);
						var9.packetBuffer.writeByte(0);
						Client.packetWriter.addNode(var9);
					} else if (var0 == 7) {
						var9 = class291.getPacketBufferNode(ClientPacket.OPPLAYER7, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeShortAdd(var3[var7]);
						var9.packetBuffer.writeByteAdd(0);
						Client.packetWriter.addNode(var9);
					}

					var4 = true;
					break;
				}
			}

			if (!var4) {
				AuthenticationScheme.addGameMessage(4, "", "Unable to find " + var1);
			}

		}
	}
}
