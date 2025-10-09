import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ab")
public class class0 implements class3 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lwj;)Lwj;"
	)
	public Buffer vmethod18(Buffer var1) {
		Buffer var2 = new Buffer(100);
		this.method4(var1, var2);
		return var2;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lwj;Lwj;)V"
	)
	void method4(Buffer var1, Buffer var2) {
		class8 var3 = new class8(var1);
		class5 var4 = new class5(var3);

		long var5;
		for (var5 = 0L; !var4.method28(var3.method57(), var3.method61(), var5); ++var5) {
		}

		var2.writeLong(var5);
	}
}
