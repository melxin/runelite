import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ua")
@Implements("DualNode")
public class DualNode extends Node {
	@ObfuscatedName("ew")
	@Export("keyDual")
	public long keyDual;
	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "Lua;"
	)
	@Export("previousDual")
	public DualNode previousDual;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Lua;"
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
