import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("sv")
public final class class487 implements Comparable {
	@ObfuscatedName("al")
	Object field5259;
	@ObfuscatedName("ab")
	Object field5260;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = -1688440807920381891L
	)
	long field5257;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		longValue = 6152567500610307137L
	)
	long field5258;

	class487(Object var1, Object var2) {
		this.field5259 = var1;
		this.field5260 = var2;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lsv;I)I",
		garbageValue = "-120238080"
	)
	int method9858(class487 var1) {
		if (this.field5258 < var1.field5258) {
			return -1;
		} else {
			return this.field5258 > var1.field5258 ? 1 : 0;
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof class487) {
			return this.field5260.equals(((class487)var1).field5260);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public int hashCode() {
		return this.field5260.hashCode();
	}

	public int compareTo(Object var1) {
		return this.method9858((class487)var1);
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ILce;ZI)I",
		garbageValue = "254767734"
	)
	static int method9868(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) {
			var3 = class167.widgetDefinition.method7456(Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize]);
			Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) {
			var3 = class167.widgetDefinition.method7456(Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize]);
			if (var3.itemId != -1) {
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else {
			int var7;
			if (var0 == ScriptOpcodes.IF_HASSUB) {
				var7 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
				InterfaceParent var10 = (InterfaceParent)Client.interfaceParents.get((long)var7);
				if (var10 != null) {
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 1;
				} else {
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == 2703) {
				AbstractWorldMapIcon.Interpreter_intStackSize -= 3;
				var7 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
				Widget var8 = class167.widgetDefinition.getWidgetChild(Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 2]);
				ParamComposition var9 = Messages.getParamDefinition(var7);
				if (var9.isString()) {
					Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var8.method7907(var7, var9.defaultStr);
				} else {
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var8.method7908(var7, var9.defaultInt);
				}

				return 1;
			} else if (var0 == 2704) {
				AbstractWorldMapIcon.Interpreter_intStackSize -= 3;
				var3 = class167.widgetDefinition.getWidgetChild(Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize], Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1]);
				int var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 2];
				Object var5 = class28.method462(var4);
				int var6 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
				var3.method7909(var6, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.IF_GETTOP) {
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = Client.rootInterface;
				return 1;
			} else if (var0 == 2707) {
				var3 = class167.widgetDefinition.method7456(Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var3.method7917() ? 1 : 0;
				return 1;
			} else if (var0 == 2708) {
				var3 = class167.widgetDefinition.method7456(Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize]);
				return class393.method8231(var3);
			} else if (var0 == 2709) {
				var3 = class167.widgetDefinition.method7456(Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize]);
				return class170.method4063(var3);
			} else {
				return 2;
			}
		}
	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "174412359"
	)
	static void method9869(int var0, int var1, int var2, int var3, int var4) {
		class82.method2750(class81.worldView, var0, var1, var2, var3, var4);
	}
}
