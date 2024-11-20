import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
@Implements("UserComparator9")
public class UserComparator9 extends AbstractUserComparator {
	@ObfuscatedName("un")
	@ObfuscatedGetter(
		intValue = 794877313
	)
	static int field1502;
	@ObfuscatedName("ab")
	@Export("reversed")
	final boolean reversed;

	public UserComparator9(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lsi;Lsi;B)I",
		garbageValue = "45"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) {
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("px")
	@ObfuscatedSignature(
		descriptor = "(IIIZB)V",
		garbageValue = "-18"
	)
	public static void method3238(int var0, int var1, int var2, boolean var3) {
		PacketBufferNode var4 = Message.getPacketBufferNode(ClientPacket.field3411, Client.packetWriter.isaacCipher);
		var4.packetBuffer.writeIntME(var3 ? Client.field611 : 0);
		var4.packetBuffer.writeShortAddLE(var0);
		var4.packetBuffer.writeShortAddLE(var1);
		var4.packetBuffer.writeByteNeg(var2);
		Client.packetWriter.addNode(var4);
	}
}
