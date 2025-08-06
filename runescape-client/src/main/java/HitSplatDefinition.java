import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ir")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("HitSplatDefinition_archive")
	public static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	public static AbstractArchive field2246;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("HitSplatDefinition_cached")
	static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1420274017
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1388945807
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 2026872123
	)
	public int field2238;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -997822585
	)
	int field2239;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 742486087
	)
	int field2233;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1465952591
	)
	int field2241;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -220906663
	)
	int field2248;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -547269459
	)
	public int field2243;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1951639355
	)
	public int field2232;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 762002309
	)
	public int field2245;
	@ObfuscatedName("ad")
	String field2228;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1708560305
	)
	public int field2247;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 995913331
	)
	public int field2242;
	@ObfuscatedName("an")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1375390833
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -2029727403
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
		this.field2238 = 70;
		this.field2239 = -1;
		this.field2233 = -1;
		this.field2241 = -1;
		this.field2248 = -1;
		this.field2243 = 0;
		this.field2232 = 0;
		this.field2245 = -1;
		this.field2228 = "";
		this.field2247 = -1;
		this.field2242 = 0;
		this.transformVarbit = -1;
		this.transformVarp = -1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "-814062581"
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lwj;II)V",
		garbageValue = "70080123"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.fontId = var1.readNullableLargeSmart();
		} else if (var2 == 2) {
			this.textColor = var1.readMedium();
		} else if (var2 == 3) {
			this.field2239 = var1.readNullableLargeSmart();
		} else if (var2 == 4) {
			this.field2241 = var1.readNullableLargeSmart();
		} else if (var2 == 5) {
			this.field2233 = var1.readNullableLargeSmart();
		} else if (var2 == 6) {
			this.field2248 = var1.readNullableLargeSmart();
		} else if (var2 == 7) {
			this.field2243 = var1.readShort();
		} else if (var2 == 8) {
			this.field2228 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) {
			this.field2238 = var1.readUnsignedShort();
		} else if (var2 == 10) {
			this.field2232 = var1.readShort();
		} else if (var2 == 11) {
			this.field2245 = 0;
		} else if (var2 == 12) {
			this.field2247 = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.field2242 = var1.readShort();
		} else if (var2 == 14) {
			this.field2245 = var1.readUnsignedShort();
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(S)Lir;",
		garbageValue = "21809"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = SequenceDefinition.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? BuddyRankComparator.method3550(var2) : null;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "60969117"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field2228;

		while (true) {
			int var3 = var2.indexOf("%1");
			if (var3 < 0) {
				return var2;
			}

			var2 = var2.substring(0, var3) + class393.intToString(var1, false) + var2.substring(var3 + 2);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lxv;",
		garbageValue = "-624103842"
	)
	public SpritePixels method4524() {
		if (this.field2239 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2239);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class407.SpriteBuffer_getSprite(field2246, this.field2239, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2239);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Lxv;",
		garbageValue = "-10"
	)
	public SpritePixels method4545() {
		if (this.field2233 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2233);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class407.SpriteBuffer_getSprite(field2246, this.field2233, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2233);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(S)Lxv;",
		garbageValue = "128"
	)
	public SpritePixels method4526() {
		if (this.field2241 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2241);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class407.SpriteBuffer_getSprite(field2246, this.field2241, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2241);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Lxv;",
		garbageValue = "1507843100"
	)
	public SpritePixels method4527() {
		if (this.field2248 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2248);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class407.SpriteBuffer_getSprite(field2246, this.field2248, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2248);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lru;",
		garbageValue = "973937617"
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
				var1 = WorldMapScaleHandler.method6924(field2246, HttpResponse.HitSplatDefinition_fontsArchive, this.fontId, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedFonts.put(var1, (long)this.fontId);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1237418485"
	)
	@Export("isCharPrintable")
	public static boolean isCharPrintable(char var0) {
		if (var0 >= ' ' && var0 <= '~') {
			return true;
		} else if (var0 >= 160 && var0 <= 255) {
			return true;
		} else {
			return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376;
		}
	}
}
