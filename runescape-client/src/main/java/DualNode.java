import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ux")
@Implements("DualNode")
public class DualNode extends Node {
	@ObfuscatedName("ek")
	@Export("keyDual")
	public long keyDual;
	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "Lux;"
	)
	@Export("previousDual")
	public DualNode previousDual;
	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "Lux;"
	)
	@Export("nextDual")
	public DualNode nextDual;

	@ObfuscatedName("kk")
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
