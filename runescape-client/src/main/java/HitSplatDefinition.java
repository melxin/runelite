import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ke")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("HitSplatDefinition_archive")
	static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("HitSplatDefinition_cached")
	static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -49596865
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1681316769
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1697980341
	)
	public int field2863;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1765983653
	)
	int field2845;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1458812449
	)
	int field2852;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1905769001
	)
	int field2853;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1396063159
	)
	int field2847;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1555113173
	)
	public int field2854;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1509567721
	)
	public int field2856;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1103889193
	)
	public int field2857;
	@ObfuscatedName("ad")
	String field2850;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -937507905
	)
	public int field2859;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 213353057
	)
	public int field2860;
	@ObfuscatedName("at")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1753769775
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -1546721055
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
		this.field2863 = 70;
		this.field2845 = -1;
		this.field2852 = -1;
		this.field2853 = -1;
		this.field2847 = -1;
		this.field2854 = 0;
		this.field2856 = 0;
		this.field2857 = -1;
		this.field2850 = "";
		this.field2859 = -1;
		this.field2860 = 0;
		this.transformVarbit = -1;
		this.transformVarp = -1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lve;I)V",
		garbageValue = "-460574342"
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lve;IS)V",
		garbageValue = "276"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.fontId = var1.readNullableLargeSmart();
		} else if (var2 == 2) {
			this.textColor = var1.readMedium();
		} else if (var2 == 3) {
			this.field2845 = var1.readNullableLargeSmart();
		} else if (var2 == 4) {
			this.field2853 = var1.readNullableLargeSmart();
		} else if (var2 == 5) {
			this.field2852 = var1.readNullableLargeSmart();
		} else if (var2 == 6) {
			this.field2847 = var1.readNullableLargeSmart();
		} else if (var2 == 7) {
			this.field2854 = var1.readShort();
		} else if (var2 == 8) {
			this.field2850 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) {
			this.field2863 = var1.readUnsignedShort();
		} else if (var2 == 10) {
			this.field2856 = var1.readShort();
		} else if (var2 == 11) {
			this.field2857 = 0;
		} else if (var2 == 12) {
			this.field2859 = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.field2860 = var1.readShort();
		} else if (var2 == 14) {
			this.field2857 = var1.readUnsignedShort();
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Lke;",
		garbageValue = "-2100409930"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = class375.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class172.method3755(var2) : null;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-2065084938"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field2850;

		while (true) {
			int var3 = var2.indexOf("%1");
			if (var3 < 0) {
				return var2;
			}

			var2 = var2.substring(0, var3) + WorldView.intToString(var1, false) + var2.substring(var3 + 2);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Lwc;",
		garbageValue = "-1734547549"
	)
	public SpritePixels method5386() {
		if (this.field2845 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2845);
			if (var1 != null) {
				return var1;
			} else {
				var1 = GrandExchangeOfferNameComparator.SpriteBuffer_getSprite(UserComparator9.field1513, this.field2845, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2845);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Lwc;",
		garbageValue = "1116450932"
	)
	public SpritePixels method5399() {
		if (this.field2852 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2852);
			if (var1 != null) {
				return var1;
			} else {
				var1 = GrandExchangeOfferNameComparator.SpriteBuffer_getSprite(UserComparator9.field1513, this.field2852, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2852);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Lwc;",
		garbageValue = "-48"
	)
	public SpritePixels method5393() {
		if (this.field2853 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2853);
			if (var1 != null) {
				return var1;
			} else {
				var1 = GrandExchangeOfferNameComparator.SpriteBuffer_getSprite(UserComparator9.field1513, this.field2853, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2853);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Lwc;",
		garbageValue = "1001792226"
	)
	public SpritePixels method5406() {
		if (this.field2847 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2847);
			if (var1 != null) {
				return var1;
			} else {
				var1 = GrandExchangeOfferNameComparator.SpriteBuffer_getSprite(UserComparator9.field1513, this.field2847, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2847);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)Lrk;",
		garbageValue = "63"
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
				var1 = class255.method5320(UserComparator9.field1513, class30.HitSplatDefinition_fontsArchive, this.fontId, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedFonts.put(var1, (long)this.fontId);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	static void method5424() {
		if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
			class28.KeyHandler_keyCodes[186] = 57;
			class28.KeyHandler_keyCodes[187] = 27;
			class28.KeyHandler_keyCodes[188] = 71;
			class28.KeyHandler_keyCodes[189] = 26;
			class28.KeyHandler_keyCodes[190] = 72;
			class28.KeyHandler_keyCodes[191] = 73;
			class28.KeyHandler_keyCodes[192] = 58;
			class28.KeyHandler_keyCodes[219] = 42;
			class28.KeyHandler_keyCodes[220] = 74;
			class28.KeyHandler_keyCodes[221] = 43;
			class28.KeyHandler_keyCodes[222] = 59;
			class28.KeyHandler_keyCodes[223] = 28;
		} else {
			class28.KeyHandler_keyCodes[44] = 71;
			class28.KeyHandler_keyCodes[45] = 26;
			class28.KeyHandler_keyCodes[46] = 72;
			class28.KeyHandler_keyCodes[47] = 73;
			class28.KeyHandler_keyCodes[59] = 57;
			class28.KeyHandler_keyCodes[61] = 27;
			class28.KeyHandler_keyCodes[91] = 42;
			class28.KeyHandler_keyCodes[92] = 74;
			class28.KeyHandler_keyCodes[93] = 43;
			class28.KeyHandler_keyCodes[192] = 28;
			class28.KeyHandler_keyCodes[222] = 58;
			class28.KeyHandler_keyCodes[520] = 59;
		}

	}

	@ObfuscatedName("ao")
	public static final int method5422(double var0, double var2, double var4) {
		double var6 = var4;
		double var8 = var4;
		double var10 = var4;
		if (0.0D != var2) {
			double var12;
			if (var4 < 0.5D) {
				var12 = var4 * (1.0D + var2);
			} else {
				var12 = var2 + var4 - var2 * var4;
			}

			double var14 = var4 * 2.0D - var12;
			double var16 = var0 + 0.3333333333333333D;
			if (var16 > 1.0D) {
				--var16;
			}

			double var20 = var0 - 0.3333333333333333D;
			if (var20 < 0.0D) {
				++var20;
			}

			if (6.0D * var16 < 1.0D) {
				var6 = var14 + 6.0D * (var12 - var14) * var16;
			} else if (2.0D * var16 < 1.0D) {
				var6 = var12;
			} else if (var16 * 3.0D < 2.0D) {
				var6 = 6.0D * (0.6666666666666666D - var16) * (var12 - var14) + var14;
			} else {
				var6 = var14;
			}

			if (var0 * 6.0D < 1.0D) {
				var8 = var14 + var0 * 6.0D * (var12 - var14);
			} else if (var0 * 2.0D < 1.0D) {
				var8 = var12;
			} else if (var0 * 3.0D < 2.0D) {
				var8 = 6.0D * (0.6666666666666666D - var0) * (var12 - var14) + var14;
			} else {
				var8 = var14;
			}

			if (6.0D * var20 < 1.0D) {
				var10 = var14 + var20 * 6.0D * (var12 - var14);
			} else if (2.0D * var20 < 1.0D) {
				var10 = var12;
			} else if (3.0D * var20 < 2.0D) {
				var10 = (0.6666666666666666D - var20) * (var12 - var14) * 6.0D + var14;
			} else {
				var10 = var14;
			}
		}

		int var22 = (int)(var6 * 256.0D);
		int var13 = (int)(256.0D * var8);
		int var23 = (int)(var10 * 256.0D);
		int var15 = var23 + (var13 << 8) + (var22 << 16);
		return var15;
	}

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "87"
	)
	static void method5381() {
		UserComparator9.compass = null;
		class434.redHintArrowSprite = null;
		class377.mapSceneSprites = null;
		class521.headIconPkSprites = null;
		class241.headIconPrayerSprites = null;
		KeyHandler.headIconHintSprites = null;
		class59.mapDotSprites = null;
		class240.crossSprites = null;
		WorldMapSection1.field3325 = null;
		MenuAction.scrollBarSprites = null;
		StudioGame.field4210 = null;
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(Ldj;IIB)V",
		garbageValue = "56"
	)
	@Export("updateItemPile3")
	static final void updateItemPile3(WorldView var0, int var1, int var2) {
		class333.updateItemPile2(var0, var0.plane, var1, var2);
	}
}
