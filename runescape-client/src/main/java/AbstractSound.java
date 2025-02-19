import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("cv")
@Implements("AbstractSound")
public abstract class AbstractSound extends Node {
	@ObfuscatedName("ac")
	@Export("position")
	int position;

	AbstractSound() {
	}
}
