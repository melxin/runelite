import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iy")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("po")
	@ObfuscatedSignature(
		descriptor = "Lwd;"
	)
	@Export("compass")
	static SpritePixels compass;
	@ObfuscatedName("ap")
	long[] field2446;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 39582953
	)
	int field2448;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1309093215
	)
	int field2449;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		longValue = -151150028214479669L
	)
	long field2450;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1109702157
	)
	int field2447;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1528897589
	)
	int field2451;

	MilliClock() {
		this.field2446 = new long[10];
		this.field2448 = 256;
		this.field2449 = 1;
		this.field2447 = 0;
		this.field2450 = class180.method3973();

		for (int var1 = 0; var1 < 10; ++var1) {
			this.field2446[var1] = this.field2450;
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) {
			this.field2446[var1] = 0L;
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-51"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field2448;
		int var4 = this.field2449;
		this.field2448 = 300;
		this.field2449 = 1;
		this.field2450 = class180.method3973();
		if (this.field2446[this.field2451] == 0L) {
			this.field2448 = var3;
			this.field2449 = var4;
		} else if (this.field2450 > this.field2446[this.field2451]) {
			this.field2448 = (int)((long)(var1 * 2560) / (this.field2450 - this.field2446[this.field2451]));
		}

		if (this.field2448 < 25) {
			this.field2448 = 25;
		}

		if (this.field2448 > 256) {
			this.field2448 = 256;
			this.field2449 = (int)((long)var1 - (this.field2450 - this.field2446[this.field2451]) / 10L);
		}

		if (this.field2449 > var1) {
			this.field2449 = var1;
		}

		this.field2446[this.field2451] = this.field2450;
		this.field2451 = (this.field2451 + 1) % 10;
		int var5;
		if (this.field2449 > 1) {
			for (var5 = 0; var5 < 10; ++var5) {
				if (this.field2446[var5] != 0L) {
					this.field2446[var5] += (long)this.field2449;
				}
			}
		}

		if (this.field2449 < var2) {
			this.field2449 = var2;
		}

		UserComparator8.method3393((long)this.field2449);

		for (var5 = 0; this.field2447 < 256; this.field2447 += this.field2448) {
			++var5;
		}

		this.field2447 &= 255;
		return var5;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I[IIB)V",
		garbageValue = "4"
	)
	static void method4749(int var0, int[] var1, int var2) {
		for (int var3 = 0; var3 < KitDefinition.KitDefinition_fileCount; ++var3) {
			KitDefinition var4 = TileItem.method2686(var3);
			if (var4 != null && !var4.nonSelectable && var4.method4043(var2, var0)) {
				if (class198.field2098 == null) {
					class198.field2098 = new int[7];
					class198.field2098[class198.field2094.field2099] = class214.field2373.field2372;
					class198.field2098[class198.field2091.field2099] = class214.field2383.field2372;
					class198.field2098[class198.field2092.field2099] = class214.field2376.field2372;
					class198.field2098[class198.field2093.field2099] = class214.field2378.field2372;
					class198.field2098[class198.field2095.field2099] = class214.field2381.field2372;
					class198.field2098[class198.field2096.field2099] = class214.field2379.field2372;
					class198.field2098[class198.field2101.field2099] = class214.field2382.field2372;
				}

				int var6 = class198.field2098[var2];
				var1[var6] = var3 + 256;
				break;
			}
		}

	}

	@ObfuscatedName("aj")
	static final void method4746(long var0) {
		try {
			Thread.sleep(var0);
		} catch (InterruptedException var3) {
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Lwd;",
		garbageValue = "588824282"
	)
	static SpritePixels method4750() {
		SpritePixels var0 = new SpritePixels();
		var0.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
		var0.height = SpriteBufferProperties.SpriteBuffer_spriteHeight;
		var0.xOffset = SpriteBufferProperties.SpriteBuffer_xOffsets[0];
		var0.yOffset = Varps.SpriteBuffer_yOffsets[0];
		var0.subWidth = class379.SpriteBuffer_spriteWidths[0];
		var0.subHeight = class171.SpriteBuffer_spriteHeights[0];
		int var1 = var0.subHeight * var0.subWidth;
		byte[] var2 = SpriteBufferProperties.SpriteBuffer_pixels[0];
		var0.pixels = new int[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			var0.pixels[var3] = SpriteBufferProperties.SpriteBuffer_spritePalette[var2[var3] & 255];
		}

		SpriteBufferProperties.SpriteBuffer_xOffsets = null;
		Varps.SpriteBuffer_yOffsets = null;
		class379.SpriteBuffer_spriteWidths = null;
		class171.SpriteBuffer_spriteHeights = null;
		SpriteBufferProperties.SpriteBuffer_spritePalette = null;
		SpriteBufferProperties.SpriteBuffer_pixels = null;
		return var0;
	}
}
