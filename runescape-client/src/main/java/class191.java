import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hn")
public class class191 extends DualNode {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("field2007")
	static EvictingDualNodeHashTable field2007;

	static {
		field2007 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Lmj;",
		garbageValue = "0"
	)
	public static PacketBufferNode method4420() {
		return PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0 ? new PacketBufferNode() : PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
	}

	@ObfuscatedName("on")
	@ObfuscatedSignature(
		descriptor = "(Lof;B)I",
		garbageValue = "75"
	)
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		WidgetConfigNode var1 = (WidgetConfigNode)Client.widgetFlags.get((long)var0.id);
		WidgetConfigNode var2 = WorldMapIcon_0.method6921(var1, var0.childIndex * 2077538819);
		return var2 != null ? var2.method7744() : var0.flags;
	}
}
