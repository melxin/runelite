import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
public class class60 {
	@ObfuscatedName("ay")
	byte[] field411;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1104605573
	)
	int field409;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 957315661
	)
	int field410;

	class60() {
		this.field411 = null;
		this.field409 = 0;
		this.field410 = 0;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "0"
	)
	int method1205(int var1) {
		int var2 = 0;

		int var3;
		int var4;
		for (var3 = 0; var1 >= 8 - this.field410; var1 -= var4) {
			var4 = 8 - this.field410;
			int var5 = (1 << var4) - 1;
			var2 += (this.field411[this.field409] >> this.field410 & var5) << var3;
			this.field410 = 0;
			++this.field409;
			var3 += var4;
		}

		if (var1 > 0) {
			var4 = (1 << var1) - 1;
			var2 += (this.field411[this.field409] >> this.field410 & var4) << var3;
			this.field410 += var1;
		}

		return var2;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "897372458"
	)
	int method1207() {
		int var1 = this.field411[this.field409] >> this.field410 & 1;
		++this.field410;
		this.field409 += this.field410 >> 3;
		this.field410 &= 7;
		return var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([BIB)V",
		garbageValue = "124"
	)
	void method1204(byte[] var1, int var2) {
		this.field411 = var1;
		this.field409 = var2;
		this.field410 = 0;
	}
}
