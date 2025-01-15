import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gy")
public class class165 extends class150 {
	@ObfuscatedName("gt")
	@Export("refreshToken")
	static String refreshToken;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = -2094426101884963605L
	)
	long field1783;
	@ObfuscatedName("ah")
	String field1781;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1010564325
	)
	int field1784;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfv;)V"
	)
	class165(class153 var1) {
		this.this$0 = var1;
		this.field1783 = -1L;
		this.field1781 = null;
		this.field1784 = 0;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "-1355269794"
	)
	void vmethod3879(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1783 = var1.readLong();
		}

		this.field1781 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1784 = var1.readUnsignedShort();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lgq;B)V",
		garbageValue = "0"
	)
	void vmethod3882(ClanSettings var1) {
		var1.method3691(this.field1783, this.field1781, this.field1784);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1951312105"
	)
	public static void method3794() {
		InvDefinition.InvDefinition_cached.clear();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZI)I",
		garbageValue = "1147545767"
	)
	static int method3793(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class134.scriptDotWidget : HttpMethod.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) {
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) {
			if (var3.itemId != -1) {
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETID) {
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.childIndex;
			return 1;
		} else if (var0 == 1707) {
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.method7433() ? 1 : 0;
			return 1;
		} else if (var0 == 1708) {
			return HttpRequest.method112(var3);
		} else {
			return var0 == 1709 ? WorldMapCacheName.method6467(var3) : 2;
		}
	}
}
