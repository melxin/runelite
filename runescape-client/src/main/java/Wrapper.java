import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("mw")
@Implements("Wrapper")
public abstract class Wrapper extends DualNode {
	@ObfuscatedName("ab")
	@Export("size")
	final int size;

	Wrapper(int var1) {
		this.size = var1;
	}

	@ObfuscatedName("al")
	@Export("get")
	abstract Object get();

	@ObfuscatedName("ab")
	@Export("isSoft")
	abstract boolean isSoft();
}
