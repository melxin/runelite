import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hf")
@Implements("FloorUnderlayDefinition")
public class FloorUnderlayDefinition extends DualNode {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	@Export("FloorUnderlayDefinition_archive")
	public static AbstractArchive FloorUnderlayDefinition_archive;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("FloorUnderlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorUnderlayDefinition_cached;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 2038044067
	)
	static int field2216;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 805645933
	)
	@Export("rgb")
	int rgb;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 124413169
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1731148931
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1928632847
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1636648267
	)
	@Export("hueMultiplier")
	public int hueMultiplier;

	static {
		FloorUnderlayDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	public FloorUnderlayDefinition() {
		this.rgb = 0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1181210910"
	)
	@Export("postDecode")
	public void postDecode() {
		this.setHsl(this.rgb);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lxa;II)V",
		garbageValue = "-320814010"
	)
	@Export("decode")
	public void decode(Buffer var1, int var2) {
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
		descriptor = "(Lxa;III)V",
		garbageValue = "1734701964"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) {
			this.rgb = var1.readMedium();
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1891725815"
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
		double var16 = (var8 + var10) / 2.0D;
		if (var8 != var10) {
			if (var16 < 0.5D) {
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5D) {
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var10 == var2) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var10 == var4) {
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var10 == var6) {
				var12 = 4.0D + (var2 - var4) / (var10 - var8);
			}
		}

		var12 /= 6.0D;
		this.saturation = (int)(256.0D * var14);
		this.lightness = (int)(256.0D * var16);
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
			this.hueMultiplier = (int)(var16 * var14 * 512.0D);
		}

		if (this.hueMultiplier < 1) {
			this.hueMultiplier = 1;
		}

		this.hue = (int)((double)this.hueMultiplier * var12);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lut;B)I",
		garbageValue = "100"
	)
	public static int method4584(DynamicArray var0) {
		class585.method11429(var0);
		byte var1 = 0;
		int var2 = var0.method10652();
		int var3 = -1;
		int var8;
		if (var0.field5584 == class586.field5937) {
			int[] var4 = var0.method10650();

			for (var8 = var1; var8 < var2; ++var8) {
				if (var3 == -1 || var4[var8] < var4[var3]) {
					var3 = var8;
				}
			}
		} else if (var0.field5584 == class586.field5942) {
			long[] var9 = var0.method10651();

			for (var8 = var1; var8 < var2; ++var8) {
				if (var3 == -1 || var9[var8] < var9[var3]) {
					var3 = var8;
				}
			}
		} else if (var0.field5584 == class586.field5939) {
			String var10 = null;
			Object[] var5 = var0.method10681();

			for (int var6 = var1; var6 < var2; ++var6) {
				String var7 = (String)var5[var6];
				if (var3 == -1 || var7 != null && var7.compareTo(var10) < 0) {
					var3 = var6;
					var10 = var7;
				}
			}
		}

		return var3;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "-19453"
	)
	static final void method4608(String var0) {
		SwapSongTask.method9921("Please remove " + var0 + " from your friend list first");
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "76"
	)
	static void method4606() {
		class472.compass = null;
		class39.redHintArrowSprite = null;
		class499.mapSceneSprites = null;
		class66.headIconPkSprites = null;
		class279.headIconPrayerSprites = null;
		SceneTilePaint.headIconHintSprites = null;
		class217.mapDotSprites = null;
		class137.crossSprites = null;
		class579.field5923 = null;
		WorldMapArchiveLoader.scrollBarSprites = null;
		UrlRequest.field1542 = null;
	}
}
