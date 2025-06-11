import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cu")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
	@ObfuscatedName("as")
	static String[] field825;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ldl;"
	)
	@Export("worldView")
	final WorldView worldView;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1171399541
	)
	@Export("id")
	final int id;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1330516337
	)
	@Export("type")
	final int type;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1850328327
	)
	@Export("orientation")
	final int orientation;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1610359691
	)
	@Export("plane")
	final int plane;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 632029471
	)
	@Export("x")
	final int x;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1367261069
	)
	@Export("y")
	final int y;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1477283285
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1584539933
	)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(
		descriptor = "(Ldl;IIIIIIIZLjr;)V"
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
			this.sequenceDefinition = VarpDefinition.SequenceDefinition_get(var8);
			this.frame = 0;
			this.cycleStart = Client.cycle - 1;
			if (this.sequenceDefinition.restartMode == 0 && var10 instanceof DynamicObject) {
				DynamicObject var11 = (DynamicObject)var10;
				if (var11.sequenceDefinition == this.sequenceDefinition) {
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Ljm;",
		garbageValue = "27"
	)
	@Export("getModel")
	protected final Model getModel() {
		ObjectComposition var1 = HealthBarConfig.getObjectDefinition(this.id);
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
			int var9 = var8[var4][var7] + var8[var4][var6] + var8[var5][var6] + var8[var5][var7] >> 2;
			int var10 = (this.x << 7) + (var2 << 6);
			int var11 = (this.y << 7) + (var3 << 6);
			if (this.sequenceDefinition != null) {
				int var12 = Client.cycle - this.cycleStart;
				if (this.sequenceDefinition.frameCount > 0 && this.sequenceDefinition.field2368 > 0) {
					var12 %= this.sequenceDefinition.field2368;
				}

				if (!this.sequenceDefinition.isCachedModelIdSet()) {
					for (; var12 > this.sequenceDefinition.frameLengths[this.frame]; class203.method4299(this.worldView, this.sequenceDefinition, this.frame, var10, var11, false)) {
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
						class203.method4299(this.worldView, this.sequenceDefinition, this.frame, var10, var11, false);
					}
				}

				this.cycleStart = Client.cycle - var12;
			}

			return var1.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.sequenceDefinition, this.frame);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILcr;ZI)I",
		garbageValue = "1296407636"
	)
	static int method1993(int var0, Script var1, boolean var2) {
		boolean var3 = true;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = ClientPreferences.widgetDefinition.method7286(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
			var3 = false;
		} else {
			var4 = var2 ? class539.scriptDotWidget : Huffman.scriptActiveWidget;
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) {
			var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] - 1;
			if (var11 >= 0 && var11 < 32) {
				var4.setAction(var11, (String)Interpreter.Interpreter_stringStack[--class175.Interpreter_stringStackSize]);
				return 1;
			} else {
				--class175.Interpreter_stringStackSize;
				return 1;
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) {
				Interpreter.Interpreter_intStackSize -= 2;
				var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				var4.parent = ClientPreferences.widgetDefinition.getWidgetChild(var11, var6);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) {
				var4.isScrollBar = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) {
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) {
				var4.dragThreshold = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) {
				var4.dataText = (String)Interpreter.Interpreter_stringStack[--class175.Interpreter_stringStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) {
				var4.spellActionName = (String)Interpreter.Interpreter_stringStack[--class175.Interpreter_stringStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) {
				var4.actions = null;
				var4.field4064 = null;
				return 1;
			} else if (var0 == 1308) {
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == 1309) {
				--Interpreter.Interpreter_intStackSize;
				return 1;
			} else if (var0 == 1310) {
				var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] - 1;
				if (var11 >= 0 && var11 <= 9 && var4.field4064 != null) {
					var4.field4064[var11] = null;
					return 1;
				} else {
					return 1;
				}
			} else if (var0 == 1311) {
				var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] - 1;
				var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] - 1;
				if (var6 >= 0 && var6 <= 9 && var11 >= 0) {
					var4.method7794(var6, var11, (String)Interpreter.Interpreter_stringStack[--class175.Interpreter_stringStackSize]);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == 1312) {
				var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if (var11 == -1) {
					var4.field4055 = -209307052;
				} else if (var11 >= 1 && var11 <= 10) {
					var4.field4055 = (var11 - 1) * -52326763;
				}

				return 1;
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) {
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) {
						Interpreter.Interpreter_intStackSize -= 2;
						var5 = 10;
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]};
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]};
						class132.Widget_setKey(var4, var5, var8, var9);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) {
						Interpreter.Interpreter_intStackSize -= 3;
						var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] - 1;
						var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
						var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
						if (var11 >= 0 && var11 <= 9) {
							HttpRequest.Widget_setKeyRate(var4, var11, var6, var7);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) {
						var5 = 10;
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						HttpRequest.Widget_setKeyRate(var4, var5, var6, var7);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) {
						--Interpreter.Interpreter_intStackSize;
						var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] - 1;
						if (var11 >= 0 && var11 <= 9) {
							ClanChannel.Widget_setKeyIgnoreHeld(var4, var11);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) {
						var5 = 10;
						ClanChannel.Widget_setKeyIgnoreHeld(var4, var5);
						return 1;
					} else {
						return 2;
					}
				} else {
					byte[] var10 = null;
					var8 = null;
					if (var3) {
						Interpreter.Interpreter_intStackSize -= 10;

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize] >= 0; var7 += 2) {
						}

						if (var7 > 0) {
							var10 = new byte[var7 / 2];
							var8 = new byte[var7 / 2];

							for (var7 -= 2; var7 >= 0; var7 -= 2) {
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize];
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize + 1];
							}
						}
					} else {
						Interpreter.Interpreter_intStackSize -= 2;
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]};
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]};
					}

					var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] - 1;
					if (var7 >= 0 && var7 <= 9) {
						class132.Widget_setKey(var4, var7, var10, var8);
						return 1;
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
	}
}
