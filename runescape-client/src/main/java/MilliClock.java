import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iq")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("ao")
	long[] field2457;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1657148713
	)
	int field2458;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -779621793
	)
	int field2459;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		longValue = 7686640387111194657L
	)
	long field2460;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -88685985
	)
	int field2461;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1759607855
	)
	int field2462;

	MilliClock() {
		this.field2457 = new long[10];
		this.field2458 = 256;
		this.field2459 = 1;
		this.field2461 = 0;
		this.field2460 = class282.method5908();

		for (int var1 = 0; var1 < 10; ++var1) {
			this.field2457[var1] = this.field2460;
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1079999329"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) {
			this.field2457[var1] = 0L;
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-587762544"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field2458;
		int var4 = this.field2459;
		this.field2458 = 300;
		this.field2459 = 1;
		this.field2460 = class282.method5908();
		if (this.field2457[this.field2462] == 0L) {
			this.field2458 = var3;
			this.field2459 = var4;
		} else if (this.field2460 > this.field2457[this.field2462]) {
			this.field2458 = (int)((long)(var1 * 2560) / (this.field2460 - this.field2457[this.field2462]));
		}

		if (this.field2458 < 25) {
			this.field2458 = 25;
		}

		if (this.field2458 > 256) {
			this.field2458 = 256;
			this.field2459 = (int)((long)var1 - (this.field2460 - this.field2457[this.field2462]) / 10L);
		}

		if (this.field2459 > var1) {
			this.field2459 = var1;
		}

		this.field2457[this.field2462] = this.field2460;
		this.field2462 = (this.field2462 + 1) % 10;
		int var5;
		if (this.field2459 > 1) {
			for (var5 = 0; var5 < 10; ++var5) {
				if (0L != this.field2457[var5]) {
					this.field2457[var5] += (long)this.field2459;
				}
			}
		}

		if (this.field2459 < var2) {
			this.field2459 = var2;
		}

		WorldMapRectangle.method6331((long)this.field2459);

		for (var5 = 0; this.field2461 < 256; this.field2461 += this.field2458) {
			++var5;
		}

		this.field2461 &= 255;
		return var5;
	}

	@ObfuscatedName("aq")
	public static int method4833(long var0) {
		return (int)(var0 >>> 7 & 127L);
	}

	@ObfuscatedName("nx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "211151901"
	)
	static final void method4830(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		Renderable.clientPreferences.updateAreaSoundEffectsVolume(var0);
	}
}
