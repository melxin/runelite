import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dr")
@Implements("ChatChannel")
public class ChatChannel {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[Lck;"
	)
	@Export("messages")
	Message[] messages;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -842935601
	)
	@Export("count")
	int count;

	ChatChannel() {
		this.messages = new Message[100];
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lck;",
		garbageValue = "-111"
	)
	@Export("addMessage")
	Message addMessage(int var1, String var2, String var3, String var4) {
		Message var5 = this.messages[99];

		for (int var6 = this.count; var6 > 0; --var6) {
			if (var6 != 100) {
				this.messages[var6] = this.messages[var6 - 1];
			}
		}

		if (var5 == null) {
			var5 = new Message(var1, var2, var4, var3);
		} else {
			var5.remove();
			var5.removeDual();
			var5.set(var1, var2, var4, var3);
		}

		this.messages[0] = var5;
		if (this.count < 100) {
			++this.count;
		}

		return var5;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Lck;",
		garbageValue = "1661282114"
	)
	@Export("getMessage")
	Message getMessage(int var1) {
		return var1 >= 0 && var1 < this.count ? this.messages[var1] : null;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2004839987"
	)
	@Export("size")
	int size() {
		return this.count;
	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(Ldp;Ldt;IILkn;B)V",
		garbageValue = "88"
	)
	static final void method2343(WorldView var0, Player var1, int var2, int var3, MoveSpeed var4) {
		int var5 = var1.pathX[0];
		int var6 = var1.pathY[0];
		int var7 = var1.size;
		CollisionMap var8 = var0.collisionMaps[var0.plane];
		if (var5 >= var7 && var5 < var8.xSize - var7 && var6 >= var7 && var6 < var8.ySize - var7) {
			if (var2 >= var7 && var2 < var8.xSize - var7 && var3 >= var7 && var3 < var8.ySize - var7) {
				int var9 = Client.field572.method5808(var5, var6, var7, ClientPreferences.method2700(var2, var3), var8, true, Client.field711, Client.field650);
				if (var9 >= 1) {
					for (int var10 = 0; var10 < var9 - 1; ++var10) {
						var1.method2590(Client.field711[var10], Client.field650[var10], var4);
					}

				}
			}
		}
	}

	@ObfuscatedName("ow")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-1717992490"
	)
	static final void method2352(int var0, int var1, boolean var2) {
		if (Client.currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3665()) {
				ClanChannelMember var3 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
				PacketBufferNode var4 = class272.getPacketBufferNode(ClientPacket.CLAN_SETTINGS_SET_MUTED_FROM_CHANNEL, Client.packetWriter.isaacCipher);
				var4.packetBuffer.writeByte(4 + AsyncRestClient.stringCp1252NullTerminatedByteSize(var3.username.getName()));
				var4.packetBuffer.writeByte(var0);
				var4.packetBuffer.writeShort(var1);
				var4.packetBuffer.writeBoolean(var2);
				var4.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName());
				Client.packetWriter.addNode(var4);
			}
		}
	}
}
