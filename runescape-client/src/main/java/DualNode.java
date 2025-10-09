import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("us")
@Implements("DualNode")
public class DualNode extends Node {
	@ObfuscatedName("eh")
	@Export("keyDual")
	public long keyDual;
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "Lus;"
	)
	@Export("previousDual")
	public DualNode previousDual;
	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "Lus;"
	)
	@Export("nextDual")
	public DualNode nextDual;

	@ObfuscatedName("ka")
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
