import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uj")
@Implements("Node")
public class Node {
	@ObfuscatedName("hz")
	@Export("key")
	public long key;
	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "Luj;"
	)
	@Export("previous")
	public Node previous;
	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "Luj;"
	)
	@Export("next")
	public Node next;

	@ObfuscatedName("cp")
	public void vmethod10593() {
		if (this.next != null) {
			this.next.previous = this.previous;
			this.previous.next = this.next;
			this.previous = null;
			this.next = null;
		}
	}

	@ObfuscatedName("ki")
	@Export("hasNext")
	public boolean hasNext() {
		return this.next != null;
	}
}
