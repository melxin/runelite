import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iq")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("HitSplatDefinition_cached")
	public static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1274906953
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -705101241
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -332979161
	)
	public int field2309;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 252963427
	)
	int field2310;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1234102639
	)
	int field2304;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -110763737
	)
	int field2312;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1157763487
	)
	int field2313;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1382939459
	)
	public int field2314;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 191702075
	)
	public int field2321;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1970524731
	)
	public int field2316;
	@ObfuscatedName("af")
	String field2317;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 375984523
	)
	public int field2318;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1090496625
	)
	public int field2301;
	@ObfuscatedName("aa")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1798362831
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -1567049985
	)
	@Export("transformVarp")
	int transformVarp;

	static {
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(64);
		HitSplatDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
		HitSplatDefinition_cachedFonts = new EvictingDualNodeHashTable(20);
	}

	HitSplatDefinition() {
		this.fontId = -1;
		this.textColor = 16777215;
		this.field2309 = 70;
		this.field2310 = -1;
		this.field2304 = -1;
		this.field2312 = -1;
		this.field2313 = -1;
		this.field2314 = 0;
		this.field2321 = 0;
		this.field2316 = -1;
		this.field2317 = "";
		this.field2318 = -1;
		this.field2301 = 0;
		this.transformVarbit = -1;
		this.transformVarp = -1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lxa;I)V",
		garbageValue = "-1961180523"
	)
	@Export("decode")
	void decode(Buffer var1) {
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
		descriptor = "(Lxa;IB)V",
		garbageValue = "119"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.fontId = var1.readNullableLargeSmart();
		} else if (var2 == 2) {
			this.textColor = var1.readMedium();
		} else if (var2 == 3) {
			this.field2310 = var1.readNullableLargeSmart();
		} else if (var2 == 4) {
			this.field2312 = var1.readNullableLargeSmart();
		} else if (var2 == 5) {
			this.field2304 = var1.readNullableLargeSmart();
		} else if (var2 == 6) {
			this.field2313 = var1.readNullableLargeSmart();
		} else if (var2 == 7) {
			this.field2314 = var1.readShort();
		} else if (var2 == 8) {
			this.field2317 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) {
			this.field2309 = var1.readUnsignedShort();
		} else if (var2 == 10) {
			this.field2321 = var1.readShort();
		} else if (var2 == 11) {
			this.field2316 = 0;
		} else if (var2 == 12) {
			this.field2318 = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.field2301 = var1.readShort();
		} else if (var2 == 14) {
			this.field2316 = var1.readUnsignedShort();
		} else if (var2 == 17 || var2 == 18) {
			this.transformVarbit = var1.readUnsignedShort();
			if (this.transformVarbit == 65535) {
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort();
			if (this.transformVarp == 65535) {
				this.transformVarp = -1;
			}

			int var3 = -1;
			if (var2 == 18) {
				var3 = var1.readUnsignedShort();
				if (var3 == 65535) {
					var3 = -1;
				}
			}

			int var4 = var1.readUnsignedByte();
			this.transforms = new int[var4 + 2];

			for (int var5 = 0; var5 <= var4; ++var5) {
				this.transforms[var5] = var1.readUnsignedShort();
				if (this.transforms[var5] == 65535) {
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3;
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Liq;",
		garbageValue = "-345323327"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = WorldMapData_1.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class159.method4033(var2) : null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1113141895"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field2317;

		while (true) {
			int var3 = var2.indexOf("%1");
			if (var3 < 0) {
				return var2;
			}

			var2 = var2.substring(0, var3) + Tile.intToString(var1, false) + var2.substring(var3 + 2);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lxt;",
		garbageValue = "-1264574950"
	)
	public SpritePixels method4766() {
		if (this.field2310 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2310);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class387.SpriteBuffer_getSprite(class573.field5890, this.field2310, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2310);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lxt;",
		garbageValue = "1606238880"
	)
	public SpritePixels method4760() {
		if (this.field2304 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2304);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class387.SpriteBuffer_getSprite(class573.field5890, this.field2304, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2304);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lxt;",
		garbageValue = "-565447237"
	)
	public SpritePixels method4743() {
		if (this.field2312 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2312);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class387.SpriteBuffer_getSprite(class573.field5890, this.field2312, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2312);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Lxt;",
		garbageValue = "1935060474"
	)
	public SpritePixels method4744() {
		if (this.field2313 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2313);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class387.SpriteBuffer_getSprite(class573.field5890, this.field2313, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2313);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Lsu;",
		garbageValue = "-1980771566"
	)
	@Export("getFont")
	public Font getFont() {
		if (this.fontId == -1) {
			return null;
		} else {
			Font var1 = (Font)HitSplatDefinition_cachedFonts.get((long)this.fontId);
			if (var1 != null) {
				return var1;
			} else {
				AbstractArchive var3 = class573.field5890;
				AbstractArchive var4 = class228.HitSplatDefinition_fontsArchive;
				int var5 = this.fontId;
				Font var2;
				if (!FloorOverlayDefinition.method4919(var3, var5, 0)) {
					var2 = null;
				} else {
					var2 = class181.method4292(var4.takeFile(var5, 0));
				}

				if (var2 != null) {
					HitSplatDefinition_cachedFonts.put(var2, (long)this.fontId);
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lqm;III)Lxm;",
		garbageValue = "-1268219190"
	)
	static IndexedSprite method4769(AbstractArchive var0, int var1, int var2) {
		if (!FloorOverlayDefinition.method4919(var0, var1, var2)) {
			return null;
		} else {
			IndexedSprite var4 = new IndexedSprite();
			var4.width = class208.SpriteBuffer_spriteWidth;
			var4.height = class144.SpriteBuffer_spriteHeight;
			var4.xOffset = class615.SpriteBuffer_xOffsets[0];
			var4.yOffset = class615.SpriteBuffer_yOffsets[0];
			var4.subWidth = IntHashTable.SpriteBuffer_spriteWidths[0];
			var4.subHeight = class615.SpriteBuffer_spriteHeights[0] * 449044205;
			var4.palette = BufferedSource.SpriteBuffer_spritePalette;
			var4.pixels = class320.SpriteBuffer_pixels[0];
			class615.SpriteBuffer_xOffsets = null;
			class615.SpriteBuffer_yOffsets = null;
			IntHashTable.SpriteBuffer_spriteWidths = null;
			class615.SpriteBuffer_spriteHeights = null;
			BufferedSource.SpriteBuffer_spritePalette = null;
			class320.SpriteBuffer_pixels = null;
			return var4;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1402352388"
	)
	public static int method4740(int var0) {
		class146 var2 = (class146)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var0);
		class146 var1;
		if (var2 != null) {
			var1 = var2;
		} else {
			AbstractArchive var4 = WorldMapData_0.SequenceDefinition_skeletonsArchive;
			AbstractArchive var5 = WorldMapIcon_0.SpotAnimationDefinition_archive;
			boolean var6 = WorldMapSectionType.method6969(var4, var5, var0);
			class146 var3;
			if (!var6) {
				var3 = null;
			} else {
				if (class146.field1722 == null) {
					class146.field1720 = Runtime.getRuntime().availableProcessors();
					class146.field1722 = new ThreadPoolExecutor(0, class146.field1720, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(class146.field1720 * 100 + 100), new class177());
				}

				try {
					var3 = new class146(var4, var5, var0);
				} catch (Exception var8) {
					var3 = null;
				}
			}

			if (var3 != null) {
				SequenceDefinition.SequenceDefinition_cachedModel.put(var3, (long)var0);
			}

			var1 = var3;
		}

		if (var1 == null) {
			return 2;
		} else {
			return var1.method3905() ? 0 : 1;
		}
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(Lcf;I)V",
		garbageValue = "-1588353637"
	)
	static void method4773(class69 var0) {
		if (Client.field550 != var0) {
			Client.field550 = var0;
		}
	}

	@ObfuscatedName("pe")
	@ObfuscatedSignature(
		descriptor = "(Lxa;II)V",
		garbageValue = "936123719"
	)
	@Export("randomDatData2")
	static void randomDatData2(Buffer var0, int var1) {
		HttpQueryParams.method10854(var0.array, var1);
		class180.method4288(var0, var1);
	}
}
