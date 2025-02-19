import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hp")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	@Export("HitSplatDefinition_archive")
	public static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	public static AbstractArchive field2188;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	public static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("HitSplatDefinition_cached")
	static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 877901703
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 92305081
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 900217875
	)
	public int field2205;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -393383495
	)
	int field2192;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -753669823
	)
	int field2191;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -761254351
	)
	int field2201;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -402792853
	)
	int field2198;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1432441873
	)
	public int field2203;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1918226999
	)
	public int field2204;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -256707213
	)
	public int field2200;
	@ObfuscatedName("aw")
	String field2206;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 2103924421
	)
	public int field2207;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1486457345
	)
	public int field2208;
	@ObfuscatedName("ap")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1069894927
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -525799669
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
		this.field2205 = 70;
		this.field2192 = -1;
		this.field2191 = -1;
		this.field2201 = -1;
		this.field2198 = -1;
		this.field2203 = 0;
		this.field2204 = 0;
		this.field2200 = -1;
		this.field2206 = "";
		this.field2207 = -1;
		this.field2208 = 0;
		this.transformVarbit = -1;
		this.transformVarp = -1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvy;B)V",
		garbageValue = "89"
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lvy;II)V",
		garbageValue = "1959678310"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.fontId = var1.readNullableLargeSmart();
		} else if (var2 == 2) {
			this.textColor = var1.readMedium();
		} else if (var2 == 3) {
			this.field2192 = var1.readNullableLargeSmart();
		} else if (var2 == 4) {
			this.field2201 = var1.readNullableLargeSmart();
		} else if (var2 == 5) {
			this.field2191 = var1.readNullableLargeSmart();
		} else if (var2 == 6) {
			this.field2198 = var1.readNullableLargeSmart();
		} else if (var2 == 7) {
			this.field2203 = var1.readShort();
		} else if (var2 == 8) {
			this.field2206 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) {
			this.field2205 = var1.readUnsignedShort();
		} else if (var2 == 10) {
			this.field2204 = var1.readShort();
		} else if (var2 == 11) {
			this.field2200 = 0;
		} else if (var2 == 12) {
			this.field2207 = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.field2208 = var1.readShort();
		} else if (var2 == 14) {
			this.field2200 = var1.readUnsignedShort();
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
		descriptor = "(I)Lhp;",
		garbageValue = "1801431257"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = class241.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? NpcOverrides.method3920(var2) : null;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "1"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field2206;

		while (true) {
			int var3 = var2.indexOf("%1");
			if (var3 < 0) {
				return var2;
			}

			var2 = var2.substring(0, var3) + class76.intToString(var1, false) + var2.substring(var3 + 2);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Lwg;",
		garbageValue = "1451375198"
	)
	public SpritePixels method4121() {
		if (this.field2192 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2192);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class145.SpriteBuffer_getSprite(field2188, this.field2192, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2192);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lwg;",
		garbageValue = "76162525"
	)
	public SpritePixels method4122() {
		if (this.field2191 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2191);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class145.SpriteBuffer_getSprite(field2188, this.field2191, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2191);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Lwg;",
		garbageValue = "1417537161"
	)
	public SpritePixels method4136() {
		if (this.field2201 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2201);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class145.SpriteBuffer_getSprite(field2188, this.field2201, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2201);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Lwg;",
		garbageValue = "-1021361138"
	)
	public SpritePixels method4123() {
		if (this.field2198 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2198);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class145.SpriteBuffer_getSprite(field2188, this.field2198, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2198);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Lrf;",
		garbageValue = "2110591456"
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
				AbstractArchive var3 = field2188;
				AbstractArchive var4 = HitSplatDefinition_fontsArchive;
				int var5 = this.fontId;
				byte[] var7 = var3.takeFile(var5, 0);
				boolean var6;
				if (var7 == null) {
					var6 = false;
				} else {
					class478.SpriteBuffer_decode(var7);
					var6 = true;
				}

				Font var2;
				if (!var6) {
					var2 = null;
				} else {
					byte[] var8 = var4.takeFile(var5, 0);
					Font var10;
					if (var8 == null) {
						var10 = null;
					} else {
						Font var9 = new Font(var8, Canvas.SpriteBuffer_xOffsets, class194.SpriteBuffer_yOffsets, SpriteBufferProperties.SpriteBuffer_spriteWidths, class456.SpriteBuffer_spriteHeights, DbTable.SpriteBuffer_spritePalette, SpriteBufferProperties.SpriteBuffer_pixels);
						CollisionMap.method5672();
						var10 = var9;
					}

					var2 = var10;
				}

				if (var2 != null) {
					HitSplatDefinition_cachedFonts.put(var2, (long)this.fontId);
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "571385613"
	)
	public static boolean method4135(int var0, int var1) {
		return (var0 >> var1 + 1 & 1) != 0;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(ILnq;ZB)V",
		garbageValue = "117"
	)
	static void method4149(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = LoginState.getWorldMap().getMapArea(var0);
		int var4 = class132.localPlayer.plane;
		int var5 = (class132.localPlayer.x >> 7) + class200.topLevelWorldView.baseX;
		int var6 = (class132.localPlayer.y >> 7) + class200.topLevelWorldView.baseY;
		Coord var7 = new Coord(var4, var5, var6);
		LoginState.getWorldMap().method9733(var3, var7, var1, var2);
	}
}
