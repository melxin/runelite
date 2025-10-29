import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kt")
@Implements("Clips")
public class Clips {
	@ObfuscatedName("az")
	int field3150;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	final ModelColorOverride field3166;
	@ObfuscatedName("ai")
	@Export("clipping")
	boolean clipping;
	@ObfuscatedName("as")
	@Export("rasterGouraudLowRes")
	public boolean rasterGouraudLowRes;
	@ObfuscatedName("ac")
	@Export("currentFaceAlpha")
	int currentFaceAlpha;
	@ObfuscatedName("ab")
	@Export("zoom")
	public int zoom;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	@Export("Rasterizer3D_textureLoader")
	public TextureLoader Rasterizer3D_textureLoader;
	@ObfuscatedName("ar")
	@Export("clipMidX")
	int clipMidX;
	@ObfuscatedName("ah")
	@Export("clipMidY")
	int clipMidY;
	@ObfuscatedName("al")
	@Export("clipX")
	int clipX;
	@ObfuscatedName("af")
	@Export("clipY")
	int clipY;
	@ObfuscatedName("am")
	@Export("clipNegativeMidX")
	int clipNegativeMidX;
	@ObfuscatedName("ao")
	@Export("clipCenterX")
	int clipCenterX;
	@ObfuscatedName("aa")
	@Export("clipNegativeMidY")
	int clipNegativeMidY;
	@ObfuscatedName("aq")
	int field3164;
	@ObfuscatedName("be")
	@Export("Rasterizer3D_rowOffsets")
	int[] Rasterizer3D_rowOffsets;
	@ObfuscatedName("bs")
	int field3142;
	@ObfuscatedName("bz")
	int field3139;

	Clips() {
		this.field3150 = 2;
		this.field3166 = new ModelColorOverride();
		this.clipping = false;
		this.rasterGouraudLowRes = true;
		this.currentFaceAlpha = 0;
		this.zoom = 512;
		this.Rasterizer3D_rowOffsets = new int[1024];
		this.field3142 = -1;
		this.field3139 = -1;
	}

	@ObfuscatedName("av")
	@Export("setClipBounds")
	void setClipBounds() {
		this.clipMidX = this.clipX / 2;
		this.clipMidY = this.clipY / 2;
		this.clipNegativeMidX = -this.clipMidX;
		this.clipCenterX = this.clipX - this.clipMidX;
		this.clipNegativeMidY = -this.clipMidY;
		this.field3164 = this.clipY - this.clipMidY;
	}

	@ObfuscatedName("at")
	@Export("setCustomClipBounds")
	void setCustomClipBounds(int var1, int var2, int var3, int var4) {
		this.clipMidX = var1 - var2;
		this.clipMidY = var3 - var4;
		this.clipNegativeMidX = -this.clipMidX;
		this.clipCenterX = this.clipX - this.clipMidX;
		this.clipNegativeMidY = -this.clipMidY;
		this.field3164 = this.clipY - this.clipMidY;
	}

	@ObfuscatedName("ag")
	@Export("setClipping")
	void setClipping(int var1, int var2, int var3) {
		this.clipping = var1 < 0 || var1 > this.clipX || var2 < 0 || var2 > this.clipX || var3 < 0 || var3 > this.clipX;
	}
}
