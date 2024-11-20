import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ns")
public class class362 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lvf;",
		garbageValue = "1729000884"
	)
	@Export("getDbRowType")
	public static DbRowType getDbRowType(int var0) {
		DbRowType var1 = (DbRowType)DbRowType.DBRowType_cache.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = DbRowType.field5415.takeFile(38, var0);
			var1 = new DbRowType();
			if (var2 != null) {
				var1.method10002(new Buffer(var2));
			}

			var1.method10005();
			DbRowType.DBRowType_cache.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("os")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-838618155"
	)
	static final void method7400(int var0, int var1) {
		if (Client.currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3676()) {
				ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
				if (var2.rank == -1) {
					PacketBufferNode var3 = Message.getPacketBufferNode(ClientPacket.CLAN_SETTINGS_ADD_BANNED_FROM_CHANNEL, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(3 + class164.stringCp1252NullTerminatedByteSize(var2.username.getName()));
					var3.packetBuffer.writeByte(var0);
					var3.packetBuffer.writeShort(var1);
					var3.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName());
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}
}
