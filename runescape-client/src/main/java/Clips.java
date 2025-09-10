import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jd")
@Implements("Clips")
public class Clips {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	final ModelColorOverride field3001;
	@ObfuscatedName("au")
	@Export("clipping")
	boolean clipping;
	@ObfuscatedName("ai")
	@Export("rasterGouraudLowRes")
	public boolean rasterGouraudLowRes;
	@ObfuscatedName("aa")
	@Export("currentFaceAlpha")
	int currentFaceAlpha;
	@ObfuscatedName("am")
	@Export("zoom")
	public int zoom;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	@Export("Rasterizer3D_textureLoader")
	public TextureLoader Rasterizer3D_textureLoader;
	@ObfuscatedName("ar")
	@Export("clipMidX")
	int clipMidX;
	@ObfuscatedName("ae")
	@Export("clipMidY")
	int clipMidY;
	@ObfuscatedName("ay")
	@Export("clipX")
	int clipX;
	@ObfuscatedName("ad")
	@Export("clipY")
	int clipY;
	@ObfuscatedName("ag")
	@Export("clipNegativeMidX")
	int clipNegativeMidX;
	@ObfuscatedName("av")
	@Export("clipCenterX")
	int clipCenterX;
	@ObfuscatedName("ah")
	@Export("clipNegativeMidY")
	int clipNegativeMidY;
	@ObfuscatedName("ab")
	int field3014;
	@ObfuscatedName("ax")
	@Export("Rasterizer3D_rowOffsets")
	int[] Rasterizer3D_rowOffsets;
	@ObfuscatedName("az")
	int field3016;
	@ObfuscatedName("bt")
	int field3019;

	Clips() {
		this.field3001 = new ModelColorOverride();
		this.clipping = false;
		this.rasterGouraudLowRes = true;
		this.currentFaceAlpha = 0;
		this.zoom = 512;
		this.Rasterizer3D_rowOffsets = new int[1024];
		this.field3016 = -1;
		this.field3019 = -1;
	}

	@ObfuscatedName("af")
	@Export("setClipBounds")
	void setClipBounds() {
		this.clipMidX = this.clipX / 2;
		this.clipMidY = this.clipY / 2;
		this.clipNegativeMidX = -this.clipMidX;
		this.clipCenterX = this.clipX - this.clipMidX;
		this.clipNegativeMidY = -this.clipMidY;
		this.field3014 = this.clipY - this.clipMidY;
	}

	@ObfuscatedName("aw")
	@Export("setCustomClipBounds")
	void setCustomClipBounds(int var1, int var2, int var3, int var4) {
		this.clipMidX = var1 - var2;
		this.clipMidY = var3 - var4;
		this.clipNegativeMidX = -this.clipMidX;
		this.clipCenterX = this.clipX - this.clipMidX;
		this.clipNegativeMidY = -this.clipMidY;
		this.field3014 = this.clipY - this.clipMidY;
	}

	@ObfuscatedName("at")
	@Export("setClipping")
	void setClipping(int var1, int var2, int var3) {
		this.clipping = var1 < 0 || var1 > this.clipX || var2 < 0 || var2 > this.clipX || var3 < 0 || var3 > this.clipX;
	}
}
