import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("us")
@Implements("IndexedObjectNode")
public class IndexedObjectNode extends DualNode {
	@ObfuscatedName("er")
	@Export("idx")
	public long idx;
	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "Lus;"
	)
	@Export("nextNode")
	public IndexedObjectNode nextNode;
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Lus;"
	)
	@Export("previousNode")
	public IndexedObjectNode previousNode;

	@ObfuscatedName("kw")
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
