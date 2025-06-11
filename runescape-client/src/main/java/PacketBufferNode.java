import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mk")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[Lmk;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 251904867
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = -2008170471
	)
	static int field3497;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	@Export("clientPacket")
	public ClientPacket clientPacket;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -559764159
	)
	@Export("clientPacketLength")
	public int clientPacketLength;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lwx;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 940379717
	)
	@Export("index")
	public int index;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300];
		PacketBufferNode_packetBufferNodeCount = 0;
	}

	PacketBufferNode() {
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "107"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) {
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this;
		}
	}
}
