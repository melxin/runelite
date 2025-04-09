import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dp")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
	@ObfuscatedName("ow")
	@Export("refreshToken")
	static String refreshToken;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	@Export("worldView")
	final WorldView worldView;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1480052841
	)
	@Export("id")
	final int id;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -328216123
	)
	@Export("type")
	final int type;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -26446859
	)
	@Export("orientation")
	final int orientation;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 214576381
	)
	@Export("plane")
	final int plane;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1248576935
	)
	@Export("x")
	final int x;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1554740429
	)
	@Export("y")
	final int y;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -64836525
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1832980877
	)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(
		descriptor = "(Ldj;IIIIIIIZLhy;)V"
	)
	DynamicObject(WorldView var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, Renderable var10) {
		this.worldView = var1;
		this.id = var2;
		this.type = var3;
		this.orientation = var4;
		this.plane = var5;
		this.x = var6;
		this.y = var7;
		if (var8 != -1) {
			this.sequenceDefinition = class91.SequenceDefinition_get(var8);
			this.frame = 0;
			this.cycleStart = Client.cycle - 1;
			if (this.sequenceDefinition.restartMode == 0 && var10 instanceof DynamicObject) {
				DynamicObject var11 = (DynamicObject)var10;
				if (this.sequenceDefinition == var11.sequenceDefinition) {
					this.frame = var11.frame;
					this.cycleStart = var11.cycleStart;
					return;
				}
			}

			if (var9 && this.sequenceDefinition.frameCount != -1) {
				if (!this.sequenceDefinition.isCachedModelIdSet()) {
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.frameIds.length);
					this.cycleStart -= (int)(Math.random() * (double)this.sequenceDefinition.frameLengths[this.frame]);
				} else {
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.getMayaAnimFrame());
				}
			}
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Lhe;",
		garbageValue = "-1407261867"
	)
	@Export("getModel")
	protected final Model getModel() {
		ObjectComposition var1 = class162.getObjectDefinition(this.id);
		if (var1.transforms != null) {
			var1 = var1.transform();
		}

		if (var1 == null) {
			return null;
		} else {
			int var2;
			int var3;
			if (this.orientation != 1 && this.orientation != 3) {
				var2 = var1.sizeX;
				var3 = var1.sizeY;
			} else {
				var2 = var1.sizeY;
				var3 = var1.sizeX;
			}

			int var4 = (var2 >> 1) + this.x;
			int var5 = (var2 + 1 >> 1) + this.x;
			int var6 = (var3 >> 1) + this.y;
			int var7 = (var3 + 1 >> 1) + this.y;
			int[][] var8 = this.worldView.tileHeights[this.plane];
			int var9 = var8[var5][var6] + var8[var4][var6] + var8[var4][var7] + var8[var5][var7] >> 2;
			int var10 = (this.x << 7) + (var2 << 6);
			int var11 = (this.y << 7) + (var3 << 6);
			if (this.sequenceDefinition != null) {
				int var12 = Client.cycle - this.cycleStart;
				if (this.sequenceDefinition.frameCount > 0 && this.sequenceDefinition.field3017 > 0) {
					var12 %= this.sequenceDefinition.field3017;
				}

				if (!this.sequenceDefinition.isCachedModelIdSet()) {
					for (; var12 > this.sequenceDefinition.frameLengths[this.frame]; GrandExchangeEvents.method7827(this.sequenceDefinition, this.frame, var10, var11, false)) {
						var12 -= this.sequenceDefinition.frameLengths[this.frame];
						++this.frame;
						if (this.frame >= this.sequenceDefinition.frameIds.length) {
							this.frame -= this.sequenceDefinition.frameCount;
							if (this.frame < 0 || this.frame >= this.sequenceDefinition.frameIds.length) {
								this.sequenceDefinition = null;
								break;
							}
						}
					}
				} else {
					int var13 = this.sequenceDefinition.getMayaAnimFrame();
					this.frame += var12;
					var12 = 0;
					if (this.frame >= var13) {
						this.frame = var13 - this.sequenceDefinition.frameCount;
						if (this.frame < 0 || this.frame > var13) {
							this.sequenceDefinition = null;
						}
					}

					if (this.sequenceDefinition != null) {
						GrandExchangeEvents.method7827(this.sequenceDefinition, this.frame, var10, var11, false);
					}
				}

				this.cycleStart = Client.cycle - var12;
			}

			return var1.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.sequenceDefinition, this.frame);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)Lfe;",
		garbageValue = "-1110361666"
	)
	static class137 method2371(int var0) {
		class137 var1 = (class137)ArchiveDiskActionHandler.findEnumerated(class72.method2194(), var0);
		if (var1 == null) {
			var1 = class137.field1619;
		}

		return var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "53"
	)
	@Export("isAlphaNumeric")
	public static boolean isAlphaNumeric(char var0) {
		return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILdb;ZI)I",
		garbageValue = "1039511082"
	)
	static int method2370(int var0, Script var1, boolean var2) {
		Widget var3 = class232.widgetDefinition.method6951(Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) {
			Interpreter.Interpreter_stringStack[++class338.Interpreter_stringStackSize - 1] = var3.text;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.scrollWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.scrollHeight;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.modelZoom;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.modelAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.modelAngleZ;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.modelAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.transparencyTop;
			return 1;
		} else if (var0 == 2610) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.transparencyBot;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.color;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.color2;
			return 1;
		} else if (var0 == 2613) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
			return 1;
		} else {
			class355 var4;
			if (var0 == 2617) {
				var4 = var3.method7378();
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var4 != null ? var4.field3860 : 0;
			}

			if (var0 == 2618) {
				var4 = var3.method7378();
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var4 != null ? var4.field3858 : 0;
				return 1;
			} else {
				class361 var7;
				if (var0 == 2619) {
					var7 = var3.method7377();
					Interpreter.Interpreter_stringStack[++class338.Interpreter_stringStackSize - 1] = var7 != null ? var7.method7201().method8658() : "";
					return 1;
				} else if (var0 == 2620) {
					var4 = var3.method7378();
					Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var4 != null ? var4.field3859 : 0;
					return 1;
				} else if (var0 == 2621) {
					var7 = var3.method7377();
					Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var7 != null ? var7.method7121() : 0;
					return 1;
				} else if (var0 == 2622) {
					var7 = var3.method7377();
					Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var7 != null ? var7.method7122() : 0;
					return 1;
				} else if (var0 == 2623) {
					var7 = var3.method7377();
					Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var7 != null ? var7.method7181() : 0;
					return 1;
				} else if (var0 == 2624) {
					var7 = var3.method7377();
					Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var7 != null && var7.method7113() ? 1 : 0;
					return 1;
				} else if (var0 != 2625) {
					if (var0 == 2626) {
						var7 = var3.method7377();
						Interpreter.Interpreter_stringStack[++class338.Interpreter_stringStackSize - 1] = var7 != null ? var7.method7112().method8854() : "";
						return 1;
					} else if (var0 == 2627) {
						var7 = var3.method7377();
						int var5 = var7 != null ? var7.method7129() : 0;
						int var6 = var7 != null ? var7.method7116() : 0;
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Math.min(var5, var6);
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Math.max(var5, var6);
						return 1;
					} else if (var0 == 2628) {
						var7 = var3.method7377();
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var7 != null ? var7.method7116() : 0;
						return 1;
					} else if (var0 == 2629) {
						var7 = var3.method7377();
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var7 != null ? var7.method7126() : 0;
						return 1;
					} else if (var0 == 2630) {
						var7 = var3.method7377();
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var7 != null ? var7.method7291() : 0;
						return 1;
					} else if (var0 == 2631) {
						var7 = var3.method7377();
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var7 != null ? var7.method7213() : 0;
						return 1;
					} else if (var0 == 2632) {
						var7 = var3.method7377();
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var7 != null ? var7.method7202() : 0;
						return 1;
					} else {
						class27 var8;
						if (var0 == 2633) {
							var8 = var3.method7482();
							Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var8 != null ? var8.method397(Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else if (var0 == 2634) {
							var8 = var3.method7482();
							Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var8 != null ? var8.method398((char)Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var7 = var3.method7377();
					Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var7 != null && var7.method7240() ? 1 : 0;
					return 1;
				}
			}
		}
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(I)Luy;",
		garbageValue = "-1436970542"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return GameBuild.worldMap;
	}

	@ObfuscatedName("mn")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIS)V",
		garbageValue = "-2224"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class232.widgetDefinition.loadInterface(var0)) {
			HttpRequest.method98(class232.widgetDefinition.Widget_interfaceComponents[var0], 0, class232.widgetDefinition.Widget_interfaceComponents[var0].length - 1, -1, -1, var1, var2, var3, var4, var5, var6);
		}
	}

	@ObfuscatedName("nh")
	@ObfuscatedSignature(
		descriptor = "(Lnh;I)Z",
		garbageValue = "-416080900"
	)
	static boolean method2369(Widget var0) {
		return var0.isHidden;
	}
}
