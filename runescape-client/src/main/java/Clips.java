import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kg")
@Implements("Clips")
public class Clips {
	@ObfuscatedName("ab")
	@Export("clipping")
	boolean clipping;
	@ObfuscatedName("aw")
	@Export("rasterGouraudLowRes")
	public boolean rasterGouraudLowRes;
	@ObfuscatedName("at")
	@Export("currentFaceAlpha")
	int currentFaceAlpha;
	@ObfuscatedName("ac")
	@Export("zoom")
	public int zoom;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	@Export("Rasterizer3D_textureLoader")
	public TextureLoader Rasterizer3D_textureLoader;
	@ObfuscatedName("al")
	@Export("clipMidX")
	int clipMidX;
	@ObfuscatedName("ar")
	@Export("clipMidY")
	int clipMidY;
	@ObfuscatedName("as")
	@Export("clipX")
	int clipX;
	@ObfuscatedName("az")
	@Export("clipY")
	int clipY;
	@ObfuscatedName("ak")
	@Export("clipNegativeMidX")
	int clipNegativeMidX;
	@ObfuscatedName("ap")
	@Export("clipCenterX")
	int clipCenterX;
	@ObfuscatedName("ah")
	@Export("clipNegativeMidY")
	int clipNegativeMidY;
	@ObfuscatedName("ad")
	int field2937;
	@ObfuscatedName("ay")
	@Export("Rasterizer3D_rowOffsets")
	int[] Rasterizer3D_rowOffsets;

	Clips() {
		this.clipping = false;
		this.rasterGouraudLowRes = true;
		this.currentFaceAlpha = 0;
		this.zoom = 512;
		this.Rasterizer3D_rowOffsets = new int[1024];
	}

	@ObfuscatedName("ab")
	@Export("setClipBounds")
	void setClipBounds() {
		this.clipMidX = this.clipX / 2;
		this.clipMidY = this.clipY / 2;
		this.clipNegativeMidX = -this.clipMidX;
		this.clipCenterX = this.clipX - this.clipMidX;
		this.clipNegativeMidY = -this.clipMidY;
		this.field2937 = this.clipY - this.clipMidY;
	}

	@ObfuscatedName("aw")
	@Export("setCustomClipBounds")
	void setCustomClipBounds(int var1, int var2, int var3, int var4) {
		this.clipMidX = var1 - var2;
		this.clipMidY = var3 - var4;
		this.clipNegativeMidX = -this.clipMidX;
		this.clipCenterX = this.clipX - this.clipMidX;
		this.clipNegativeMidY = -this.clipMidY;
		this.field2937 = this.clipY - this.clipMidY;
	}

	@ObfuscatedName("at")
	@Export("setClipping")
	void setClipping(int var1, int var2, int var3) {
		this.clipping = var1 < 0 || var1 > this.clipX || var2 < 0 || var2 > this.clipX || var3 < 0 || var3 > this.clipX;
	}
}
