import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vz")
@Implements("Node")
public class Node {
	@ObfuscatedName("hu")
	@Export("key")
	public long key;
	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "Lvz;"
	)
	@Export("previous")
	public Node previous;
	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "Lvz;"
	)
	@Export("next")
	public Node next;

	@ObfuscatedName("cy")
	@Export("remove")
	public void remove() {
		if (this.next != null) {
			this.next.previous = this.previous;
			this.previous.next = this.next;
			this.previous = null;
			this.next = null;
		}
	}

	@ObfuscatedName("ks")
	@Export("hasNext")
	public boolean hasNext() {
		return this.next != null;
	}
}
