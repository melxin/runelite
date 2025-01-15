import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kd")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	@Export("HitSplatDefinition_archive")
	static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	static AbstractArchive field2751;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("HitSplatDefinition_cached")
	public static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static Archive field2777;
	@ObfuscatedName("vc")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	static JagNetThread field2760;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1508234575
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1584396285
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1551936187
	)
	public int field2773;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1841557453
	)
	int field2758;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -425735521
	)
	int field2762;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 271682969
	)
	int field2763;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1963234727
	)
	int field2767;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1270620965
	)
	public int field2757;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1979431219
	)
	public int field2759;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 768545391
	)
	public int field2764;
	@ObfuscatedName("ar")
	String field2768;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -751369181
	)
	public int field2769;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 2052084467
	)
	public int field2770;
	@ObfuscatedName("ab")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -390406083
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 2112634023
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
		this.field2773 = 70;
		this.field2758 = -1;
		this.field2762 = -1;
		this.field2763 = -1;
		this.field2767 = -1;
		this.field2757 = 0;
		this.field2759 = 0;
		this.field2764 = -1;
		this.field2768 = "";
		this.field2769 = -1;
		this.field2770 = 0;
		this.transformVarbit = -1;
		this.transformVarp = -1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "-239192483"
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lvy;II)V",
		garbageValue = "2033650103"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.fontId = var1.readNullableLargeSmart();
		} else if (var2 == 2) {
			this.textColor = var1.readMedium();
		} else if (var2 == 3) {
			this.field2758 = var1.readNullableLargeSmart();
		} else if (var2 == 4) {
			this.field2763 = var1.readNullableLargeSmart();
		} else if (var2 == 5) {
			this.field2762 = var1.readNullableLargeSmart();
		} else if (var2 == 6) {
			this.field2767 = var1.readNullableLargeSmart();
		} else if (var2 == 7) {
			this.field2757 = var1.readShort();
		} else if (var2 == 8) {
			this.field2768 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) {
			this.field2773 = var1.readUnsignedShort();
		} else if (var2 == 10) {
			this.field2759 = var1.readShort();
		} else if (var2 == 11) {
			this.field2764 = 0;
		} else if (var2 == 12) {
			this.field2769 = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.field2770 = var1.readShort();
		} else if (var2 == 14) {
			this.field2764 = var1.readUnsignedShort();
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Lkd;",
		garbageValue = "1483625755"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = class77.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? IntProjection.method4104(var2) : null;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "-1"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field2768;

		while (true) {
			int var3 = var2.indexOf("%1");
			if (var3 < 0) {
				return var2;
			}

			var2 = var2.substring(0, var3) + PlayerType.intToString(var1, false) + var2.substring(var3 + 2);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lvf;",
		garbageValue = "-1228108972"
	)
	public SpritePixels method5475() {
		if (this.field2758 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2758);
			if (var1 != null) {
				return var1;
			} else {
				var1 = ChatChannel.SpriteBuffer_getSprite(field2751, this.field2758, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2758);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Lvf;",
		garbageValue = "1188272615"
	)
	public SpritePixels method5496() {
		if (this.field2762 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2762);
			if (var1 != null) {
				return var1;
			} else {
				var1 = ChatChannel.SpriteBuffer_getSprite(field2751, this.field2762, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2762);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Lvf;",
		garbageValue = "1647383178"
	)
	public SpritePixels method5490() {
		if (this.field2763 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2763);
			if (var1 != null) {
				return var1;
			} else {
				var1 = ChatChannel.SpriteBuffer_getSprite(field2751, this.field2763, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2763);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Lvf;",
		garbageValue = "1310089348"
	)
	public SpritePixels method5481() {
		if (this.field2767 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2767);
			if (var1 != null) {
				return var1;
			} else {
				var1 = ChatChannel.SpriteBuffer_getSprite(field2751, this.field2767, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2767);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Lqw;",
		garbageValue = "-1075044673"
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
				AbstractArchive var3 = field2751;
				AbstractArchive var4 = HitSplatDefinition_fontsArchive;
				int var5 = this.fontId;
				Font var2;
				if (!WorldMapSprite.method6397(var3, var5, 0)) {
					var2 = null;
				} else {
					byte[] var7 = var4.takeFile(var5, 0);
					Font var6;
					if (var7 == null) {
						var6 = null;
					} else {
						Font var8 = new Font(var7, class241.SpriteBuffer_xOffsets, SpriteBufferProperties.SpriteBuffer_yOffsets, SpriteBufferProperties.SpriteBuffer_spriteWidths, class403.SpriteBuffer_spriteHeights, KeyHandler.SpriteBuffer_spritePalette, class240.SpriteBuffer_pixels);
						class241.SpriteBuffer_xOffsets = null;
						SpriteBufferProperties.SpriteBuffer_yOffsets = null;
						SpriteBufferProperties.SpriteBuffer_spriteWidths = null;
						class403.SpriteBuffer_spriteHeights = null;
						KeyHandler.SpriteBuffer_spritePalette = null;
						class240.SpriteBuffer_pixels = null;
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
