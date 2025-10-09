import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hj")
@Implements("FloorUnderlayDefinition")
public class FloorUnderlayDefinition extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("FloorUnderlayDefinition_archive")
	public static AbstractArchive FloorUnderlayDefinition_archive;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("FloorUnderlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorUnderlayDefinition_cached;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -938424203
	)
	@Export("rgb")
	int rgb;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 588425523
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 950473497
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 242991345
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1449789169
	)
	@Export("hueMultiplier")
	public int hueMultiplier;

	static {
		FloorUnderlayDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	public FloorUnderlayDefinition() {
		this.rgb = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2019181373"
	)
	@Export("postDecode")
	public void postDecode() {
		this.setHsl(this.rgb);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lwj;IB)V",
		garbageValue = "-36"
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lwj;IIS)V",
		garbageValue = "-7511"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) {
			this.rgb = var1.readMedium();
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "46"
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
			} else if (var4 == var10) {
				var12 = 2.0D + (var6 - var2) / (var10 - var8);
			} else if (var6 == var10) {
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
			this.hueMultiplier = (int)(512.0D * (1.0D - var16) * var14);
		} else {
			this.hueMultiplier = (int)(512.0D * var16 * var14);
		}

		if (this.hueMultiplier < 1) {
			this.hueMultiplier = 1;
		}

		this.hue = (int)(var12 * (double)this.hueMultiplier);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpe;B)V",
		garbageValue = "49"
	)
	public static void method4511(AbstractArchive var0) {
		VarbitComposition.VarbitDefinition_archive = var0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(JII)V",
		garbageValue = "1206313092"
	)
	static final void method4509(long var0, int var2) {
		if (ViewportMouse.field2958[ViewportMouse.ViewportMouse_entityCount] != Integer.MAX_VALUE && ViewportMouse.ViewportMouse_entityTags[ViewportMouse.ViewportMouse_entityCount] != var0) {
			++ViewportMouse.ViewportMouse_entityCount;
			ViewportMouse.field2958[ViewportMouse.ViewportMouse_entityCount] = Integer.MAX_VALUE;
		}

		ViewportMouse.ViewportMouse_entityTags[ViewportMouse.ViewportMouse_entityCount] = var0;
		ViewportMouse.field2958[ViewportMouse.ViewportMouse_entityCount] = Math.min(ViewportMouse.field2958[ViewportMouse.ViewportMouse_entityCount], var2);
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(B)Lud;",
		garbageValue = "115"
	)
	@Export("getPlatformInfo")
	static PlatformInfo getPlatformInfo() {
		return class151.platformInfo;
	}
}
