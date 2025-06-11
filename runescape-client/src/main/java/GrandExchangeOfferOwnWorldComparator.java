import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bn")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("ap")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lpf;Lpf;I)I",
		garbageValue = "819275693"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) {
			return 0;
		} else {
			if (this.filterWorlds) {
				if (Client.worldId == var1.world) {
					return -1;
				}

				if (var2.world == Client.worldId) {
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1;
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "182018814"
	)
	static final void method760(String var0) {
		GrandExchangeOfferWorldComparator.addGameMessage(30, "", var0);
	}

	@ObfuscatedName("aj")
	public static int method759(long var0) {
		return (int)(var0 >>> 0 & 127L);
	}

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZII)I",
		garbageValue = "1607631668"
	)
	@Export("insertMenuItem")
	static final int insertMenuItem(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7, int var8) {
		if (Client.isMenuOpen) {
			return -1;
		} else {
			return !UserList.method9679(var8, var2) ? -1 : Client.menu.insertMenuItem(var0, var1, var2, var3, var4, var5, var6, var7, var8);
		}
	}

	@ObfuscatedName("oi")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "78"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) {
			PacketBufferNode var1 = class139.getPacketBufferNode(ClientPacket.FRIEND_CHAT_JOIN_LEAVE, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(FriendsChat.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}

	@ObfuscatedName("oy")
	@ObfuscatedSignature(
		descriptor = "(Lov;I)I",
		garbageValue = "1390735869"
	)
	static int method757(Widget var0) {
		class370 var1 = (class370)Client.widgetFlags.get(((long)var0.id << 32) + (long)(var0.childIndex * -744024149));
		return var1 != null ? var1.method7726() : class31.method456(var0.flags);
	}
}
