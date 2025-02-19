import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nu")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("ac")
	@Export("Tiles_underlays2")
	static byte[][][] Tiles_underlays2;
	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	static Archive field3819;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -90957949
	)
	@Export("width")
	public final int width;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1029185231
	)
	@Export("height")
	public final int height;
	@ObfuscatedName("au")
	@Export("xWidths")
	public final int[] xWidths;
	@ObfuscatedName("ad")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1;
		this.height = var2;
		this.xWidths = var3;
		this.xStarts = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-80"
	)
	@Export("contains")
	public boolean contains(int var1, int var2) {
		if (var2 >= 0 && var2 < this.xStarts.length) {
			int var3 = this.xStarts[var2];
			if (var1 >= var3 && var1 <= var3 + this.xWidths[var2]) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1663361682"
	)
	public static int method6849(int var0) {
		return Player.method2521(ViewportMouse.ViewportMouse_entityTags[var0]);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)[Loc;",
		garbageValue = "262439079"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.PlayerType_ultimateIronman, PlayerType.PlayerType_ironman, PlayerType.field4571, PlayerType.field4584, PlayerType.field4579, PlayerType.field4588, PlayerType.field4591, PlayerType.field4587, PlayerType.field4582, PlayerType.PlayerType_playerModerator, PlayerType.PlayerType_hardcoreIronman, PlayerType.PlayerType_normal, PlayerType.field4577, PlayerType.field4580, PlayerType.PlayerType_jagexModerator, PlayerType.field4583, PlayerType.field4586};
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(ILdy;ZI)I",
		garbageValue = "1887413158"
	)
	static int method6855(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == 8000) {
			--HealthBarConfig.Interpreter_intStackSize;
			var3 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_arrayLengths[var3];
			class219.method4460(Interpreter.Interpreter_arrays[var3], new int[var4], 0, var4 - 1);
			return 1;
		} else if (var0 == 8001) {
			HealthBarConfig.Interpreter_intStackSize -= 3;
			var3 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
			int var5 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 2];
			int var6 = Interpreter.Interpreter_arrayLengths[var3];
			if (var6 <= 1) {
				return 1;
			} else {
				class467.method8911(Interpreter.Interpreter_arrays[var3], var6, var4, var5);
				return 1;
			}
		} else {
			return 2;
		}
	}

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "423233738"
	)
	static void method6854(int var0, int var1, int var2, int var3) {
		Widget var4 = class376.widgetDefinition.getWidgetChild(var0, var1);
		if (var4 != null && var4.onTargetEnter != null) {
			ScriptEvent var5 = new ScriptEvent();
			var5.widget = var4;
			var5.args = var4.onTargetEnter;
			MilliClock.runScriptEvent(var5);
		}

		Client.selectedSpellItemId = var3;
		Client.isSpellSelected = true;
		class171.selectedSpellWidget = var0;
		Client.selectedSpellChildIndex = var1;
		Message.selectedSpellFlags = var2;
		MilliClock.invalidateWidget(var4);
	}
}
