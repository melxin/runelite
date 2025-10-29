import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gn")
public class class156 extends class151 {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1829672007
	)
	int field1793;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1941852729
	)
	int field1791;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 395171731
	)
	int field1792;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1545137031
	)
	int field1795;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfc;"
	)
	final class154 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfc;)V"
	)
	class156(class154 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxa;B)V",
		garbageValue = "-11"
	)
	void vmethod4235(Buffer var1) {
		this.field1793 = var1.readInt();
		this.field1795 = var1.readInt();
		this.field1791 = var1.readUnsignedByte();
		this.field1792 = var1.readUnsignedByte();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lgs;B)V",
		garbageValue = "-98"
	)
	void vmethod4241(ClanSettings var1) {
		var1.method4101(this.field1793, this.field1795, this.field1791, this.field1792);
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(ILcu;ZB)I",
		garbageValue = "-112"
	)
	static int method4002(int var0, Script var1, boolean var2) {
		if (var0 == 6754) {
			int var5 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
			NPCComposition var6 = AsyncHttpResponse.getNpcDefinition(var5);
			Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var6 != null ? var6.name : "";
			return 1;
		} else {
			NPCComposition var3;
			if (var0 == 6764) {
				class408.Interpreter_intStackSize -= 2;
				var3 = AsyncHttpResponse.getNpcDefinition(Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize]);
				int var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.method4478(var4);
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.method4480(var4);
				return 1;
			} else if (var0 == 6765) {
				var3 = AsyncHttpResponse.getNpcDefinition(Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3 != null ? var3.combatLevel : 0;
				return 1;
			} else {
				return 2;
			}
		}
	}
}
