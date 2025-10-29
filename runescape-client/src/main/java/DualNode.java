import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vo")
@Implements("DualNode")
public class DualNode extends Node {
	@ObfuscatedName("ef")
	@Export("keyDual")
	public long keyDual;
	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "Lvo;"
	)
	@Export("previousDual")
	public DualNode previousDual;
	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "Lvo;"
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
