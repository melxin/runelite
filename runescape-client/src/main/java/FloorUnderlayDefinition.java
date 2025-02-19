import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hg")
@Implements("FloorUnderlayDefinition")
public class FloorUnderlayDefinition extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	@Export("FloorUnderlayDefinition_archive")
	public static AbstractArchive FloorUnderlayDefinition_archive;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("FloorUnderlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorUnderlayDefinition_cached;
	@ObfuscatedName("wt")
	@Export("foundItemIds")
	static short[] foundItemIds;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -592209997
	)
	@Export("rgb")
	int rgb;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 371308665
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1212100113
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -310229523
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -73950735
	)
	@Export("hueMultiplier")
	public int hueMultiplier;

	static {
		FloorUnderlayDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	public FloorUnderlayDefinition() {
		this.rgb = 0;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "645990407"
	)
	@Export("postDecode")
	public void postDecode() {
		this.setHsl(this.rgb);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lvy;IB)V",
		garbageValue = "0"
	)
	@Export("decode")
	public void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 0) {
				return;
			}

			this.decodeNext(var1, var3, var2);
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lvy;III)V",
		garbageValue = "1808640252"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) {
			this.rgb = var1.readMedium();
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D;
		double var4 = (double)(var1 >> 8 & 255) / 256.0D;
		double var6 = (double)(var1 & 255) / 256.0D;
		double var8 = var2;
		if (var4 < var2) {
			var8 = var4;
		}

		if (var6 < var8) {
			var8 = var6;
		}

		double var10 = var2;
		if (var4 > var2) {
			var10 = var4;
		}

		if (var6 > var10) {
			var10 = var6;
		}

		double var12 = 0.0D;
		double var14 = 0.0D;
		double var16 = (var8 + var10) / 2.0D;
		if (var10 != var8) {
			if (var16 < 0.5D) {
				var14 = (var10 - var8) / (var10 + var8);
			}

			if (var16 >= 0.5D) {
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var2 == var10) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var10 == var4) {
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var10 == var6) {
				var12 = 4.0D + (var2 - var4) / (var10 - var8);
			}
		}

		var12 /= 6.0D;
		this.saturation = (int)(256.0D * var14);
		this.lightness = (int)(256.0D * var16);
		if (this.saturation < 0) {
			this.saturation = 0;
		} else if (this.saturation > 255) {
			this.saturation = 255;
		}

		if (this.lightness < 0) {
			this.lightness = 0;
		} else if (this.lightness > 255) {
			this.lightness = 255;
		}

		if (var16 > 0.5D) {
			this.hueMultiplier = (int)((1.0D - var16) * var14 * 512.0D);
		} else {
			this.hueMultiplier = (int)(var16 * var14 * 512.0D);
		}

		if (this.hueMultiplier < 1) {
			this.hueMultiplier = 1;
		}

		this.hue = (int)((double)this.hueMultiplier * var12);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILdy;ZI)I",
		garbageValue = "-1517824724"
	)
	static int method4026(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class132.scriptDotWidget : PlayerCompositionColorTextureOverride.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else {
			class361 var7;
			if (var0 == ScriptOpcodes.CC_GETTEXT) {
				if (var3.type == 12) {
					var7 = var3.method7331();
					if (var7 != null) {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.method7069().method8601();
						return 1;
					}
				}

				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.text;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) {
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var3.scrollWidth;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) {
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var3.scrollHeight;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) {
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var3.modelZoom;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) {
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var3.modelAngleX;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) {
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var3.modelAngleZ;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) {
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var3.modelAngleY;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETTRANS) {
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var3.transparencyTop;
				return 1;
			} else if (var0 == 1610) {
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var3.transparencyBot;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) {
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var3.color;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) {
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var3.color2;
				return 1;
			} else if (var0 == 1613) {
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) {
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
				return 1;
			} else {
				class355 var4;
				if (var0 == 1617) {
					var4 = var3.method7332();
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var4 != null ? var4.field3853 : 0;
				}

				if (var0 == 1618) {
					var4 = var3.method7332();
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var4 != null ? var4.field3848 : 0;
					return 1;
				} else if (var0 == 1619) {
					var7 = var3.method7331();
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7 != null ? var7.method7070().method8601() : "";
					return 1;
				} else if (var0 == 1620) {
					var4 = var3.method7332();
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var4 != null ? var4.field3849 : 0;
					return 1;
				} else if (var0 == 1621) {
					var7 = var3.method7331();
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var7 != null ? var7.method7208() : 0;
					return 1;
				} else if (var0 == 1622) {
					var7 = var3.method7331();
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var7 != null ? var7.method7149() : 0;
					return 1;
				} else if (var0 == 1623) {
					var7 = var3.method7331();
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var7 != null ? var7.method7237() : 0;
					return 1;
				} else if (var0 == 1624) {
					var7 = var3.method7331();
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var7 != null && var7.method7072() ? 1 : 0;
					return 1;
				} else if (var0 != 1625) {
					if (var0 == 1626) {
						var7 = var3.method7331();
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7 != null ? var7.method7107().method8803() : "";
						return 1;
					} else if (var0 == 1627) {
						var7 = var3.method7331();
						int var5 = var7 != null ? var7.method7076() : 0;
						int var6 = var7 != null ? var7.method7075() : 0;
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = Math.min(var5, var6);
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = Math.max(var5, var6);
						return 1;
					} else if (var0 == 1628) {
						var7 = var3.method7331();
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var7 != null ? var7.method7075() : 0;
						return 1;
					} else if (var0 == 1629) {
						var7 = var3.method7331();
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var7 != null ? var7.method7290() : 0;
						return 1;
					} else if (var0 == 1630) {
						var7 = var3.method7331();
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var7 != null ? var7.method7205() : 0;
						return 1;
					} else if (var0 == 1631) {
						var7 = var3.method7331();
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var7 != null ? var7.method7163() : 0;
						return 1;
					} else if (var0 == 1632) {
						var7 = var3.method7331();
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var7 != null ? var7.method7143() : 0;
						return 1;
					} else {
						class27 var8;
						if (var0 == 1633) {
							var8 = var3.method7333();
							Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize - 1] = var8 != null ? var8.method368(Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else if (var0 == 1634) {
							var8 = var3.method7333();
							Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize - 1] = var8 != null ? var8.method344((char)Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var7 = var3.method7331();
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var7 != null && var7.method7073() ? 1 : 0;
					return 1;
				}
			}
		}
	}
}
