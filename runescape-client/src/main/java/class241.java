import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jp")
public class class241 extends DualNode {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("field2007")
	public static EvictingDualNodeHashTable field2007;
	@ObfuscatedName("pr")
	@ObfuscatedSignature(
		descriptor = "[Lwc;"
	)
	@Export("headIconPrayerSprites")
	static SpritePixels[] headIconPrayerSprites;

	static {
		field2007 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ae")
	public static boolean method5142(long var0) {
		return 0L != var0 && !WorldMapCacheName.method6410(var0);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "788012419"
	)
	static final void method5143(String var0, int var1) {
		PacketBufferNode var2 = FloorDecoration.getPacketBufferNode(ClientPacket.FRIEND_CHAT_SETRANK, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(class466.stringCp1252NullTerminatedByteSize(var0) + 1);
		var2.packetBuffer.writeStringCp1252NullTerminated(var0);
		var2.packetBuffer.writeByte(var1);
		Client.packetWriter.addNode(var2);
	}
}
