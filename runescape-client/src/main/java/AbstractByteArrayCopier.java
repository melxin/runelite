import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nq")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	static Archive field3837;

	AbstractByteArrayCopier() {
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-1961071285"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "1"
	)
	@Export("set")
	abstract void set(byte[] var1);
}
