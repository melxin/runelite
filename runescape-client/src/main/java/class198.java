import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hy")
public class class198 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lhy;"
	)
	public static final class198 field2138;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lhy;"
	)
	public static final class198 field2135;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lhy;"
	)
	public static final class198 field2145;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lhy;"
	)
	public static final class198 field2133;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lhy;"
	)
	public static final class198 field2143;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lhy;"
	)
	public static final class198 field2136;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lhy;"
	)
	public static final class198 field2139;
	@ObfuscatedName("am")
	public static int[] field2141;
	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	@Export("loginType")
	static LoginType loginType;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 440932229
	)
	public final int field2142;

	static {
		field2138 = new class198(0);
		field2135 = new class198(1);
		field2145 = new class198(2);
		field2133 = new class198(3);
		field2143 = new class198(4);
		field2136 = new class198(5);
		field2139 = new class198(6);
		field2141 = null;
	}

	class198(int var1) {
		this.field2142 = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(JJLmx;I)D",
		garbageValue = "2077901728"
	)
	public static double method4387(long var0, long var2, class335 var4) {
		double var5 = var2 > 0L ? (double)SoundSystem.method3067(0.0F, 1.0F, (float)var0 / (float)var2) : 1.0D;
		if (var5 > 0.0D && var5 < 1.0D) {
			double var7;
			double var9;
			switch(var4.field3761) {
			case 0:
			default:
				return var5;
			case 1:
				return 1.0D - Math.cos(var5 * 3.141592653589793D / 2.0D);
			case 2:
				return Math.sin(var5 * 3.141592653589793D / 2.0D);
			case 3:
				return -(Math.cos(3.141592653589793D * var5) - 1.0D) / 2.0D;
			case 4:
				return var5 * var5;
			case 5:
				return 1.0D - (1.0D - var5) * (1.0D - var5);
			case 6:
				return var5 < 0.5D ? var5 * 2.0D * var5 : 1.0D - Math.pow(2.0D + -2.0D * var5, 2.0D) / 2.0D;
			case 7:
				return var5 * var5 * var5;
			case 8:
				return 1.0D - Math.pow(1.0D - var5, 3.0D);
			case 9:
				return var5 < 0.5D ? var5 * var5 * 4.0D * var5 : 1.0D - Math.pow(2.0D + -2.0D * var5, 3.0D) / 2.0D;
			case 10:
				return var5 * var5 * var5 * var5;
			case 11:
				return 1.0D - Math.pow(1.0D - var5, 4.0D);
			case 12:
				return var5 < 0.5D ? var5 * var5 * 8.0D * var5 * var5 : 1.0D - Math.pow(-2.0D * var5 + 2.0D, 4.0D) / 2.0D;
			case 13:
				return var5 * var5 * var5 * var5 * var5;
			case 14:
				return 1.0D - Math.pow(1.0D - var5, 5.0D);
			case 15:
				return var5 < 0.5D ? var5 * var5 * var5 * 8.0D * var5 * var5 : 1.0D - Math.pow(2.0D + -2.0D * var5, 5.0D) / 2.0D;
			case 16:
				return Math.pow(2.0D, 10.0D * var5 - 10.0D);
			case 17:
				return 1.0D - Math.pow(2.0D, var5 * -10.0D);
			case 18:
				return var5 < 0.5D ? Math.pow(2.0D, 10.0D + 20.0D * var5) / 2.0D : (2.0D - Math.pow(2.0D, var5 * -20.0D + 10.0D)) / 2.0D;
			case 19:
				return 1.0D - Math.sqrt(1.0D - Math.pow(var5, 2.0D));
			case 20:
				return Math.sqrt(1.0D - Math.pow(var5 - 1.0D, 2.0D));
			case 21:
				return var5 < 0.5D ? (1.0D - Math.sqrt(1.0D - Math.pow(var5 * 2.0D, 2.0D))) / 2.0D : (Math.sqrt(1.0D - Math.pow(-2.0D * var5 + 2.0D, 2.0D)) + 1.0D) / 2.0D;
			case 22:
				var7 = 1.70158D;
				var9 = 2.70158D;
				return var5 * var5 * 2.70158D * var5 - var5 * 1.70158D * var5;
			case 23:
				var7 = 1.70158D;
				var9 = 2.70158D;
				return 1.0D + 2.70158D * Math.pow(var5 - 1.0D, 3.0D) + 1.70158D * Math.pow(var5 - 1.0D, 2.0D);
			case 24:
				var7 = 1.70158D;
				var9 = 2.5949095D;
				return var5 < 0.5D ? Math.pow(2.0D * var5, 2.0D) * (7.189819D * var5 - 2.5949095D) / 2.0D : (Math.pow(2.0D * var5 - 2.0D, 2.0D) * (2.5949095D + (2.0D * var5 - 2.0D) * 3.5949095D) + 2.0D) / 2.0D;
			case 25:
				var7 = 2.0943951023931953D;
				return -Math.pow(2.0D, 10.0D * var5 - 10.0D) * Math.sin(2.0943951023931953D * (10.0D * var5 - 10.75D));
			case 26:
				var7 = 2.0943951023931953D;
				return Math.pow(2.0D, -10.0D * var5) * Math.sin((var5 * 10.0D - 0.75D) * 2.0943951023931953D) + 1.0D;
			case 27:
				var7 = 1.3962634015954636D;
				var9 = Math.sin((20.0D * var5 - 11.125D) * 1.3962634015954636D);
				return var5 < 0.5D ? -(Math.pow(2.0D, 20.0D * var5 - 10.0D) * var9) / 2.0D : Math.pow(2.0D, var5 * -20.0D + 10.0D) * var9 / 2.0D + 1.0D;
			}
		} else {
			return var5 <= 0.0D ? 0.0D : 1.0D;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)I",
		garbageValue = "-11"
	)
	public static int method4388(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) {
			int var6 = var3;
			var3 = var4;
			var4 = var6;
		}

		var2 &= 3;
		if (var2 == 0) {
			return var0;
		} else if (var2 == 1) {
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 - (var3 - 1) : 7 - var1 - (var4 - 1);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILce;ZB)I",
		garbageValue = "-113"
	)
	static int method4385(int var0, Script var1, boolean var2) {
		int var3;
		int var5;
		int var16;
		Widget var20;
		Widget var23;
		if (var0 == ScriptOpcodes.CC_CREATE) {
			AbstractWorldMapIcon.Interpreter_intStackSize -= 4;
			var3 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
			var16 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
			var5 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 2];
			boolean var26 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 3] != 0;
			var23 = class167.widgetDefinition.method7456(var3);
			if (var23.type != 0) {
				throw new RuntimeException("");
			} else {
				class225.method5019(var23, var5, var26, var1);
				var20 = new Widget();
				var20.type = var16;
				var20.parentId = var20.id = var23.id;
				var20.childIndex = var5 * 814750319;
				var20.isIf3 = true;
				if (var16 == 12) {
					AuthenticationScheme.method3569(var20);
				}

				var23.children[var5] = var20;
				if (var2) {
					class392.scriptDotWidget = var20;
				} else {
					Interpreter.scriptActiveWidget = var20;
				}

				ApproximateRouteStrategy.invalidateWidget(var23);
				return 1;
			}
		} else {
			Widget var19;
			Widget var21;
			if (var0 == ScriptOpcodes.CC_DELETE) {
				var19 = var2 ? class392.scriptDotWidget : Interpreter.scriptActiveWidget;
				var21 = class167.widgetDefinition.method7456(var19.id);
				class372.method8108(var19, var21);
				ApproximateRouteStrategy.invalidateWidget(var21);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) {
				--AbstractWorldMapIcon.Interpreter_intStackSize;
				var3 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
				var21 = class167.widgetDefinition.method7456(var3);
				var21.children = null;
				ApproximateRouteStrategy.invalidateWidget(var21);
				return 1;
			} else {
				Widget var22;
				if (var0 == 105) {
					AbstractWorldMapIcon.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
					var16 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 2];
					var22 = class167.widgetDefinition.method7456(var3);
					var23 = class167.widgetDefinition.getWidgetChild(var3, var16);
					if (var22 == null) {
						throw new RuntimeException("");
					} else if (var16 < 0) {
						throw new RuntimeException("");
					} else if (var23 == null) {
						throw new RuntimeException("");
					} else if (var23.type == 0) {
						throw new RuntimeException("");
					} else {
						class225.method5019(var22, var5, true, var1);
						if (var23.field4117 != -1) {
							var20 = class167.widgetDefinition.getWidgetChild(var3, var23.field4117);
							FriendSystem.method1551(var20, var5);
						}

						var20 = new Widget(var23);
						var20.childIndex = var5 * 814750319;
						if (var23.type == 12) {
							AuthenticationScheme.method3569(var20);
						}

						var22.children[var5] = var20;
						if (var2) {
							class392.scriptDotWidget = var20;
						} else {
							Interpreter.scriptActiveWidget = var20;
						}

						ApproximateRouteStrategy.invalidateWidget(var22);
						return 1;
					}
				} else {
					Widget var25;
					if (var0 == 106) {
						AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
						var3 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
						var16 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
						var25 = var2 ? class392.scriptDotWidget : Interpreter.scriptActiveWidget;
						if (var25 == null) {
							throw new RuntimeException("");
						} else {
							var22 = class167.widgetDefinition.method7456(var25.parentId);
							if (var25.type != 0) {
								throw new RuntimeException("");
							} else if (var22.type != 0) {
								throw new RuntimeException();
							} else {
								class225.method5019(var22, var16, true, var1);
								FriendSystem.method1551(var25, var16);
								var23 = new Widget();
								var23.type = var3;
								var23.parentId = var23.id = var22.id;
								var23.field4117 = var25.childIndex * -64977777;
								var23.childIndex = var16 * 814750319;
								var23.isIf3 = true;
								if (var3 == 12) {
									AuthenticationScheme.method3569(var23);
								}

								var22.children[var16] = var23;
								if (var2) {
									class392.scriptDotWidget = var23;
								} else {
									Interpreter.scriptActiveWidget = var23;
								}

								ApproximateRouteStrategy.invalidateWidget(var22);
								return 1;
							}
						}
					} else if (var0 == 107) {
						AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
						var3 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
						var16 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
						var25 = var2 ? class392.scriptDotWidget : Interpreter.scriptActiveWidget;
						if (var25 == null) {
							throw new RuntimeException("");
						} else {
							var22 = class167.widgetDefinition.getWidgetChild(var25.parentId, var25.field4117);
							var23 = class167.widgetDefinition.method7456(var22.parentId);
							if (var22.type != 0) {
								throw new RuntimeException("");
							} else if (var23.type != 0) {
								throw new RuntimeException();
							} else {
								class225.method5019(var23, var16, true, var1);
								FriendSystem.method1551(var22, var16);
								var20 = new Widget();
								var20.type = var3;
								var20.parentId = var20.id = var23.id;
								var20.field4117 = var22.childIndex * -64977777;
								var20.childIndex = var16 * 814750319;
								var20.isIf3 = true;
								if (var3 == 12) {
									AuthenticationScheme.method3569(var20);
								}

								var23.children[var16] = var20;
								if (var2) {
									class392.scriptDotWidget = var20;
								} else {
									Interpreter.scriptActiveWidget = var20;
								}

								ApproximateRouteStrategy.invalidateWidget(var23);
								return 1;
							}
						}
					} else if (var0 == ScriptOpcodes.CC_FIND) {
						AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
						var3 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
						var16 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
						var25 = var16 != -1 ? class167.widgetDefinition.getWidgetChild(var3, var16) : null;
						class358.method7491(var25, var2);
						return 1;
					} else if (var0 == ScriptOpcodes.IF_FIND) {
						class358.method7491(class167.widgetDefinition.method7456(Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize]), var2);
						return 1;
					} else if (var0 == 204) {
						var19 = var2 ? class392.scriptDotWidget : Interpreter.scriptActiveWidget;
						var21 = var19 != null ? class167.widgetDefinition.getWidgetChild(var19.parentId, var19.field4117) : null;
						class358.method7491(var21, var2);
						return 1;
					} else if (var0 == 205) {
						var19 = var2 ? class392.scriptDotWidget : Interpreter.scriptActiveWidget;
						var21 = var19 != null ? class167.widgetDefinition.method7456(var19.parentId) : null;
						class358.method7491(var21, var2);
						return 1;
					} else {
						int var18;
						if (var0 == 206) {
							var19 = var2 ? class392.scriptDotWidget : Interpreter.scriptActiveWidget;
							if (var19 == null) {
								Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
								return 1;
							} else if (var19.childIndex * -64977777 == -1) {
								Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
								return 1;
							} else {
								var21 = class167.widgetDefinition.method7456(var19.parentId);
								var25 = null;

								for (var18 = var19.childIndex * -64977777 + 1; var18 < var21.children.length; ++var18) {
									var23 = var21.children[var18];
									if (var23 != null && var19.field4117 == var23.field4117) {
										var25 = var23;
										break;
									}
								}

								class358.method7491(var25, var2);
								return 1;
							}
						} else if (var0 == 207) {
							var19 = var2 ? class392.scriptDotWidget : Interpreter.scriptActiveWidget;
							if (var19 == null) {
								Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
								return 1;
							} else if (var19.childIndex * -64977777 == -1) {
								Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
								return 1;
							} else {
								var21 = class167.widgetDefinition.method7456(var19.parentId);
								var25 = null;

								for (var18 = var19.childIndex * -64977777 - 1; var18 >= 0; --var18) {
									var23 = var21.children[var18];
									if (var23 != null && var23.field4117 == var19.field4117) {
										var25 = var23;
										break;
									}
								}

								class358.method7491(var25, var2);
								return 1;
							}
						} else if (var0 == 208) {
							var19 = var2 ? class392.scriptDotWidget : Interpreter.scriptActiveWidget;
							if (var19 == null) {
								Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
								return 1;
							} else if (var19.type != 0) {
								Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
								return 1;
							} else {
								var21 = class167.widgetDefinition.method7456(var19.parentId);
								if (var21.children == null) {
									Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
									return 1;
								} else {
									var5 = 0;

									for (var18 = 0; var18 < var21.children.length; ++var18) {
										var23 = var21.children[var18];
										if (var23 != null && var19.childIndex * -64977777 == var23.field4117) {
											++var5;
										}
									}

									Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var5;
									return 1;
								}
							}
						} else if (var0 == 209) {
							var19 = var2 ? class392.scriptDotWidget : Interpreter.scriptActiveWidget;
							Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var19 != null ? var19.field4117 : -1;
							return 1;
						} else {
							Object var7;
							if (var0 == 210) {
								var3 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
								var16 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
								Object var17 = class28.method462(var3);
								var18 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
								var7 = class28.method462(var16);
								int var8 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
								ParamComposition var9 = Messages.getParamDefinition(var8);
								Object var10 = var9.isString() ? var9.defaultStr : var9.defaultInt;
								Object var11 = null;
								if (var18 >= 0) {
									ParamComposition var12 = Messages.getParamDefinition(var18);
									var11 = var12.isString() ? var12.defaultStr : var12.defaultInt;
								}

								Widget var24 = class167.widgetDefinition.method7456(Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize]);
								Widget var13 = null;
								if (var24 != null && var24.children != null) {
									for (int var14 = 0; var14 < var24.children.length; ++var14) {
										Widget var15 = var24.children[var14];
										if (var15 != null && (var8 < 0 || var15.method7907(var8, var10).equals(var7)) && (var18 < 0 || var15.method7907(var18, var11).equals(var17))) {
											var13 = var15;
											break;
										}
									}
								}

								class358.method7491(var13, var2);
								return 1;
							} else if (var0 == 211) {
								AbstractWorldMapIcon.Interpreter_intStackSize -= 3;
								var3 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
								var21 = class167.widgetDefinition.method7456(Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1]);
								var5 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 2];
								Interpreter.field642.method7875(var3, var21, var5);
								Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = Interpreter.field642.method7854();
								return 1;
							} else if (var0 == 212) {
								var3 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
								var21 = var2 ? class392.scriptDotWidget : Interpreter.scriptActiveWidget;
								if (var21.childIndex * -64977777 == -1) {
									Interpreter.field642.method7875(var3, var21, -1);
								} else {
									Interpreter.field642.method7875(var3, class167.widgetDefinition.method7456(var21.parentId), var21.childIndex * -64977777);
								}

								Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = Interpreter.field642.method7854();
								return 1;
							} else if (var0 == 213) {
								class358.method7491(Interpreter.field642.method7868(), var2);
								return 1;
							} else if (var0 == 214) {
								Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = Interpreter.field642.method7880();
								return 1;
							} else if (var0 == 215) {
								Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = class167.method4020(Interpreter.field642.method7857());
								return 1;
							} else if (var0 == 216) {
								var3 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
								Object var4 = class28.method462(var3);
								var5 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
								ParamComposition var6 = Messages.getParamDefinition(var5);
								var7 = var6.isString() ? var6.defaultStr : var6.defaultInt;
								Interpreter.field642.method7852(var5, var4, var7);
								Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = Interpreter.field642.method7854();
								return 1;
							} else {
								return 2;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ILce;ZB)I",
		garbageValue = "99"
	)
	static int method4389(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) {
			Client.logoutTimer = 250;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "(Lox;II)I",
		garbageValue = "714230366"
	)
	static final int method4384(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) {
			try {
				int[] var2 = var0.cs1Instructions[var1];
				int var3 = 0;
				int var4 = 0;
				byte var5 = 0;

				while (true) {
					int var6 = var2[var4++];
					int var7 = 0;
					byte var8 = 0;
					if (var6 == 0) {
						return var3;
					}

					if (var6 == 1) {
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) {
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) {
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = class167.widgetDefinition.method7456(var9);
						var11 = var2[var4++];
						if (var11 != -1 && (!ObjectComposition.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) {
								if (var11 + 1 == var10.itemIds[var12]) {
									var7 += var10.itemQuantities[var12];
								}
							}
						}
					}

					if (var6 == 5) {
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) {
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) {
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) {
						var7 = class27.localPlayer.combatLevel;
					}

					if (var6 == 9) {
						for (var9 = 0; var9 < 25; ++var9) {
							if (Skills.Skills_enabled[var9]) {
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = class167.widgetDefinition.method7456(var9);
						var11 = var2[var4++];
						if (var11 != -1 && (!ObjectComposition.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) {
								if (var11 + 1 == var10.itemIds[var12]) {
									var7 = 999999999;
									break;
								}
							}
						}
					}

					if (var6 == 11) {
						var7 = Client.runEnergy;
					}

					if (var6 == 12) {
						var7 = Client.weight;
					}

					if (var6 == 13) {
						var9 = Varps.Varps_main[var2[var4++]];
						int var13 = var2[var4++];
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0;
					}

					if (var6 == 14) {
						var9 = var2[var4++];
						var7 = SequenceDefinition.getVarbit(var9);
					}

					if (var6 == 15) {
						var8 = 1;
					}

					if (var6 == 16) {
						var8 = 2;
					}

					if (var6 == 17) {
						var8 = 3;
					}

					if (var6 == 18) {
						var7 = (class27.localPlayer.x >> 7) + class7.topLevelWorldView.baseX;
					}

					if (var6 == 19) {
						var7 = (class27.localPlayer.y >> 7) + class7.topLevelWorldView.baseY;
					}

					if (var6 == 20) {
						var7 = var2[var4++];
					}

					if (var8 == 0) {
						if (var5 == 0) {
							var3 += var7;
						}

						if (var5 == 1) {
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) {
							var3 /= var7;
						}

						if (var5 == 3) {
							var3 *= var7;
						}

						var5 = 0;
					} else {
						var5 = var8;
					}
				}
			} catch (Exception var14) {
				return -1;
			}
		} else {
			return -2;
		}
	}

	@ObfuscatedName("pj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1693277972"
	)
	static void method4386() {
		if (Client.oculusOrbState == 1) {
			Client.field541 = true;
		}

	}
}
