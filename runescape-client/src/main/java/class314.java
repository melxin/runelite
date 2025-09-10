import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("mc")
public abstract class class314 implements class316 {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1224007117
	)
	protected int field3515;

	@ObfuscatedSignature(
		descriptor = "(Lop;Lqh;I)V"
	)
	protected class314(StudioGame var1, Language var2, int var3) {
		this.field3515 = var3;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Loi;ZI)V",
		garbageValue = "-1879972674"
	)
	static void method6971(Widget var0, boolean var1) {
		if (var0 != null) {
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 1;
			if (var1) {
				HttpRequestTask.scriptDotWidget = var0;
			} else {
				class141.scriptActiveWidget = var0;
			}
		} else {
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILcg;ZI)I",
		garbageValue = "-1981637714"
	)
	static int method6972(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = UrlRequester.widgetDefinition.method7476(Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? HttpRequestTask.scriptDotWidget : class141.scriptActiveWidget;
		}

		String var4 = (String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
		int[] var5 = null;
		if (!var4.isEmpty() && var4.charAt(var4.length() - 1) == 'Y') {
			int var6 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
			if (var6 > 0) {
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize]) {
				}
			}

			var4 = var4.substring(0, var4.length() - 1);
		}

		Object[] var9 = new Object[var4.length() + 1];

		int var7;
		for (var7 = var9.length - 1; var7 >= 1; --var7) {
			switch(var4.charAt(var7 - 1)) {
			case 'W':
			case 'X':
			case 's':
				var9[var7] = Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
				break;
			default:
				var9[var7] = new Integer(Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize]);
			}
		}

		var7 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
		if (var7 != -1) {
			var9[0] = new Integer(var7);
		} else {
			var9 = null;
		}

		if (var0 == ScriptOpcodes.CC_SETONCLICK) {
			var3.onClick = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONHOLD) {
			var3.onHold = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONRELEASE) {
			var3.onRelease = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) {
			var3.onMouseOver = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) {
			var3.onMouseLeave = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAG) {
			var3.onDrag = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) {
			var3.onTargetLeave = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) {
			var3.onVarTransmit = var9;
			var3.varTransmitTriggers = var5;
		} else if (var0 == ScriptOpcodes.CC_SETONTIMER) {
			var3.onTimer = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONOP) {
			var3.onOp = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) {
			var3.onDragComplete = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) {
			var3.onClickRepeat = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) {
			var3.onMouseRepeat = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) {
			var3.onInvTransmit = var9;
			var3.invTransmitTriggers = var5;
		} else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) {
			var3.onStatTransmit = var9;
			var3.statTransmitTriggers = var5;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) {
			var3.onTargetEnter = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) {
			var3.onScroll = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) {
			var3.onChatTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONKEY) {
			var3.onKey = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) {
			var3.onFriendTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) {
			var3.onClanTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) {
			var3.onMiscTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) {
			var3.onDialogAbort = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) {
			var3.onSubChange = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) {
			var3.onStockTransmit = var9;
		} else if (var0 == 1426) {
			var3.field4273 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) {
			var3.onResize = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) {
			var3.field4280 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) {
			var3.field4266 = var9;
		} else if (var0 == 1430) {
			var3.field4261 = var9;
		} else if (var0 == 1431) {
			var3.field4159 = var9;
		} else if (var0 == 1434) {
			var3.field4176 = var9;
		} else if (var0 == 1435) {
			var3.field4302 = var9;
		} else {
			if (var0 < 1436 || var0 > 1439) {
				return 2;
			}

			class364 var8 = var3.method7974();
			if (var8 != null) {
				if (var0 == 1436) {
					var8.field4068 = var9;
				} else if (var0 == 1437) {
					var8.field4069 = var9;
				} else if (var0 == 1438) {
					var8.field4070 = var9;
				} else if (var0 == 1439) {
					var8.field4067 = var9;
				}
			}
		}

		var3.hasListener = true;
		return 1;
	}
}
