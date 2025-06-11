import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kh")
@Implements("Clips")
public class Clips {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	final ModelColorOverride field2990;
	@ObfuscatedName("ah")
	@Export("clipping")
	boolean clipping;
	@ObfuscatedName("ag")
	@Export("rasterGouraudLowRes")
	public boolean rasterGouraudLowRes;
	@ObfuscatedName("au")
	@Export("currentFaceAlpha")
	int currentFaceAlpha;
	@ObfuscatedName("ar")
	@Export("zoom")
	public int zoom;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	@Export("Rasterizer3D_textureLoader")
	public TextureLoader Rasterizer3D_textureLoader;
	@ObfuscatedName("af")
	@Export("clipMidX")
	int clipMidX;
	@ObfuscatedName("ak")
	@Export("clipMidY")
	int clipMidY;
	@ObfuscatedName("az")
	@Export("clipX")
	int clipX;
	@ObfuscatedName("aw")
	@Export("clipY")
	int clipY;
	@ObfuscatedName("at")
	@Export("clipNegativeMidX")
	int clipNegativeMidX;
	@ObfuscatedName("ae")
	@Export("clipCenterX")
	int clipCenterX;
	@ObfuscatedName("av")
	@Export("clipNegativeMidY")
	int clipNegativeMidY;
	@ObfuscatedName("ao")
	int field2994;
	@ObfuscatedName("as")
	@Export("Rasterizer3D_rowOffsets")
	int[] Rasterizer3D_rowOffsets;

	Clips() {
		this.field2990 = new ModelColorOverride();
		this.clipping = false;
		this.rasterGouraudLowRes = true;
		this.currentFaceAlpha = 0;
		this.zoom = 512;
		this.Rasterizer3D_rowOffsets = new int[1024];
	}

	@ObfuscatedName("ap")
	@Export("setClipBounds")
	void setClipBounds() {
		this.clipMidX = this.clipX / 2;
		this.clipMidY = this.clipY / 2;
		this.clipNegativeMidX = -this.clipMidX;
		this.clipCenterX = this.clipX - this.clipMidX;
		this.clipNegativeMidY = -this.clipMidY;
		this.field2994 = this.clipY - this.clipMidY;
	}

	@ObfuscatedName("aj")
	@Export("setCustomClipBounds")
	void setCustomClipBounds(int var1, int var2, int var3, int var4) {
		this.clipMidX = var1 - var2;
		this.clipMidY = var3 - var4;
		this.clipNegativeMidX = -this.clipMidX;
		this.clipCenterX = this.clipX - this.clipMidX;
		this.clipNegativeMidY = -this.clipMidY;
		this.field2994 = this.clipY - this.clipMidY;
	}

	@ObfuscatedName("an")
	@Export("setClipping")
	void setClipping(int var1, int var2, int var3) {
		this.clipping = var1 < 0 || var1 > this.clipX || var2 < 0 || var2 > this.clipX || var3 < 0 || var3 > this.clipX;
	}
}
