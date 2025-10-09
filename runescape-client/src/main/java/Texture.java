import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("id")
@Implements("Texture")
public class Texture extends Node {
	@ObfuscatedName("ah")
	@Export("Texture_animatedPixels")
	static int[] Texture_animatedPixels;
	@ObfuscatedName("af")
	@Export("fileId")
	int fileId;
	@ObfuscatedName("ae")
	@Export("averageRGB")
	int averageRGB;
	@ObfuscatedName("aq")
	@Export("isLowDetail")
	boolean isLowDetail;
	@ObfuscatedName("ac")
	@Export("animationDirection")
	int animationDirection;
	@ObfuscatedName("aa")
	@Export("animationSpeed")
	int animationSpeed;
	@ObfuscatedName("ap")
	@Export("pixels")
	int[] pixels;
	@ObfuscatedName("ad")
	@Export("isLoaded")
	boolean isLoaded;

	@ObfuscatedSignature(
		descriptor = "(Lwj;)V"
	)
	Texture(Buffer var1) {
		this.isLoaded = false;
		this.fileId = var1.readUnsignedShort();
		this.averageRGB = var1.readUnsignedShort();
		this.isLowDetail = var1.readUnsignedByte() == 1;
		this.animationDirection = var1.readUnsignedByte();
		this.animationSpeed = var1.readUnsignedByte();
		this.pixels = null;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(DILpe;)Z"
	)
	@Export("load")
	boolean load(double var1, int var3, AbstractArchive var4) {
		if (var4.getFileFlat(this.fileId) == null) {
			return false;
		} else {
			int var5 = var3 * var3;
			this.pixels = new int[var5];
			IndexedSprite var6 = PacketBuffer.method11355(var4, this.fileId);
			var6.normalize();
			int[] var7 = var6.palette;

			for (int var8 = 0; var8 < var7.length; ++var8) {
				var7[var8] = Rasterizer3D.Rasterizer3D_brighten(var7[var8], var1);
			}

			byte[] var12 = var6.pixels;
			int var9;
			if (var3 == var6.subWidth) {
				for (var9 = 0; var9 < var5; ++var9) {
					this.pixels[var9] = var7[var12[var9] & 255];
				}
			} else {
				int var10;
				int var11;
				if (var6.subWidth == 64 && var3 == 128) {
					var9 = 0;

					for (var10 = 0; var10 < var3; ++var10) {
						for (var11 = 0; var11 < var3; ++var11) {
							this.pixels[var9++] = var7[var12[(var10 >> 1 << 6) + (var11 >> 1)] & 255];
						}
					}
				} else {
					if (var6.subWidth != 128 || var3 != 64) {
						throw new RuntimeException();
					}

					var9 = 0;

					for (var10 = 0; var10 < var3; ++var10) {
						for (var11 = 0; var11 < var3; ++var11) {
							this.pixels[var9++] = var7[var12[(var11 << 1) + (var10 << 1 << 7)] & 255];
						}
					}
				}
			}

			return true;
		}
	}

	@ObfuscatedName("at")
	@Export("reset")
	void reset() {
		this.pixels = null;
	}

	@ObfuscatedName("ag")
	@Export("animate")
	void animate(int var1) {
		if (this.pixels != null && this.animationDirection >= 1 && this.animationDirection <= 4) {
			if (Texture_animatedPixels == null || Texture_animatedPixels.length < this.pixels.length) {
				Texture_animatedPixels = new int[this.pixels.length];
			}

			short var2;
			if (this.pixels.length == 4096) {
				var2 = 64;
			} else {
				var2 = 128;
			}

			int var3 = this.pixels.length;
			int var4;
			int var5;
			int var6;
			int var7;
			if (this.animationDirection == 1 || this.animationDirection == 2) {
				var4 = var2 * this.animationSpeed * var1;
				var5 = var3 - 1;
				if (this.animationDirection == 1) {
					var4 = -var4;
				}

				for (var6 = 0; var6 < var3; ++var6) {
					var7 = var6 + var4 & var5;
					Texture_animatedPixels[var6] = this.pixels[var7];
				}
			}

			if (this.animationDirection == 3 || this.animationDirection == 4) {
				var4 = this.animationSpeed * var1;
				var5 = var2 - 1;
				if (this.animationDirection == 3) {
					var4 = -var4;
				}

				for (var6 = 0; var6 < var3; var6 += var2) {
					for (var7 = 0; var7 < var2; ++var7) {
						int var8 = var6 + var7;
						int var9 = var6 + (var7 + var4 & var5);
						Texture_animatedPixels[var8] = this.pixels[var9];
					}
				}
			}

			int[] var10 = this.pixels;
			this.pixels = Texture_animatedPixels;
			Texture_animatedPixels = var10;
		}
	}
}
