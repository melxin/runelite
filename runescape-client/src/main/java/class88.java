import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dl")
public class class88 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)[Lsm;",
		garbageValue = "-11"
	)
	public static class492[] method2470() {
		return new class492[]{class492.field5095, class492.field5090, class492.field5091};
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2030810300"
	)
	public static void method2485() {
		while (true) {
			ArchiveDiskAction var0;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
				var0 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast();
			}

			if (var0 == null) {
				return;
			}

			var0.archive.load(var0.archiveDisk, (int)var0.key, var0.data, false);
		}
	}

	@ObfuscatedName("ot")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "631172359"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (class178.friendsChat != null) {
			PacketBufferNode var1 = Message.getPacketBufferNode(ClientPacket.CLAN_KICKUSER, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(class164.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}
