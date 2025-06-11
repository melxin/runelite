import java.lang.ref.SoftReference;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("mh")
@Implements("SoftWrapper")
public class SoftWrapper extends Wrapper {
	@ObfuscatedName("ap")
	@Export("ref")
	SoftReference ref;

	SoftWrapper(Object var1, int var2) {
		super(var2);
		this.ref = new SoftReference(var1);
	}

	@ObfuscatedName("ap")
	@Export("get")
	Object get() {
		return this.ref.get();
	}

	@ObfuscatedName("aj")
	@Export("isSoft")
	boolean isSoft() {
		return true;
	}
}
