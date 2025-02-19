import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mo")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lmo;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -32555091
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("clientPacket")
	ClientPacket clientPacket;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -76101975
	)
	@Export("clientPacketLength")
	int clientPacketLength;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lvu;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 2066707877
	)
	@Export("index")
	public int index;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300];
		PacketBufferNode_packetBufferNodeCount = 0;
	}

	PacketBufferNode() {
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1589846155"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) {
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpl;I)V",
		garbageValue = "1102921096"
	)
	public static void method6510(AbstractArchive var0) {
		DbRowType.field5516 = var0;
	}

	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "(Lwn;I)V",
		garbageValue = "-2091999222"
	)
	static final void method6509(Menu var0) {
		boolean var1 = false;

		while (!var1) {
			var1 = true;

			for (int var2 = 0; var2 < var0.menuOptionsCount - 1; ++var2) {
				if (var0.menuOpcodes[var2] < 1000 && var0.menuOpcodes[var2 + 1] > 1000) {
					String var3 = var0.menuTargets[var2];
					var0.menuTargets[var2] = var0.menuTargets[var2 + 1];
					var0.menuTargets[var2 + 1] = var3;
					String var4 = var0.menuActions[var2];
					var0.menuActions[var2] = var0.menuActions[var2 + 1];
					var0.menuActions[var2 + 1] = var4;
					Menu var5 = var0.subMenus[var2];
					var0.subMenus[var2] = var0.subMenus[var2 + 1];
					var0.subMenus[var2 + 1] = var5;
					int var6 = var0.menuOpcodes[var2];
					var0.menuOpcodes[var2] = var0.menuOpcodes[var2 + 1];
					var0.menuOpcodes[var2 + 1] = var6;
					var6 = var0.menuArguments1[var2];
					var0.menuArguments1[var2] = var0.menuArguments1[var2 + 1];
					var0.menuArguments1[var2 + 1] = var6;
					var6 = var0.menuArguments2[var2];
					var0.menuArguments2[var2] = var0.menuArguments2[var2 + 1];
					var0.menuArguments2[var2 + 1] = var6;
					var6 = var0.menuIdentifiers[var2];
					var0.menuIdentifiers[var2] = var0.menuIdentifiers[var2 + 1];
					var0.menuIdentifiers[var2 + 1] = var6;
					var6 = var0.menuItemIds[var2];
					var0.menuItemIds[var2] = var0.menuItemIds[var2 + 1];
					var0.menuItemIds[var2 + 1] = var6;
					var6 = var0.menuWorldViewIds[var2];
					var0.menuWorldViewIds[var2] = var0.menuWorldViewIds[var2 + 1];
					var0.menuWorldViewIds[var2 + 1] = var6;
					boolean var7 = var0.menuShiftClick[var2];
					var0.menuShiftClick[var2] = var0.menuShiftClick[var2 + 1];
					var0.menuShiftClick[var2 + 1] = var7;
					var1 = false;
				}
			}
		}

	}
}
