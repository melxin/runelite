import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bo")
public class class33 {
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = 1866852397
	)
	static int field174;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -721337871
	)
	int field170;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 834760595
	)
	int field171;

	class33(int var1, int var2) {
		this.field170 = var1;
		this.field171 = var2;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lbi;I)Z",
		garbageValue = "-1598817630"
	)
	boolean method500(class29 var1) {
		if (var1 == null) {
			return false;
		} else {
			switch(this.field170) {
			case 1:
				return var1.vmethod6115(this.field171);
			case 2:
				return var1.vmethod6123(this.field171);
			case 3:
				return var1.vmethod6117((char)this.field171);
			case 4:
				return var1.vmethod6119(this.field171 == 1);
			default:
				return false;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1426971814"
	)
	static void method502(int var0) {
		class442.field5140 = var0;
		class453.field5178 = new class453[var0];
		DevicePcmPlayerProvider.field91 = 0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIII)F",
		garbageValue = "387159712"
	)
	static float method506(int var0, int var1, int var2) {
		return (float)(var0 - var1) / (float)(var2 - var1);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;ZI)Lvx;",
		garbageValue = "1544135680"
	)
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(Canvas.cacheDir, "preferences" + var0 + ".dat");
		if (var3.exists()) {
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L);
				return var10;
			} catch (IOException var9) {
			}
		}

		String var4 = "";
		if (UserComparator9.cacheGamebuild == 33) {
			var4 = "_rc";
		} else if (UserComparator9.cacheGamebuild == 34) {
			var4 = "_wip";
		}

		File var5 = new File(class82.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
		AccessFile var6;
		if (!var2 && var5.exists()) {
			try {
				var6 = new AccessFile(var5, "rw", 10000L);
				return var6;
			} catch (IOException var8) {
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L);
			return var6;
		} catch (IOException var7) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ILcg;ZB)I",
		garbageValue = "12"
	)
	static int method504(int var0, Script var1, boolean var2) {
		Widget var3 = UrlRequester.widgetDefinition.method7476(Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETX) {
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETY) {
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) {
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.width * 469894397;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.height * 1156037777;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) {
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) {
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}
}
