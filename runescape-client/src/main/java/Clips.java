import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
@Implements("Clips")
public class Clips {
	@ObfuscatedName("ad")
	int field2999;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	final ModelColorOverride field3001;
	@ObfuscatedName("as")
	@Export("clipping")
	boolean clipping;
	@ObfuscatedName("ar")
	@Export("rasterGouraudLowRes")
	public boolean rasterGouraudLowRes;
	@ObfuscatedName("az")
	@Export("currentFaceAlpha")
	int currentFaceAlpha;
	@ObfuscatedName("au")
	@Export("zoom")
	public int zoom;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	@Export("Rasterizer3D_textureLoader")
	public TextureLoader Rasterizer3D_textureLoader;
	@ObfuscatedName("ao")
	@Export("clipMidX")
	int clipMidX;
	@ObfuscatedName("ax")
	@Export("clipMidY")
	int clipMidY;
	@ObfuscatedName("an")
	@Export("clipX")
	int clipX;
	@ObfuscatedName("aw")
	@Export("clipY")
	int clipY;
	@ObfuscatedName("ai")
	@Export("clipNegativeMidX")
	int clipNegativeMidX;
	@ObfuscatedName("am")
	@Export("clipCenterX")
	int clipCenterX;
	@ObfuscatedName("al")
	@Export("clipNegativeMidY")
	int clipNegativeMidY;
	@ObfuscatedName("ay")
	int field3014;
	@ObfuscatedName("be")
	@Export("Rasterizer3D_rowOffsets")
	int[] Rasterizer3D_rowOffsets;
	@ObfuscatedName("bb")
	int field3018;
	@ObfuscatedName("bn")
	int field3016;

	Clips() {
		this.field2999 = 2;
		this.field3001 = new ModelColorOverride();
		this.clipping = false;
		this.rasterGouraudLowRes = true;
		this.currentFaceAlpha = 0;
		this.zoom = 512;
		this.Rasterizer3D_rowOffsets = new int[1024];
		this.field3018 = -1;
		this.field3016 = -1;
	}

	@ObfuscatedName("ab")
	@Export("setClipBounds")
	void setClipBounds() {
		this.clipMidX = this.clipX / 2;
		this.clipMidY = this.clipY / 2;
		this.clipNegativeMidX = -this.clipMidX;
		this.clipCenterX = this.clipX - this.clipMidX;
		this.clipNegativeMidY = -this.clipMidY;
		this.field3014 = this.clipY - this.clipMidY;
	}

	@ObfuscatedName("at")
	@Export("setCustomClipBounds")
	void setCustomClipBounds(int var1, int var2, int var3, int var4) {
		this.clipMidX = var1 - var2;
		this.clipMidY = var3 - var4;
		this.clipNegativeMidX = -this.clipMidX;
		this.clipCenterX = this.clipX - this.clipMidX;
		this.clipNegativeMidY = -this.clipMidY;
		this.field3014 = this.clipY - this.clipMidY;
	}

	@ObfuscatedName("ag")
	@Export("setClipping")
	void setClipping(int var1, int var2, int var3) {
		this.clipping = var1 < 0 || var1 > this.clipX || var2 < 0 || var2 > this.clipX || var3 < 0 || var3 > this.clipX;
	}
}
