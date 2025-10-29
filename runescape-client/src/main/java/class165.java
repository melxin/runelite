import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gy")
public class class165 extends class151 {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -850750113
	)
	int field1875;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfc;"
	)
	final class154 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfc;)V"
	)
	class165(class154 var1) {
		this.this$0 = var1;
		this.field1875 = -1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxa;B)V",
		garbageValue = "-11"
	)
	void vmethod4235(Buffer var1) {
		this.field1875 = var1.readUnsignedShort();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lgs;B)V",
		garbageValue = "-98"
	)
	void vmethod4241(ClanSettings var1) {
		var1.method4061(this.field1875);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1858158130"
	)
	@Export("changeWorldSelectSorting")
	static void changeWorldSelectSorting(int var0, int var1) {
		int[] var2 = new int[4];
		int[] var3 = new int[4];
		var2[0] = var0;
		var3[0] = var1;
		int var4 = 1;

		for (int var5 = 0; var5 < 4; ++var5) {
			if (World.World_sortOption1[var5] != var0) {
				var2[var4] = World.World_sortOption1[var5];
				var3[var4] = World.World_sortOption2[var5];
				++var4;
			}
		}

		World.World_sortOption1 = var2;
		World.World_sortOption2 = var3;
		class154.sortWorlds(World.World_worlds, 0, World.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ILcu;ZI)I",
		garbageValue = "-1510379402"
	)
	static int method4147(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) {
			var3 = class226.widgetDefinition.method7728(Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize]);
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) {
			var3 = class226.widgetDefinition.method7728(Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize]);
			if (var3.itemId != -1) {
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else {
			int var7;
			if (var0 == ScriptOpcodes.IF_HASSUB) {
				var7 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
				InterfaceParent var10 = (InterfaceParent)Client.interfaceParents.get((long)var7);
				if (var10 != null) {
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 1;
				} else {
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == 2703) {
				class408.Interpreter_intStackSize -= 3;
				var7 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
				Widget var8 = class226.widgetDefinition.getWidgetChild(Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 2]);
				ParamComposition var9 = WorldMap.getParamDefinition(var7);
				if (var9.isString()) {
					Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var8.method8283(var7, var9.defaultStr);
				} else {
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var8.method8315(var7, var9.defaultInt);
				}

				return 1;
			} else if (var0 == 2704) {
				class408.Interpreter_intStackSize -= 3;
				var3 = class226.widgetDefinition.getWidgetChild(Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1]);
				int var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 2];
				Object var5 = class39.method816(var4);
				int var6 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
				var3.method8175(var6, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.IF_GETTOP) {
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Client.rootInterface;
				return 1;
			} else if (var0 == 2707) {
				var3 = class226.widgetDefinition.method7728(Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.method8183() ? 1 : 0;
				return 1;
			} else if (var0 == 2708) {
				var3 = class226.widgetDefinition.method7728(Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize]);
				return FriendSystem.method1655(var3);
			} else if (var0 == 2709) {
				var3 = class226.widgetDefinition.method7728(Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize]);
				return class28.method465(var3);
			} else {
				return 2;
			}
		}
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(Lwh;I)Ljava/lang/Object;",
		garbageValue = "790883686"
	)
	static Object method4143(class586 var0) {
		if (var0 == null) {
			throw new IllegalStateException("popValueOfType() failure - null baseVarType");
		} else {
			switch(var0.field5941) {
			case 0:
				return Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
			case 3:
				return Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type");
			}
		}
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "76"
	)
	static final void method4149() {
		if (Client.logoutTimer > 0) {
			class30.logOut();
		} else {
			Client.timer.method8499();
			WorldMapSectionType.updateGameState(40);
			FadeInTask.field5377 = Client.packetWriter.getSocket();
			Client.packetWriter.removeSocket();
		}
	}
}
