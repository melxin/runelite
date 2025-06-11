import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uw")
@Implements("IndexedObjectNode")
public class IndexedObjectNode extends DualNode {
	@ObfuscatedName("ep")
	@Export("idx")
	public long idx;
	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "Luw;"
	)
	@Export("nextNode")
	public IndexedObjectNode nextNode;
	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "Luw;"
	)
	@Export("previousNode")
	public IndexedObjectNode previousNode;

	@ObfuscatedName("ji")
	@Export("detach")
	public void detach() {
		if (this.previousNode != null) {
			this.previousNode.nextNode = this.nextNode;
			this.nextNode.previousNode = this.previousNode;
			this.nextNode = null;
			this.previousNode = null;
		}
	}
}
