import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ks")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("vo")
	@ObfuscatedGetter(
		intValue = -1434224271
	)
	static int field3131;
	@ObfuscatedName("ab")
	long[] field3129;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1516690357
	)
	int field3126;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 936754817
	)
	int field3127;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = 6092995591874398319L
	)
	long field3128;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1955234797
	)
	int field3125;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1033055869
	)
	int field3130;

	public MilliClock() {
		this.field3129 = new long[10];
		this.field3126 = 256;
		this.field3127 = 1;
		this.field3125 = 0;
		this.field3128 = class281.method6373();

		for (int var1 = 0; var1 < 10; ++var1) {
			this.field3129[var1] = this.field3128;
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) {
			this.field3129[var1] = 0L;
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "125"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field3126;
		int var4 = this.field3127;
		this.field3126 = 300;
		this.field3127 = 1;
		this.field3128 = class281.method6373();
		if (0L == this.field3129[this.field3130]) {
			this.field3126 = var3;
			this.field3127 = var4;
		} else if (this.field3128 > this.field3129[this.field3130]) {
			this.field3126 = (int)((long)(var1 * 2560) / (this.field3128 - this.field3129[this.field3130]));
		}

		if (this.field3126 < 25) {
			this.field3126 = 25;
		}

		if (this.field3126 > 256) {
			this.field3126 = 256;
			this.field3127 = (int)((long)var1 - (this.field3128 - this.field3129[this.field3130]) / 10L);
		}

		if (this.field3127 > var1) {
			this.field3127 = var1;
		}

		this.field3129[this.field3130] = this.field3128;
		this.field3130 = (this.field3130 + 1) % 10;
		int var5;
		if (this.field3127 > 1) {
			for (var5 = 0; var5 < 10; ++var5) {
				if (0L != this.field3129[var5]) {
					this.field3129[var5] += (long)this.field3127;
				}
			}
		}

		if (this.field3127 < var2) {
			this.field3127 = var2;
		}

		GrandExchangeOfferOwnWorldComparator.method789((long)this.field3127);

		for (var5 = 0; this.field3125 < 256; this.field3125 += this.field3126) {
			++var5;
		}

		this.field3125 &= 255;
		return var5;
	}

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-7236202"
	)
	static final boolean method5970(int var0) {
		if (var0 >= 2000) {
			var0 -= 2000;
		}

		return var0 == 1007;
	}
}
