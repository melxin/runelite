import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uz")
@Implements("Node")
public class Node {
	@ObfuscatedName("hn")
	@Export("key")
	public long key;
	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "Luz;"
	)
	@Export("previous")
	public Node previous;
	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "Luz;"
	)
	@Export("next")
	public Node next;

	@ObfuscatedName("kt")
	@Export("remove")
	public void remove() {
		if (this.next != null) {
			this.next.previous = this.previous;
			this.previous.next = this.next;
			this.previous = null;
			this.next = null;
		}
	}

	@ObfuscatedName("kf")
	@Export("hasNext")
	public boolean hasNext() {
		return this.next != null;
	}
}
