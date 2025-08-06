import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ul")
@Implements("Link")
public class Link {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lul;"
	)
	@Export("previous")
	public Link previous;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lul;"
	)
	@Export("next")
	public Link next;

	@ObfuscatedName("al")
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
