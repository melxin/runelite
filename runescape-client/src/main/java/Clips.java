import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jz")
@Implements("Clips")
public class Clips {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	final ModelColorOverride field2943;
	@ObfuscatedName("aj")
	@Export("clipping")
	boolean clipping;
	@ObfuscatedName("ag")
	@Export("rasterGouraudLowRes")
	public boolean rasterGouraudLowRes;
	@ObfuscatedName("ay")
	@Export("currentFaceAlpha")
	int currentFaceAlpha;
	@ObfuscatedName("aa")
	@Export("zoom")
	public int zoom;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	@Export("Rasterizer3D_textureLoader")
	public TextureLoader Rasterizer3D_textureLoader;
	@ObfuscatedName("ak")
	@Export("clipMidX")
	int clipMidX;
	@ObfuscatedName("ar")
	@Export("clipMidY")
	int clipMidY;
	@ObfuscatedName("at")
	@Export("clipX")
	int clipX;
	@ObfuscatedName("ax")
	@Export("clipY")
	int clipY;
	@ObfuscatedName("aq")
	@Export("clipNegativeMidX")
	int clipNegativeMidX;
	@ObfuscatedName("ao")
	@Export("clipCenterX")
	int clipCenterX;
	@ObfuscatedName("az")
	@Export("clipNegativeMidY")
	int clipNegativeMidY;
	@ObfuscatedName("ad")
	int field2940;
	@ObfuscatedName("aw")
	@Export("Rasterizer3D_rowOffsets")
	int[] Rasterizer3D_rowOffsets;
	@ObfuscatedName("ae")
	int field2956;
	@ObfuscatedName("bj")
	int field2957;

	Clips() {
		this.field2943 = new ModelColorOverride();
		this.clipping = false;
		this.rasterGouraudLowRes = true;
		this.currentFaceAlpha = 0;
		this.zoom = 512;
		this.Rasterizer3D_rowOffsets = new int[1024];
		this.field2956 = -1;
		this.field2957 = -1;
	}

	@ObfuscatedName("al")
	@Export("setClipBounds")
	void setClipBounds() {
		this.clipMidX = this.clipX / 2;
		this.clipMidY = this.clipY / 2;
		this.clipNegativeMidX = -this.clipMidX;
		this.clipCenterX = this.clipX - this.clipMidX;
		this.clipNegativeMidY = -this.clipMidY;
		this.field2940 = this.clipY - this.clipMidY;
	}

	@ObfuscatedName("ab")
	@Export("setCustomClipBounds")
	void setCustomClipBounds(int var1, int var2, int var3, int var4) {
		this.clipMidX = var1 - var2;
		this.clipMidY = var3 - var4;
		this.clipNegativeMidX = -this.clipMidX;
		this.clipCenterX = this.clipX - this.clipMidX;
		this.clipNegativeMidY = -this.clipMidY;
		this.field2940 = this.clipY - this.clipMidY;
	}

	@ObfuscatedName("ac")
	@Export("setClipping")
	void setClipping(int var1, int var2, int var3) {
		this.clipping = var1 < 0 || var1 > this.clipX || var2 < 0 || var2 > this.clipX || var3 < 0 || var3 > this.clipX;
	}
}
