import javax.imageio.ImageIO;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bd")
public class class30 {
	@ObfuscatedName("at")
	public static short[] field149;

	static {
		ImageIO.setUseCache(false);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lxt;IIIB)V",
		garbageValue = "32"
	)
	static void method467(SpritePixels var0, int var1, int var2, int var3) {
		WorldMapRegion.WorldMapRegion_cachedSprites.put(var0, RouteStrategy.method6239(var1, var2, var3), var0.pixels.length * 4);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II)I",
		garbageValue = "-110213457"
	)
	public static int method469(CharSequence var0, int var1) {
		return StudioGame.method8195(var0, var1, true);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "11"
	)
	public static int method472(int var0) {
		if (var0 > 0) {
			return 1;
		} else {
			return var0 < 0 ? -1 : 0;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILcg;ZI)I",
		garbageValue = "-394401110"
	)
	static int method473(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? HttpRequestTask.scriptDotWidget : class141.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) {
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) {
			if (var3.itemId != -1) {
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETID) {
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.childIndex * -217986249;
			return 1;
		} else {
			int var4;
			if (var0 == 1703) {
				var4 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
				ParamComposition var7 = PcmPlayer.getParamDefinition(var4);
				if (var7.isString()) {
					Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var3.method8004(var4, var7.defaultStr);
				} else {
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.method7951(var4, var7.defaultInt);
				}

				return 1;
			} else if (var0 == 1704) {
				var4 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
				Object var5 = SecureRandomCallable.method2082(var4);
				int var6 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
				var3.method7952(var6, var5);
				return 1;
			} else if (var0 == 1707) {
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.method8100() ? 1 : 0;
				return 1;
			} else if (var0 == 1708) {
				return class324.method7032(var3);
			} else {
				return var0 == 1709 ? class178.method4156(var3) : 2;
			}
		}
	}
}
