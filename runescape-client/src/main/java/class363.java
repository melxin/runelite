import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("na")
public class class363 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	public class365 field4093;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	class359 field4089;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lba;"
	)
	class27 field4090;
	@ObfuscatedName("aj")
	public Object[] field4091;
	@ObfuscatedName("ah")
	public Object[] field4092;
	@ObfuscatedName("af")
	public Object[] field4088;
	@ObfuscatedName("ae")
	public Object[] field4094;

	class363() {
		this.field4093 = new class365();
		this.field4089 = new class359();
		this.field4090 = new class27();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILcj;ZB)I",
		garbageValue = "126"
	)
	static int method7534(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class359.scriptDotWidget : GameEngine.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = AsyncRestClient.Widget_unpackTargetMask(MouseRecorder.getWidgetFlags(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.CC_GETOP) {
			if (var0 == ScriptOpcodes.CC_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
			}

			return 1;
		}
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "636250229"
	)
	static final void method7535() {
		if (ClientPreferences.ClanChat_inClanChat) {
			if (class445.friendsChat != null) {
				class445.friendsChat.sort();
			}

			LoginState.method794();
			ClientPreferences.ClanChat_inClanChat = false;
		}

	}
}
