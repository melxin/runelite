import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ui")
@Implements("IndexedObjectNode")
public class IndexedObjectNode extends DualNode {
	@ObfuscatedName("eo")
	@Export("idx")
	public long idx;
	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "Lui;"
	)
	@Export("nextNode")
	public IndexedObjectNode nextNode;
	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "Lui;"
	)
	@Export("previousNode")
	public IndexedObjectNode previousNode;

	@ObfuscatedName("kb")
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
