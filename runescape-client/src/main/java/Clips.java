import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kb")
@Implements("Clips")
public class Clips {
	@ObfuscatedName("ab")
	@Export("clipping")
	boolean clipping;
	@ObfuscatedName("ay")
	@Export("rasterGouraudLowRes")
	public boolean rasterGouraudLowRes;
	@ObfuscatedName("au")
	@Export("currentFaceAlpha")
	int currentFaceAlpha;
	@ObfuscatedName("ac")
	@Export("zoom")
	public int zoom;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	@Export("Rasterizer3D_textureLoader")
	public TextureLoader Rasterizer3D_textureLoader;
	@ObfuscatedName("ai")
	@Export("clipMidX")
	int clipMidX;
	@ObfuscatedName("ak")
	@Export("clipMidY")
	int clipMidY;
	@ObfuscatedName("aj")
	@Export("clipX")
	int clipX;
	@ObfuscatedName("av")
	@Export("clipY")
	int clipY;
	@ObfuscatedName("ar")
	@Export("clipNegativeMidX")
	int clipNegativeMidX;
	@ObfuscatedName("ag")
	@Export("clipCenterX")
	int clipCenterX;
	@ObfuscatedName("az")
	@Export("clipNegativeMidY")
	int clipNegativeMidY;
	@ObfuscatedName("am")
	int field2998;
	@ObfuscatedName("aq")
	@Export("Rasterizer3D_rowOffsets")
	int[] Rasterizer3D_rowOffsets;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	final class258 field3000;

	Clips() {
		this.clipping = false;
		this.rasterGouraudLowRes = true;
		this.currentFaceAlpha = 0;
		this.zoom = 512;
		this.Rasterizer3D_rowOffsets = new int[1024];
		this.field3000 = new class258();
	}

	@ObfuscatedName("ab")
	@Export("setClipBounds")
	void setClipBounds() {
		this.clipMidX = this.clipX / 2;
		this.clipMidY = this.clipY / 2;
		this.clipNegativeMidX = -this.clipMidX;
		this.clipCenterX = this.clipX - this.clipMidX;
		this.clipNegativeMidY = -this.clipMidY;
		this.field2998 = this.clipY - this.clipMidY;
	}

	@ObfuscatedName("ay")
	@Export("setCustomClipBounds")
	void setCustomClipBounds(int var1, int var2, int var3, int var4) {
		this.clipMidX = var1 - var2;
		this.clipMidY = var3 - var4;
		this.clipNegativeMidX = -this.clipMidX;
		this.clipCenterX = this.clipX - this.clipMidX;
		this.clipNegativeMidY = -this.clipMidY;
		this.field2998 = this.clipY - this.clipMidY;
	}

	@ObfuscatedName("au")
	@Export("setClipping")
	void setClipping(int var1, int var2, int var3) {
		this.clipping = var1 < 0 || var1 > this.clipX || var2 < 0 || var2 > this.clipX || var3 < 0 || var3 > this.clipX;
	}
}
