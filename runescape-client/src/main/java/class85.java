import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dd")
final class class85 implements class359 {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	final Widget val$item;

	@ObfuscatedSignature(
		descriptor = "(Lov;)V"
	)
	class85(Widget var1) {
		this.val$item = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "96"
	)
	public void vmethod7284() {
		if (this.val$item.method7878().field3900 != null) {
			ScriptEvent var1 = new ScriptEvent();
			var1.method2109(this.val$item);
			var1.setArgs(this.val$item.method7878().field3900);
			class7.method59().addFirst(var1);
		}

	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "64"
	)
	static void method2689(int var0) {
		if (var0 != Login.loginIndex) {
			Login.loginIndex = var0;
		}
	}
}
