import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	public static AbstractArchive field2287;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("HitSplatDefinition_cached")
	public static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -2075450699
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 256683899
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1460626681
	)
	public int field2289;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1651468983
	)
	int field2283;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1418220271
	)
	int field2291;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -905144213
	)
	int field2299;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -111835173
	)
	int field2293;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -436954871
	)
	public int field2294;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 136591669
	)
	public int field2295;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 502684291
	)
	public int field2292;
	@ObfuscatedName("ab")
	String field2280;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -872611611
	)
	public int field2298;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1561837897
	)
	public int field2297;
	@ObfuscatedName("aj")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -213573149
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 929416189
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
		this.field2289 = 70;
		this.field2283 = -1;
		this.field2291 = -1;
		this.field2299 = -1;
		this.field2293 = -1;
		this.field2294 = 0;
		this.field2295 = 0;
		this.field2292 = -1;
		this.field2280 = "";
		this.field2298 = -1;
		this.field2297 = 0;
		this.transformVarbit = -1;
		this.transformVarp = -1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lwb;B)V",
		garbageValue = "8"
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lwb;IB)V",
		garbageValue = "-20"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.fontId = var1.readVarInt();
		} else if (var2 == 2) {
			this.textColor = var1.readMedium();
		} else if (var2 == 3) {
			this.field2283 = var1.readVarInt();
		} else if (var2 == 4) {
			this.field2299 = var1.readVarInt();
		} else if (var2 == 5) {
			this.field2291 = var1.readVarInt();
		} else if (var2 == 6) {
			this.field2293 = var1.readVarInt();
		} else if (var2 == 7) {
			this.field2294 = var1.readShort();
		} else if (var2 == 8) {
			this.field2280 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) {
			this.field2289 = var1.readUnsignedShort();
		} else if (var2 == 10) {
			this.field2295 = var1.readShort();
		} else if (var2 == 11) {
			this.field2292 = 0;
		} else if (var2 == 12) {
			this.field2298 = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.field2297 = var1.readShort();
		} else if (var2 == 14) {
			this.field2292 = var1.readUnsignedShort();
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Lia;",
		garbageValue = "-1126964426"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = class281.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? MusicPatchNode2.method7103(var2) : null;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "41"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field2280;

		while (true) {
			int var3 = var2.indexOf("%1");
			if (var3 < 0) {
				return var2;
			}

			var2 = var2.substring(0, var3) + WallDecoration.intToString(var1, false) + var2.substring(var3 + 2);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Lxt;",
		garbageValue = "386355205"
	)
	public SpritePixels method4573() {
		if (this.field2283 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2283);
			if (var1 != null) {
				return var1;
			} else {
				var1 = SoundCache.SpriteBuffer_getSprite(field2287, this.field2283, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2283);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lxt;",
		garbageValue = "2129741770"
	)
	public SpritePixels method4574() {
		if (this.field2291 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2291);
			if (var1 != null) {
				return var1;
			} else {
				var1 = SoundCache.SpriteBuffer_getSprite(field2287, this.field2291, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2291);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Lxt;",
		garbageValue = "-85"
	)
	public SpritePixels method4575() {
		if (this.field2299 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2299);
			if (var1 != null) {
				return var1;
			} else {
				var1 = SoundCache.SpriteBuffer_getSprite(field2287, this.field2299, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2299);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lxt;",
		garbageValue = "1771498025"
	)
	public SpritePixels method4576() {
		if (this.field2293 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2293);
			if (var1 != null) {
				return var1;
			} else {
				var1 = SoundCache.SpriteBuffer_getSprite(field2287, this.field2293, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2293);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Lrv;",
		garbageValue = "1"
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
				AbstractArchive var3 = field2287;
				AbstractArchive var4 = Varcs.HitSplatDefinition_fontsArchive;
				int var5 = this.fontId;
				Font var2;
				if (!class587.method11132(var3, var5, 0)) {
					var2 = null;
				} else {
					byte[] var7 = var4.takeFile(var5, 0);
					Font var6;
					if (var7 == null) {
						var6 = null;
					} else {
						Font var8 = new Font(var7, LoginPacket.SpriteBuffer_xOffsets, class191.SpriteBuffer_yOffsets, class255.SpriteBuffer_spriteWidths, FriendLoginUpdate.field5390, TriBool.SpriteBuffer_spritePalette, SpriteBufferProperties.SpriteBuffer_pixels);
						class388.method8205();
						var6 = var8;
					}

					var2 = var6;
				}

				if (var2 != null) {
					HitSplatDefinition_cachedFonts.put(var2, (long)this.fontId);
				}

				return var2;
			}
		}
	}
}
