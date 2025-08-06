import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ff")
public class class134 {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -286542191
	)
	public final int field1606;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lrr;"
	)
	final TransformationMatrix[] field1604;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	public class134 field1616;
	@ObfuscatedName("av")
	float[][] field1611;
	@ObfuscatedName("au")
	boolean field1608;
	@ObfuscatedName("as")
	boolean field1609;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lrr;"
	)
	TransformationMatrix[] field1610;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Lrr;"
	)
	TransformationMatrix[] field1605;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lrr;"
	)
	TransformationMatrix field1612;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lrr;"
	)
	TransformationMatrix field1613;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lrr;"
	)
	TransformationMatrix field1614;
	@ObfuscatedName("ay")
	float[][] field1615;
	@ObfuscatedName("aa")
	float[][] field1617;
	@ObfuscatedName("ai")
	float[][] field1607;

	@ObfuscatedSignature(
		descriptor = "(ILwj;Z)V"
	)
	public class134(int var1, Buffer var2, boolean var3) {
		this.field1608 = true;
		this.field1609 = true;
		this.field1612 = new TransformationMatrix();
		this.field1613 = new TransformationMatrix();
		this.field1614 = new TransformationMatrix();
		this.field1606 = var2.readShort();
		this.field1604 = new TransformationMatrix[var1];
		this.field1610 = new TransformationMatrix[this.field1604.length];
		this.field1605 = new TransformationMatrix[this.field1604.length];
		this.field1611 = new float[this.field1604.length][3];

		for (int var4 = 0; var4 < this.field1604.length; ++var4) {
			this.field1604[var4] = new TransformationMatrix(var2, var3);
			this.field1611[var4][0] = var2.method11235();
			this.field1611[var4][1] = var2.method11235();
			this.field1611[var4][2] = var2.method11235();
		}

		this.method3594();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-673487247"
	)
	void method3594() {
		this.field1615 = new float[this.field1604.length][3];
		this.field1617 = new float[this.field1604.length][3];
		this.field1607 = new float[this.field1604.length][3];
		TransformationMatrix var1 = class166.method4019();

		for (int var2 = 0; var2 < this.field1604.length; ++var2) {
			TransformationMatrix var3 = this.method3595(var2);
			var1.method9110(var3);
			var1.method9119();
			this.field1615[var2] = var1.method9114();
			this.field1617[var2][0] = var3.field5074[12];
			this.field1617[var2][1] = var3.field5074[13];
			this.field1617[var2][2] = var3.field5074[14];
			this.field1607[var2] = var3.method9143();
		}

		var1.method9104();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)Lrr;",
		garbageValue = "-19"
	)
	TransformationMatrix method3595(int var1) {
		return this.field1604[var1];
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)Lrr;",
		garbageValue = "-109"
	)
	TransformationMatrix method3596(int var1) {
		if (this.field1610[var1] == null) {
			this.field1610[var1] = new TransformationMatrix(this.method3595(var1));
			if (this.field1616 != null) {
				this.field1610[var1].method9172(this.field1616.method3596(var1));
			} else {
				this.field1610[var1].method9172(TransformationMatrix.field5075);
			}
		}

		return this.field1610[var1];
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Lrr;",
		garbageValue = "150306050"
	)
	TransformationMatrix method3603(int var1) {
		if (this.field1605[var1] == null) {
			this.field1605[var1] = new TransformationMatrix(this.method3596(var1));
			this.field1605[var1].method9119();
		}

		return this.field1605[var1];
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Lrr;",
		garbageValue = "58"
	)
	TransformationMatrix method3611() {
		return this.field1612;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lrr;I)V",
		garbageValue = "-1309755111"
	)
	void method3599(TransformationMatrix var1) {
		this.field1612.method9110(var1);
		this.field1608 = true;
		this.field1609 = true;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lrr;",
		garbageValue = "123032595"
	)
	TransformationMatrix method3600() {
		if (this.field1608) {
			this.field1613.method9110(this.method3611());
			if (this.field1616 != null) {
				this.field1613.method9172(this.field1616.method3600());
			}

			this.field1608 = false;
		}

		return this.field1613;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Lrr;",
		garbageValue = "348592656"
	)
	public TransformationMatrix method3601(int var1) {
		if (this.field1609) {
			this.field1614.method9110(this.method3603(var1));
			this.field1614.method9172(this.method3600());
			this.field1609 = false;
		}

		return this.field1614;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "186663380"
	)
	float[] method3602(int var1) {
		return this.field1615[var1];
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "-796096947"
	)
	float[] method3607(int var1) {
		return this.field1617[var1];
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IS)[F",
		garbageValue = "-18228"
	)
	float[] method3604(int var1) {
		return this.field1607[var1];
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)[Ldk;",
		garbageValue = "3"
	)
	static AttackOption[] method3632() {
		return new AttackOption[]{AttackOption.field1193, AttackOption.field1197, AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_hidden, AttackOption.AttackOption_dependsOnCombatLevels};
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1643059511"
	)
	public static void method3608() {
		ItemComposition.ItemDefinition_cachedSprites.clear();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILce;ZI)I",
		garbageValue = "1247014261"
	)
	static int method3631(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = class167.widgetDefinition.method7456(Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? class392.scriptDotWidget : Interpreter.scriptActiveWidget;
		}

		String var4 = (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
		int[] var5 = null;
		if (!var4.isEmpty() && var4.charAt(var4.length() - 1) == 'Y') {
			int var6 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
			if (var6 > 0) {
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize]) {
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
				var9[var7] = new Integer(Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize]);
			}
		}

		var7 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
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
			var3.field4104 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) {
			var3.onResize = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) {
			var3.field4088 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) {
			var3.field4188 = var9;
		} else if (var0 == 1430) {
			var3.field4183 = var9;
		} else if (var0 == 1431) {
			var3.field4184 = var9;
		} else if (var0 == 1434) {
			var3.field4089 = var9;
		} else if (var0 == 1435) {
			var3.field4116 = var9;
		} else {
			if (var0 < 1436 || var0 > 1439) {
				return 2;
			}

			class362 var8 = var3.method7931();
			if (var8 != null) {
				if (var0 == 1436) {
					var8.field3985 = var9;
				} else if (var0 == 1437) {
					var8.field3989 = var9;
				} else if (var0 == 1438) {
					var8.field3984 = var9;
				} else if (var0 == 1439) {
					var8.field3987 = var9;
				}
			}
		}

		var3.hasListener = true;
		return 1;
	}
}
