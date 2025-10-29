import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mj")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Lmj;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2135827649
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("clientPacket")
	public ClientPacket clientPacket;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 2022752529
	)
	@Export("clientPacketLength")
	public int clientPacketLength;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lxj;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1550750307
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
		descriptor = "(S)V",
		garbageValue = "148"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) {
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)Z",
		garbageValue = "361075336"
	)
	static boolean method7274(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var4 - var2;
		int var7 = var5 - var3;
		int var8 = var0 - var2;
		int var9 = var1 - var3;
		int var10 = var7 * var9 + var8 * var6;
		int var12 = var7 * var7 + var6 * var6;
		return 0 <= var10 && var10 <= var12;
	}
}
