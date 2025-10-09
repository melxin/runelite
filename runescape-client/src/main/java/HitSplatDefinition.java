import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iv")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	static AbstractArchive field2272;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("HitSplatDefinition_cached")
	public static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1247032973
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 625769541
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 296421963
	)
	public int field2278;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 142279539
	)
	int field2279;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -245705629
	)
	int field2280;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1860698257
	)
	int field2270;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1222531073
	)
	int field2282;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1789551067
	)
	public int field2283;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1691517913
	)
	public int field2284;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1987070083
	)
	public int field2285;
	@ObfuscatedName("aw")
	String field2277;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1811912317
	)
	public int field2287;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1041168601
	)
	public int field2281;
	@ObfuscatedName("al")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -79242759
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -2090206511
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
		this.field2278 = 70;
		this.field2279 = -1;
		this.field2280 = -1;
		this.field2270 = -1;
		this.field2282 = -1;
		this.field2283 = 0;
		this.field2284 = 0;
		this.field2285 = -1;
		this.field2277 = "";
		this.field2287 = -1;
		this.field2281 = 0;
		this.transformVarbit = -1;
		this.transformVarp = -1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "-958132005"
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lwj;II)V",
		garbageValue = "2078142595"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.fontId = var1.readNullableLargeSmart();
		} else if (var2 == 2) {
			this.textColor = var1.readMedium();
		} else if (var2 == 3) {
			this.field2279 = var1.readNullableLargeSmart();
		} else if (var2 == 4) {
			this.field2270 = var1.readNullableLargeSmart();
		} else if (var2 == 5) {
			this.field2280 = var1.readNullableLargeSmart();
		} else if (var2 == 6) {
			this.field2282 = var1.readNullableLargeSmart();
		} else if (var2 == 7) {
			this.field2283 = var1.readShort();
		} else if (var2 == 8) {
			this.field2277 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) {
			this.field2278 = var1.readUnsignedShort();
		} else if (var2 == 10) {
			this.field2284 = var1.readShort();
		} else if (var2 == 11) {
			this.field2285 = 0;
		} else if (var2 == 12) {
			this.field2287 = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.field2281 = var1.readShort();
		} else if (var2 == 14) {
			this.field2285 = var1.readUnsignedShort();
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Liv;",
		garbageValue = "1943550004"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = MenuAction.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class324.method7034(var2) : null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "-118"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field2277;

		while (true) {
			int var3 = var2.indexOf("%1");
			if (var3 < 0) {
				return var2;
			}

			var2 = var2.substring(0, var3) + class143.intToString(var1, false) + var2.substring(var3 + 2);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lxl;",
		garbageValue = "570292211"
	)
	public SpritePixels method4632() {
		if (this.field2279 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2279);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class455.SpriteBuffer_getSprite(field2272, this.field2279, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2279);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Lxl;",
		garbageValue = "-293878933"
	)
	public SpritePixels method4633() {
		if (this.field2280 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2280);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class455.SpriteBuffer_getSprite(field2272, this.field2280, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2280);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Lxl;",
		garbageValue = "-991472477"
	)
	public SpritePixels method4634() {
		if (this.field2270 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2270);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class455.SpriteBuffer_getSprite(field2272, this.field2270, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2270);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Lxl;",
		garbageValue = "1548491257"
	)
	public SpritePixels method4628() {
		if (this.field2282 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2282);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class455.SpriteBuffer_getSprite(field2272, this.field2282, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2282);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lri;",
		garbageValue = "1044611346"
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
				var1 = class293.method6757(field2272, class360.HitSplatDefinition_fontsArchive, this.fontId, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedFonts.put(var1, (long)this.fontId);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("mr")
	@ObfuscatedSignature(
		descriptor = "(Lok;IIZI)V",
		garbageValue = "170214861"
	)
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width;
		int var5 = var0.height * -171267385;
		if (var0.widthAlignment == 0) {
			var0.width = var0.rawWidth;
		} else if (var0.widthAlignment == 1) {
			var0.width = var1 - var0.rawWidth;
		} else if (var0.widthAlignment == 2) {
			var0.width = var0.rawWidth * var1 >> 14;
		}

		if (var0.heightAlignment == 0) {
			var0.height = var0.rawHeight * -237570313;
		} else if (var0.heightAlignment == 1) {
			var0.height = (var2 - var0.rawHeight) * -237570313;
		} else if (var0.heightAlignment == 2) {
			var0.height = (var2 * var0.rawHeight >> 14) * -237570313;
		}

		if (var0.widthAlignment == 4) {
			var0.width = var0.field4189 * var0.height * -171267385 / var0.field4198;
		}

		if (var0.heightAlignment == 4) {
			var0.height = var0.field4198 * var0.width / var0.field4189 * -237570313;
		}

		if (var0.contentType == 1337) {
			Client.viewportWidget = var0;
		}

		if (var0.type == 12) {
			var0.method8041().method7617(var0.width, var0.height * -171267385);
		}

		if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height * -171267385)) {
			ScriptEvent var6 = new ScriptEvent();
			var6.widget = var0;
			var6.args = var0.onResize;
			Client.scriptEvents.addFirst(var6);
		}

	}
}
