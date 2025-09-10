import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oc")
public enum class384 implements Enum {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("USERNAME_PASSWORD")
	USERNAME_PASSWORD(0, 0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	field4402(1, 1),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	field4401(2, 2);

	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -2068269419
	)
	public final int field4399;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 31266747
	)
	int field4400;

	class384(int var3, int var4) {
		this.field4399 = var3;
		this.field4400 = var4;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1935172756"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4400;
	}

	@ObfuscatedName("ou")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1075065140"
	)
	static final void method8188(int var0, int var1) {
		if (Client.currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method4076()) {
				ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
				if (var2.rank == -1) {
					PacketBufferNode var3 = UserComparator6.getPacketBufferNode(ClientPacket.CLAN_SETTINGS_ADD_BANNED_FROM_CHANNEL, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(3 + WorldMapSection2.stringCp1252NullTerminatedByteSize(var2.username.getName()));
					var3.packetBuffer.writeByte(var0);
					var3.packetBuffer.writeShort(var1);
					var3.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName());
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}
}
