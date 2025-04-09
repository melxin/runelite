import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ud")
@Implements("Link")
public class Link {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	@Export("previous")
	public Link previous;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	@Export("next")
	public Link next;

	@ObfuscatedName("ao")
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
