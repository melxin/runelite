import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("md")
@Implements("Wrapper")
public abstract class Wrapper extends DualNode {
	@ObfuscatedName("at")
	@Export("size")
	final int size;

	Wrapper(int var1) {
		this.size = var1;
	}

	@ObfuscatedName("av")
	@Export("get")
	abstract Object get();

	@ObfuscatedName("at")
	@Export("isSoft")
	abstract boolean isSoft();
}
