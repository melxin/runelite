import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gs")
public class class164 extends class150 {
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lra;"
	)
	static Bounds field1882;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -442303163
	)
	int field1884;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class164(class153 var1) {
		this.this$0 = var1;
		this.field1884 = -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "1804820754"
	)
	void vmethod4162(Buffer var1) {
		this.field1884 = var1.readUnsignedShort();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lgh;I)V",
		garbageValue = "1850606911"
	)
	void vmethod4163(ClanSettings var1) {
		var1.method3991(this.field1884);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ltg;Ltg;ZI)Z",
		garbageValue = "264053196"
	)
	static boolean method4070(WorldEntity var0, WorldEntity var1, boolean var2) {
		if (var1 == var0) {
			return true;
		} else if (var1 == null) {
			return true;
		} else {
			return var0 == null ? false : var2;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILcj;ZB)I",
		garbageValue = "10"
	)
	static int method4076(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = class35.widgetDefinition.method7496(Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? class359.scriptDotWidget : GameEngine.scriptActiveWidget;
		}

		String var4 = (String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
		int[] var5 = null;
		if (!var4.isEmpty() && var4.charAt(var4.length() - 1) == 'Y') {
			int var6 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
			if (var6 > 0) {
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize]) {
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
				var9[var7] = Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
				break;
			default:
				var9[var7] = new Integer(Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize]);
			}
		}

		var7 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
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
			var3.field4299 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) {
			var3.onResize = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) {
			var3.field4292 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) {
			var3.field4243 = var9;
		} else if (var0 == 1430) {
			var3.field4288 = var9;
		} else if (var0 == 1431) {
			var3.field4289 = var9;
		} else if (var0 == 1434) {
			var3.field4300 = var9;
		} else if (var0 == 1435) {
			var3.field4319 = var9;
		} else {
			if (var0 < 1436 || var0 > 1439) {
				return 2;
			}

			class363 var8 = var3.method7964();
			if (var8 != null) {
				if (var0 == 1436) {
					var8.field4092 = var9;
				} else if (var0 == 1437) {
					var8.field4088 = var9;
				} else if (var0 == 1438) {
					var8.field4094 = var9;
				} else if (var0 == 1439) {
					var8.field4091 = var9;
				}
			}
		}

		var3.hasListener = true;
		return 1;
	}
}
