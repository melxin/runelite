import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uv")
@Implements("DualNode")
public class DualNode extends Node {
	@ObfuscatedName("ee")
	@Export("keyDual")
	public long keyDual;
	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "Luv;"
	)
	@Export("previousDual")
	public DualNode previousDual;
	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "Luv;"
	)
	@Export("nextDual")
	public DualNode nextDual;

	@ObfuscatedName("je")
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
