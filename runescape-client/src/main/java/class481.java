import java.util.Comparator;
import java.util.Iterator;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("sn")
class class481 implements Comparator {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lst;"
	)
	final HttpHeaders this$0;

	@ObfuscatedSignature(
		descriptor = "(Lst;)V"
	)
	class481(HttpHeaders var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;I)I",
		garbageValue = "-1459066273"
	)
	int method9796(Entry var1, Entry var2) {
		return ((Float)var2.getValue()).compareTo((Float)var1.getValue());
	}

	public int compare(Object var1, Object var2) {
		return this.method9796((Entry)var1, (Entry)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILce;ZI)I",
		garbageValue = "-915124160"
	)
	static int method9804(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class392.scriptDotWidget : Interpreter.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) {
			Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) {
			if (var3.itemId != -1) {
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETID) {
			Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var3.childIndex * -64977777;
			return 1;
		} else {
			int var4;
			if (var0 == 1703) {
				var4 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
				ParamComposition var7 = Messages.getParamDefinition(var4);
				if (var7.isString()) {
					Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var3.method7907(var4, var7.defaultStr);
				} else {
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var3.method7908(var4, var7.defaultInt);
				}

				return 1;
			} else if (var0 == 1704) {
				var4 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
				Object var5 = class28.method462(var4);
				int var6 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
				var3.method7909(var6, var5);
				return 1;
			} else if (var0 == 1707) {
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var3.method7917() ? 1 : 0;
				return 1;
			} else if (var0 == 1708) {
				return class393.method8231(var3);
			} else {
				return var0 == 1709 ? class170.method4063(var3) : 2;
			}
		}
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "549740775"
	)
	static final void method9805() {
		int var0 = Client.playerUpdateManager.playerCount;
		int[] var1 = Client.playerUpdateManager.playerIndices;
		Iterator var2 = Client.worldViewManager.iterator();

		while (var2.hasNext()) {
			WorldView var3 = (WorldView)var2.next();

			for (int var4 = 0; var4 < var0; ++var4) {
				Player var5 = (Player)var3.players.get((long)var1[var4]);
				if (var5 != null) {
					Language.updateActorSequence(var3, var5, 1);
				}
			}
		}

	}
}
