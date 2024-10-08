import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("mb")
@Implements("Wrapper")
public abstract class Wrapper extends DualNode {
	@ObfuscatedName("ae")
	@Export("size")
	final int size;

	Wrapper(int var1) {
		this.size = var1;
	}

	@ObfuscatedName("ac")
	@Export("get")
	abstract Object get();

	@ObfuscatedName("ae")
	@Export("isSoft")
	abstract boolean isSoft();
}
