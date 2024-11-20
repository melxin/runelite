import java.lang.ref.SoftReference;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("mx")
@Implements("SoftWrapper")
public class SoftWrapper extends Wrapper {
	@ObfuscatedName("ab")
	@Export("ref")
	SoftReference ref;

	SoftWrapper(Object var1, int var2) {
		super(var2);
		this.ref = new SoftReference(var1);
	}

	@ObfuscatedName("ab")
	@Export("get")
	Object get() {
		return this.ref.get();
	}

	@ObfuscatedName("aw")
	@Export("isSoft")
	boolean isSoft() {
		return true;
	}
}
