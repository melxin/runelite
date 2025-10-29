import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ik")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("av")
	long[] field2597;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -2047479395
	)
	int field2593;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -149384547
	)
	int field2595;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		longValue = -3998438383116361611L
	)
	long field2596;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -848049049
	)
	int field2600;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 2016122411
	)
	int field2598;

	MilliClock() {
		this.field2597 = new long[10];
		this.field2593 = 256;
		this.field2595 = 1;
		this.field2600 = 0;
		this.field2596 = ParamComposition.method4708();

		for (int var1 = 0; var1 < 10; ++var1) {
			this.field2597[var1] = this.field2596;
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "796597613"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) {
			this.field2597[var1] = 0L;
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "205232251"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field2593;
		int var4 = this.field2595;
		this.field2593 = 300;
		this.field2595 = 1;
		this.field2596 = ParamComposition.method4708();
		if (0L == this.field2597[this.field2598]) {
			this.field2593 = var3;
			this.field2595 = var4;
		} else if (this.field2596 > this.field2597[this.field2598]) {
			this.field2593 = (int)((long)(var1 * 2560) / (this.field2596 - this.field2597[this.field2598]));
		}

		if (this.field2593 < 25) {
			this.field2593 = 25;
		}

		if (this.field2593 > 256) {
			this.field2593 = 256;
			this.field2595 = (int)((long)var1 - (this.field2596 - this.field2597[this.field2598]) / 10L);
		}

		if (this.field2595 > var1) {
			this.field2595 = var1;
		}

		this.field2597[this.field2598] = this.field2596;
		this.field2598 = (this.field2598 + 1) % 10;
		int var5;
		if (this.field2595 > 1) {
			for (var5 = 0; var5 < 10; ++var5) {
				if (this.field2597[var5] != 0L) {
					this.field2597[var5] += (long)this.field2595;
				}
			}
		}

		if (this.field2595 < var2) {
			this.field2595 = var2;
		}

		LoginState.method841((long)this.field2595);

		for (var5 = 0; this.field2600 < 256; this.field2600 += this.field2593) {
			++var5;
		}

		this.field2600 &= 255;
		return var5;
	}
}
