import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("al")
public final class class4 {
	@ObfuscatedName("az")
	@Export("userHomeDirectory")
	static String userHomeDirectory;

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-51383257"
	)
	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitComposition var1 = Interpreter.method1757(var0);
		int var2 = var1.baseVar;
		int var3 = var1.startBit;
		int var4 = var1.endBit;
		int var5 = Varps.Varps_masks[var4 - var3];
		return Varps.Varps_main[var2] >> var3 & var5;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "71"
	)
	static void method14() {
		class416.field4842 = new int[2000];
		int var0 = 0;
		int var1 = 240;

		int var3;
		for (byte var2 = 12; var0 < 16; var1 -= var2) {
			var3 = LoginPacket.method3649((double)((float)var1 / 360.0F), 0.9998999834060669D, (double)(0.425F * (float)var0 / 16.0F + 0.075F));
			class416.field4842[var0] = var3;
			++var0;
		}

		var1 = 48;

		for (int var5 = var1 / 6; var0 < class416.field4842.length; var1 -= var5) {
			var3 = var0 * 2;

			for (int var4 = LoginPacket.method3649((double)((float)var1 / 360.0F), 0.9998999834060669D, 0.5D); var0 < var3 && var0 < class416.field4842.length; ++var0) {
				class416.field4842[var0] = var4;
			}
		}

	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ILcr;ZI)I",
		garbageValue = "1158018141"
	)
	static int method12(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.ADD) {
			Interpreter.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 + var9;
			return 1;
		} else if (var0 == ScriptOpcodes.SUB) {
			Interpreter.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 - var4;
			return 1;
		} else if (var0 == ScriptOpcodes.MULTIPLY) {
			Interpreter.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 * var9;
			return 1;
		} else if (var0 == ScriptOpcodes.DIV) {
			Interpreter.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 / var4;
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOM) {
			var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var9);
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOMINC) {
			var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var9 + 1));
			return 1;
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) {
				Interpreter.Interpreter_intStackSize -= 5;
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
				var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 + (var7 - var5) * (var4 - var9) / (var6 - var5);
				return 1;
			} else if (var0 == ScriptOpcodes.ADDPERCENT) {
				Interpreter.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 + var9 * var4 / 100;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT) {
				Interpreter.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 | 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT) {
				Interpreter.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 & -1 - (1 << var4);
				return 1;
			} else if (var0 == ScriptOpcodes.TESTBIT) {
				Interpreter.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var9 & 1 << var4) != 0 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.MOD) {
				Interpreter.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 % var4;
				return 1;
			} else if (var0 == ScriptOpcodes.POW) {
				Interpreter.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				if (var9 == 0) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, (double)var4);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.INVPOW) {
				Interpreter.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				if (var9 == 0) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					return 1;
				} else {
					switch(var4) {
					case 0:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Integer.MAX_VALUE;
						break;
					case 1:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9;
						break;
					case 2:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var9);
						break;
					case 3:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var9);
						break;
					case 4:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var9));
						break;
					default:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, 1.0D / (double)var4);
					}

					return 1;
				}
			} else if (var0 == ScriptOpcodes.AND) {
				Interpreter.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 & var4;
				return 1;
			} else if (var0 == ScriptOpcodes.OR) {
				Interpreter.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 | var4;
				return 1;
			} else if (var0 == 4016) {
				Interpreter.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 < var4 ? var9 : var4;
				return 1;
			} else if (var0 == 4017) {
				Interpreter.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 > var4 ? var9 : var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SCALE) {
				Interpreter.Interpreter_intStackSize -= 3;
				long var10 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				long var12 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				long var14 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(var14 * var10 / var12);
				return 1;
			} else if (var0 == ScriptOpcodes.BITCOUNT) {
				var9 = PcmPlayer.method2961(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9;
				return 1;
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) {
				Interpreter.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 ^ 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) {
				Interpreter.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapIcon_0.method6523(var9, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) {
				Interpreter.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSectionType.method6563(var9, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) {
				Interpreter.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
				var6 = 31 - var5;
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 << var6 >>> var4 + var6;
				return 1;
			} else if (var0 == 4030) {
				Interpreter.Interpreter_intStackSize -= 4;
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
				var9 = WorldMapSectionType.method6563(var9, var5, var6);
				var7 = Skills.method7913(var6 - var5 + 1);
				if (var4 > var7) {
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 | var4 << var5;
				return 1;
			} else if (var0 == 4032) {
				Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = UrlRequester.method3339(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4033) {
				Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = class49.method1862(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4034) {
				Interpreter.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				var5 = HealthBarUpdate.method2361(var9, var4);
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5;
				return 1;
			} else if (var0 == 4035) {
				Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4036) {
				String var3 = (String)Interpreter.Interpreter_objectStack[--class175.Interpreter_objectStackSize];
				var4 = -1;
				if (class300.isNumber(var3)) {
					var4 = class146.method3635(var3);
				}

				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4;
				return 1;
			} else {
				return 2;
			}
		}
	}

	@ObfuscatedName("mn")
	@ObfuscatedSignature(
		descriptor = "(Lov;I)V",
		garbageValue = "1027591305"
	)
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0) {
		if (var0.buttonType == 1) {
			VertexNormal.method5709(var0.buttonText, "", 24, 0, 0, var0.id, var0.itemId);
		}

		if (var0.buttonType == 2 && !Client.isSpellSelected) {
			String var1 = class322.Widget_getSpellActionName(var0);
			if (var1 != null) {
				VertexNormal.method5709(var1, AbstractWorldMapIcon.colorStartTag(65280) + var0.field4113, 25, 0, -1, var0.id, var0.itemId);
			}
		}

		if (var0.buttonType == 3) {
			UserComparator3.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id);
		}

		if (var0.buttonType == 4) {
			UserComparator3.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id);
		}

		if (var0.buttonType == 5) {
			UserComparator3.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id);
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) {
			UserComparator3.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id);
		}

		if (var0.isIf3) {
			if (Client.isSpellSelected) {
				if (class242.method5107(class255.getWidgetFlags(var0)) && (class448.selectedSpellFlags & 32) == 32) {
					VertexNormal.method5709(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex * -744024149, var0.id, var0.itemId);
				}
			} else {
				for (int var13 = 31; var13 >= 0; --var13) {
					String var2;
					if (var0.targetPriority * -1196438339 == var13) {
						var2 = class322.Widget_getSpellActionName(var0);
						if (var2 != null) {
							VertexNormal.method5709(var2, var0.dataText, 25, 0, var0.childIndex * -744024149, var0.id, var0.itemId);
						}
					}

					if (!class138.method3579(GrandExchangeOfferOwnWorldComparator.getWidgetFlags2(var0), var13) && var0.onOp == null) {
						var2 = null;
					} else if (var0.actions != null && var0.actions.length > var13 && var0.actions[var13] != null && !var0.actions[var13].trim().isEmpty()) {
						var2 = var0.actions[var13];
					} else {
						var2 = null;
					}

					if (var2 != null) {
						int var4;
						short var5;
						if (var13 > var0.targetPriority * -1196438339) {
							var5 = 1007;
							var4 = VertexNormal.method5709(var2, var0.dataText, var5, var13 + 1, var0.childIndex * -744024149, var0.id, var0.itemId);
						} else {
							var5 = 57;
							var4 = GrandExchangeOfferOwnWorldComparator.insertMenuItem(var2, var0.dataText, var5, var13 + 1, var0.childIndex * -744024149, var0.id, var0.itemId, var0.prioritizeMenuEntry, -1);
						}

						if (var0.field4064 != null && var13 < var0.field4064.length && var0.field4064[var13] != null) {
							String[] var6 = var0.field4064[var13];

							for (int var7 = var6.length - 1; var7 >= 0; --var7) {
								int var8 = var7 + 1 << 16 | var13 + 1;
								if (var6[var7] != null && !var6[var7].isEmpty()) {
									String var9 = var6[var7];
									int var10 = var0.childIndex * -744024149;
									int var11 = var0.id;
									int var12 = var0.itemId;
									if (!Client.isMenuOpen && UserList.method9679(-1, var5) && var4 >= 0 && var4 < Client.menu.subMenus.length) {
										if (Client.menu.subMenus[var4] == null) {
											Client.menu.subMenus[var4] = new Menu(false);
										}

										Client.menu.subMenus[var4].insertMenuItem(var9, "", var5, var8, var10, var11, var12, false, -1);
									}
								}
							}
						}
					}
				}

				if (class137.method3565(class255.getWidgetFlags(var0))) {
					UserComparator3.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex * -744024149, var0.id);
				}
			}
		}

	}
}
