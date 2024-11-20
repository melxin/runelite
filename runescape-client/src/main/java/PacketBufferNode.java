import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mc")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Lmc;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 920641263
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("clientPacket")
	ClientPacket clientPacket;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 966668861
	)
	@Export("clientPacketLength")
	int clientPacketLength;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1083620049
	)
	@Export("index")
	public int index;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300];
		PacketBufferNode_packetBufferNodeCount = 0;
	}

	PacketBufferNode() {
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-4"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) {
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this;
		}
	}
}
