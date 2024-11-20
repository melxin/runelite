import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
public class class197 extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("field2022")
	static EvictingDualNodeHashTable field2022;
	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "Lue;"
	)
	static Fonts field2045;

	static {
		field2022 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "338741490"
	)
	static void method3963(int var0, String var1) {
		int var2 = Client.playerUpdateManager.playerCount;
		int[] var3 = Client.playerUpdateManager.playerIndices;
		boolean var4 = false;
		Username var5 = new Username(var1, class28.loginType);

		for (int var6 = 0; var6 < var2; ++var6) {
			Player var7 = AsyncHttpResponse.localPlayer.worldView.players[var3[var6]];
			if (var7 != null && var7 != AsyncHttpResponse.localPlayer && var7.username != null && var7.username.equals(var5)) {
				PacketBufferNode var8;
				if (var0 == 1) {
					var8 = Message.getPacketBufferNode(ClientPacket.OPPLAYER1, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeByteNeg(0);
					var8.packetBuffer.writeShortAdd(var3[var6]);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 4) {
					var8 = Message.getPacketBufferNode(ClientPacket.OPPLAYER4, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShortAddLE(var3[var6]);
					var8.packetBuffer.writeByte(0);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 6) {
					var8 = Message.getPacketBufferNode(ClientPacket.OPPLAYER6, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShortAdd(var3[var6]);
					var8.packetBuffer.writeByteNeg(0);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 7) {
					var8 = Message.getPacketBufferNode(ClientPacket.OPPLAYER7, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeByteSub(0);
					var8.packetBuffer.writeShort(var3[var6]);
					Client.packetWriter.addNode(var8);
				}

				var4 = true;
				break;
			}
		}

		if (!var4) {
			class289.addGameMessage(4, "", "Unable to find " + var1);
		}

	}
}
