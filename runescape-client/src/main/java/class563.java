import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ve")
public class class563 implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lve;"
	)
	public static final class563 field5600;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lve;"
	)
	public static final class563 field5594;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lve;"
	)
	public static final class563 field5595;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lve;"
	)
	static final class563 field5593;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1248834747
	)
	public final int field5596;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1372458551
	)
	public final int field5598;
	@ObfuscatedName("aa")
	public final Class field5597;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lvq;"
	)
	public final class558 field5599;

	static {
		field5600 = new class563(3, 0, Integer.class, new class559());
		field5594 = new class563(2, 1, Long.class, new class562());
		field5595 = new class563(0, 2, String.class, new class564());
		field5593 = new class563(1, 5, class509.class, new class560());
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/Class;Lvq;)V"
	)
	class563(int var1, int var2, Class var3, class558 var4) {
		this.field5596 = var1;
		this.field5598 = var2;
		this.field5597 = var3;
		this.field5599 = var4;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "26"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5598;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lwt;B)Ljava/lang/Object;",
		garbageValue = "3"
	)
	public Object method10636(Buffer var1) {
		return this.field5599.vmethod10657(var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[Lve;",
		garbageValue = "1767468630"
	)
	public static class563[] method10641() {
		return new class563[]{field5594, field5595, field5593, field5600};
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;I)Lve;",
		garbageValue = "504676340"
	)
	public static class563 method10644(Class var0) {
		class563[] var1 = method10641();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class563 var3 = var1[var2];
			if (var3.field5597 == var0) {
				return var3;
			}
		}

		return null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ltp;ILjava/lang/Object;I)V",
		garbageValue = "2074141572"
	)
	public static void method10648(class509 var0, int var1, Object var2) {
		class573.method10775(var0);
		if (var1 >= 0 && var1 <= var0.field5287 * 935110769) {
			var0.method9941(var0.field5287 * 935110769 + 1);
			if (var1 < var0.field5287 * 935110769) {
				ClanChannel.method3879(var0, var1, var0, var1 + 1, var0.field5287 * 935110769 - var1);
			}

			var0.method9939(var1, var2);
			var0.field5287 += 1090132113;
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ILcr;ZI)I",
		garbageValue = "-367562232"
	)
	static int method10633(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) {
			var3 = ClientPreferences.widgetDefinition.method7286(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) {
			var3 = ClientPreferences.widgetDefinition.method7286(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
			if (var3.itemId != -1) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else {
			int var7;
			if (var0 == ScriptOpcodes.IF_HASSUB) {
				var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				InterfaceParent var10 = (InterfaceParent)Client.interfaceParents.get((long)var7);
				if (var10 != null) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == 2703) {
				Interpreter.Interpreter_intStackSize -= 3;
				var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				Widget var8 = ClientPreferences.widgetDefinition.getWidgetChild(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]);
				ParamComposition var9 = TaskHandler.getParamDefinition(var7);
				if (var9.isString()) {
					Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = var8.method7752(var7, var9.defaultStr);
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var8.method7753(var7, var9.defaultInt);
				}

				return 1;
			} else if (var0 == 2704) {
				Interpreter.Interpreter_intStackSize -= 3;
				var3 = ClientPreferences.widgetDefinition.getWidgetChild(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
				int var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
				Object var5 = PlayerType.method7974(var4);
				int var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				var3.method7754(var6, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.IF_GETTOP) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.rootInterface;
				return 1;
			} else if (var0 == 2707) {
				var3 = ClientPreferences.widgetDefinition.method7286(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method7841() ? 1 : 0;
				return 1;
			} else if (var0 == 2708) {
				var3 = ClientPreferences.widgetDefinition.method7286(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
				return DevicePcmPlayerProvider.method327(var3);
			} else if (var0 == 2709) {
				var3 = ClientPreferences.widgetDefinition.method7286(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
				return class114.method3308(var3);
			} else {
				return 2;
			}
		}
	}
}
