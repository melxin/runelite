import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tg")
@Implements("Link")
public class Link {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ltg;"
	)
	@Export("previous")
	public Link previous;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ltg;"
	)
	@Export("next")
	public Link next;

	@ObfuscatedName("ay")
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
