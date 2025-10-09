import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ow")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	AbstractByteArrayCopier() {
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "237103707"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "0"
	)
	@Export("set")
	abstract void set(byte[] var1);

	@ObfuscatedName("op")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "1252469648"
	)
	static final void method8124(int var0, int var1, boolean var2) {
		if (Client.currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method4121()) {
				ClanChannelMember var3 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
				PacketBufferNode var4 = HorizontalAlignment.getPacketBufferNode(ClientPacket.CLAN_SETTINGS_SET_MUTED_FROM_CHANNEL, Client.packetWriter.isaacCipher);
				var4.packetBuffer.writeByte(4 + WorldMapArea.stringCp1252NullTerminatedByteSize(var3.username.getName()));
				var4.packetBuffer.writeByte(var0);
				var4.packetBuffer.writeShort(var1);
				var4.packetBuffer.writeBoolean(var2);
				var4.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName());
				Client.packetWriter.addNode(var4);
			}
		}
	}
}
