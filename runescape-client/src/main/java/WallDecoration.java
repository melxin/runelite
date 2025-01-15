import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ie")
@Implements("WallDecoration")
public final class WallDecoration {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 747575319
	)
	@Export("z")
	int z;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -2059859337
	)
	@Export("x")
	int x;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 2014411507
	)
	@Export("y")
	int y;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -191954525
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -110708295
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1357881535
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1936879603
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = -1715493241959163543L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 682103303
	)
	@Export("flags")
	int flags;

	WallDecoration() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1147398537"
	)
	public static int method4819(int var0) {
		return (var0 & class550.field5423) - 1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZI)I",
		garbageValue = "-323063316"
	)
	static int method4820(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class134.scriptDotWidget : HttpMethod.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class298.Widget_unpackTargetMask(class232.getWidgetFlags(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.CC_GETOP) {
			if (var0 == ScriptOpcodes.CC_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "";
			}

			return 1;
		}
	}
}
