import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ff")
public class class139 implements class130 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[Lml;",
		garbageValue = "-1362766009"
	)
	public static class325[] method3586() {
		return new class325[]{class325.field3493, class325.field3486, class325.field3482, class325.field3483, class325.field3484, class325.field3485, class325.field3490, class325.field3487, class325.field3491, class325.field3489, class325.field3492, class325.field3480, class325.field3481, class325.field3488};
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lmg;Lwo;B)Lmk;",
		garbageValue = "-71"
	)
	@Export("getPacketBufferNode")
	public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
		PacketBufferNode var2 = class273.method5999();
		var2.clientPacket = var0;
		var2.clientPacketLength = var0.length;
		if (var2.clientPacketLength == -1) {
			var2.packetBuffer = new PacketBuffer(260);
		} else if (var2.clientPacketLength == -2) {
			var2.packetBuffer = new PacketBuffer(10000);
		} else if (var2.clientPacketLength <= 18) {
			var2.packetBuffer = new PacketBuffer(20);
		} else if (var2.clientPacketLength <= 98) {
			var2.packetBuffer = new PacketBuffer(100);
		} else {
			var2.packetBuffer = new PacketBuffer(260);
		}

		var2.packetBuffer.setIsaacCipher(var1);
		var2.packetBuffer.writeByteIsaac(var2.clientPacket.id);
		var2.index = 0;
		return var2;
	}
}
