import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tf")
@Implements("Node")
public class Node {
	@ObfuscatedName("hs")
	@Export("key")
	public long key;
	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	@Export("previous")
	public Node previous;
	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	@Export("next")
	public Node next;

	@ObfuscatedName("ku")
	@Export("remove")
	public void remove() {
		if (this.next != null) {
			this.next.previous = this.previous;
			this.previous.next = this.next;
			this.previous = null;
			this.next = null;
		}
	}

	@ObfuscatedName("kn")
	@Export("hasNext")
	public boolean hasNext() {
		return this.next != null;
	}
}
