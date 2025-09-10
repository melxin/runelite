import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("sc")
@Implements("SwapSongTask")
public class SwapSongTask extends SongTask {
	@ObfuscatedSignature(
		descriptor = "(Lsi;)V"
	)
	public SwapSongTask(SongTask var1) {
		super(var1);
		super.field5303 = "SwapSongTask";
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "40"
	)
	public boolean vmethod9673() {
		if (class339.midiRequests.size() > 1 && class339.midiRequests.get(0) != null && ((MidiRequest)class339.midiRequests.get(0)).midiPcmStream.isReady() && class339.midiRequests.get(1) != null && ((MidiRequest)class339.midiRequests.get(1)).midiPcmStream.isReady()) {
			MidiRequest var1 = (MidiRequest)class339.midiRequests.get(0);
			class339.midiRequests.set(0, class339.midiRequests.get(1));
			class339.midiRequests.set(1, var1);
		}

		return true;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ILcg;ZI)I",
		garbageValue = "-1918308418"
	)
	static int method9643(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) {
			var3 = UrlRequester.widgetDefinition.method7476(Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize]);
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) {
			var3 = UrlRequester.widgetDefinition.method7476(Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize]);
			if (var3.itemId != -1) {
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else {
			int var7;
			if (var0 == ScriptOpcodes.IF_HASSUB) {
				var7 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
				InterfaceParent var10 = (InterfaceParent)Client.interfaceParents.get((long)var7);
				if (var10 != null) {
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 1;
				} else {
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == 2703) {
				UserComparator7.Interpreter_intStackSize -= 3;
				var7 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
				Widget var8 = UrlRequester.widgetDefinition.getWidgetChild(Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 2]);
				ParamComposition var9 = PcmPlayer.getParamDefinition(var7);
				if (var9.isString()) {
					Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var8.method8004(var7, var9.defaultStr);
				} else {
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var8.method7951(var7, var9.defaultInt);
				}

				return 1;
			} else if (var0 == 2704) {
				UserComparator7.Interpreter_intStackSize -= 3;
				var3 = UrlRequester.widgetDefinition.getWidgetChild(Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize], Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1]);
				int var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 2];
				Object var5 = SecureRandomCallable.method2082(var4);
				int var6 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
				var3.method7952(var6, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.IF_GETTOP) {
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Client.rootInterface;
				return 1;
			} else if (var0 == 2707) {
				var3 = UrlRequester.widgetDefinition.method7476(Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.method8100() ? 1 : 0;
				return 1;
			} else if (var0 == 2708) {
				var3 = UrlRequester.widgetDefinition.method7476(Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize]);
				return class324.method7032(var3);
			} else if (var0 == 2709) {
				var3 = UrlRequester.widgetDefinition.method7476(Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize]);
				return class178.method4156(var3);
			} else {
				return 2;
			}
		}
	}
}
