import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("in")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("ab")
	long[] field2400;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1494884445
	)
	int field2396;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 19341115
	)
	int field2397;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = -8652935696984860635L
	)
	long field2403;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1501734911
	)
	int field2399;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1745295143
	)
	int field2404;

	MilliClock() {
		this.field2400 = new long[10];
		this.field2396 = 256;
		this.field2397 = 1;
		this.field2399 = 0;
		this.field2403 = class59.method1150();

		for (int var1 = 0; var1 < 10; ++var1) {
			this.field2400[var1] = this.field2403;
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "1927"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) {
			this.field2400[var1] = 0L;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1101148912"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field2396;
		int var4 = this.field2397;
		this.field2396 = 300;
		this.field2397 = 1;
		this.field2403 = class59.method1150();
		if (0L == this.field2400[this.field2404]) {
			this.field2396 = var3;
			this.field2397 = var4;
		} else if (this.field2403 > this.field2400[this.field2404]) {
			this.field2396 = (int)((long)(var1 * 2560) / (this.field2403 - this.field2400[this.field2404]));
		}

		if (this.field2396 < 25) {
			this.field2396 = 25;
		}

		if (this.field2396 > 256) {
			this.field2396 = 256;
			this.field2397 = (int)((long)var1 - (this.field2403 - this.field2400[this.field2404]) / 10L);
		}

		if (this.field2397 > var1) {
			this.field2397 = var1;
		}

		this.field2400[this.field2404] = this.field2403;
		this.field2404 = (this.field2404 + 1) % 10;
		int var5;
		if (this.field2397 > 1) {
			for (var5 = 0; var5 < 10; ++var5) {
				if (this.field2400[var5] != 0L) {
					this.field2400[var5] += (long)this.field2397;
				}
			}
		}

		if (this.field2397 < var2) {
			this.field2397 = var2;
		}

		class188.method3857((long)this.field2397);

		for (var5 = 0; this.field2399 < 256; this.field2399 += this.field2396) {
			++var5;
		}

		this.field2399 &= 255;
		return var5;
	}
}
