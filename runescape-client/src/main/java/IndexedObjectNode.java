import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vc")
@Implements("IndexedObjectNode")
public class IndexedObjectNode extends DualNode {
	@ObfuscatedName("ee")
	@Export("idx")
	public long idx;
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	@Export("nextNode")
	public IndexedObjectNode nextNode;
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	@Export("previousNode")
	public IndexedObjectNode previousNode;

	@ObfuscatedName("kd")
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
