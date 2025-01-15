import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("io")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("ay")
	long[] field2399;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1008911357
	)
	int field2400;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1670163177
	)
	int field2401;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = 7303459872380216089L
	)
	long field2402;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1956802617
	)
	int field2403;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1048142161
	)
	int field2404;

	public MilliClock() {
		this.field2399 = new long[10];
		this.field2400 = 256;
		this.field2401 = 1;
		this.field2403 = 0;
		this.field2402 = ReflectionCheck.method724();

		for (int var1 = 0; var1 < 10; ++var1) {
			this.field2399[var1] = this.field2402;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1922091569"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) {
			this.field2399[var1] = 0L;
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1083508360"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field2400;
		int var4 = this.field2401;
		this.field2400 = 300;
		this.field2401 = 1;
		this.field2402 = ReflectionCheck.method724();
		if (this.field2399[this.field2404] == 0L) {
			this.field2400 = var3;
			this.field2401 = var4;
		} else if (this.field2402 > this.field2399[this.field2404]) {
			this.field2400 = (int)((long)(var1 * 2560) / (this.field2402 - this.field2399[this.field2404]));
		}

		if (this.field2400 < 25) {
			this.field2400 = 25;
		}

		if (this.field2400 > 256) {
			this.field2400 = 256;
			this.field2401 = (int)((long)var1 - (this.field2402 - this.field2399[this.field2404]) / 10L);
		}

		if (this.field2401 > var1) {
			this.field2401 = var1;
		}

		this.field2399[this.field2404] = this.field2402;
		this.field2404 = (this.field2404 + 1) % 10;
		int var5;
		if (this.field2401 > 1) {
			for (var5 = 0; var5 < 10; ++var5) {
				if (0L != this.field2399[var5]) {
					this.field2399[var5] += (long)this.field2401;
				}
			}
		}

		if (this.field2401 < var2) {
			this.field2401 = var2;
		}

		class174.method3881((long)this.field2401);

		for (var5 = 0; this.field2403 < 256; this.field2403 += this.field2400) {
			++var5;
		}

		this.field2403 &= 255;
		return var5;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "-14012"
	)
	static int method4964(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
		if (var1 == null) {
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count;
		}
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "1454186243"
	)
	@Export("getUserId")
	static long getUserId() {
		return Client.userId;
	}
}
