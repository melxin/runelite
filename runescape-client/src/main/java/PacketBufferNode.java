import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mb")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[Lmb;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 790177349
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmm;"
	)
	@Export("clientPacket")
	ClientPacket clientPacket;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1977829057
	)
	@Export("clientPacketLength")
	int clientPacketLength;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lvv;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1763756621
	)
	@Export("index")
	public int index;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300];
		PacketBufferNode_packetBufferNodeCount = 0;
	}

	PacketBufferNode() {
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1974751955"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) {
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this;
		}
	}

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(Ldx;I)Z",
		garbageValue = "-1639240470"
	)
	static boolean method6629(Player var0) {
		if (Client.drawPlayerNames == 0) {
			return false;
		} else {
			boolean var1;
			if (ModeWhere.localPlayer == var0) {
				var1 = (Client.drawPlayerNames & 8) != 0;
				return var1;
			} else {
				var1 = WorldMapSection0.method6358();
				boolean var2;
				if (!var1) {
					var2 = (Client.drawPlayerNames & 1) != 0;
					var1 = var2 && var0.isFriend();
				}

				var2 = var1;
				if (!var1) {
					boolean var3 = (Client.drawPlayerNames & 2) != 0;
					var2 = var3 && var0.isFriendsChatMember();
				}

				return var2;
			}
		}
	}
}
