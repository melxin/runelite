import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fx")
@Implements("LoginPacket")
public class LoginPacket extends class151 {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		longValue = 7034894779562949755L
	)
	long field1752;
	@ObfuscatedName("at")
	String field1751;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfc;"
	)
	final class154 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfc;)V"
	)
	LoginPacket(class154 var1) {
		this.this$0 = var1;
		this.field1752 = -1L;
		this.field1751 = null;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxa;B)V",
		garbageValue = "-11"
	)
	void vmethod4235(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			var1.offset -= 1741769013;
			this.field1752 = var1.readLong();
		}

		this.field1751 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lgs;B)V",
		garbageValue = "-98"
	)
	void vmethod4241(ClanSettings var1) {
		var1.method4057(this.field1752, this.field1751, 0);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1070777750"
	)
	@Export("Widget_unpackTargetMask")
	public static int Widget_unpackTargetMask(int var0) {
		return var0 >> 11 & 63;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxa;Lkb;IIB)V",
		garbageValue = "-1"
	)
	public static void method3958(Buffer var0, WorldEntityCoord var1, int var2, int var3) {
		var1.method6487(Coord.method7702(var2), Coord.method7702(var3));
		var1.setZ(0);
		var1.setCurrentRotationAngle(0);
		byte var4 = var0.readByte();
		if (var4 != 0) {
			int var5 = HttpRequestTask.method291(var0, var4, 0);
			int var6 = HttpRequestTask.method291(var0, var4, 2);
			int var7 = HttpRequestTask.method291(var0, var4, 4);
			int var8 = HttpRequestTask.method291(var0, var4, 6);
			var1.method6459(var5, var6, var7, var8);
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILcu;ZI)I",
		garbageValue = "-364498099"
	)
	static int method3954(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = class226.widgetDefinition.method7728(Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
		}

		String var4 = (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
		int[] var5 = null;
		if (!var4.isEmpty() && var4.charAt(var4.length() - 1) == 'Y') {
			int var6 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
			if (var6 > 0) {
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize]) {
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
				var9[var7] = Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
				break;
			default:
				var9[var7] = new Integer(Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize]);
			}
		}

		var7 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
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
			var3.field4341 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) {
			var3.onResize = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) {
			var3.field4336 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) {
			var3.field4335 = var9;
		} else if (var0 == 1430) {
			var3.field4330 = var9;
		} else if (var0 == 1431) {
			var3.field4331 = var9;
		} else if (var0 == 1434) {
			var3.field4245 = var9;
		} else if (var0 == 1435) {
			var3.field4326 = var9;
		} else {
			if (var0 < 1436 || var0 > 1439) {
				return 2;
			}

			class376 var8 = var3.method8197();
			if (var8 != null) {
				if (var0 == 1436) {
					var8.field4139 = var9;
				} else if (var0 == 1437) {
					var8.field4135 = var9;
				} else if (var0 == 1438) {
					var8.field4137 = var9;
				} else if (var0 == 1439) {
					var8.field4138 = var9;
				}
			}
		}

		var3.hasListener = true;
		return 1;
	}
}
