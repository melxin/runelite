import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("he")
@Implements("SpotAnimationDefinition")
public class SpotAnimationDefinition extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	public static AbstractArchive field2186;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("SpotAnimationDefinition_cached")
	public static EvictingDualNodeHashTable SpotAnimationDefinition_cached;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("SpotAnimationDefinition_cachedModels")
	public static EvictingDualNodeHashTable SpotAnimationDefinition_cachedModels;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -710148471
	)
	@Export("id")
	int id;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1577298901
	)
	@Export("archive")
	int archive;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1457259081
	)
	@Export("sequence")
	public int sequence;
	@ObfuscatedName("aq")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("ac")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("aa")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("ap")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1456425891
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1708409873
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 293294035
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1669349749
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 935617287
	)
	@Export("contrast")
	int contrast;

	static {
		SpotAnimationDefinition_cached = new EvictingDualNodeHashTable(64);
		SpotAnimationDefinition_cachedModels = new EvictingDualNodeHashTable(30);
	}

	SpotAnimationDefinition() {
		this.sequence = -1;
		this.widthScale = 128;
		this.heightScale = 128;
		this.orientation = 0;
		this.ambient = 0;
		this.contrast = 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "683146965"
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lwj;IS)V",
		garbageValue = "-20561"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.archive = var1.readUnsignedShort();
		} else if (var2 == 2) {
			this.sequence = var1.readUnsignedShort();
		} else if (var2 == 4) {
			this.widthScale = var1.readUnsignedShort();
		} else if (var2 == 5) {
			this.heightScale = var1.readUnsignedShort();
		} else if (var2 == 6) {
			this.orientation = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.ambient = var1.readUnsignedByte();
		} else if (var2 == 8) {
			this.contrast = var1.readUnsignedByte();
		} else {
			int var3;
			int var4;
			if (var2 == 40) {
				var3 = var1.readUnsignedByte();
				this.recolorFrom = new short[var3];
				this.recolorTo = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.recolorFrom[var4] = (short)var1.readUnsignedShort();
					this.recolorTo[var4] = (short)var1.readUnsignedShort();
				}
			} else if (var2 == 41) {
				var3 = var1.readUnsignedByte();
				this.retextureFrom = new short[var3];
				this.retextureTo = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.retextureFrom[var4] = (short)var1.readUnsignedShort();
					this.retextureTo[var4] = (short)var1.readUnsignedShort();
				}
			}
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljd;",
		garbageValue = "-126"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		Model var2 = this.method4480();
		if (var2 == null) {
			return null;
		} else {
			Model var3;
			if (this.sequence != -1 && var1 != -1) {
				var3 = class171.SequenceDefinition_get(this.sequence).transformSpotAnimationModel(var2, var1);
			} else {
				var3 = var2.toSharedSpotAnimationModel(true);
			}

			if (this.widthScale != 128 || this.heightScale != 128) {
				var3.scale(this.widthScale, this.heightScale, this.widthScale);
			}

			if (this.orientation != 0) {
				if (this.orientation == 90) {
					var3.rotateY90Ccw();
				}

				if (this.orientation == 180) {
					var3.rotateY90Ccw();
					var3.rotateY90Ccw();
				}

				if (this.orientation == 270) {
					var3.rotateY90Ccw();
					var3.rotateY90Ccw();
					var3.rotateY90Ccw();
				}
			}

			return var3;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljd;",
		garbageValue = "667506404"
	)
	public final Model method4480() {
		Model var1 = (Model)SpotAnimationDefinition_cachedModels.get((long)this.id);
		if (var1 == null) {
			ModelData var2 = ModelData.ModelData_get(class149.SpotAnimationDefinition_modelArchive, this.archive, 0);
			if (var2 == null) {
				return null;
			}

			int var3;
			if (this.recolorFrom != null) {
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) {
					var2.recolor(this.recolorFrom[var3], this.recolorTo[var3]);
				}
			}

			if (this.retextureFrom != null) {
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) {
					var2.retexture(this.retextureFrom[var3], this.retextureTo[var3]);
				}
			}

			var1 = var2.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30);
			SpotAnimationDefinition_cachedModels.put(var1, (long)this.id);
		}

		return var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "0"
	)
	public static int method4496(int var0) {
		return var0 >> 24 & 3;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILcj;ZI)I",
		garbageValue = "-1111645341"
	)
	static int method4482(int var0, Script var1, boolean var2) {
		int var3;
		int var16;
		int var17;
		Widget var20;
		Widget var24;
		if (var0 == ScriptOpcodes.CC_CREATE) {
			UrlRequest.Interpreter_intStackSize -= 4;
			var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
			var17 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
			var16 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 2];
			boolean var26 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 3] != 0;
			var24 = class35.widgetDefinition.method7496(var3);
			if (var24.type != 0) {
				throw new RuntimeException("");
			} else {
				GameEngine.method675(var24, var16, var26, var1);
				var20 = new Widget();
				var20.type = var17;
				var20.parentId = var20.id = var24.id;
				var20.childIndex = var16 * 517036931;
				var20.isIf3 = true;
				if (var17 == 12) {
					class351.method7400(var20);
				}

				var24.children[var16] = var20;
				if (var2) {
					class359.scriptDotWidget = var20;
				} else {
					GameEngine.scriptActiveWidget = var20;
				}

				class154.invalidateWidget(var24);
				return 1;
			}
		} else {
			Widget var4;
			Widget var19;
			if (var0 == ScriptOpcodes.CC_DELETE) {
				var19 = var2 ? class359.scriptDotWidget : GameEngine.scriptActiveWidget;
				var4 = class35.widgetDefinition.method7496(var19.id);
				ClientPreferences.method2734(var19, var4);
				class154.invalidateWidget(var4);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) {
				--UrlRequest.Interpreter_intStackSize;
				var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
				var4 = class35.widgetDefinition.method7496(var3);
				var4.children = null;
				class154.invalidateWidget(var4);
				return 1;
			} else {
				Widget var6;
				if (var0 == 105) {
					UrlRequest.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
					var17 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
					var16 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 2];
					var6 = class35.widgetDefinition.method7496(var3);
					var24 = class35.widgetDefinition.getWidgetChild(var3, var17);
					if (var6 == null) {
						throw new RuntimeException("");
					} else if (var17 < 0) {
						throw new RuntimeException("");
					} else if (var24 == null) {
						throw new RuntimeException("");
					} else if (var24.type == 0) {
						throw new RuntimeException("");
					} else {
						GameEngine.method675(var6, var16, true, var1);
						if (var24.field4173 != -1) {
							var20 = class35.widgetDefinition.getWidgetChild(var3, var24.field4173);
							AbstractWorldMapIcon.method6902(var20, var16);
						}

						var20 = new Widget(var24);
						var20.childIndex = var16 * 517036931;
						if (var24.type == 12) {
							class351.method7400(var20);
						}

						var6.children[var16] = var20;
						if (var2) {
							class359.scriptDotWidget = var20;
						} else {
							GameEngine.scriptActiveWidget = var20;
						}

						class154.invalidateWidget(var6);
						return 1;
					}
				} else {
					Widget var5;
					if (var0 == 106) {
						UrlRequest.Interpreter_intStackSize -= 2;
						var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
						var17 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
						var5 = var2 ? class359.scriptDotWidget : GameEngine.scriptActiveWidget;
						if (var5 == null) {
							throw new RuntimeException("");
						} else {
							var6 = class35.widgetDefinition.method7496(var5.parentId);
							if (var5.type != 0) {
								throw new RuntimeException("");
							} else if (var6.type != 0) {
								throw new RuntimeException();
							} else {
								GameEngine.method675(var6, var17, true, var1);
								AbstractWorldMapIcon.method6902(var5, var17);
								var24 = new Widget();
								var24.type = var3;
								var24.parentId = var24.id = var6.id;
								var24.field4173 = var5.childIndex * -2066937045;
								var24.childIndex = var17 * 517036931;
								var24.isIf3 = true;
								if (var3 == 12) {
									class351.method7400(var24);
								}

								var6.children[var17] = var24;
								if (var2) {
									class359.scriptDotWidget = var24;
								} else {
									GameEngine.scriptActiveWidget = var24;
								}

								class154.invalidateWidget(var6);
								return 1;
							}
						}
					} else if (var0 == 107) {
						UrlRequest.Interpreter_intStackSize -= 2;
						var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
						var17 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
						var5 = var2 ? class359.scriptDotWidget : GameEngine.scriptActiveWidget;
						if (var5 == null) {
							throw new RuntimeException("");
						} else {
							var6 = class35.widgetDefinition.getWidgetChild(var5.parentId, var5.field4173);
							var24 = class35.widgetDefinition.method7496(var6.parentId);
							if (var6.type != 0) {
								throw new RuntimeException("");
							} else if (var24.type != 0) {
								throw new RuntimeException();
							} else {
								GameEngine.method675(var24, var17, true, var1);
								AbstractWorldMapIcon.method6902(var6, var17);
								var20 = new Widget();
								var20.type = var3;
								var20.parentId = var20.id = var24.id;
								var20.field4173 = var6.childIndex * -2066937045;
								var20.childIndex = var17 * 517036931;
								var20.isIf3 = true;
								if (var3 == 12) {
									class351.method7400(var20);
								}

								var24.children[var17] = var20;
								if (var2) {
									class359.scriptDotWidget = var20;
								} else {
									GameEngine.scriptActiveWidget = var20;
								}

								class154.invalidateWidget(var24);
								return 1;
							}
						}
					} else if (var0 == ScriptOpcodes.CC_FIND) {
						UrlRequest.Interpreter_intStackSize -= 2;
						var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
						var17 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
						var5 = var17 != -1 ? class35.widgetDefinition.getWidgetChild(var3, var17) : null;
						WorldMapLabelSize.method6407(var5, var2);
						return 1;
					} else if (var0 == ScriptOpcodes.IF_FIND) {
						WorldMapLabelSize.method6407(class35.widgetDefinition.method7496(Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize]), var2);
						return 1;
					} else if (var0 == 204) {
						var19 = var2 ? class359.scriptDotWidget : GameEngine.scriptActiveWidget;
						var4 = var19 != null ? class35.widgetDefinition.getWidgetChild(var19.parentId, var19.field4173) : null;
						WorldMapLabelSize.method6407(var4, var2);
						return 1;
					} else if (var0 == 205) {
						var19 = var2 ? class359.scriptDotWidget : GameEngine.scriptActiveWidget;
						var4 = var19 != null ? class35.widgetDefinition.method7496(var19.parentId) : null;
						WorldMapLabelSize.method6407(var4, var2);
						return 1;
					} else {
						int var18;
						if (var0 == 206) {
							var19 = var2 ? class359.scriptDotWidget : GameEngine.scriptActiveWidget;
							if (var19 == null) {
								Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
								return 1;
							} else if (var19.childIndex * -2066937045 == -1) {
								Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
								return 1;
							} else {
								var4 = class35.widgetDefinition.method7496(var19.parentId);
								var5 = null;

								for (var18 = var19.childIndex * -2066937045 + 1; var18 < var4.children.length; ++var18) {
									var24 = var4.children[var18];
									if (var24 != null && var24.field4173 == var19.field4173) {
										var5 = var24;
										break;
									}
								}

								WorldMapLabelSize.method6407(var5, var2);
								return 1;
							}
						} else if (var0 == 207) {
							var19 = var2 ? class359.scriptDotWidget : GameEngine.scriptActiveWidget;
							if (var19 == null) {
								Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
								return 1;
							} else if (var19.childIndex * -2066937045 == -1) {
								Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
								return 1;
							} else {
								var4 = class35.widgetDefinition.method7496(var19.parentId);
								var5 = null;

								for (var18 = var19.childIndex * -2066937045 - 1; var18 >= 0; --var18) {
									var24 = var4.children[var18];
									if (var24 != null && var24.field4173 == var19.field4173) {
										var5 = var24;
										break;
									}
								}

								WorldMapLabelSize.method6407(var5, var2);
								return 1;
							}
						} else if (var0 == 208) {
							var19 = var2 ? class359.scriptDotWidget : GameEngine.scriptActiveWidget;
							if (var19 == null) {
								Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
								return 1;
							} else if (var19.type != 0) {
								Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
								return 1;
							} else {
								var4 = class35.widgetDefinition.method7496(var19.parentId);
								if (var4.children == null) {
									Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
									return 1;
								} else {
									var16 = 0;

									for (var18 = 0; var18 < var4.children.length; ++var18) {
										var24 = var4.children[var18];
										if (var24 != null && var19.childIndex * -2066937045 == var24.field4173) {
											++var16;
										}
									}

									Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var16;
									return 1;
								}
							}
						} else if (var0 == 209) {
							var19 = var2 ? class359.scriptDotWidget : GameEngine.scriptActiveWidget;
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var19 != null ? var19.field4173 : -1;
							return 1;
						} else {
							Object var7;
							if (var0 == 210) {
								var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
								var17 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
								Object var22 = WorldMap.method10995(var3);
								var18 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
								var7 = WorldMap.method10995(var17);
								int var8 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
								ParamComposition var9 = VarpDefinition.getParamDefinition(var8);
								Object var10 = var9.isString() ? var9.defaultStr : var9.defaultInt;
								Object var11 = null;
								if (var18 >= 0) {
									ParamComposition var12 = VarpDefinition.getParamDefinition(var18);
									var11 = var12.isString() ? var12.defaultStr : var12.defaultInt;
								}

								Widget var25 = class35.widgetDefinition.method7496(Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize]);
								Widget var13 = null;
								if (var25 != null && var25.children != null) {
									for (int var14 = 0; var14 < var25.children.length; ++var14) {
										Widget var15 = var25.children[var14];
										if (var15 != null && (var8 < 0 || var15.method7941(var8, var10).equals(var7)) && (var18 < 0 || var15.method7941(var18, var11).equals(var22))) {
											var13 = var15;
											break;
										}
									}
								}

								WorldMapLabelSize.method6407(var13, var2);
								return 1;
							} else if (var0 == 211) {
								UrlRequest.Interpreter_intStackSize -= 3;
								var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
								var4 = class35.widgetDefinition.method7496(Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1]);
								var16 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 2];
								Interpreter.field642.method7907(var3, var4, var16);
								Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Interpreter.field642.method7893();
								return 1;
							} else if (var0 == 212) {
								var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
								var4 = var2 ? class359.scriptDotWidget : GameEngine.scriptActiveWidget;
								if (var4.childIndex * -2066937045 == -1) {
									Interpreter.field642.method7907(var3, var4, -1);
								} else {
									Interpreter.field642.method7907(var3, class35.widgetDefinition.method7496(var4.parentId), var4.childIndex * -2066937045);
								}

								Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Interpreter.field642.method7893();
								return 1;
							} else if (var0 == 213) {
								WorldMapLabelSize.method6407(Interpreter.field642.method7889(), var2);
								return 1;
							} else if (var0 == 214) {
								Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Interpreter.field642.method7895();
								return 1;
							} else if (var0 == 215) {
								Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = Client.method1501(Interpreter.field642.method7902());
								return 1;
							} else if (var0 == 216) {
								var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
								Object var21 = WorldMap.method10995(var3);
								var16 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
								ParamComposition var23 = VarpDefinition.getParamDefinition(var16);
								var7 = var23.isString() ? var23.defaultStr : var23.defaultInt;
								Interpreter.field642.method7896(var16, var21, var7);
								Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Interpreter.field642.method7893();
								return 1;
							} else if (var0 == 217) {
								var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
								var4 = var2 ? class359.scriptDotWidget : GameEngine.scriptActiveWidget;
								if (var4 == null) {
									throw new RuntimeException("");
								} else if (var4.type != 0) {
									throw new RuntimeException("");
								} else {
									var5 = class35.widgetDefinition.method7496(var4.parentId);
									if (var5.type != 0) {
										throw new RuntimeException();
									} else {
										var6 = class331.method7063(var3, var5, var4);
										WorldMapLabelSize.method6407(var6, var2);
										return 1;
									}
								}
							} else {
								return 2;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "113"
	)
	static int method4494(int var0, int var1, int var2) {
		return var1 >= var2 ? var0 : (int)((float)var0 * ((float)var1 / (float)var2));
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ILcj;ZI)I",
		garbageValue = "1565226532"
	)
	static int method4495(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) {
			var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Client.indexCheck.isValidIndexInRange(var3) ? 1 : 0;
			return 1;
		} else if (var0 == 3501) {
			var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Client.indexCheck.method6131(var3) ? 1 : 0;
			return 1;
		} else if (var0 == 3502) {
			var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Client.indexCheck.method6157(var3) ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}
}
