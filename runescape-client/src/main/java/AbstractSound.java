import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("el")
@Implements("AbstractSound")
public abstract class AbstractSound extends Node {
	@ObfuscatedName("ak")
	@Export("position")
	int position;

	AbstractSound() {
	}
}
