import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hv")
public class class204 extends DualNode {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("field2136")
	public static EvictingDualNodeHashTable field2136;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 2015157683
	)
	static int field2249;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1045327651
	)
	static int field2248;

	static {
		field2136 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIII)V",
		garbageValue = "-492388552"
	)
	public static void method4497(ArrayList var0, int var1, int var2, int var3, int var4) {
		class339.field3889.clear();
		class339.field3889.addAll(var0);
		LoginState.method791(var1, var2, var3, var4);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-562433368"
	)
	static final int method4496(int var0, int var1) {
		int var2 = var1 * 57 + var0;
		var2 ^= var2 << 13;
		int var3 = var2 * (var2 * var2 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 255;
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-943964295"
	)
	static void method4499(int var0) {
		PacketBufferNode var1 = UserComparator6.getPacketBufferNode(ClientPacket.SET_HEADING, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByteAdd(var0);
		Client.packetWriter.addNode(var1);
	}
}
