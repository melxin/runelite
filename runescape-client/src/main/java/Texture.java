import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ik")
@Implements("Texture")
public class Texture extends Node {
	@ObfuscatedName("ap")
	@Export("Texture_animatedPixels")
	static int[] Texture_animatedPixels;
	@ObfuscatedName("aq")
	@Export("animationSpeed")
	int animationSpeed;
	@ObfuscatedName("ao")
	@Export("averageRGB")
	int averageRGB;
	@ObfuscatedName("as")
	boolean field2583;
	@ObfuscatedName("al")
	@Export("animationDirection")
	int animationDirection;
	@ObfuscatedName("au")
	int field2585;
	@ObfuscatedName("ai")
	@Export("pixels")
	int[] pixels;
	@ObfuscatedName("aa")
	@Export("isLoaded")
	boolean isLoaded;

	@ObfuscatedSignature(
		descriptor = "(Lwb;)V"
	)
	Texture(Buffer var1) {
		this.isLoaded = false;
		if (class585.field5890 <= 232) {
			this.averageRGB = var1.readUnsignedShort();
			this.field2583 = var1.readUnsignedByte() == 1;
			var1.readUnsignedByte();
			this.animationSpeed = var1.readUnsignedShort();
			var1.readShortSmart();
			this.animationDirection = var1.readUnsignedByte();
			this.field2585 = var1.readUnsignedByte();
		} else {
			this.animationSpeed = var1.readUnsignedShort();
			this.averageRGB = var1.readUnsignedShort();
			this.field2583 = var1.readUnsignedByte() == 1;
			this.animationDirection = var1.readUnsignedByte();
			this.field2585 = var1.readUnsignedByte();
		}

		this.pixels = null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(DILpx;)Z"
	)
	@Export("load")
	boolean load(double var1, int var3, AbstractArchive var4) {
		if (var4.getFileFlat(this.animationSpeed) == null) {
			return false;
		} else {
			int var5 = var3 * var3;
			this.pixels = new int[var5];
			int var7 = this.animationSpeed;
			IndexedSprite var6;
			if (!class489.method9813(var4, var7)) {
				var6 = null;
			} else {
				var6 = class447.method8930();
			}

			var6.normalize();
			int[] var9 = var6.palette;

			for (int var10 = 0; var10 < var9.length; ++var10) {
				var9[var10] = Rasterizer3D.Rasterizer3D_brighten(var9[var10], var1);
			}

			byte[] var14 = var6.pixels;
			int var11;
			if (var3 == var6.subWidth) {
				for (var11 = 0; var11 < var5; ++var11) {
					this.pixels[var11] = var9[var14[var11] & 255];
				}
			} else {
				int var12;
				int var13;
				if (var6.subWidth == 64 && var3 == 128) {
					var11 = 0;

					for (var12 = 0; var12 < var3; ++var12) {
						for (var13 = 0; var13 < var3; ++var13) {
							this.pixels[var11++] = var9[var14[(var12 >> 1 << 6) + (var13 >> 1)] & 255];
						}
					}
				} else {
					if (var6.subWidth != 128 || var3 != 64) {
						throw new RuntimeException();
					}

					var11 = 0;

					for (var12 = 0; var12 < var3; ++var12) {
						for (var13 = 0; var13 < var3; ++var13) {
							this.pixels[var11++] = var9[var14[(var13 << 1) + (var12 << 1 << 7)] & 255];
						}
					}
				}
			}

			return true;
		}
	}

	@ObfuscatedName("aw")
	@Export("reset")
	void reset() {
		this.pixels = null;
	}

	@ObfuscatedName("at")
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
				var4 = var2 * this.field2585 * var1;
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
				var4 = this.field2585 * var1;
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
