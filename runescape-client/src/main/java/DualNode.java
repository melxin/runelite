import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ug")
@Implements("DualNode")
public class DualNode extends Node {
	@ObfuscatedName("er")
	@Export("keyDual")
	public long keyDual;
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	@Export("previousDual")
	public DualNode previousDual;
	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	@Export("nextDual")
	public DualNode nextDual;

	@ObfuscatedName("ki")
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
