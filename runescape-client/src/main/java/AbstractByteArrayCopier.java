import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oj")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 673925099
	)
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;

	AbstractByteArrayCopier() {
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "32"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-1490761731"
	)
	@Export("set")
	public abstract void set(byte[] var1);
}
