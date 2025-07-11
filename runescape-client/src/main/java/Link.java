import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ud")
@Implements("Link")
public class Link {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	@Export("previous")
	public Link previous;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	@Export("next")
	public Link next;

	@ObfuscatedName("ap")
	@Export("remove")
	public void remove() {
		if (this.next != null) {
			this.next.previous = this.previous;
			this.previous.next = this.next;
			this.previous = null;
			this.next = null;
		}
	}
}
