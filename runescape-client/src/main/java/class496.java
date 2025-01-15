import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ty")
public class class496 implements class501 {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1791953063
	)
	static int field5128;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	public final class531 field5127;

	@ObfuscatedSignature(
		descriptor = "(Lup;)V"
	)
	class496(class532 var1) {
		this.field5127 = var1;
	}

	@ObfuscatedSignature(
		descriptor = "(Ltr;)V"
	)
	public class496(class497 var1) {
		this(new class532(var1));
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1323121982"
	)
	public int method9506(int var1) {
		return this.field5127.vmethod10004(var1);
	}
}
