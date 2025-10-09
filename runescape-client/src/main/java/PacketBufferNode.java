import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mr")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Lmr;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1672811809
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("io")
	static List field3673;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	@Export("clientPacket")
	ClientPacket clientPacket;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 385361227
	)
	@Export("clientPacketLength")
	int clientPacketLength;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lwn;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -2078554335
	)
	@Export("index")
	public int index;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300];
		PacketBufferNode_packetBufferNodeCount = 0;
	}

	PacketBufferNode() {
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "91"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) {
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1343870187"
	)
	static final int method7043(int var0, int var1, int var2) {
		int var3 = var0 / var2;
		int var4 = var0 & var2 - 1;
		int var5 = var1 / var2;
		int var6 = var1 & var2 - 1;
		int var7 = class487.method9908(var3, var5);
		int var8 = class487.method9908(var3 + 1, var5);
		int var9 = class487.method9908(var3, var5 + 1);
		int var10 = class487.method9908(var3 + 1, var5 + 1);
		int var11 = class40.method778(var7, var8, var4, var2);
		int var12 = class40.method778(var9, var10, var4, var2);
		return class40.method778(var11, var12, var6, var2);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ltl;Lwe;ZI)V",
		garbageValue = "-2135859443"
	)
	static void method7052(DynamicArray var0, class572 var1, boolean var2) {
		if (var0 == null) {
			throw new RuntimeException();
		} else if (var1 != null && var0.field5571 != var1) {
			throw new RuntimeException();
		} else if (var2 && !var0.field5570) {
			throw new RuntimeException();
		}
	}
}
