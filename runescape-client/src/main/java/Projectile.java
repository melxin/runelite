import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("pi")
	@Export("xteaKeys")
	static int[][] xteaKeys;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1760636453
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 122389861
	)
	int field774;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -982957147
	)
	int field773;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -2046465727
	)
	int field775;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -442517587
	)
	int field777;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 3329409
	)
	int field794;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -89573569
	)
	int field778;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -638285973
	)
	int field779;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -979611933
	)
	int field780;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1072675713
	)
	int field781;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 599838015
	)
	int field782;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1528490365
	)
	int field783;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 780683861
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1715101287
	)
	int field785;
	@ObfuscatedName("ak")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("az")
	double field787;
	@ObfuscatedName("aw")
	double field788;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 2065503699
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 523619617
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("av")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("ao")
	@Export("x")
	double x;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1279225121
	)
	@Export("id")
	int id;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	SequenceDefinition field784;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 58643479
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1728656389
	)
	int field792;

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
		this.isMoving = false;
		this.frame = 0;
		this.field792 = 0;
		this.plane = var1;
		this.field774 = var2;
		this.field773 = var3;
		this.field775 = var4;
		this.field777 = var5;
		this.field794 = var6;
		this.field778 = var7;
		this.field779 = var8;
		this.field780 = var9;
		this.field781 = var10;
		this.id = var11;
		this.field782 = var12;
		this.field783 = var13;
		this.sourceX = var14;
		this.field785 = var15;
		int var16 = class386.SpotAnimationDefinition_get(this.id).sequence;
		if (var16 != -1) {
			this.field784 = VarpDefinition.SequenceDefinition_get(var16);
		} else {
			this.field784 = null;
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Ljm;",
		garbageValue = "27"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = class386.SpotAnimationDefinition_get(this.id);
		Model var2 = var1.getModel(this.frame);
		if (var2 == null) {
			return null;
		} else {
			var2.rotateZ(this.pitch);
			return var2;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-65"
	)
	void method1940(int var1, int var2) {
		this.field774 += var1;
		this.field773 += var2;
		this.field778 += var1;
		this.field779 += var2;
		this.speedX += (double)Coord.method7228(var1);
		this.field787 += (double)Coord.method7228(var2);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lcj;III)V",
		garbageValue = "38345978"
	)
	void method1951(WorldViewManager var1, int var2, int var3) {
		if (var2 >= this.field782) {
			class445 var4 = World.method1493(this.field781, this.field778, this.field779, this.field794, var1);
			int var5 = (int)var4.field4967;
			int var6 = (int)var4.field4969;
			int var7 = (int)var4.field4971 - this.field780;
			var4.method8687();
			double var12;
			double var14;
			double var16;
			if (!this.isMoving) {
				class445 var8 = World.method1493(this.field777, this.field774, this.field773, this.plane, var1);
				int var9 = (int)var8.field4967;
				int var10 = (int)var8.field4969;
				int var11 = (int)var8.field4971 - this.field775;
				var8.method8687();
				var12 = (double)(var5 - var9);
				var14 = (double)(var6 - var10);
				var16 = Math.sqrt(var14 * var14 + var12 * var12);
				this.speedX = Math.abs(var16) < 0.009999999776482582D ? (double)var9 : (double)var9 + (double)this.field785 * var12 / var16;
				this.field787 = Math.abs(var16) < 0.009999999776482582D ? (double)var10 : (double)var10 + var14 * (double)this.field785 / var16;
				this.field788 = (double)var11;
			}

			double var19 = (double)(this.field783 + 1 - var2);
			double var21 = ((double)var5 - this.speedX) / var19;
			var12 = ((double)var6 - this.field787) / var19;
			var14 = Math.sqrt(var12 * var12 + var21 * var21);
			if (!this.isMoving) {
				this.x = -var14 * Math.tan(0.02454369D * (double)this.sourceX);
			}

			var16 = 2.0D * ((double)var7 - this.field788 - this.x * var19) / (var19 * var19);
			this.isMoving = true;
			this.speedX += (double)var3 * var21;
			this.field787 += (double)var3 * var12;
			this.field788 += (double)var3 * this.x + 0.5D * var16 * (double)var3 * (double)var3;
			this.x += var16 * (double)var3;
			this.yaw = (int)(Math.atan2(var21, var12) * 325.949D) + 1024 & 2047;
			this.pitch = (int)(Math.atan2(this.x, var14) * 325.949D) & 2047;
			if (this.field784 != null) {
				if (!this.field784.isCachedModelIdSet()) {
					this.field792 += var3;

					while (true) {
						do {
							do {
								if (this.field792 <= this.field784.frameLengths[this.frame]) {
									return;
								}

								this.field792 -= this.field784.frameLengths[this.frame];
								++this.frame;
							} while(this.frame < this.field784.frameIds.length);

							this.frame -= this.field784.frameCount;
						} while(this.frame >= 0 && this.frame < this.field784.frameIds.length);

						this.frame = 0;
					}
				} else {
					this.frame += var3;
					int var18 = this.field784.getMayaAnimFrame();
					if (this.frame >= var18) {
						this.frame = var18 - this.field784.frameCount;
					}
				}
			}

		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lxi;"
	)
	@Export("newRunException")
	public static RunException newRunException(Throwable var0, String var1) {
		RunException var2;
		if (var0 instanceof RunException) {
			var2 = (RunException)var0;
			var2.message = var2.message + ' ' + var1;
		} else {
			var2 = new RunException(var0, var1);
		}

		return var2;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2112268692"
	)
	public static int method1944(int var0) {
		return var0 >>> 4 & class569.field5625;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "1517681272"
	)
	@Export("SpriteBuffer_decode")
	static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		var1.offset = var0.length - 2;
		SpriteBufferProperties.SpriteBuffer_spriteCount = var1.readUnsignedShort();
		SpriteBufferProperties.SpriteBuffer_xOffsets = new int[SpriteBufferProperties.SpriteBuffer_spriteCount];
		Varps.SpriteBuffer_yOffsets = new int[SpriteBufferProperties.SpriteBuffer_spriteCount];
		class379.SpriteBuffer_spriteWidths = new int[SpriteBufferProperties.SpriteBuffer_spriteCount];
		class171.SpriteBuffer_spriteHeights = new int[SpriteBufferProperties.SpriteBuffer_spriteCount];
		SpriteBufferProperties.SpriteBuffer_pixels = new byte[SpriteBufferProperties.SpriteBuffer_spriteCount][];
		var1.offset = var0.length - 7 - SpriteBufferProperties.SpriteBuffer_spriteCount * 8;
		SpriteBufferProperties.SpriteBuffer_spriteWidth = var1.readUnsignedShort();
		SpriteBufferProperties.SpriteBuffer_spriteHeight = var1.readUnsignedShort();
		int var2 = (var1.readUnsignedByte() & 255) + 1;

		int var3;
		for (var3 = 0; var3 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var3) {
			SpriteBufferProperties.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var3) {
			Varps.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var3) {
			class379.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var3) {
			class171.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - SpriteBufferProperties.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3;
		SpriteBufferProperties.SpriteBuffer_spritePalette = new int[var2];

		for (var3 = 1; var3 < var2; ++var3) {
			SpriteBufferProperties.SpriteBuffer_spritePalette[var3] = var1.readMedium();
			if (SpriteBufferProperties.SpriteBuffer_spritePalette[var3] == 0) {
				SpriteBufferProperties.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0;

		for (var3 = 0; var3 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var3) {
			int var4 = class379.SpriteBuffer_spriteWidths[var3];
			int var5 = class171.SpriteBuffer_spriteHeights[var3];
			int var6 = var4 * var5;
			byte[] var7 = new byte[var6];
			SpriteBufferProperties.SpriteBuffer_pixels[var3] = var7;
			int var8 = var1.readUnsignedByte();
			int var9;
			if (var8 == 0) {
				for (var9 = 0; var9 < var6; ++var9) {
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) {
				for (var9 = 0; var9 < var4; ++var9) {
					for (int var10 = 0; var10 < var5; ++var10) {
						var7[var9 + var4 * var10] = var1.readByte();
					}
				}
			}
		}

	}

	@ObfuscatedName("lo")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lkn;",
		garbageValue = "-34"
	)
	static RouteStrategy method1957(int var0, int var1) {
		Client.field533.approxDestinationX = var0;
		Client.field533.approxDestinationY = var1;
		Client.field533.approxDestinationSizeX = 1;
		Client.field533.approxDestinationSizeY = 1;
		return Client.field533;
	}
}
