import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ho")
@Implements("FloorUnderlayDefinition")
public class FloorUnderlayDefinition extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("FloorUnderlayDefinition_archive")
	public static AbstractArchive FloorUnderlayDefinition_archive;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("FloorUnderlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorUnderlayDefinition_cached;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	static Bounds field2082;
	@ObfuscatedName("qu")
	@ObfuscatedSignature(
		descriptor = "Luz;"
	)
	static class539 field2075;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 824632793
	)
	@Export("rgb")
	int rgb;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1572615681
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -57803931
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1204207795
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -225506525
	)
	@Export("hueMultiplier")
	public int hueMultiplier;

	static {
		FloorUnderlayDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	FloorUnderlayDefinition() {
		this.rgb = 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-8"
	)
	@Export("postDecode")
	void postDecode() {
		this.setHsl(this.rgb);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lvj;IB)V",
		garbageValue = "28"
	)
	@Export("decode")
	void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 0) {
				return;
			}

			this.decodeNext(var1, var3, var2);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lvj;IIS)V",
		garbageValue = "10546"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) {
			this.rgb = var1.readMedium();
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2078415781"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D;
		double var4 = (double)(var1 >> 8 & 255) / 256.0D;
		double var6 = (double)(var1 & 255) / 256.0D;
		double var8 = var2;
		if (var4 < var2) {
			var8 = var4;
		}

		if (var6 < var8) {
			var8 = var6;
		}

		double var10 = var2;
		if (var4 > var2) {
			var10 = var4;
		}

		if (var6 > var10) {
			var10 = var6;
		}

		double var12 = 0.0D;
		double var14 = 0.0D;
		double var16 = (var10 + var8) / 2.0D;
		if (var8 != var10) {
			if (var16 < 0.5D) {
				var14 = (var10 - var8) / (var10 + var8);
			}

			if (var16 >= 0.5D) {
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var10 == var2) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) {
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var10 == var6) {
				var12 = (var2 - var4) / (var10 - var8) + 4.0D;
			}
		}

		var12 /= 6.0D;
		this.saturation = (int)(var14 * 256.0D);
		this.lightness = (int)(var16 * 256.0D);
		if (this.saturation < 0) {
			this.saturation = 0;
		} else if (this.saturation > 255) {
			this.saturation = 255;
		}

		if (this.lightness < 0) {
			this.lightness = 0;
		} else if (this.lightness > 255) {
			this.lightness = 255;
		}

		if (var16 > 0.5D) {
			this.hueMultiplier = (int)((1.0D - var16) * var14 * 512.0D);
		} else {
			this.hueMultiplier = (int)(512.0D * var14 * var16);
		}

		if (this.hueMultiplier < 1) {
			this.hueMultiplier = 1;
		}

		this.hue = (int)(var12 * (double)this.hueMultiplier);
	}

	@ObfuscatedName("ab")
	public static double method3993(double var0) {
		return Math.exp(var0 * -var0 / 2.0D) / Math.sqrt(6.283185307179586D);
	}
}
