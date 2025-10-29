import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lk")
public class class309 {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	static final class309 field3498;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	static final class309 field3497;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1492311435
	)
	@Export("value")
	final int value;

	static {
		field3498 = new class309(0);
		field3497 = new class309(1);
	}

	class309(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIS)I",
		garbageValue = "-11561"
	)
	public static int method7018(int var0, int var1, int var2) {
		int var3 = SpotAnimationDefinition.method4582(var2 - var1 + 1);
		var3 <<= var1;
		var0 |= var3;
		return var0;
	}

	@ObfuscatedName("od")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-844830756"
	)
	static final void method7019(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : class57.guestClanChannel;
		if (var2 != null && var1 >= 0 && var1 < var2.method4196()) {
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1);
			if (var3.rank == -1) {
				String var4 = var3.username.getName();
				PacketBufferNode var5 = ReflectionCheck.getPacketBufferNode(ClientPacket.CLAN_CHANNEL_KICK_USER, Client.packetWriter.isaacCipher);
				var5.packetBuffer.writeByte(3 + AccessFile.stringCp1252NullTerminatedByteSize(var4));
				var5.packetBuffer.writeByte(var0);
				var5.packetBuffer.writeShort(var1);
				var5.packetBuffer.writeStringCp1252NullTerminated(var4);
				Client.packetWriter.addNode(var5);
			}
		}
	}
}
