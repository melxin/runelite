import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ub")
@Implements("Node")
public class Node {
	@ObfuscatedName("hb")
	@Export("key")
	public long key;
	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	@Export("previous")
	public Node previous;
	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	@Export("next")
	public Node next;

	@ObfuscatedName("jw")
	@Export("remove")
	public void remove() {
		if (this.next != null) {
			this.next.previous = this.previous;
			this.previous.next = this.next;
			this.previous = null;
			this.next = null;
		}
	}

	@ObfuscatedName("kb")
	@Export("hasNext")
	public boolean hasNext() {
		return this.next != null;
	}
}
