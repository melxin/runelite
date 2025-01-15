import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("aw")
@Implements("HttpRequestTask")
public class HttpRequestTask implements Callable {
	@ObfuscatedName("ml")
	@ObfuscatedSignature(
		descriptor = "Lhy;"
	)
	@Export("textureProvider")
	static TextureProvider textureProvider;
	@ObfuscatedName("qz")
	@ObfuscatedSignature(
		descriptor = "Les;"
	)
	@Export("varcs")
	static Varcs varcs;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lau;"
	)
	final HttpRequest field83;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	final AsyncRestClient this$0;

	@ObfuscatedSignature(
		descriptor = "(Laa;Lau;)V"
	)
	HttpRequestTask(AsyncRestClient var1, HttpRequest var2) {
		this.this$0 = var1;
		this.field83 = var2;
	}

	public Object call() throws Exception {
		try {
			while (this.field83.connect()) {
				class174.method3881(10L);
			}
		} catch (IOException var2) {
			return new HttpResponse("Error servicing REST query: " + var2.getMessage());
		}

		return this.field83.getResponse();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Lmb;",
		garbageValue = "1134121866"
	)
	static PacketBufferNode method288() {
		return PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0 ? new PacketBufferNode() : PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZB)I",
		garbageValue = "32"
	)
	static int method285(int var0, Script var1, boolean var2) {
		int var3 = -1;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
			var4 = ClanChannel.widgetDefinition.method7031(var3);
		} else {
			var4 = var2 ? class134.scriptDotWidget : HttpMethod.scriptActiveWidget;
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) {
			ScriptFrame.Interpreter_intStackSize -= 4;
			var4.rawX = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
			var4.rawY = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
			var4.xAlignment = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2];
			var4.yAlignment = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 3];
			UserComparator8.invalidateWidget(var4);
			Client.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				class244.revalidateWidgetScroll(ClanChannel.widgetDefinition.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) {
			ScriptFrame.Interpreter_intStackSize -= 4;
			var4.rawWidth = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
			var4.rawHeight = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
			var4.widthAlignment = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2];
			var4.heightAlignment = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 3];
			UserComparator8.invalidateWidget(var4);
			Client.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				class244.revalidateWidgetScroll(ClanChannel.widgetDefinition.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) {
			boolean var5 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
			if (var5 != var4.isHidden) {
				var4.isHidden = var5;
				UserComparator8.invalidateWidget(var4);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) {
			var4.noClickThrough = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) {
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "116531498"
	)
	static final void method287() {
		Object var10000 = null;
		String var0 = "Your ignore list is full. Max of 100 for free users, and 400 for members";
		Interpreter.addGameMessage(30, "", var0);
	}
}
