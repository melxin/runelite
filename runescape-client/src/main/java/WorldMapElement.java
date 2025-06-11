import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hm")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("HitSplatDefinition_cached")
	public static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("WorldMapElement_archive")
	public static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Lhm;"
	)
	@Export("WorldMapElement_cached")
	public static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("lr")
	@ObfuscatedGetter(
		intValue = 1725421633
	)
	static int field1941;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1215653805
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -212662327
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1034414593
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("ah")
	@Export("name")
	public String name;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1537906121
	)
	public int field1934;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 568360745
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("ar")
	public boolean field1918;
	@ObfuscatedName("ad")
	public boolean field1940;
	@ObfuscatedName("af")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("ak")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("az")
	int[] field1931;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1638886259
	)
	int field1932;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1700837237
	)
	int field1933;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1435476333
	)
	int field1925;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1156012941
	)
	int field1935;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lhr;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("ax")
	int[] field1938;
	@ObfuscatedName("ab")
	byte[] field1939;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1829003601
	)
	@Export("category")
	public int category;

	static {
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(256);
	}

	public WorldMapElement(int var1) {
		this.sprite1 = -1;
		this.sprite2 = -1;
		this.textSize = 0;
		this.field1918 = true;
		this.field1940 = false;
		this.menuActions = new String[5];
		this.field1932 = Integer.MAX_VALUE;
		this.field1933 = Integer.MAX_VALUE;
		this.field1925 = Integer.MIN_VALUE;
		this.field1935 = Integer.MIN_VALUE;
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered;
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
		this.category = -1;
		this.objectId = var1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)V",
		garbageValue = "2003340279"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lwt;IB)V",
		garbageValue = "-80"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.sprite1 = var1.method10873();
		} else if (var2 == 2) {
			this.sprite2 = var1.method10873();
		} else if (var2 == 3) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) {
			this.field1934 = var1.readMedium();
		} else if (var2 == 5) {
			var1.readMedium();
		} else if (var2 == 6) {
			this.textSize = var1.readUnsignedByte();
		} else {
			int var6;
			if (var2 == 7) {
				var6 = var1.readUnsignedByte();
				if ((var6 & 1) == 0) {
					this.field1918 = false;
				}

				if ((var6 & 2) == 2) {
					this.field1940 = true;
				}
			} else if (var2 == 8) {
				var1.readUnsignedByte();
			} else if (var2 >= 10 && var2 <= 14) {
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) {
				var6 = var1.readUnsignedByte();
				this.field1931 = new int[var6 * 2];

				int var4;
				for (var4 = 0; var4 < var6 * 2; ++var4) {
					this.field1931[var4] = var1.readShort();
				}

				var1.readInt();
				var4 = var1.readUnsignedByte();
				this.field1938 = new int[var4];

				int var5;
				for (var5 = 0; var5 < this.field1938.length; ++var5) {
					this.field1938[var5] = var1.readInt();
				}

				this.field1939 = new byte[var6];

				for (var5 = 0; var5 < var6; ++var5) {
					this.field1939[var5] = var1.readByte();
				}
			} else if (var2 != 16) {
				if (var2 == 17) {
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) {
					var1.method10873();
				} else if (var2 == 19) {
					this.category = var1.readUnsignedShort();
				} else if (var2 == 21) {
					var1.readInt();
				} else if (var2 == 22) {
					var1.readInt();
				} else if (var2 == 23) {
					var1.readUnsignedByte();
					var1.readUnsignedByte();
					var1.readUnsignedByte();
				} else if (var2 == 24) {
					var1.readShort();
					var1.readShort();
				} else if (var2 == 25) {
					var1.method10873();
				} else if (var2 == 28) {
					var1.readUnsignedByte();
				} else if (var2 == 29) {
					this.horizontalAlignment = (HorizontalAlignment)class175.findEnumerated(class179.method3972(), var1.readUnsignedByte());
				} else if (var2 == 30) {
					VerticalAlignment[] var3 = new VerticalAlignment[]{VerticalAlignment.field2080, VerticalAlignment.field2082, VerticalAlignment.VerticalAlignment_centered};
					this.verticalAlignment = (VerticalAlignment)class175.findEnumerated(var3, var1.readUnsignedByte());
				}
			}
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-938258718"
	)
	public void method4018() {
		if (this.field1931 != null) {
			for (int var1 = 0; var1 < this.field1931.length; var1 += 2) {
				if (this.field1931[var1] < this.field1932) {
					this.field1932 = this.field1931[var1];
				} else if (this.field1931[var1] > this.field1925) {
					this.field1925 = this.field1931[var1];
				}

				if (this.field1931[var1 + 1] < this.field1933) {
					this.field1933 = this.field1931[var1 + 1];
				} else if (this.field1931[var1 + 1] > this.field1935) {
					this.field1935 = this.field1931[var1 + 1];
				}
			}
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lwd;",
		garbageValue = "-65145515"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1;
		return this.getSprite(var2);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)Lwd;",
		garbageValue = "88"
	)
	@Export("getSprite")
	SpritePixels getSprite(int var1) {
		if (var1 < 0) {
			return null;
		} else {
			SpritePixels var2 = (SpritePixels)HitSplatDefinition_cached.get((long)var1);
			if (var2 != null) {
				return var2;
			} else {
				var2 = IntHashTable.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0);
				if (var2 != null) {
					HitSplatDefinition_cached.put(var2, (long)var1);
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-13"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)J",
		garbageValue = "1831596672"
	)
	static long method4020(CharSequence var0) {
		long var1 = 0L;
		int var3 = var0.length();

		for (int var4 = 0; var4 < var3; ++var4) {
			var1 *= 37L;
			char var5 = var0.charAt(var4);
			if (var5 >= 'A' && var5 <= 'Z') {
				var1 += (long)(var5 + 1 - 65);
			} else if (var5 >= 'a' && var5 <= 'z') {
				var1 += (long)(var5 + 1 - 97);
			} else if (var5 >= '0' && var5 <= '9') {
				var1 += (long)(var5 + 27 - 48);
			}

			if (var1 >= 177917621779460413L) {
				break;
			}
		}

		while (0L == var1 % 37L && var1 != 0L) {
			var1 /= 37L;
		}

		return var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-57"
	)
	static int method4019(int var0, int var1) {
		FloorOverlayDefinition var2 = class389.method7962(var0);
		if (var2 == null) {
			return var1;
		} else {
			int var4;
			int var5;
			int var6;
			int var7;
			int var8;
			if (var2.secondaryRgb >= 0) {
				var4 = var2.secondaryHue;
				var5 = var2.secondarySaturation;
				var6 = var2.secondaryLightness;
				if (var6 > 179) {
					var5 /= 2;
				}

				if (var6 > 192) {
					var5 /= 2;
				}

				if (var6 > 217) {
					var5 /= 2;
				}

				if (var6 > 243) {
					var5 /= 2;
				}

				var7 = (var5 / 32 << 7) + var6 / 2 + (var4 / 4 << 10);
				var8 = class136.method3534(var7, 96);
				return Rasterizer3D.Rasterizer3D_colorPalette[var8] | -16777216;
			} else if (var2.texture >= 0) {
				int var3 = class136.method3534(Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture), 96);
				return Rasterizer3D.Rasterizer3D_colorPalette[var3] | -16777216;
			} else if (var2.primaryRgb == 16711935) {
				return var1;
			} else {
				var4 = var2.hue;
				var5 = var2.saturation;
				var6 = var2.lightness;
				if (var6 > 179) {
					var5 /= 2;
				}

				if (var6 > 192) {
					var5 /= 2;
				}

				if (var6 > 217) {
					var5 /= 2;
				}

				if (var6 > 243) {
					var5 /= 2;
				}

				var7 = (var5 / 32 << 7) + var6 / 2 + (var4 / 4 << 10);
				var8 = class136.method3534(var7, 96);
				return Rasterizer3D.Rasterizer3D_colorPalette[var8] | -16777216;
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "101"
	)
	static final boolean method4004(char var0) {
		if (Character.isISOControl(var0)) {
			return false;
		} else if (SoundCache.isAlphaNumeric(var0)) {
			return true;
		} else {
			char[] var1 = class552.field5564;

			int var2;
			char var3;
			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}

			var1 = class552.field5561;

			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}

			return false;
		}
	}

	@ObfuscatedName("nf")
	@ObfuscatedSignature(
		descriptor = "(IIIILwd;Lnr;I)V",
		garbageValue = "-681344111"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2;
		if (var6 > 4225 && var6 < 90000) {
			int var7 = Client.camAngleY & 2047;
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7];
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7];
			int var10 = var9 * var2 + var3 * var8 >> 16;
			int var11 = var3 * var9 - var8 * var2 >> 16;
			double var12 = Math.atan2((double)var10, (double)var11);
			int var14 = var5.width / 2 - 25;
			int var15 = (int)(Math.sin(var12) * (double)var14);
			int var16 = (int)(Math.cos(var12) * (double)var14);
			byte var17 = 20;
			AsyncRestClient.redHintArrowSprite.method11340(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
		} else {
			class381.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5);
		}

	}
}
