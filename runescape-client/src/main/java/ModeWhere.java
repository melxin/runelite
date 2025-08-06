import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("qc")
@Implements("ModeWhere")
public enum ModeWhere implements Enum {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lqc;"
	)
	field5003("", 0, new class425[]{class425.field4966, class425.field4967}),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lqc;"
	)
	field4997("", 1, new class425[]{class425.field4964, class425.field4966, class425.field4967}),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lqc;"
	)
	field4991("", 2, new class425[]{class425.field4964, class425.field4965, class425.field4966}),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lqc;"
	)
	field4992("", 3, new class425[]{class425.field4964}),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lqc;"
	)
	field4993("", 4),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lqc;"
	)
	field4994("", 5, new class425[]{class425.field4964, class425.field4966}),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lqc;"
	)
	field4989("", 6, new class425[]{class425.field4966}),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lqc;"
	)
	field4996("", 8, new class425[]{class425.field4964, class425.field4966}),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lqc;"
	)
	field5004("", 9, new class425[]{class425.field4964, class425.field4965}),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lqc;"
	)
	field4998("", 10, new class425[]{class425.field4964}),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lqc;"
	)
	field4999("", 11, new class425[]{class425.field4964}),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lqc;"
	)
	field5000("", 12, new class425[]{class425.field4964, class425.field4966}),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lqc;"
	)
	field5001("", 13, new class425[]{class425.field4964});

	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -213304931
	)
	static int field4995;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -569398785
	)
	@Export("id")
	final int id;
	@ObfuscatedName("ak")
	final Set field4990;

	static {
		method8721();
	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Lqi;)V"
	)
	ModeWhere(String var3, int var4, class425[] var5) {
		this.field4990 = new HashSet();
		this.id = var4;
		class425[] var6 = var5;

		for (int var7 = 0; var7 < var6.length; ++var7) {
			class425 var8 = var6[var7];
			this.field4990.add(var8);
		}

	}

	ModeWhere(String var3, int var4) {
		this.field4990 = new HashSet();
		this.id = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-164877066"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)[Lqc;",
		garbageValue = "1039495695"
	)
	static ModeWhere[] method8721() {
		return new ModeWhere[]{field4994, field4989, field4992, field5000, field4999, field4993, field5001, field5004, field5003, field4998, field4991, field4996, field4997};
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "200757968"
	)
	public static int method8711(int var0, int var1) {
		return (int)(Math.atan2((double)var0, (double)var1) * 325.94932345220167D) & 2047;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILce;ZB)I",
		garbageValue = "1"
	)
	static int method8719(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) {
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) {
				var3 = var2 ? class392.scriptDotWidget : Interpreter.scriptActiveWidget;
				var4 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
				if (var4 >= 1 && var4 <= 10) {
					class82 var12 = new class82(var4, var3.id, var3.childIndex * -64977777, var3.itemId);
					Interpreter.field646.add(var12);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else {
				int var5;
				if (var0 == ScriptOpcodes.IF_TRIGGEROP) {
					AbstractWorldMapIcon.Interpreter_intStackSize -= 3;
					int var9 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 2];
					if (var5 >= 1 && var5 <= 10) {
						Widget var10 = class167.widgetDefinition.getWidgetChild(var9, var4);
						if (var10 == null) {
							throw new RuntimeException();
						} else {
							class82 var11 = new class82(var5, var9, var4, var10.itemId);
							Interpreter.field646.add(var11);
							return 1;
						}
					} else {
						throw new RuntimeException();
					}
				} else if (var0 == 2929) {
					Object[] var14 = SoundCache.method3093();
					AbstractWorldMapIcon.Interpreter_intStackSize -= 3;
					var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
					var5 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
					int var6 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 2];
					boolean var7 = true;
					Widget var8 = class167.widgetDefinition.getWidgetChild(var5, var6);
					if (var8 != null) {
						int var15 = var8.itemId;
						class182.method4166(var5, var6, var15, var4, var14);
						return 1;
					} else {
						throw new RuntimeException();
					}
				} else {
					return 2;
				}
			}
		} else if (Interpreter.field644 >= 10) {
			throw new RuntimeException();
		} else {
			if (var0 >= 2000) {
				var3 = class167.widgetDefinition.method7456(Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize]);
			} else {
				var3 = var2 ? class392.scriptDotWidget : Interpreter.scriptActiveWidget;
			}

			if (var3.onResize == null) {
				return 0;
			} else {
				ScriptEvent var13 = new ScriptEvent();
				var13.widget = var3;
				var13.args = var3.onResize;
				var13.field876 = Interpreter.field644 + 1;
				Client.scriptEvents.addFirst(var13);
				return 1;
			}
		}
	}

	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "(Lox;I)V",
		garbageValue = "-211018667"
	)
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0) {
		if (var0.buttonType == 1) {
			GrandExchangeOfferNameComparator.method8512(var0.buttonText, "", 24, 0, 0, var0.id, var0.itemId);
		}

		if (var0.buttonType == 2 && !Client.isSpellSelected) {
			String var1 = class203.Widget_getSpellActionName(var0);
			if (var1 != null) {
				GrandExchangeOfferNameComparator.method8512(var1, ObjectSound.colorStartTag(65280) + var0.field4200, 25, 0, -1, var0.id, var0.itemId);
			}
		}

		if (var0.buttonType == 3) {
			TaskHandler.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id);
		}

		if (var0.buttonType == 4) {
			TaskHandler.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id);
		}

		if (var0.buttonType == 5) {
			TaskHandler.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id);
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) {
			TaskHandler.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id);
		}

		if (var0.isIf3) {
			if (Client.isSpellSelected) {
				if (VerticalAlignment.method4379(class516.getWidgetFlags(var0)) && (class533.selectedSpellFlags & 32) == 32) {
					GrandExchangeOfferNameComparator.method8512(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex * -64977777, var0.id, var0.itemId);
				}
			} else {
				for (int var8 = 31; var8 >= 0; --var8) {
					String var9;
					if (var8 == var0.targetPriority * 773766429) {
						var9 = class203.Widget_getSpellActionName(var0);
						if (var9 != null) {
							GrandExchangeOfferNameComparator.method8512(var9, var0.dataText, 25, 0, var0.childIndex * -64977777, var0.id, var0.itemId);
						}
					}

					var9 = Renderable.method5348(var0, var8);
					if (var9 != null) {
						int var3;
						short var4;
						if (var8 > var0.targetPriority * 773766429) {
							var4 = 1007;
							var3 = GrandExchangeOfferNameComparator.method8512(var9, var0.dataText, var4, var8 + 1, var0.childIndex * -64977777, var0.id, var0.itemId);
						} else {
							var4 = 57;
							var3 = ClanSettings.insertMenuItem(var9, var0.dataText, var4, var8 + 1, var0.childIndex * -64977777, var0.id, var0.itemId, var0.prioritizeMenuEntry, -1);
						}

						if (var0.field4151 != null && var8 < var0.field4151.length && var0.field4151[var8] != null) {
							String[] var5 = var0.field4151[var8];

							for (int var6 = var5.length - 1; var6 >= 0; --var6) {
								int var7 = var6 + 1 << 16 | var8 + 1;
								if (var5[var6] != null && !var5[var6].isEmpty()) {
									class254.method5807(var3, var5[var6], "", var4, var7, var0.childIndex * -64977777, var0.id, var0.itemId, -1);
								}
							}
						}
					}
				}

				int var2 = class516.getWidgetFlags(var0);
				boolean var10 = (var2 & 1) != 0;
				if (var10) {
					TaskHandler.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex * -64977777, var0.id);
				}
			}
		}

	}

	@ObfuscatedName("pf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-2142318953"
	)
	static String method8720(String var0) {
		PlayerType[] var1 = WorldMapAreaData.PlayerType_values();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			PlayerType var3 = var1[var2];
			if (var3.modIcon != -1 && var0.startsWith(class82.method2754(var3.modIcon))) {
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length());
				break;
			}
		}

		return var0;
	}
}
