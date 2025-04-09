import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("en")
final class class110 implements class353 {
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1014357481
	)
	static int field1408;
	@ObfuscatedName("iw")
	@ObfuscatedGetter(
		intValue = 1175638291
	)
	@Export("foundItemIdCount")
	static int foundItemIdCount;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lnh;"
	)
	final Widget val$item;

	@ObfuscatedSignature(
		descriptor = "(Lnh;)V"
	)
	class110(Widget var1) {
		this.val$item = var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-647156657"
	)
	public void vmethod6948() {
		if (this.val$item.method7380().field3870 != null) {
			ScriptEvent var1 = new ScriptEvent();
			var1.method2471(this.val$item);
			var1.setArgs(this.val$item.method7380().field3870);
			class143.method3438().addFirst(var1);
		}

	}
}
