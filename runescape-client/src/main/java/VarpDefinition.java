import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hd")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("VarpDefinition_archive")
	static AbstractArchive VarpDefinition_archive;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("VarpDefinition_cached")
	static EvictingDualNodeHashTable VarpDefinition_cached;
	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "Lpw;"
	)
	@Export("archive2")
	static Archive archive2;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1095542447
	)
	@Export("type")
	public int type;

	static {
		VarpDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	VarpDefinition() {
		this.type = 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)V",
		garbageValue = "-317931426"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				this.method4166();
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwb;IB)V",
		garbageValue = "-10"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 5) {
			this.type = var1.readUnsignedShort();
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-7"
	)
	void method4166() {
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILcg;ZI)I",
		garbageValue = "-514564214"
	)
	static int method4175(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			int var4 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
			var3 = UrlRequester.widgetDefinition.method7476(var4);
		} else {
			var3 = var2 ? HttpRequestTask.scriptDotWidget : class141.scriptActiveWidget;
		}

		Widget[] var5;
		if (var0 == ScriptOpcodes.CC_SETPOSITION) {
			UserComparator7.Interpreter_intStackSize -= 4;
			var3.rawX = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
			var3.rawY = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
			var3.xAlignment = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 2];
			var3.yAlignment = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 3];
			class89.invalidateWidget(var3);
			class521.client.alignWidget(var3);
			if (var3.type == 0) {
				var5 = var3.childIndex * -217986249 == -1 ? UrlRequester.widgetDefinition.Widget_interfaceComponents[var3.id >> 16] : UrlRequester.widgetDefinition.method7476(var3.parentId).children;
				Canvas.revalidateWidgetScroll(var5, var3, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) {
			UserComparator7.Interpreter_intStackSize -= 4;
			var3.rawWidth = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
			var3.rawHeight = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
			var3.widthAlignment = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 2];
			var3.heightAlignment = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 3];
			class89.invalidateWidget(var3);
			class521.client.alignWidget(var3);
			if (var3.type == 0) {
				var5 = var3.childIndex * -217986249 == -1 ? UrlRequester.widgetDefinition.Widget_interfaceComponents[var3.id >> 16] : UrlRequester.widgetDefinition.method7476(var3.parentId).children;
				Canvas.revalidateWidgetScroll(var5, var3, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) {
			boolean var6 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
			if (var6 != var3.isHidden) {
				var3.isHidden = var6;
				class89.invalidateWidget(var3);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) {
			var3.noClickThrough = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) {
			var3.noScrollThrough = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
			return 1;
		} else {
			return 2;
		}
	}
}
