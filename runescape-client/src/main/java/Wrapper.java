import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("mm")
@Implements("Wrapper")
public abstract class Wrapper extends DualNode {
	@ObfuscatedName("aw")
	@Export("size")
	final int size;

	Wrapper(int var1) {
		this.size = var1;
	}

	@ObfuscatedName("af")
	@Export("get")
	abstract Object get();

	@ObfuscatedName("aw")
	@Export("isSoft")
	abstract boolean isSoft();
}
