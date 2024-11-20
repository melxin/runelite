import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ik")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("FloorOverlayDefinition_archive")
	static AbstractArchive FloorOverlayDefinition_archive;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("FloorOverlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorOverlayDefinition_cached;
	@ObfuscatedName("ar")
	public static short[][] field2290;
	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("loginState")
	static LoginState loginState;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1526363551
	)
	@Export("primaryRgb")
	public int primaryRgb;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -83376399
	)
	@Export("texture")
	public int texture;
	@ObfuscatedName("ao")
	@Export("hideUnderlay")
	public boolean hideUnderlay;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 851589533
	)
	@Export("secondaryRgb")
	public int secondaryRgb;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -2074460355
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -816868179
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -822223781
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 498825027
	)
	@Export("secondaryHue")
	public int secondaryHue;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 453716031
	)
	@Export("secondarySaturation")
	public int secondarySaturation;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 916349739
	)
	@Export("secondaryLightness")
	public int secondaryLightness;

	static {
		FloorOverlayDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	FloorOverlayDefinition() {
		this.primaryRgb = 0;
		this.texture = -1;
		this.hideUnderlay = true;
		this.secondaryRgb = -1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "33"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.secondaryRgb != -1) {
			this.setHsl(this.secondaryRgb);
			this.secondaryHue = this.hue;
			this.secondarySaturation = this.saturation;
			this.secondaryLightness = this.lightness;
		}

		this.setHsl(this.primaryRgb);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lvj;II)V",
		garbageValue = "-1278516349"
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lvj;III)V",
		garbageValue = "1839673689"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) {
			this.primaryRgb = var1.readMedium();
		} else if (var2 == 2) {
			this.texture = var1.readUnsignedByte();
		} else if (var2 == 5) {
			this.hideUnderlay = false;
		} else if (var2 == 7) {
			this.secondaryRgb = var1.readMedium();
		} else if (var2 == 8) {
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-48930687"
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
		if (var10 != var8) {
			if (var16 < 0.5D) {
				var14 = (var10 - var8) / (var10 + var8);
			}

			if (var16 >= 0.5D) {
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var2 == var10) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) {
				var12 = 2.0D + (var6 - var2) / (var10 - var8);
			} else if (var10 == var6) {
				var12 = (var2 - var4) / (var10 - var8) + 4.0D;
			}
		}

		var12 /= 6.0D;
		this.hue = (int)(256.0D * var12);
		this.saturation = (int)(256.0D * var14);
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

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-724867679"
	)
	public static void method4257() {
		class333.field3626.clear();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "721780802"
	)
	static final int method4256(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}
}
