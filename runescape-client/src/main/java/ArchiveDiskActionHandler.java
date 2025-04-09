import java.util.Collections;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("pn")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lqx;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	public static final NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("an")
	static final Object field4664;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lqx;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	public static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1737400237
	)
	static int field4668;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque();
		field4664 = new Object();
		ArchiveDiskActionHandler_responseQueue = new NodeDeque();
		field4668 = 0;
	}

	ArchiveDiskActionHandler() {
	}

	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized(ArchiveDiskActionHandler_requestQueue) {
					var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last();
				}

				if (var1 != null) {
					if (var1.type == 0) {
						var1.archiveDisk.write((int)var1.key, var1.data, var1.data.length);
						synchronized(ArchiveDiskActionHandler_requestQueue) {
							var1.remove();
						}
					} else if (var1.type == 1) {
						var1.data = var1.archiveDisk.read((int)var1.key);
						synchronized(ArchiveDiskActionHandler_requestQueue) {
							ArchiveDiskActionHandler_responseQueue.addFirst(var1);
						}
					}

					synchronized(field4664) {
						if (field4668 <= 1) {
							field4668 = 0;
							field4664.notifyAll();
							return;
						}

						field4668 = 600;
					}
				} else {
					WorldMapRectangle.method6331(100L);
					synchronized(field4664) {
						if (field4668 <= 1) {
							field4668 = 0;
							field4664.notifyAll();
							return;
						}

						--field4668;
					}
				}
			}
		} catch (Exception var13) {
			class290.RunException_sendStackTrace((String)null, var13);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)I",
		garbageValue = "2"
	)
	public static int method7628(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if (var4 <= 127) {
				++var2;
			} else if (var4 <= 2047) {
				var2 += 2;
			} else {
				var2 += 3;
			}
		}

		return var2;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([I[IB)V",
		garbageValue = "20"
	)
	public static void method7622(int[] var0, int[] var1) {
		if (var0 != null && var1 != null) {
			WorldEntityCoord.ByteArrayPool_alternativeSizes = var0;
			class149.ByteArrayPool_altSizeArrayCounts = new int[var0.length];
			class240.ByteArrayPool_arrays = new byte[var0.length][][];

			for (int var2 = 0; var2 < WorldEntityCoord.ByteArrayPool_alternativeSizes.length; ++var2) {
				class240.ByteArrayPool_arrays[var2] = new byte[var1[var2]][];
				ByteArrayPool.field5069.add(var0[var2]);
			}

			Collections.sort(ByteArrayPool.field5069);
		} else {
			WorldEntityCoord.ByteArrayPool_alternativeSizes = null;
			class149.ByteArrayPool_altSizeArrayCounts = null;
			class240.ByteArrayPool_arrays = null;
			ByteArrayPool.field5069.clear();
			ByteArrayPool.field5069.add(100);
			ByteArrayPool.field5069.add(5000);
			ByteArrayPool.field5069.add(10000);
			ByteArrayPool.field5069.add(30000);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([Lql;II)Lql;",
		garbageValue = "-627451661"
	)
	@Export("findEnumerated")
	public static Enum findEnumerated(Enum[] var0, int var1) {
		Enum[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			Enum var4 = var2[var3];
			if (var1 == var4.rsOrdinal()) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILdb;ZB)I",
		garbageValue = "5"
	)
	static int method7627(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = class232.widgetDefinition.method6951(Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? class156.scriptDotWidget : SoundCache.scriptActiveWidget;
		}

		String var4 = Interpreter.Interpreter_stringStack[--class338.Interpreter_stringStackSize];
		int[] var5 = null;
		if (!var4.isEmpty() && var4.charAt(var4.length() - 1) == 'Y') {
			int var6 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
			if (var6 > 0) {
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize]) {
				}
			}

			var4 = var4.substring(0, var4.length() - 1);
		}

		Object[] var9 = new Object[var4.length() + 1];

		int var7;
		for (var7 = var9.length - 1; var7 >= 1; --var7) {
			if (var4.charAt(var7 - 1) == 's') {
				var9[var7] = Interpreter.Interpreter_stringStack[--class338.Interpreter_stringStackSize];
			} else {
				var9[var7] = new Integer(Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize]);
			}
		}

		var7 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
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
			var3.field4015 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) {
			var3.onResize = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) {
			var3.field4060 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) {
			var3.field4010 = var9;
		} else if (var0 == 1430) {
			var3.field4056 = var9;
		} else if (var0 == 1431) {
			var3.field4057 = var9;
		} else if (var0 == 1434) {
			var3.field4068 = var9;
		} else if (var0 == 1435) {
			var3.field4052 = var9;
		} else {
			if (var0 < 1436 || var0 > 1439) {
				return 2;
			}

			class359 var8 = var3.method7380();
			if (var8 != null) {
				if (var0 == 1436) {
					var8.field3871 = var9;
				} else if (var0 == 1437) {
					var8.field3867 = var9;
				} else if (var0 == 1438) {
					var8.field3873 = var9;
				} else if (var0 == 1439) {
					var8.field3870 = var9;
				}
			}
		}

		var3.hasListener = true;
		return 1;
	}
}
