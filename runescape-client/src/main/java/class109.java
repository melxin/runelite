import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("em")
final class class109 implements class353 {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lnh;"
	)
	final Widget val$item;

	@ObfuscatedSignature(
		descriptor = "(Lnh;)V"
	)
	class109(Widget var1) {
		this.val$item = var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-647156657"
	)
	public void vmethod6948() {
		if (this.val$item.method7380().field3867 != null) {
			ScriptEvent var1 = new ScriptEvent();
			var1.method2471(this.val$item);
			var1.setArgs(this.val$item.method7380().field3867);
			class143.method3438().addFirst(var1);
		}

	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(Ldu;III)V",
		garbageValue = "-2053796808"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) {
			int var3 = class91.SequenceDefinition_get(var1).restartMode;
			if (var3 == 1) {
				var0.sequenceFrame = 0;
				var0.sequenceFrameCycle = 0;
				var0.sequenceDelay = var2;
				var0.field1265 = 0;
			}

			if (var3 == 2) {
				var0.field1265 = 0;
			}
		} else if (var1 == -1 || var0.sequence == -1 || class91.SequenceDefinition_get(var1).field3022 >= class91.SequenceDefinition_get(var0.sequence).field3022) {
			var0.sequence = var1;
			var0.sequenceFrame = 0;
			var0.sequenceFrameCycle = 0;
			var0.sequenceDelay = var2;
			var0.field1265 = 0;
			var0.field1284 = var0.pathLength;
		}

	}
}
