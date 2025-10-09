import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ug")
@Implements("IndexedObjectNode")
public class IndexedObjectNode extends DualNode {
	@ObfuscatedName("ev")
	@Export("idx")
	public long idx;
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	@Export("nextNode")
	public IndexedObjectNode nextNode;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	@Export("previousNode")
	public IndexedObjectNode previousNode;

	@ObfuscatedName("kq")
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
