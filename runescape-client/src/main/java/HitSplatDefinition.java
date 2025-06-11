import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ih")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	public static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("HitSplatDefinition_cached")
	public static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("pj")
	@ObfuscatedGetter(
		intValue = 357621527
	)
	static int field2180;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1041678753
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1809117071
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1800299179
	)
	public int field2188;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1777542159
	)
	int field2189;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 323586839
	)
	int field2190;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 2068008965
	)
	int field2201;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1359412997
	)
	int field2192;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2086507751
	)
	public int field2193;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -801235683
	)
	public int field2198;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1840156253
	)
	public int field2197;
	@ObfuscatedName("as")
	String field2204;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -457678273
	)
	public int field2194;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -2107838053
	)
	public int field2187;
	@ObfuscatedName("aq")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -217857945
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 105354307
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
		this.field2188 = 70;
		this.field2189 = -1;
		this.field2190 = -1;
		this.field2201 = -1;
		this.field2192 = -1;
		this.field2193 = 0;
		this.field2198 = 0;
		this.field2197 = -1;
		this.field2204 = "";
		this.field2194 = -1;
		this.field2187 = 0;
		this.transformVarbit = -1;
		this.transformVarp = -1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)V",
		garbageValue = "-2094286848"
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
		descriptor = "(Lwt;II)V",
		garbageValue = "762285835"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.fontId = var1.method10873();
		} else if (var2 == 2) {
			this.textColor = var1.readMedium();
		} else if (var2 == 3) {
			this.field2189 = var1.method10873();
		} else if (var2 == 4) {
			this.field2201 = var1.method10873();
		} else if (var2 == 5) {
			this.field2190 = var1.method10873();
		} else if (var2 == 6) {
			this.field2192 = var1.method10873();
		} else if (var2 == 7) {
			this.field2193 = var1.readShort();
		} else if (var2 == 8) {
			this.field2204 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) {
			this.field2188 = var1.readUnsignedShort();
		} else if (var2 == 10) {
			this.field2198 = var1.readShort();
		} else if (var2 == 11) {
			this.field2197 = 0;
		} else if (var2 == 12) {
			this.field2194 = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.field2187 = var1.readShort();
		} else if (var2 == 14) {
			this.field2197 = var1.readUnsignedShort();
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Lih;",
		garbageValue = "-2116527306"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = class4.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? ClientPreferences.method2477(var2) : null;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "636756587"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field2204;

		while (true) {
			int var3 = var2.indexOf("%1");
			if (var3 < 0) {
				return var2;
			}

			var2 = var2.substring(0, var3) + UrlRequest.intToString(var1, false) + var2.substring(var3 + 2);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Lwd;",
		garbageValue = "-28"
	)
	public SpritePixels method4362() {
		if (this.field2189 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2189);
			if (var1 != null) {
				return var1;
			} else {
				var1 = IntHashTable.SpriteBuffer_getSprite(class452.field5016, this.field2189, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2189);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Lwd;",
		garbageValue = "-234045725"
	)
	public SpritePixels method4392() {
		if (this.field2190 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2190);
			if (var1 != null) {
				return var1;
			} else {
				var1 = IntHashTable.SpriteBuffer_getSprite(class452.field5016, this.field2190, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2190);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Lwd;",
		garbageValue = "-48"
	)
	public SpritePixels method4366() {
		if (this.field2201 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2201);
			if (var1 != null) {
				return var1;
			} else {
				var1 = IntHashTable.SpriteBuffer_getSprite(class452.field5016, this.field2201, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2201);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lwd;",
		garbageValue = "1925709809"
	)
	public SpritePixels method4367() {
		if (this.field2192 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2192);
			if (var1 != null) {
				return var1;
			} else {
				var1 = IntHashTable.SpriteBuffer_getSprite(class452.field5016, this.field2192, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2192);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Lrf;",
		garbageValue = "118"
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
				var1 = class384.method7944(class452.field5016, HitSplatDefinition_fontsArchive, this.fontId, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedFonts.put(var1, (long)this.fontId);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I[BLtb;I)V",
		garbageValue = "-1395466821"
	)
	static void method4397(int var0, byte[] var1, ArchiveDisk var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction();
		var3.type = 0;
		var3.key = (long)var0;
		var3.data = var1;
		var3.archiveDisk = var2;
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3);
		}

		class137.method3553();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILcr;ZB)I",
		garbageValue = "-8"
	)
	static int method4396(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class539.scriptDotWidget : Huffman.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETX) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETY) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.width * -1805166981;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.height * -2133353239;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("nj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "650338321"
	)
	static final int method4398() {
		float var0 = 200.0F * ((float)ClientPacket.clientPreferences.getBrightness() - 0.5F);
		return 100 - Math.round(var0);
	}
}
