import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uk")
@Implements("DualNode")
public class DualNode extends Node {
	@ObfuscatedName("en")
	@Export("keyDual")
	public long keyDual;
	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	@Export("previousDual")
	public DualNode previousDual;
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	@Export("nextDual")
	public DualNode nextDual;

	@ObfuscatedName("kn")
	@Export("removeDual")
	public void removeDual() {
		if (this.nextDual != null) {
			this.nextDual.previousDual = this.previousDual;
			this.previousDual.nextDual = this.nextDual;
			this.previousDual = null;
			this.nextDual = null;
		}
	}
}
