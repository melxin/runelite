import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("cw")
@Implements("AbstractSound")
public abstract class AbstractSound extends Node {
	@ObfuscatedName("av")
	@Export("position")
	int position;

	AbstractSound() {
	}
}
