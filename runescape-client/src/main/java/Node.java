import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("um")
@Implements("Node")
public class Node {
	@ObfuscatedName("hf")
	@Export("key")
	public long key;
	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "Lum;"
	)
	@Export("previous")
	public Node previous;
	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "Lum;"
	)
	@Export("next")
	public Node next;

	@ObfuscatedName("cu")
	@Export("remove")
	public void remove() {
		if (this.next != null) {
			this.next.previous = this.previous;
			this.previous.next = this.next;
			this.previous = null;
			this.next = null;
		}
	}

	@ObfuscatedName("ld")
	@Export("hasNext")
	public boolean hasNext() {
		return this.next != null;
	}
}
