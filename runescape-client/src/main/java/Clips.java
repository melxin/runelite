import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hm")
@Implements("Clips")
public class Clips {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	final ModelColorOverride field2344;
	@ObfuscatedName("aa")
	@Export("clipping")
	boolean clipping;
	@ObfuscatedName("ap")
	@Export("rasterGouraudLowRes")
	public boolean rasterGouraudLowRes;
	@ObfuscatedName("ax")
	@Export("currentFaceAlpha")
	int currentFaceAlpha;
	@ObfuscatedName("aw")
	@Export("zoom")
	public int zoom;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	@Export("Rasterizer3D_textureLoader")
	public TextureLoader Rasterizer3D_textureLoader;
	@ObfuscatedName("au")
	@Export("clipMidX")
	int clipMidX;
	@ObfuscatedName("aj")
	@Export("clipMidY")
	int clipMidY;
	@ObfuscatedName("al")
	@Export("clipX")
	int clipX;
	@ObfuscatedName("ac")
	@Export("clipY")
	int clipY;
	@ObfuscatedName("ay")
	@Export("clipNegativeMidX")
	int clipNegativeMidX;
	@ObfuscatedName("ak")
	@Export("clipCenterX")
	int clipCenterX;
	@ObfuscatedName("ag")
	@Export("clipNegativeMidY")
	int clipNegativeMidY;
	@ObfuscatedName("ai")
	int field2357;
	@ObfuscatedName("ad")
	@Export("Rasterizer3D_rowOffsets")
	int[] Rasterizer3D_rowOffsets;

	Clips() {
		this.field2344 = new ModelColorOverride();
		this.clipping = false;
		this.rasterGouraudLowRes = true;
		this.currentFaceAlpha = 0;
		this.zoom = 512;
		this.Rasterizer3D_rowOffsets = new int[1024];
	}

	@ObfuscatedName("ao")
	@Export("setClipBounds")
	void setClipBounds() {
		this.clipMidX = this.clipX / 2;
		this.clipMidY = this.clipY / 2;
		this.clipNegativeMidX = -this.clipMidX;
		this.clipCenterX = this.clipX - this.clipMidX;
		this.clipNegativeMidY = -this.clipMidY;
		this.field2357 = this.clipY - this.clipMidY;
	}

	@ObfuscatedName("an")
	@Export("setCustomClipBounds")
	void setCustomClipBounds(int var1, int var2, int var3, int var4) {
		this.clipMidX = var1 - var2;
		this.clipMidY = var3 - var4;
		this.clipNegativeMidX = -this.clipMidX;
		this.clipCenterX = this.clipX - this.clipMidX;
		this.clipNegativeMidY = -this.clipMidY;
		this.field2357 = this.clipY - this.clipMidY;
	}

	@ObfuscatedName("ae")
	@Export("setClipping")
	void setClipping(int var1, int var2, int var3) {
		this.clipping = var1 < 0 || var1 > this.clipX || var2 < 0 || var2 > this.clipX || var3 < 0 || var3 > this.clipX;
	}
}
