import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ax")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class106 {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 60482423
	)
	static int field91;
	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "Ltg;"
	)
	@Export("friendsChat")
	static FriendsChat friendsChat;

	DevicePcmPlayerProvider() {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Ldn;",
		garbageValue = "-183806159"
	)
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZI)V",
		garbageValue = "-2028322013"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		class6.method39(var0, var1, "openjs", var2);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1302330911"
	)
	public static int method332(int var0) {
		return class535.field5563[var0 & 16383];
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-290410379"
	)
	public static void method326() {
		try {
			JagexCache.JagexCache_dat2File.close();

			for (int var0 = 0; var0 < JagexCache.field3110; ++var0) {
				JagexCache.JagexCache_idxFiles[var0].close();
			}

			JagexCache.JagexCache_idx255File.close();
			JagexCache.JagexCache_randomDat.close();
		} catch (Exception var2) {
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1201012857"
	)
	static final int method331(int var0, int var1) {
		int var2 = class204.method4496(var0 - 1, var1 - 1) + class204.method4496(var0 + 1, var1 - 1) + class204.method4496(var0 - 1, var1 + 1) + class204.method4496(1 + var0, var1 + 1);
		int var3 = class204.method4496(var0 - 1, var1) + class204.method4496(1 + var0, var1) + class204.method4496(var0, var1 - 1) + class204.method4496(var0, 1 + var1);
		int var4 = class204.method4496(var0, var1);
		return var2 / 16 + var3 / 8 + var4 / 4;
	}

	@ObfuscatedName("oo")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1658772962"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) {
			PacketBufferNode var1 = UserComparator6.getPacketBufferNode(ClientPacket.FRIEND_CHAT_JOIN_LEAVE, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(WorldMapSection2.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}
