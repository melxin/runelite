import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ff")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "Lta;"
	)
	@Export("friendsChat")
	static FriendsChat friendsChat;
	@ObfuscatedName("av")
	@Export("reversed")
	final boolean reversed;

	public BuddyRankComparator(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ltm;Ltm;B)I",
		garbageValue = "116"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.rank != var1.rank) {
			return this.reversed ? var1.rank - var2.rank : var2.rank - var1.rank;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Lrf;",
		garbageValue = "-814754263"
	)
	public static class456 method3741() {
		synchronized(class456.field5217) {
			if (class456.field5222 == 0) {
				return new class456();
			} else {
				class456.field5217[--class456.field5222].method9217();
				return class456.field5217[class456.field5222];
			}
		}
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "2"
	)
	static void method3734(int var0, int var1, int var2, int var3) {
		PacketBufferNode var4 = ReflectionCheck.getPacketBufferNode(ClientPacket.MINIMAP_CLICK, Client.packetWriter.isaacCipher);
		var4.packetBuffer.writeByte(18);
		var4.packetBuffer.writeShortLE(Client.indexCheck.isValidIndexInRange(82) ? (Client.indexCheck.isValidIndexInRange(81) ? 2 : 1) : 0);
		var4.packetBuffer.writeIntLE(var1 + Occluder.topLevelWorldView.baseY);
		var4.packetBuffer.writeIntLE(var0 + Occluder.topLevelWorldView.baseX);
		var4.packetBuffer.writeByte(var2);
		var4.packetBuffer.writeByte(var3);
		var4.packetBuffer.writeShort(Client.camAngleY);
		var4.packetBuffer.writeByte(57);
		var4.packetBuffer.writeByte(0);
		var4.packetBuffer.writeByte(0);
		var4.packetBuffer.writeByte(89);
		var4.packetBuffer.writeShort(class330.localPlayer.x);
		var4.packetBuffer.writeShort(class330.localPlayer.y);
		var4.packetBuffer.writeByte(63);
		Client.packetWriter.addNode(var4);
		Client.destinationX = var0;
		Client.destinationY = var1;
	}
}
