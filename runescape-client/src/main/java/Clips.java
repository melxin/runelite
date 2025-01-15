import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hm")
@Implements("Clips")
public class Clips {
	@ObfuscatedName("ay")
	@Export("clipping")
	boolean clipping;
	@ObfuscatedName("ah")
	@Export("rasterGouraudLowRes")
	public boolean rasterGouraudLowRes;
	@ObfuscatedName("az")
	@Export("currentFaceAlpha")
	int currentFaceAlpha;
	@ObfuscatedName("an")
	@Export("zoom")
	public int zoom;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lhf;"
	)
	@Export("Rasterizer3D_textureLoader")
	public TextureLoader Rasterizer3D_textureLoader;
	@ObfuscatedName("aq")
	@Export("clipMidX")
	int clipMidX;
	@ObfuscatedName("af")
	@Export("clipMidY")
	int clipMidY;
	@ObfuscatedName("aa")
	@Export("clipX")
	int clipX;
	@ObfuscatedName("ak")
	@Export("clipY")
	int clipY;
	@ObfuscatedName("al")
	@Export("clipNegativeMidX")
	int clipNegativeMidX;
	@ObfuscatedName("av")
	@Export("clipCenterX")
	int clipCenterX;
	@ObfuscatedName("ag")
	@Export("clipNegativeMidY")
	int clipNegativeMidY;
	@ObfuscatedName("aw")
	int field2294;
	@ObfuscatedName("ai")
	@Export("Rasterizer3D_rowOffsets")
	int[] Rasterizer3D_rowOffsets;

	Clips() {
		this.clipping = false;
		this.rasterGouraudLowRes = true;
		this.currentFaceAlpha = 0;
		this.zoom = 512;
		this.Rasterizer3D_rowOffsets = new int[1024];
	}

	@ObfuscatedName("ay")
	@Export("setClipBounds")
	void setClipBounds() {
		this.clipMidX = this.clipX / 2;
		this.clipMidY = this.clipY / 2;
		this.clipNegativeMidX = -this.clipMidX;
		this.clipCenterX = this.clipX - this.clipMidX;
		this.clipNegativeMidY = -this.clipMidY;
		this.field2294 = this.clipY - this.clipMidY;
	}

	@ObfuscatedName("ah")
	@Export("setCustomClipBounds")
	void setCustomClipBounds(int var1, int var2, int var3, int var4) {
		this.clipMidX = var1 - var2;
		this.clipMidY = var3 - var4;
		this.clipNegativeMidX = -this.clipMidX;
		this.clipCenterX = this.clipX - this.clipMidX;
		this.clipNegativeMidY = -this.clipMidY;
		this.field2294 = this.clipY - this.clipMidY;
	}

	@ObfuscatedName("az")
	@Export("setClipping")
	void setClipping(int var1, int var2, int var3) {
		this.clipping = var1 < 0 || var1 > this.clipX || var2 < 0 || var2 > this.clipX || var3 < 0 || var3 > this.clipX;
	}
}
