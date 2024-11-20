import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tz")
@Implements("Node")
public class Node {
	@ObfuscatedName("hz")
	@Export("key")
	public long key;
	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "Ltz;"
	)
	@Export("previous")
	public Node previous;
	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "Ltz;"
	)
	@Export("next")
	public Node next;

	@ObfuscatedName("kr")
	@Export("remove")
	public void remove() {
		if (this.next != null) {
			this.next.previous = this.previous;
			this.previous.next = this.next;
			this.previous = null;
			this.next = null;
		}
	}

	@ObfuscatedName("kc")
	@Export("hasNext")
	public boolean hasNext() {
		return this.next != null;
	}
}
