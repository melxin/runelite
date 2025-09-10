import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ki")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("ob")
	@Export("refreshToken")
	static String refreshToken;
	@ObfuscatedName("af")
	long[] field3121;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1249194493
	)
	int field3122;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -316175163
	)
	int field3129;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = -8344215381316561507L
	)
	long field3123;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 375531675
	)
	int field3128;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -855021015
	)
	int field3126;

	public MilliClock() {
		this.field3121 = new long[10];
		this.field3122 = 256;
		this.field3129 = 1;
		this.field3128 = 0;
		this.field3123 = class189.method4284();

		for (int var1 = 0; var1 < 10; ++var1) {
			this.field3121[var1] = this.field3123;
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2094683207"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) {
			this.field3121[var1] = 0L;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-752736442"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field3122;
		int var4 = this.field3129;
		this.field3122 = 300;
		this.field3129 = 1;
		this.field3123 = class189.method4284();
		if (0L == this.field3121[this.field3126]) {
			this.field3122 = var3;
			this.field3129 = var4;
		} else if (this.field3123 > this.field3121[this.field3126]) {
			this.field3122 = (int)((long)(var1 * 2560) / (this.field3123 - this.field3121[this.field3126]));
		}

		if (this.field3122 < 25) {
			this.field3122 = 25;
		}

		if (this.field3122 > 256) {
			this.field3122 = 256;
			this.field3129 = (int)((long)var1 - (this.field3123 - this.field3121[this.field3126]) / 10L);
		}

		if (this.field3129 > var1) {
			this.field3129 = var1;
		}

		this.field3121[this.field3126] = this.field3123;
		this.field3126 = (this.field3126 + 1) % 10;
		int var5;
		if (this.field3129 > 1) {
			for (var5 = 0; var5 < 10; ++var5) {
				if (0L != this.field3121[var5]) {
					this.field3121[var5] += (long)this.field3129;
				}
			}
		}

		if (this.field3129 < var2) {
			this.field3129 = var2;
		}

		class164.method4001((long)this.field3129);

		for (var5 = 0; this.field3128 < 256; this.field3128 += this.field3122) {
			++var5;
		}

		this.field3128 &= 255;
		return var5;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(CB)C",
		garbageValue = "30"
	)
	static char method5948(char var0) {
		return var0 != 181 && var0 != 402 ? Character.toTitleCase(var0) : var0;
	}
}
