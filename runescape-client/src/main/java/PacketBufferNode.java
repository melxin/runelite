import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mr")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[Lmr;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1749995417
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("pq")
	@Export("xteaKeys")
	static int[][] xteaKeys;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	@Export("clientPacket")
	ClientPacket clientPacket;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1791612557
	)
	@Export("clientPacketLength")
	int clientPacketLength;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lvu;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1711647789
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
		garbageValue = "10"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) {
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-461362733"
	)
	public static boolean method6559(char var0) {
		if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
			if (var0 != 0) {
				char[] var1 = class433.cp1252AsciiExtension;

				for (int var2 = 0; var2 < var1.length; ++var2) {
					char var3 = var1[var2];
					if (var0 == var3) {
						return true;
					}
				}
			}

			return false;
		} else {
			return true;
		}
	}
}
