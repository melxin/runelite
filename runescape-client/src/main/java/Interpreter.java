import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bw")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("ah")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("ac")
	static final double field631;
	@ObfuscatedName("aa")
	@Export("Interpreter_intLocals")
	static int[] Interpreter_intLocals;
	@ObfuscatedName("ad")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("as")
	@Export("Interpreter_objectStack")
	static Object[] Interpreter_objectStack;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -606442037
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Lbo;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1130119745
	)
	static int field632;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	static class367 field642;
	@ObfuscatedName("aw")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("am")
	static boolean field640;
	@ObfuscatedName("al")
	static boolean field641;
	@ObfuscatedName("ay")
	static ArrayList field626;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 793278933
	)
	static int field629;

	static {
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		field631 = Math.log(2.0D);
		Interpreter_intStack = new int[1000];
		Interpreter_objectStack = new Object[1000];
		Interpreter_frameDepth = 0;
		Interpreter_frames = new ScriptFrame[50];
		field632 = 0;
		field642 = new class367();
		Interpreter_calendar = java.util.Calendar.getInstance();
		field640 = false;
		field641 = false;
		field626 = new ArrayList();
		field629 = 0;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILcj;ZB)I",
		garbageValue = "32"
	)
	static int method1781(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class359.scriptDotWidget : GameEngine.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) {
			Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) {
			Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else {
			class365 var7;
			if (var0 == ScriptOpcodes.CC_GETTEXT) {
				if (var3.type == 12) {
					var7 = var3.method8041();
					if (var7 != null) {
						Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var7.method7656().method9426();
						return 1;
					}
				}

				Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var3.text;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) {
				Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.scrollWidth;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) {
				Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.scrollHeight;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) {
				Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.modelZoom;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) {
				Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.modelAngleX;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) {
				Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.modelAngleZ;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) {
				Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.modelAngleY;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETTRANS) {
				Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.transparencyTop;
				return 1;
			} else if (var0 == 1610) {
				Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.transparencyBot;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) {
				Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.color;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) {
				Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.color2;
				return 1;
			} else if (var0 == 1613) {
				Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) {
				Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
				return 1;
			} else {
				class359 var4;
				if (var0 == 1617) {
					var4 = var3.method7921();
					Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var4 != null ? var4.field4074 : 0;
				}

				if (var0 == 1618) {
					var4 = var3.method7921();
					Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var4 != null ? var4.field4069 : 0;
					return 1;
				} else if (var0 == 1619) {
					var7 = var3.method8041();
					Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var7 != null ? var7.method7665().method9426() : "";
					return 1;
				} else if (var0 == 1620) {
					var4 = var3.method7921();
					Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var4 != null ? var4.field4070 : 0;
					return 1;
				} else if (var0 == 1621) {
					var7 = var3.method8041();
					Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var7 != null ? var7.method7667() : 0;
					return 1;
				} else if (var0 == 1622) {
					var7 = var3.method8041();
					Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var7 != null ? var7.method7758() : 0;
					return 1;
				} else if (var0 == 1623) {
					var7 = var3.method8041();
					Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var7 != null ? var7.method7669() : 0;
					return 1;
				} else if (var0 == 1624) {
					var7 = var3.method8041();
					Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var7 != null && var7.method7826() ? 1 : 0;
					return 1;
				} else if (var0 != 1625) {
					if (var0 == 1626) {
						var7 = var3.method8041();
						Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var7 != null ? var7.method7658().method9583() : "";
						return 1;
					} else if (var0 == 1627) {
						var7 = var3.method8041();
						int var5 = var7 != null ? var7.method7647() : 0;
						int var6 = var7 != null ? var7.method7781() : 0;
						Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Math.min(var5, var6);
						Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Math.max(var5, var6);
						return 1;
					} else if (var0 == 1628) {
						var7 = var3.method8041();
						Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var7 != null ? var7.method7781() : 0;
						return 1;
					} else if (var0 == 1629) {
						var7 = var3.method8041();
						Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var7 != null ? var7.method7672() : 0;
						return 1;
					} else if (var0 == 1630) {
						var7 = var3.method8041();
						Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var7 != null ? var7.method7659() : 0;
						return 1;
					} else if (var0 == 1631) {
						var7 = var3.method8041();
						Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var7 != null ? var7.method7689() : 0;
						return 1;
					} else if (var0 == 1632) {
						var7 = var3.method8041();
						Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var7 != null ? var7.method7675() : 0;
						return 1;
					} else {
						class27 var8;
						if (var0 == 1633) {
							var8 = var3.method7963();
							Interpreter_intStack[UrlRequest.Interpreter_intStackSize - 1] = var8 != null ? var8.method408(Interpreter_intStack[UrlRequest.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else if (var0 == 1634) {
							var8 = var3.method7963();
							Interpreter_intStack[UrlRequest.Interpreter_intStackSize - 1] = var8 != null ? var8.method426((char)Interpreter_intStack[UrlRequest.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var7 = var3.method8041();
					Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var7 != null && var7.method7660() ? 1 : 0;
					return 1;
				}
			}
		}
	}
}
