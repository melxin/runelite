import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
public class class209 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	@Export("soundSystem")
	static SoundSystem soundSystem;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 389269371
	)
	public int field2206;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 415853017
	)
	public int field2205;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1933155739
	)
	public int field2207;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1411426351
	)
	public int field2211;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1449960993
	)
	public int field2209;

	class209(int var1, int var2, int var3, int var4, int var5) {
		this.field2206 = 0;
		this.field2205 = 1;
		this.field2207 = 0;
		this.field2211 = 0;
		this.field2209 = 0;
		this.field2206 = var1;
		this.field2205 = var2;
		this.field2207 = var3;
		this.field2211 = var4;
		this.field2209 = var5;
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "103"
	)
	static boolean method4400() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
			while (Client.archiveLoadersDone < Client.archiveLoaders.size()) {
				ArchiveLoader var0 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone);
				if (!var0.isLoaded()) {
					return false;
				}

				++Client.archiveLoadersDone;
			}

			return true;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ov")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-357909587"
	)
	static final void method4399(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : PendingSpawn.guestClanChannel;
		if (var2 != null && var1 >= 0 && var1 < var2.method3878()) {
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1);
			if (var3.rank == -1) {
				String var4 = var3.username.getName();
				PacketBufferNode var5 = class139.getPacketBufferNode(ClientPacket.CLAN_CHANNEL_KICK_USER, Client.packetWriter.isaacCipher);
				var5.packetBuffer.writeByte(3 + FriendsChat.stringCp1252NullTerminatedByteSize(var4));
				var5.packetBuffer.writeByte(var0);
				var5.packetBuffer.writeShort(var1);
				var5.packetBuffer.writeStringCp1252NullTerminated(var4);
				Client.packetWriter.addNode(var5);
			}
		}
	}
}
