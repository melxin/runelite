import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("he")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("HitSplatDefinition_archive")
	static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	static AbstractArchive field2128;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("HitSplatDefinition_cached")
	public static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -2051623949
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1275482153
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1270951739
	)
	public int field2139;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -439002367
	)
	int field2140;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1785915537
	)
	int field2141;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1689004129
	)
	int field2142;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1911899409
	)
	int field2129;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 544838825
	)
	public int field2143;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1855391871
	)
	public int field2145;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1407096559
	)
	public int field2146;
	@ObfuscatedName("ax")
	String field2147;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -833360033
	)
	public int field2137;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 970814879
	)
	public int field2149;
	@ObfuscatedName("am")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 2021033131
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 11650239
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
		this.field2139 = 70;
		this.field2140 = -1;
		this.field2141 = -1;
		this.field2142 = -1;
		this.field2129 = -1;
		this.field2143 = 0;
		this.field2145 = 0;
		this.field2146 = -1;
		this.field2147 = "";
		this.field2137 = -1;
		this.field2149 = 0;
		this.transformVarbit = -1;
		this.transformVarp = -1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lvj;I)V",
		garbageValue = "567176223"
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lvj;IB)V",
		garbageValue = "-69"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.fontId = var1.readNullableLargeSmart();
		} else if (var2 == 2) {
			this.textColor = var1.readMedium();
		} else if (var2 == 3) {
			this.field2140 = var1.readNullableLargeSmart();
		} else if (var2 == 4) {
			this.field2142 = var1.readNullableLargeSmart();
		} else if (var2 == 5) {
			this.field2141 = var1.readNullableLargeSmart();
		} else if (var2 == 6) {
			this.field2129 = var1.readNullableLargeSmart();
		} else if (var2 == 7) {
			this.field2143 = var1.readShort();
		} else if (var2 == 8) {
			this.field2147 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) {
			this.field2139 = var1.readUnsignedShort();
		} else if (var2 == 10) {
			this.field2145 = var1.readShort();
		} else if (var2 == 11) {
			this.field2146 = 0;
		} else if (var2 == 12) {
			this.field2137 = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.field2149 = var1.readShort();
		} else if (var2 == 14) {
			this.field2146 = var1.readUnsignedShort();
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lhe;",
		garbageValue = "-415583943"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = Frames.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? ObjectSound.method1997(var2) : null;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-906997903"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field2147;

		while (true) {
			int var3 = var2.indexOf("%1");
			if (var3 < 0) {
				return var2;
			}

			var2 = var2.substring(0, var3) + class31.intToString(var1, false) + var2.substring(var3 + 2);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Lvr;",
		garbageValue = "-34"
	)
	public SpritePixels method4075() {
		if (this.field2140 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2140);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class53.SpriteBuffer_getSprite(field2128, this.field2140, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2140);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Lvr;",
		garbageValue = "31"
	)
	public SpritePixels method4090() {
		if (this.field2141 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2141);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class53.SpriteBuffer_getSprite(field2128, this.field2141, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2141);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Lvr;",
		garbageValue = "-111"
	)
	public SpritePixels method4077() {
		if (this.field2142 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2142);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class53.SpriteBuffer_getSprite(field2128, this.field2142, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2142);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Lvr;",
		garbageValue = "-1373584782"
	)
	public SpritePixels method4078() {
		if (this.field2129 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2129);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class53.SpriteBuffer_getSprite(field2128, this.field2129, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2129);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Lqu;",
		garbageValue = "90342308"
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
				var1 = class166.method3637(field2128, HitSplatDefinition_fontsArchive, this.fontId, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedFonts.put(var1, (long)this.fontId);
				}

				return var1;
			}
		}
	}
}
