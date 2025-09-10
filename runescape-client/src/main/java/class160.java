import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
public class class160 extends class151 {
	@ObfuscatedName("af")
	String field1833;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class154 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfz;)V"
	)
	class160(class154 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)V",
		garbageValue = "-2943315"
	)
	void vmethod4111(Buffer var1) {
		this.field1833 = var1.readStringCp1252NullTerminated();
		var1.method1958();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgs;I)V",
		garbageValue = "2108880901"
	)
	void vmethod4112(ClanSettings var1) {
		var1.name = this.field1833;
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(ILcg;ZI)I",
		garbageValue = "903454439"
	)
	static int method3896(int var0, Script var1, boolean var2) {
		if (var0 == 6754) {
			int var5 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
			NPCComposition var6 = class63.getNpcDefinition(var5);
			Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var6 != null ? var6.name : "";
			return 1;
		} else {
			NPCComposition var3;
			if (var0 == 6764) {
				UserComparator7.Interpreter_intStackSize -= 2;
				var3 = class63.getNpcDefinition(Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize]);
				int var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.method4336(var4);
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.method4338(var4);
				return 1;
			} else if (var0 == 6765) {
				var3 = class63.getNpcDefinition(Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3 != null ? var3.combatLevel : 0;
				return 1;
			} else {
				return 2;
			}
		}
	}

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "742442526"
	)
	static final boolean method3903() {
		return Client.isMenuOpen;
	}
}
