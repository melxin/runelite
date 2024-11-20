import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ox")
public final class class373 {
	@ObfuscatedName("oy")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2049793559"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = Message.getPacketBufferNode(ClientPacket.FRIEND_CHAT_JOIN_LEAVE, Client.packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(0);
		Client.packetWriter.addNode(var0);
	}
}
